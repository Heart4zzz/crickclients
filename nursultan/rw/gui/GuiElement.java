package rw.gui;

import KDFzREm.NNBK;
import KDFzREm.NNNZg;
import KDFzREm.NNuU;
import KDFzREm.NbK;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.joml.Vector4f;
import rw.GuiWidget;
import rw.NursultanClient;
import rw.api.AnnotationDefault;
import rw.api.Iface0642;
import rw.api.Iface0650;
import rw.core.Base0748;
import rw.core.C0077;
import rw.core.C0138;
import rw.core.C0151;
import rw.core.C0704;
import rw.core.C0725;
import rw.core.C0726;
import rw.core.C0728;
import rw.core.C0731;
import rw.core.C0737;
import rw.core.C0739;
import rw.core.C0841;
import rw.core.C0842;
import rw.core.C0861;
import rw.core.C0876;
import rw.core.C0923;
import rw.core.C0954;
import rw.core.C0988;
import rw.core.C0998;
import rw.core.C1000;
import rw.core.C1003;
import rw.core.C1013;
import rw.core.C1136;
import rw.core.C1137;
import rw.core.C1141;
import rw.core.Ilnorttr;
import rw.data.Rec0184;
import rw.defs.Enum0055;
import rw.defs.Enum0081;
import rw.module.Nametags;
import rw.setting.C0071;
import rw.setting.C0122;
import rw.setting.PublicBukkitValues;

@AnnotationDefault(
   L = "EntityESP",
   y = Enum0055.VISUAL,
   N = Enum0070.SCREEN
)
public class GuiElement extends GuiWidget {
   private static boolean[] f1000;
   public Object[] f2000;
   private static boolean[] f3000;
   public Object[] f4000;
   public Object[] f5000;
   private static boolean[] f6000;
   public Object[] f7000;
   public Object[] f8000;
   public Object[] f9000;
   private static boolean[] f10000;
   private static boolean[] f11000;
   private static boolean[] f12000;
   private static String[] f13000;
   private static String[] f14000;
   private static boolean[] f15000;
   public Object[] f16000;
   private static float[] f17000;
   private static boolean[] f18000;
   private static String[] f19000;
   private static float[] f20000;
   private static boolean[] f21000;
   public Object[] f22000;
   private static String[] f23000;
   private static boolean[] f24000;
   private static String[] f25000;
   private static boolean[] f26000;
   private static String[] f27000;
   private static String[] f28000;
   private static boolean[] f29000;

   private int m12000() {
      this.m8000();
      if (((C1013)this.f4000[2]).m14000()) {
         return (Integer)((C0998)this.f4000[6]).i();
      } else {
         return ((C1013)this.f4000[3]).m14000() ? C0876.m38000(C0077.m22000(), f20000[1]) : -65536;
      }
   }

