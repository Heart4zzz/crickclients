package rw.core;

import rw.api.Iface0197;
import rw.api.Iface0202;
import rw.data.Rec0263;
import rw.setting.C0003;
import rw.setting.C0006;
import rw.setting.C0016;
import rw.setting.C0031;

public class C0093 {
   public static Object[] f1000;
   private static boolean[] f2000;
   private static short[] f3000;
   private static short[] f4000;

   private static void m4000() {
      boolean[] var128 = new boolean[3];
      f2000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f2000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f2000[2] = (boolean)((1 | -1) >>> 31);
   }

   private C0093() {
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      short[] var128 = new short[2];
      f3000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f3000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      short[] var129 = new short[8];
      f4000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f4000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f4000[2] = (short)((0 | -0) >>> 31);
      f4000[3] = (short)((0 | -0) >>> 31);
      f4000[4] = (short)((0 | -0) >>> 31);
      f4000[5] = (short)((0 | -0) >>> 31);
      f4000[6] = (short)((0 | -0) >>> 31);
      f4000[7] = 4;
   }

   private C0031 m10000(Rec0263 var1, Iface0202 var2) {
      String var3 = var1.m4000().m6000().m10000();

      return switch (var1.m4000()) {
         case C0991 var6 -> var2.m18000("$checkbox" + var3, (Iface0197)C0006.f3000[f3000[0]], var1);
         case OlqIlmnt var7 -> var2.m18000("$input" + var3, (Iface0197)rw.setting.C0012.f3000[f3000[1]], var1);
         case C1006 var8 -> var2.m18000("$hotkey" + var3, (Iface0197)rw.setting.C0005.f2000[f4000[0]], var1);
         case C1010 var9 -> var2.m18000("$button" + var3, (Iface0197)C0016.f3000[f4000[1]], var1);
         case C0988 var10 -> var2.m18000("$slider" + var3, (Iface0197)C0003.f1000[f4000[2]], var1);
         case C1004 var11 -> var2.m18000("$rangeSlider" + var3, (Iface0197)C0085.f3000[f4000[3]], var1);
         case C0998 var12 -> var2.m18000("$colorPicker" + var3, (Iface0197)C0084.f3000[f4000[4]], var1);
         case C1003 var13 -> var2.m18000("$combo" + var3, (Iface0197)rw.setting.C0013.f2000[f4000[5]], var1);
         case C1000 var14 -> var2.m18000("$selectable" + var3, (Iface0197)rw.setting.C0011.f3000[f4000[6]], var1);
         default -> C0287.m30000(C1235.m40000(var1.m4000().m6000()), (rw.setting.C0056)C0078.f1000[f4000[7]]);
      };
   }

   private static void m12000() {
      f1000 = new Object[f2000[2]];
   }
}
