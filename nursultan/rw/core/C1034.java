package rw.core;

import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import rw.NursultanClient;
import rw.data.IltrpOnqk;
import rw.gui.ChatHelper;

public class C1034 extends Base1017 {
   private static String[] f1000;

   private void m4000(C0703 var1) {
      String var2 = var1.m20000();
      String[] var3 = new String[]{f1000[3], f1000[4], f1000[5]};
      String[] var4 = new String[]{f1000[6], f1000[7]};
      long var5 = rw.setting.C0160.m56000().orElse(10L) - 10L;

      for (String var10 : var3) {
         if (var2.endsWith(var10)) {
            for (String var14 : var4) {
               if (var2.startsWith(var14)) {
                  var1.m18000(var2.replace(var10, " " + var5));
                  return;
               }
            }
         }
      }
   }

   public C1034(ChatHelper var1, String var2, boolean var3) {
      super(var1, var2, var3);
   }

   static {
      ntfClinit();
   }

   public void m24000(Object var1) {
      if (var1 instanceof C0703 var2) {
         if (!this.m26000(var2)) {
            if (!this.m32000(var2)) {
               this.m4000(var2);
            }
         }
      }
   }

   private boolean m26000(C0703 var1) {
      if (var1.m20000().equals(f1000[0])) {
         var1.m18000("ah " + ((NNNwS)((NNuU)this.y[0]).T[4]).method_5820());
         return (boolean)1;
      } else {
         return (boolean)0;
      }
   }

   private static void m6000() {
      f1000 = new String[]{"ah me", "tpa ", "call ", " full", " max", " all", "pay ", "clan invest "};
   }

   private boolean m32000(C0703 var1) {
      String var2 = var1.m20000();
      C0153 var3 = NursultanClient.m100000();

      for (String var7 : new String[]{f1000[1], f1000[2]}) {
         if (var2.startsWith(var7)) {
            for (IltrpOnqk var9 : var3.m12000()) {
               if (var2.equals(var7 + var9.m8000())) {
                  var1.m18000(var7 + var9.m12000());
                  return (boolean)1;
               }
            }

            return (boolean)0;
         }
      }

      return (boolean)0;
   }
}
