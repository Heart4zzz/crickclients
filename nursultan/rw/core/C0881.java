package rw.core;

import KDFzREm.NNuU;
import KDFzREm.ow;
import org.joml.Vector2i;
import rw.data.Rec0102;

public class C0881 {
   private static String[] f1000;
   public static Object[] f2000;

   private static void m4000() {
      f2000 = new Object[]{null};
   }

   private C0881() {
      throw new UnsupportedOperationException(f1000[0]);
   }

   static {
      ntfClinit();
   }

   private static void m12000() {
      f1000 = new String[]{"This is a utility class and cannot be instantiated"};
   }

   public static Rec0102 m18000(int var0) {
      int var1 = (var0 & 2) != 0 ? 1 : 0;
      int var2 = (var0 & 1) != 0 ? 1 : 0;
      int var3 = (var0 & 4) != 0 ? 1 : 0;
      int var4 = (var0 & 8) != 0 ? 1 : 0;
      return new Rec0102((boolean)var1, (boolean)var2, (boolean)var3, (boolean)var4);
   }

   public static Vector2i m20000(double var0, double var2) {
      ow var4 = ((NNuU)f2000[0]).Nt();
      double var5 = (double)var4.U() / var4.W();
      double var7 = (double)var4.E() / var4.m();
      return new Vector2i((int)(var0 * var5), (int)(var2 * var7));
   }

   public static boolean m24000(int var0, int var1, int var2, int var3, int var4, int var5) {
      return (boolean)(var4 >= var0 && var4 <= var0 + var2 && var5 >= var1 && var5 <= var1 + var3 ? 1 : 0);
   }
}
