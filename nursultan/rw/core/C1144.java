package rw.core;

import java.util.Map;
import org.jspecify.annotations.NonNull;
import rw.data.Rec0255;
import rw.event.EventBus;

public class C1144 extends ClassValue<Rec0255> {
   public Object[] f1000;

   private void m2000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[1];
         Object[] var1 = this.f1000;
      }
   }

   public C1144(EventBus var1) {
      this.m2000();
      this.f1000[0] = var1;
   }

   static {
      ntfClinit();
   }

   public Rec0255 m8000(@NonNull Class<?> var1) {
      return (Rec0255)((Map)((EventBus)this.f1000[0]).f2000[1]).get(var1);
   }
}
