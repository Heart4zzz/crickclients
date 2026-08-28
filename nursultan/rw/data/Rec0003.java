package rw.data;

import java.lang.runtime.ObjectMethods;
import rw.defs.Enum0061;
import rw.defs.Enum0062;
import rw.defs.Enum0063;

public record Rec0003() {
   public int f1000;
   public int f2000;
   public Enum0063 f3000;
   public Enum0061 f4000;
   public int f5000;
   public Enum0062 f6000;
   public boolean f7000;
   public Enum0061 f8000;
   public Enum0063 f9000;

   public Enum0061 m2000() {
      return this.f8000;
   }

   public Enum0063 m4000() {
      return this.f3000;
   }

   public Rec0003(int var1, int var2, Enum0062 var3, Enum0063 var4, Enum0063 var5, Enum0061 var6, Enum0061 var7, boolean var8, int var9) {
      this.f1000 = var1;
      this.f5000 = var2;
      this.f6000 = var3;
      this.f3000 = var4;
      this.f9000 = var5;
      this.f8000 = var6;
      this.f4000 = var7;
      this.f7000 = var8;
      this.f2000 = var9;
   }

   static {
      ntfClinit();
   }

   public boolean m6000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0003,"width;height;format;minFilter;magFilter;wrapS;wrapT;mipmapped;usage",Rec0003::f1000,Rec0003::f5000,Rec0003::f6000,Rec0003::f3000,Rec0003::f9000,Rec0003::f8000,Rec0003::f4000,Rec0003::f7000,Rec0003::f2000>(
         this, var1
      );
   }

   public int m8000() {
      return this.f1000;
   }

   public int m10000() {
      return this.f2000;
   }

   public Enum0061 m12000() {
      return this.f4000;
   }

   public boolean m14000() {
      return this.f7000;
   }

   public Enum0062 m16000() {
      return this.f6000;
   }

   public int m18000() {
      return this.f5000;
   }

   public Enum0063 m20000() {
      return this.f9000;
   }
}
