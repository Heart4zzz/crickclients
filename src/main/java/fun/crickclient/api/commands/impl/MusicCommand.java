package fun.crickclient.api.commands.impl;

import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import net.minecraft.command.CommandSource;
import fun.crickclient.api.commands.Command;
import fun.crickclient.api.utils.chat.ChatUtils;
import fun.crickclient.api.utils.music.MusicManager;
import fun.crickclient.api.utils.music.MusicSettings;
import fun.crickclient.api.utils.music.TrackState;

import static com.mojang.brigadier.Command.SINGLE_SUCCESS;

/**
 * Управление музыкальной интеграцией:
 *
 * <pre>
 * .music            — статус (провайдер, текущий трек)
 * .music spotify    — провайдер: десктопный Spotify (пайп)
 * .music ym         — провайдер: Яндекс Музыка (нужен токен)
 * .music ym &lt;токен> — сохранить токен Яндекса и включить его
 * </pre>
 */
public class MusicCommand extends Command {

    public MusicCommand() {
        super("music");
    }

    @Override
    public void execute(LiteralArgumentBuilder<CommandSource> builder) {
        builder
                .executes(context -> status())
                .then(literal("spotify")
                        .executes(context -> switchProvider(false, null)))
                .then(literal("ym")
                        .then(arg("token", StringArgumentType.word())
                                .executes(context -> switchProvider(
                                        true, StringArgumentType.getString(context, "token"))))
                        .executes(context -> switchProvider(true, null)));
    }

    private int status() {
        MusicSettings settings = MusicSettings.instance();
        MusicManager manager = MusicManager.instance;
        if (settings == null || manager == null) return 0;

        String provider = settings.isYandex() ? "Яндекс Музыка" : "Spotify";
        ChatUtils.sendMessage("§bМузыка§8: §f" + provider
                + (settings.isYandex()
                ? (settings.yandexToken().isEmpty() ? "§8 (токен не задан)" : "§8 (токен задан)")
                : ""));

        if (manager.isMusicActive()) {
            TrackState st = manager.state();
            ChatUtils.sendMessage("§7Сейчас играет: §f" + st.title + " §8— " + st.artist);
        } else {
            ChatUtils.sendMessage("§7Ничего не играет"
                    + (settings.isYandex()
                    ? "§8 (запусти музыку в любом приложении Яндекса)"
                    : "§8 (запусти трек в десктопном Spotify)"));
        }
        return SINGLE_SUCCESS;
    }

    private int switchProvider(boolean ym, String token) {
        MusicSettings settings = MusicSettings.instance();
        MusicManager manager = MusicManager.instance;
        if (settings == null || manager == null) return 0;

        if (ym && token != null && !token.isBlank()) {
            settings.setYandexToken(token);
            ChatUtils.sendMessage("§aТокен Яндекс Музыки сохранён.");
        }

        settings.setProvider(ym);
        // applyProviderChange сам поднимет/переподнимет YM-сессию с новым токеном
        manager.applyProviderChange();

        if (ym && settings.yandexToken().isEmpty()) {
            ChatUtils.sendMessage("§eЯндекс Музыка включена, но токен не задан: §f.music ym <токен>");
            ChatUtils.sendMessage("§7Токен: заголовок Authorization (OAuth …) из запросов к music.yandex.ru в браузере.");
        } else {
            ChatUtils.sendMessage("§aПровайдер: §f" + (ym ? "Яндекс Музыка" : "Spotify"));
        }
        return SINGLE_SUCCESS;
    }
}
