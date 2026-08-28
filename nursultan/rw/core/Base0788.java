package rw.core;

import KDFzREm.NNuU;
import KDFzREm.NbL;
import java.util.function.BiPredicate;
import java.util.function.Function;
import rw.data.Rec0199;
import rw.gui.ItemRelease;

public abstract class Base0788 extends BvBn<ItemRelease> implements BiPredicate<NNuU, NbL> {
   public Base0788(ItemRelease var1, String var2, boolean var3) {
      super(var1, var2, var3);
   }

   public abstract void m2000(NNuU var1, NbL var2);

   public abstract boolean m4000(NNuU var1, NbL var2, Function<Rec0199, Boolean> var3);
}
