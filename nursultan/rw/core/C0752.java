package rw.core;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;
import net.minecraft.gametest.framework.GameTestHelper;
import rw.GuiWidget;
import rw.NursultanClient;
import rw.defs.Enum0058;
import rw.defs.OlrkOij;
import rw.gui.AimAssist;
import rw.gui.AirStuck;
import rw.gui.AntiBot;
import rw.gui.Arrow;
import rw.gui.AspectRatio;
import rw.gui.AttackAura;
import rw.gui.AuctionHelper;
import rw.gui.AutoAccept;
import rw.gui.AutoArmor;
import rw.gui.AutoAuth;
import rw.gui.AutoBuy;
import rw.gui.AutoDripstone;
import rw.gui.AutoEat;
import rw.gui.AutoExplosion;
import rw.gui.AutoFish;
import rw.gui.AutoJoin;
import rw.gui.AutoJump;
import rw.gui.AutoLeave;
import rw.gui.AutoPearl;
import rw.gui.AutoPotion;
import rw.gui.AutoReconnect;
import rw.gui.AutoRespawn;
import rw.gui.AutoSwap;
import rw.gui.AutoTool;
import rw.gui.AutoTotem;
import rw.gui.AvoidCollision;
import rw.gui.Blink;
import rw.gui.BypassHealth;
import rw.gui.C0111;
import rw.gui.Camera;
import rw.gui.ChatHelper;
import rw.gui.ChestStealer;
import rw.gui.ClickAction;
import rw.gui.ClientSounds;
import rw.gui.Coordinates;
import rw.gui.Critical;
import rw.gui.Crossbow;
import rw.gui.CustomCape;
import rw.gui.DeathCoords;
import rw.gui.DiscordActivity;
import rw.gui.EdgeJump;
import rw.gui.ElytraHelper;
import rw.gui.ElytraTarget;
import rw.gui.FastExp;
import rw.gui.FreeCamera;
import rw.gui.FreeLook;
import rw.gui.Friends;
import rw.gui.GuiElement;
import rw.gui.HolyHelper;
import rw.gui.IlsOqti;
import rw.gui.Inventory;
import rw.gui.InventoryOnly;
import rw.gui.ItemRelease;
import rw.gui.JumpEffect;
import rw.gui.KillEffect;
import rw.gui.LockSlots;
import rw.gui.NoDelay;
import rw.gui.NoEntityTrace;
import rw.gui.NoFriendDamage;
import rw.gui.NoInteract;
import rw.gui.NoPush;
import rw.gui.NoServerRotation;
import rw.gui.NoSlotChange;
import rw.gui.NoSlow;
import rw.gui.NoVelocity;
import rw.gui.Noweb;
import rw.gui.Nuker;
import rw.gui.OpenWalls;
import rw.gui.PotionTracker;
import rw.gui.QsVj;
import rw.gui.QuickUse;
import rw.gui.Scaffold;
import rw.gui.ScreenWalk;
import rw.gui.SeeInvisible;
import rw.gui.ShulkerPreview;
import rw.gui.SkyCustomization;
import rw.gui.SpearBoost;
import rw.gui.Speed;
import rw.gui.Sprint;
import rw.gui.SprintReset;
import rw.gui.StreamerMode;
import rw.gui.SuperFirework;
import rw.gui.SwingAnimations;
import rw.gui.TapeMouse;
import rw.gui.Target;
import rw.gui.TargetEsp;
import rw.gui.TargetInfo;
import rw.gui.TickRateSync;
import rw.gui.TimeChanger;
import rw.gui.Timer;
import rw.gui.Tracers;
import rw.gui.TriggerBot;
import rw.gui.UseTracker;
import rw.gui.ViewModel;
import rw.gui.Vignette;
import rw.gui.WallClimb;
import rw.gui.WebTrap;
import rw.gui.WindHop;
import rw.module.AnarchyHelper;

