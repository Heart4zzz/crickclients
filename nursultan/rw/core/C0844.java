package rw.core;

import rw.api.Iface0597;
import rw.gui.EspMix;
import rw.setting.OlpOtr;

public class C0844 implements Iface0597<C0856> {
   private static short[] f1000;
   private static float[] f2000;
   private static boolean[] f3000;
   private static short[] f4000;
   private static String[] f5000;
   private static byte[] f6000;
   public Object[] f7000;

   private static void m6000() {
      byte[] var128 = new byte[3];
      f6000[(0 | -0) >>> 31] = 4;
      f6000[(1 | -1) >>> 31] = -1;
      f6000[2] = 5;
   }

   public C0844(C0830 var1) {
      this.m34000();
      OlssInijr var6 = ((OlpOtr)EspMix.f5000[f4000[0]]).m66000(f5000[0]);
      this.f7000[f4000[1]] = var6;
      OlssInijr var7 = ((OlpOtr)EspMix.f5000[f4000[2]]).m66000(f5000[1]);
      this.f7000[f4000[3]] = var7;
      C1228 var8 = ((OlpOtr)EspMix.f5000[f4000[4]]).m6000(f5000[2]);
      this.f7000[f4000[5]] = var8;
      this.f7000[f4000[6]] = var1;
      C0805 var10 = C0805.m30000()
         .m16000(C0825.m2000().m22000((C1246)C1234.f1000[f1000[0]]).m16000((OlpOtr)EspMix.f5000[f1000[1]]).m18000(f6000[0]).m20000())
         .m22000(var1)
         .m20000();
      this.f7000[f1000[2]] = var10;
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      short[] var128 = new short[7];
      f4000[(0 | -0) >>> 31] = 3;
      f4000[(1 | -1) >>> 31] = 2;
      f4000[2] = 3;
      f4000[3] = 3;
      f4000[4] = 3;
      f4000[5] = 4;
      f4000[6] = (short)((0 | -0) >>> 31);
      short[] var129 = new short[8];
      f1000[(0 | -0) >>> 31] = 3;
      f1000[(1 | -1) >>> 31] = 3;
      f1000[2] = (short)((1 | -1) >>> 31);
      f1000[3] = (short)((0 | -0) >>> 31);
      f1000[4] = (short)((1 | -1) >>> 31);
      f1000[5] = 2;
      f1000[6] = 3;
      f1000[7] = 4;
   }

   private static void m14000() {
      f5000 = new String[3];
      f5000[(0 | -0) >>> 31] = "u_projection";
      f5000[(1 | -1) >>> 31] = "u_view";
      f5000[2] = "textureIn";
   }

   private static void m18000() {
      float[] var128 = new float[3];
      f2000[(0 | -0) >>> 31] = Float.intBitsToFloat(0);
      f2000[(1 | -1) >>> 31] = Float.intBitsToFloat(0);
      f2000[2] = Float.intBitsToFloat(0);
   }

   public void m30000(C0856 var1) {
      C0806.m54000((C0830)this.f7000[f1000[3]], f2000[0], f2000[1], f2000[2], var1.m16000(), var1.m20000(), f6000[1]);
      ((C0805)this.f7000[f1000[4]]).m32000(var2 -> {
         ((OlssInijr)this.f7000[f1000[5]]).m18000(var1.m26000());
         ((OlssInijr)this.f7000[f1000[6]]).m18000(var1.m42000());
         ((C1228)this.f7000[f1000[7]]).m20000(f3000[0]);
      });
   }

   private static void m32000() {
      boolean[] var128 = new boolean[(1 | -1) >>> 31];
      f3000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
   }

   private void m34000() {
      if (this.f7000 == null) {
         this.f7000 = new Object[f6000[2]];
         Object[] var1 = this.f7000;
      }
   }
}
