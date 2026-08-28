package rw.core;

import java.util.Optional;
import rw.NursultanClient;
import rw.api.Iface0635;
import rw.data.Rec0207;
import rw.data.Rec0244;
import rw.setting.C0106;

public class C1097 implements Iface0635 {
   public Object[] f1000;
   public static Object[] f2000;
   private static String[] f3000;

   private static void m4000() {
      f3000 = new String[]{"/login", "/l "};
   }

   public C1097(OliqrIkn var1) {
      this.m30000();
      this.f1000[0] = var1;
   }

   static {
      ntfClinit();
   }

   private static void m10000() {
      f2000 = new Object[]{null};
   }

   public String[] m26000() {
      return (String[])f2000[0];
   }

   public void m28000(String var1) {
      String var2 = rw.setting.C0146.m18000();
      String var3 = rw.setting.C0146.m10000();
      Optional var4 = ((OliqrIkn)this.f1000[0]).m38000(var2, var3);
      if (!var4.isEmpty()) {
         String var5 = ((Rec0244)var4.get()).m6000();
         rw.setting.C0160.m70000("/login " + var5);

         try {
            ((OliqrIkn)this.f1000[0]).m28000(var2, var3, var5);
         } catch (Exception var7) {
            C0106.m40000(new Rec0207(NursultanClient.m88000().m26000()), "Login update error: " + var7.getMessage());
         }
      }
   }

   private void m30000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[1];
         Object[] var1 = this.f1000;
      }
   }
}
