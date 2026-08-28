package net.minecraft.network.protocol.game;

import KDFzREm.NCN;
import KDFzREm.NNNtM;
import KDFzREm.Nfh;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.tree.CommandNode;
import com.mojang.brigadier.tree.RootCommandNode;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;

class ClientboundCommandsPacket$NodeResolver<S> {
   private final NNNtM N;
   private final Nfh<S> y;
   private final List<NCN> L;
   private final List<CommandNode<S>> u;

   ClientboundCommandsPacket$NodeResolver(NNNtM var1, Nfh<S> var2, List<NCN> var3) {
      this.N = var1;
      this.y = var2;
      this.L = var3;
      ObjectArrayList var4 = new ObjectArrayList();
      var4.size(var3.size());
      this.u = var4;
   }

   public CommandNode<S> context(int var1) {
      CommandNode var2 = this.u.get(var1);
      if (var2 != null) {
         return var2;
      } else {
         NCN var3 = this.L.get(var1);
         Object var4;
         if (var3.N == null) {
            var4 = new RootCommandNode();
         } else {
            ArgumentBuilder var5 = var3.N.N(this.N, this.y);
            if ((var3.y & 8) != 0) {
               var5.redirect(this.context(var3.L));
            }

            boolean var6 = (var3.y & 4) != 0;
            boolean var7 = (var3.y & 32) != 0;
            var4 = this.y.N(var5, var6, var7).build();
         }

         this.u.set(var1, (CommandNode<S>)var4);

         for (int var8 : var3.u) {
            CommandNode var9 = this.context(var8);
            if (!(var9 instanceof RootCommandNode)) {
               var4.addChild(var9);
            }
         }

         return (CommandNode<S>)var4;
      }
   }
}
