package rw.defs;

import rw.data.Rec0066;
import rw.setting.C0056;

public enum IlinkjOs {
   private static float[] f1000;
   private static String[] f2000;
   private static short[] f3000;
   public static Object[] f4000;
   private static boolean[] f5000;
   private static byte[] f6000;
   public Object[] f7000;
   private static float[] f8000;
   private static short[] f9000;

   private static void m2000() {
      f2000 = new String[]{"LEFT", "CENTER", "RIGHT"};
   }

   private IlinkjOs(float var3) {
      this.m40000();
      Float var8 = var3;
      this.f7000[f9000[1]] = var8;
      C0056 var9 = var3 == f8000[0] ? C0056.f1000 : C0056.m130000().m144000(Rec0066.m12000(-var3 * f8000[1]));
      this.f7000[f9000[2]] = var9;
   }

   static {
      ntfClinit();
   }

   public static IlinkjOs[] m10000() {
      return (IlinkjOs[])((IlinkjOs[])f4000[f9000[0]]).clone();
   }

   private static void m12000() {
      f4000 = new Object[]{null, null, null, null};
   }

   private static void m14000() {
      f6000 = new byte[]{3, 2, 2, 2, 3, 2, 4};
   }

   private static void m16000() {
      f5000 = new boolean[]{false, true, false, false, true, true, false};
   }

   private static void m20000() {
      f8000 = new float[]{0.0F, 100.0F, 0.0F, 3.0F};
      f1000 = new float[]{2.0F, 3.0F, 0.0F, 0.5F, 1.0F, 0.0F};
   }

   private static void m24000() {
      f9000 = new short[]{3, 0, 1, 0, 1, 2, 0, 1};
      f3000 = new short[]{0, 1, 2};
   }

   public C0056 m28000() {
      return (C0056)this.f7000[f9000[7]];
   }

   public float m36000() {
      return (Float)this.f7000[f9000[6]];
   }

   public static IlinkjOs m38000(float var0, float var1) {
      if (!(var1 <= f8000[2]) && !(var0 < var1 / f8000[3])) {
         return var0 < var1 * f1000[0] / f1000[1] ? (IlinkjOs)f4000[f9000[4]] : (IlinkjOs)f4000[f9000[5]];
      } else {
         return (IlinkjOs)f4000[f9000[3]];
      }
   }

   private void m40000() {
      if (this.f7000 == null) {
         this.f7000 = new Object[f6000[5]];
         Object[] var1 = this.f7000;
         var1[f5000[6]] = f1000[5];
      }
   }
}