public class C0752 {
   private static short[] f1000;
   private static short[] f2000;
   public Object[] f3000;
   public Object[] f4000;
   private static short[] f5000;
   public Object[] f6000;
   private static short[] f7000;
   private static short[] f8000;
   private static short[] f9000;
   private static short[] f10000;
   private static short[] f11000;
   public Object[] f12000;
   private static short[] f13000;
   public Object[] f14000;
   private static short[] f15000;
   public Object[] f16000;
   private static short[] f17000;
   private static short[] f18000;
   public Object[] f19000;
   private static short[] f20000;
   public Object[] f21000;
   private static short[] f22000;
   private static short[] f23000;
   private static short[] f24000;
   private static short[] f25000;
   private static short[] f26000;
   public Object[] f27000;
   public Object[] f28000;
   private static short[] f29000;
   private static short[] f30000;
   private static short[] f31000;
   public Object[] f32000;
   private static short[] f33000;
   public Object[] f34000;
   public Object[] f35000;
   private static short[] f36000;
   public Object[] f37000;
   public Object[] f38000;
   private static short[] f39000;
   private static short[] f40000;
   public Object[] f41000;
   public Object[] f42000;
   private static short[] f43000;
   private static short[] f44000;
   public Object[] f45000;
   private static short[] f46000;
   private static short[] f47000;
   public Object[] f48000;
   private static short[] f49000;
   private static short[] f50000;
   private static short[] f51000;
   public Object[] f52000;
   public Object[] f53000;
   public Object[] f54000;
   private static short[] f55000;
   private static short[] f56000;
   private static short[] f57000;
   private static short[] f58000;
   private static short[] f59000;
   private static short[] f60000;
   private static short[] f61000;
   private static short[] f62000;
   private static short[] f63000;
   private static short[] f64000;
   private static short[] f65000;
   public Object[] f66000;
   private static short[] f67000;

   public SwingAnimations m2000() {
      return (SwingAnimations)this.f16000[5];
   }

   public TapeMouse m4000() {
      return (TapeMouse)this.f19000[1];
   }

   public AutoRespawn m6000() {
      return (AutoRespawn)this.f66000[2];
   }

   public KillEffect m8000() {
      return (KillEffect)this.f28000[1];
   }

   public ViewModel m10000() {
      return (ViewModel)this.f16000[6];
   }

   public IlsOqti m12000() {
      return (IlsOqti)this.f66000[3];
   }

   public HolyHelper m14000() {
      return (HolyHelper)this.f28000[2];
   }

   public ItemRelease m16000() {
      return (ItemRelease)this.f28000[4];
   }

   public GameTestHelper m18000() {
      return (GameTestHelper)this.f41000[6];
   }

   public ShulkerPreview m20000() {
      return (ShulkerPreview)this.f52000[1];
   }

   public rw.gui.C0084 m22000() {
      return (rw.gui.C0084)this.f52000[2];
   }

   public NoPush m24000() {
      return (NoPush)this.f3000[6];
   }

   public AutoAuth m26000() {
      return (AutoAuth)this.f27000[f20000[5]];
   }

