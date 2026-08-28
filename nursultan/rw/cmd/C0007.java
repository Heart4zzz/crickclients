package rw.cmd;

import KDFzREm.NAd;
import KDFzREm.NFC;
import KDFzREm.NNag;
import KDFzREm.NPh;
import KDFzREm.Nog;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import rw.GuiWidget;
import rw.NursultanClient;
import rw.core.C0591;
import rw.core.C1188;
import rw.defs.BootstrapMethods;
import rw.gui.PgUp;
import rw.setting.C0106;

public class C0007 extends Socket {
   private static String[] f1000;
   private static String[] f2000;
   private static String[] f3000;
   private static String[] f4000;

   private int m2000() {
      C0106.m32000(C1188.m12000(f1000[5]).N(NPh.field_1080));

      for (GuiWidget var2 : NursultanClient.m88000().m152000()) {
         if (!var2.m54000().m14000()) {
            this.m62000(var2, (boolean)0);
         }
      }

      return 1;
   }

   static {
      ntfClinit();
   }

   private LiteralArgumentBuilder<Nog> m18000() {
      return (LiteralArgumentBuilder<Nog>)this.N(f1000[6]).executes(var1 -> this.m2000());
   }

   private LiteralArgumentBuilder<Nog> m22000() {
      return (LiteralArgumentBuilder<Nog>)this.N(f2000[2])
         .then(
            this.N(f2000[3], new OlrtpInt())
               .then(
                  ((RequiredArgumentBuilder)this.N(f2000[4], new C0003())
                        .executes(
                           var1 -> this.m66000(OlrtpInt.m24000(var1, f3000[2]), C0003.m34000(var1, f3000[3]), (BootstrapMethods)BootstrapMethods.f3000[0])
                        ))
                     .then(
                        this.N(f2000[5], new C0034())
                           .executes(var1 -> this.m66000(OlrtpInt.m24000(var1, f2000[6]), C0003.m34000(var1, f3000[0]), C0034.m16000(var1, f3000[1])))
                     )
               )
         );
   }

   private static void m48000() {
      f4000 = new String[]{"bind", "bind.added"};
      f1000 = new String[]{"bind.removed", "remove", "bind.list-entry", " ", "bind.empty-list", "bind.cleared", "clear", "list"};
      f2000 = new String[]{"remove", "module", "add", "module", "key", "type", "module"};
      f3000 = new String[]{"key", "type", "module", "key", "module"};
   }

   private LiteralArgumentBuilder<Nog> m52000() {
      return (LiteralArgumentBuilder<Nog>)this.N(f2000[0])
         .then(this.N(f2000[1], new C0591()).executes(var1 -> this.m62000(OlrtpInt.m24000(var1, f3000[4]), true)));
   }

   private LiteralArgumentBuilder<Nog> m56000() {
      return (LiteralArgumentBuilder<Nog>)this.N(f1000[7]).executes(var1 -> this.m72000());
   }

   private int m62000(GuiWidget var1, boolean var2) {
      var1.m44000((PgUp)PgUp.f4000[0], 0, (BootstrapMethods)BootstrapMethods.f3000[0], (boolean)1);
      if (var2) {
         C0106.m32000(C1188.m16000(f1000[0], NPh.field_1068 + var1.m42000() + NPh.field_1080).N(NPh.field_1080));
      }

      return 1;
   }

   public void m12000(CommandDispatcher<Nog> var1) {
      var1.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)this.N(f4000[0]).then(this.m22000()))
                  .then(this.m52000()))
               .then(this.m56000()))
            .then(this.m18000())
      );
   }

   private int m66000(GuiWidget var1, PgUp var2, BootstrapMethods var3) {
      var1.m44000(var2, 0, var3, var1.m54000().m54000());
      C0106.m32000(
         C1188.m16000(
               f4000[1],
               NPh.field_1068 + var2.m68000() + NPh.field_1080,
               NPh.field_1068 + var1.m42000() + NPh.field_1080,
               NPh.field_1068 + var3.m38000().toUpperCase() + NPh.field_1080
            )
            .N(NPh.field_1080)
      );
      return 1;
   }

   private int m72000() {
      byte var1 = 1;

      for (GuiWidget var3 : NursultanClient.m88000().m152000()) {
         if (!var3.m54000().m14000()) {
            NFC var4 = new NFC((Character)C0013.f1000[1] + "bind remove " + var3.m42000());
            NNag var5 = C1188.m12000(f1000[1]).N(NPh.field_1061).L(NAd.N.N(var4));
            Object var6 = var3.m54000().m28000();
            NNag var7 = C1188.m16000(
                  f1000[2],
                  NPh.field_1068 + var3.m42000() + NPh.field_1080,
                  NPh.field_1068 + var6 + NPh.field_1080,
                  NPh.field_1068 + var3.m54000().m18000().m38000().toUpperCase() + NPh.field_1080
               )
               .N(NPh.field_1080)
               .i(f1000[3])
               .y(var5);
            C0106.m32000(var7);
            var1 = 0;
         }
      }

      if (var1 != 0) {
         C0106.m32000(C1188.m12000(f1000[4]).N(NPh.field_1080));
      }

      return 1;
   }
}
