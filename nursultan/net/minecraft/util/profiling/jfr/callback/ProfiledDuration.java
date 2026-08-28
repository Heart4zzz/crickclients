package net.minecraft.util.profiling.jfr.callback;

import java.util.EnumMap;
import rw.defs.Enum0019;
import rw.setting.C0026;

final class ProfiledDuration {
   final EnumMap<Enum0019, C0026> N;
   boolean y;

   void finish(boolean var1) {
      super();
      this.N = new EnumMap<>(Enum0019.class);
      this.y = var1;
   }
}
