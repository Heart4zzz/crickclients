package rw.core;

import KDFzREm.NQa;
import java.util.List;
import org.joml.Vector3d;
import org.joml.Vector3i;
import rw.NursultanClient;
import rw.api.Iface0623;
import rw.api.Iface0624;
import rw.data.IlsImt;
import rw.data.Rec0228;

public class IlsipOp {
   private static double[] f1000;
   public Object[] f2000;

   public IlsipOp(Iface0623 var1) {
      this.m8000();
      this.f2000[0] = var1;
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      f1000 = new double[]{0.5, 0.5, 0.5, 0.5};
   }

   private void m8000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[1];
         Object[] var1 = this.f2000;
      }
   }

   private Vector3d m12000(List<IlsImt> var1, Base1018 var2, Vector3i var3, Vector3i var4) {
      Vector3i var5 = var4.sub(var3, new Vector3i());
      if (var2.m16000(var1, var3, var5)) {
         Vector3d var6 = new Vector3d(var5);
         Vector3d var7 = new Vector3d(var3);
         return var6.mul(f1000[0]).add(var7).add(f1000[1], f1000[2], f1000[3]);
      } else {
         return null;
      }
   }

   private void m14000(Iface0624 var1, Vector3d var2) {
      ((Iface0623)this.f2000[0]).m6000(new Rec0228(NQa.ny.E(), var1, new Vector3d(var2.x, var2.y, var2.z), NursultanClient.m74000().m10000() + var1.m2000()));
   }

   public void m18000(List<IlsImt> var1, Vector3i var2, Vector3i var3) {
      for (Base1018 var5 : (List)C1031.f1000[0]) {
         if (var5.m14000(var1)) {
            Vector3d var6 = this.m12000(var1, var5, var2, var3);
            if (var6 != null) {
               this.m14000(var5, var6);
            }
         }
      }
   }
}
