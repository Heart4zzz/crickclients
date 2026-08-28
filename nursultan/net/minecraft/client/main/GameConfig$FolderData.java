package net.minecraft.client.main;

import KDFzREm.HN;
import java.io.File;
import java.nio.file.Path;
import org.jspecify.annotations.Nullable;

public class GameConfig$FolderData {
   public final File N;
   public final File y;
   public final File L;
   @Nullable
   public final String assetIndex;

   public GameConfig$FolderData(File var1, File var2, File var3, @Nullable String var4) {
      this.N = var1;
      this.y = var2;
      this.L = var3;
      this.assetIndex = var4;
   }

   public Path getExternalAssetSource() {
      return this.assetIndex == null ? this.L.toPath() : HN.N(this.L.toPath(), this.assetIndex);
   }
}
