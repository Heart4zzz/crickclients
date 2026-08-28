package rw.cmd;

import KDFzREm.NAN;
import KDFzREm.NNag;
import KDFzREm.NPh;
import KDFzREm.Nog;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.ParseResults;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.context.ParsedCommandNode;
import com.mojang.brigadier.tree.CommandNode;
import java.util.List;
import java.util.Map;
import rw.core.C1188;
import rw.setting.C0106;

public class C0019 extends Socket {
   private static byte[] f1000;
   private static String[] f2000;
   private static String[] f3000;

   private static void m4000() {
      f3000 = new String[]{"help", "", "help.not-found", "", "|"};
      f2000 = new String[]{" | ", " ", "", "command", "command"};
   }

   static {
      ntfClinit();
   }

   private int m18000(CommandContext<Nog> var1) {
      CommandDispatcher var2 = (CommandDispatcher)C0013.f1000[0];
      Map var3 = var2.getSmartUsage(var2.getRoot(), (Nog)var1.getSource());

      for (String var5 : var3.values()) {
         this.m24000(f3000[1], var5);
      }

      return 1;
   }

   private static void m12000() {
      f1000 = new byte[]{-1};
   }

   private int m20000(CommandContext<Nog> var1, String var2) {
      ParseResults var3 = ((CommandDispatcher)C0013.f1000[0]).parse((String)var2, (Nog)var1.getSource());
      List var4 = var3.getContext().getNodes();
      if (var4.isEmpty()) {
         C0106.m32000(C1188.m16000(f3000[2], NPh.field_1068 + var2 + NPh.field_1061).N(NPh.field_1061));
         return 0;
      } else {
         CommandNode var5 = ((ParsedCommandNode)var4.get(var4.size() - 1)).getNode();
         Map var6 = ((CommandDispatcher)C0013.f1000[0]).getSmartUsage(var5, (Nog)var1.getSource());
         String var7 = var3.getReader().getString() + " ";
         if (var6.isEmpty()) {
            this.m24000(f3000[3], var3.getReader().getString());
            return 1;
         } else {
            for (String var9 : var6.values()) {
               this.m24000(var7, var9);
            }

            return var6.size();
         }
      }
   }

   private void m24000(String var1, String var2) {
      String var3 = (var1 + var2).replace(f3000[4], f2000[0]);
      int var4 = var3.indexOf(f2000[1]);
      String var5 = var3;
      String var6 = f2000[2];
      if (var4 != -1) {
         var5 = var3.substring(0, var4);
         var6 = var3.substring(var4);
      }

      NNag var7 = NAN.y((Character)C0013.f1000[1] + var5).N(NPh.field_1068).y(NAN.y(var6).N(NPh.field_1080));
      C0106.m32000(var7);
   }

   public void m16000(CommandDispatcher<Nog> var1) {
      var1.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)this.N(f3000[0]).executes(this::m18000)).then(this.m26000()));
   }

   private RequiredArgumentBuilder<Nog, String> m26000() {
      return (RequiredArgumentBuilder<Nog, String>)this.N(f2000[3], StringArgumentType.greedyString())
         .executes(var1 -> this.m20000(var1, StringArgumentType.getString(var1, f2000[4])));
   }
}
