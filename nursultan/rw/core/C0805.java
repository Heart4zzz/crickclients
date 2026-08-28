package rw.core;

import java.util.function.Consumer;
import rw.setting.OlpOtr;

public class C0805 {
   public Object[] f1000;

   public C0808 m4000() {
      return ((C0830)this.f1000[1]).m52000();
   }

   public void m6000() {
      this.m32000(var0 -> {});
   }

   C0805(C0825 var1, C0830 var2, int var3) {
      this.m14000();
      this.f1000[0] = var1;
      this.f1000[1] = var2;
      Integer var10 = var3;
      this.f1000[2] = var10;
   }

   static {
      ntfClinit();
   }

   public C0825 m12000() {
      return (C0825)this.f1000[0];
   }

   private void m14000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[3];
         Object[] var1 = this.f1000;
         var1[2] = 0;
      }
   }

   public C0830 m18000() {
      return (C0830)this.f1000[1];
   }

   public void m24000(Consumer<OlpOtr> var1) {
      if (((C0830)this.f1000[1]).m6000().m16000() != 0) {
         ((C0825)this.f1000[0]).m28000(var1);
         ((C0830)this.f1000[1]).m36000(35040);
         ((C0830)this.f1000[1]).m44000(((C0825)this.f1000[0]).m12000(), (Integer)this.f1000[2], ((C0830)this.f1000[1]).m32000());
      }
   }

   public int m26000() {
      return (Integer)this.f1000[2];
   }

   public static UmQl m30000() {
      return new UmQl();
   }

   public void m32000(Consumer<OlpOtr> var1) {
      if (((C0830)this.f1000[1]).m6000().m16000() != 0) {
         ((C0825)this.f1000[0]).m28000(var1);
         ((C0830)this.f1000[1]).m36000(35040);
         ((C0830)this.f1000[1]).m56000(((C0825)this.f1000[0]).m12000());
      }
   }

   public C0811 m38000() {
      return ((C0830)this.f1000[1]).m6000();
   }
}
