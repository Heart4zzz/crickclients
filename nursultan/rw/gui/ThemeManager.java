package rw.gui;

import KDFzREm.NAN;
import KDFzREm.NAd;
import KDFzREm.NFA;
import KDFzREm.NNYH;
import KDFzREm.NNuU;
import KDFzREm.NNuo;
import KDFzREm.NNyx;
import KDFzREm.NlQ;
import KDFzREm.NlT;
import KDFzREm.ow;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Duration;
import org.joml.Vector2i;
import rw.NursultanClient;
import rw.api.Iface0006;
import rw.api.Iface0197;
import rw.api.Iface0209;
import rw.api.Iface0211;
import rw.api.Iface0212;
import rw.api.Iface0642;
import rw.api.Iface0659;
import rw.core.C0012;
import rw.core.C0076;
import rw.core.C0077;
import rw.core.C0082;
import rw.core.C0086;
import rw.core.C0090;
import rw.core.C0287;
import rw.core.C0288;
import rw.core.C0297;
import rw.core.C0346;
import rw.core.C0712;
import rw.core.C0717;
import rw.core.C0881;
import rw.core.C0925;
import rw.core.C1041;
import rw.core.C1108;
import rw.core.C1114;
import rw.core.C1117;
import rw.core.C1182;
import rw.core.C1197;
import rw.core.KrHa;
import rw.core.OlIrtqjti;
import rw.data.Rec0089;
import rw.data.Rec0090;
import rw.data.Rec0092;
import rw.data.Rec0097;
import rw.data.Rec0102;
import rw.defs.Enum0047;
import rw.defs.Enum0072;
import rw.defs.Enum0081;
import rw.defs.Enum0089;
import rw.defs.OlmmOsl;
import rw.module.IlmpqOjIi;
import rw.module.Module039;
import rw.module.OlirIm;
import rw.setting.C0034;
import rw.setting.C0035;
import rw.setting.C0039;
import rw.setting.C0056;
import rw.setting.C0106;

public class ThemeManager {
   private static short[] f1000;
   private static short[] f2000;
   private static short[] f3000;
   private static short[] f4000;
   private static float[] f5000;
   private static float[] f6000;
   public Object[] f7000;
   private static short[] f8000;
   private static short[] f9000;
   private static short[] f10000;
   public static Object[] f11000;
   private static short[] f12000;
   public Object[] f13000;
   private static float[] f14000;
   private static short[] f15000;
   private static short[] f16000;
   private static float[] f17000;
   private static short[] f18000;
   private static short[] f19000;
   private static short[] f20000;
   public static Object[] f21000;
   private static float[] f22000;
   private static short[] f23000;
   private static short[] f24000;
   private static String[] f25000;
   private static short[] f26000;
   private static short[] f27000;
   private static short[] f28000;
   private static double[] f29000;

   public static float m4000() {
      return ((C0013)NursultanClient.m2000().f7000[6]).m6000().m4000();
   }

   private boolean m6000(rw.module.Huddumped var1) {
      Iface0212 var2 = ((C0013)this.f7000[6]).m4000().m4000();
      if (var2 != null && var2.m28000() == Enum0047.f3000) {
         int var3 = var1.m30000();
         if (var3 != 256 && var3 != 257 && var3 != 335) {
            return (boolean)0;
         } else {
            boolean var4 = var1.m8000();
            ((C0013)this.f7000[6]).m4000().m22000(var1.m30000(), (boolean)(!var1.m18000() && !var4 ? 0 : 1), C0881.m18000(var1.m58000()), var4);
            ((C0013)this.f7000[6]).m4000().m28000();
            return (boolean)1;
         }
      } else {
         return (boolean)0;
      }
   }

