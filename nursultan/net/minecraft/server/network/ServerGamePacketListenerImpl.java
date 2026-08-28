package net.minecraft.server.network;

import KDFzREm.NAN;
import KDFzREm.NDq;
import KDFzREm.NGx;
import KDFzREm.NNMj;
import KDFzREm.NNRc;
import KDFzREm.NNRq;
import KDFzREm.NNtL;
import KDFzREm.NQo;
import KDFzREm.NXi;
import KDFzREm.NYG;
import KDFzREm.NbB;
import KDFzREm.NbK;
import KDFzREm.NbL;
import KDFzREm.NbS;
import KDFzREm.NbZ;
import KDFzREm.Nbu;
import KDFzREm.NgS;
import KDFzREm.NwI;
import KDFzREm.Nwn;
import net.fabricmc.fabric.api.event.player.UseEntityCallback;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import rw.api.Iface0052;

class ServerGamePacketListenerImpl implements NDq {
   ServerGamePacketListenerImpl(NNMj var1, NNRq var2, NbK var3) {
      this.L = var1;
      this.N = var2;
      this.y = var3;
   }

   public void N() {
      if (!(this.y instanceof NGx) && !(this.y instanceof NbS) && this.y != this.L.field_14140 && !(this.y instanceof NwI var1 && !var1.method_5732())) {
         NQo var2 = this.L.field_14140.method_5998(NbL.field_5808);
         if (var2.N(this.N.method_45162())) {
            if (!this.L.field_14140.method_75202(var2, 5)) {
               this.L.field_14140.method_7324(this.y);
            }
         }
      } else {
         this.L.method_52396(NAN.L("multiplayer.disconnect.invalid_entity_attacked"));
         NNMj.field_14121.warn("Player {} tried to attack an invalid entity", this.L.field_14140.method_74861());
      }
   }

   public void N(NbL var1, NXi var2, CallbackInfo var3) {
      NNRc var4 = this.L.field_14140;
      NgS var5 = var4.method_73183();
      NNtL var6 = new NNtL(this.y, var2.y(this.y.method_23317(), this.y.method_23318(), this.y.method_23321()));
      Nbu var7 = ((UseEntityCallback)UseEntityCallback.EVENT.invoker()).interact(var4, var5, var1, this.y, var6);
      if (var7 != Nbu.i) {
         var3.cancel();
      }
   }

   public void N(NbL var1, CallbackInfo var2) {
      NNRc var3 = this.L.field_14140;
      NgS var4 = var3.method_73183();
      Nbu var5 = ((UseEntityCallback)UseEntityCallback.EVENT.invoker()).interact(var3, var4, var1, this.y, null);
      if (var5 != Nbu.i) {
         var2.cancel();
      }
   }

   public void N(NbL var1, NXi var2) {
      CallbackInfo var3 = new CallbackInfo("", true);
      this.N(var1, var2, var3);
      if (!var3.isCancelled()) {
         this.N(var1, (Iface0052)((var1x, var2x, var3x) -> var2x.method_5664(var1x, var2, var3x)));
      }
   }

   public void N(NbL var1) {
      CallbackInfo var2 = new CallbackInfo("", true);
      this.N(var1, var2);
      if (!var2.isCancelled()) {
         this.N(var1, Nwn::method_7287);
      }
   }

   private void N(NbL var1, Iface0052 var2) {
      NQo var3 = this.L.field_14140.method_5998(var1);
      if (var3.N(this.N.method_45162())) {
         NQo var4 = var3.t();
         if (var2.m2000(this.L.field_14140, this.y, var1) instanceof NbB var6) {
            NQo var7 = var6.L() ? var4 : NQo.E;
            NYG.C.N(this.L.field_14140, var7, this.y);
            if (var6.i() == NbZ.field_52428) {
               this.L.field_14140.method_23667(var1, true);
            }
         }
      }
   }
}
