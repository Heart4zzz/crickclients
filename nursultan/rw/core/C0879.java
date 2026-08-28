package rw.core;

import KDFzREm.NNag;
import KDFzREm.NNeZ;
import KDFzREm.NYT;
import KDFzREm.NYj;
import KDFzREm.NkG;
import KDFzREm.NkQ;
import KDFzREm.Nkq;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import rw.NursultanClient;

public class C0879 {
   private static String[] f1000;
   private static byte[] f2000;
   private static boolean[] f3000;
   private static boolean[] f4000;
   private static byte[] f5000;
   private static boolean[] f6000;
   private static byte[] f7000;

   private static void m4000() {
      byte[] var128 = new byte[6];
      f5000[(0 | -0) >>> 31] = 100;
      f5000[(1 | -1) >>> 31] = 20;
      f5000[2] = 2;
      f5000[3] = 50;
      f5000[4] = 2;
      f5000[5] = 105;
      byte[] var129 = new byte[6];
      f7000[(0 | -0) >>> 31] = 25;
      f7000[(1 | -1) >>> 31] = 50;
      f7000[2] = 25;
      f7000[3] = 50;
      f7000[4] = 100;
      f7000[5] = 20;
      byte[] var130 = new byte[6];
      f2000[(0 | -0) >>> 31] = 2;
      f2000[(1 | -1) >>> 31] = 5;
      f2000[2] = 2;
      f2000[3] = 36;
      f2000[4] = 36;
      f2000[5] = 46;
   }

   private static boolean m8000(NkG var0, int var1) {
      return IntStream.range(f6000[2], var1).noneMatch(var1x -> var0.L(var1x).R());
   }

   public static Iltonopij m10000(NYT var0, int var1, int var2, int var3, int var4) {
      int var5 = var0.N.method_5439();
      return m56000(f1000[2], var1, var2, var3, var4, f7000[0], var2x -> m30000(var0, var5, var2x));
   }

   public static Iltonopij m12000(NkQ var0, int var1, int var2, int var3, int var4) {
      int var5 = var0.E().method_5439();
      return m56000(f1000[4], var1, var2, var3, var4, f6000[1], var2x -> m18000(var0, var5, var2x));
   }

   private static void m18000(NkG var0, int var1, boolean var2) {
      m86000(var0, f3000[2], var1, f3000[3], Nkq.field_7795, var2, NYj::R);
   }

   private C0879() {
      throw new UnsupportedOperationException(f1000[7]);
   }

   static {
      ntfClinit();
   }

   private static void m28000() {
      boolean[] var128 = new boolean[6];
      f6000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f6000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f6000[2] = (boolean)((0 | -0) >>> 31);
      f6000[3] = (boolean)((0 | -0) >>> 31);
      f6000[4] = (boolean)((1 | -1) >>> 31);
      f6000[5] = (boolean)((0 | -0) >>> 31);
      boolean[] var129 = new boolean[7];
      f3000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f3000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f3000[2] = (boolean)((0 | -0) >>> 31);
      f3000[3] = (boolean)((1 | -1) >>> 31);
      f3000[4] = (boolean)((0 | -0) >>> 31);
      f3000[5] = (boolean)((1 | -1) >>> 31);
      f3000[6] = (boolean)((1 | -1) >>> 31);
      boolean[] var130 = new boolean[5];
      f4000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f4000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f4000[2] = (boolean)((1 | -1) >>> 31);
      f4000[3] = (boolean)((0 | -0) >>> 31);
      f4000[4] = (boolean)((1 | -1) >>> 31);
   }

   private static void m30000(NkG var0, int var1, boolean var2) {
      m86000(var0, f3000[0], var1, f3000[1], Nkq.field_7794, var2, NYj::R);
   }

   public static boolean m34000(NYT var0) {
      return m8000(var0, var0.N.method_5439());
   }

   private static boolean m36000(NkG var0, int var1) {
      for (int var2 = var1; var2 < var1 + f2000[3]; var2++) {
         NYj var3 = var0.L(var2);
         if (var3.R() && !C1193.m32000(var3.i())) {
            return f6000[3];
         }
      }

      return f6000[4];
   }

