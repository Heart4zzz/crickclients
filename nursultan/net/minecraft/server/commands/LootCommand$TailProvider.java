package net.minecraft.server.commands;

import KDFzREm.NNyC;
import KDFzREm.Not;
import com.mojang.brigadier.builder.ArgumentBuilder;

@FunctionalInterface
interface LootCommand$TailProvider {
   ArgumentBuilder<Not, ?> construct(ArgumentBuilder<Not, ?> var1, NNyC var2);
}
