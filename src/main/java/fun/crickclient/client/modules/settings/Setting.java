package fun.crickclient.client.modules.settings;

import lombok.Getter;
import lombok.experimental.Accessors;
import fun.crickclient.CrickClient;
import fun.crickclient.api.QClient;

import java.awt.*;
import java.util.function.Supplier;

@Getter
@Accessors(fluent = true)
public abstract class Setting implements QClient {

    private final String name;
    public Supplier<Boolean> visible = () -> true;
    public Color color = Color.WHITE;

    public Setting(String name) {
        this.name = name;
    }

    public Boolean visible() {
        return visible.get();
    }

    public String displayName() {
        return CrickClient.INSTANCE.localizationStorage == null ? name : CrickClient.INSTANCE.localizationStorage.translate(name);
    }
}
