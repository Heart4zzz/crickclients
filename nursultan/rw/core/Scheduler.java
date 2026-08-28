package rw.core;

import KDFzREm.NNuU;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.function.Predicate;
import org.apache.logging.log4j.Logger;

public class Scheduler {
   private static String[] f1000;
   public Object[] f2000;
   public static Object[] f3000;

   public Scheduler() {
      this.m38000();
      ConcurrentLinkedDeque var5 = new ConcurrentLinkedDeque();
      this.f2000[0] = var5;
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      f3000 = new Object[]{null};
   }

   private static void m12000() {
      f1000 = new String[]{"Error updating schedules: {}"};
   }

   public void m14000(int var1, Runnable var2) {
      ((ConcurrentLinkedDeque)this.f2000[0]).add(new C0953(var1, var2));
   }

   public C0952 m18000(int var1, int var2, Runnable var3) {
      C0952 var4 = new C0952(var1, var2, var3);
      ((ConcurrentLinkedDeque)this.f2000[0]).add(var4);
      return var4;
   }

   public void m22000(Predicate<NNuU> var1, Runnable var2) {
      ((ConcurrentLinkedDeque)this.f2000[0]).add(new C0969(var2, var1));
   }

   public C0952 m24000(int var1, Runnable var2) {
      C0952 var3 = new C0952(var1, var2);
      ((ConcurrentLinkedDeque)this.f2000[0]).add(var3);
      return var3;
   }

   public void m26000() {
      Iterator var1 = ((ConcurrentLinkedDeque)this.f2000[0]).iterator();

      while (var1.hasNext()) {
         try {
            C0953 var2 = (C0953)var1.next();
            int var3 = var2 != null ? 1 : 0;
            if (var3 != 0) {
               var2.m14000();
            }

            if (var3 == 0 || var2.m4000()) {
               var1.remove();
            }
         } catch (Exception var4) {
            ((Logger)f3000[0]).error(f1000[0], var4.getMessage(), var4);
         }
      }
   }

   public void m28000(C0961 var1) {
      ((ConcurrentLinkedDeque)this.f2000[0]).add(var1);
   }

   public void m34000(int var1, int var2, Runnable var3) {
      this.m28000(new C0961(var1, var2, var3));
   }

   public void m36000(Runnable var1) {
      this.m14000(1, var1);
   }

   private void m38000() {
      this.f2000 = new Object[1];
   }
}
