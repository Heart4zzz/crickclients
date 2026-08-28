package rw.core;

import java.util.List;
import rw.NursultanClient;
import rw.data.Rec0223;
import rw.data.Rec0312;

public class C0974 extends Base1005 {
   private static String[] f1000;
   private static byte[] f2000;
   public static Object[] f3000;
   private static boolean[] f4000;
   private static short[] f5000;

   private static void m4000() {
      short[] var128 = new short[(1 | -1) >>> 31];
      f5000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      f1000 = new String[(1 | -1) >>> 31];
      f1000[(0 | -0) >>> 31] = "category.accounts";
   }

   private static void m10000() {
      boolean[] var128 = new boolean[2];
      f4000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f4000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
   }

   private static void m16000() {
      byte[] var128 = new byte[(1 | -1) >>> 31];
      f2000[(0 | -0) >>> 31] = 16;
   }

   public void m18000(String var1, int var2, List<Rec0223> var3) {
      if ((var2 & f2000[0]) != 0) {
         List var4 = List.of(C1235.m40000((Rec0312)f3000[f5000[0]]));

         for (Noqodls var6 : NursultanClient.m48000().m16000()) {
            int var7 = this.N(var6.m20000(), var1);
            if (var7 != 0) {
               var3.add(new Rec0223(var4, var6, var7));
            }
         }
      }
   }

   private static void m20000() {
      f3000 = new Object[f4000[1]];
   }
}
