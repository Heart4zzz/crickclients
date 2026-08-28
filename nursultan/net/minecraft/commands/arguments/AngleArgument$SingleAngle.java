package net.minecraft.commands.arguments;

import KDFzREm.NNWE;
import KDFzREm.Not;

public final class AngleArgument$SingleAngle {
   private final float angle;
   private final boolean isRelative;

   AngleArgument$SingleAngle(float var1, boolean var2) {
      this.angle = var1;
      this.isRelative = var2;
   }

   public float N(Not var1) {
      return NNWE.R(this.isRelative ? this.angle + var1.E().U : this.angle);
   }
}
