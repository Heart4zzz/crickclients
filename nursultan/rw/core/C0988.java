package rw.core;

import java.util.function.Supplier;
import rw.data.Rec0312;

public class C0988 extends Base1014<Float> {
   private static String[] f1000;
   private static float[] f2000;
   public Object[] f3000;

   public Supplier<String> m2000() {
      this.m12000();
      return (Supplier<String>)this.f3000[3];
   }

   public float m4000() {
      this.m12000();
      return (Float)this.f3000[0];
   }

   public float m6000() {
      this.m12000();
      return (Float)this.f3000[2];
   }

   public C0988(Rec0312 var1, float var2, float var3, float var4, float var5) {
      super(var1, var2);
      this.m12000();
      Supplier var10 = () -> f1000[2];
      this.f3000[3] = var10;
      Float var11 = var3;
      this.f3000[0] = var11;
      Float var12 = var4;
      this.f3000[1] = var12;
      Float var13 = var5;
      this.f3000[2] = var13;
   }

   static {
      ntfClinit();
   }

   private void m12000() {
      if (this.f3000 == null) {
         this.f3000 = new Object[4];
         Object[] var1 = this.f3000;
         var1[0] = f2000[0];
         var1[1] = f2000[1];
         var1[2] = f2000[2];
      }
   }

   private static void m20000() {
      f2000 = new float[]{0.0F, 0.0F, 0.0F};
   }

   public void m32000(Float var1) {
      this.m12000();
      if (!(var1 < (Float)this.f3000[0]) && !(var1 > (Float)this.f3000[1])) {
         super.m34000(var1);
      } else {
         throw new IllegalArgumentException(String.format(f1000[0], var1, (Float)this.f3000[0], (Float)this.f3000[1]));
      }
   }

   public C0988 m34000(Supplier<String> var1) {
      this.m12000();
      Supplier var6 = var1 == null ? () -> f1000[1] : var1;
      this.f3000[3] = var6;
      return this;
   }

   public float m36000() {
      this.m12000();
      return (Float)this.f3000[1];
   }

   private static void m38000() {
      f1000 = new String[]{"Value %f is out of range [%f, %f]", "", ""};
   }
}
