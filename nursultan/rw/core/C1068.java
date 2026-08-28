package rw.core;

import java.util.function.UnaryOperator;
import org.joml.Vector2f;
import org.joml.Vector4f;
import rw.api.Iface0196;

public class C1068 implements Iface0196<Vector2f> {
   public Object[] f1000;

   public C1068(Iface0196 var1, Vector2f var2) {
      this.m22000();
      this.f1000[0] = var1;
      this.f1000[1] = var2;
   }

   static {
      ntfClinit();
   }

   public void m8000() {
      ((Iface0196)this.f1000[0]).m4000();
   }

   public void m12000(UnaryOperator<Vector2f> var1) {
      this.m20000(var1.apply(this.m16000()));
   }

   public Vector2f m16000() {
      Vector4f var1 = (Vector4f)((Iface0196)this.f1000[0]).m2000();
      return var1 == null ? null : ((Vector2f)this.f1000[1]).set(var1.z, var1.w);
   }

   public void m20000(Vector2f var1) {
      Vector4f var2 = (Vector4f)((Iface0196)this.f1000[0]).m2000();
      if (var2 == null) {
         var2 = new Vector4f();
      }

      var2.set(var1.x, var1.y, var1.x, var1.y);
      ((Iface0196)this.f1000[0]).m6000(var2);
   }

   private void m22000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[2];
         Object[] var1 = this.f1000;
      }
   }
}