   public static Iltonopij m38000(NkQ var0, int var1, int var2, int var3, int var4) {
      int var5 = var0.E().method_5439();
      return m56000(f1000[6], var1, var2, var3, var4, f7000[3], var2x -> m90000(var0, var5, var2x));
   }

   public static Iltonopij m40000(NYT var0, int var1, int var2, int var3, int var4) {
      int var5 = var0.N.method_5439();
      return m56000(f1000[1], var1, var2, var3, var4, f6000[0], var2x -> m18000(var0, var5, var2x));
   }

   public static boolean m54000(NkQ var0) {
      return m36000(var0, var0.E().method_5439());
   }

   private static Iltonopij m56000(String var0, int var1, int var2, int var3, int var4, int var5, Consumer<Boolean> var6) {
      NNag var7 = C1188.m12000(var0);
      return new C0864(var7, var0x -> {})
         .m26000(f7000[4], f7000[5])
         .m14000((var1 - var3) / f2000[0] + var3 + f2000[1], (var2 - var4) / f2000[2] + var5)
         .m24000(var1x -> var6.accept(f4000[2]))
         .m20000(var1x -> var6.accept(f4000[1]))
         .m28000();
   }

   public static Iltonopij m58000(NNeZ var0, int var1, int var2) {
      NNag var3 = C1188.m12000(f1000[0]);
      return new C0864(var3, var0x -> {})
         .m26000(f5000[0], f5000[1])
         .m14000(var1 / f5000[2] - f5000[3], var2 / f5000[4] - f5000[5])
         .m24000(var1x -> m80000(var0, f4000[4]))
         .m20000(var1x -> m80000(var0, f4000[3]))
         .m28000();
   }

   public static boolean m60000(NkQ var0) {
      return m8000(var0, var0.E().method_5439());
   }

   public static Iltonopij m62000(NkQ var0, int var1, int var2, int var3, int var4) {
      int var5 = var0.E().method_5439();
      return m56000(f1000[5], var1, var2, var3, var4, f7000[2], var2x -> m30000(var0, var5, var2x));
   }

   public static Iltonopij m64000(NYT var0, int var1, int var2, int var3, int var4) {
      int var5 = var0.N.method_5439();
      return m56000(f1000[3], var1, var2, var3, var4, f7000[1], var2x -> m90000(var0, var5, var2x));
   }

   public static boolean m68000(NYT var0) {
      return m36000(var0, var0.N.method_5439());
   }

   private static void m80000(NNeZ var0, boolean var1) {
      m86000(var0.E(), f3000[4], f2000[5], f3000[5], Nkq.field_7795, var1, NYj::R);
   }

   private static void m86000(NkG var0, int var1, int var2, int var3, Nkq var4, boolean var5, Predicate<NYj> var6) {
      for (int var7 = var1; var7 < var2; var7++) {
         NYj var8 = var0.L(var7);
         if (var6.test(var8)) {
            NursultanClient.m60000().m38000(var0.b, var7, var3, var4).m24000();
            if (var5) {
               break;
            }
         }
      }
   }

   private static void m90000(NkG var0, int var1, boolean var2) {
      m86000(var0, var1, var1 + f2000[4], f6000[5], Nkq.field_7794, var2, var0x -> var0x.R() && !C1193.m32000(var0x.i()) ? f3000[6] : f4000[0]);
   }

   private static void m92000() {
      f1000 = new String[8];
      f1000[(0 | -0) >>> 31] = "inventory.throw-all";
      f1000[(1 | -1) >>> 31] = "inventory.throw-all";
      f1000[2] = "inventory.take-all";
      f1000[3] = "inventory.put-all";
      f1000[4] = "inventory.throw-all";
      f1000[5] = "inventory.take-all";
      f1000[6] = "inventory.put-all";
      f1000[7] = "This is a utility class and cannot be instantiated";
   }
}