   public GuiElement() {
      this.m8000();
      PublicBukkitValues var5 = new PublicBukkitValues(this, f14000[0], true);
      this.f7000[0] = var5;
      C0726 var6 = new C0726(this, f14000[1], true);
      this.f7000[1] = var6;
      C0861 var7 = new C0861(this, f14000[2], true);
      this.f7000[2] = var7;
      C0842 var8 = new C0842(this, f14000[3], false);
      this.f7000[3] = var8;
      C0737 var9 = new C0737(this, f14000[4], false);
      this.f7000[4] = var9;
      C0739 var10 = new C0739(this, f14000[5], true);
      this.f7000[5] = var10;
      C0841 var11 = new C0841(this, f28000[0], false);
      this.f8000[0] = var11;
      C0725 var12 = new C0725(this, f28000[1], false);
      this.f8000[1] = var12;
      C1136 var13 = new C1136(f28000[2], true);
      this.f8000[2] = var13;
      C1137 var14 = new C1137(f28000[3], true);
      this.f8000[3] = var14;
      C1141 var15 = new C1141(f28000[4], false);
      this.f5000[0] = var15;
      C0731 var16 = new C0731(f28000[5], false);
      this.f5000[1] = var16;
      C1003 var17 = C0122.m4000(
         this,
         f28000[6],
         (PublicBukkitValues)this.f7000[0],
         (C0726)this.f7000[1],
         (C0861)this.f7000[2],
         (C0739)this.f7000[5],
         (C0841)this.f8000[0],
         (C0842)this.f7000[3],
         (C0737)this.f7000[4],
         (C0725)this.f8000[1]
      );
      this.f5000[2] = var17;
      C1003 var18 = (C1003)C0122.m4000(this, f27000[0], (C1136)this.f8000[2], (C1137)this.f8000[3], (C1141)this.f5000[0], (C0731)this.f5000[1]).N(var1 -> {
         this.m8000();
         return ((PublicBukkitValues)this.f7000[0]).U();
      });
      this.f5000[3] = var18;
      C1013 var19 = new C1013(f27000[1], true);
      this.f5000[4] = var19;
      C1013 var20 = new C1013(f27000[2], true);
      this.f2000[0] = var20;
      C1013 var21 = new C1013(f27000[3], false);
      this.f2000[1] = var21;
      C1013 var22 = new C1013(f19000[0], true);
      this.f2000[2] = var22;
      C1013 var23 = new C1013(f19000[1], true);
      this.f2000[3] = var23;
      C1013 var24 = new C1013(f19000[2], true);
      this.f2000[4] = var24;
      C1013 var25 = new C1013(f19000[3], true);
      this.f2000[5] = var25;
      C1013 var26 = new C1013(f19000[4], false);
      this.f22000[0] = var26;
      String var10002 = f19000[5];
      C1013[] var10003 = new C1013[]{(C1013)this.f2000[0], null, null, null, null, null, null, null};
      var10003[f18000[0]] = (C1013)this.f2000[1];
      var10003[2] = (C1013)this.f5000[4];
      var10003[3] = (C1013)this.f2000[2];
      var10003[4] = (C1013)this.f2000[3];
      var10003[5] = (C1013)this.f2000[4];
      var10003[6] = (C1013)this.f2000[5];
      var10003[7] = (C1013)this.f22000[0];
      C1003 var27 = C0122.m4000(this, var10002, var10003);
      this.f22000[1] = var27;
      C0728 var28 = new C0728(f19000[6], f18000[1], f18000[2]);
      this.f9000[0] = var28;
      C0728 var29 = new C0728(f19000[7], true, 2);
      this.f9000[1] = var29;
      C1000 var30 = (C1000)C0122.m18000(this, f13000[0], (C0728)this.f9000[0], (C0728)this.f9000[1]).N(var1 -> {
         this.m8000();
         return ((C1013)this.f2000[0]).m14000();
      });
      this.f9000[2] = var30;
      C0988 var31 = (C0988)C0122.m12000(this, f13000[1], f17000[0], f17000[1], f17000[2], f17000[3]).N(var1 -> {
         this.m8000();
         return (boolean)(((C0731)this.f5000[1]).U() && ((C1003)this.f5000[3]).E() ? 1 : 0);
      });
      this.f9000[3] = var31;
      C0998 var32 = (C0998)C0122.m6000(this, f13000[2], -11104513).N(var1 -> {
         this.m8000();
         return ((C1013)this.f2000[2]).m14000();
      });
      this.f4000[0] = var32;
      C1013 var33 = new C1013(f23000[0], true);
      this.f4000[1] = var33;
      C1013 var34 = new C1013(f23000[1], false);
      this.f4000[2] = var34;
      C1013 var35 = new C1013(f23000[2], false);
      this.f4000[3] = var35;
      C1000 var36 = (C1000)C0122.m18000(this, f23000[3], (C1013)this.f4000[1], (C1013)this.f4000[2], (C1013)this.f4000[3]).N(var1 -> {
         this.m8000();
         return ((C1013)this.f2000[4]).m14000();
      });
      this.f4000[4] = var36;
      C0998 var37 = (C0998)C0122.m6000(this, f23000[4], -16711936).N(var1 -> {
         this.m8000();
         return (boolean)(((C1013)this.f2000[4]).m14000() && ((C1013)this.f4000[2]).m14000() ? 1 : 0);
      });
      this.f4000[5] = var37;
      C0998 var38 = (C0998)C0122.m6000(this, f23000[5], -65536).N(var1 -> {
         this.m8000();
         return (boolean)(((C1013)this.f2000[4]).m14000() && ((C1013)this.f4000[2]).m14000() ? 1 : 0);
      });
      this.f4000[6] = var38;
      C0988 var39 = (C0988)C0122.m12000(this, f23000[6], f17000[4], f17000[5], f17000[6], f17000[7]).N(var1 -> {
         this.m8000();
         return ((C1013)this.f5000[4]).m14000();
      });
      this.f4000[7] = var39;
      C1013 var40 = new C1013(f25000[0], true);
      this.f16000[0] = var40;
      C1013 var41 = new C1013(f25000[1], false);
      this.f16000[1] = var41;
      C1013 var42 = new C1013(f25000[2], false);
      this.f16000[2] = var42;
      C1000 var43 = (C1000)C0122.m18000(this, f25000[3], (C1013)this.f16000[0], (C1013)this.f16000[1], (C1013)this.f16000[2]).N(var1 -> {
         this.m8000();
         return (boolean)(((C1013)this.f5000[4]).m14000() && ((C0739)this.f7000[5]).U() ? 1 : 0);
      });
      this.f16000[3] = var43;
      GuiManager var44 = new GuiManager(this);
      this.f16000[4] = var44;
      HashSet var45 = new HashSet();
      this.f16000[5] = var45;
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      f14000 = new String[]{"players", "friends", "villagers", "monsters", "animals", "items"};
      f28000 = new String[]{"self", "chest-minecart", "invisible", "naked", "bot", "dormant", "entities"};
      f27000 = new String[]{"target-condition", "name", "equipment", "hold-in-hands"};
      f19000 = new String[]{"box", "ft-spheres", "health-bar", "shader", "chams", "details", "_1x", "_2x"};
      f13000 = new String[]{"equipment-size", "dormant-display-time", "box-color"};
      f23000 = new String[]{"health", "custom", "client", "health-bar-mode", "health-bar-color", "health-bar-color-bottom", "scale"};
      f25000 = new String[]{"formatted", "item-name", "both", "item-name-mode"};
   }

