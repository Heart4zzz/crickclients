package rw.core;

import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Consumer;
import rw.data.Rec0302;
import rw.net.Enum0031;

public class C1212 {
   public Object[] f1000;

   public C1212() {
      this.m6000();
      Object[] var5 = new Object[0];
      this.f1000[0] = var5;
      ConcurrentLinkedQueue var6 = new ConcurrentLinkedQueue();
      this.f1000[1] = var6;
   }

   static {
      ntfClinit();
   }

   private void m6000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[2];
         Object[] var1 = this.f1000;
      }
   }

   public void m10000() {
      ((Queue)this.f1000[1]).clear();
   }

   public void m14000(Enum0031 var1, Consumer<Rec0302> var2) {
      synchronized ((Object)this.f1000[0]) {
         if (var1 != null && !((Queue)this.f1000[1]).isEmpty()) {
            ArrayList var5 = null;

            Rec0302 var4;
            while ((var4 = (Rec0302)((Queue)this.f1000[1]).poll()) != null) {
               if (var4.m6000() == var1) {
                  var2.accept(var4);
               } else {
                  if (var5 == null) {
                     var5 = new ArrayList();
                  }

                  var5.add(var4);
               }
            }

            if (var5 != null) {
               ((Queue)this.f1000[1]).addAll(var5);
            }
         }
      }
   }

   public boolean m18000() {
      return ((Queue)this.f1000[1]).isEmpty();
   }

   public void m20000(Rec0302 var1) {
      ((Queue)this.f1000[1]).add(var1);
   }
}