   private static void m14000() {
      f1000 = new short[]{0, 1, 0, 2, 3};
      f4000 = new short[]{4, 6, 6};
      f8000 = new short[]{6, 7, 7, 5, 6, 5, 4, 0};
      f20000 = new short[]{5, 2, 2, 0, 2, 0, 2};
      f9000 = new short[]{2, 2, 5, 6, 0, 1, 4, 3};
      f19000 = new short[]{3, 4, 0, 5, 3};
      f24000 = new short[]{1, 0, 4, 3};
      f18000 = new short[]{3, 4, 0, 5, 0, 6, 0, 6};
      f10000 = new short[]{1, 0, 0, 6, 256};
      f23000 = new short[]{257, 335, 6, 6};
      f15000 = new short[]{3, 295, 5};
      f2000 = new short[]{6, 3, 7, 7, 7, 6, 0};
      f27000 = new short[]{0, 0, 2, 7, 7, 2};
      f28000 = new short[]{0, 2, 0, 4, 5, 6, 0, 2};
      f16000 = new short[]{2, 0, 4, 0};
      f26000 = new short[]{3, 0, 2, 0, 2, 0, 2, 6};
      f12000 = new short[]{0, 0, 6, 1, 1, 6, 6, 6};
      f3000 = new short[]{5, 6, 1, 2, 0, 0, 240, 1100};
   }

   private void m16000() {
      Vector2i var1 = C0881.m20000(((NNuo)((NNuU)this.f7000[0]).L[2]).i(), ((NNuo)((NNuU)this.f7000[0]).L[2]).R());
      ((C0013)this.f7000[6]).m4000().m18000(var1.x(), var1.y());
   }

   public ThemeManager() {
      this.m36000();
      NNuU var7 = NNuU.Nq();
      this.f7000[0] = var7;
      C0012 var8 = KrHa.m18000(() -> Math.max(1, ((NNuU)this.f7000[f3000[5]]).Nt().U()), () -> Math.max(1, ((NNuU)this.f7000[f3000[4]]).Nt().E()));
      this.f7000[1] = var8;
      C1197 var9 = new C1197((Enum0089)Enum0089.f1000[0]);
      this.f7000[2] = var9;
      C0086 var10 = new C0086();
      this.f7000[3] = var10;
      C1117 var1 = NursultanClient.m112000();
      var1.m22000(f25000[0], f25000[1]);
      PdYp var11 = new PdYp(var1);
      this.f7000[4] = var11;
      C1108 var2 = new C1108();
      C0013 var12 = new C0013(new C1041(), var2, new C1114(var2));
      this.f7000[6] = var12;
      var2.m32000(((C0013)this.f7000[6]).m6000());
      C0035 var13 = new C0035((C0013)this.f7000[6]);
      this.f7000[7] = var13;
      C0039 var14 = C0039.m16000(
         (C0035)this.f7000[7],
         f25000[2],
         (var0, var1x) -> {
            int var2x = var1x.m2000(f25000[4], C0077::m22000);
            return var1x.m30000(
               (C0297<OlIrtqjti>)OlIrtqjti.f4000[f3000[1]],
               OlIrtqjti.m40000(var2x),
               () -> ((C0288)C0287.m14000().N((C0056)C0076.f5000[f3000[2]]))
                  .N(new Object[]{var1x.m18000(f25000[5], (Iface0197)rw.setting.C0008.f16000[f3000[3]], null)})
            );
         },
         null
      );
      this.f7000[5] = var14;
      ((C0013)this.f7000[6]).m4000().m16000(((C0039)this.f7000[5]).m18000().m20000());
      NursultanClient.m8000().m32000(this);
      this.m56000();
   }

   static {
      ntfClinit();
   }

   private void m18000() {
      boolean var1 = this.m48000();
      if ((Boolean)this.f13000[1] != var1) {
         Boolean var6 = var1;
         this.f13000[1] = var6;
         if (var1) {
            NNyx.y();
         } else {
            NNyx.N();
         }
      }
   }

