package rw.core;

import rw.data.Rec0197;
import rw.defs.Enum0061;
import rw.defs.Enum0062;
import rw.defs.Enum0063;

public class C0824 {
   private static short[] f1000;
   private static String[] f2000;
   private static short[] f3000;
   private static short[] f4000;
   private static short[] f5000;

   private C0824() {
      throw new UnsupportedOperationException(f2000[0]);
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      f4000 = new short[]{0, 6408, 5121};
      f1000 = new short[]{6407, 5121, 6407, 5131};
      f3000 = new short[]{5131, 6402, 5126, 1, 9728, 9729};
      f5000 = new short[]{9984, 9985, 9986, 9987, 2, 10497};
   }

   private static void m10000() {
      f2000 = new String[]{"This is a utility class and cannot be instantiated"};
   }

   public static int m16000(Enum0061 var0) {
      return switch (((int[])C0815.f1000[2])[var0.ordinal()]) {
         case 1 -> 33071;
         case 2 -> 33069;
         case 3 -> 10497;
         case 4 -> 33648;
         default -> throw new MatchException(null, null);
      };
   }

   public static int m18000(Enum0063 var0) {
      return switch (((int[])C0815.f1000[1])[var0.ordinal()]) {
         case 1 -> 9728;
         case 2 -> 9729;
         case 3 -> 9984;
         case 4 -> 9985;
         case 5 -> 9986;
         case 6 -> 9987;
         default -> throw new MatchException(null, null);
      };
   }

   public static Rec0197 m20000(Enum0062 var0) {
      return switch (((int[])C0815.f1000[0])[var0.ordinal()]) {
         case 1 -> new Rec0197(32856, 6408, 5121);
         case 2 -> new Rec0197(32849, 6407, 5121);
         case 3 -> new Rec0197(34843, 6407, 5131);
         case 4 -> new Rec0197(33327, 33319, 5131);
         case 5 -> new Rec0197(33191, 6402, 5126);
         default -> throw new MatchException(null, null);
      };
   }
}
