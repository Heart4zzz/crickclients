package net.minecraft.client.renderer.rendertype;

import KDFzREm.NWb;
import org.joml.Matrix4f;

public final class TextureTransform$OffsetTextureTransform extends NWb {
   public TextureTransform$OffsetTextureTransform(float var1, float var2) {
      super("offset_texturing", () -> new Matrix4f().translation(var1, var2, 0.0F));
   }
}
