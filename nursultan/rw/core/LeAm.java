package rw.core;

import java.util.List;
import rw.gui.DragOffset;

public class LeAm {
   private static byte[] f1000;
   private static short[] f2000;
   private static byte[] f3000;
   private static byte[] f4000;
   public static Object[] f5000;
   private static boolean[] f6000;

   private static void m4000() {
      f6000 = new boolean[]{false, true, false, true};
   }

   private LeAm() {
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      f5000 = new Object[]{null, null, null, null, null, null, null, null};
   }

   private static void m10000() {
      f1000 = new byte[]{2, 3};
      f3000 = new byte[]{4, 5, 6, 4, 2};
      f4000 = new byte[]{3, 5, 6, 7, 8};
   }

   private static void m14000() {
      f2000 = new short[]{7};
   }

   public static DragOffset m18000(String var0) {
      return ((List)f5000[f2000[0]]).stream().filter(var1 -> var1.m52000().equals(var0)).findFirst().orElse(null);
   }
}
