package rw.cmd;

import KDFzREm.NPh;
import KDFzREm.Nog;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import rw.NursultanClient;
import rw.api.Iface0029;
import rw.core.C0956;
import rw.core.C0959;
import rw.core.C1183;
import rw.core.C1188;
import rw.core.OlijtlOl;
import rw.core.TimeApi;
import rw.core.TimeApi3;
import rw.core.TimeApi4;
import rw.defs.AcceptPart;
import rw.defs.OlrkOij;
import rw.net.PacketHandlers;
import rw.setting.C0106;

public class Time extends Socket {
   private static short[] f1000;
   private static String[] f2000;
   private static float[] f3000;
   private static String[] f4000;
   public Object[] f5000;
   private static short[] f6000;
   private static short[] f7000;
   private static String[] f8000;
   private static short[] f9000;
   private static String[] f10000;
   private static String[] f11000;
   private static String[] f12000;
   public static Object[] f13000;

   private int m2000(int var1) {
      if (!this.N()) {
         return 1;
      } else {
         ((C0959)NursultanClient.f13000[2]).m2000(var1);
         this.m102000(OlijtlOl.m4000());
         C0106.m32000(C1188.m12000(f8000[4]).N(NPh.field_1080));
         return 1;
      }
   }

   private void m4000() {
      if (this.f5000 == null) {
         this.f5000 = new Object[1];
         Object[] var1 = this.f5000;
      }
   }

   private static void m12000() {
      f3000 = new float[]{1000.0F, 0.1F, 0.0F};
   }

   private static void m22000() {
      f13000 = new Object[]{3000};
   }

   public Time() {
      this.m4000();
      C0956 var5 = new C0956();
      this.f5000[0] = var5;
   }

   static {
      ntfClinit();
   }

   private static void m28000() {
      f8000 = new String[]{"irc", "irc.self", "irc.prefix.cleared", "irc.prefix.already", "irc.prefix.installed", "irc.wait-before-send"};
      f10000 = new String[]{"prefix", "list", "page", "reset", "set", "index"};
      f11000 = new String[]{"text", "dm", "login", "message"};
      f12000 = new String[]{"mute", "login"};
      f2000 = new String[]{"time", "reason", "unmute", "login", "login"};
      f4000 = new String[]{"login", "time", "reason", "login", "message", "text", "index", "page"};
   }

   private boolean m50000() {
      this.m4000();
      return (boolean)(!((C0956)this.f5000[0]).m20000(3000L) && !((OlrkOij)OlrkOij.f1000[0]).m44000(((C0959)NursultanClient.f13000[2]).m22000()) ? 0 : 1);
   }

   private RequiredArgumentBuilder<Nog, String> m58000() {
      return (RequiredArgumentBuilder<Nog, String>)this.N(f11000[0], new AcceptApi()).executes(var1 -> this.m76000(Socket.m20000(var1, f4000[5])));
   }

   private LiteralArgumentBuilder<Nog> m66000() {
      return (LiteralArgumentBuilder<Nog>)((LiteralArgumentBuilder)((LiteralArgumentBuilder)this.N(f10000[0])
               .then(
                  ((LiteralArgumentBuilder)this.N(f10000[1]).executes(var1 -> this.m14000(0)))
                     .then(this.N(f10000[2], IntegerArgumentType.integer(0)).executes(var1 -> this.m14000(IntegerArgumentType.getInteger(var1, f4000[7]))))
               ))
            .then(this.N(f10000[3]).executes(var1 -> this.m88000())))
         .then(
            this.N(f10000[4])
               .then(this.N(f10000[5], IntegerArgumentType.integer(0)).executes(var1 -> this.m2000(IntegerArgumentType.getInteger(var1, f4000[6]))))
         );
   }

   private int m76000(String var1) {
      this.m4000();
      if (!this.N()) {
         return 1;
      } else if (this.m50000()) {
         String var2 = var1.trim();
         this.m102000(new rw.core.AcceptApi((AcceptPart)AcceptPart.f5000[0], var2));
         ((C0956)this.f5000[0]).m18000();
         return 1;
      } else {
         this.m100000();
         return 1;
      }
   }

   private LiteralArgumentBuilder<Nog> m86000() {
      return (LiteralArgumentBuilder<Nog>)((LiteralArgumentBuilder)this.N(f2000[2])
            .requires(var0 -> ((OlrkOij)OlrkOij.f1000[0]).m44000(((C0959)NursultanClient.f13000[2]).m22000())))
         .then(this.N(f2000[3], StringArgumentType.word()).executes(var1 -> this.m126000(StringArgumentType.getString(var1, f2000[4]))));
   }

