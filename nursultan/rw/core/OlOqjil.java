package rw.core;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Consumer;

public class OlOqjil {
   public static Object[] f1000;
   public Object[] f2000;

   public void m2000() {
      ((AtomicLong)this.f2000[2]).incrementAndGet();
   }

   private static void m8000() {
      f1000 = new Object[]{5, 250L};
   }

   public OlOqjil() {
      this.m22000();
      CopyOnWriteArrayList var5 = new CopyOnWriteArrayList();
      this.f2000[0] = var5;
      AtomicInteger var6 = new AtomicInteger();
      this.f2000[1] = var6;
      AtomicLong var7 = new AtomicLong();
      this.f2000[2] = var7;
   }

   static {
      ntfClinit();
   }

   public C1167 m18000() {
      return new C1167(this);
   }

   private void m20000() {
      List var1 = ((List)this.f2000[0]).stream().filter(C1161::m42000).toList();
      int var2 = var1.size() - 5;

      for (C1161 var4 : var1) {
         if (var2 <= 0) {
            return;
         }

         if (!var4.m58000()) {
            var4.m60000();
            var2--;
         }
      }
   }

   private void m22000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[3];
         Object[] var1 = this.f2000;
      }
   }

   public List<C1161> m24000() {
      this.m52000();
      return ((List)this.f2000[0]).stream().filter(C1161::m42000).toList();
   }

   private C1161 m26000(int var1) {
      if (var1 <= 0) {
         return null;
      } else {
         for (C1161 var3 : (List)this.f2000[0]) {
            if (var3.m56000() == var1) {
               return var3.m42000() ? var3 : null;
            }
         }

         return null;
      }
   }

   public long m28000() {
      return ((AtomicLong)this.f2000[2]).get();
   }

   public boolean m30000(int var1) {
      return (boolean)(this.m26000(var1) != null ? 1 : 0);
   }

   public int m34000(C1167 var1) {
      C1161 var2 = var1.m40000(((AtomicInteger)this.f2000[1]).incrementAndGet());
      this.m52000();
      ((List)this.f2000[0]).add(var2);
      this.m20000();
      this.m2000();
      return var2.m56000();
   }

   public boolean m36000(int var1) {
      C1161 var2 = this.m26000(var1);
      if (var2 == null) {
         return (boolean)0;
      } else {
         var2.m60000();
         return (boolean)1;
      }
   }

   public int m40000(int var1, Consumer<C1161> var2, Consumer<C1167> var3) {
      if (this.m44000(var1, var2)) {
         return var1;
      } else {
         C1167 var4 = this.m18000();
         var3.accept(var4);
         return var4.m44000();
      }
   }

   public boolean m44000(int var1, Consumer<C1161> var2) {
      C1161 var3 = this.m26000(var1);
      if (var3 == null) {
         return (boolean)0;
      } else {
         var2.accept(var3);
         this.m2000();
         return (boolean)1;
      }
   }

   public List<C1161> m46000() {
      this.m52000();
      return List.copyOf((List)this.f2000[0]);
   }

   private void m52000() {
      long var1 = System.currentTimeMillis();
      ((List)this.f2000[0]).removeIf(var2 -> (boolean)(!((C1161)var2).m42000() && var1 - ((C1161)var2).m28000() >= 250L ? 1 : 0));
   }
}
