package net.minecraft.server.commands.data;

import KDFzREm.NNiI;
import KDFzREm.Not;
import com.mojang.brigadier.builder.ArgumentBuilder;

@FunctionalInterface
interface DataCommands$DataManipulatorDecorator {
   ArgumentBuilder<Not, ?> create(NNiI var1);
}
