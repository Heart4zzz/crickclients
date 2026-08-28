package rw.cmd;

import KDFzREm.NKi;
import KDFzREm.NKu;
import KDFzREm.NNNoB;
import KDFzREm.NNag;
import KDFzREm.NPh;
import KDFzREm.Nod;
import KDFzREm.Nog;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.tree.LiteralCommandNode;
import rw.NursultanClient;
import rw.core.C1188;
import rw.setting.C0106;

public class Nuker extends Socket {
   private static String[] f1000;
   private static String[] f2000;
   private static boolean[] f3000;
   private static boolean[] f4000;
   private static String[] f5000;
   private static String[] f6000;
   private static String[] f7000;
   private static boolean[] f8000;
   private static String[] f9000;
   public Object[] f10000;

   private static void m2000() {
      f3000 = new boolean[]{true, false, true, true};
      f4000 = new boolean[]{false, false, true, false, true};
      f8000 = new boolean[]{true, false, true, false, true, false, true, true};
   }

   private LiteralArgumentBuilder<Nog> m6000() {
      return (LiteralArgumentBuilder<Nog>)this.N(f5000[5])
         .then(this.N(f5000[6], new NukerHandler()).executes(var1 -> this.m60000(NukerHandler.m24000(var1, f9000[2]))));
   }

   public Nuker() {
      this.m14000();
      rw.gui.Nuker var5 = NursultanClient.m88000().m50000();
      this.f10000[0] = var5;
   }

   static {
      ntfClinit();
   }

   private void m14000() {
      if (this.f10000 == null) {
         this.f10000 = new Object[f8000[7]];
         Object[] var1 = this.f10000;
      }
   }

   private static void m18000() {
      f1000 = new String[]{"nuker", "nuk", "nuker.added"};
      f2000 = new String[]{"nuker.exists", "nuker.not-found"};
      f7000 = new String[]{"nuker.removed", "nuker.empty-list"};
      f6000 = new String[]{"nuker.cleared", "nuker.empty-list", "nuker.list-header"};
      f5000 = new String[]{"nuker.list-entry", " ", "total", "list", "clear", "remove", "block", "add"};
      f9000 = new String[]{"block", "block", "block"};
   }

   private int m24000() {
      this.m14000();
      String var1;
      if (((rw.gui.Nuker)this.f10000[0]).m4000().isEmpty()) {
         var1 = f7000[1];
      } else {
         ((rw.gui.Nuker)this.f10000[0]).m4000();
         var1 = f6000[0];
      }

      C0106.m32000(C1188.m12000(var1).N(NPh.field_1080));
      return f8000[0];
   }

   private LiteralArgumentBuilder<Nog> m40000() {
      return (LiteralArgumentBuilder<Nog>)this.N(f5000[7])
         .then(this.N(f9000[0], new C0025(Nod.N(NNNoB.N()))).executes(var1 -> this.m62000(C0025.m16000(var1, f9000[1]))));
   }

   private int m44000() {
      this.m14000();
      if (((rw.gui.Nuker)this.f10000[0]).m4000().isEmpty()) {
         C0106.m32000(C1188.m12000(f6000[1]).N(NPh.field_1080));
         return f8000[1];
      } else {
         C0106.m32000(C1188.m12000(f6000[2]).N(NPh.field_1080));

         for (NKi var2 : ((rw.gui.Nuker)this.f10000[0]).m4000()) {
            String var10000 = f5000[0];
            Object[] var10001 = new Object[f8000[2]];
            var10001[f8000[3]] = NPh.field_1068 + var2.M().getString() + NPh.field_1080;
            NNag var3 = C1188.m16000(var10000, var10001).N(NPh.field_1061).i(f5000[1]);
            C0106.m32000(var3);
         }

         String var4 = f5000[2];
         Object[] var5 = new Object[f8000[4]];
         var5[f8000[5]] = ((rw.gui.Nuker)this.f10000[0]).m4000().size();
         C0106.m32000(C1188.m16000(var4, var5).N(NPh.field_1080));
         return f8000[6];
      }
   }

   private LiteralArgumentBuilder<Nog> m54000() {
      return (LiteralArgumentBuilder<Nog>)this.N(f5000[3]).executes(var1 -> this.m44000());
   }

   private int m60000(NKi var1) {
      this.m14000();
      Object var2 = var1.M().getString();
      if (!((rw.gui.Nuker)this.f10000[0]).m12000(var1)) {
         C0106.m32000(C1188.m16000(f2000[1], NPh.field_1068 + var2 + NPh.field_1080).N(NPh.field_1080));
         return 0;
      } else {
         C0106.m32000(C1188.m16000(f7000[0], NPh.field_1068 + var2 + NPh.field_1080).N(NPh.field_1080));
         return 1;
      }
   }

   private int m62000(NKu var1) {
      this.m14000();
      NKi var2 = var1.N().i();
      Object var3 = var2.M().getString();
      String var4 = ((rw.gui.Nuker)this.f10000[0]).m26000(var2) ? f1000[2] : f2000[0];
      C0106.m32000(C1188.m16000(var4, NPh.field_1068 + var3 + NPh.field_1080).N(NPh.field_1080));
      return 1;
   }

   public void m10000(CommandDispatcher<Nog> var1) {
      LiteralCommandNode var2 = var1.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)this.N(f1000[0]).then(this.m40000()))
                  .then(this.m6000()))
               .then(this.m68000()))
            .then(this.m54000())
      );
      var1.register((LiteralArgumentBuilder)this.N(f1000[1]).redirect(var2));
   }

   private LiteralArgumentBuilder<Nog> m68000() {
      return (LiteralArgumentBuilder<Nog>)this.N(f5000[4]).executes(var1 -> this.m24000());
   }
}