   private void m8000() {
      if (this.f7000 == null) {
         this.f7000 = new Object[6];
         Object[] var1 = this.f7000;
      }

      if (this.f8000 == null) {
         this.f8000 = new Object[4];
         Object[] var2 = this.f8000;
      }

      if (this.f5000 == null) {
         this.f5000 = new Object[5];
         Object[] var3 = this.f5000;
      }

      if (this.f2000 == null) {
         this.f2000 = new Object[6];
         Object[] var4 = this.f2000;
      }

      if (this.f22000 == null) {
         this.f22000 = new Object[2];
         Object[] var5 = this.f22000;
      }

      if (this.f9000 == null) {
         this.f9000 = new Object[4];
         Object[] var6 = this.f9000;
      }

      if (this.f4000 == null) {
         this.f4000 = new Object[8];
         Object[] var7 = this.f4000;
      }

      if (this.f16000 == null) {
         this.f16000 = new Object[6];
         Object[] var8 = this.f16000;
      }
   }

   private static void m10000() {
      f3000 = new boolean[]{true, true, true, false, false, true, false, false};
      f1000 = new boolean[]{true, true};
      f12000 = new boolean[]{false, false, false, true, false, true, true};
      f26000 = new boolean[]{true, false, true, true, true, true};
      f29000 = new boolean[]{false, false};
      f18000 = new boolean[]{true, false, true};
      f11000 = new boolean[]{true, false, true};
      f6000 = new boolean[]{true, false, false};
      f21000 = new boolean[]{false, true};
      f24000 = new boolean[]{true, false, false, false, true, true};
      f15000 = new boolean[]{true, true, false, true, false};
      f10000 = new boolean[]{true, false, true, false, true, false};
   }

