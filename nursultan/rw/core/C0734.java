package rw.core;

import KDFzREm.NXi;
import rw.data.Rec0181;
import rw.gui.Scaffold;

public class C0734 extends Base0749 {
   private static float[] f1000;
   public Object[] f2000;

   private static void m4000() {
      f1000 = new float[]{0.1F, 0.11F, 0.0F, 0.0F};
   }

   public C0734(Scaffold var1, String var2, boolean var3) {
      super(var1, var2, var3);
      this.m16000();
   }

   static {
      ntfClinit();
   }

   public void m10000(C0983 var1, boolean var2) {
      this.m16000();
      if (var2) {
         NuZz.m44000(var1);
         Float var7 = var1.m38000();
         this.f2000[0] = var7;
         Boolean var8 = true;
         this.f2000[1] = var8;
      } else if ((Boolean)this.f2000[1]) {
         Boolean var9 = false;
         this.f2000[1] = var9;
      }
   }

   public C0983 m12000(Rec0181 var1, NXi var2, C0983 var3) {
      this.m16000();
      C0983 var4 = C0989.m28000().m62000(var3);
      if (Math.abs((Float)this.f2000[0] - var4.m38000()) <= f1000[0]) {
         var4 = var4.m64000(f1000[1], f1000[2]);
      }

      return var4.m54000(true);
   }

   private void m16000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[2];
         Object[] var1 = this.f2000;
         var1[0] = f1000[3];
         var1[1] = false;
      }
   }
}
