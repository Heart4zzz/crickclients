package rw.cmd;

import KDFzREm.NAd;
import KDFzREm.NFC;
import KDFzREm.NNNwS;
import KDFzREm.NNag;
import KDFzREm.NNuU;
import KDFzREm.NPh;
import KDFzREm.Nog;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import org.joml.Vector2d;
import rw.NursultanClient;
import rw.core.C0607;
import rw.core.C1188;
import rw.setting.C0106;

public class C0017 extends Socket {
   private static String[] f1000;
   private static String[] f2000;
   public Object[] f3000;

   private LiteralArgumentBuilder<Nog> m6000() {
      return (LiteralArgumentBuilder<Nog>)this.N(f2000[6]).executes(var1 -> this.m10000());
   }

   private int m10000() {
      this.m14000();
      ((C0607)this.f3000[0]).m16000();
      return 1;
   }

   public C0017() {
      this.m14000();
      C0607 var5 = NursultanClient.m22000();
      this.f3000[0] = var5;
   }

   static {
      ntfClinit();
   }

   private int m12000() {
      this.m14000();
      if (((C0607)this.f3000[0]).m24000()) {
         NFC var1 = new NFC((Character)C0013.f1000[1] + "gps off");
         NNag var2 = C1188.m12000(f2000[1]).N(NPh.field_1061).L(NAd.N.N(var1));
         NNag var3 = C1188.m16000(
               f2000[2],
               "" + NPh.field_1068 + ((C0607)this.f3000[0]).m12000().x() + NPh.field_1080,
               "" + NPh.field_1068 + ((C0607)this.f3000[0]).m12000().y() + NPh.field_1080
            )
            .i(f2000[3])
            .y(var2);
         C0106.m32000(var3);
      } else {
         C0106.m32000(C1188.m12000(f2000[4]).N(NPh.field_1080));
      }

      return 1;
   }

   private LiteralArgumentBuilder<Nog> m18000() {
      return (LiteralArgumentBuilder<Nog>)this.N(f1000[0]).executes(var1 -> this.m12000());
   }

   private RequiredArgumentBuilder<Nog, Vector2d> m22000() {
      return (RequiredArgumentBuilder<Nog, Vector2d>)this.N(f2000[5], new C0022()).executes(var1 -> {
         Vector2d var2 = C0022.m8000(var1, f1000[1]);
         return this.m36000(var2.x, var2.y);
      });
   }

   private static void m24000() {
      f2000 = new String[]{"gps", "remove", "command.gps.info-enabled", " ", "command.gps.info-disabled", "pos", "off"};
      f1000 = new String[]{"info", "pos"};
   }

   private int m36000(double var1, double var3) {
      this.m14000();
      ((C0607)this.f3000[0]).m20000(var1, var3);
      return 1;
   }

   public void m12000(CommandDispatcher<Nog> var1) {
      var1.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)this.N(f2000[0])
                     .executes(var1x -> this.m36000(((NNNwS)((NNuU)this.y[0]).T[4]).method_23317(), ((NNNwS)((NNuU)this.y[0]).T[4]).method_23321())))
                  .then(this.m18000()))
               .then(this.m6000()))
            .then(this.m22000())
      );
   }

   private void m14000() {
      if (this.f3000 == null) {
         this.f3000 = new Object[1];
         Object[] var1 = this.f3000;
      }
   }
}
