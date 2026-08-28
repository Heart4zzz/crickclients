package rw.data;

import java.util.Objects;
import rw.setting.C0071;

public record Rec0184() {
   public C0071 f1000;
   private static boolean[] f2000;
   public int f3000;

   private static void m2000() {
      boolean[] var128 = new boolean[(1 | -1) >>> 31];
      f2000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
   }

   Rec0184(C0071 var1, int var2) {
      this.f1000 = var1;
      this.f3000 = var2;
   }

   static {
      ntfClinit();
   }

   public boolean m4000(Object var1) {
      if (var1 != null && this.getClass() == var1.getClass()) {
         Rec0184 var2 = (Rec0184)var1;
         return Objects.equals(this.f1000.method_5820(), var2.f1000.method_5820());
      } else {
         return f2000[0];
      }
   }

   @Override
   public int hashCode() {
      return Objects.hashCode(this.f1000.method_5820());
   }

   public int m6000() {
      return this.f3000;
   }

   public C0071 m10000() {
      return this.f1000;
   }
}
