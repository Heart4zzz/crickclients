package rw.module;

import KDFzREm.NNNYO;
import KDFzREm.NNuU;
import KDFzREm.NQa;
import KDFzREm.NXi;
import java.util.Iterator;
import java.util.List;
import org.joml.Vector2f;
import org.joml.Vector3d;
import rw.GuiWidget;
import rw.NursultanClient;
import rw.api.AnnotationDefault;
import rw.api.Iface0606;
import rw.api.Iface0622;
import rw.api.Iface0642;
import rw.core.C0151;
import rw.core.C0704;
import rw.core.C0719;
import rw.core.C0721;
import rw.core.C0777;
import rw.core.C0805;
import rw.core.C0814;
import rw.core.IlirIpl;
import rw.core.OlikIm;
import rw.core.OlpkOimtk;
import rw.data.Rec0228;
import rw.defs.Enum0055;
import rw.gui.C0002;
import rw.gui.Enum0070;
import rw.gui.IlkOns;
import rw.gui.ZwBs;
import rw.setting.Automatic;
import rw.setting.C0127;
import rw.setting.C0130;
import rw.setting.C0160;

@AnnotationDefault(
   L = "AnarchyHelper",
   y = Enum0055.MISC,
   N = Enum0070.HELPER
)
public class AnarchyHelper extends GuiWidget implements Iface0622 {
   private static short[] f1000;
   private static short[] f2000;
   private static byte[] f3000;
   private static short[] f4000;
   private static short[] f5000;
   private static short[] f6000;
   private static short[] f7000;
   private static String[] f8000;
   public Object[] f9000;
   private static String[] f10000;
   private static short[] f11000;
   private static byte[] f12000;
   private static byte[] f13000;
   private static float[] f14000;
   private static short[] f15000;
   private static byte[] f16000;
   private static String[] f17000;
   private static String[] f18000;
   public Object[] f19000;
   private static String[] f20000;
   private static short[] f21000;
   private static String[] f22000;
   public Object[] f23000;

   private static void m4000() {
      f13000 = new byte[]{13, 2};
      f3000 = new byte[]{3, 4, 5, 6, 7, 8};
      f16000 = new byte[]{9, 10, 11, 12, 2};
      f12000 = new byte[]{-10, 16, 4, 6, 8};
   }

   public AnarchyHelper() {
      this.m8000();
      C0127 var5 = new C0127(this, f10000[0], NQa.nG, f10000[1], f10000[2]);
      this.f23000[0] = var5;
      C0127 var6 = new C0127(this, f10000[3], NQa.TW, f10000[4], f22000[0]);
      this.f23000[1] = var6;
      C0127 var7 = new C0127(this, f22000[1], NQa.ss, f22000[2], f22000[3]);
      this.f23000[2] = var7;
      C0127 var8 = new C0127(this, f22000[4], NQa.vg, f22000[5], f22000[6]);
      this.f23000[3] = var8;
      C0127 var9 = new C0127(this, f17000[0], NQa.ny, f17000[1], f17000[2]);
      this.f19000[0] = var9;
      C0127 var10 = new C0127(this, f17000[3], NQa.jP, f17000[4], f17000[5]);
      this.f19000[1] = var10;
      C0127 var11 = new C0127(this, f20000[0], NQa.GZ, f20000[1], f20000[2]);
      this.f19000[2] = var11;
      IlirIpl var12 = new IlirIpl(this, f20000[3], C0777.f13000, f20000[4]);
      this.f19000[3] = var12;
      IlirIpl var13 = new IlirIpl(this, f20000[5], C0777.f23000, f18000[0]);
      this.f19000[4] = var13;
      IlirIpl var14 = new IlirIpl(this, f18000[1], C0777.f1000, f18000[2]);
      this.f19000[5] = var14;
      IlirIpl var15 = new IlirIpl(this, f18000[3], C0777.f5000, f18000[4]);
      this.f9000[0] = var15;
      IlirIpl var16 = new IlirIpl(this, f18000[5], C0777.f42000, f18000[6]);
      this.f9000[1] = var16;
      IlirIpl var17 = new IlirIpl(this, f18000[7], C0777.f10000, f8000[0]);
      this.f9000[2] = var17;
      List var18 = List.of(
         (C0127)this.f23000[0],
         (C0127)this.f23000[1],
         (C0127)this.f23000[2],
         (C0127)this.f23000[3],
         (C0127)this.f19000[0],
         (C0127)this.f19000[1],
         (C0127)this.f19000[2],
         (C0127)this.f19000[3],
         (C0127)this.f19000[4],
         (C0127)this.f19000[5],
         (C0127)this.f9000[0],
         (C0127)this.f9000[1],
         (C0127)this.f9000[2]
      );
      this.f9000[3] = var18;
      OlikIm var19 = new OlikIm();
      this.f9000[4] = var19;
      C0130 var20 = new C0130(this, (OlikIm)this.f9000[4]);
      this.f9000[5] = var20;
      Automatic var21 = new Automatic(this);
      this.f9000[6] = var21;
      OlpkOimtk var22 = new OlpkOimtk(0);
      this.f9000[7] = var22;
   }

