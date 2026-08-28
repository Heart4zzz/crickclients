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
import rw.core.C0967;
import rw.core.C1188;
import rw.core.OlsmIit;
import rw.data.OliOkkns;
import rw.render.ShaderTypes;
import rw.setting.C0106;

public class C0001 extends Socket {
   private static String[] f1000;
   private static String[] f2000;
   public Object[] f3000;
   private static String[] f4000;

   private int m2000() {
      this.m14000();
      if (((ShaderTypes)this.f3000[0]).m10000().isEmpty()) {
         C0106.m32000(C1188.m12000(f2000[5]).N(NPh.field_1080));
         return 0;
      } else {
         C0106.m32000(C1188.m12000(f2000[6]).N(NPh.field_1080));

         for (OliOkkns var2 : ((ShaderTypes)this.f3000[0]).m10000()) {
            NFC var3 = new NFC((Character)C0013.f1000[1] + "friend remove " + var2.m6000());
            NNag var4 = C1188.m12000(f2000[7]).N(NPh.field_1061).L(NAd.N.N(var3));
            NNag var5 = C1188.m16000(f1000[0], NPh.field_1068 + var2.m6000() + NPh.field_1080, NPh.field_1068 + C0967.m58000(var2.m8000()) + NPh.field_1080)
               .N(NPh.field_1061)
               .i(f1000[1])
               .y(var4);
            C0106.m32000(var5);
         }

         C0106.m32000(C1188.m16000(f1000[2], ((ShaderTypes)this.f3000[0]).m10000().size()).N(NPh.field_1080));
         return 1;
      }
   }

   public C0001() {
      this.m14000();
      ShaderTypes var5 = NursultanClient.m68000();
      this.f3000[0] = var5;
   }

   static {
      ntfClinit();
   }

   private LiteralArgumentBuilder<Nog> m18000() {
      return (LiteralArgumentBuilder<Nog>)this.N(f4000[2]).then(this.N(f4000[3], new FriendX()).executes(var1 -> this.m60000(FriendX.m22000(var1, f4000[6]))));
   }

   private LiteralArgumentBuilder<Nog> m20000() {
      return (LiteralArgumentBuilder<Nog>)this.N(f4000[4]).executes(var1 -> this.m2000());
   }

   private int m26000() {
      this.m14000();
      String var1;
      if (((ShaderTypes)this.f3000[0]).m10000().isEmpty()) {
         var1 = f1000[3];
      } else {
         ((ShaderTypes)this.f3000[0]).m20000();
         var1 = f1000[4];
      }

      C0106.m32000(C1188.m12000(var1).N(NPh.field_1080));
      return 1;
   }

   private LiteralArgumentBuilder<Nog> m42000() {
      return (LiteralArgumentBuilder<Nog>)this.N(f4000[5]).executes(var1 -> this.m26000());
   }

   private LiteralArgumentBuilder<Nog> m46000() {
      return (LiteralArgumentBuilder<Nog>)this.N(f4000[0]).then(this.N(f4000[1], new OlsmIit()).executes(var1 -> this.m68000(Socket.m20000(var1, f4000[7]))));
   }

   private static void m56000() {
      f2000 = new String[]{"friend", "fr", "friend.added", "friend.exists", "friend.removed", "friend.empty-list", "friend.list-header", "remove"};
      f1000 = new String[]{"friend.list-entry", " ", "total", "friend.empty-list", "friend.cleared"};
      f4000 = new String[]{"add", "name", "remove", "name", "list", "clear", "name", "name"};
   }

   private int m60000(OliOkkns var1) {
      this.m14000();
      Object var2 = var1.m6000();
      ((ShaderTypes)this.f3000[0]).m14000((String)var2);
      C0106.m32000(C1188.m16000(f2000[4], NPh.field_1068 + var2 + NPh.field_1080).N(NPh.field_1080));
      return 1;
   }

   public void m10000(CommandDispatcher<Nog> var1) {
      LiteralCommandNode var2 = var1.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)this.N(f2000[0]).then(this.m46000()))
                  .then(this.m18000()))
               .then(this.m20000()))
            .then(this.m42000())
      );
      var1.register((LiteralArgumentBuilder)this.N(f2000[1]).redirect(var2));
   }

   private void m14000() {
      if (this.f3000 == null) {
         this.f3000 = new Object[1];
         Object[] var1 = this.f3000;
      }
   }

   private int m68000(String var1) {
      this.m14000();
      String var2;
      if (((ShaderTypes)this.f3000[0]).m18000((String)var1, System.currentTimeMillis())) {
         var2 = f2000[2];
      } else {
         var2 = f2000[3];
      }

      C0106.m32000(C1188.m16000(var2, NPh.field_1068 + var1 + NPh.field_1080).N(NPh.field_1080));
      return 1;
   }
}
