package rw.core;

import rw.api.Iface0196;
import rw.api.Iface0202;
import rw.gui.DragOffset;
import rw.setting.C0031;

public class C1127 {
   public static Object[] f1000;
   private static boolean[] f2000;
   public Object[] f3000;
   private static float[] f4000;
   public static Object[] f5000;
   private static int[] f6000;
   private static float[] f7000;
   private static byte[] f8000;
   private static short[] f9000;
   private static float[] f10000;
   private static float[] f11000;
   private static double[] f12000;
   private static long[] f13000;
   private static byte[] f14000;
   private static byte[] f15000;
   private static short[] f16000;
   private static float[] f17000;
   private static byte[] f18000;
   private static boolean[] f19000;
   private static boolean[] f20000;
   private static boolean[] f21000;
   private static float[] f22000;

   private void m4000() {
      if (this.f3000 == null) {
         this.f3000 = new Object[f18000[2]];
         Object[] var1 = this.f3000;
         var1[f19000[0]] = f17000[0];
         var1[f19000[1]] = f17000[1];
         var1[f18000[3]] = f13000[1];
      }
   }

   private static void m8000() {
      f13000 = new long[]{0L, 0L};
   }

   public C1127(String var1) {
      this.m4000();
      Float var6 = (var1.hashCode() & f6000[0]) / f11000[0] * f11000[1];
      this.f3000[f16000[0]] = var6;
   }

   static {
      ntfClinit();
   }

   private static void m10000() {
      f16000 = new short[]{0, 6, 5, 2, 2, 2, 1};
      f9000 = new short[]{1, 1, 1, 1, 0, 1};
   }

   private static void m14000() {
      f11000 = new float[]{65535.0F, (float) (Math.PI * 2)};
      f7000 = new float[]{0.0F, 0.05F, 1.0E9F};
      f4000 = new float[]{1.0F, 0.0F, 1.0F, 9.0F};
      f10000 = new float[]{13.0F, 0.005F, 0.0F, 0.0F, 1.2F, 1.0F, 1.05F};
      f17000 = new float[]{0.0F, 0.0F};
      f22000 = new float[]{1.05F, 0.45F, 1.2F, 9.0F, 13.0F, 0.005F, 0.05F};
   }

   private static void m16000() {
      f20000 = new boolean[]{false, true, true, false, true};
      f21000 = new boolean[]{false, false};
      f2000 = new boolean[]{false, true, false, true};
      f19000 = new boolean[]{false, true, false, true, false, true};
   }

   private static void m20000() {
      f6000 = new int[]{65535};
   }

   private static void m24000() {
      f5000 = new Object[]{1.05F, 0.45F, 1.2F, 9.0F};
      f1000 = new Object[]{13.0F, 0.005F, 0.05F, Math.PI * 2, null, null, null};
   }

   private float m34000(boolean var1) {
      long var2 = System.nanoTime();
      float var4 = this.f3000[f16000[3]] == f13000[0] ? f7000[0] : Math.min(f7000[1], (float)(var2 - (Long)this.f3000[f16000[4]]) / f7000[2]);
      Long var12 = var2;
      this.f3000[f16000[5]] = var12;
      float var5 = var1 ? f4000[0] : f4000[1];
      Float var13 = (Float)this.f3000[f16000[6]] + (var5 - (Float)this.f3000[f9000[0]]) * Math.min(f4000[2], var4 * (var1 ? f4000[3] : f10000[0]));
      this.f3000[f9000[1]] = var13;
      if (!var1 && (Float)this.f3000[f9000[2]] < f10000[1]) {
         Float var14 = f10000[2];
         this.f3000[f9000[3]] = var14;
         return f10000[3];
      } else {
         double var6 = var2 / f12000[0] * f12000[1] + ((Float)this.f3000[f9000[4]]).floatValue();
         return (Float)this.f3000[f9000[5]] * f10000[4] * (float)Math.sin(var6);
      }
   }

   public C0031 m40000(Iface0202 var1, DragOffset var2, Iface0196<Boolean> var3, C0031 var4) {
      float var5 = var1.m2000(var2.m52000() + "Jiggle", () -> this.m34000(var2.m22000() && !Boolean.TRUE.equals(var3.m2000()) ? f20000[2] : f20000[3]));
      boolean var6 = Boolean.TRUE.equals(var3.m2000());
      rw.setting.C0056[] var10000 = new rw.setting.C0056[f8000[0]];
      var10000[f20000[0]] = var6 ? (rw.setting.C0056)f1000[f16000[1]] : (rw.setting.C0056)f1000[f16000[2]];
      var10000[f20000[1]] = rw.setting.C0056.m130000().m46000(var5);
      rw.setting.C0056 var7 = rw.setting.C0056.m120000(var10000);
      return C0287.m26000(var7, var2x -> {
         var2x.N(var2.m52000() + "Motion");
         var2x.y(var4);
      });
   }

   private static void m42000() {
      f12000 = new double[]{1.0E9, 13.96263438583813, Math.PI * 2};
   }

   private static void m44000() {
      f8000 = new byte[]{2, 4};
      f14000 = new byte[]{2, 4, 5, 2};
      f18000 = new byte[]{4, 6, 3, 2, 4, 2, 3, 7};
      f15000 = new byte[]{2, 3};
   }
}