   public C0752() {
      this.yZ();
      LinkedHashMap var5 = new LinkedHashMap();
      this.f66000[0] = var5;
      Sprint var6 = this.m104000(new Sprint());
      this.f66000[1] = var6;
      AutoRespawn var7 = this.m104000(new AutoRespawn());
      this.f66000[2] = var7;
      IlsOqti var8 = this.m104000(new IlsOqti());
      this.f66000[3] = var8;
      NoSlotChange var9 = this.m104000(new NoSlotChange());
      this.f66000[4] = var9;
      NoServerRotation var10 = this.m104000(new NoServerRotation());
      this.f66000[5] = var10;
      Camera var11 = this.m104000(new Camera());
      this.f66000[6] = var11;
      rw.gui.C0054 var12 = this.m104000(new rw.gui.C0054());
      this.f66000[7] = var12;
      OpenWalls var13 = this.m104000(new OpenWalls());
      this.f3000[0] = var13;
      SeeInvisible var14 = this.m104000(new SeeInvisible());
      this.f3000[1] = var14;
      AutoFish var15 = this.m104000(new AutoFish());
      this.f3000[2] = var15;
      NoEntityTrace var16 = this.m104000(new NoEntityTrace());
      this.f3000[3] = var16;
      NoDelay var17 = this.m104000(new NoDelay());
      this.f3000[4] = var17;
      ScreenWalk var18 = this.m104000(new ScreenWalk());
      this.f3000[5] = var18;
      NoPush var19 = this.m104000(new NoPush());
      this.f3000[6] = var19;
      Arrow var20 = this.m104000(new Arrow());
      this.f3000[7] = var20;
      Vignette var21 = this.m104000(new Vignette());
      this.f12000[0] = var21;
      AntiBot var22 = this.m104000(new AntiBot());
      this.f12000[1] = var22;
      ClickAction var23 = this.m104000(new ClickAction());
      this.f12000[2] = var23;
      AutoAccept var24 = this.m104000(new AutoAccept());
      this.f16000[0] = var24;
      QuickUse var25 = this.m104000(new QuickUse());
      this.f16000[1] = var25;
      TickRateSync var26 = this.m104000(new TickRateSync());
      this.f16000[2] = var26;
      SprintReset var27 = this.m104000(new SprintReset());
      this.f16000[3] = var27;
      AttackAura var28 = this.m104000(new AttackAura());
      this.f16000[4] = var28;
      SwingAnimations var29 = this.m104000(new SwingAnimations());
      this.f16000[5] = var29;
      ViewModel var30 = this.m104000(new ViewModel());
      this.f16000[6] = var30;
      FreeCamera var31 = this.m104000(new FreeCamera());
      this.f52000[0] = var31;
      ShulkerPreview var32 = this.m104000(new ShulkerPreview());
      this.f52000[1] = var32;
      rw.gui.C0084 var33 = this.m104000(new rw.gui.C0084());
      this.f52000[2] = var33;
      GuiElement var34 = this.m104000(new GuiElement());
      this.f52000[3] = var34;
      AutoSwap var35 = this.m104000(new AutoSwap());
      this.f52000[4] = var35;
      NoVelocity var36 = this.m104000(new NoVelocity());
      this.f52000[5] = var36;
      AuctionHelper var37 = this.m104000(new AuctionHelper());
      this.f52000[6] = var37;
      AnarchyHelper var38 = this.m104000(new AnarchyHelper());
      this.f38000[0] = var38;
      FastExp var39 = this.m104000(new FastExp());
      this.f38000[1] = var39;
      AutoTotem var40 = this.m104000(new AutoTotem());
      this.f38000[2] = var40;
      ChestStealer var41 = this.m104000(new ChestStealer());
      this.f19000[0] = var41;
      TapeMouse var42 = this.m104000(new TapeMouse());
      this.f19000[1] = var42;
      Friends var43 = this.m104000(new Friends());
      this.f19000[2] = var43;
      NoSlow var44 = this.m104000(new NoSlow());
      this.f19000[3] = var44;
      AutoJoin var45 = this.m104000(new AutoJoin());
      this.f53000[0] = var45;
      AirStuck var46 = this.m104000(new AirStuck());
      this.f53000[1] = var46;
      PotionTracker var47 = this.m104000(new PotionTracker());
      this.f53000[2] = var47;
      Blink var48 = this.m104000(new Blink());
      this.f48000[0] = var48;
      QsVj var49 = this.m104000(new QsVj());
      this.f48000[1] = var49;
      WebTrap var50 = this.m104000(new WebTrap());
      this.f34000[0] = var50;
      rw.gui.C0045 var51 = this.m104000(new rw.gui.C0045());
      this.f34000[1] = var51;
      DiscordActivity var52 = this.m104000(new DiscordActivity());
      this.f34000[2] = var52;
      ClientSounds var53 = this.m104000(new ClientSounds());
      this.f34000[3] = var53;
      ChatHelper var54 = this.m104000(new ChatHelper());
      this.f34000[4] = var54;
      ElytraHelper var55 = this.m104000(new ElytraHelper());
      this.f34000[5] = var55;
      UseTracker var56 = this.m104000(new UseTracker());
      this.f34000[6] = var56;
      Scaffold var57 = this.m104000(new Scaffold());
      this.f34000[7] = var57;
      AutoDripstone var58 = this.m104000(new AutoDripstone());
      this.f35000[0] = var58;
      DeathCoords var59 = this.m104000(new DeathCoords());
      this.f35000[1] = var59;
      Nuker var60 = this.m104000(new Nuker());
      this.f35000[2] = var60;
      AutoTool var61 = this.m104000(new AutoTool());
      this.f35000[3] = var61;
      JumpEffect var62 = this.m104000(new JumpEffect());
      this.f35000[4] = var62;
      rw.gui.C0059 var63 = this.m104000(new rw.gui.C0059());
      this.f35000[5] = var63;
      AutoEat var64 = this.m104000(new AutoEat());
      this.f35000[6] = var64;
      TriggerBot var65 = this.m104000(new TriggerBot());
      this.f21000[0] = var65;
      EdgeJump var66 = this.m104000(new EdgeJump());
      this.f21000[1] = var66;
      Crossbow var67 = this.m104000(new Crossbow());
      this.f21000[2] = var67;
      NoFriendDamage var68 = this.m104000(new NoFriendDamage());
      this.f21000[3] = var68;
      TargetEsp var69 = this.m104000(new TargetEsp());
      this.f21000[4] = var69;
      StreamerMode var70 = this.m104000(new StreamerMode());
      this.f32000[0] = var70;
      TimeChanger var71 = this.m104000(new TimeChanger());
      this.f32000[1] = var71;
      AutoLeave var72 = this.m104000(new AutoLeave());
      this.f32000[2] = var72;
      rw.gui.C0098 var73 = this.m104000(new rw.gui.C0098());
      this.f27000[0] = var73;
      SkyCustomization var74 = this.m104000(new SkyCustomization());
      this.f27000[1] = var74;
      rw.gui.C0097 var75 = this.m104000(new rw.gui.C0097());
      this.f27000[2] = var75;
      AutoReconnect var76 = this.m104000(new AutoReconnect());
      this.f27000[3] = var76;
      AvoidCollision var77 = this.m104000(new AvoidCollision());
      this.f27000[4] = var77;
      AutoAuth var78 = this.m104000(new AutoAuth());
      this.f27000[5] = var78;
      AutoJump var79 = this.m104000(new AutoJump());
      this.f27000[6] = var79;
      AutoArmor var80 = this.m104000(new AutoArmor());
      this.f14000[0] = var80;
      AutoPotion var81 = this.m104000(new AutoPotion());
      this.f14000[1] = var81;
      SuperFirework var82 = this.m104000(new SuperFirework());
      this.f14000[2] = var82;
      AimAssist var83 = this.m104000(new AimAssist());
      this.f6000[0] = var83;
      BypassHealth var84 = this.m104000(new BypassHealth());
      this.f6000[1] = var84;
      WindHop var85 = this.m104000(new WindHop());
      this.f37000[0] = var85;
      SpearBoost var86 = this.m104000(new SpearBoost());
      this.f37000[1] = var86;
      Speed var87 = this.m104000(new Speed());
      this.f37000[2] = var87;
      Noweb var88 = this.m104000(new Noweb());
      this.f45000[0] = var88;
      AutoPearl var89 = this.m104000(new AutoPearl());
      this.f45000[1] = var89;
      rw.gui.C0114 var90 = this.m104000(new rw.gui.C0114());
      this.f42000[0] = var90;
      InventoryOnly var91 = this.m104000(new InventoryOnly());
      this.f42000[1] = var91;
      Coordinates var92 = this.m104000(new Coordinates());
      this.f42000[2] = var92;
      Target var93 = this.m104000(new Target());
      this.f42000[3] = var93;
      TargetInfo var94 = this.m104000(new TargetInfo());
      this.f4000[0] = var94;
      Inventory var95 = this.m104000(new Inventory());
      this.f4000[1] = var95;
      C0111 var96 = this.m104000(new C0111());
      this.f4000[2] = var96;
      rw.gui.C0110 var97 = this.m104000(new rw.gui.C0110());
      this.f4000[3] = var97;
      Critical var98 = this.m104000(new Critical());
      this.f28000[0] = var98;
      KillEffect var99 = this.m104000(new KillEffect());
      this.f28000[1] = var99;
      HolyHelper var100 = this.m104000(new HolyHelper());
      this.f28000[2] = var100;
      Timer var101 = this.m104000(new Timer());
      this.f28000[3] = var101;
      ItemRelease var102 = this.m104000(new ItemRelease());
      this.f28000[4] = var102;
      AutoBuy var103 = this.m104000(new AutoBuy());
      this.f28000[5] = var103;
      AspectRatio var104 = this.m104000(new AspectRatio());
      this.f28000[6] = var104;
      ElytraTarget var105 = this.m104000(new ElytraTarget());
      this.f28000[7] = var105;
      WallClimb var106 = this.m104000(new WallClimb());
      this.f54000[0] = var106;
      NoInteract var107 = this.m104000(new NoInteract());
      this.f54000[1] = var107;
      Tracers var108 = this.m104000(new Tracers());
      this.f41000[0] = var108;
      AutoExplosion var109 = this.m104000(new AutoExplosion());
      this.f41000[1] = var109;
      CustomCape var110 = this.m104000(new CustomCape());
      this.f41000[2] = var110;
      FreeLook var111 = this.m104000(new FreeLook());
      this.f41000[3] = var111;
      rw.gui.C0050 var112 = this.m104000(new rw.gui.C0050());
      this.f41000[4] = var112;
      LockSlots var113 = this.m104000(new LockSlots());
      this.f41000[5] = var113;
      GameTestHelper var114 = this.m104000(new GameTestHelper());
      this.f41000[6] = var114;
   }

