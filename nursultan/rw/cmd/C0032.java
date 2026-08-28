package rw.cmd;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;

public class C0032 implements ArgumentType<Character> {
   private static String[] f1000;
   public static Object[] f2000;

   private static void m2000() {
      f1000 = new String[]{"/", "#", "prefix.error"};
   }

   static {
      ntfClinit();
   }

   private static void m10000() {
      f2000 = new Object[]{null};
   }

   public Character m24000(StringReader var1) throws CommandSyntaxException {
      String var2 = var1.getRemaining();
      if (!var2.isBlank() && !var2.equals(f1000[0]) && !var2.equals(f1000[1])) {
         var1.setCursor(var1.getCursor() + 1);
         return var2.charAt(0);
      } else {
         throw ((DynamicCommandExceptionType)f2000[0]).create(var2);
      }
   }

   public static Character m30000(CommandContext<?> var0, String var1) {
      return (Character)var0.getArgument(var1, Character.class);
   }
}
