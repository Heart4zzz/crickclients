package net.minecraft.world.level.storage;

import KDFzREm.NNRv;
import com.google.common.io.Files;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

class LevelStorageSource$LevelStorageAccess$2 extends SimpleFileVisitor<Path> {
   LevelStorageSource$LevelStorageAccess$2(NNRv var1, Path var2, ZipOutputStream var3) {
      this.L = var1;
      this.val$rootPath = var2;
      this.val$stream = var3;
   }

   public FileVisitResult visitFile(Path var1, BasicFileAttributes var2) throws IOException {
      if (var1.endsWith("session.lock")) {
         return FileVisitResult.CONTINUE;
      } else {
         String var3 = this.val$rootPath.resolve(this.L.y.R().relativize(var1)).toString().replace('\\', '/');
         ZipEntry var4 = new ZipEntry(var3);
         this.val$stream.putNextEntry(var4);
         Files.asByteSource(var1.toFile()).copyTo(this.val$stream);
         this.val$stream.closeEntry();
         return FileVisitResult.CONTINUE;
      }
   }
}
