package rw.core;

import java.util.List;

public class C1168 {
   public Object[] f1000;
   public static Object[] f2000;

   public C1168() {
      this(100);
   }

   public C1168(int var1) {
      this.m6000();
      C0889 var6 = new C0889(var1);
      this.f1000[0] = var6;
   }

   static {
      ntfClinit();
   }

   private void m6000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[1];
         Object[] var1 = this.f1000;
      }
   }

   private static void m14000() {
      f2000 = new Object[]{100};
   }

   public List<String> m18000() {
      return (List<String>)this.f1000[0];
   }
}
