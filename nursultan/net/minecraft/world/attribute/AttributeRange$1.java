package net.minecraft.world.attribute;

import KDFzREm.NUx;
import com.mojang.serialization.DataResult;

class AttributeRange$1 implements NUx<Value> {
   public Value sanitize(Value var1) {
      return (Value)var1;
   }

   public DataResult<Value> validate(Value var1) {
      return DataResult.success(var1);
   }
}
