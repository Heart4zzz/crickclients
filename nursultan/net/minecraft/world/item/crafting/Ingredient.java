package net.minecraft.world.item.crafting;

import KDFzREm.NNNbw;
import KDFzREm.NNNgN;
import KDFzREm.NNNqL;
import KDFzREm.NOY;
import KDFzREm.NOc;
import KDFzREm.NOd;
import KDFzREm.NOt;
import KDFzREm.NQl;
import KDFzREm.NQr;
import java.util.ArrayList;
import java.util.List;
import net.fabricmc.fabric.api.registry.FabricBrewingRecipeRegistryBuilder;
import net.fabricmc.fabric.api.registry.FabricBrewingRecipeRegistryBuilder.BuildCallback;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import rw.data.Rec0160;

public class Ingredient implements FabricBrewingRecipeRegistryBuilder {
   private final List<NOc> N = new ArrayList<>();
   private final List<Rec0160<NOt>> y = new ArrayList<>();
   private final List<Rec0160<NQl>> L = new ArrayList<>();
   private final NNNgN u;

   public Ingredient(NNNgN var1) {
      this.u = var1;
   }

   private static void y(NQl var0) {
      if (!(var0 instanceof NQr)) {
         throw new IllegalArgumentException("Expected a potion, got: " + NNNqL.B.y(var0));
      }
   }

   public NOd N() {
      this.N(null);
      return new NOd(List.copyOf(this.N), List.copyOf(this.y), List.copyOf(this.L));
   }

   public void N(NQl var1, NNNbw<NOt> var2) {
      if (((NOt)var2.N()).N(this.u)) {
         this.N(NOY.N, var1, NOY.y);
         this.N(NOY.u, var1, var2);
      }
   }

   private void N(CallbackInfoReturnable var1) {
      ((BuildCallback)FabricBrewingRecipeRegistryBuilder.BUILD.invoker()).build(this);
   }

   public void N(NQl var1, NQl var2, NQl var3) {
      if (var1.N(this.u) && var2.N(this.u) && var3.N(this.u)) {
         y(var1);
         y(var3);
         this.L.add(new Rec0160<>(var1.i(), NOc.method_8101(var2), var3.i()));
      }
   }

   public void N(NQl var1) {
      if (var1.N(this.u)) {
         y(var1);
         this.N.add(NOc.method_8101(var1));
      }
   }

   public void N(NNNbw<NOt> var1, NQl var2, NNNbw<NOt> var3) {
      if (((NOt)var1.N()).N(this.u) && var2.N(this.u) && ((NOt)var3.N()).N(this.u)) {
         this.y.add(new Rec0160<>(var1, NOc.method_8101(var2), var3));
      }
   }

   public void registerPotionRecipe(NNNbw var1, NOc var2, NNNbw var3) {
      if (((NOt)var1.N()).N(this.u) && ((NOt)var3.N()).N(this.u)) {
         this.y.add(new Rec0160<>(var1, var2, var3));
      }
   }

   public void registerItemRecipe(NQl var1, NOc var2, NQl var3) {
      if (var1.N(this.u) && var3.N(this.u)) {
         y(var1);
         y(var3);
         this.L.add(new Rec0160<>(var1.i(), var2, var3.i()));
      }
   }

   public void registerRecipes(NOc var1, NNNbw var2) {
      if (((NOt)var2.N()).N(this.u)) {
         this.registerPotionRecipe(NOY.N, var1, NOY.y);
         this.registerPotionRecipe(NOY.u, var1, var2);
      }
   }

   public NNNgN getEnabledFeatures() {
      return this.u;
   }
}
