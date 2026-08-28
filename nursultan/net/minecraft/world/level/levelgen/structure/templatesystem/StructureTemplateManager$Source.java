package net.minecraft.world.level.levelgen.structure.templatesystem;

import KDFzREm.NNEO;
import KDFzREm.NNNG;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

record StructureTemplateManager$Source() {
   private final Function<NNNG, Optional<NNEO>> loader;
   private final Supplier<Stream<NNNG>> lister;

   StructureTemplateManager$Source(Function<NNNG, Optional<NNEO>> var1, Supplier<Stream<NNNG>> var2) {
      this.loader = var1;
      this.lister = var2;
   }
}
