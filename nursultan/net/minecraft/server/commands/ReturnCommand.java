package net.minecraft.server.commands;

import KDFzREm.NNNCB;
import KDFzREm.NNNaB;
import KDFzREm.NNNaM;
import KDFzREm.NNNaR;
import KDFzREm.Nod;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;

public class ReturnCommand {
   public static <T extends NNNCB<T>> void register(CommandDispatcher<T> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)LiteralArgumentBuilder.literal("return")
                     .requires(Nod.N(Nod.u)))
                  .then(RequiredArgumentBuilder.argument("value", IntegerArgumentType.integer()).executes(new NNNaM())))
               .then(LiteralArgumentBuilder.literal("fail").executes(new NNNaB())))
            .then(LiteralArgumentBuilder.literal("run").forward(var0.getRoot(), new NNNaR(), false))
      );
   }
}
