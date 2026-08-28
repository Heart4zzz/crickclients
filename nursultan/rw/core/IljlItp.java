package rw.core;

import KDFzREm.NHe;
import KDFzREm.NNNNud;
import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import KDFzREm.NQl;
import KDFzREm.NQo;
import KDFzREm.NbD;
import KDFzREm.Nbx;
import KDFzREm.Nww;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Stream;
import rw.api.Iface0606;
import rw.data.Rec0208;

public class IljlItp {
   private static String[] f1000;
   private static boolean[] f2000;
   private static boolean[] f3000;
   public static Object[] f4000;
   private static boolean[] f5000;

   public static Stream<Rec0208> m2000(NQl var0) {
      return m22000(Iface0606.m4000(var0));
   }

   public static int m4000(int var0) {
      if (!m36000(var0)) {
         return m32000(var0) ? var0 + 36 : var0;
      } else {
         return -1;
      }
   }

   public static Stream<Rec0208> m6000(Iface0606 var0) {
      Objects.requireNonNull((NNNwS)((NNuU)f4000[0]).T[4]);
      ArrayList var1 = new ArrayList();
      NHe var2 = ((NNNwS)((NNuU)f4000[0]).T[4]).method_31548().u();

      for (int var3 = 0; var3 < var2.size(); var3++) {
         NQo var4 = (NQo)var2.get(var3);
         if (var0.test(var4)) {
            var1.add(new Rec0208(var4, var3));
         }
      }

      return var1.stream();
   }

   private static void m8000() {
      f5000 = new boolean[]{false, false, true};
      f3000 = new boolean[]{false, false, false, false};
      f2000 = new boolean[]{true, false, true, false, false, true};
   }

   private static void m10000() {
      f1000 = new String[]{"This is a utility class and cannot be instantiated"};
   }

   public static int m12000(Iface0606 var0) {
      int var1 = 0;

      for (NQo var3 : ((NNNwS)((NNuU)f4000[0]).T[4]).method_31548().u()) {
         if (var0.test(var3)) {
            var1 += var3.c();
         }
      }

      return var1;
   }

   private IljlItp() {
      throw new UnsupportedOperationException(f1000[0]);
   }

   static {
      ntfClinit();
   }

   public static Stream<Rec0208> m22000(Iface0606 var0) {
      Objects.requireNonNull((NNNwS)((NNuU)f4000[0]).T[4]);
      ArrayList var1 = new ArrayList();
      NHe var2 = ((NNNwS)((NNuU)f4000[0]).T[4]).method_31548().u();

      for (int var3 = 0; var3 < 9; var3++) {
         NQo var4 = (NQo)var2.get(var3);
         if (var0.test(var4)) {
            var1.add(new Rec0208(var4, var3));
         }
      }

      return var1.stream();
   }

   public static Stream<Rec0208> m26000(NQl var0) {
      return m6000(Iface0606.m4000(var0));
   }

   private static void m28000() {
      f4000 = new Object[]{null, -1, 9};
   }

   public static int m30000(NQl var0) {
      return m12000(Iface0606.m4000(var0));
   }

   public static boolean m32000(int var0) {
      return (boolean)(var0 < 9 && var0 >= 0 ? 1 : 0);
   }

   public static boolean m34000(Iface0606 var0) {
      Objects.requireNonNull((NNNwS)((NNuU)f4000[0]).T[4]);

      for (Nbx var2 : NNNNud.field_49224) {
         if (var2.N() == NbD.field_6178) {
            NQo var3 = ((NNNwS)((NNuU)f4000[0]).T[4]).method_6118(var2);
            if (var0.test(var3)) {
               return f5000[2];
            }
         }
      }

      return (boolean)0;
   }

   public static boolean m36000(int var0) {
      return (boolean)(var0 == -1 ? 1 : 0);
   }

   public static int m38000(Iface0606 var0) {
      Objects.requireNonNull((NNNwS)((NNuU)f4000[0]).T[4]);
      Nww var1 = ((NNNwS)((NNuU)f4000[0]).T[4]).method_31548();

      for (int var2 = f5000[0]; var2 < 9; var2++) {
         if (var0.test(var1.method_5438(var2))) {
            return var2;
         }
      }

      return -1;
   }

   public static boolean m40000(NQl var0) {
      return m34000(Iface0606.m4000(var0));
   }

   public static boolean m42000() {
      Objects.requireNonNull((NNNwS)((NNuU)f4000[0]).T[4]);
      return ((NNNwS)((NNuU)f4000[0]).T[4]).method_31548().u().stream().allMatch(NQo::R);
   }

   public static boolean m46000() {
      Objects.requireNonNull((NNNwS)((NNuU)f4000[0]).T[4]);
      return ((NNNwS)((NNuU)f4000[0]).T[4]).method_31548().u().stream().noneMatch(NQo::R);
   }

   public static Rec0208 m48000(Iface0606 var0) {
      Objects.requireNonNull((NNNwS)((NNuU)f4000[0]).T[4]);
      Optional var1 = m6000(var0).findFirst();
      if (var1.isEmpty()) {
         return null;
      } else {
         Rec0208 var2 = (Rec0208)var1.get();
         return !var2.m6000().R() && !((NNNwS)((NNuU)f4000[0]).T[4]).method_7357().N(var2.m6000()) ? var2 : null;
      }
   }

   public static OptionalInt m50000(int var0) {
      return var0 == -1 ? OptionalInt.empty() : OptionalInt.of(var0);
   }

   public static int m52000(NQl var0) {
      return m62000(Iface0606.m4000(var0));
   }

   public static int m60000(NQl var0) {
      return m38000(Iface0606.m4000(var0));
   }

   public static int m62000(Iface0606 var0) {
      Objects.requireNonNull((NNNwS)((NNuU)f4000[0]).T[4]);
      NHe var1 = ((NNNwS)((NNuU)f4000[0]).T[4]).method_31548().u();

      for (int var2 = f5000[1]; var2 < var1.size(); var2++) {
         if (var0.test((NQo)var1.get(var2))) {
            return var2;
         }
      }

      return -1;
   }
}
