package rw.core;

import KDFzREm.NAd;
import KDFzREm.NNaL;

public class C0029 implements NNaL {
   private static boolean[] f1000;
   private static short[] f2000;
   public Object[] f3000;

   private static void m2000() {
      f1000 = new boolean[]{true, true};
   }

   C0029(C0028 var1) {
      this.m12000();
      this.f3000[f2000[0]] = var1;
   }

   static {
      ntfClinit();
   }

   public boolean m4000(int var1, NAd var2, int var3) {
      ((C0028)this.f3000[f2000[1]]).m32000(var2, var3);
      return f1000[0];
   }

   private static void m6000() {
      f2000 = new short[]{0, 0};
   }

   private void m12000() {
      if (this.f3000 == null) {
         this.f3000 = new Object[f1000[1]];
         Object[] var1 = this.f3000;
      }
   }
}
