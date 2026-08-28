package rw.setting;

import KDFzREm.NbK;
import rw.core.Base0738;
import rw.core.C0988;
import rw.core.C0998;
import rw.gui.Friends;

public class BjCw extends Base0738<NbK> {
   public Object[] f1000;
   private static float[] f2000;
   private static String[] f3000;

   @Override
   public int m2000() {
      this.m16000();
      return (Integer)((C0998)this.f1000[1]).i();
   }

   public BjCw(Friends var1, String var2, boolean var3) {
      super(var1, var2, var3);
      this.m16000();
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      f2000 = new float[]{90.0F, 70.0F, 140.0F, 1.0F};
   }

   public float m12000() {
      this.m16000();
      return (Float)((C0988)this.f1000[0]).i();
   }

   public void m14000(Friends var1) {
      this.m16000();
      C0988 var6 = (C0988)C0122.m12000(var1, f3000[0], f2000[0], f2000[1], f2000[2], f2000[3]).N(var1x -> this.U());
      this.f1000[0] = var6;
      C0998 var7 = (C0998)C0122.m6000(var1, f3000[1], -16711681).N(var1x -> this.U());
      this.f1000[1] = var7;
   }

   public boolean m20000(NbK var1) {
      return (boolean)0;
   }

   private static void m22000() {
      f3000 = new String[]{"party-radius", "party-color"};
   }

   private void m16000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[2];
         Object[] var1 = this.f1000;
      }
   }
}
