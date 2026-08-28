package rw.data;

import java.util.Objects;

public record OliOkkns() {
   public String f1000;
   private static boolean[] f2000;
   public long f3000;

   private static void m2000() {
      boolean[] var128 = new boolean[(1 | -1) >>> 31];
      f2000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
   }

   public OliOkkns(String var1, long var2) {
      this.f1000 = var1;
      this.f3000 = var2;
   }

   static {
      ntfClinit();
   }

   public boolean m4000(Object var1) {
      return var1 instanceof OliOkkns var2 ? Objects.equals(this.f1000, var2.f1000) : f2000[0];
   }

   @Override
   public int hashCode() {
      return Objects.hashCode(this.f1000);
   }

   public String m6000() {
      return this.f1000;
   }

   public long m8000() {
      return this.f3000;
   }
}
