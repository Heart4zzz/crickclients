package fun.crickclient.api.events.implement;

import lombok.AllArgsConstructor;
import fun.crickclient.api.events.Event;

@AllArgsConstructor
public class EventCloseInv extends Event {
    public int windowId;
}

