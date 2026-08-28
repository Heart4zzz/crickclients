package net.minecraft.server.commands.data;

import com.mojang.brigadier.exceptions.CommandSyntaxException;

@FunctionalInterface
interface DataCommands$StringProcessor {
   String process(String var1) throws CommandSyntaxException;
}
