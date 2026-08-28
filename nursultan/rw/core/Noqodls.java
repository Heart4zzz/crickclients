package rw.core;

import java.util.Objects;
import java.util.UUID;
import rw.api.Iface0640;
import rw.defs.Enum0002;

public class Noqodls {
   public Object[] f1000;

   public Enum0002 m2000() {
      return ((Iface0640)this.f1000[0]).m8000();
   }

   public long m6000() {
      return (Long)this.f1000[1];
   }

   public Noqodls(Iface0640 var1, boolean var2, long var3) {
      this.m18000();
      this.f1000[0] = var1;
      Boolean var10 = var2;
      this.f1000[2] = var10;
      Long var11 = var3;
      this.f1000[1] = var11;
   }

   static {
      ntfClinit();
   }

   public boolean m8000(Object var1) {
      if (this == var1) {
         return (boolean)1;
      } else {
         return (boolean)(var1 instanceof Noqodls var2 && ((Iface0640)this.f1000[0]).equals((Iface0640)var2.f1000[0]) ? 1 : 0);
      }
   }

   @Override
   public int hashCode() {
      return Objects.hashCode((Iface0640)this.f1000[0]);
   }

   public Iface0640 m14000() {
      return (Iface0640)this.f1000[0];
   }

   private void m18000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[3];
         Object[] var1 = this.f1000;
         var1[1] = 0L;
         var1[2] = false;
      }
   }

   public String m20000() {
      return ((Iface0640)this.f1000[0]).m4000();
   }

   public boolean m24000() {
      return (Boolean)this.f1000[2];
   }

   public UUID m34000() {
      return ((Iface0640)this.f1000[0]).m2000();
   }

   public Noqodls m36000(boolean var1) {
      Boolean var6 = var1;
      this.f1000[2] = var6;
      return this;
   }

   public UUID m38000() {
      return ((Iface0640)this.f1000[0]).m6000();
   }
}
