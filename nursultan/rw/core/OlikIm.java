package rw.core;

import java.util.LinkedList;
import java.util.List;
import rw.api.Iface0623;
import rw.data.Rec0228;

public class OlikIm implements Iface0623 {
   public Object[] f1000;

   public OlikIm() {
      this.m4000();
      LinkedList var5 = new LinkedList();
      this.f1000[0] = var5;
   }

   static {
      ntfClinit();
   }

   private void m4000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[1];
         Object[] var1 = this.f1000;
      }
   }

   public void m10000() {
      ((List)this.f1000[0]).clear();
   }

   public List<Rec0228> m14000() {
      return (List<Rec0228>)this.f1000[0];
   }

   public void m16000(Rec0228 var1) {
      ((List)this.f1000[0]).add(var1);
   }
}
