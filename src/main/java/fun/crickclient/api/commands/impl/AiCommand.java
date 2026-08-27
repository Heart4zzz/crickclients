package fun.crickclient.api.commands.impl;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import net.minecraft.client.MinecraftClient;
import net.minecraft.command.CommandSource;
import fun.crickclient.CrickClient;
import fun.crickclient.api.commands.Command;
import fun.crickclient.api.storages.implement.helpertstorages.enumvar.ModuleClass;
import fun.crickclient.api.utils.chat.ChatUtils;
import fun.crickclient.client.modules.impl.combat.Aura;

import java.util.List;

import static com.mojang.brigadier.Command.SINGLE_SUCCESS;
import static com.mojang.brigadier.arguments.StringArgumentType.word;

public class AiCommand extends Command {

    public AiCommand() {
        super("ai");
    }

    @Override
    public void execute(LiteralArgumentBuilder<CommandSource> builder) {
        builder
                .then(literal("train")
                        .then(arg("name", word())
                                .executes(context -> {
                                    String name = StringArgumentType.getString(context, "name");
                                    Aura aura = ModuleClass.INSTANCE == null ? null : ModuleClass.INSTANCE.aura;
                                    if (aura == null) {
                                        ChatUtils.sendMessage("§cAura module not found");
                                        return 0;
                                    }

                                    // Start recording training data for AI
                                    aura.getDataSystem().startRecording();
                                    aura.setTraining(true);
                                    aura.setCurrentTrainingProfile(name);
                                    ChatUtils.sendMessage("§aTraining started in profile: §f" + name);
                                    ChatUtils.sendMessage("§7Stand still or attack a FakePlayer/mob for 5-10 minutes");
                                    return SINGLE_SUCCESS;
                                }))
                .then(literal("stop"))
                        .executes(context -> {
                            Aura aura = ModuleClass.INSTANCE == null ? null : ModuleClass.INSTANCE.aura;
                            if (aura == null) {
                                return 0;
                            }

                            aura.getDataSystem().stopRecording();
                            aura.setTraining(false);
                            aura.setCurrentTrainingProfile("");
                            ChatUtils.sendMessage("§eTraining stopped");
                            return SINGLE_SUCCESS;
                        })
                .then(literal("run")
                        .then(arg("name", word())
                                .executes(context -> {
                                    String name = StringArgumentType.getString(context, "name");
                                    Aura aura = ModuleClass.INSTANCE == null ? null : ModuleClass.INSTANCE.aura;
                                    if (aura == null) {
                                        ChatUtils.sendMessage("§cAura module not found");
                                        return 0;
                                    }

                                    // Load the trained profile
                                    if (!aura.getDataSystem().loadPatterns(name)) {
                                        ChatUtils.sendMessage("§eProfile not found: §f" + name);
                                        return 0;
                                    }

                                    aura.getDataSystem().setRecording(false);
                                    aura.getDataSystem().setUsingNeuro(true);
                                    aura.getDataSystem().resetState();
                                    ChatUtils.sendMessage("§aKill aura started with profile: §f" + name);
                                    ChatUtils.sendMessage("§7AI rotation active with Jitter and Human Misses settings");
                                    return SINGLE_SUCCESS;
                                }))
        );
    }
}