   static {
      ntfClinit();
   }

   private void m8000() {
      if (this.f23000 == null) {
         this.f23000 = new Object[4];
         Object[] var1 = this.f23000;
      }

      if (this.f19000 == null) {
         this.f19000 = new Object[6];
         Object[] var2 = this.f19000;
      }

      if (this.f9000 == null) {
         this.f9000 = new Object[8];
         Object[] var3 = this.f9000;
      }
   }

   private static void m10000() {
      f10000 = new String[]{"desorientation", "Дезориентация", "desorientation", "trap", "Трапка"};
      f22000 = new String[]{"trap", "god-aura", "Божья аура", "godsaura", "sheer-dust", "Явная пыль", "sheerdust"};
      f17000 = new String[]{"stratum", "Пласт", "stratum", "snowball", "Снежок заморозка", "freezeball"};
      f20000 = new String[]{"fierytornado", "Огненный смерч", "fierytornado", "holy-water", "potion-holy-water", "rage"};
      f18000 = new String[]{"potion-rage", "paladin", "potion-paladin", "assassin", "potion-assassin", "drowsiness", "potion-drowsiness", "radiation"};
      f8000 = new String[]{"potion-radiation"};
   }

   private static void m12000() {
      f14000 = new float[]{0.0F};
   }

   private static void m14000() {
      f4000 = new short[]{0, 1, 2, 3, 0, 1, 2, 3};
      f7000 = new short[]{4, 5, 0, 1, 2, 0, 1};
      f11000 = new short[]{2, 3, 0, 1, 2, 3, 4};
      f15000 = new short[]{5, 0, 1};
      f21000 = new short[]{2, 3, 4};
      f6000 = new short[]{4, 5, 6, 7};
      f1000 = new short[]{3, 6, 5, 7};
      f5000 = new short[]{7, 5, 5, 4, 4, 0, 5};
      f2000 = new short[]{3, 7};
   }

   public void m48000(Iface0606 var1) {
      this.m8000();
      ((OlpkOimtk)this.f9000[7]).m42000(var1);
   }

   @Iface0642
   public void m50000(C0719 var1) {
      this.m8000();
      ((OlpkOimtk)this.f9000[7]).m38000(C0160.m24000() ? 2 : 0);
      ((OlpkOimtk)this.f9000[7]).m34000(var1);
   }

   @Iface0642
   public void m52000(C0721 var1) {
      this.m8000();
      ((C0130)this.f9000[5]).m32000();
   }

   @Iface0642
   public void m54000(C0704 var1) {
      this.m8000();
      List var2 = ((OlikIm)this.f9000[4]).m14000();
      if (!var2.isEmpty()) {
         Iterator var3 = var2.iterator();
         ZwBs var4 = C0002.m24000();

         while (var3.hasNext()) {
            Rec0228 var5 = (Rec0228)var3.next();
            int var6 = var5.m8000();
            int var7 = NursultanClient.m74000().m10000();
            int var8 = var6 - var7;
            if (var8 < -10) {
               var3.remove();
            } else {
               NXi var9 = ((NNNYO)((NNuU)this.y[0]).i[5]).s().y();
               Vector3d var10 = var5.m10000().sub(var9.M, var9.B, var9.Z, new Vector3d());
               Vector2f var11 = IlkOns.m72000((float)var10.x, (float)var10.y, (float)var10.z);
               if (var11 != null) {
                  var11 = var11.round();
                  int var12 = var5.m6000().m2000();
                  float var13 = var12 <= 0 ? f14000[0] : (float)Math.max(var8, 0) / var12;
                  IlkOns.m80000(var4, ((C0805)C0814.f15000[3]).m18000(), var5.m6000().m4000(), 16, var11.x, var11.y, var5.m2000(), var8, var13);
               }
            }
         }
      }
   }

   @Iface0642
   public void m58000(C0151 var1) {
      this.m8000();
      ((C0130)this.f9000[5]).m22000();
      ((OlikIm)this.f9000[4]).m10000();
   }

   @Iface0642
   public void m60000(AutoAccept var1) {
      this.m8000();
      ((Automatic)this.f9000[6]).m22000(var1);
      ((C0130)this.f9000[5]).m36000(var1);
   }

   @Iface0642(
      u = true
   )
   public void m62000(OlpnniIl var1) {
      this.m8000();
      ((List)this.f9000[3]).forEach(var1x -> ((C0127)var1x).y(var1));
   }
}
