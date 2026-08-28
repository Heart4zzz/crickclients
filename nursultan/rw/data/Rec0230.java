package rw.data;

import KDFzREm.NCa;
import KDFzREm.NKi;
import java.lang.runtime.ObjectMethods;
import java.util.Arrays;
import java.util.List;
import rw.api.Iface0624;

public record Rec0230() implements Iface0624 {
   public int f1000;
   public NKi[] f2000;
   private static short[] f3000;
   public String f4000;

   public NKi[] m2000() {
      return this.f2000;
   }

   public Rec0230(String var1, NKi... var2) {
      this(var1, f3000[0], var2);
   }

   public Rec0230(String var1, int var2, NKi... var3) {
      this.f4000 = var1;
      this.f1000 = var2;
      this.f2000 = var3;
   }

   static {
      ntfClinit();
   }

   public boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0230,"name;durationTicks;blocks",Rec0230::f4000,Rec0230::f1000,Rec0230::f2000>(this, var1);
   }

   private static void m6000() {
      short[] var128 = new short[(1 | -1) >>> 31];
      f3000[(0 | -0) >>> 31] = 300;
   }

   public int m8000() {
      return this.f1000;
   }

   public boolean m12000(List<IlsImt> var1) {
      List var2 = var1.stream().map(var0 -> var0.m4000().i()).toList();
      return Arrays.stream(this.f2000).allMatch(var2::contains);
   }

   public boolean m14000(NCa var1) {
      return Arrays.stream(this.f2000).anyMatch(var1::N);
   }

   public String m18000() {
      return this.f4000;
   }
}
