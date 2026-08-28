package rw.core;

import org.joml.Vector2d;
import org.joml.Vector2dc;
import rw.NursultanClient;
import rw.gui.Target;

public class C0607 {
   public Object[] f1000;

   public boolean m4000() {
      return (Boolean)this.f1000[1];
   }

   public C0607() {
      this.m8000();
      Vector2d var5 = new Vector2d();
      this.f1000[0] = var5;
   }

   static {
      ntfClinit();
   }

   private void m8000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[2];
         Object[] var1 = this.f1000;
         var1[1] = false;
      }
   }

   public Vector2dc m12000() {
      return (Vector2d)this.f1000[0];
   }

   public void m16000() {
      NursultanClient.m88000().m166000().m14000();
   }

   public void m20000(double var1, double var3) {
      Target var5 = NursultanClient.m88000().m166000();
      var5.N((boolean)1);
      var5.m26000(var1, var3);
   }

   public void m22000(Double var1, Double var2) {
      if (var1 != null && var2 != null) {
         ((Vector2d)this.f1000[0]).set(var1, var2);
         Boolean var8 = true;
         this.f1000[1] = var8;
      } else {
         Boolean var7 = false;
         this.f1000[1] = var7;
      }
   }

   public boolean m24000() {
      return (boolean)(NursultanClient.m88000().m166000().U() && this.f1000[1] ? 1 : 0);
   }
}
