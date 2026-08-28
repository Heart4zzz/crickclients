package rw.data;

import com.mojang.datafixers.util.Pair;
import java.util.Objects;
import rw.defs.Enum0090;

public record Rec0286() {
   public Enum0090 f1000;
   public int f2000;
   public Pair<Integer, Integer> f3000;
   private static boolean[] f4000;
   private static short[] f5000;

   public Pair<Integer, Integer> m2000() {
      return this.f3000;
   }

   public Rec0286(Enum0090 var1, Pair<Integer, Integer> var2, int var3) {
      this.f1000 = var1;
      this.f3000 = var2;
      this.f2000 = var3;
   }

   static {
      ntfClinit();
   }

   public boolean m4000(Object var1) {
      if (var1 instanceof Rec0286 var2) {
         return this.f2000 == var2.f2000 ? f4000[1] : f4000[2];
      } else {
         return f4000[0];
      }
   }

   @Override
   public int hashCode() {
      return Objects.hashCode(this.f2000);
   }

   private static void m6000() {
      short[] var128 = new short[(1 | -1) >>> 31];
      f5000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
   }

   public int m8000() {
      return this.f2000;
   }

   public Enum0090 m10000() {
      return this.f1000;
   }

   public String m14000() {
      return (String)this.f1000.f3000[f5000[0]] + this.f2000;
   }

   private static void m20000() {
      boolean[] var128 = new boolean[3];
      f4000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f4000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f4000[2] = (boolean)((0 | -0) >>> 31);
   }
}
