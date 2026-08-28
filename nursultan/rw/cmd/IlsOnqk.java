package rw.cmd;

import KDFzREm.NAN;
import KDFzREm.NVg;
import KDFzREm.NVk;
import KDFzREm.Nog;
import com.google.common.collect.Lists;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.ArrayList;
import rw.core.C0585;
import rw.data.IlsIijm;

public class IlsOnqk implements ArgumentType<C0585> {
   static {
      ntfClinit();
   }

   public C0585 m10000(StringReader var1) throws CommandSyntaxException {
      String var2 = var1.getString().substring(var1.getCursor(), var1.getTotalLength());
      ArrayList var3 = Lists.newArrayList();
      int var4 = var1.getCursor();

      while (true) {
         int var5;
         NVk var6;
         while (true) {
            if (!var1.canRead()) {
               return new C0585(var2, var3.toArray(new IlsIijm[0]));
            }

            if (var1.peek() == '@') {
               var5 = var1.getCursor();

               try {
                  var6 = new NVg(var1, true).v();
                  break;
               } catch (CommandSyntaxException var8) {
                  if (var8.getType() != NVg.B && var8.getType() != NVg.R) {
                     throw var8;
                  }

                  var1.setCursor(var5 + 1);
               }
            } else {
               var1.skip();
            }
         }

         var3.add(new IlsIijm(var5 - var4, var1.getCursor() - var4, var6));
      }
   }

   public static NAN m14000(CommandContext<Nog> var0, String var1) {
      return ((C0585)var0.getArgument(var1, C0585.class)).m16000((Nog)var0.getSource(), true);
   }
}
