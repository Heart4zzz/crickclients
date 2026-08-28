package rw.data;

import java.lang.runtime.ObjectMethods;
import net.minecraft.client.gui.font.TextRenderable$Styled;

public record Rec0109() implements TextRenderable$Styled {
   private final float f1000;

   public Rec0109(float var1) {
      this.f1000 = var1;
   }

   public final boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0109,"radius",Rec0109::f1000>(this, var1);
   }

   public float m4000() {
      return this.f1000;
   }

   public float m6000() {
      return Math.max(0.0F, this.f1000);
   }
}
