package fun.crickclient.client.ui.clickgui.util;

import com.google.common.base.Suppliers;
import fun.crickclient.api.utils.render.fonts.msdf.Font;
import fun.crickclient.api.utils.render.fonts.msdf.Fonts;
import fun.crickclient.api.utils.render.fonts.msdf.MsdfFont;

import java.util.function.Supplier;

/**
 * Шрифты клик гуи. В старом клиенте это был {@code Fonts} с msdf-атласами
 * (schulevetica / regular / iconsminced) — здесь они замаплены на атласы,
 * которые уже есть в ресурсах этого клиента.
 */
public final class GuiFonts {

    /** Атлас для заголовков окна и названий модулей. */
    public static final String TITLE_ATLAS = "suisse";
    /** Атлас для основного текста (описания, значения настроек). */
    public static final String BODY_ATLAS = "suisse";
    /** Атлас с иконками категорий. */
    public static final String ICONS_ATLAS = "icon";

    public static final Supplier<MsdfFont> GUI_TITLE = Suppliers.memoize(() -> atlas(TITLE_ATLAS));
    public static final Supplier<MsdfFont> GUI_BODY = Suppliers.memoize(() -> atlas(BODY_ATLAS));
    public static final Supplier<MsdfFont> ICONS_MINCED = Suppliers.memoize(() -> atlas(ICONS_ATLAS));

    private GuiFonts() {
    }

    private static MsdfFont atlas(String name) {
        Font font = Fonts.getFont(name, 16f);
        if (font != null && font.getFont() != null) {
            return font.getFont();
        }
        return MsdfFont.builder().name(name).atlas(name).data(name).build();
    }

    /**
     * Имя атласа для уже загруженного msdf-шрифта: {@link MsdfFont#getName()} не всегда
     * заполнен, поэтому сравниваем сам объект с известными шрифтами гуи.
     */
    public static String nameOf(MsdfFont font) {
        if (font == null) return BODY_ATLAS;
        if (font == ICONS_MINCED.get()) return ICONS_ATLAS;
        if (font == GUI_TITLE.get()) return TITLE_ATLAS;
        if (font == GUI_BODY.get()) return BODY_ATLAS;
        String name = font.getName();
        return name == null || name.isEmpty() || "?".equals(name) ? BODY_ATLAS : name;
    }

    /**
     * Шрифт нужного размера. Внутренний {@link Font} использует половинный масштаб,
     * поэтому размер удваивается — так текст совпадает по размеру со старым клиентом.
     */
    public static Font sized(MsdfFont font, float size) {
        return Fonts.getFont(nameOf(font), Math.max(1f, size) * 2f);
    }
}
