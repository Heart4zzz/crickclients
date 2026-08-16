package fun.crickclient.api.storages.implement;

import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import lombok.Getter;
import lombok.Setter;
import fun.crickclient.api.QClient;
import fun.crickclient.api.storages.implement.helpertstorages.enumvar.ModuleClass;
import fun.crickclient.client.modules.Module;
import fun.crickclient.client.modules.impl.combat.*;
import fun.crickclient.client.modules.impl.misc.*;
import fun.crickclient.client.modules.impl.movement.*;
import fun.crickclient.client.modules.impl.player.*;
import fun.crickclient.client.modules.impl.render.*;
import java.util.Arrays;

@Getter
@Setter
public class ModuleStorage implements QClient {

    public ModuleStorage() {
        this.initModules();
    }

    private void initModules() {
        ModuleClass.INSTANCE.initialize();
    }
}
