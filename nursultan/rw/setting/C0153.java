package rw.setting;

import java.util.Objects;
import rw.api.Iface0195;
import rw.data.Ilnotljq;

public class C0153 implements Iface0195 {
   private static float[] f1000;
   private static String[] f2000;
   public Object[] f3000;
   private static float[] f4000;
   private static boolean[] f5000;
   public static Object[] f6000;
   private static boolean[] f7000;

   public float m4000() {
      return (Float)this.f3000[1];
   }

   private void m6000(float var1) {
      float var2 = (Float)this.f3000[1] - (Float)this.f3000[3];
      float var3 = (-((Ilnotljq)this.f3000[0]).m4000() * var2 - ((Ilnotljq)this.f3000[0]).m14000() * (Float)this.f3000[2]) / ((Ilnotljq)this.f3000[0]).m6000();
      Float var8 = (Float)this.f3000[2] + var3 * var1;
      this.f3000[2] = var8;
      Float var9 = (Float)this.f3000[1] + (Float)this.f3000[2] * var1;
      this.f3000[1] = var9;
   }

   private static void m8000() {
      f6000 = new Object[]{0.25F};
   }

   public C0153(float var1, float var2, Ilnotljq var3) {
      this.m32000();
      Ilnotljq var8 = Objects.requireNonNull(var3, f2000[0]);
      this.f3000[0] = var8;
      Float var9 = var1;
      this.f3000[1] = var9;
      Float var10 = var2;
      this.f3000[3] = var10;
      Boolean var11 = this.m12000();
      this.f3000[4] = var11;
      if ((Boolean)this.f3000[4]) {
         Float var12 = (Float)this.f3000[3];
         this.f3000[1] = var12;
      }
   }

   static {
      ntfClinit();
   }

   private static void m10000() {
      f4000 = new float[]{0.0F, 0.25F, 0.0F};
      f1000 = new float[]{0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F};
   }

   private boolean m12000() {
      return Math.abs((Float)this.f3000[1] - (Float)this.f3000[3]) <= ((Ilnotljq)this.f3000[0]).m30000()
            && Math.abs((Float)this.f3000[2]) <= ((Ilnotljq)this.f3000[0]).m12000()
         ? f5000[5]
         : f5000[6];
   }

   private static void m20000() {
      f5000 = new boolean[]{false, true, true, false, true, true, false, true};
      f7000 = new boolean[]{false, true, false};
   }

   public float m24000() {
      return (Float)this.f3000[2];
   }

   public boolean m26000() {
      return (Boolean)this.f3000[4];
   }

   public boolean m30000(float var1) {
      Float var6 = var1;
      this.f3000[3] = var6;
      Boolean var7 = this.m12000();
      this.f3000[4] = var7;
      if ((Boolean)this.f3000[4]) {
         Float var8 = (Float)this.f3000[3];
         this.f3000[1] = var8;
         Float var9 = f1000[1];
         this.f3000[2] = var9;
      }

      return f5000[4];
   }

   private void m32000() {
      if (this.f3000 == null) {
         this.f3000 = new Object[5];
         Object[] var1 = this.f3000;
         var1[f5000[7]] = f1000[2];
         var1[2] = f1000[3];
         var1[3] = f1000[4];
         var1[4] = false;
      }
   }

   public boolean m34000(C0027 var1) {
      return this.m30000(var1.m10000());
   }

   public boolean m36000(float var1) {
      if (!(Boolean)this.f3000[4] && !(var1 <= f4000[0])) {
         float var2 = (Float)this.f3000[1];
         float var3 = Math.min(var1, f4000[1]);

         while (var3 > f4000[2]) {
            float var4 = Math.min(((Ilnotljq)this.f3000[0]).m50000(), var3);
            this.m6000(var4);
            var3 -= var4;
         }

         if (this.m12000()) {
            Float var9 = (Float)this.f3000[3];
            this.f3000[1] = var9;
            Float var10 = f1000[0];
            this.f3000[2] = var10;
            Boolean var11 = f5000[1];
            this.f3000[4] = var11;
         }

         return Float.compare(var2, (Float)this.f3000[1]) != 0 ? f5000[2] : f5000[3];
      } else {
         return f5000[0];
      }
   }

   public C0027 m38000() {
      return C0027.m22000((Float)this.f3000[1]);
   }

   private static void m44000() {
      f2000 = new String[]{"spec"};
   }
}
