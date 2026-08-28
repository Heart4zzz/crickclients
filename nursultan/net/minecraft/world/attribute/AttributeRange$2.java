package net.minecraft.world.attribute;

import KDFzREm.NNWE;
import KDFzREm.NUx;
import com.mojang.serialization.DataResult;

class AttributeRange$2 implements NUx<Float> {
   AttributeRange$2(float var1, float var2) {
      this.L = var1;
      this.u = var2;
   }

   public Float sanitize(Float var1) {
      return var1 >= this.L && var1 <= this.u ? var1 : NNWE.N(var1, this.L, this.u);
   }

   public DataResult<Float> validate(Float var1) {
      return var1 >= this.L && var1 <= this.u ? DataResult.success(var1) : DataResult.error(() -> var1 + " is not in range [" + var1x + "; " + var2 + "]");
   }
}
