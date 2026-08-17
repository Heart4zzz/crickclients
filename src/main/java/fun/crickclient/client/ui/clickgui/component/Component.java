package fun.crickclient.client.ui.clickgui.component;

import lombok.Getter;
import lombok.Setter;
import fun.crickclient.client.ui.clickgui.util.Animation;
import fun.crickclient.client.ui.clickgui.util.Easing;

@Getter
@Setter
public abstract class Component implements IComponent {
    public float x, y, width, height;

    private final Animation alphaAnim = new Animation(Easing.BACK_OUT, 550);
    private final Animation alphaAnimSetting = new Animation(Easing.CUBIC_OUT, 280);
    private final Animation alphaAnimBack = new Animation(Easing.CUBIC_OUT, 280);

    public boolean isVisible() {
        return true;
    }
}
