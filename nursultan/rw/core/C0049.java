package rw.core;

import KDFzREm.NCU;
import KDFzREm.NCa;
import KDFzREm.NHS;
import KDFzREm.NNNZg;
import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import KDFzREm.NXi;
import KDFzREm.Ned;
import KDFzREm.NjL;

public class C0049 {
   public Object[] f1000;
   private static boolean[] f2000;
   private static boolean[] f3000;
   private static boolean[] f4000;
   private static boolean[] f5000;
   private static boolean[] f6000;
   private static boolean[] f7000;
   private static boolean[] f8000;
   private static boolean[] f9000;
   private static float[] f10000;
   private static boolean[] f11000;
   private static boolean[] f12000;
   private static boolean[] f13000;

   private static void m4000() {
      f10000 = new float[]{0.75F};
   }

   private int m6000(Ned var1) {
      int var2 = 0;
      if (this.m14000(var1.method_10069(1, 0, 0)) || this.m14000(var1.method_10069(1, 1, 0))) {
         var2++;
      }

      if (this.m14000(var1.method_10069(-1, 0, 0)) || this.m14000(var1.method_10069(-1, 1, 0))) {
         var2++;
      }

      if (this.m14000(var1.method_10069(0, 0, 1)) || this.m14000(var1.method_10069(0, 1, 1))) {
         var2++;
      }

      if (this.m14000(var1.method_10069(0, 0, -1)) || this.m14000(var1.method_10069(0, 1, -1))) {
         var2++;
      }

      return var2;
   }

   public C0049() {
      this.m32000();
   }

   static {
      ntfClinit();
   }

   private boolean m14000(Ned var1) {
      NCa var2 = ((NNNZg)((NNuU)C0768.f1000[0]).T[3]).method_8320(var1);
      if (var2 != null && !var2.P()) {
         NCU var3 = var2.M((NNNZg)((NNuU)C0768.f1000[0]).T[3], var1);
         return var3 != null && !var3.method_1110() ? f8000[2] : f8000[3];
      } else {
         return f8000[1];
      }
   }

   private static void m18000() {
      f11000 = new boolean[]{false, false, false, false, true, true, false};
      f3000 = new boolean[]{true, true, true, true, false, true};
      f12000 = new boolean[]{false, true, false};
      f7000 = new boolean[]{false, true};
      f5000 = new boolean[]{true, false, false};
      f9000 = new boolean[]{true, false};
      f13000 = new boolean[]{false, true, true, false, false, false};
      f2000 = new boolean[]{true, false, false, false, true, false};
      f6000 = new boolean[]{true, true, false, false};
      f4000 = new boolean[]{false, true, false, false, true};
      f8000 = new boolean[]{true, false, true, false, true, false, false};
   }

   public void m22000() {
      Integer var5 = 0;
      this.f1000[0] = var5;
   }

   public boolean m24000(NjL var1, NHS var2, NXi var3, double var4, float var6) {
      if ((NNNwS)((NNuU)C0768.f1000[0]).T[4] == null || (NNNZg)((NNuU)C0768.f1000[0]).T[3] == null || var1 == null || var2 == null || var3 == null) {
         Integer var19 = 0;
         this.f1000[0] = var19;
         return (boolean)0;
      } else if (var4 > var6 + f10000[0]) {
         Integer var20 = Math.max(0, (Integer)this.f1000[0] - 1);
         this.f1000[0] = var20;
         return (boolean)(this.f1000[0] >= 2 ? 1 : 0);
      } else {
         Ned var7 = Ned.method_49637(
            ((NNNwS)((NNuU)C0768.f1000[0]).T[4]).method_23317(),
            ((NNNwS)((NNuU)C0768.f1000[0]).T[4]).method_23318(),
            ((NNNwS)((NNuU)C0768.f1000[0]).T[4]).method_23321()
         );
         int var8 = this.m6000(var7);
         int var9 = this.m28000(var7, 1, var7.method_10264(), var7.method_10264() + 1);
         int var10 = this.m28000(var7, 2, var7.method_10264(), var7.method_10264() + 1);
         int var11 = this.m26000(var7);
         int var12 = var8 < 3 && var9 < 6 ? 0 : 1;
         int var13 = var11 < 2 || var9 < 3 && var10 < 8 ? 0 : 1;
         int var14 = var9 >= 5 && var10 >= 8 ? 1 : 0;
         if (var12 == 0 && var13 == 0 && var14 == 0) {
            Integer var22 = Math.max(0, (Integer)this.f1000[0] - 1);
            this.f1000[0] = var22;
         } else {
            Integer var21 = Math.min(8, (Integer)this.f1000[0] + 2);
            this.f1000[0] = var21;
         }

         return (boolean)(this.f1000[0] >= 2 ? 1 : 0);
      }
   }

   private int m26000(Ned var1) {
      int var2 = 0;
      int var3 = var1.method_10264() + 2;

      for (int var4 = -1; var4 <= 1; var4++) {
         for (int var5 = -1; var5 <= f8000[0]; var5++) {
            if (this.m14000(new Ned(var1.method_10263() + var4, var3, var1.method_10260() + var5))) {
               var2++;
            }
         }
      }

      return var2;
   }

   private int m28000(Ned var1, int var2, int var3, int var4) {
      int var5 = 0;

      for (int var6 = -var2; var6 <= var2; var6++) {
         for (int var7 = -var2; var7 <= var2; var7++) {
            if (Math.abs(var6) == var2 || Math.abs(var7) == var2) {
               for (int var8 = var3; var8 <= var4; var8++) {
                  if (this.m14000(new Ned(var1.method_10263() + var6, var8, var1.method_10260() + var7))) {
                     var5++;
                     break;
                  }
               }
            }
         }
      }

      return var5;
   }

   private void m32000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[f8000[4]];
         Object[] var1 = this.f1000;
         var1[f8000[5]] = Integer.valueOf(f8000[6]);
      }
   }
}
