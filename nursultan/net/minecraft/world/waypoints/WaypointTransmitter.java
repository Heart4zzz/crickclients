package net.minecraft.world.waypoints;

import KDFzREm.Ax;
import KDFzREm.NGU;
import KDFzREm.NGZ;
import KDFzREm.NNCO;
import KDFzREm.NNDj;
import KDFzREm.NNRc;
import KDFzREm.NNRq;
import KDFzREm.NbK;
import KDFzREm.Nbr;
import KDFzREm.NlT;
import KDFzREm.NnN;
import java.util.Set;
import net.caffeinemc.mods.lithium.common.entity.NavigatingEntity;
import net.caffeinemc.mods.lithium.common.world.ServerWorldExtended;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerEntityEvents;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerEntityEvents.Load;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerEntityEvents.Unload;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public final class WaypointTransmitter implements NNCO<NbK> {
   private NNRq y;

   public void L(NbK var1) {
      this.N.field_26934.N(var1);
   }

   public void M(NbK var1) {
      var1.method_42147(NNDj::L);
   }

   WaypointTransmitter(NNRq var1) {
      this.N = var1;
      this.N(var1, null);
   }

   public void i(NbK var1) {
      this.N.method_14178().y(var1);
      if (var1 instanceof NNRc var2) {
         this.N.field_18261.add(var2);
         if (var2.method_70637()) {
            this.N.method_70636().N(var2);
         }

         this.N.method_8448();
      }

      if (var1 instanceof Ax var9 && var9.method_70674()) {
         this.N.method_70636().N(var9);
      }

      if (var1 instanceof Nbr var10) {
         if (this.N.field_36317) {
            String var3 = "onTrackingStart called during navigation iteration";
            NlT.N("onTrackingStart called during navigation iteration", new IllegalStateException("onTrackingStart called during navigation iteration"));
         }

         Set var7 = this.N.field_26932;
         this.N(var7, var10);
      }

      if (var1 instanceof NGU var11) {
         for (NGZ var6 : var11.E()) {
            this.N.field_26933.put(var6.method_5628(), var6);
         }
      }

      var1.method_42147(NNDj::N);
      this.N(var1, null);
   }

   public void u(NbK var1) {
      this.N.field_26934.y(var1);
   }

   private boolean y(Set var1, Object var2) {
      Nbr var3 = (Nbr)var2;
      NavigatingEntity var4 = (NavigatingEntity)var3;
      if (var4.lithium$isRegisteredToWorld()) {
         NnN var5 = var4.lithium$getRegisteredNavigation();
         if (var5.Z() != null) {
            ((ServerWorldExtended)this.y).lithium$setNavigationInactive(var3);
         }

         var4.lithium$setRegisteredToWorld(null);
      }

      return var1.remove(var3);
   }

   private void y(NbK var1, CallbackInfo var2) {
      ((Unload)ServerEntityEvents.ENTITY_UNLOAD.invoker()).onUnload(var1, this.N);
   }

   public void y(NbK var1) {
      if (var1 instanceof Ax var2) {
         this.N.method_70636().L(var2);
      }

      this.N.method_14170().N(var1);
   }

   private void N(NNRq var1, CallbackInfo var2) {
      this.y = var1;
   }

   private boolean N(Set var1, Object var2) {
      Nbr var3 = (Nbr)var2;
      NnN var4 = var3.f();
      ((NavigatingEntity)var3).lithium$setRegisteredToWorld(var4);
      if (var4.Z() != null) {
         ((ServerWorldExtended)this.y).lithium$setNavigationActive(var3);
      }

      return var1.add(var3);
   }

   private void N(NbK var1, CallbackInfo var2) {
      ((Load)ServerEntityEvents.ENTITY_LOAD.invoker()).onLoad(var1, this.N);
   }

   public void N(NbK var1) {
      if (var1 instanceof Ax var2 && var2.method_70674()) {
         this.N.method_70636().N(var2);
      }
   }

   public void R(NbK var1) {
      this.y(var1, null);
      this.N.method_14178().N(var1);
      if (var1 instanceof NNRc var2) {
         this.N.field_18261.remove(var2);
         this.N.method_70636().L(var2);
         this.N.method_8448();
      }

      if (var1 instanceof Nbr var9) {
         if (this.N.field_36317) {
            String var3 = "onTrackingStart called during navigation iteration";
            NlT.N("onTrackingStart called during navigation iteration", new IllegalStateException("onTrackingStart called during navigation iteration"));
         }

         Set var7 = this.N.field_26932;
         this.y(var7, var9);
      }

      if (var1 instanceof NGU var10) {
         for (NGZ var6 : var10.E()) {
            this.N.field_26933.remove(var6.method_5628());
         }
      }

      var1.method_42147(NNDj::y);
      this.N.field_62841.y(var1);
   }
}