   static {
      ntfClinit();
   }

   public SprintReset m28000() {
      return (SprintReset)this.f16000[3];
   }

   public AttackAura m30000() {
      return (AttackAura)this.f16000[4];
   }

   public AvoidCollision m32000() {
      return (AvoidCollision)this.f27000[f20000[4]];
   }

   public Crossbow m34000() {
      return (Crossbow)this.f21000[2];
   }

   public AutoPotion m36000() {
      return (AutoPotion)this.f14000[1];
   }

   public rw.gui.C0114 m38000() {
      return (rw.gui.C0114)this.f42000[0];
   }

   public rw.gui.C0097 m40000() {
      return (rw.gui.C0097)this.f27000[f20000[2]];
   }

   public EdgeJump m42000() {
      return (EdgeJump)this.f21000[1];
   }

   public SeeInvisible m44000() {
      return (SeeInvisible)this.f3000[1];
   }

   public rw.gui.C0059 m46000() {
      return (rw.gui.C0059)this.f35000[5];
   }

   public TimeChanger m48000() {
      return (TimeChanger)this.f32000[1];
   }

   public Nuker m50000() {
      return (Nuker)this.f35000[2];
   }

   public StreamerMode m52000() {
      return (StreamerMode)this.f32000[0];
   }

   public NoVelocity m54000() {
      return (NoVelocity)this.f52000[5];
   }

