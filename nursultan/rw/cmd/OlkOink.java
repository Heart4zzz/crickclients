package rw.cmd;

import KDFzREm.NNNwS;
import KDFzREm.NNYH;
import KDFzREm.NNqv;
import KDFzREm.NNuU;
import KDFzREm.NQo;
import KDFzREm.NkQ;
import KDFzREm.Nog;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import rw.NursultanClient;
import rw.core.C0777;
import rw.setting.C0135;

public class OlkOink extends Socket {
   private static String[] f1000;

   private void m4000() {
      NNYH var2 = (NNYH)((NNuU)this.y[0]).v[3];
      if (var2 instanceof NNqv var1) {
         NkQ var8 = (NkQ)var1.E();
         int var3 = var8.E().method_5439();
         int var4 = 0;

         for (C0135 var6 : C0777.m22000()) {
            NQo var7 = var6.m36000();
            if (var4 < var3) {
               var8.N(var4, var8.z(), var7);
               var4++;
            } else if (!((NNNwS)((NNuU)this.y[0]).T[4]).method_31548().M(var7) && !var7.R()) {
               ((NNNwS)((NNuU)this.y[0]).T[4]).method_7328(var7, (boolean)0);
            }
         }
      }
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      f1000 = new String[]{"debug", "load"};
   }

   public void m14000(CommandDispatcher<Nog> var1) {
      var1.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)this.N(f1000[0]).requires(var0 -> (Boolean)NursultanClient.f13000[3]))
            .then(this.N(f1000[1]).executes(var1x -> {
               this.m4000();
               return 1;
            }))
      );
   }
}
