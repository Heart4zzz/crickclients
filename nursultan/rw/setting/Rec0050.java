package rw.setting;

import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Objects;
import net.minecraft.client.gui.font.TextRenderable$Styled;
import rw.api.Iface0216;
import rw.data.Rec0119;

public record Rec0050() implements Iface0216 {
   private final Rec0119 f1000;
   private final TextRenderable$Styled f2000;
   private final List<Iface0216> f3000;

   public List<Iface0216> m2000() {
      return this.f3000;
   }

   public Rec0050(Rec0119 var1, TextRenderable$Styled var2, List<Iface0216> var3) {
      Objects.requireNonNull(var1, "bounds");
      Objects.requireNonNull(var2, "effect");
      Objects.requireNonNull(var3, "children");
      this.f1000 = var1;
      this.f2000 = var2;
      this.f3000 = var3;
   }

   public final boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0050,"bounds;effect;children",Rec0050::f1000,Rec0050::f2000,Rec0050::f3000>(this, var1);
   }

   public TextRenderable$Styled m6000() {
      return this.f2000;
   }

   public Rec0119 m8000() {
      return this.f1000;
   }
}
