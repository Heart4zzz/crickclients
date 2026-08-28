package net.minecraft.server.commands;

import KDFzREm.NNLQ;
import KDFzREm.NNka;
import KDFzREm.NWf;
import KDFzREm.Nod;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import net.fabricmc.fabric.impl.gamerule.EnumRuleCommand;
import net.fabricmc.fabric.impl.gamerule.RuleTypeExtensions;
import net.fabricmc.fabric.impl.gamerule.rpc.FabricGameRuleType;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

class GameRuleCommand$1 implements NNka {
   GameRuleCommand$1(LiteralArgumentBuilder var1) {
      this.val$base = var1;
   }

   public <T> void N(NWf<T> var1) {
      CallbackInfo var4 = new CallbackInfo("", true);
      this.N(var1, var4);
      if (!var4.isCancelled()) {
         LiteralArgumentBuilder var2 = Nod.y(var1.N());
         LiteralArgumentBuilder var3 = Nod.y(var1.y().toString());
         ((LiteralArgumentBuilder)this.val$base.then(NNLQ.N(var1, var2))).then(NNLQ.N(var1, var3));
      }
   }

   private void N(NWf var1, CallbackInfo var2) {
      if (((RuleTypeExtensions)var1).fabric_getType() == FabricGameRuleType.ENUM) {
         EnumRuleCommand.register(this.val$base, var1);
         var2.cancel();
      }
   }
}
