package net.minecraft.util;

import java.io.IOException;
import java.nio.file.Path;

public class DirectoryLock$LockException extends IOException {
   private DirectoryLock$LockException(Path var1, String var2) {
      super(var1.toAbsolutePath() + ": " + var2);
   }

   public static DirectoryLock$LockException N(Path var0) {
      return new DirectoryLock$LockException(var0, "already locked (possibly by other Minecraft instance?)");
   }
}
