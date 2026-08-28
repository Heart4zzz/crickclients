package rw.core;

import KDFzREm.NNBK;
import KDFzREm.NNBV;
import KDFzREm.NNag;
import KDFzREm.NNdF;
import KDFzREm.NNda;
import KDFzREm.NNdc;
import KDFzREm.NRV;
import KDFzREm.NRX;
import java.util.function.Consumer;
import rw.NursultanClient;

public class Iltonopij extends NNdc {
   private static short[] f1000;
   private static short[] f2000;
   private static short[] f3000;
   private static byte[] f4000;
   private static boolean[] f5000;
   public Object[] f6000;

   public int m2000() {
      this.m10000();
      return (Integer)this.f6000[f1000[6]];
   }

   public Iltonopij(int var1, int var2, int var3, int var4, NNag var5, NNda var6, NNdF var7, Consumer<NNdc> var8, Consumer<NNdc> var9) {
      super(var1, var2, var3, var4, var5, var6, var7);
      this.m10000();
      this.f6000[f3000[0]] = var8;
      this.f6000[f3000[1]] = var9;
      Integer var16 = Integer.valueOf(f5000[0]);
      this.f6000[f3000[2]] = var16;
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      short[] var128 = new short[4];
      f3000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f3000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      f3000[2] = 2;
      f3000[3] = 2;
      short[] var129 = new short[2];
      f2000[(0 | -0) >>> 31] = 2;
      f2000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      short[] var130 = new short[7];
      f1000[(0 | -0) >>> 31] = 2;
      f1000[(1 | -1) >>> 31] = 2;
      f1000[2] = 2;
      f1000[3] = (short)((0 | -0) >>> 31);
      f1000[4] = (short)((0 | -0) >>> 31);
      f1000[5] = (short)((1 | -1) >>> 31);
      f1000[6] = 2;
   }

   public Consumer<NNdc> m8000() {
      this.m10000();
      return (Consumer<NNdc>)this.f6000[f1000[5]];
   }

   private void m10000() {
      this.f6000 = new Object[f4000[2]];
      this.f6000[f4000[3]] = Integer.valueOf(f5000[2]);
   }

   private static void m12000() {
      boolean[] var128 = new boolean[3];
      f5000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f5000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f5000[2] = (boolean)((0 | -0) >>> 31);
   }

   public Consumer<NNdc> m18000() {
      this.m10000();
      return (Consumer<NNdc>)this.f6000[f1000[4]];
   }

   public void m24000() {
      this.m10000();
      if (this.field_22763) {
         if ((Integer)this.f6000[f1000[1]] != 0 && (Integer)this.f6000[f1000[2]] + f4000[1] < NursultanClient.m74000().m10000()) {
            ((Consumer)this.f6000[f1000[3]]).accept(this);
         }
      }
   }

   private static void m28000() {
      byte[] var128 = new byte[4];
      f4000[(0 | -0) >>> 31] = 2;
      f4000[(1 | -1) >>> 31] = 2;
      f4000[2] = 3;
      f4000[3] = 2;
   }

   public void method_25306(NRV var1) {
      this.m10000();
      super.method_25306(var1);
      Integer var6 = NursultanClient.m74000().m10000();
      this.f6000[f3000[3]] = var6;
   }

   public void method_75752(NNBK var1, int var2, int var3, float var4) {
      this.method_75794(var1);
      this.method_75793(var1.N(this, NNBV.field_63850));
   }

   public void method_25357(NRX var1) {
      this.m10000();
      super.method_25357(var1);
      if ((Integer)this.f6000[f2000[0]] + f4000[0] >= NursultanClient.m74000().m10000()) {
         ((Consumer)this.f6000[f2000[1]]).accept(this);
      }

      Integer var6 = Integer.valueOf(f5000[1]);
      this.f6000[f1000[0]] = var6;
   }
}
