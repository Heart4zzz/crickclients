package rw.core;

import KDFzREm.NDq;
import KDFzREm.NXi;
import KDFzREm.NbL;
import net.minecraft.gametest.framework.GameTestHelper;

public class C0745 implements NDq {
   private static boolean[] f1000;
   private static short[] f2000;
   public Object[] f3000;

   private static void m2000() {
      f1000 = new boolean[]{true};
   }

   public C0745(GameTestHelper var1) {
      this.m8000();
      this.f3000[f2000[0]] = var1;
   }

   static {
      ntfClinit();
   }

   private static void m4000() {
      f2000 = new short[]{0, 0};
   }

   private void m8000() {
      if (this.f3000 == null) {
         this.f3000 = new Object[f1000[0]];
         Object[] var1 = this.f3000;
      }
   }

   public void m12000(NbL var1, NXi var2) {
   }

   public void m14000() {
      OOIrq<"wconnmnp",-1243710317,2126134084,2126134085,2126134094,1131879930,-1656610589>((GameTestHelper)this.f3000[f2000[1]]);
   }

   public void m16000(NbL var1) {
   }
}
