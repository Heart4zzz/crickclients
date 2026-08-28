package rw.data;

import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Optional;
import org.joml.Vector4f;

public record OltrInps() {
   public Optional<Rec0233> f1000;
   public Optional<Rec0233> f2000;
   public List<Vector4f> f3000;
   public List<Vector4f> f4000;

   public Optional<Rec0233> m2000() {
      return this.f1000;
   }

   public OltrInps(List<Vector4f> var1, List<Vector4f> var2, Optional<Rec0233> var3, Optional<Rec0233> var4) {
      this.f3000 = var1;
      this.f4000 = var2;
      this.f1000 = var3;
      this.f2000 = var4;
   }

   static {
      ntfClinit();
   }

   public boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",OltrInps,"rects;rounds;currentMask;effectiveMask",OltrInps::f3000,OltrInps::f4000,OltrInps::f1000,OltrInps::f2000>(
         this, var1
      );
   }

   static OltrInps m6000() {
      return new OltrInps(List.of(), List.of(), Optional.empty(), Optional.empty());
   }

   public Optional<Rec0233> m8000() {
      return this.f2000;
   }

   public List<Vector4f> m10000() {
      return this.f4000;
   }

   public List<Vector4f> m12000() {
      return this.f3000;
   }
}
