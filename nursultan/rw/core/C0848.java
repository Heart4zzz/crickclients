package rw.core;

import rw.api.Iface0597;
import rw.gui.EspMix;
import rw.setting.OlpOtr;

public class C0848 implements Iface0597<C0856> {
   private static short[] f1000;
   private static short[] f2000;
   private static short[] f3000;
   private static short[] f4000;
   private static float[] f5000;
   public Object[] f6000;
   private static short[] f7000;
   private static byte[] f8000;
   private static String[] f9000;
   private static boolean[] f10000;

   private void m4000() {
      if (this.f6000 == null) {
         this.f6000 = new Object[f8000[2]];
         Object[] var1 = this.f6000;
         var1[f10000[1]] = Integer.valueOf(f10000[2]);
      }
   }

   public C0848(C0830 var1, int var2) {
      this.m4000();
      OlssInijr var7 = ((OlpOtr)EspMix.f5000[f2000[0]]).m66000(f9000[0]);
      this.f6000[f2000[1]] = var7;
      OlssInijr var8 = ((OlpOtr)EspMix.f5000[f2000[2]]).m66000(f9000[1]);
      this.f6000[f1000[0]] = var8;
      C1228 var9 = ((OlpOtr)EspMix.f5000[f1000[1]]).m6000(f9000[2]);
      this.f6000[f1000[2]] = var9;
      C1223 var10 = ((OlpOtr)EspMix.f5000[f1000[3]]).m106000(f9000[3]);
      this.f6000[f1000[4]] = var10;
      this.f6000[f1000[5]] = var1;
      Integer var12 = var2;
      this.f6000[f7000[0]] = var12;
      C0805 var13 = C0805.m30000()
         .m16000(C0825.m2000().m22000((C1246)C1234.f1000[f7000[1]]).m16000((OlpOtr)EspMix.f5000[f4000[0]]).m18000(f8000[0]).m20000())
         .m22000(var1)
         .m20000();
      this.f6000[f4000[1]] = var13;
   }

   static {
      ntfClinit();
   }

   private static void m10000() {
      byte[] var128 = new byte[3];
      f8000[(0 | -0) >>> 31] = 4;
      f8000[(1 | -1) >>> 31] = -1;
      f8000[2] = 7;
   }

   private static void m16000() {
      float[] var128 = new float[3];
      f5000[(0 | -0) >>> 31] = Float.intBitsToFloat(0);
      f5000[(1 | -1) >>> 31] = Float.intBitsToFloat(0);
      f5000[2] = Float.intBitsToFloat(0);
   }

   private static void m20000() {
      f9000 = new String[4];
      f9000[(0 | -0) >>> 31] = "u_projection";
      f9000[(1 | -1) >>> 31] = "u_view";
      f9000[2] = "textureIn";
      f9000[3] = "texelSize";
   }

   private static void m26000() {
      boolean[] var128 = new boolean[3];
      f10000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f10000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f10000[2] = (boolean)((0 | -0) >>> 31);
   }

   public void m34000(C0856 var1) {
      C0806.m54000((C0830)this.f6000[f4000[2]], f5000[0], f5000[1], f5000[2], var1.m16000(), var1.m20000(), f8000[1]);
      ((C0805)this.f6000[f4000[3]])
         .m32000(
            var2 -> {
               ((OlssInijr)this.f6000[f3000[0]]).m18000(var1.m26000());
               ((OlssInijr)this.f6000[f3000[1]]).m18000(var1.m42000());
               ((C1228)this.f6000[f3000[2]]).m20000(f10000[0]);
               ((C1223)this.f6000[f3000[3]])
                  .m18000(((Integer)this.f6000[f3000[4]]).intValue() / var1.m28000(), ((Integer)this.f6000[f3000[5]]).intValue() / var1.m36000());
            }
         );
   }

   private static void m36000() {
      short[] var128 = new short[3];
      f2000[(0 | -0) >>> 31] = 4;
      f2000[(1 | -1) >>> 31] = 3;
      f2000[2] = 4;
      short[] var129 = new short[6];
      f1000[(0 | -0) >>> 31] = 4;
      f1000[(1 | -1) >>> 31] = 4;
      f1000[2] = 5;
      f1000[3] = 4;
      f1000[4] = 6;
      f1000[5] = (short)((0 | -0) >>> 31);
      short[] var130 = new short[2];
      f7000[(0 | -0) >>> 31] = (short)((1 | -1) >>> 31);
      f7000[(1 | -1) >>> 31] = 3;
      short[] var131 = new short[4];
      f4000[(0 | -0) >>> 31] = 4;
      f4000[(1 | -1) >>> 31] = 2;
      f4000[2] = (short)((0 | -0) >>> 31);
      f4000[3] = 2;
      short[] var132 = new short[6];
      f3000[(0 | -0) >>> 31] = 3;
      f3000[(1 | -1) >>> 31] = 4;
      f3000[2] = 5;
      f3000[3] = 6;
      f3000[4] = (short)((1 | -1) >>> 31);
      f3000[5] = (short)((1 | -1) >>> 31);
   }
}
