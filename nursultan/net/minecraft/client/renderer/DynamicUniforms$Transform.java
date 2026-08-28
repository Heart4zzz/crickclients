package net.minecraft.client.renderer;

import KDFzREm.CU;
import com.mojang.blaze3d.buffers.Std140Builder;
import java.nio.ByteBuffer;
import org.joml.Matrix4fc;
import org.joml.Vector3fc;
import org.joml.Vector4fc;

public record DynamicUniforms$Transform() implements CU {
   private final Matrix4fc N;
   private final Vector4fc colorModulator;
   private final Vector3fc modelOffset;
   private final Matrix4fc u;

   public DynamicUniforms$Transform(Matrix4fc var1, Vector4fc var2, Vector3fc var3, Matrix4fc var4) {
      this.N = var1;
      this.colorModulator = var2;
      this.modelOffset = var3;
      this.u = var4;
   }

   public void modelView(ByteBuffer var1) {
      Std140Builder.intoBuffer(var1).putMat4f(this.N).putVec4(this.colorModulator).putVec3(this.modelOffset).putMat4f(this.u);
   }
}
