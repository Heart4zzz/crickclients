package rw.core;

import rw.data.CriticalPartApi;
import rw.data.OlnpOqOpi;
import rw.data.Rec0304;
import rw.data.Rec0309;

public class C1230 {
   public Object[] f1000;

   public C1230() {
      this.m6000();
   }

   static {
      ntfClinit();
   }

   @Override
   public String toString() {
      return "RenderState.RenderStateBuilder(blend$value="
         + (Rec0309)this.f1000[1]
         + ", depthMask$value="
         + (CriticalPartApi)this.f1000[3]
         + ", depthTest$value="
         + (OlnpOqOpi)this.f1000[5]
         + ", cull$value="
         + (Rec0304)this.f1000[7]
         + ")";
   }

   private void m6000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[8];
         Object[] var1 = this.f1000;
         var1[0] = false;
         var1[2] = false;
         var1[4] = false;
         var1[6] = false;
      }
   }

   public C1230 m14000(CriticalPartApi var1) {
      this.f1000[3] = var1;
      Boolean var7 = true;
      this.f1000[2] = var7;
      return this;
   }

   public C1246 m16000() {
      Rec0309 var1 = (Rec0309)this.f1000[1];
      if (!(Boolean)this.f1000[0]) {
         var1 = C1246.m24000();
      }

      CriticalPartApi var2 = (CriticalPartApi)this.f1000[3];
      if (!(Boolean)this.f1000[2]) {
         var2 = C1246.m30000();
      }

      OlnpOqOpi var3 = (OlnpOqOpi)this.f1000[5];
      if (!(Boolean)this.f1000[4]) {
         var3 = C1246.m14000();
      }

      Rec0304 var4 = (Rec0304)this.f1000[7];
      if (!(Boolean)this.f1000[6]) {
         var4 = C1246.m12000();
      }

      return new C1246(var1, var2, var3, var4);
   }

   public C1230 m20000(OlnpOqOpi var1) {
      this.f1000[5] = var1;
      Boolean var7 = true;
      this.f1000[4] = var7;
      return this;
   }

   public C1230 m22000(Rec0304 var1) {
      this.f1000[7] = var1;
      Boolean var7 = true;
      this.f1000[6] = var7;
      return this;
   }

   public C1230 m24000(Rec0309 var1) {
      this.f1000[1] = var1;
      Boolean var7 = true;
      this.f1000[0] = var7;
      return this;
   }
}
