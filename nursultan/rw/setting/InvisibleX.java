package rw.setting;

import KDFzREm.NbK;
import KDFzREm.Nwn;
import rw.core.C0998;
import rw.core.C1136;
import rw.core.C1137;
import rw.core.C1140;
import rw.core.C1141;
import rw.gui.Tracers;

public class InvisibleX extends C0109<Nwn> {
   private static String[] f1000;
   public Object[] f2000;

   private void m4000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[4];
         Object[] var1 = this.f2000;
      }
   }

   public InvisibleX(Tracers var1, String var2, boolean var3) {
      super(var1, var2, var3);
      this.m4000();
      C1136 var8 = new C1136(f1000[0], false);
      this.f2000[0] = var8;
      C1137 var9 = new C1137(f1000[1], true);
      this.f2000[1] = var9;
      C1141 var10 = new C1141(f1000[2], true);
      this.f2000[2] = var10;
   }

   static {
      ntfClinit();
   }

   private static void m4000() {
      f1000 = new String[]{"invisible", "naked", "bot", "target-condition", "player-color"};
   }

   public boolean m14000(NbK var1) {
      this.m4000();
      return C1140.m12000()
         .and(C1140.m50000())
         .and(C1140.m42000().negate())
         .and(C1140.m36000().negate())
         .and((C1137)this.f2000[1])
         .and((C1136)this.f2000[0])
         .and((C1141)this.f2000[2])
         .test(var1);
   }

   public void m20000(Tracers var1) {
      this.m4000();
      C0122.m4000(var1, f1000[3], (C1136)this.f2000[0], (C1137)this.f2000[1], (C1141)this.f2000[2]).N(var1x -> this.U());
      C0998 var6 = (C0998)C0122.m6000(var1, f1000[4], -65536).N(var1x -> this.U());
      this.f2000[3] = var6;
   }

   public int m24000() {
      this.m4000();
      return (Integer)((C0998)this.f2000[3]).i();
   }
}
