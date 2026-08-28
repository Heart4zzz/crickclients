package rw.data;

import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.function.Consumer;
import rw.api.Iface0196;
import rw.core.C1013;

public record OlkIrprsq() {
   private static float[] f1000;
   public List<? extends C1013> f2000;
   public Consumer<C1013> f3000;
   public Float f4000;
   public Iface0196<Boolean> f5000;
   public float f6000;

   public Float m2000() {
      return this.f4000;
   }

   public OlkIrprsq(List<? extends C1013> var1, Iface0196<Boolean> var2, Consumer<C1013> var3, Float var4, float var5) {
      this.f2000 = var1;
      this.f5000 = var2;
      this.f3000 = var3;
      this.f4000 = var4;
      this.f6000 = var5;
   }

   public OlkIrprsq(List<? extends C1013> var1, Iface0196<Boolean> var2, Consumer<C1013> var3) {
      this(var1, var2, var3, null, f1000[0]);
   }

   static {
      ntfClinit();
   }

   public boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",OlkIrprsq,"entries;opened;onSelect;width;anchorOffsetX",OlkIrprsq::f2000,OlkIrprsq::f5000,OlkIrprsq::f3000,OlkIrprsq::f4000,OlkIrprsq::f6000>(
         this, var1
      );
   }

   public List<? extends C1013> m6000() {
      return this.f2000;
   }

   public Consumer<C1013> m8000() {
      return this.f3000;
   }

   public float m10000() {
      return this.f6000;
   }

   public Iface0196<Boolean> m14000() {
      return this.f5000;
   }

   private static void m16000() {
      float[] var128 = new float[(1 | -1) >>> 31];
      f1000[(0 | -0) >>> 31] = Float.intBitsToFloat(-1056964608);
   }
}
