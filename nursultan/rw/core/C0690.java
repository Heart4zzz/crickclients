package rw.core;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;
import rw.data.ConfigFiles;

public class C0690 {
   public Object[] f1000;

   public boolean m2000() {
      return ((Map)this.f1000[0]).isEmpty();
   }

   public Optional<Noqodls> m4000(UUID var1) {
      return Optional.ofNullable((Noqodls)((Map)this.f1000[0]).get(var1));
   }

   public void m8000(Noqodls var1) {
      ((Map)this.f1000[0]).put(var1.m38000(), var1);
      ((AtomicLong)this.f1000[1]).incrementAndGet();
      ConfigFiles.m54000(C0980.class);
   }

   private void m10000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[2];
         Object[] var1 = this.f1000;
      }
   }

   public C0690() {
      this.m10000();
      LinkedHashMap var5 = new LinkedHashMap();
      this.f1000[0] = var5;
      AtomicLong var6 = new AtomicLong();
      this.f1000[1] = var6;
   }

   static {
      ntfClinit();
   }

   public List<Noqodls> m16000() {
      return List.copyOf(((Map)this.f1000[0]).values());
   }

   public void m18000(UUID var1) {
      Noqodls var2 = (Noqodls)((Map)this.f1000[0]).get(var1);
      if (var2 != null) {
         var2.m36000((boolean)(!var2.m24000() ? 1 : 0));
         ((AtomicLong)this.f1000[1]).incrementAndGet();
         ConfigFiles.m54000(C0980.class);
      }
   }

   public int m20000() {
      return ((Map)this.f1000[0]).size();
   }

   public void m22000(Noqodls var1) {
      ((Map)this.f1000[0]).remove(var1.m38000());
      ((AtomicLong)this.f1000[1]).incrementAndGet();
   }

   public void m26000(UUID var1) {
      if (((Map)this.f1000[0]).remove(var1) != null) {
         ((AtomicLong)this.f1000[1]).incrementAndGet();
         ConfigFiles.m54000(C0980.class);
      }
   }

   public long m30000() {
      return ((AtomicLong)this.f1000[1]).get();
   }

   public void m32000(Noqodls var1) {
      ((Map)this.f1000[0]).put(var1.m38000(), var1);
      ((AtomicLong)this.f1000[1]).incrementAndGet();
   }
}
