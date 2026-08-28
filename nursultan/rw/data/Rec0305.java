package rw.data;

import java.util.Objects;

public record Rec0305() {
   public String f1000;
   public int f2000;
   public String f3000;
   private static boolean[] f4000;

   public String m2000() {
      return this.f1000;
   }

   public Rec0305(String var1, String var2, int var3) {
      this.f1000 = var1;
      this.f3000 = var2;
      this.f2000 = var3;
   }

   static {
      ntfClinit();
   }

   public boolean m4000(Object var1) {
      return var1 instanceof Rec0305 var2 ? Objects.equals(this.f1000, var2.f1000) : f4000[0];
   }

   @Override
   public int hashCode() {
      return Objects.hashCode(this.f1000);
   }

   private static void m6000() {
      boolean[] var128 = new boolean[(1 | -1) >>> 31];
      f4000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
   }

   public String m8000() {
      return this.f3000;
   }

   public int m10000() {
      return this.f2000;
   }
}
