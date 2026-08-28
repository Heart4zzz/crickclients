package rw.core;

import rw.setting.OlpOtr;

public class C0818 {
   public Object[] f1000;

   private void m4000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[5];
         Object[] var1 = this.f1000;
         var1[1] = false;
         var1[3] = false;
         var1[4] = 0;
      }
   }

   public C0818() {
      this.m4000();
   }

   static {
      ntfClinit();
   }

   @Override
   public String toString() {
      return "Pipeline.PipelineBuilder(shader="
         + (OlpOtr)this.f1000[0]
         + ", state$value="
         + (C1246)this.f1000[2]
         + ", drawMode$value="
         + (Integer)this.f1000[4]
         + ")";
   }

   public C0818 m16000(OlpOtr var1) {
      this.f1000[0] = var1;
      return this;
   }

   public C0818 m18000(int var1) {
      Integer var6 = var1;
      this.f1000[4] = var6;
      Boolean var7 = true;
      this.f1000[3] = var7;
      return this;
   }

   public C0825 m20000() {
      C1246 var1 = (C1246)this.f1000[2];
      if (!(Boolean)this.f1000[1]) {
         var1 = C0825.m16000();
      }

      int var2 = (Integer)this.f1000[4];
      if (!(Boolean)this.f1000[3]) {
         var2 = C0825.m14000();
      }

      return new C0825((OlpOtr)this.f1000[0], var1, var2);
   }

   public C0818 m22000(C1246 var1) {
      this.f1000[2] = var1;
      Boolean var7 = true;
      this.f1000[1] = var7;
      return this;
   }
}
