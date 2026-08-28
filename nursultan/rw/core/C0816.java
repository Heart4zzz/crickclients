package rw.core;

public class C0816 {
   public static Object[] f1000;
   public Object[] f2000;
   private static String[] f3000;

   C0816(String var1, String var2) {
      this.m16000();
      this.f2000[0] = var1;
      this.f2000[1] = var2;
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      f1000 = new Object[]{null};
   }

   private void m16000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[2];
         Object[] var1 = this.f2000;
      }
   }

   public static rw.setting.C0091 m22000(String var0) {
      return new rw.setting.C0091(var0);
   }

   public C0820 m26000() {
      return new C0820(this);
   }

   private static void m28000() {
      f3000 = new String[]{"^(\\s*)#\\s*define\\s+([A-Za-z_][A-Za-z0-9_]*)\\s+__ARG_(FLOAT_ARRAY|FLOAT|INT|BOOL|VEC2|VEC3|VEC4)(?:_([1-9][0-9]*))?__(.*)$"};
   }
}
