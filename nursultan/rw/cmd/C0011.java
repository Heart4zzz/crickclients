package rw.cmd;

import KDFzREm.NAN;
import KDFzREm.Nod;
import KDFzREm.Not;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class C0011 {
   private static short[] f1000;
   public static Object[] f2000;
   private static String[] f3000;
   private static boolean[] f4000;

   static {
      ntfClinit();
   }

   private static void m8000() {
      f2000 = new Object[f4000[4]];
   }

   private static void m10000() {
      boolean[] var128 = new boolean[5];
      f4000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f4000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f4000[2] = (boolean)((1 | -1) >>> 31);
      f4000[3] = (boolean)((0 | -0) >>> 31);
      f4000[4] = (boolean)((1 | -1) >>> 31);
   }

   private static void m14000() {
      short[] var128 = new short[(1 | -1) >>> 31];
      f1000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
   }

   public static void m24000(CommandDispatcher<Not> var0) {
      var0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)Nod.y(f3000[0]).requires(Nod.N(Nod.R))).executes(var0x -> {
         Not var1 = (Not)var0x.getSource();
         boolean var2 = var1.W().m(f4000[0]);
         if (!var2) {
            throw ((SimpleCommandExceptionType)f2000[f1000[0]]).create();
         } else {
            var1.N(() -> NAN.L(f3000[1]), f4000[1]);
            return f4000[2];
         }
      }));
   }

   private static void m28000() {
      f3000 = new String[3];
      f3000[(0 | -0) >>> 31] = "save-off";
      f3000[(1 | -1) >>> 31] = "commands.save.disabled";
      f3000[2] = "commands.save.alreadyOff";
   }
}
