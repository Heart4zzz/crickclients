package rw.cmd;

import KDFzREm.Nog;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import org.joml.Vector3d;
import rw.NursultanClient;
import rw.api.Iface0029;
import rw.core.AcceptApi2;
import rw.core.C0959;
import rw.defs.AcceptPart;
import rw.defs.AcceptPart2;
import rw.net.PacketHandlers;

public class Accept extends Socket {
   private static String[] f1000;
   private static String[] f2000;
   private static String[] f3000;
   private static String[] f4000;
   private static String[] f5000;
   private static String[] f6000;

   private int m2000(String var1) {
      if (!this.N()) {
         return 1;
      } else {
         this.m106000(new AcceptApi2((AcceptPart2)AcceptPart2.f5000[2], var1));
         return 1;
      }
   }

   private int m4000() {
      if (!this.N()) {
         return 1;
      } else {
         this.m106000(new AcceptApi2((AcceptPart2)AcceptPart2.f2000[3], ((C0959)NursultanClient.f13000[2]).m20000()));
         NursultanClient.m100000().m2000();
         return 1;
      }
   }

   private LiteralArgumentBuilder<Nog> m10000() {
      return (LiteralArgumentBuilder<Nog>)this.N(f5000[3])
         .then(this.N(f2000[0], AcceptApi3.m28000(4, 4)).executes(var1 -> this.m14000(Socket.m20000(var1, f4000[1]))));
   }

   private int m14000(String var1) {
      if (!this.N()) {
         return 1;
      } else {
         this.m106000(new AcceptApi2((AcceptPart2)AcceptPart2.f5000[1], var1));
         return 1;
      }
   }

   private int m22000() {
      if (!this.N()) {
         return 1;
      } else {
         this.m106000(new AcceptApi2((AcceptPart2)AcceptPart2.f5000[3], f5000[0]));
         return 1;
      }
   }

   static {
      ntfClinit();
   }

   private LiteralArgumentBuilder<Nog> m26000() {
      return (LiteralArgumentBuilder<Nog>)this.N(f6000[0]).then(this.N(f6000[1], new C0038()).executes(var1 -> this.m68000(Socket.m20000(var1, f1000[1]))));
   }

   private LiteralArgumentBuilder<Nog> m36000() {
      return (LiteralArgumentBuilder<Nog>)((LiteralArgumentBuilder)this.N(f2000[1]).executes(var1 -> this.m2000(f4000[0])))
         .then(this.N(f2000[2], AcceptApi3.m28000(4, 4)).executes(var1 -> this.m2000(Socket.m20000(var1, f1000[3]))));
   }

   private int m40000(String var1) {
      if (!this.N()) {
         return 1;
      } else {
         var1 = var1.trim();
         this.m106000(new rw.core.AcceptApi((AcceptPart)AcceptPart.f5000[1], var1));
         return 1;
      }
   }

   private static void m48000() {
      f3000 = new String[]{"party", "create", "pos"};
      f5000 = new String[]{"", "leave", "info", "join"};
      f2000 = new String[]{"code", "accept", "code", "decline", "text"};
      f6000 = new String[]{"invite", "user", "kick", "user", "disband"};
      f1000 = new String[]{"user", "user", "text", "code"};
      f4000 = new String[]{"", "code", "pos", "%s %s %s ", "text", "pos", "%s %s %s "};
   }

   private LiteralArgumentBuilder<Nog> m50000() {
      return (LiteralArgumentBuilder<Nog>)this.N(f6000[2]).then(this.N(f6000[3], new C0038()).executes(var1 -> this.m124000(Socket.m20000(var1, f1000[0]))));
   }

   private RequiredArgumentBuilder<Nog, String> m62000() {
      return (RequiredArgumentBuilder<Nog, String>)this.N(f2000[4], new AcceptApi()).executes(var1 -> this.m40000(Socket.m20000(var1, f1000[2])));
   }

   private int m68000(String var1) {
      if (!this.N()) {
         return 1;
      } else {
         this.m106000(new AcceptApi2((AcceptPart2)AcceptPart2.f2000[1], var1));
         return 1;
      }
   }

   private LiteralArgumentBuilder<Nog> m76000() {
      return (LiteralArgumentBuilder<Nog>)this.N(f5000[2]).executes(var1 -> this.m96000());
   }

   private LiteralArgumentBuilder<Nog> m82000() {
      return (LiteralArgumentBuilder<Nog>)this.N(f5000[1]).executes(var1 -> this.m4000());
   }

   private LiteralArgumentBuilder<Nog> m86000() {
      return (LiteralArgumentBuilder<Nog>)this.N(f2000[3]).executes(var1 -> this.m22000());
   }

   private int m92000() {
      if (!this.N()) {
         return 1;
      } else {
         this.m106000(new AcceptApi2((AcceptPart2)AcceptPart2.f2000[0], ((C0959)NursultanClient.f13000[2]).m20000()));
         return 1;
      }
   }

   private int m96000() {
      if (!this.N()) {
         return 1;
      } else {
         this.m106000(new AcceptApi2((AcceptPart2)AcceptPart2.f5000[4], ((C0959)NursultanClient.f13000[2]).m20000()));
         return 1;
      }
   }

   private void m106000(PacketHandlers<Iface0029> var1) {
      NursultanClient.m82000().m56000(var1);
   }

   public void m12000(CommandDispatcher<Nog> var1) {
      var1.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)this.N(
                                             f3000[0]
                                          )
                                          .then(this.N(f3000[1]).executes(var1x -> this.m92000())))
                                       .then(this.m26000()))
                                    .then(this.m82000()))
                                 .then(this.m62000()))
                              .then(((RequiredArgumentBuilder)this.N(f3000[2], new C0004()).executes(var1x -> {
                                 Vector3d var2 = C0004.m14000(var1x, f4000[5]);
                                 return this.m40000(f4000[6].formatted(var2.x(), var2.y(), var2.z()));
                              })).then(this.m62000().executes(var1x -> {
                                 Vector3d var2 = C0004.m14000(var1x, f4000[2]);
                                 return this.m40000(f4000[3].formatted(var2.x(), var2.y(), var2.z()) + Socket.m20000(var1x, f4000[4]));
                              }))))
                           .then(this.m10000()))
                        .then(this.m36000()))
                     .then(this.m86000()))
                  .then(this.m50000()))
               .then(this.m118000()))
            .then(this.m76000())
      );
   }

   private int m112000() {
      if (!this.N()) {
         return 1;
      } else {
         this.m106000(new AcceptApi2((AcceptPart2)AcceptPart2.f5000[0], ((C0959)NursultanClient.f13000[2]).m20000()));
         NursultanClient.m100000().m2000();
         return 1;
      }
   }

   private LiteralArgumentBuilder<Nog> m118000() {
      return (LiteralArgumentBuilder<Nog>)this.N(f6000[4]).executes(var1 -> this.m112000());
   }

   private int m124000(String var1) {
      if (!this.N()) {
         return 1;
      } else {
         this.m106000(new AcceptApi2((AcceptPart2)AcceptPart2.f2000[2], var1));
         return 1;
      }
   }
}
