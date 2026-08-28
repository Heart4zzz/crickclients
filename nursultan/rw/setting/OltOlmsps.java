package rw.setting;

import rw.api.Iface0597;
import rw.core.C0806;
import rw.core.C0830;
import rw.core.IlpOkkIjl;
import rw.gui.EspMix;

public class OltOlmsps implements Iface0597<IlpOkkIjl> {
   private static short[] f1000;
   public static Object[] f2000;
   private static float[] f3000;
   private static String[] f4000;
   public Object[] f5000;
   private static short[] f6000;
   private static short[] f7000;
   private static byte[] f8000;
   private static short[] f9000;

   private static void m8000() {
      f2000 = new Object[]{null, null, 0};
   }

   public OltOlmsps(C0830 var1, float[] var2) {
      this.m16000();
      this.f5000[0] = var1;
      Float var9 = var2[0];
      this.f5000[1] = var9;
      Float var10 = var2[1];
      this.f5000[2] = var10;
      int var3 = this.f5000[1] != f3000[0] ? 1 : 0;
      C0001 var11 = new C0001(var1, (OlpOtr)EspMix.f49000[3], true, true, f4000[0]);
      this.f5000[3] = var11;
      C0001 var12 = new C0001(var1, var3 != 0 ? (OlpOtr)EspMix.f49000[4] : (OlpOtr)EspMix.f49000[5], false, false, null);
      this.f5000[f9000[0]] = var12;
      C0001 var13 = new C0001(var1, var3 != 0 ? (OlpOtr)EspMix.f49000[f9000[1]] : (OlpOtr)EspMix.f35000[f9000[2]], false, false, null);
      this.f5000[f9000[3]] = var13;
      C0001 var14 = new C0001(var1, var3 != 0 ? (OlpOtr)EspMix.f35000[1] : (OlpOtr)EspMix.f35000[2], false, false, null);
      this.f5000[6] = var14;
   }

   static {
      ntfClinit();
   }

   private static void m12000() {
      f4000 = new String[]{"weights"};
   }

   private void m16000() {
      if (this.f5000 == null) {
         this.f5000 = new Object[7];
         Object[] var1 = this.f5000;
         var1[1] = f3000[5];
         var1[2] = f3000[6];
      }
   }

   private static void m22000() {
      f3000 = new float[]{0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F};
   }

   public static OltOlmsps m24000(C0830 var0, float[] var1) {
      return new OltOlmsps(var0, var1);
   }

   public void m26000(IlpOkkIjl var1) {
      C0806.m32000(
         (C0830)this.f5000[0], var1.m20000(), var1.m70000(), var1.m18000(), var1.m26000(), var1.m44000(), var1.m6000(), var1.m38000(), var1.m10000(), -1
      );
      this.m28000(var1.m62000()).m26000(var1, (Float)this.f5000[1], (Float)this.f5000[2]);
   }

   private C0001 m28000(int var1) {
      return switch (var1) {
         case 5 -> (C0001)this.f5000[4];
         case 10 -> (C0001)this.f5000[5];
         case 15 -> (C0001)this.f5000[6];
         default -> (C0001)this.f5000[3];
      };
   }

   private static void m30000() {
      f1000 = new short[]{0, 1, 2, 1, 3, 3, 4, 5};
      f9000 = new short[]{4, 6, 0, 5};
      f6000 = new short[]{1, 2, 6, 0, 1, 2, 4};
      f7000 = new short[]{5, 6, 3};
   }

   private static void m36000() {
      f8000 = new byte[]{-1, 2, 2, 7, 2, 3, 2};
   }
}
