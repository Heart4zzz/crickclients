package net.minecraft.world.phys;

import KDFzREm.NHS;
import org.joml.Vector3fc;

public class AABB$Builder {
   private float N = Float.POSITIVE_INFINITY;
   private float y = Float.POSITIVE_INFINITY;
   private float L = Float.POSITIVE_INFINITY;
   private float u = Float.NEGATIVE_INFINITY;
   private float i = Float.NEGATIVE_INFINITY;
   private float R = Float.NEGATIVE_INFINITY;

   public void include(Vector3fc var1) {
      this.N = Math.min(this.N, var1.x());
      this.y = Math.min(this.y, var1.y());
      this.L = Math.min(this.L, var1.z());
      this.u = Math.max(this.u, var1.x());
      this.i = Math.max(this.i, var1.y());
      this.R = Math.max(this.R, var1.z());
   }

   public NHS N() {
      return new NHS(this.N, this.y, this.L, this.u, this.i, this.R);
   }
}
