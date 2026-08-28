package rw.core;

import KDFzREm.NbK;
import rw.api.Iface0648;
import rw.gui.Friends;

public abstract class Base0738<T extends NbK> extends Base1156 implements Iface0648<Friends> {
   private static float[] f1000;
   public Object[] f2000;

   public int m2000() {
      return -1;
   }

   private void m6000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[1];
         Object[] var1 = this.f2000;
      }
   }

   public Base0738(Friends var1, String var2, boolean var3) {
      super(var2, var3);
      this.m6000();
      this.f2000[0] = var1;
   }

   static {
      ntfClinit();
   }

   private static void m14000() {
      f1000 = new float[]{90.0F};
   }

   public float m18000() {
      return f1000[0];
   }
}
