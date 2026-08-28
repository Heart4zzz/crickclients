package rw.setting;

import java.util.function.DoubleSupplier;
import rw.api.Iface0597;
import rw.core.C0805;
import rw.core.C0806;
import rw.core.C0821;
import rw.core.C0825;
import rw.core.C0830;
import rw.core.C0856;
import rw.core.C1228;
import rw.core.C1234;
import rw.core.C1246;
import rw.core.OlssInijr;
import rw.gui.EspMix;

public class C0100 implements Iface0597<C0856> {
   private static short[] f1000;
   private static short[] f2000;
   private static short[] f3000;
   public Object[] f4000;
   private static short[] f5000;
   private static byte[] f6000;
   private static short[] f7000;
   private static boolean[] f8000;
   public Object[] f9000;
   private static float[] f10000;
   private static String[] f11000;

   private static void m6000() {
      short[] var128 = new short[4];
      f5000[(0 | -0) >>> 31] = 5;
      f5000[(1 | -1) >>> 31] = 3;
      f5000[2] = 5;
      f5000[3] = 4;
      short[] var129 = new short[5];
      f3000[(0 | -0) >>> 31] = 5;
      f3000[(1 | -1) >>> 31] = 5;
      f3000[2] = 5;
      f3000[3] = 6;
      f3000[4] = 5;
      short[] var130 = new short[6];
      f2000[(0 | -0) >>> 31] = 7;
      f2000[(1 | -1) >>> 31] = 5;
      f2000[2] = (short)((0 | -0) >>> 31);
      f2000[3] = (short)((0 | -0) >>> 31);
      f2000[4] = (short)((1 | -1) >>> 31);
      f2000[5] = (short)((0 | -0) >>> 31);
      short[] var131 = new short[8];
      f1000[(0 | -0) >>> 31] = 5;
      f1000[(1 | -1) >>> 31] = 2;
      f1000[2] = (short)((0 | -0) >>> 31);
      f1000[3] = 2;
      f1000[4] = 3;
      f1000[5] = 4;
      f1000[6] = 5;
      f1000[7] = 6;
      short[] var132 = new short[3];
      f7000[(0 | -0) >>> 31] = 7;
      f7000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f7000[2] = (short)((1 | -1) >>> 31);
   }

   public C0100(C0830 var1, DoubleSupplier var2) {
      this.m24000();
      OlssInijr var7 = ((OlpOtr)EspMix.f5000[f5000[0]]).m66000(f11000[0]);
      this.f4000[f5000[1]] = var7;
      OlssInijr var8 = ((OlpOtr)EspMix.f5000[f5000[2]]).m66000(f11000[1]);
      this.f4000[f5000[3]] = var8;
      C1228 var9 = ((OlpOtr)EspMix.f5000[f3000[0]]).m6000(f11000[2]);
      this.f4000[f3000[1]] = var9;
      C1228 var10 = ((OlpOtr)EspMix.f5000[f3000[2]]).m6000(f11000[3]);
      this.f4000[f3000[3]] = var10;
      C0821 var11 = ((OlpOtr)EspMix.f5000[f3000[4]]).m32000(f11000[4]);
      this.f4000[f2000[0]] = var11;
      C0821 var12 = ((OlpOtr)EspMix.f5000[f2000[1]]).m32000(f11000[5]);
      this.f9000[f2000[2]] = var12;
      this.f4000[f2000[3]] = var1;
      this.f4000[f2000[4]] = var2;
      C0805 var15 = C0805.m30000()
         .m16000(C0825.m2000().m22000((C1246)C1234.f1000[f2000[5]]).m16000((OlpOtr)EspMix.f5000[f1000[0]]).m18000(f6000[0]).m20000())
         .m22000(var1)
         .m20000();
      this.f4000[f1000[1]] = var15;
   }

   static {
      ntfClinit();
   }

   private static void m12000() {
      boolean[] var128 = new boolean[2];
      f8000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f8000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
   }

   private static void m20000() {
      float[] var128 = new float[3];
      f10000[(0 | -0) >>> 31] = Float.intBitsToFloat(0);
      f10000[(1 | -1) >>> 31] = Float.intBitsToFloat(0);
      f10000[2] = Float.intBitsToFloat(0);
   }

   private void m24000() {
      if (this.f4000 == null) {
         this.f4000 = new Object[f6000[2]];
         Object[] var1 = this.f4000;
      }

      if (this.f9000 == null) {
         this.f9000 = new Object[f8000[1]];
         Object[] var2 = this.f9000;
      }
   }

   private static void m30000() {
      byte[] var128 = new byte[3];
      f6000[(0 | -0) >>> 31] = 4;
      f6000[(1 | -1) >>> 31] = 6;
      f6000[2] = 8;
   }

   public void m32000(C0856 var1) {
      C0806.m54000((C0830)this.f4000[f1000[2]], f10000[0], f10000[1], f10000[2], var1.m16000(), var1.m20000(), var1.m52000());
      ((C0805)this.f4000[f1000[3]]).m32000(var2 -> {
         ((OlssInijr)this.f4000[f1000[4]]).m18000(var1.m26000());
         ((OlssInijr)this.f4000[f1000[5]]).m18000(var1.m42000());
         ((C1228)this.f4000[f1000[6]]).m20000(f6000[1]);
         ((C1228)this.f4000[f1000[7]]).m20000(f8000[0]);
         ((C0821)this.f4000[f7000[0]]).m20000(var1.m14000());
         ((C0821)this.f9000[f7000[1]]).m20000((float)((DoubleSupplier)this.f4000[f7000[2]]).getAsDouble());
      });
   }

   private static void m38000() {
      f11000 = new String[6];
      f11000[(0 | -0) >>> 31] = "u_projection";
      f11000[(1 | -1) >>> 31] = "u_view";
      f11000[2] = "texture_in";
      f11000[3] = "texture_jf";
      f11000[4] = "radius";
      f11000[5] = "time";
   }
}