   public C0988 m44000() {
      this.m8000();
      return (C0988)this.f4000[7];
   }

   private static void m12000() {
      f17000 = new float[]{3.0F, 2.0F, 10.0F, 1.0F, 20.0F, 12.0F, 24.0F, 4.0F};
      f20000 = new float[]{0.9F, 0.2F};
   }

   private int m58000() {
      this.m8000();
      if (((C1013)this.f4000[2]).m14000()) {
         return (Integer)((C0998)this.f4000[5]).i();
      } else {
         return ((C1013)this.f4000[3]).m14000() ? C0876.m64000(C0077.m22000(), f20000[0]) : -16711936;
      }
   }

   @Iface0642
   public void m74000(C0923 var1) {
      this.m8000();
      if (((C0731)this.f5000[1]).U() && ((C1003)this.f5000[3]).E()) {
         if (var1.m14000() instanceof C0071 var2) {
            var2.dataManager().m14000().m12000(true);
            ((Set)this.f16000[5]).add(m82000(var2));
         }
      }
   }

   @Iface0642
   public void m76000(C0138 var1) {
      this.m8000();
      ((GuiManager)this.f16000[4]).m104000(var1);
   }

   @Iface0642
   public void m78000(Ilnorttr var1) {
      this.m8000();
      if (var1.m14000() instanceof C0071 var2) {
         ((Set)this.f16000[5]).remove(m82000(var2));
      }
   }

   @Iface0642(
      y = Enum0081.BEFORE
   )
   public void m80000(C0704 var1) {
      this.m8000();
      NNBK var2 = var1.m26000();
      ((GuiManager)this.f16000[4]).m106000(var2);
      ZwBs var3 = C0002.m24000();

      for (NbK var5 : ((NNNZg)((NNuU)this.y[0]).T[3]).M()) {
         if (IlkOns.m50000(var5)) {
            this.m88000(var5, var2, var3);
         }
      }

      ((Set)this.f16000[5]).removeIf(var3x -> {
         this.m8000();
         if (NursultanClient.m74000().m10000() - var3x.m6000() > C0954.m20000(((Float)((C0988)this.f9000[3]).i()).intValue())) {
            return (boolean)1;
         } else {
            this.m88000(var3x.m10000(), var2, var3);
            return (boolean)0;
         }
      });
   }

   private static Rec0184 m82000(C0071 var0) {
      return new Rec0184(var0, NursultanClient.m74000().m10000());
   }

   @Iface0642
   public void m84000(Nametags var1) {
      this.m8000();
      if (((C1013)this.f5000[4]).m14000()) {
         NbK var2 = ((Iface0650)var1.m4000()).dataManager().m12000().m10000();

         for (Base0748 var4 : (List)((C1003)this.f5000[2]).i()) {
            if (var4.test(var2)) {
               var1.N();
            }
         }
      }
   }

   @Iface0642
   public void m86000(C0151 var1) {
      this.m8000();
      ((Set)this.f16000[5]).clear();
   }

   private void m88000(NbK var1, NNBK var2, ZwBs var3) {
      this.m8000();
      Vector4f var4 = IlkOns.m68000(var1, true);
      if (var4 != null && var1.method_5476() != null) {
         for (Base0748 var6 : (List)((C1003)this.f5000[2]).i()) {
            if (var6.test(var1)) {
               if (((C1013)this.f2000[4]).m14000()) {
                  var6.m34000(var2, var3, var4, var1, this.m58000(), this.m12000());
               }

               if (((C1013)this.f2000[2]).m14000()) {
                  var6.m32000(var2, var3, var4, var1, (Integer)((C0998)this.f4000[0]).i());
               }

               if (((C1013)this.f5000[4]).m14000()) {
                  var6.m28000(var2, var3, var4, var1);
               }

               if (((C1013)this.f2000[0]).m14000()) {
                  var6.m8000(var2, var3, var4, var1);
               }

               if (((C1013)this.f2000[1]).m14000()) {
                  var6.m26000(var2, var3, var4, var1);
               }
               break;
            }
         }
      }
   }
}
