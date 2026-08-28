package rw.data;

import java.lang.runtime.ObjectMethods;

public record Rec0259() {
   public int f1000;
   public Runnable f2000;
   public boolean f3000;
   public String f4000;
   private static boolean[] f5000;
   public String f6000;

   public boolean m2000() {
      return this.f3000;
   }

   public Rec0259(String var1, int var2, String var3, Runnable var4) {
      this(var1, var2, var3, var4, f5000[0]);
   }

   public Rec0259(String var1, int var2, String var3, Runnable var4, boolean var5) {
      this.f4000 = var1;
      this.f1000 = var2;
      this.f6000 = var3;
      this.f2000 = var4;
      this.f3000 = var5;
   }

   public Rec0259(String var1, int var2, Runnable var3) {
      this(var1, var2, null, var3, f5000[1]);
   }

   static {
      ntfClinit();
   }

   public boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0259,"iconPath;iconColor;text;onClick;disabled",Rec0259::f4000,Rec0259::f1000,Rec0259::f6000,Rec0259::f2000,Rec0259::f3000>(
         this, var1
      );
   }

   public Runnable m6000() {
      return this.f2000;
   }

   public String m8000() {
      return this.f4000;
   }

   public int m10000() {
      return this.f1000;
   }

   public String m12000() {
      return this.f6000;
   }

   private static void m16000() {
      boolean[] var128 = new boolean[2];
      f5000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f5000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
   }
}
