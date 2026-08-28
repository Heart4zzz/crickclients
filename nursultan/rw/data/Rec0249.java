package rw.data;

import java.lang.runtime.ObjectMethods;
import rw.defs.OlmmOsl;

public record Rec0249() {
   public float f1000;
   public float f2000;
   public String f3000;
   public boolean f4000;
   public String f5000;
   public OlmmOsl f6000;

   public OlmmOsl m2000() {
      return this.f6000;
   }

   Rec0249(String var1, String var2, OlmmOsl var3, boolean var4, float var5, float var6) {
      this.f5000 = var1;
      this.f3000 = var2;
      this.f6000 = var3;
      this.f4000 = var4;
      this.f1000 = var5;
      this.f2000 = var6;
   }

   static {
      ntfClinit();
   }

   public boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0249,"text;family;weight;italic;fontSize;uiScale",Rec0249::f5000,Rec0249::f3000,Rec0249::f6000,Rec0249::f4000,Rec0249::f1000,Rec0249::f2000>(
         this, var1
      );
   }

   public float m6000() {
      return this.f2000;
   }

   public boolean m8000() {
      return this.f4000;
   }

   public String m10000() {
      return this.f5000;
   }

   public float m12000() {
      return this.f1000;
   }

   public String m14000() {
      return this.f3000;
   }
}
