package rw.core;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import rw.data.Rec0205;

public class C0885 {
   public Object[] f1000;

   public void m4000() {
      ((List)this.f1000[0]).clear();
   }

   public C0885() {
      this.m8000();
      ArrayList var5 = new ArrayList();
      this.f1000[0] = var5;
   }

   static {
      ntfClinit();
   }

   private void m8000() {
      this.f1000 = new Object[1];
   }

   public void m12000(Consumer<Rec0205> var1) {
      for (int var2 = ((List)this.f1000[0]).size() - 1; var2 >= 0; var2--) {
         var1.accept((Rec0205)((List)this.f1000[0]).get(var2));
      }

      ((List)this.f1000[0]).clear();
   }

   public boolean m14000() {
      return ((List)this.f1000[0]).isEmpty();
   }

   public void m16000(int var1, int var2) {
      ((List)this.f1000[0]).add(new Rec0205(var1, var2));
   }

   public void m20000() {
      if (!((List)this.f1000[0]).isEmpty()) {
         ((List)this.f1000[0]).removeLast();
      }
   }

   public void m22000(Consumer<Rec0205> var1) {
      for (int var2 = ((List)this.f1000[0]).size() - 1; var2 >= 0; var2--) {
         var1.accept((Rec0205)((List)this.f1000[0]).get(var2));
      }
   }
}