   public AutoPearl m56000() {
      return (AutoPearl)this.f45000[1];
   }

   public WallClimb m58000() {
      return (WallClimb)this.f54000[0];
   }

   public WebTrap m60000() {
      return (WebTrap)this.f34000[0];
   }

   public CustomCape m62000() {
      return (CustomCape)this.f41000[2];
   }

   public TargetInfo m64000() {
      return (TargetInfo)this.f4000[0];
   }

   public ElytraHelper m66000() {
      return (ElytraHelper)this.f34000[5];
   }

   public Stream<GuiWidget> m68000() {
      return ((Map)this.f66000[0]).values().stream();
   }

   public AutoReconnect m70000() {
      return (AutoReconnect)this.f27000[f20000[3]];
   }

   public JumpEffect m72000() {
      return (JumpEffect)this.f35000[4];
   }

   public ElytraTarget m74000() {
      return (ElytraTarget)this.f28000[7];
   }

   public QuickUse m76000() {
      return (QuickUse)this.f16000[1];
   }

   public Stream<String> m78000() {
      return ((Map)this.f66000[0]).keySet().stream();
   }

   public AspectRatio m80000() {
      return (AspectRatio)this.f28000[6];
   }

   public AutoLeave m82000() {
      return (AutoLeave)this.f32000[2];
   }

   public AutoAccept m84000() {
      return (AutoAccept)this.f16000[0];
   }

   public DeathCoords m86000() {
      return (DeathCoords)this.f35000[1];
   }

