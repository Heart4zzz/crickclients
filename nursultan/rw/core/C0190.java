package rw.core;

import KDFzREm.NNCG;
import KDFzREm.NNCH;
import KDFzREm.NNCJ;
import KDFzREm.NNCT;
import KDFzREm.NNCs;
import KDFzREm.NNGK;
import KDFzREm.NbK;
import KDFzREm.NbX;
import KDFzREm.Ned;
import net.caffeinemc.mods.lithium.common.tracking.entity.EntityMovementTrackerSection;
import net.caffeinemc.mods.lithium.common.tracking.entity.MovementTrackerHelper;
import net.caffeinemc.mods.lithium.common.tracking.entity.ToggleableMovementTracker;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

class C0190 implements NNCT, ToggleableMovementTracker {
   private final T f1000;
   private long f2000;
   private NNCG<T> f3000;
   private int f5000;

   C0190(T var1, long var2, NNCG<T> param4, NNCG var5) {
      this.f4000 = var1;
      this.f1000 = (T)var2;
      this.f2000 = var3;
      this.f3000 = var5;
      this.m16000(var1, var2, var3, var5, null);
   }

   private void m2000(CallbackInfo var1) {
      this.m4000();
   }

   private void m4000() {
      if (this.f5000 != 0) {
         ((EntityMovementTrackerSection)this.f3000).lithium$trackEntityMovement(this.f5000, ((NbK)this.f1000).method_73183().N());
      }
   }

   private void m6000(CallbackInfo var1) {
      this.m4000();
   }

   private void m8000(NbX var1, CallbackInfo var2) {
      this.m4000();
   }

   public void m10000() {
      Ned var1 = this.f1000.method_24515();
      long var2 = NNGK.L(var1);
      if (var2 != this.f2000) {
         NNCH var4 = this.f3000.L();
         if (!this.f3000.y(this.f1000)) {
            NNCJ.N.warn("Entity {} wasn't found in section {} (moving to {})", new Object[]{this.f1000, NNGK.N(this.f2000), var2});
         }

         this.f4000.N(this.f2000, this.f3000);
         NNCG var5 = this.f4000.u.L(var2);
         var5.N(this.f1000);
         this.m2000(null);
         this.f3000 = var5;
         this.f2000 = var2;
         this.m12000(var4, var5.L());
      }

      this.m6000(null);
   }

   private void m12000(NNCH var1, NNCH var2) {
      NNCH var3 = NNCJ.N(this.f1000, var1);
      NNCH var4 = NNCJ.N(this.f1000, var2);
      if (var3 == var4) {
         if (var4.y()) {
            this.f4000.L.N(this.f1000);
         }
      } else {
         boolean var5 = var3.y();
         boolean var6 = var4.y();
         if (var5 && !var6) {
            this.f4000.i(this.f1000);
         } else if (!var5 && var6) {
            this.f4000.u(this.f1000);
         }

         boolean var7 = var3.N();
         boolean var8 = var4.N();
         if (var7 && !var8) {
            this.f4000.L(this.f1000);
         } else if (!var7 && var8) {
            this.f4000.y(this.f1000);
         }

         if (var6) {
            this.f4000.L.N(this.f1000);
         }
      }
   }

   public void m14000(NbX var1) {
      this.m8000(var1, null);
      if (!this.f3000.y(this.f1000)) {
         NNCJ.N.warn("Entity {} wasn't found in section {} (destroying due to {})", new Object[]{this.f1000, NNGK.N(this.f2000), var1});
      }

      NNCH var2 = NNCJ.N(this.f1000, this.f3000.L());
      if (var2.N()) {
         this.f4000.L(this.f1000);
      }

      if (var2.y()) {
         this.f4000.i(this.f1000);
      }

      if (var1.N()) {
         this.f4000.L.R(this.f1000);
      }

      this.f4000.y.remove(this.f1000.method_5667());
      this.f1000.method_31744(N);
      this.f4000.N(this.f2000, this.f3000);
   }

   private void m16000(NNCJ var1, NNCs var2, long var3, NNCG var5, CallbackInfo var6) {
      this.f5000 = MovementTrackerHelper.getNotificationMask((NbK)this.f1000);
      this.m4000();
   }

   public int lithium$setNotificationMask(int var1) {
      int var2 = this.f5000;
      this.f5000 = var1;
      return var2;
   }
}
