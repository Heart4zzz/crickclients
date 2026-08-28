package rw.core;

import KDFzREm.NQo;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;
import rw.data.PotionData;

public class PotionPart {
   private static short[] f1000;
   public Object[] f2000;
   private static boolean[] f3000;

   private static void m2000() {
      boolean[] var128 = new boolean[(1 | -1) >>> 31];
      f3000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
   }

   private PotionPart() {
      this.m4000();
      ArrayList var5 = new ArrayList();
      this.f2000[f1000[0]] = var5;
   }

   static {
      ntfClinit();
   }

   private void m4000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[f3000[0]];
         Object[] var1 = this.f2000;
      }
   }

   private static void m6000() {
      short[] var128 = new short[3];
      f1000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f1000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f1000[2] = (short)((0 | -0) >>> 31);
   }

   public static PotionPart m10000() {
      return new PotionPart();
   }

   public List<PotionData<?>> m14000() {
      return List.copyOf((List)this.f2000[f1000[2]]);
   }

   public <T> PotionPart m16000(String var1, Function<NQo, T> var2, BiPredicate<T, T> var3) {
      ((List)this.f2000[f1000[1]]).add(new PotionData(var1, var2, var3));
      return this;
   }
}
