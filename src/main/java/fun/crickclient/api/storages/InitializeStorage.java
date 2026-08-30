package fun.crickclient.api.storages;


import fun.crickclient.CrickClient;
import fun.crickclient.api.QClient;
import fun.crickclient.api.events.EventInvoker;
import fun.crickclient.api.storages.implement.*;
import fun.crickclient.api.storages.implement.helpertstorages.enumvar.ModuleClass;
import fun.crickclient.api.utils.tps.TPSCalc;
import fun.crickclient.client.modules.impl.render.TotemAngel;

public class InitializeStorage implements QClient {

    public void onInitialize() {
        EventInvoker.register(this);
        this.initStorages();
    }

    
    public void initStorages() {
        CrickClient.INSTANCE.moduleStorage = new ModuleStorage();
        CrickClient.INSTANCE.themeStorage = new ThemeStorage();
        CrickClient.INSTANCE.tpsCalc = new TPSCalc();
        EventInvoker.register(CrickClient.INSTANCE.tpsCalc);
        CrickClient.INSTANCE.localizationStorage = new LocalizationStorage();
        CrickClient.INSTANCE.freeLookStorage = new FreeLookStorage();
        CrickClient.INSTANCE.rotationStorage = new RotationStorage();
        // CrickClient.INSTANCE.serverStorage = new ServerStorage();
        CrickClient.INSTANCE.friendStorage = new FriendStorage();
        CrickClient.INSTANCE.macroStorage = new MacroStorage();
        CrickClient.INSTANCE.staffStorage = new StaffStorage();
        CrickClient.INSTANCE.waypointStorage = new WaypointStorage();
        CrickClient.INSTANCE.commandStorage = new CommandStorage();
        CrickClient.INSTANCE.configStorage = new ConfigStorage();
        CrickClient.INSTANCE.accountStorage = new AccountStorage();
    }
}