   private boolean m26000(rw.module.Huddumped var1) {
      Rec0102 var2 = C0881.m18000(var1.m58000());
      boolean var3 = NlT.m() == NlQ.field_1137 ? var2.m6000() : var2.m10000();
      if (!var3) {
         return (boolean)0;
      } else {
         int var4 = var1.m30000();
         if (var4 >= 49 && var4 <= 57) {
            rw.setting.C0008.m74000(var4 - 49);
            return (boolean)1;
         } else {
            if ((Boolean)NursultanClient.f13000[3] && var4 == 295) {
               try {
                  Rec0090 var5 = ((C0039)this.f7000[5]).m18000().m24000(Rec0092.m10000().m12000(true));
                  String var6 = C0034.m8000(var5);
                  Path var7 = Path.of("ui_dump_" + System.currentTimeMillis() + ".json");
                  Files.writeString(var7, var6, StandardCharsets.UTF_8);
                  NAd var8 = NAd.N.N(new NFA(var7.toAbsolutePath().toString()));
                  C0106.m42000(NAN.y(f25000[3]).y(NAN.y(var7.getFileName().toString()).L(var8)));
               } catch (Exception var9) {
               }
            }

            if (var4 == 70) {
               Iface0212 var10 = C0090.m144000();
               if (var10 != null) {
                  Iface0209 var11 = ((C0013)this.f7000[6]).m4000();
                  if (var11.m4000() == var10) {
                     var11.m28000();
                  } else {
                     var11.m2000(var10);
                  }
               }

               return (boolean)1;
            } else if (var4 == 44) {
               rw.setting.C0008.m2000();
               return (boolean)1;
            } else {
               return (boolean)0;
            }
         }
      }
   }

   public static boolean m28000() {
      ThemeManager var0 = NursultanClient.m2000();
      return (boolean)(var0 != null && var0.f13000[0] ? 1 : 0);
   }

   private void m36000() {
      if (this.f7000 == null) {
         this.f7000 = new Object[8];
         Object[] var1 = this.f7000;
      }

      if (this.f13000 == null) {
         this.f13000 = new Object[3];
         Object[] var2 = this.f13000;
         var2[0] = false;
         var2[1] = false;
         var2[2] = 0L;
      }
   }

   private void m42000() {
      ((C0013)this.f7000[6]).m4000().m26000(0, (boolean)0);
      Boolean var5 = false;
      this.f13000[0] = var5;
      Long var6 = 0L;
      this.f13000[2] = var6;
      ((C1197)this.f7000[2]).m48000(f29000[1], (Duration)f11000[0], (Iface0659)C1182.f30000[4]);
      if ((NNYH)((NNuU)this.f7000[0]).v[3] == null) {
         ((NNuo)((NNuU)this.f7000[0]).L[2]).Z();
      }
   }

   private static void m44000() {
      f29000 = new double[]{1.0, 0.0};
   }

   private static void m46000() {
      f5000 = new float[]{1.0F, 0.0F, 0.0F, 1.0E9F, 0.999F, 300.0F, 300.0F};
      f17000 = new float[]{32.0F, 4.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.5F};
      f6000 = new float[]{0.85F, 0.95F};
      f22000 = new float[]{0.9F, 300.0F, 300.0F, 32.0F, 4.0F, 240.0F, 1100.0F, 16.0F};
      f14000 = new float[]{4.0F, 0.85F, 0.95F, 0.9F};
   }

   private boolean m48000() {
      if (!(Boolean)this.f13000[0]) {
         return (boolean)0;
      } else {
         Iface0212 var1 = ((C0013)this.f7000[6]).m4000().m4000();
         return (boolean)(var1 != null && var1.m28000() == Enum0047.f3000 ? 1 : 0);
      }
   }

   private void m50000() {
      ((C0035)this.f7000[7]).m26000(((C0035)this.f7000[7]).m14000().m18000(f22000[5]).m20000(new Rec0097(true, f22000[6], f22000[7], f14000[0])));
      Long var5 = 0L;
      this.f13000[2] = var5;
      Boolean var6 = true;
      this.f13000[0] = var6;
      ((C1197)this.f7000[2]).m48000(f29000[0], (Duration)f11000[0], (Iface0659)C1182.f30000[4]);
      ((C0039)this.f7000[5]).m8000();
   }

