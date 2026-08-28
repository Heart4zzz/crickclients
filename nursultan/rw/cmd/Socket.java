package rw.cmd;

import KDFzREm.NNuU;
import KDFzREm.NPh;
import KDFzREm.Nog;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import rw.NursultanClient;
import rw.core.C1188;
import rw.setting.C0106;

public abstract class Socket {
   public Object[] f1000;
   private static String[] f2000;
   public static Object[] f3000;

   public Socket() {
      this.m8000();
      NNuU var5 = NNuU.Nq();
      this.f1000[0] = var5;
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      f2000 = new String[]{"socket.not-connected"};
   }

   private void m8000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[1];
         Object[] var1 = this.f1000;
      }
   }

   private static void m16000() {
      f3000 = new Object[]{1};
   }

   public <T> RequiredArgumentBuilder<Nog, T> m18000(String var1, ArgumentType<T> var2) {
      return RequiredArgumentBuilder.argument(var1, var2);
   }

   public static String m20000(CommandContext<?> var0, String var1) {
      return (String)var0.getArgument(var1, String.class);
   }

   public LiteralArgumentBuilder<Nog> m24000(String var1) {
      return LiteralArgumentBuilder.literal(var1);
   }

   public boolean m26000() {
      if (NursultanClient.m82000().m72000()) {
         return (boolean)1;
      } else {
         C0106.m32000(C1188.m12000(f2000[0]).N(NPh.field_1061));
         return (boolean)0;
      }
   }

   public abstract void m28000(CommandDispatcher<Nog> var1);
}