   public BypassHealth m88000() {
      return (BypassHealth)this.f6000[1];
   }

   public rw.gui.C0098 m90000() {
      return (rw.gui.C0098)this.f27000[f20000[0]];
   }

   public Blink m92000() {
      return (Blink)this.f48000[0];
   }

   public TargetEsp m94000() {
      return (TargetEsp)this.f21000[4];
   }

   public PotionTracker m98000() {
      return (PotionTracker)this.f53000[2];
   }

   public ChestStealer m100000() {
      return (ChestStealer)this.f19000[0];
   }

   public AutoFish m102000() {
      return (AutoFish)this.f3000[2];
   }

   private <V extends GuiWidget> V m104000(V var1) {
      if (var1.m36000() == (Enum0058)Enum0058.f2000[1] && !((OlrkOij)OlrkOij.f1000[2]).m44000(((C0959)NursultanClient.f13000[2]).m22000())) {
         return (V)var1;
      } else {
         String var2 = var1.m42000();
         ((Map)this.f66000[0]).put(var2, var1);
         return (V)var1;
      }
   }

   public Optional<GuiWidget> m106000(String var1) {
      return Optional.ofNullable((GuiWidget)((Map)this.f66000[0]).get(var1));
   }

   public rw.gui.C0050 m110000() {
      return (rw.gui.C0050)this.f41000[4];
   }

   public TickRateSync m112000() {
      return (TickRateSync)this.f16000[2];
   }

   public AirStuck m114000() {
      return (AirStuck)this.f53000[1];
   }

   public Critical m116000() {
      return (Critical)this.f28000[0];
   }

   public ChatHelper m118000() {
      return (ChatHelper)this.f34000[4];
   }

   public OpenWalls m120000() {
      return (OpenWalls)this.f3000[0];
   }

   public AutoEat m122000() {
      return (AutoEat)this.f35000[6];
   }

   public SuperFirework m124000() {
      return (SuperFirework)this.f14000[2];
   }

   public FreeLook m126000() {
      return (FreeLook)this.f41000[3];
   }

   public NoSlow m128000() {
      return (NoSlow)this.f19000[3];
   }

   private void yZ() {
      if (this.f66000 == null) {
         this.f66000 = new Object[8];
         Object[] var1 = this.f66000;
      }

      if (this.f3000 == null) {
         this.f3000 = new Object[8];
         Object[] var2 = this.f3000;
      }

      if (this.f12000 == null) {
         this.f12000 = new Object[3];
         Object[] var3 = this.f12000;
      }

      if (this.f16000 == null) {
         this.f16000 = new Object[7];
         Object[] var4 = this.f16000;
      }

      if (this.f52000 == null) {
         this.f52000 = new Object[7];
         Object[] var5 = this.f52000;
      }

      if (this.f38000 == null) {
         this.f38000 = new Object[3];
         Object[] var6 = this.f38000;
      }

      if (this.f19000 == null) {
         this.f19000 = new Object[4];
         Object[] var7 = this.f19000;
      }

      if (this.f53000 == null) {
         this.f53000 = new Object[3];
         Object[] var8 = this.f53000;
      }

      if (this.f48000 == null) {
         this.f48000 = new Object[2];
         Object[] var9 = this.f48000;
      }

      if (this.f34000 == null) {
         this.f34000 = new Object[8];
         Object[] var10 = this.f34000;
      }

      if (this.f35000 == null) {
         this.f35000 = new Object[7];
         Object[] var11 = this.f35000;
      }

      if (this.f21000 == null) {
         this.f21000 = new Object[5];
         Object[] var12 = this.f21000;
      }

      if (this.f32000 == null) {
         this.f32000 = new Object[3];
         Object[] var13 = this.f32000;
      }

      if (this.f27000 == null) {
         this.f27000 = new Object[7];
         Object[] var14 = this.f27000;
      }

      if (this.f14000 == null) {
         this.f14000 = new Object[3];
         Object[] var15 = this.f14000;
      }

      if (this.f6000 == null) {
         this.f6000 = new Object[2];
         Object[] var16 = this.f6000;
      }

      if (this.f37000 == null) {
         this.f37000 = new Object[3];
         Object[] var17 = this.f37000;
      }

      if (this.f45000 == null) {
         this.f45000 = new Object[2];
         Object[] var18 = this.f45000;
      }

      if (this.f42000 == null) {
         this.f42000 = new Object[4];
         Object[] var19 = this.f42000;
      }

      if (this.f4000 == null) {
         this.f4000 = new Object[4];
         Object[] var20 = this.f4000;
      }

      if (this.f28000 == null) {
         this.f28000 = new Object[8];
         Object[] var21 = this.f28000;
      }

      if (this.f54000 == null) {
         this.f54000 = new Object[2];
         Object[] var22 = this.f54000;
      }

      if (this.f41000 == null) {
         this.f41000 = new Object[7];
         Object[] var23 = this.f41000;
      }
   }

