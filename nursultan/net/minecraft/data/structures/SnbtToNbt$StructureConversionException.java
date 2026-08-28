package net.minecraft.data.structures;

import java.nio.file.Path;

class SnbtToNbt$StructureConversionException extends RuntimeException {
   public SnbtToNbt$StructureConversionException(Path var1, Throwable var2) {
      super(var1.toAbsolutePath().toString(), var2);
   }
}
