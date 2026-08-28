package rw.core;

import rw.GuiWidget;

public class C0925 {
   public Object[] f1000;
   public static Object[] f2000;

   public C0925() {
      this.m6000();
   }

   static {
      ntfClinit();
   }

   private void m6000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[1];
         Object[] var1 = this.f1000;
      }
   }

   private static void m8000() {
      f2000 = new Object[]{null};
   }

   public static C0925 m14000(GuiWidget var0) {
      ((C0925)f2000[0]).f1000[0] = var0;
      return (C0925)f2000[0];
   }

   public GuiWidget m16000() {
      return (GuiWidget)this.f1000[0];
   }
}