   private boolean m52000(int var1) {
      return (boolean)(switch (var1) {
         case 256 -> {
            this.m42000();
            yield 1;
         }
         case 301 -> {
            if (!(Boolean)NursultanClient.f13000[3]) {
               yield 0;
            } else {
               this.m104000();
               yield 1;
            }
         }
         default -> 0;
      });
   }

   public void m56000() {
      ZwBs var1 = C0002.m24000();

      for (OlmmOsl var5 : (OlmmOsl[])f11000[4]) {
         var1.m76000(f5000[0], var5, (boolean)0);
      }

      var1.m46000();
   }

   private void m58000(rw.module.Huddumped var1) {
      Iface0209 var2 = ((C0013)this.f7000[6]).m4000();
      switch (((int[])C0082.f1000[0])[var1.m20000().ordinal()]) {
         case 1:
            this.m16000();
            if (var1.m18000()) {
               var2.m26000(var1.m30000(), (boolean)1);
            } else if (var1.m10000()) {
               var2.m26000(var1.m30000(), (boolean)0);
            }

            var1.N();
            break;
         case 2:
            boolean var3 = var1.m8000();
            var2.m22000(var1.m30000(), (boolean)(!var1.m18000() && !var3 ? 0 : 1), C0881.m18000(var1.m58000()), var3);
            if (m62000()) {
               var1.N();
            }
      }
   }

   public static boolean m62000() {
      ThemeManager var0 = NursultanClient.m2000();
      return (boolean)(var0 == null ? 0 : var0.m48000());
   }

   private boolean m66000(rw.module.Huddumped var1) {
      if (!(Boolean)this.f13000[0]) {
         return (boolean)0;
      } else if (!var1.m18000()) {
         return (boolean)0;
      } else if (this.m6000(var1)) {
         var1.N();
         return (boolean)1;
      } else if (this.m26000(var1)) {
         var1.N();
         return (boolean)1;
      } else if (this.m52000(var1.m30000())) {
         var1.N();
         return (boolean)1;
      } else {
         return (boolean)0;
      }
   }

   private static void m72000() {
      f21000 = new Object[]{240, 1100, 16, 4};
      f11000 = new Object[]{null, 0.85F, 0.95F, 0.9F, null};
   }

   @Iface0642(
      y = Enum0081.BEFORE
   )
   public void m74000(rw.module.Huddumped var1) {
      if (!var1.y()) {
         if (!var1.m20000().m26000((Enum0072)Enum0072.f1000[1]) || !this.m66000(var1)) {
            if ((Boolean)this.f13000[0]) {
               this.m58000(var1);
            }
         }
      }
   }

   @Iface0642
   public void m78000(OlirIm var1) {
      if ((Boolean)this.f13000[0]) {
         ((C0013)this.f7000[6]).m4000().m14000(var1.m2000());
         var1.N();
      }
   }

   @Iface0642
   public void m80000(C0712 var1) {
      ((C0039)this.f7000[5]).m8000();
   }

   public static void m82000() {
      ThemeManager var0 = NursultanClient.m2000();
      if (var0 != null) {
         if ((Boolean)var0.f13000[0]) {
            var0.m42000();
         } else {
            ((NNuo)((NNuU)var0.f7000[0]).L[2]).z();
            var0.m50000();
         }
      }
   }

   @Iface0642
   public void m86000(IlmpqOjIi var1) {
      if ((Boolean)this.f13000[0]) {
         ((C0013)this.f7000[6]).m4000().m24000((float)var1.m4000());
         var1.N();
      }
   }

   public static void m88000(float var0) {
      ThemeManager var1 = NursultanClient.m2000();
      ((C0013)var1.f7000[6]).m6000().m6000(var0);
      ((C0039)var1.f7000[f3000[0]]).m8000();
   }

   public static float m90000(String var0, float var1, OlmmOsl var2) {
      return ((C0013)NursultanClient.m2000().f7000[6]).m8000().m6000(var0, var1, rw.setting.C0017.m24000(var2));
   }

   @Iface0642
   public void m92000(C0925 var1) {
      if ((Boolean)this.f13000[0]) {
         ((C0039)this.f7000[5]).m8000();
      }
   }

