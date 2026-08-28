package rw.core;

import KDFzREm.NNNpZ;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;

class C0493 extends SimpleFileVisitor<Path> {
   private void m2000(Path var1, BasicFileAttributes var2) throws IOException {
      if (var2.isSymbolicLink()) {
         this.f2000.N(var1, this.f1000);
      }
   }

   C0493(NNNpZ var1, List var2) {
      this.f2000 = var1;
      this.f1000 = var2;
   }

   public FileVisitResult m4000(Path var1, BasicFileAttributes var2) throws IOException {
      this.m2000(var1, var2);
      return super.visitFile(var1, var2);
   }

   public FileVisitResult m6000(Path var1, BasicFileAttributes var2) throws IOException {
      this.m2000(var1, var2);
      return super.preVisitDirectory(var1, var2);
   }
}
