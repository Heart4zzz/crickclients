package rw.cmd;

import KDFzREm.NAN;
import KDFzREm.NAd;
import KDFzREm.NFC;
import KDFzREm.NKi;
import KDFzREm.NKu;
import KDFzREm.NNNoB;
import KDFzREm.NNNqL;
import KDFzREm.NNaI;
import KDFzREm.NNag;
import KDFzREm.NPh;
import KDFzREm.Nal;
import KDFzREm.Nod;
import KDFzREm.Nog;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.util.List;
import rw.NursultanClient;
import rw.core.C1188;
import rw.data.Rec0182;
import rw.gui.C0050;
import rw.setting.C0106;

public class BlockEspCommand extends Socket {
   private static String[] f1000;
   private static short[] f2000;
   public Object[] f3000;
   private static String[] f4000;
   private static String[] f5000;
   private static String[] f6000;
   private static String[] f7000;
   private static short[] f8000;
   private static String[] f9000;
   private static String[] f10000;

   private int m12000() {
      this.m26000();
      if (((C0050)this.f3000[0]).m12000().isEmpty()) {
         C0106.m32000(C1188.m12000(f5000[6]).N(NPh.field_1080));
         return 0;
      } else {
         C0106.m32000(C1188.m12000(f5000[7]).N(NPh.field_1080));

         for (Rec0182 var2 : ((C0050)this.f3000[0]).m12000()) {
            NFC var3 = new NFC((Character)C0013.f1000[1] + "blockesp remove " + BlockEspHandler.m38000(var2.m6000()));
            NNag var4 = NAN.y(f9000[0]).y(C1188.m12000(f9000[1])).i(f1000[0]).N(NPh.field_1061).L(NAd.N.N(var3));
            NNag var5 = C1188.m12000(f1000[1]).N(NPh.field_1080).i(f1000[2]).y(this.m80000(var2.m6000(), var2.m4000())).i(f6000[0]).y(var4);
            C0106.m32000(var5);
         }

         C0106.m32000(C1188.m16000(f6000[1], ((C0050)this.f3000[0]).m12000().size()).N(NPh.field_1080));
         return 1;
      }
   }

   public BlockEspCommand() {
      this.m26000();
      C0050 var5 = NursultanClient.m88000().m110000();
      this.f3000[f8000[0]] = var5;
   }

   static {
      ntfClinit();
   }

   private static void m20000() {
      f8000 = new short[]{0, 0, 0};
      f2000 = new short[]{0, 0, 0, 0, 0, 0, 1, 0};
   }

   private void m26000() {
      if (this.f3000 == null) {
         this.f3000 = new Object[1];
         Object[] var1 = this.f3000;
      }
   }

   private LiteralArgumentBuilder<Nog> m58000() {
      return (LiteralArgumentBuilder<Nog>)this.N(f4000[5]).executes(var1 -> this.m12000());
   }

   private int m60000() {
      this.m26000();
      String var1;
      if (((C0050)this.f3000[0]).m12000().isEmpty()) {
         var1 = f5000[4];
      } else {
         ((C0050)this.f3000[0]).m4000();
         var1 = f5000[5];
      }

      C0106.m32000(C1188.m12000(var1).N(NPh.field_1080));
      return 1;
   }

   private static void m4000() {
      f7000 = new String[]{"blockesp", "blockesp.added", " (", ")", "blockesp.added-shulkers"};
      f5000 = new String[]{
         "blockesp.not-found", "blockesp.removed", " (", ")", "blockesp.empty-list", "blockesp.cleared", "blockesp.empty-list", "blockesp.list-header"
      };
      f9000 = new String[]{"[", "remove"};
      f1000 = new String[]{"]", "blockesp.list-entry", " ("};
      f6000 = new String[]{") ", "total", "add", "shulker", "color"};
      f4000 = new String[]{"block", "color", "remove", "block", "clear", "list", "block"};
      f10000 = new String[]{"block", "color", "block", "color"};
   }

   private int m6000(int var1) {
      this.m26000();
      List var2 = NNNqL.i.j().filter(var0 -> var0 instanceof Nal).map(var1x -> new Rec0182(var1x, var1)).toList();
      ((C0050)this.f3000[f8000[2]]).m58000(var2);
      C0106.m32000(C1188.m16000(f7000[4], var2.size()).N(NPh.field_1080));
      return 1;
   }

   private LiteralArgumentBuilder<Nog> m70000() {
      return (LiteralArgumentBuilder<Nog>)this.N(f4000[4]).executes(var1 -> this.m60000());
   }

   private LiteralArgumentBuilder<Nog> m76000() {
      return (LiteralArgumentBuilder<Nog>)this.N(f4000[2])
         .then(this.N(f4000[3], new BlockEspHandler()).executes(var1 -> this.m78000(BlockEspHandler.m22000(var1, f4000[6]))));
   }

   private int m78000(NKi var1) {
      this.m26000();
      Rec0182 var2 = ((C0050)this.f3000[0]).m30000(var1);
      if (var2 != null && ((C0050)this.f3000[0]).m38000(var1)) {
         C0106.m32000(C1188.m12000(f5000[1]).N(NPh.field_1080).i(f5000[2]).y(this.m80000(var1, var2.m4000())).i(f5000[3]));
         return 1;
      } else {
         C0106.m32000(C1188.m16000(f5000[0], BlockEspHandler.m38000(var1)).N(NPh.field_1080));
         return 0;
      }
   }

   private NNag m80000(NKi var1, int var2) {
      return NAN.y(var1.M().getString()).y(NAd.N.N(NNaI.N(var2 & 16777215)));
   }

   private int m82000(NKu var1, int var2) {
      this.m26000();
      NKi var3 = var1.N().i();
      ((C0050)this.f3000[f8000[1]]).m70000(new Rec0182(var3, var2));
      C0106.m32000(C1188.m12000(f7000[1]).N(NPh.field_1080).i(f7000[2]).y(this.m80000(var3, var2)).i(f7000[3]));
      return 1;
   }

   public void m14000(CommandDispatcher<Nog> var1) {
      var1.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)this.N(f7000[0]).then(this.m90000()))
                  .then(this.m76000()))
               .then(this.m70000()))
            .then(this.m58000())
      );
   }

   private LiteralArgumentBuilder<Nog> m90000() {
      return (LiteralArgumentBuilder<Nog>)((LiteralArgumentBuilder)this.N(f6000[2])
            .then(
               ((LiteralArgumentBuilder)this.N(f6000[3]).executes(var1 -> this.m6000(-1)))
                  .then(this.N(f6000[4], new BlockEspColor()).executes(var1 -> this.m6000(BlockEspColor.m32000(var1, f10000[3]))))
            ))
         .then(
            ((RequiredArgumentBuilder)this.N(f4000[0], new C0025(Nod.N(NNNoB.N()))).executes(var1 -> this.m82000(C0025.m16000(var1, f10000[2]), -1)))
               .then(this.N(f4000[1], new BlockEspColor()).executes(var1 -> this.m82000(C0025.m16000(var1, f10000[0]), BlockEspColor.m32000(var1, f10000[1]))))
         );
   }
}
