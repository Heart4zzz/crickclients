package net.minecraft.client.renderer.item;

import java.util.Objects;
import rw.api.Iface0212;
import rw.core.Base0315;
import rw.defs.Enum0019;
import rw.defs.Enum0026;

public final class SelectItemModel$UnbakedSwitch extends Base0315 {
   private final Enum0019 N;
   private final boolean y;

   public SelectItemModel$UnbakedSwitch(Iface0212 var1, Enum0019 var2, boolean var3) {
      super(Enum0026.f15000, var1);
      this.N = Objects.requireNonNull(var2, "property");
      this.y = var3;
   }

   public boolean y() {
      return this.y;
   }

   public Enum0019 N() {
      return this.N;
   }
}
