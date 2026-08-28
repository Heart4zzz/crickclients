package net.minecraft.client.gui.components;

import KDFzREm.NNMH;
import KDFzREm.NNNQR;
import KDFzREm.NNyo;
import KDFzREm.NNzU;
import KDFzREm.NNzj;
import com.viaversion.viafabricplus.visuals.settings.VisualSettings;

class ChatComponent$1 implements ChatComponent$LineConsumer {
   boolean hoveredOverCurrentMessage;

   ChatComponent$1(NNzU var1, int var2, int var3, int var4, NNzj var5, float var6, int var7) {
      this.B = var1;
      this.y = var2;
      this.L = var3;
      this.u = var4;
      this.i = var5;
      this.val$textOpacity = var6;
      this.M = var7;
   }

   @Override
   public void accept(NNyo var1, int var2, float var3) {
      int var4 = this.y - var2 * this.L;
      int var5 = var4 - this.L;
      int var6 = var4 - this.u;
      boolean var7 = this.i.N(var6, var3 * this.val$textOpacity, var1.y());
      this.hoveredOverCurrentMessage |= var7;
      boolean var8;
      if (var1.u()) {
         var8 = this.hoveredOverCurrentMessage;
         this.hoveredOverCurrentMessage = false;
      } else {
         var8 = false;
      }

      NNNQR var9 = this.N(var1.L());
      if (var9 != null) {
         this.i.N(-4, var5, -2, var4, var3 * this.val$textOpacity, var9);
         if (var9.R() != null) {
            int var10 = var1.N((NNMH)this.B.L.i[3]);
            int var11 = var6 + this.M;
            this.i.N(var10, var11, var8, var9, var9.R());
         }
      }
   }

   private NNNQR N(NNNQR var1) {
      return VisualSettings.INSTANCE.hideSignatureIndicator.isEnabled() ? null : var1;
   }
}
