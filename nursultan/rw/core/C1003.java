package rw.core;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import rw.data.Rec0312;

public class C1003<T extends C1013> extends Base1014<List<T>> {
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

   public C1003(Rec0312 var1, List<T> var2) {
      super(var1, null);
      this.m4000();
      this.f2000[0] = var2;
      this.L(this.m18000());
      this.y((List)this.i());
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      f1000 = new String[]{"Use selectEntry instead of setValue", "Entry is null or not found"};
   }

   @Override
   public void m6000() {
      this.m4000();
      List var1 = (List)this.U();

      for (C1013 var3 : (List)this.f2000[0]) {
         var3.m6000((boolean)0);
         if (var1.contains(var3)) {
            var3.m6000((boolean)1);
         }
      }

      this.L(this.m18000());
   }

   public void m14000(List<T> var1) {
      throw new UnsupportedOperationException(f1000[0]);
   }

   public void m16000(T var1, boolean var2) {
      this.m4000();
      if (var1 != null && ((List)this.f2000[0]).contains(var1)) {
         var1.m6000(var2);
         this.L(this.m18000());
      } else {
         throw new IllegalArgumentException(f1000[1]);
      }
   }

   private List<T> m18000() {
      this.m4000();
      return ((List)this.f2000[0]).stream().filter(C1013::m14000).collect(Collectors.toList());
   }

   @Override
   public boolean c_() {
      List var1 = (List)this.i();
      List var2 = (List)this.U();
      return (boolean)(var1.size() != var2.size()
         ? 1
         : IntStream.range(0, var1.size())
            .anyMatch(var2x -> (boolean)(!((C1013)var1.get(var2x)).m22000().m10000().equals(((C1013)var2.get(var2x)).m22000().m10000()) ? 1 : 0)));
   }
}
