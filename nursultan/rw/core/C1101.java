package rw.core;

import rw.NursultanClient;
import rw.api.Iface0635;
import rw.data.Rec0207;
import rw.setting.C0106;

public class C1101 implements Iface0635 {
   public Object[] f1000;
   private static String[] f2000;
   public static Object[] f3000;

   private static void m2000() {
      f3000 = new Object[]{null};
   }

   public C1101(OliqrIkn var1) {
      this.m16000();
      this.f1000[0] = var1;
   }

   static {
      ntfClinit();
   }

   private static void m10000() {
      f2000 = new String[]{"/register", "/reg"};
   }

   private void m16000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[1];
         Object[] var1 = this.f1000;
      }
   }

   public String[] m26000() {
      return (String[])f3000[0];
   }

   public void m28000(String var1) {
      rw.setting.C0160.m70000("/register " + var1 + " " + var1);

      try {
         ((OliqrIkn)this.f1000[0]).m28000(rw.setting.C0146.m18000(), rw.setting.C0146.m10000(), var1);
      } catch (Exception var3) {
         C0106.m40000(new Rec0207(NursultanClient.m88000().m26000()), "Register error: " + var3.getMessage());
      }
   }
}
