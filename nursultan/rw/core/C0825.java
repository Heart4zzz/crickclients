package rw.core;

import java.util.function.Consumer;
import rw.setting.OlpOtr;

public class C0825 {
   public Object[] f1000;

   public static C0818 m2000() {
      return new C0818();
   }

   private void m6000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[3];
         Object[] var1 = this.f1000;
         var1[2] = 0;
      }
   }

   public C0825(OlpOtr var1, C1246 var2, int var3) {
      this.m6000();
      this.f1000[0] = var1;
      this.f1000[1] = var2;
      Integer var10 = var3;
      this.f1000[2] = var10;
   }

   static {
      ntfClinit();
   }

   public int m12000() {
      return (Integer)this.f1000[2];
   }

   static int m14000() {
      return 4;
   }

   static C1246 m16000() {
      return (C1246)C1234.f1000[3];
   }

   public C1246 m18000() {
      return (C1246)this.f1000[1];
   }

   public void m20000() {
      this.m28000(var0 -> {});
   }

   public OlpOtr m24000() {
      return (OlpOtr)this.f1000[0];
   }

   public void m28000(Consumer<OlpOtr> var1) {
      ((OlpOtr)this.f1000[0]).m8000();
      ((C1246)this.f1000[1]).m26000();
      var1.accept((OlpOtr)this.f1000[0]);
   }
}
