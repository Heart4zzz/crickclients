package rw.data;

import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.function.Consumer;
import rw.api.Iface0196;
import rw.core.C1013;

public record Rec0262() {
   public float f1000;
   private static float[] f2000;
   public Iface0196<Boolean> f3000;
   public List<? extends C1013> f4000;
   public Consumer<C1013> f5000;
   public Float f6000;

   public Iface0196<Boolean> m2000() {
      return this.f3000;
   }

   public Rec0262(List<? extends C1013> var1, Iface0196<Boolean> var2, Consumer<C1013> var3) {
      this(var1, var2, var3, null, f2000[0]);
   }

   public Rec0262(List<? extends C1013> var1, Iface0196<Boolean> var2, Consumer<C1013> var3, Float var4, float var5) {
      this.f4000 = var1;
      this.f3000 = var2;
      this.f5000 = var3;
      this.f6000 = var4;
      this.f1000 = var5;
   }

   static {
      ntfClinit();
   }

   public boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0262,"entries;opened;onToggle;width;anchorOffsetX",Rec0262::f4000,Rec0262::f3000,Rec0262::f5000,Rec0262::f6000,Rec0262::f1000>(
         this, var1
      );
   }

   public Consumer<C1013> m6000() {
      return this.f5000;
   }

   public List<? extends C1013> m8000() {
      return this.f4000;
   }

   public float m10000() {
      return this.f1000;
   }

   public Float m12000() {
      return this.f6000;
   }

   private static void m16000() {
      float[] var128 = new float[(1 | -1) >>> 31];
      f2000[(0 | -0) >>> 31] = Float.intBitsToFloat(-1056964608);
   }
}
