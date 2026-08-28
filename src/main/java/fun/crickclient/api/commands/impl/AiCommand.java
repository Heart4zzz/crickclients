package fun.crickclient.api.commands.impl;

import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import net.minecraft.command.CommandSource;

import fun.crickclient.api.commands.Command;
import fun.crickclient.api.storages.implement.NeuroAuraStorage;
import fun.crickclient.api.storages.implement.helpertstorages.enumvar.ModuleClass;
import fun.crickclient.api.utils.chat.ChatUtils;
import fun.crickclient.client.modules.impl.combat.Aura;

import static com.mojang.brigadier.Command.SINGLE_SUCCESS;

/**
 * Commands for recording and playing back AI rotation profiles.
 *
 * <p>Profile names are single words because Brigadier's {@code word()} argument
 * is used. This also keeps the name safe to use as a file name.</p>
 */
public class AiCommand extends Command {

    public AiCommand() {
        super("ai");
    }

    @Override
    public void execute(LiteralArgumentBuilder<CommandSource> builder) {
        builder
                .then(literal("train")
                        .then(arg("name", StringArgumentType.word())
                                .executes(context -> startTraining(
                                        StringArgumentType.getString(context, "name")))))
                .then(literal("stop")
                        .executes(context -> stopTraining()))
                .then(literal("run")
                        .then(arg("name", StringArgumentType.word())
                                .suggests((context, suggestions) -> {
                                    String remaining = suggestions.getRemaining().toLowerCase();
                                    Aura aura = getAuraSilently();
                                    if (aura != null) {
                                        aura.getDataSystem().getPatternNames().stream()
                                                .filter(name -> name.toLowerCase().startsWith(remaining))
                                                .forEach(suggestions::suggest);
                                    }
                                    return suggestions.buildFuture();
                                })
                                .executes(context -> runProfile(
                                        StringArgumentType.getString(context, "name")))))
                .then(literal("list")
                        .executes(context -> listProfiles()));
    }

    private int startTraining(String name) {
        Aura aura = getAura();
        if (aura == null) {
            return 0;
        }

        if (name == null || name.isBlank()) {
            ChatUtils.sendMessage("§cУкажите название профиля: .ai train <название>");
            return 0;
        }

        NeuroAuraStorage storage = aura.getDataSystem();
        storage.startRecording();
        aura.setTraining(true);
        aura.setCurrentTrainingProfile(name);

        ChatUtils.sendMessage("§aТренировка начата в профиле: §f" + name);
        ChatUtils.sendMessage("§7Килл ауру включать не нужно: бейте игрока, моба или FakePlayer §fруками, критами§7, минут 5-10.");
        ChatUtils.sendMessage("§7Каждый ваш удар записывается — аура потом бьёт по этим позам и не мисает.");
        ChatUtils.sendMessage("§7Для завершения и сохранения профиля напишите: §f.ai stop");
        return SINGLE_SUCCESS;
    }

    private int stopTraining() {
        Aura aura = getAura();
        if (aura == null) {
            return 0;
        }

        NeuroAuraStorage storage = aura.getDataSystem();
        if (!storage.isRecording() && !aura.isTraining()) {
            ChatUtils.sendMessage("§eТренировка сейчас не запущена.");
            return 0;
        }

        String profileName = aura.getCurrentTrainingProfile();
        storage.stopRecording();
        aura.setTraining(false);
        aura.setCurrentTrainingProfile("");

        if (profileName == null || profileName.isBlank()) {
            ChatUtils.sendMessage("§cНе удалось сохранить тренировку: имя профиля не задано.");
            return 0;
        }

        if (!storage.savePatterns(profileName)) {
            ChatUtils.sendMessage("§cПрофиль не сохранён: недостаточно записанных данных.");
            return 0;
        }

        ChatUtils.sendMessage("§aТренировка остановлена. Профиль сохранён: §f" + profileName);
        ChatUtils.sendMessage("§7Выберите ротацию «AI» в настройках Aura и запустите профиль через §f.ai run " + profileName);
        return SINGLE_SUCCESS;
    }

    private int runProfile(String name) {
        Aura aura = getAura();
        if (aura == null) {
            return 0;
        }

        NeuroAuraStorage storage = aura.getDataSystem();
        if (!storage.loadPatterns(name)) {
            ChatUtils.sendMessage("§eПрофиль не найден или повреждён: §f" + name);
            return 0;
        }

        aura.setTraining(false);
        aura.setCurrentTrainingProfile("");
        storage.setRecording(false);
        storage.setUsingNeuro(true);
        storage.resetState();
        aura.rotationType.set("AI");

        ChatUtils.sendMessage("§aAI-ротация запущена с профилем: §f" + name);
        ChatUtils.sendMessage("§7Настройки «Джиттер ИИ» и «Человеческие промахи» доступны в Aura.");
        return SINGLE_SUCCESS;
    }

    private int listProfiles() {
        Aura aura = getAura();
        if (aura == null) {
            return 0;
        }

        var profiles = aura.getDataSystem().getPatternNames();
        if (profiles.isEmpty()) {
            ChatUtils.sendMessage("§eСохранённых AI-профилей нет.");
            return SINGLE_SUCCESS;
        }

        ChatUtils.sendMessage("§aAI-профили:");
        profiles.forEach(profile -> ChatUtils.sendMessage("§7- §f" + profile));
        return SINGLE_SUCCESS;
    }

    private Aura getAura() {
        Aura aura = getAuraSilently();
        if (aura == null) {
            ChatUtils.sendMessage("§cМодуль Aura не найден.");
        }
        return aura;
    }

    private Aura getAuraSilently() {
        return ModuleClass.INSTANCE == null ? null : ModuleClass.INSTANCE.aura;
    }
}
