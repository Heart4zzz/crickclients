package rw.data;

import java.lang.runtime.ObjectMethods;
import rw.api.Iface0195;
import rw.api.Iface0203;
import rw.core.C1170;
import rw.core.C1171;
import rw.defs.Enum0019;
import rw.defs.Enum0022;
import rw.setting.C0027;
import rw.setting.C0133;
import rw.setting.C0152;
import rw.setting.C0153;

public record Ilnotljq() implements Iface0203 {
   private static float[] f1000;
   public float f2000;
   private static float[] f3000;
   public float f4000;
   private static String[] f5000;
   public float f6000;
   public float f7000;
   private static short[] f8000;
   public float f9000;
   public static Object[] f10000;
   public float f11000;
   private static float[] f12000;

   public float m4000() {
      return this.f6000;
   }

   public float m6000() {
      return this.f11000;
   }

   public Ilnotljq(float var1, float var2, float var3, float var4, float var5, float var6) {
      var1 = m34000(var1);
      var2 = m34000(var2);
      var3 = m40000(var3, f12000[0]);
      var4 = m34000(var4);
      var5 = m34000(var5);
      var6 = m40000(var6, f12000[1]);
      this.f6000 = var1;
      this.f7000 = var2;
      this.f11000 = var3;
      this.f2000 = var4;
      this.f4000 = var5;
      this.f9000 = var6;
   }

   static {
      ntfClinit();
   }

   public boolean m10000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Ilnotljq,"stiffness;damping;mass;positionEpsilon;velocityEpsilon;maxStepSeconds",Ilnotljq::f6000,Ilnotljq::f7000,Ilnotljq::f11000,Ilnotljq::f2000,Ilnotljq::f4000,Ilnotljq::f9000>(
         this, var1
      );
   }

   public float m12000() {
      return this.f4000;
   }

   public float m14000() {
      return this.f7000;
   }

   private static void m18000() {
      f8000 = new short[]{6, 0};
   }

   private static void m20000() {
      f12000 = new float[]{1.0F, 0.008333334F, 0.0F, 0.0F, 0.0F};
      f1000 = new float[]{260.0F, 34.0F, 1.0F, 0.35F, 8.0F, 0.008333334F, 260.0F};
      f3000 = new float[]{34.0F, 1.0F, 0.35F, 8.0F, 0.008333334F};
   }

   public boolean m24000() {
      return (boolean)1;
   }

   public float m30000() {
      return this.f2000;
   }

   private static void m32000() {
      f10000 = new Object[]{260.0F, 34.0F, 1.0F, 0.35F, 8.0F, 0.008333334F, null};
   }

   private static float m34000(float var0) {
      return Float.isFinite(var0) ? Math.max(f12000[2], var0) : f12000[3];
   }

   public boolean m36000(Enum0022 var1) {
      return (boolean)(var1 != Enum0022.f1000 && var1 != Enum0022.f3000 && var1 != Enum0022.f2000 && var1 != Enum0022.f4000 ? 0 : 1);
   }

   public Iface0195 m38000(Enum0019 var1, C0027 var2, C0027 var3) {
      if (var2.m20000() != var3.m20000()) {
         throw new IllegalArgumentException(f5000[0]);
      } else {
         return (Iface0195)(switch (((int[])C1170.f3000[f8000[1]])[var2.m20000().ordinal()]) {
            case 1 -> new C0153(var2.m10000(), var3.m10000(), this);
            case 2 -> new C0152(var2.m8000(), var3.m8000(), this);
            case 3 -> new C1171(var2.m2000(), var3.m2000(), this);
            case 4 -> new C0133(var2.m6000(), var3.m6000(), this);
            default -> throw new MatchException(null, null);
         });
      }
   }

   private static float m40000(float var0, float var1) {
      return Float.isFinite(var0) && var0 > f12000[4] ? var0 : var1;
   }

   public static Ilnotljq m42000() {
      return (Ilnotljq)f10000[f8000[0]];
   }

   private static void m48000() {
      f5000 = new String[]{"Spring transitions require matching value kinds"};
   }

   public float m50000() {
      return this.f9000;
   }
}
