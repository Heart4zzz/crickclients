package rw.core;

import KDFzREm.NNDX;
import KDFzREm.NNNZg;
import KDFzREm.NNtJ;
import KDFzREm.Ncz;
import org.joml.Vector3f;

public class C0431 extends NNDX<Ncz> {
   protected C0431(NNNZg var1, double var2, double var4, double var6, double var8, double var10, double var12, Ncz var14, NNtJ var15) {
      super(var1, var2, var4, var6, var8, var10, var12, var14, var15);
      float var16 = this.field_3840.z() * 0.4F + 0.6F;
      Vector3f var17 = var14.N();
      this.field_62633 = this.N(var17.x(), var16);
      this.field_62634 = this.N(var17.y(), var16);
      this.field_62635 = this.N(var17.z(), var16);
   }
}