   public Arrow m130000() {
      return (Arrow)this.f3000[7];
   }

   public UseTracker m132000() {
      return (UseTracker)this.f34000[6];
   }

   public Sprint yM() {
      return (Sprint)this.f66000[1];
   }

   public ScreenWalk yB() {
      return (ScreenWalk)this.f3000[5];
   }

   public AntiBot m134000() {
      return (AntiBot)this.f12000[1];
   }

   public InventoryOnly m136000() {
      return (InventoryOnly)this.f42000[1];
   }

   public Vignette m138000() {
      return (Vignette)this.f12000[0];
   }

   public FastExp m140000() {
      return (FastExp)this.f38000[1];
   }

   public SkyCustomization m142000() {
      return (SkyCustomization)this.f27000[f20000[1]];
   }

   public rw.gui.C0045 yR() {
      return (rw.gui.C0045)this.f34000[1];
   }

   public C0111 m144000() {
      return (C0111)this.f4000[2];
   }

   public ClientSounds m146000() {
      return (ClientSounds)this.f34000[3];
   }

   public AutoTotem m148000() {
      return (AutoTotem)this.f38000[2];
   }

   public NoDelay m150000() {
      return (NoDelay)this.f3000[4];
   }

   public Iterable<GuiWidget> m152000() {
      return ((Map)this.f66000[0]).values();
   }

   public AutoTool m154000() {
      return (AutoTool)this.f35000[3];
   }

   public AutoArmor m156000() {
      return (AutoArmor)this.f14000[f20000[7]];
   }

   public Speed m158000() {
      return (Speed)this.f37000[2];
   }

   public Inventory m160000() {
      return (Inventory)this.f4000[1];
   }

   public AutoBuy m162000() {
      return (AutoBuy)this.f28000[5];
   }

   public Camera m164000() {
      return (Camera)this.f66000[6];
   }

   public Target m166000() {
      return (Target)this.f42000[3];
   }

   public TriggerBot m168000() {
      return (TriggerBot)this.f21000[0];
   }

   public GuiElement m170000() {
      return (GuiElement)this.f52000[3];
   }

   public ClickAction m172000() {
      return (ClickAction)this.f12000[2];
   }

   public rw.gui.C0110 m174000() {
      return (rw.gui.C0110)this.f4000[3];
   }

   public AutoSwap m176000() {
      return (AutoSwap)this.f52000[4];
   }

   public AutoJoin m178000() {
      return (AutoJoin)this.f53000[0];
   }

   public rw.gui.C0054 m180000() {
      return (rw.gui.C0054)this.f66000[7];
   }

