package rw.setting;

import KDFzREm.NbK;
import KDFzREm.Nwn;
import rw.core.C0988;
import rw.core.C0998;
import rw.core.C1136;
import rw.core.C1137;
import rw.core.C1140;
import rw.core.C1141;
import rw.gui.Friends;

public class Invisible extends C0083<Nwn> {
   private static String[] f1000;
   private static float[] f2000;
   public Object[] f3000;

   public int m6000() {
      this.m12000();
      return (Integer)((C0998)this.f3000[4]).i();
   }

   public Invisible(Friends var1, String var2, boolean var3) {
      super(var1, var2, var3);
      this.m12000();
      C1136 var8 = new C1136(f1000[0], false);
      this.f3000[0] = var8;
      C1137 var9 = new C1137(f1000[1], true);
      this.f3000[1] = var9;
      C1141 var10 = new C1141(f1000[2], true);
      this.f3000[2] = var10;
   }

   static {
      ntfClinit();
   }

   private static void m10000() {
      f2000 = new float[]{90.0F, 70.0F, 140.0F, 1.0F};
   }

   private void m12000() {
      if (this.f3000 == null) {
         this.f3000 = new Object[5];
         Object[] var1 = this.f3000;
      }
   }

   public boolean m22000(NbK var1) {
      this.m12000();
      return C1140.m12000()
         .and(C1140.m50000())
         .and(C1140.m42000().negate())
         .and(C1140.m36000().negate())
         .and((C1137)this.f3000[1])
         .and((C1136)this.f3000[0])
         .and((C1141)this.f3000[2])
         .test(var1);
   }

   public void m24000(Friends var1) {
      this.m12000();
      C0122.m4000(var1, f1000[3], (C1136)this.f3000[0], (C1137)this.f3000[1], (C1141)this.f3000[2]).N(var1x -> this.U());
      C0988 var6 = (C0988)C0122.m12000(var1, f1000[4], f2000[0], f2000[1], f2000[2], f2000[3]).N(var1x -> this.U());
      this.f3000[3] = var6;
      C0998 var7 = (C0998)C0122.m6000(var1, f1000[5], -65536).N(var1x -> this.U());
      this.f3000[4] = var7;
   }

   public float m30000() {
      this.m12000();
      return (Float)((C0988)this.f3000[3]).i();
   }

   private static void m36000() {
      f1000 = new String[]{"invisible", "naked", "bot", "target-condition", "player-radius", "player-color"};
   }
}
