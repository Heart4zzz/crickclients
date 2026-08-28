package net.minecraft.world.level.storage;

import KDFzREm.NNRj;
import KDFzREm.NNRv;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import org.jspecify.annotations.Nullable;

class LevelStorageSource$LevelStorageAccess$1 extends SimpleFileVisitor<Path> {
   LevelStorageSource$LevelStorageAccess$1(NNRv var1, Path var2) {
      this.y = var1;
      this.val$lockPath = var2;
   }

   public FileVisitResult val$lockPath(Path var1, BasicFileAttributes var2) throws IOException {
      if (!var1.equals(this.val$lockPath)) {
         NNRj.N.debug("Deleting {}", var1);
         Files.delete(var1);
      }

      return FileVisitResult.CONTINUE;
   }

   public FileVisitResult val$lockPath(Path var1, @Nullable IOException var2) throws IOException {
      if (var2 != null) {
         throw var2;
      } else {
         if (var1.equals(this.y.y.R())) {
            this.y.N.close();
            Files.deleteIfExists(this.val$lockPath);
         }

         Files.delete(var1);
         return FileVisitResult.CONTINUE;
      }
   }
}
