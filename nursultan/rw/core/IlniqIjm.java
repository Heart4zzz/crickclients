package rw.core;

import java.util.List;
import rw.NursultanClient;
import rw.data.Rec0223;
import rw.data.Rec0312;
import rw.defs.Enum0065;

public class IlniqIjm extends Base1005 {
   public static Object[] f1000;
   private static String[] f2000;
   private static byte[] f3000;
   private static boolean[] f4000;
   private static short[] f5000;

   private static void m2000() {
      f1000 = new Object[f4000[1]];
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      f2000 = new String[(1 | -1) >>> 31];
      f2000[(0 | -0) >>> 31] = "category.configs";
   }

   private static void m12000() {
      boolean[] var128 = new boolean[2];
      f4000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f4000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
   }

   private static void m14000() {
      byte[] var128 = new byte[(1 | -1) >>> 31];
      f3000[(0 | -0) >>> 31] = 4;
   }

   public void m18000(String var1, int var2, List<Rec0223> var3) {
      if ((var2 & f3000[0]) != 0) {
         List var4 = List.of(C1235.m40000((Rec0312)f1000[f5000[0]]));

         for (OlsmIikp var6 : NursultanClient.m116000().m8000()) {
            if (var6.m8000() != (Enum0065)Enum0065.f2000[f5000[1]]) {
               int var7 = this.N(var6.m22000(), var1);
               int var8 = this.N(var6.m30000(), var1);
               int var9 = Math.max(var7, var8);
               if (var9 != 0) {
                  var3.add(new Rec0223(var4, var6, var9));
               }
            }
         }
      }
   }

   private static void m20000() {
      short[] var128 = new short[2];
      f5000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f5000[(1 | -1) >>> 31] = 3;
   }
}
