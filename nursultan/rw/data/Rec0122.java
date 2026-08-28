package rw.data;

import java.lang.runtime.ObjectMethods;
import net.minecraft.client.gui.font.TextRenderable$Styled;
import rw.core.C0259;

public record Rec0122() implements TextRenderable$Styled {
   private final float f1000;

   public Rec0122(float var1) {
      var1 = C0259.m4000(var1);
      this.f1000 = var1;
   }

   public final boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0122,"opacity",Rec0122::f1000>(this, var1);
   }

   public float m4000() {
      return this.f1000;
   }
}
