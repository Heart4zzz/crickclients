package rw.core;

import KDFzREm.NNWE;
import org.joml.Vector2f;
import rw.api.Iface0211;
import rw.api.Iface0212;
import rw.api.Iface0625;
import rw.api.Iface0626;
import rw.defs.Enum0078;

public class OlOikk<P extends Iface0626> implements Iface0625<P> {
   public static Object[] f1000;
   private static float[] f2000;

   @Override
   public void m6000(Base0315 var1, P var2) {
      C0318 var3 = (C0318)var1;
      if (var3.m2000() == 0) {
         Iface0212 var4 = var1.m26000();
         if (var2.m8000().equals(var4.m34000())) {
            var2.m4000().m6000(true);
            var2.m2000().m6000(var2.m2000().m2000().set(var3.m8000() - var4.m18000().m14000(), var3.m6000() - var4.m18000().m2000()));
         }
      }
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      f1000 = new Object[]{null};
   }

   private static void m12000() {
      f2000 = new float[]{2.0F, 2.0F, 0.0F};
   }

   public void m14000(Base0315 var1, P var2) {
      if (var2.m4000().m2000()) {
         C0318 var3 = (C0318)var1;
         Vector2f var4 = var2.m6000().m2000();
         if (var4 == null) {
            var4 = new Vector2f();
         }

         Vector2f var5 = var2.m2000().m2000();
         Iface0212 var6 = var1.m26000();
         Iface0211 var7 = var6.m8000().m18000();
         Iface0211 var8 = var6.m18000();
         Enum0078 var9 = this.m24000();
         var2.m6000()
            .m6000(
               var4.set(
                  var9.m26000() ? m26000(var3.m8000() - var5.x, var7.m12000(), var8.m12000()) : var4.x,
                  var9.m30000() ? m26000(var3.m6000() - var5.y, var7.m10000(), var8.m10000()) : var4.y
               )
            );
      }
   }

   public void m22000(Base0315 var1, P var2) {
      C0318 var3 = (C0318)var1;
      if (var3.m2000() == 0) {
         var2.m4000().m6000(false);
      }
   }

   public Enum0078 m24000() {
      return (Enum0078)Enum0078.f2000[0];
   }

   public static float m26000(float var0, float var1, float var2) {
      return var2 > var1 ? NNWE.N(var0, -var2 / f2000[0], var1 - var2 / f2000[1]) : NNWE.N(var0, f2000[2], var1 - var2);
   }
}
