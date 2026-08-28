package rw.core;

import java.util.Collection;
import java.util.LinkedList;

public class C0889<E> extends LinkedList<E> {
   public Object[] f1000;
   private static String[] f2000;

   public C0889(int var1) {
      this.m16000();
      if (var1 <= 0) {
         throw new IllegalArgumentException(f2000[0]);
      } else {
         Integer var6 = var1;
         this.f1000[0] = var6;
      }
   }

   static {
      ntfClinit();
   }

   public boolean m6000(E var1) {
      super.add((E)var1);
      this.m12000();
      return (boolean)1;
   }

   public void m8000(int var1, E var2) {
      super.add(var1, (E)var2);
      this.m12000();
   }

   private void m12000() {
      while (this.m26000(this.size())) {
         this.removeFirst();
      }
   }

   @Override
   public boolean addAll(int var1, Collection<? extends E> var2) {
      boolean var3 = super.addAll(var1, var2);
      if (var3) {
         this.m12000();
      }

      return var3;
   }

   @Override
   public boolean addAll(Collection<? extends E> var1) {
      boolean var2 = super.addAll(var1);
      if (var2) {
         this.m12000();
      }

      return var2;
   }

   private void m16000() {
      this.f1000 = new Object[1];
      this.f1000[0] = 0;
   }

   private static void m22000() {
      f2000 = new String[]{"maxSize должен быть больше 0"};
   }

   public boolean m26000(int var1) {
      return (boolean)(var1 > this.f1000[0] ? 1 : 0);
   }
}
