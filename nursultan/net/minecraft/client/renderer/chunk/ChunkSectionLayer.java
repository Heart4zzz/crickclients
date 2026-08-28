package net.minecraft.client.renderer.chunk;

import KDFzREm.NCa;
import KDFzREm.NNNZg;
import KDFzREm.NNNgQ;
import KDFzREm.NNnO;
import KDFzREm.NNnQ;
import KDFzREm.NNoE;
import KDFzREm.NNuU;
import KDFzREm.Ned;
import KDFzREm.Vx;
import KDFzREm.ei;
import KDFzREm.hL;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.irisshaders.iris.fantastic.IrisParticleRenderTypes;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
public class ChunkSectionLayer extends NNnQ {
   private final NNnO N;
   private boolean sortOnUpload;

   ChunkSectionLayer(NNNZg var1, double var2, double var4, double var6, NCa var8) {
      NNNgQ var9 = NNuU.Nq().yU().N();
      super(var1, var2, var4, var6, N(var9, var8, var1, var2, var4, var6, var8));
      this.field_3844 = 0.0F;
      this.field_3847 = 80;
      this.field_3862 = false;
      this.N = this.field_62632.method_45852().equals(ei.N) ? NNnO.N : NNnO.y;
      this.N(var1, var2, var4, var6, var8, null);
   }

   private static Vx N(NNNgQ var0, NCa var1, NNNZg var2, double var3, double var5, double var7, NCa var9) {
      return var0.getModelParticleSprite(var1, var2, Ned.method_49637(var3, var5, var7));
   }

   private void N(NNNZg var1, double var2, double var4, double var6, NCa var8, CallbackInfo var9) {
      hL var10 = NNoE.N(var8);
      if (var10 == hL.field_60923 || var10 == hL.field_60925) {
         this.sortOnUpload = true;
      }
   }

   private void N(CallbackInfoReturnable var1) {
      if (this.sortOnUpload && var1.getReturnValue() == NNnO.N) {
         var1.setReturnValue(IrisParticleRenderTypes.TERRAIN_OPAQUE);
      }
   }

   public NNnO method_74255() {
      NNnO var1;
      NNnO var10000 = var1 = this.N;
      CallbackInfoReturnable var2 = new CallbackInfoReturnable("", true, var1);
      this.N(var2);
      return var2.isCancelled() ? (NNnO)var2.getReturnValue() : var10000;
   }

   public float method_18132(float var1) {
      return 0.5F;
   }
}
