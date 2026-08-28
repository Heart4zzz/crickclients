package rw.setting;

import KDFzREm.NbK;
import rw.core.C0998;
import rw.core.C1140;
import rw.gui.Tracers;

public class C0116 extends InvisibleX {
   private static String[] f1000;
   public Object[] f2000;

   private static void m2000() {
      f1000 = new String[]{"friend-color"};
   }

   private void m6000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[1];
         Object[] var1 = this.f2000;
      }
   }

   public C0116(Tracers var1, String var2, boolean var3) {
      super(var1, var2, var3);
      this.m6000();
   }

   static {
      ntfClinit();
   }

   public int m18000() {
      this.m6000();
      return (Integer)((C0998)this.f2000[0]).i();
   }

   public void m24000(Tracers var1) {
      this.m6000();
      C0998 var6 = (C0998)C0122.m6000(var1, f1000[0], -16711936).N(var1x -> this.U());
      this.f2000[0] = var6;
   }

   public boolean m26000(NbK var1) {
      return C1140.m42000().and(C1140.m50000()).and(C1140.m36000().negate()).test(var1);
   }
}
