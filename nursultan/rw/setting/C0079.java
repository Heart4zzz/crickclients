package rw.setting;

import KDFzREm.NGx;
import KDFzREm.NbK;
import rw.core.Base0738;
import rw.core.C0988;
import rw.core.C0998;
import rw.core.C1140;
import rw.gui.Friends;

public class C0079 extends Base0738<NGx> {
   private static float[] f1000;
   public Object[] f2000;
   private static String[] f3000;

   public int m4000() {
      this.m20000();
      return (Integer)((C0998)this.f2000[1]).i();
   }

   private static void m6000() {
      f3000 = new String[]{"item-radius", "item-color"};
   }

   public C0079(Friends var1, String var2, boolean var3) {
      super(var1, var2, var3);
      this.m20000();
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      f1000 = new float[]{90.0F, 70.0F, 140.0F, 1.0F};
   }

   public float m14000() {
      this.m20000();
      return (Float)((C0988)this.f2000[0]).i();
   }

   public boolean m14000(NbK var1) {
      return C1140.m6000().test(var1);
   }

   public void m18000(Friends var1) {
      this.m20000();
      C0988 var6 = (C0988)C0122.m12000(var1, f3000[0], f1000[0], f1000[1], f1000[2], f1000[3]).N(var1x -> this.U());
      this.f2000[0] = var6;
      C0998 var7 = (C0998)C0122.m6000(var1, f3000[1], -16711681).N(var1x -> this.U());
      this.f2000[1] = var7;
   }

   private void m20000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[2];
         Object[] var1 = this.f2000;
      }
   }
}
