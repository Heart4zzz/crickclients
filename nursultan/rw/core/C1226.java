package rw.core;

import KDFzREm.NDT;
import KDFzREm.NNuU;
import java.util.Iterator;
import java.util.List;
import org.apache.logging.log4j.Logger;
import rw.api.Iface0673;

public class C1226 extends OlkOrn {
   private static boolean[] f1000;
   private static boolean[] f2000;
   public static Object[] f3000;

   public int m2000() {
      return this.m24000() - 2;
   }

   private static void m4000() {
      f1000 = new boolean[]{true, false, true, false, false, true, true};
      f2000 = new boolean[]{true, false, true};
   }

   static {
      ntfClinit();
   }

   private void m6000(C1241 var1) {
      if (!(Boolean)this.N[1]) {
         Boolean var6 = true;
         var1.f1000[4] = var6;
         ((NNuU)this.u[0]).NE().N(new NDT(0));
      }

      Boolean var7 = false;
      this.N[1] = var7;
   }

   private static void m8000() {
      f3000 = new Object[]{null};
   }

   @Override
   public void m10000(C1241 var1) {
      if ((Integer)var1.f1000[3] == this.m24000()) {
         this.m6000(var1);
      } else if ((Integer)var1.f1000[3] == this.m8000()) {
         this.m6000(var1);
      } else if ((Integer)var1.f1000[3] == this.m2000()) {
         this.m12000(var1);
      } else if ((Boolean)var1.f1000[4] && !(Boolean)this.N[0]) {
         this.m6000(var1);
         this.m6000(var1);
         this.m12000(var1);
      }
   }

   private void m6000(C1241 var1) {
      try {
         Iterator var2 = ((List)var1.f1000[0]).iterator();

         while (var2.hasNext()) {
            Iface0673 var3 = (Iface0673)var2.next();
            if (!var3.m8000((NNuU)this.u[0])) {
               Integer var8 = this.m24000() + 1;
               var1.f1000[3] = var8;
               return;
            }

            var3.m6000((NNuU)this.u[0]);
            var2.remove();
         }
      } catch (Exception var10) {
         ((Logger)f3000[0]).error(var10.getMessage(), var10.getCause());
         Boolean var9 = false;
         this.N[1] = var9;
         ((List)var1.f1000[0]).clear();
         ((List)var1.f1000[1]).clear();
      }
   }

   private void m12000(C1241 var1) {
      ((List)var1.f1000[1]).removeIf(var1x -> {
         var1x.m6000((NNuU)this.u[0]);
         return f2000[0];
      });
      ((List)var1.f1000[0]).clear();
      ((List)var1.f1000[1]).clear();
   }

   public int m8000() {
      return this.m24000() - 1;
   }

   public int m16000() {
      return this.m24000() + 1;
   }

   public int m24000() {
      return 3;
   }
}
