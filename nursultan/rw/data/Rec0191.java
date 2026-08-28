package rw.data;

import KDFzREm.NXi;
import java.lang.runtime.ObjectMethods;
import rw.core.C0983;

public record Rec0191() {
   public boolean f1000;
   private static boolean[] f2000;
   public boolean f3000;
   public NXi f4000;
   public C0983 f5000;

   public C0983 m2000() {
      return this.f5000;
   }

   public Rec0191(NXi var1, C0983 var2, boolean var3, boolean var4) {
      this.f4000 = var1;
      this.f5000 = var2;
      this.f1000 = var3;
      this.f3000 = var4;
   }

   static {
      ntfClinit();
   }

   public boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0191,"point;rotation;released;flicking",Rec0191::f4000,Rec0191::f5000,Rec0191::f1000,Rec0191::f3000>(
         this, var1
      );
   }

   private static void m6000() {
      boolean[] var128 = new boolean[2];
      f2000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f2000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
   }

   public NXi m8000() {
      return this.f4000;
   }

   public boolean m10000() {
      return this.f3000;
   }

   public static Rec0191 m14000(NXi var0, C0983 var1) {
      return new Rec0191(var0, var1, f2000[0], f2000[1]);
   }

   public boolean m16000() {
      return this.f1000;
   }
}
