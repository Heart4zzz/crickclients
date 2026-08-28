package rw.setting;

import KDFzREm.NbK;
import rw.core.C0988;
import rw.core.C0998;
import rw.core.C1140;
import rw.gui.Friends;

public class OltIsijn extends Invisible {
   private static String[] f1000;
   public Object[] f2000;
   private static float[] f3000;

   @Override
   public int m4000() {
      this.m6000();
      return (Integer)((C0998)this.f2000[1]).i();
   }

   private void m6000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[2];
         Object[] var1 = this.f2000;
      }
   }

   public OltIsijn(Friends var1, String var2, boolean var3) {
      super(var1, var2, var3);
      this.m6000();
   }

   static {
      ntfClinit();
   }

   private static void m10000() {
      f1000 = new String[]{"friends-radius", "friend-color"};
   }

   public boolean m24000(NbK var1) {
      return C1140.m42000().and(C1140.m50000()).and(C1140.m36000().negate()).and(C1140.m28000().negate()).test(var1);
   }

   public float m28000() {
      this.m6000();
      return (Float)((C0988)this.f2000[0]).i();
   }

   public void m32000(Friends var1) {
      this.m6000();
      C0988 var6 = (C0988)C0122.m12000(var1, f1000[0], f3000[0], f3000[1], f3000[2], f3000[3]).N(var1x -> this.U());
      this.f2000[0] = var6;
      C0998 var7 = (C0998)C0122.m6000(var1, f1000[1], -16711936).N(var1x -> this.U());
      this.f2000[1] = var7;
   }

   private static void m36000() {
      f3000 = new float[]{90.0F, 70.0F, 140.0F, 1.0F};
   }
}
