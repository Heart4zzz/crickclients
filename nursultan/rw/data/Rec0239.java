package rw.data;

import java.lang.runtime.ObjectMethods;

public record Rec0239() {
   public byte[] f1000;
   public String f2000;
   public byte[] f3000;
   public int f4000;
   public String f5000;
   public int f6000;

   public byte[] m2000() {
      return this.f3000;
   }

   private Rec0239(String var1, int var2, int var3, byte[] var4, byte[] var5, String var6) {
      this.f5000 = var1;
      this.f4000 = var2;
      this.f6000 = var3;
      this.f1000 = var4;
      this.f3000 = var5;
      this.f2000 = var6;
   }

   static {
      ntfClinit();
   }

   public boolean m6000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0239,"normalizedRef;width;height;rgbaPixels;alphaMask;failureReason",Rec0239::f5000,Rec0239::f4000,Rec0239::f6000,Rec0239::f1000,Rec0239::f3000,Rec0239::f2000>(
         this, var1
      );
   }

   public int m8000() {
      return this.f6000;
   }

   public byte[] m10000() {
      return this.f1000;
   }

   public String m12000() {
      return this.f2000;
   }

   static Rec0239 m14000(String var0, String var1) {
      return new Rec0239(var0, 0, 0, null, null, var1);
   }

   static Rec0239 m16000(String var0, int var1, int var2, byte[] var3, byte[] var4) {
      return new Rec0239(var0, var1, var2, var3, var4, null);
   }

   public String m18000() {
      return this.f5000;
   }

   public int m22000() {
      return this.f4000;
   }
}
