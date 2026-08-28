package rw.cmd;

import KDFzREm.NAd;
import KDFzREm.NFC;
import KDFzREm.NNag;
import KDFzREm.NPh;
import KDFzREm.Nog;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.tree.LiteralCommandNode;
import rw.NursultanClient;
import rw.core.C1188;
import rw.core.C1222;
import rw.data.Rec0305;
import rw.gui.PgUp;
import rw.setting.C0106;

public class C0014 extends Socket {
   private static boolean[] f1000;
   public Object[] f2000;
   private static boolean[] f3000;
   private static String[] f4000;
   private static String[] f5000;
   private static String[] f6000;
   private static boolean[] f7000;
   private static String[] f8000;

   private LiteralArgumentBuilder<Nog> m8000() {
      return (LiteralArgumentBuilder<Nog>)this.N(f6000[0])
         .then(
            this.N(f6000[1], AcceptApi3.m30000(20))
               .then(
                  this.N(f6000[2], new C0003())
                     .then(
                        this.N(f6000[3], new IlsOnqk())
                           .executes(
                              var1 -> this.m72000(
                                 Socket.m20000(var1, f6000[4]), IlsOnqk.m14000(var1, f6000[5]).getString(), C0003.m34000(var1, f6000[6]).m8000()
                              )
                           )
                     )
               )
         );
   }

   private int m10000() {
      this.m22000();
      String var1;
      if (((C1222)this.f2000[0]).m4000().isEmpty()) {
         var1 = f5000[3];
      } else {
         ((C1222)this.f2000[0]).m14000();
         var1 = f5000[4];
      }

      C0106.m32000(C1188.m12000(var1).N(NPh.field_1080));
      return 1;
   }

   public C0014() {
      this.m22000();
      C1222 var5 = NursultanClient.m90000();
      this.f2000[0] = var5;
   }

   static {
      ntfClinit();
   }

   private LiteralArgumentBuilder<Nog> m18000() {
      return (LiteralArgumentBuilder<Nog>)this.N(f8000[1]).then(this.N(f8000[2], new C0026()).executes(var1 -> this.m68000(C0026.m18000(var1, f6000[7]))));
   }

   private void m22000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[1];
         Object[] var1 = this.f2000;
      }
   }

   private static void m48000() {
      f4000 = new String[]{"macros", "mac", "macros.added", "macros.exists", "macros.removed", "macros.empty-list", "macros.list-header", "remove"};
      f5000 = new String[]{"macros.list-entry", " ", "total", "macros.empty-list", "macros.cleared", "clear"};
      f8000 = new String[]{"list", "remove", "name"};
      f6000 = new String[]{"add", "name", "key", "message", "name", "message", "key", "name"};
   }

   private LiteralArgumentBuilder<Nog> m54000() {
      return (LiteralArgumentBuilder<Nog>)this.N(f8000[0]).executes(var1 -> this.m62000());
   }

   private int m62000() {
      this.m22000();
      if (((C1222)this.f2000[0]).m4000().isEmpty()) {
         C0106.m32000(C1188.m12000(f4000[5]).N(NPh.field_1080));
         return f7000[1];
      } else {
         C0106.m32000(C1188.m12000(f4000[6]).N(NPh.field_1080));

         for (Rec0305 var2 : ((C1222)this.f2000[0]).m4000()) {
            NFC var3 = new NFC((Character)C0013.f1000[1] + "macros remove " + var2.m2000());
            NNag var4 = C1188.m12000(f4000[7]).N(NPh.field_1061).L(NAd.N.N(var3));
            String var10000 = f5000[0];
            Object[] var10001 = new Object[3];
            var10001[f7000[2]] = NPh.field_1068 + var2.m2000();
            var10001[f7000[3]] = NPh.field_1068 + PgUp.m76000(var2.m10000()).m68000();
            var10001[2] = NPh.field_1068 + var2.m8000();
            NNag var5 = C1188.m16000(var10000, var10001).N(NPh.field_1080).i(f5000[1]).y(var4);
            C0106.m32000(var5);
         }

         String var6 = f5000[2];
         Object[] var7 = new Object[f7000[4]];
         var7[f7000[5]] = ((C1222)this.f2000[0]).m4000().size();
         C0106.m32000(C1188.m16000(var6, var7).N(NPh.field_1080));
         return f7000[6];
      }
   }

   private static void m66000() {
      f3000 = new boolean[]{false, true, true, true, false};
      f7000 = new boolean[]{true, false, false, true, true, false, true};
      f1000 = new boolean[]{true, true};
   }

   private int m68000(Rec0305 var1) {
      this.m22000();
      Object var2 = var1.m2000();
      ((C1222)this.f2000[0]).m24000((String)var2);
      C0106.m32000(C1188.m16000(f4000[4], NPh.field_1068 + var2 + NPh.field_1080).N(NPh.field_1080));
      return f7000[0];
   }

   public void m12000(CommandDispatcher<Nog> var1) {
      LiteralCommandNode var2 = var1.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)this.N(f4000[0]).then(this.m8000()))
                  .then(this.m18000()))
               .then(this.m54000()))
            .then(this.m76000())
      );
      var1.register((LiteralArgumentBuilder)this.N(f4000[1]).redirect(var2));
   }

   private int m72000(String var1, String var2, int var3) {
      this.m22000();
      String var4 = ((C1222)this.f2000[0]).m18000((String)var1, var2, var3) ? f4000[2] : f4000[3];
      C0106.m32000(C1188.m16000(var4, NPh.field_1068 + var1 + NPh.field_1080, NPh.field_1068 + PgUp.m76000(var3).m68000() + NPh.field_1080).N(NPh.field_1080));
      return 1;
   }

   private LiteralArgumentBuilder<Nog> m76000() {
      return (LiteralArgumentBuilder<Nog>)this.N(f5000[5]).executes(var1 -> this.m10000());
   }
}
