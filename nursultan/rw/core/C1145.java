package rw.core;

import rw.defs.OlrkOij;

public class C1145 {
   public Object[] f1000;

   public C1145(String var1) {
      this.m6000();
      this.f1000[0] = var1;
      OlrkOij var2 = OlrkOij.m48000(var1);
      Integer var8 = var2 == null ? 0 : var2.m42000();
      this.f1000[1] = var8;
   }

   static {
      ntfClinit();
   }

   private void m6000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[2];
         Object[] var1 = this.f1000;
         var1[1] = 0;
      }
   }

   public String m12000() {
      return (String)this.f1000[0];
   }

   public int m16000() {
      return (Integer)this.f1000[1];
   }
}
