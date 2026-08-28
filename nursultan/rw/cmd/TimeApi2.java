package rw.cmd;

import KDFzREm.Nog;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.concurrent.CompletableFuture;

public class TimeApi2 implements ArgumentType<String> {
   public static Object[] f1000;
   private static boolean[] f2000;
   private static short[] f3000;
   private static byte[] f4000;
   private static String[] f5000;

   private static void m2000() {
      f1000 = new Object[f2000[3]];
   }

   static {
      ntfClinit();
   }

   private static void m10000() {
      f5000 = new String[4];
      f5000[(0 | -0) >>> 31] = "спам/флуд";
      f5000[(1 | -1) >>> 31] = "упоминание родных";
      f5000[2] = "упоминание сторонних клиентов";
      f5000[3] = "оскорбление клиента";
   }

   private static void m14000() {
      byte[] var128 = new byte[3];
      f4000[(0 | -0) >>> 31] = 4;
      f4000[(1 | -1) >>> 31] = 2;
      f4000[2] = 3;
   }

   private static void m20000() {
      short[] var128 = new short[(1 | -1) >>> 31];
      f3000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
   }

   private static void m28000() {
      boolean[] var128 = new boolean[4];
      f2000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f2000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f2000[2] = (boolean)((0 | -0) >>> 31);
      f2000[3] = (boolean)((1 | -1) >>> 31);
   }

   public String m32000(StringReader var1) throws CommandSyntaxException {
      String var2 = var1.getRemaining();
      var1.setCursor(var1.getTotalLength());
      return var2;
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      return Nog.N((String[])f1000[f3000[0]], var2);
   }
}
