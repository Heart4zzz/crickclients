package net.minecraft.client.resources.model;

import KDFzREm.NNNIb;
import com.google.common.collect.Interner;
import com.google.common.collect.Interners;
import org.joml.Vector3fc;

class ModelBakery$PartCacheImpl implements NNNIb {
   private final Interner<Vector3fc> vectors = Interners.newStrongInterner();

   public Vector3fc vectors(Vector3fc var1) {
      return (Vector3fc)this.vectors.intern(var1);
   }
}