   @Iface0642
   public void m96000(Module039 var1) {
      if ((Boolean)this.f13000[0]) {
         var1.N();
      }
   }

   @Iface0642(
      y = Enum0081.AFTER_ALL
   )
   public void m102000(C0717 var1) {
      this.m18000();
      ((C1197)this.f7000[2]).m54000();
      float var2 = ((C1197)this.f7000[2]).m44000().floatValue();
      if ((Boolean)this.f13000[0] || ((C1197)this.f7000[2]).m6000()) {
         ow var3 = ((NNuU)this.f7000[0]).Nt();
         int var4 = Math.max(1, var3.U());
         int var5 = Math.max(1, var3.E());
         this.m16000();
         long var6 = System.nanoTime();
         float var8 = this.f13000[2] == 0L ? f5000[1] : Math.max(f5000[2], (float)(var6 - (Long)this.f13000[2]) / f5000[3]);
         Long var21 = var6;
         this.f13000[2] = var21;
         C0346 var9 = ((C0039)this.f7000[5]).m10000(var4, var5, var8);
         NursultanClient.m66000().m60000(var1.m16000());
         float var10 = ((C0013)this.f7000[6]).m6000().m4000();
         if (var2 < f5000[4]) {
            Iface0006 var11 = ((rw.core.C0013)rw.core.C0013.f2000[0]).m8000((C0012)this.f7000[1]);
            ((PdYp)this.f7000[4]).m206000(var1.m16000(), var9, var10, var11);
            if ((Boolean)NursultanClient.f13000[3]) {
               C0002.m16000()
                  .m86000(f5000[5], f5000[6])
                  .m102000(f17000[0])
                  .m50000(1677721600)
                  .m40000(f17000[1])
                  .m98000((OlmmOsl)OlmmOsl.f7000[3])
                  .m28000(-6305237)
                  .m62000("menu " + ((PdYp)this.f7000[4]).m12000())
                  .m4000();
            }

            IlkOns.m94000(((NNuU)this.f7000[0]).e(), (boolean)1);
            float var12 = var4 * f17000[2];
            float var13 = var5 * f17000[3];
            Iface0212 var14 = ((C0039)this.f7000[5]).m18000().m20000();
            Iface0212 var15 = rw.setting.C0008.m50000();
            if (var15 != null && var14.m18000().m12000() > f17000[4] && var14.m18000().m10000() > f17000[5]) {
               Iface0211 var16 = var15.m18000();
               var12 = (var16.m14000() + var16.m12000() * f17000[6]) / var14.m18000().m12000() * var4;
               var13 = (var16.m2000() + var16.m10000() * f17000[7]) / var14.m18000().m10000() * var5;
            }

            ((C0086)this.f7000[3]).m24000(((C0012)this.f7000[1]).m66000(), var4, var5, var12, var13, var2, f6000[0], f6000[1], f22000[0]);
         } else {
            IlkOns.m94000(((NNuU)this.f7000[0]).e(), (boolean)0);
            ((PdYp)this.f7000[4]).m144000(var1.m16000(), var9, var10);
            if ((Boolean)NursultanClient.f13000[3]) {
               C0002.m16000()
                  .m86000(f22000[1], f22000[2])
                  .m102000(f22000[3])
                  .m50000(1677721600)
                  .m40000(f22000[4])
                  .m98000((OlmmOsl)OlmmOsl.f7000[3])
                  .m28000(-6305237)
                  .m62000("menu " + ((PdYp)this.f7000[4]).m12000())
                  .m4000();
            }
         }
      }
   }

   private void m104000() {
      int var1 = !((C0035)this.f7000[7]).m14000().m6000() ? 1 : 0;
      ((C0035)this.f7000[7]).m26000(((C0035)this.f7000[7]).m14000().m22000((boolean)var1).m14000(var1 != 0 ? Rec0089.m2000() : Rec0089.f3000));
   }

   private static void m106000() {
      f25000 = new String[]{"menu", "icons/atlases/menu", "root", "Menu dumped ", "accent", "menu"};
   }
}
