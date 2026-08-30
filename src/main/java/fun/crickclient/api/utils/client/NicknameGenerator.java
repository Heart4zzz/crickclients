package fun.crickclient.api.utils.client;

import java.util.Random;
import java.util.function.Predicate;

/**
 * Генератор игровых ников: сочетание «приставка + основа (+ суффикс)».
 * <p>
 * Не использует фиксированный список из пяти имён — комбинаторика даёт
 * тысячи вариантов. Ник всегда валиден для Minecraft (3–16 символов,
 * только a–z, 0–9 и «_»).
 */
public final class NicknameGenerator {

    private static final String[] PREFIX = {
            "Shadow", "Night", "Silent", "Dark", "Pixel", "Frost", "Crimson", "Azure",
            "Phantom", "Neon", "Swift", "Storm", "Ember", "Ivory", "Lunar", "Mystic",
            "Cosmic", "Solar", "Void", "Iron", "Cyber", "Blaze", "Glacier", "Rapid",
            "Static", "Thunder", "Venom", "Wild", "Zen", "Cipher", "Echo", "Quantum",
            "Delta", "Omega", "Alpha", "Hyper", "Ultra", "Titan", "Apex", "Prism"
    };

    private static final String[] CORE = {
            "Byte", "Core", "Nova", "Hunter", "Vector", "Falcon", "Wolf", "Fox",
            "Owl", "Hawk", "Lynx", "Warden", "Knight", "Ranger", "Sage", "Viper",
            "Ghost", "Shade", "Blade", "Dragon", "Phoenix", "Comet", "Meteor", "Nebula",
            "Pulse", "Circuit", "Specter", "Drift", "Prowl", "Skull", "Wisp", "Rune",
            "Spike", "Bolt", "Flame", "Claw", "Quill", "Storm", "Haze", "Zephyr"
    };

    private static final Random RANDOM = new Random();

    private NicknameGenerator() {
    }

    /**
     * Генерирует ник, не совпадающий ни с одним из {@code taken} (если предикат задан).
     */
    public static String generate(Predicate<String> taken) {
        for (int attempt = 0; attempt < 16; attempt++) {
            String name = build();
            if (taken == null || !taken.test(name)) {
                return name;
            }
        }
        // На всякий случай — возвращаем случайный валидный ник без проверки уникальности.
        return build();
    }

    private static String build() {
        String prefix = PREFIX[RANDOM.nextInt(PREFIX.length)];
        String core = CORE[RANDOM.nextInt(CORE.length)];
        String base = prefix + core;

        boolean withNumber = RANDOM.nextInt(100) < 82;
        if (!withNumber) {
            return fit(base);
        }

        // Числовой суффикс подбираем так, чтобы итоговый ник не превышал 16 символов.
        int maxDigits = 16 - (base.length() + 1);
        if (maxDigits < 2) {
            return fit(base);
        }
        int digits = Math.min(4, maxDigits);
        int min = (int) Math.pow(10, digits - 1);
        int max = (int) Math.pow(10, digits);
        int number = min + RANDOM.nextInt(max - min);
        return base + "_" + number;
    }

    private static String fit(String name) {
        return name.length() > 16 ? name.substring(0, 16) : name;
    }
}
