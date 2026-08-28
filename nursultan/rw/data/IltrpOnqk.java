package rw.data;

import java.util.Objects;

public record IltrpOnqk() {
   public boolean f1000;
   private static boolean[] f2000;
   public String f3000;
   public String f4000;

   public boolean m2000() {
      return this.f1000;
   }

   public IltrpOnqk(String var1, String var2, boolean var3) {
      this.f3000 = var1;
      this.f4000 = var2;
      this.f1000 = var3;
   }

   static {
      ntfClinit();
   }

   public boolean m4000(Object var1) {
      if (var1 != null && this.getClass() == var1.getClass()) {
         IltrpOnqk var2 = (IltrpOnqk)var1;
         return Objects.equals(this.f3000, var2.f3000);
      } else {
         return f2000[0];
      }
   }

   @Override
   public int hashCode() {
      return Objects.hashCode(this.f3000);
   }

   private static void m6000() {
      boolean[] var128 = new boolean[(1 | -1) >>> 31];
      f2000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
   }

   public String m8000() {
      return this.f3000;
   }

   public String m12000() {
      return this.f4000;
   }
}
