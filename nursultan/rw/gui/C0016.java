package rw.gui;

import java.util.Objects;
import rw.core.C0259;
import rw.core.C0291;
import rw.data.Rec0096;
import rw.data.Rec0097;
import rw.data.Rec0104;
import rw.defs.Enum0028;
import rw.defs.Enum0045;

public final class C0016 {
   private final C0291 f1000;
   private final C0018 f2000;
   private final C0017 f3000;
   private rw.setting.C0059 f4000;
   private Enum0028 f5000 = Enum0028.f1000;
   private rw.setting.C0059 f6000;
   private Enum0028 f7000 = Enum0028.f1000;
   private Rec0104 f8000;

   public Enum0045 m2000(rw.setting.C0059 var1) {
      if (var1 == null) {
         return Enum0045.f1000;
      } else if (var1 == this.f6000 && this.f7000 == Enum0028.f3000) {
         return Enum0045.f3000;
      } else {
         return var1 == this.f4000 && this.f5000 == Enum0028.f3000 ? Enum0045.f2000 : Enum0045.f1000;
      }
   }

   public boolean m4000() {
      boolean var1 = this.f7000 != Enum0028.f1000 || this.f8000 != null;
      this.f8000 = null;
      this.m8000(null, Enum0028.f1000);
      return var1;
   }

   public boolean m6000(rw.setting.C0059 var1, float var2) {
      if (this.f8000 == null) {
         return false;
      } else if (!this.m18000(var1, this.f8000.m8000())) {
         this.m16000();
         return false;
      } else {
         Rec0096 var3 = this.m12000(this.f8000.m8000());
         if (var3 == null) {
            this.m16000();
            return true;
         } else {
            float var4 = var2 - this.f8000.m2000();
            float var5 = var4 - this.f8000.m6000() - var3.m28000();
            this.m44000(this.f8000.m8000(), var3, var5);
            this.m24000(this.f8000.m8000(), Enum0028.f3000);
            return true;
         }
      }
   }

   private void m8000(rw.setting.C0059 var1, Enum0028 var2) {
      Enum0028 var3 = var2 == null ? Enum0028.f1000 : var2;
      if (this.f6000 != var1 || this.f7000 != var3) {
         m10000(this.f6000);
         this.f6000 = var1;
         this.f7000 = var3;
         m10000(this.f6000);
      }
   }

   private C0016(C0291 var1) {
      this.f1000 = Objects.requireNonNull(var1, "uiScalePolicy");
      this.f2000 = new C0018(this.f1000);
      this.f3000 = new C0017(this.f1000);
   }

   private static void m10000(rw.setting.C0059 var0) {
      if (var0 != null) {
         var0.m56000(1);
      }
   }

   public Rec0096 m12000(rw.setting.C0059 var1) {
      return this.f2000.m4000(var1);
   }

   private void m14000(rw.setting.C0059 var1, float var2) {
      if (var1.m42000().m82000(var2, this.f1000.m4000())) {
         var1.m56000(8);
      }
   }

   private void m16000() {
      this.f8000 = null;
      this.m8000(null, Enum0028.f1000);
      this.m24000(null, Enum0028.f1000);
   }

   private boolean m18000(rw.setting.C0059 var1, rw.setting.C0059 var2) {
      if (var1 == null || var2 == null) {
         return false;
      } else {
         return !m34000(var1, var2) ? false : this.m12000(var2) != null;
      }
   }

   public Enum0045 m22000(rw.setting.C0059 var1) {
      if (var1 == null) {
         return Enum0045.f1000;
      } else if (var1 == this.f6000 && this.f7000 == Enum0028.f2000) {
         return Enum0045.f3000;
      } else {
         return var1 == this.f4000 && this.f5000 == Enum0028.f2000 ? Enum0045.f2000 : Enum0045.f1000;
      }
   }

   private void m24000(rw.setting.C0059 var1, Enum0028 var2) {
      Enum0028 var3 = var2 == null ? Enum0028.f1000 : var2;
      if (this.f4000 != var1 || this.f5000 != var3) {
         m10000(this.f4000);
         this.f4000 = var1;
         this.f5000 = var3;
         m10000(this.f4000);
      }
   }

   public boolean m26000(rw.setting.C0059 var1, float var2) {
      return this.f3000.m26000(var1, var2);
   }

   public boolean m28000() {
      return this.f8000 != null;
   }

   public void m30000(rw.setting.C0059 var1) {
      if (var1 == null) {
         this.m24000(null, Enum0028.f1000);
         this.m8000(null, Enum0028.f1000);
         this.f8000 = null;
         this.f3000.m6000();
      } else {
         if (this.f4000 != null && !this.m18000(var1, this.f4000)) {
            this.m24000(null, Enum0028.f1000);
         }

         if (this.f6000 != null && !this.m18000(var1, this.f6000)) {
            this.m8000(null, Enum0028.f1000);
            this.f8000 = null;
         }

         this.f3000.m8000(var1);
      }
   }

   public boolean m32000(rw.setting.C0059 var1, float var2) {
      return this.m48000(var1, null, var2);
   }

   static boolean m34000(rw.setting.C0059 var0, rw.setting.C0059 var1) {
      for (rw.setting.C0059 var2 = var1; var2 != null; var2 = var2.m180000()) {
         if (var2 == var0) {
            return true;
         }
      }

      return false;
   }

   public static C0016 m36000(C0013 var0) {
      C0013 var1 = Objects.requireNonNull(var0, "context");
      return var1.m10000(C0016.class).orElseGet(() -> {
         C0016 var1x = new C0016(var1.m6000());
         var1.m12000(C0016.class, var1x);
         return var1x;
      });
   }

   public void m38000(rw.setting.C0059 var1, Enum0028 var2) {
      this.m24000(var1, var2 == null ? Enum0028.f1000 : var2);
   }

   public boolean m40000(rw.setting.C0059 var1, Enum0028 var2, float var3, float var4) {
      if (var1 != null && var2 != Enum0028.f1000) {
         Rec0096 var5 = this.m12000(var1);
         if (var5 == null) {
            return false;
         } else {
            float var6 = var3 - var4;
            this.m24000(var1, var2);
            this.f3000.m22000(var1);
            if (var2 == Enum0028.f3000) {
               this.f8000 = new Rec0104(var1, var6 - var5.m16000(), var4);
               this.m8000(var1, Enum0028.f3000);
               return true;
            } else {
               this.m8000(var1, Enum0028.f2000);
               float var7 = var6 - var5.m28000() - var5.m22000() * 0.5F;
               this.m44000(var1, var5, var7);
               return true;
            }
         }
      } else {
         return false;
      }
   }

   public void m42000(Rec0097 var1) {
      this.f3000.m18000(Objects.requireNonNull(var1, "options"));
   }

   private void m44000(rw.setting.C0059 var1, Rec0096 var2, float var3) {
      float var4 = var2.m26000();
      if (var4 <= 0.0F) {
         this.f3000.m22000(var1);
         this.m14000(var1, 0.0F);
      } else {
         float var5 = C0259.m8000(var3, 0.0F, var4);
         float var6 = var1.m42000().m14000();
         float var7 = var5 / var4;
         this.f3000.m22000(var1);
         this.m14000(var1, var6 * var7);
      }
   }

   public Rec0097 m46000() {
      return this.f3000.m20000();
   }

   public boolean m48000(rw.setting.C0059 var1, rw.setting.C0059 var2, float var3) {
      return this.f3000.m28000(var1, var2, var3);
   }
}
