package rw.setting;

import KDFzREm.NCW;
import KDFzREm.NNNNRZ;
import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import KDFzREm.NQl;
import KDFzREm.NQo;
import KDFzREm.NYj;
import KDFzREm.NkS;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import rw.NursultanClient;
import rw.core.Base1148;
import rw.core.C0721;
import rw.core.C1193;
import rw.core.C1235;
import rw.data.Rec0267;
import rw.data.Rec0276;
import rw.gui.C0110;
import rw.module.AutoAccept;

public class OlmnOtit extends Base1148<C0110> {
   public Object[] f1000;
   private static float[] f2000;
   private static String[] f3000;
   public static Object[] f4000;

   private void m4000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[1];
         Object[] var1 = this.f1000;
      }
   }

   private static void m8000() {
      f4000 = new Object[]{10000L, 4000L};
   }

   public OlmnOtit(C0110 var1, String var2, boolean var3) {
      super(var1, var2, var3);
      this.m4000();
      HashMap var8 = new HashMap();
      this.f1000[0] = var8;
   }

   static {
      ntfClinit();
   }

   private static void m18000() {
      f2000 = new float[]{0.0F, 7.0F};
   }

   public void m24000(Object var1) {
      this.m4000();
      Objects.requireNonNull(var1);
      switch (var1) {
         case AutoAccept var4 when var4.m6000() instanceof Object var5:
            this.m34000((NCW)var5);
            break;
         case C0721 var6:
            ((Map)this.f1000[0]).entrySet().removeIf(var0 -> (boolean)(System.currentTimeMillis() - var0.getValue() > 10000L ? 1 : 0));
            break;
         default:
      }
   }

   private void m34000(NCW var1) {
      this.m4000();
      if (var1.N() == 0 && (NNNwS)((NNuU)this.N[0]).T[4] != null) {
         NQo var2 = var1.L();
         int var3 = var1.y();
         NYj var4 = ((NkS)((NNNwS)((NNuU)this.N[0]).T[4]).fields_07fa3311b0e9d3e9b883d09222919bf5a[2]).L(var3);
         if (var4.R() && var2.W()) {
            NQl var5 = var2.B();
            float var6 = C1193.m10000(var2);
            if (!(var6 < f2000[0]) && !(var6 > f2000[1])) {
               NQo var7 = var4.i();
               if (var7.W() && var7.P() < var2.P()) {
                  long var8 = System.currentTimeMillis();
                  Long var10 = (Long)((Map)this.f1000[0]).get(var3);
                  if (var10 == null || var8 - var10 >= 10000L) {
                     ((Map)this.f1000[0]).put(var3, var8);
                     if (var3 > 4 && var3 < 9 && var5.R().N(NNNNRZ.o)) {
                        m38000(var2, f3000[0]);
                     } else if (((NNNwS)((NNuU)this.N[0]).T[4]).method_31548().N() + 36 == var3) {
                        NQo var11 = ((NNNwS)((NNuU)this.N[0]).T[4]).method_6047();
                        if (!var11.R()) {
                           m38000(var11, f3000[1]);
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private static void m38000(NQo var0, String var1) {
      NursultanClient.m70000().m18000().m4000().m46000(new Rec0276(var0.t())).m34000(new Rec0267(C1235.m36000(var1))).m38000(4000L).m44000();
   }

   private static void m40000() {
      f3000 = new String[]{"item-almost-break", "item-in-hand-almost-break"};
   }
}
