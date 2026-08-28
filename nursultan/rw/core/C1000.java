package rw.core;

import java.util.List;
import java.util.function.BooleanSupplier;
import rw.data.Rec0312;

public class C1000<T extends C1013> extends Base1014<T> {
   private static String[] f1000;
   public Object[] f2000;

   public List<T> m2000() {
      this.m4000();
      return List.copyOf((List)this.f2000[0]);
   }

   private void m4000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[1];
         Object[] var1 = this.f2000;
      }
   }

   public C1000(Rec0312 var1, List<T> var2) {
      super(var1, null);
      this.m4000();
      this.f2000[0] = var2;
      long var3 = var2.stream().filter(C1013::m14000).count();
      if (var3 <= 0L) {
         throw new IllegalArgumentException(f1000[0]);
      } else if (var3 > 1L) {
         throw new IllegalArgumentException(f1000[1]);
      } else {
         this.L((C1013)var2.stream().filter(C1013::m14000).findFirst().orElseThrow());
         this.y((C1013)this.i());
      }
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      f1000 = new String[]{
         "No value is selected",
         "More than one value is selected",
         "Use selectEntry instead of setValue",
         "Entry is null or not found",
         "Entry is null or not found"
      };
   }

   @Override
   public void m6000() {
      this.m18000((C1013)this.U());
   }

   public void m18000(C1013 var1) {
      this.m4000();
      if (var1 != null && ((List)this.f2000[0]).contains(var1)) {
         ((List)this.f2000[0]).forEach(var1x -> var1x.m6000((boolean)(var1x == var1 ? 1 : 0)));
         this.L(var1);
      } else {
         throw new IllegalArgumentException(f1000[4]);
      }
   }

   public void m24000(T var1) {
      throw new UnsupportedOperationException(f1000[2]);
   }

   public C1000<T> m28000(BooleanSupplier var1, T var2) {
      this.m4000();
      if (var2 != null && ((List)this.f2000[0]).contains(var2)) {
         this.N(var1, var2);

         for (C1013 var4 : (List)this.f2000[0]) {
            var4.m30000(() -> var1.getAsBoolean() ? var4 == var2 : null);
         }

         return this;
      } else {
         throw new IllegalArgumentException(f1000[3]);
      }
   }

   @Override
   public boolean c_() {
      C1013 var1 = (C1013)this.W();
      C1013 var2 = (C1013)this.U();
      return (boolean)(!var1.m22000().m10000().equals(var2.m22000().m10000()) ? 1 : 0);
   }
}
