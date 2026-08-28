package rw.core;

import KDFzREm.NAd;
import KDFzREm.NNaI;
import java.util.ArrayList;
import java.util.List;
import rw.defs.Enum0027;
import rw.defs.OlmmOsl;
import rw.setting.C0031;

public class C1064 {
   private static boolean[] f1000;
   private static short[] f2000;
   private static int[] f3000;
   private static short[] f4000;
   private static short[] f5000;
   private static boolean[] f6000;
   private static byte[] f7000;
   private static short[] f8000;
   public Object[] f9000;

   private rw.setting.C0056 m2000() {
      OlmmOsl var1 = this.f9000[f4000[4]] && ((OlmmOsl)this.f9000[f4000[5]]).m46000() < ((OlmmOsl)OlmmOsl.f7000[f4000[6]]).m46000()
         ? (OlmmOsl)OlmmOsl.f7000[f2000[0]]
         : (OlmmOsl)this.f9000[f2000[1]];
      Enum0027 var2 = this.f9000[f2000[2]] ? Enum0027.f2000 : Enum0027.f1000;
      return rw.setting.C0017.m26000((Integer)this.f9000[f2000[3]], var1, var2).m40000((Integer)this.f9000[f2000[4]]);
   }

   private void m6000() {
      if (((StringBuilder)this.f9000[f4000[0]]).length() != 0) {
         ((List)this.f9000[f4000[1]]).add(C0287.m30000(((StringBuilder)this.f9000[f4000[2]]).toString(), this.m2000()));
         ((StringBuilder)this.f9000[f4000[3]]).setLength(f6000[4]);
      }
   }

   public C1064(int var1, OlmmOsl var2, int var3) {
      this.m10000();
      ArrayList var8 = new ArrayList();
      this.f9000[f8000[0]] = var8;
      StringBuilder var9 = new StringBuilder();
      this.f9000[f8000[1]] = var9;
      Integer var10 = var1;
      this.f9000[f8000[2]] = var10;
      this.f9000[f8000[3]] = var2;
      Integer var12 = var3;
      this.f9000[f8000[4]] = var12;
      Integer var13 = var3;
      this.f9000[f8000[5]] = var13;
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      short[] var128 = new short[8];
      f8000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f8000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      f8000[2] = 2;
      f8000[3] = 3;
      f8000[4] = 4;
      f8000[5] = 5;
      f8000[6] = (short)((1 | -1) >>> 31);
      f8000[7] = (short)((1 | -1) >>> 31);
      short[] var129 = new short[8];
      f5000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f5000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      f5000[2] = 5;
      f5000[3] = 6;
      f5000[4] = 7;
      f5000[5] = 5;
      f5000[6] = 6;
      f5000[7] = 7;
      short[] var130 = new short[7];
      f4000[(0 | -0) >>> 31] = (short)((1 | -1) >>> 31);
      f4000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f4000[2] = (short)((1 | -1) >>> 31);
      f4000[3] = (short)((1 | -1) >>> 31);
      f4000[4] = 6;
      f4000[5] = 3;
      f4000[6] = 6;
      short[] var131 = new short[7];
      f2000[(0 | -0) >>> 31] = 6;
      f2000[(1 | -1) >>> 31] = 3;
      f2000[2] = 7;
      f2000[3] = 2;
      f2000[4] = 5;
      f2000[5] = 4;
      f2000[6] = 4;
   }

   private void m10000() {
      if (this.f9000 == null) {
         this.f9000 = new Object[f7000[0]];
         Object[] var1 = this.f9000;
         var1[f7000[1]] = Integer.valueOf(f1000[0]);
         var1[f7000[2]] = Integer.valueOf(f1000[1]);
         var1[f7000[3]] = Integer.valueOf(f1000[2]);
         var1[f7000[4]] = f1000[3];
         var1[f7000[5]] = f1000[4];
      }
   }

   private static void m14000() {
      byte[] var128 = new byte[6];
      f7000[(0 | -0) >>> 31] = 8;
      f7000[(1 | -1) >>> 31] = 2;
      f7000[2] = 4;
      f7000[3] = 5;
      f7000[4] = 6;
      f7000[5] = 7;
   }

   private static void m16000() {
      boolean[] var128 = new boolean[5];
      f6000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f6000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f6000[2] = (boolean)((1 | -1) >>> 31);
      f6000[3] = (boolean)((0 | -0) >>> 31);
      f6000[4] = (boolean)((0 | -0) >>> 31);
      boolean[] var129 = new boolean[5];
      f1000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f1000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f1000[2] = (boolean)((0 | -0) >>> 31);
      f1000[3] = (boolean)((0 | -0) >>> 31);
      f1000[4] = (boolean)((0 | -0) >>> 31);
   }

   private void m20000(NAd var1) {
      int var2 = this.m28000(var1);
      boolean var3 = var1 != null && var1.L() ? f6000[0] : f6000[1];
      boolean var4 = var1 != null && var1.u() ? f6000[2] : f6000[3];
      if (((StringBuilder)this.f9000[f5000[1]]).length() > 0
         && (var2 != (Integer)this.f9000[f5000[2]] || var3 != (Boolean)this.f9000[f5000[3]] || var4 != (Boolean)this.f9000[f5000[4]])) {
         this.m6000();
      }

      Integer var9 = var2;
      this.f9000[f5000[5]] = var9;
      Boolean var10 = var3;
      this.f9000[f5000[6]] = var10;
      Boolean var11 = var4;
      this.f9000[f5000[7]] = var11;
   }

   public void m22000(NAd var1, int var2) {
      this.m20000(var1);
      ((StringBuilder)this.f9000[f8000[7]]).appendCodePoint(var2);
   }

   public List<C0031> m26000() {
      this.m6000();
      return (List<C0031>)this.f9000[f5000[0]];
   }

   private int m28000(NAd var1) {
      NNaI var2 = var1 == null ? null : var1.N();
      return var2 == null ? (Integer)this.f9000[f2000[5]] : (Integer)this.f9000[f2000[6]] & f3000[0] | var2.N() & f3000[1];
   }

   public void m30000(NAd var1, String var2) {
      if (!var2.isEmpty()) {
         this.m20000(var1);
         ((StringBuilder)this.f9000[f8000[6]]).append(var2);
      }
   }

   private static void m32000() {
      int[] var128 = new int[2];
      f3000[(0 | -0) >>> 31] = -16777216;
      f3000[(1 | -1) >>> 31] = 16777215;
   }
}
