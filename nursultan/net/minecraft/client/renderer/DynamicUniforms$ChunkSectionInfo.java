package net.minecraft.client.renderer;

import KDFzREm.CU;
import com.mojang.blaze3d.buffers.Std140Builder;
import java.nio.ByteBuffer;
import org.joml.Matrix4fc;

public record DynamicUniforms$ChunkSectionInfo() implements CU {
   private final Matrix4fc modelView;
   private final int y;
   private final int L;
   private final int u;
   private final float visibility;
   private final int R;
   private final int M;

   public DynamicUniforms$ChunkSectionInfo(Matrix4fc var1, int var2, int var3, int var4, float var5, int var6, int var7) {
      this.modelView = var1;
      this.y = var2;
      this.L = var3;
      this.u = var4;
      this.visibility = var5;
      this.R = var6;
      this.M = var7;
   }

   public void write(ByteBuffer var1) {
      Std140Builder.intoBuffer(var1).putMat4f(this.modelView).putFloat(this.visibility).putIVec2(this.R, this.M).putIVec3(this.y, this.L, this.u);
   }

   public Matrix4fc write() {
      return this.modelView;
   }
}