   private int m88000() {
      if (!this.N()) {
         return 1;
      } else {
         if (((C0959)NursultanClient.f13000[2]).m4000() != -1) {
            ((C0959)NursultanClient.f13000[2]).m2000(-1);
            this.m102000(OlijtlOl.m4000());
            C0106.m32000(C1188.m12000(f8000[2]).N(NPh.field_1080));
         } else {
            C0106.m32000(C1188.m12000(f8000[3]).N(NPh.field_1080));
         }

         return 1;
      }
   }

   private static void m8000() {
      f7000 = new short[]{0, 0, 2, 0, 0};
      f1000 = new short[]{2, 0, 2, 2};
      f9000 = new short[]{2, 0, 0, 2, 0, 0, 2};
      f6000 = new short[]{0, 2, 3000};
   }

   private void m100000() {
      this.m4000();
      long var1 = 3000L - ((C0956)this.f5000[0]).m14000();
      if (var1 < 0L) {
         var1 = 0L;
      }

      float var3 = C1183.m32000((float)var1 / f3000[0], f3000[1]);
      var3 = Math.max(f3000[2], var3);
      C0106.m32000(C1188.m16000(f8000[5], var3).N(NPh.field_1080));
   }

   private int m14000(int var1) {
      if (!this.N()) {
         return 1;
      } else {
         this.m102000(new TimeApi(var1));
         return 1;
      }
   }

   public void m16000(CommandDispatcher<Nog> var1) {
      LiteralArgumentBuilder var2 = (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)this.N(f8000[0])
                  .requires(var0 -> NursultanClient.m88000().m22000().U()))
               .then(this.m58000()))
            .then(this.m122000()))
         .then(this.m66000());
      if (((OlrkOij)OlrkOij.f1000[0]).m44000(((C0959)NursultanClient.f13000[2]).m22000())) {
         ((LiteralArgumentBuilder)var2.then(this.m116000())).then(this.m86000());
      }

      var1.register(var2);
   }

   private void m102000(PacketHandlers<Iface0029> var1) {
      NursultanClient.m82000().m56000(var1);
   }

   private int m104000(String var1, int var2, String var3) {
      if (!this.N()) {
         return 1;
      } else {
         this.m102000(new rw.core.TimeApi2(var1, var3, var2));
         return 1;
      }
   }

   private int m112000(String var1, String var2) {
      this.m4000();
      if (!this.N()) {
         return 1;
      } else if (var1.equalsIgnoreCase(((C0959)NursultanClient.f13000[2]).m20000())) {
         C0106.m32000(C1188.m12000(f8000[1]).N(NPh.field_1080));
         return 1;
      } else if (this.m50000()) {
         this.m102000(new TimeApi4(var1, var2));
         ((C0956)this.f5000[0]).m18000();
         return 1;
      } else {
         this.m100000();
         return 1;
      }
   }

   private LiteralArgumentBuilder<Nog> m116000() {
      return (LiteralArgumentBuilder<Nog>)((LiteralArgumentBuilder)this.N(f12000[0])
            .requires(var0 -> ((OlrkOij)OlrkOij.f1000[f6000[0]]).m44000(((C0959)NursultanClient.f13000[f6000[1]]).m22000())))
         .then(
            this.N(f12000[1], new C0038())
               .then(
                  this.N(f2000[0], new C0015())
                     .then(
                        this.N(f2000[1], new TimeApi2())
                           .executes(
                              var1 -> this.m104000(Socket.m20000(var1, f4000[0]), IntegerArgumentType.getInteger(var1, f4000[1]), Socket.m20000(var1, f4000[2]))
                           )
                     )
               )
         );
   }

   private LiteralArgumentBuilder<Nog> m122000() {
      return (LiteralArgumentBuilder<Nog>)this.N(f11000[1])
         .then(
            this.N(f11000[2], new C0038())
               .then(
                  this.N(f11000[3], StringArgumentType.greedyString())
                     .executes(var1 -> this.m112000(Socket.m20000(var1, f4000[3]), StringArgumentType.getString(var1, f4000[4])))
               )
         );
   }

   private int m126000(String var1) {
      if (!this.N()) {
         return 1;
      } else {
         this.m102000(new TimeApi3(var1));
         return 1;
      }
   }
}
