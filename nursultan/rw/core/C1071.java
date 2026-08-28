package rw.core;

import KDFzREm.NAN;
import KDFzREm.NAd;
import KDFzREm.NNAf;
import java.util.List;
import java.util.Optional;
import rw.defs.OlmmOsl;
import rw.setting.C0031;

public class C1071 {
   private static short[] f1000;
   private static boolean[] f2000;
   public static Object[] f3000;

   private static void m4000() {
      boolean[] var128 = new boolean[3];
      f2000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f2000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f2000[2] = (boolean)((1 | -1) >>> 31);
   }

   private C1071() {
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      short[] var128 = new short[5];
      f1000[(0 | -0) >>> 31] = 3;
      f1000[(1 | -1) >>> 31] = 3;
      f1000[2] = 3;
      f1000[3] = 3;
      f1000[4] = (short)((0 | -0) >>> 31);
   }

   public static C0031 m10000(NNAf var0, int var1, OlmmOsl var2, int var3) {
      return m20000(m32000(var0, var1, var2, var3));
   }

   public static List<C0031> m12000(NAN var0, int var1, OlmmOsl var2, int var3) {
      C1064 var4 = new C1064(var1, var2, var3);
      var0.N((var1x, var2x) -> {
         var4.m30000(var1x, var2x);
         return Optional.empty();
      }, NAd.N);
      return var4.m26000();
   }

   public static List<C0031> m14000(NAN var0, int var1, int var2) {
      return m12000(var0, var1, (OlmmOsl)OlmmOsl.f7000[f1000[2]], var2);
   }

   public static C0031 m16000(NNAf var0, int var1, int var2) {
      return m10000(var0, var1, (OlmmOsl)OlmmOsl.f7000[f1000[1]], var2);
   }

   private static C0031 m20000(List<C0031> var0) {
      return C0287.m26000((rw.setting.C0056)f3000[f1000[4]], var1 -> var1.N(var0));
   }

   private static void m22000() {
      f3000 = new Object[f2000[2]];
   }

   public static C0031 m26000(NAN var0, int var1, OlmmOsl var2, int var3) {
      return m20000(m12000(var0, var1, var2, var3));
   }

   public static List<C0031> m30000(NNAf var0, int var1, int var2) {
      return m32000(var0, var1, (OlmmOsl)OlmmOsl.f7000[f1000[3]], var2);
   }

   public static List<C0031> m32000(NNAf var0, int var1, OlmmOsl var2, int var3) {
      C1064 var4 = new C1064(var1, var2, var3);
      var0.accept((var1x, var2x, var3x) -> {
         var4.m22000(var2x, var3x);
         return f2000[0];
      });
      return var4.m26000();
   }

   public static C0031 m36000(NAN var0, int var1, int var2) {
      return m26000(var0, var1, (OlmmOsl)OlmmOsl.f7000[f1000[0]], var2);
   }
}
