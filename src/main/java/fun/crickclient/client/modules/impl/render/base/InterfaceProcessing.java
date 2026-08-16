package fun.crickclient.client.modules.impl.render.base;

import lombok.RequiredArgsConstructor;
import fun.crickclient.api.QClient;
import fun.crickclient.api.events.implement.EventRender;
import fun.crickclient.api.events.implement.EventUpdate;
import fun.crickclient.api.utils.draggable.Draggable;

@RequiredArgsConstructor
public class InterfaceProcessing implements QClient {

    public final Draggable draggable;
    private boolean unusualRectType = true;

    public boolean isUnusualRectType() {
        return unusualRectType;
    }

    public void setUnusualRectType(boolean unusualRectType) {
        this.unusualRectType = unusualRectType;
    }

    public void onUpdate(EventUpdate eventUpdate) {
    }

    public void onRender(EventRender.Default eventRender) {

    }
}
