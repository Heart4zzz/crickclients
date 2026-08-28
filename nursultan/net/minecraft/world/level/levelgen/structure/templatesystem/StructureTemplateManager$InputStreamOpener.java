package net.minecraft.world.level.levelgen.structure.templatesystem;

import java.io.InputStream;

@FunctionalInterface
public interface StructureTemplateManager$InputStreamOpener {
   InputStream open() throws Exception;
}
