package rw.cmd;

import KDFzREm.Nog;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.concurrent.CompletableFuture;

public class C0015 implements ArgumentType<Integer> {
   private static int[] f1000;
   public static Object[] f2000;
   private static short[] f3000;
   private static boolean[] f4000;
   private static byte[] f5000;
   private static String[] f6000;

   private static void m2000() {
      boolean[] var128 = new boolean[5];
      f4000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f4000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f4000[2] = (boolean)((0 | -0) >>> 31);
      f4000[3] = (boolean)((0 | -0) >>> 31);
      f4000[4] = (boolean)((1 | -1) >>> 31);
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      f2000 = new Object[f5000[5]];
   }

   private static void m16000() {
      int[] var128 = new int[(1 | -1) >>> 31];
      f1000[(0 | -0) >>> 31] = 86400;
   }

   private static void m26000() {
      byte[] var128 = new byte[6];
      f5000[(0 | -0) >>> 31] = 2;
      f5000[(1 | -1) >>> 31] = 2;
      f5000[2] = 2;
      f5000[3] = 2;
      f5000[4] = 60;
      f5000[5] = 3;
   }

   private static void m30000() {
      short[] var128 = new short[5];
      f3000[(0 | -0) >>> 31] = 2;
      f3000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f3000[2] = (short)((1 | -1) >>> 31);
      f3000[3] = 2;
      f3000[4] = 3600;
   }

   public Integer m32000(StringReader var1) throws CommandSyntaxException {
      float var2 = var1.readFloat();
      String var3 = var1.readUnquotedString();
      int var4 = ((Object2IntMap)f2000[f3000[0]]).getOrDefault(var3, f4000[0]);
      if (var4 == 0) {
         throw ((SimpleCommandExceptionType)f2000[f3000[1]]).create();
      } else {
         int var5 = Math.round(var2 * var4);
         if (var5 < 0) {
            throw ((DynamicCommandExceptionType)f2000[f3000[2]]).create(var5);
         } else {
            return var5;
         }
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      StringReader var3 = new StringReader(var2.getRemaining());

      try {
         var3.readFloat();
      } catch (CommandSyntaxException var5) {
         return var2.buildFuture();
      }

      return Nog.y(((Object2IntMap)f2000[f3000[3]]).keySet(), var2.createOffset(var2.getStart() + var3.getCursor()));
   }

   private static void m40000() {
      f6000 = new String[5];
      f6000[(0 | -0) >>> 31] = "argument.time.invalid_tick_count";
      f6000[(1 | -1) >>> 31] = "argument.time.invalid_unit";
      f6000[2] = "d";
      f6000[3] = "h";
      f6000[4] = "m";
   }
}
