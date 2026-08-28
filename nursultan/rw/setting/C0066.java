package rw.setting;

import java.util.Objects;
import rw.defs.Enum0047;

public final class C0066 {
   private static final float f1000 = 0.5F;
   private final float f2000;
   private C0059 f3000;
   private boolean f4000 = true;
   private float f5000;

   private boolean m2000(C0059 var1) {
      return m4000(var1) && var1.m176000() && var1 == this.f3000;
   }

   private C0066(rw.gui.C0013 var1, float var2) {
      Objects.requireNonNull(var1, "context");
      this.f2000 = Math.max(0.05F, var2);
   }

   private static boolean m4000(C0059 var0) {
      return var0 != null && var0.m120000() == Enum0047.f3000;
   }

   public boolean m8000(C0059 var1) {
      if (!m4000(var1) || !var1.m176000()) {
         return false;
      } else {
         return this.f3000 == null ? true : this.f3000 == var1 && this.f4000;
      }
   }

   public static C0066 m10000(rw.gui.C0013 var0) {
      return var0.m10000(C0066.class).orElseGet(() -> {
         C0066 var1 = new C0066(var0, 0.5F);
         var0.m12000(C0066.class, var1);
         return var1;
      });
   }

   public boolean m12000(float var1) {
      if (!this.m16000()) {
         return false;
      } else {
         float var2 = Math.max(0.0F, var1);
         if (var2 <= 0.0F) {
            return false;
         } else {
            this.f5000 += var2;
            int var3 = (int)(this.f5000 / this.f2000);
            if (var3 <= 0) {
               return false;
            } else {
               this.f5000 = this.f5000 - var3 * this.f2000;
               if ((var3 & 1) == 0) {
                  return false;
               } else {
                  this.f4000 = !this.f4000;
                  this.f3000.m56000(1);
                  return true;
               }
            }
         }
      }
   }

   public void m14000(C0059 var1, C0059 var2) {
      C0059 var3 = m4000(var2) ? var2 : null;
      if (this.f3000 == var3) {
         this.m18000(var3);
      } else {
         C0059 var4 = this.f3000 != null ? this.f3000 : (m4000(var1) ? var1 : null);
         if (var4 != null) {
            var4.m56000(1);
         }

         this.f3000 = var3;
         this.f4000 = true;
         this.f5000 = 0.0F;
         if (this.f3000 != null) {
            this.f3000.m56000(1);
         }
      }
   }

   private boolean m16000() {
      if (!this.m2000(this.f3000)) {
         if (this.f3000 != null) {
            this.f3000.m56000(1);
         }

         this.f3000 = null;
         this.f4000 = true;
         this.f5000 = 0.0F;
         return false;
      } else {
         return true;
      }
   }

   public boolean m18000(C0059 var1) {
      if (!this.m2000(var1)) {
         return false;
      } else {
         this.f5000 = 0.0F;
         if (this.f4000) {
            return false;
         } else {
            this.f4000 = true;
            this.f3000.m56000(1);
            return true;
         }
      }
   }
}