   private static void m182000() {
      f24000 = new short[]{0, 1, 2, 3, 4, 5, 6};
      f64000 = new short[]{7, 0, 1, 2, 3};
      f51000 = new short[]{4, 5, 6, 7, 0, 1, 2};
      f18000 = new short[]{0, 1, 2, 3};
      f47000 = new short[]{4, 5, 6, 0, 1, 2, 3, 4};
      f49000 = new short[]{5, 6, 0, 1, 2, 0};
      f36000 = new short[]{1, 2, 3, 0, 1, 2, 0};
      f46000 = new short[]{1, 0, 1};
      f39000 = new short[]{2, 3, 4, 5};
      f11000 = new short[]{6, 7, 0};
      f57000 = new short[]{1, 2};
      f10000 = new short[]{3, 4, 5, 6, 0, 1, 2};
      f15000 = new short[]{3, 4, 0, 1};
      f23000 = new short[]{2, 0, 1, 2, 3, 4, 5};
      f33000 = new short[]{6, 0, 1};
      f31000 = new short[]{2, 0, 1, 0, 1, 2};
      f8000 = new short[]{0, 1, 0, 1, 2, 3, 0};
      f61000 = new short[]{1, 2, 3, 0, 1};
      f30000 = new short[]{2, 3};
      f29000 = new short[]{4, 5, 6, 7, 0};
      f67000 = new short[]{1, 0, 1, 2, 3, 4, 5, 6};
      f44000 = new short[]{1, 2, 2, 0, 0, 0, 0};
      f13000 = new short[]{0, 1, 2};
      f63000 = new short[]{3, 4, 5};
      f43000 = new short[]{6, 7, 0, 1, 2, 3, 4};
      f17000 = new short[]{5, 6, 7, 0};
      f55000 = new short[]{1, 2, 0, 1, 2};
      f56000 = new short[]{3, 4, 5, 6, 0, 1};
      f59000 = new short[]{2, 3, 4, 5, 6, 0, 1};
      f22000 = new short[]{2, 0, 1, 2};
      f62000 = new short[]{3, 0, 1, 2};
      f60000 = new short[]{0, 1, 0, 1, 2, 3, 4, 5};
      f50000 = new short[]{6, 7};
      f5000 = new short[]{0, 1, 2};
      f7000 = new short[]{3, 4, 5};
      f1000 = new short[]{6, 0, 1, 2, 3, 4};
      f26000 = new short[]{0, 1, 2};
      f20000 = new short[]{0, 1, 2, 3, 4, 5, 6, 0};
      f40000 = new short[]{1, 2, 0};
      f65000 = new short[]{1, 0, 1, 2, 0, 1, 0, 1};
      f9000 = new short[]{2, 3, 0, 1, 2, 3, 0, 1};
      f25000 = new short[]{2, 3, 4, 5, 6, 7};
      f2000 = new short[]{0, 1, 0};
      f58000 = new short[]{1, 2, 3, 4, 5, 6};
   }

   public WindHop m184000() {
      return (WindHop)this.f37000[0];
   }

   public Tracers m186000() {
      return (Tracers)this.f41000[0];
   }

   public AutoExplosion m188000() {
      return (AutoExplosion)this.f41000[1];
   }

   public AimAssist m190000() {
      return (AimAssist)this.f6000[0];
   }

   public DiscordActivity m192000() {
      return (DiscordActivity)this.f34000[2];
   }

   public AutoDripstone m194000() {
      return (AutoDripstone)this.f35000[0];
   }

   public Friends yL() {
      return (Friends)this.f19000[2];
   }

   public NoInteract m196000() {
      return (NoInteract)this.f54000[1];
   }

   public Noweb m198000() {
      return (Noweb)this.f45000[0];
   }

   public AuctionHelper m200000() {
      return (AuctionHelper)this.f52000[6];
   }

   public NoSlotChange m202000() {
      return (NoSlotChange)this.f66000[4];
   }

   public QsVj yN() {
      return (QsVj)this.f48000[1];
   }

   public Scaffold m204000() {
      return (Scaffold)this.f34000[7];
   }

   public Coordinates m206000() {
      return (Coordinates)this.f42000[2];
   }

   public FreeCamera m208000() {
      return (FreeCamera)this.f52000[0];
   }

   public Timer m210000() {
      return (Timer)this.f28000[3];
   }

   public NoFriendDamage m212000() {
      return (NoFriendDamage)this.f21000[3];
   }

   public NoServerRotation m214000() {
      return (NoServerRotation)this.f66000[5];
   }

   public NoEntityTrace m216000() {
      return (NoEntityTrace)this.f3000[3];
   }

   public LockSlots m218000() {
      return (LockSlots)this.f41000[5];
   }

   public SpearBoost m220000() {
      return (SpearBoost)this.f37000[1];
   }

   public AutoJump m222000() {
      return (AutoJump)this.f27000[f20000[6]];
   }

   public AnarchyHelper m224000() {
      return (AnarchyHelper)this.f38000[0];
   }
}
