package rw.cmd;

import KDFzREm.NAN;
import KDFzREm.NNNNsj;
import KDFzREm.Nod;
import KDFzREm.Not;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class C0010 {
   private static boolean[] f1000;
   private static boolean[] f2000;
   public static Object[] f3000;
   private static String[] f4000;
   private static short[] f5000;

   static {
      ntfClinit();
   }

   private static void m8000() {
      short[] var128 = new short[(1 | -1) >>> 31];
      f5000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
   }

   private static void m24000() {
      boolean[] var128 = new boolean[8];
      f1000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f1000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f1000[2] = (boolean)((1 | -1) >>> 31);
      f1000[3] = (boolean)((1 | -1) >>> 31);
      f1000[4] = (boolean)((1 | -1) >>> 31);
      f1000[5] = (boolean)((1 | -1) >>> 31);
      f1000[6] = (boolean)((0 | -0) >>> 31);
      f1000[7] = (boolean)((0 | -0) >>> 31);
      boolean[] var129 = new boolean[(1 | -1) >>> 31];
      f2000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
   }

   private static int m26000(Not var0, boolean var1) throws CommandSyntaxException {
      var0.N(() -> NAN.L(f4000[3]), f1000[0]);
      NNNNsj var2 = var0.W();
      boolean var3 = var2.N(f1000[1], var1, f1000[2]);
      if (!var3) {
         throw ((SimpleCommandExceptionType)f3000[f5000[0]]).create();
      } else {
         var0.N(() -> NAN.L(f4000[2]), f1000[3]);
         return f1000[4];
      }
   }

   public static void m28000(CommandDispatcher<Not> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)Nod.y(f4000[0]).requires(Nod.N(Nod.R)))
               .executes(var0x -> m26000((Not)var0x.getSource(), f1000[6])))
            .then(Nod.y(f4000[1]).executes(var0x -> m26000((Not)var0x.getSource(), f1000[5])))
      );
   }

   private static void m36000() {
      f4000 = new String[5];
      f4000[(0 | -0) >>> 31] = "save-all";
      f4000[(1 | -1) >>> 31] = "flush";
      f4000[2] = "commands.save.success";
      f4000[3] = "commands.save.saving";
      f4000[4] = "commands.save.failed";
   }

   private static void m40000() {
      f3000 = new Object[f2000[1]];
   }
}
