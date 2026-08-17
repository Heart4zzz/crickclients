package fun.crickclient.api.utils.render.hud;

import net.minecraft.client.util.math.MatrixStack;
import fun.crickclient.api.utils.color.HudColors;
import fun.crickclient.api.utils.render.fonts.msdf.Font;

import java.util.HashMap;
import java.util.Map;

/**
 * Рисует строку таймера так, что меняется только изменившийся символ:
 * старый символ уезжает вверх и растворяется, новый приезжает снизу.
 */
public final class TimerTextAnimator {

    private static final long DURATION_MS = 180L;
    private static final Map<String, State> STATES = new HashMap<>();

    private TimerTextAnimator() {
    }

    public static void draw(Font font, MatrixStack matrices, String key, String text,
                            float x, float y, int color) {
        if (font == null || text == null || matrices == null) return;

        State state = STATES.computeIfAbsent(key, k -> new State(text));
        state.update(text);

        long now = System.currentTimeMillis();
        if (!state.isAnimating(now, text.length())) {
            font.drawStringNoOffset(matrices, text, x, y, color);
            return;
        }

        int alpha = (color >>> 24) & 0xFF;
        float height = font.getSize() * 0.5f;
        float cursor = x;

        for (int i = 0; i < text.length(); i++) {
            String glyph = String.valueOf(text.charAt(i));
            float glyphWidth = font.getStringWidth(glyph);

            long changedAt = state.changedAt(i);
            float progress = changedAt <= 0L ? 1f : Math.min(1f, (now - changedAt) / (float) DURATION_MS);

            if (progress >= 1f) {
                font.drawStringNoOffset(matrices, glyph, cursor, y, color);
            } else {
                String previous = state.previousChar(i);
                if (previous != null) {
                    int outAlpha = (int) (alpha * (1f - progress));
                    font.drawStringNoOffset(matrices, previous, cursor, y - height * progress,
                            HudColors.setAlpha(color, outAlpha));
                }
                int inAlpha = (int) (alpha * progress);
                font.drawStringNoOffset(matrices, glyph, cursor, y + height * (1f - progress),
                        HudColors.setAlpha(color, inAlpha));
            }

            cursor += glyphWidth;
        }
    }

    private static final class State {
        private String current;
        private String previous;
        private long[] changedAt;

        private State(String initial) {
            this.current = initial;
            this.previous = initial;
            this.changedAt = new long[initial.length()];
        }

        private void update(String text) {
            if (text.equals(current)) return;

            long now = System.currentTimeMillis();
            long[] next = new long[text.length()];
            for (int i = 0; i < text.length(); i++) {
                char newChar = text.charAt(i);
                char oldChar = i < current.length() ? current.charAt(i) : '\0';
                if (newChar != oldChar) {
                    next[i] = now;
                } else {
                    next[i] = i < changedAt.length ? changedAt[i] : 0L;
                }
            }

            previous = current;
            current = text;
            changedAt = next;
        }

        private boolean isAnimating(long now, int length) {
            int limit = Math.min(length, changedAt.length);
            for (int i = 0; i < limit; i++) {
                long at = changedAt[i];
                if (at > 0L && now - at < DURATION_MS) {
                    return true;
                }
            }
            return false;
        }

        private long changedAt(int index) {
            return index < changedAt.length ? changedAt[index] : 0L;
        }

        private String previousChar(int index) {
            if (previous == null || index >= previous.length()) return null;
            return String.valueOf(previous.charAt(index));
        }
    }
}
