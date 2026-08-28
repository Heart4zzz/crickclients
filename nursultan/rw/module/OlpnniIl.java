package rw.module;

import rw.defs.Enum0072;
import rw.defs.SfDz;

public class OlpnniIl extends Huddumped {
   public static Object[] f1000;

   static {
      ntfClinit();
   }

   private void m4000(Huddumped var1) {
      Integer var6 = var1.m30000();
      this.L[0] = var6;
      Integer var7 = var1.m58000();
      this.L[1] = var7;
      Integer var8 = var1.m22000();
      this.L[2] = var8;
      SfDz var9 = var1.m32000();
      this.L[3] = var9;
      Enum0072 var10 = var1.m20000();
      this.L[4] = var10;
   }

   public static OlpnniIl m6000(Huddumped var0) {
      ((OlpnniIl)f1000[0]).m4000(var0);
      return (OlpnniIl)f1000[0];
   }

   private static void m4000() {
      f1000 = new Object[]{null};
   }
}
