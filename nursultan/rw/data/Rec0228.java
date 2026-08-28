package rw.data;

import KDFzREm.NQo;
import java.lang.runtime.ObjectMethods;
import org.joml.Vector3d;
import rw.api.Iface0624;

public record Rec0228() {
   public Vector3d f1000;
   public int f2000;
   public Iface0624 f3000;
   public NQo f4000;

   public NQo m2000() {
      return this.f4000;
   }

   public Rec0228(NQo var1, Iface0624 var2, Vector3d var3, int var4) {
      this.f4000 = var1;
      this.f3000 = var2;
      this.f1000 = var3;
      this.f2000 = var4;
   }

   static {
      ntfClinit();
   }

   public boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0228,"itemStack;structure;center;lifeTimeTicks",Rec0228::f4000,Rec0228::f3000,Rec0228::f1000,Rec0228::f2000>(
         this, var1
      );
   }

   public Iface0624 m6000() {
      return this.f3000;
   }

   public int m8000() {
      return this.f2000;
   }

   public Vector3d m10000() {
      return this.f1000;
   }
}
