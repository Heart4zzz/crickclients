package rw.core;

import KDFzREm.NQa;
import KDFzREm.Ned;
import java.util.List;
import org.joml.Vector3d;
import org.joml.Vector3i;
import rw.NursultanClient;
import rw.api.Iface0623;
import rw.api.Iface0624;
import rw.data.IlsImt;
import rw.data.Rec0228;
import rw.data.Rec0230;

public class C1030 {
   private static double[] f1000;
   public Object[] f2000;

   private void m2000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[1];
         Object[] var1 = this.f2000;
      }
   }

   public C1030(Iface0623 var1) {
      this.m2000();
      this.f2000[0] = var1;
   }

   static {
      ntfClinit();
   }

   private static void m10000() {
      f1000 = new double[]{0.5, 0.5, 0.5, 0.5};
   }

   private boolean m12000(List<IlsImt> var1, Vector3i var2, Vector3i var3) {
      int var4 = var3.x + var2.x / 2;
      int var5 = var3.y + var2.y / 2;
      int var6 = var3.z + var2.z / 2;
      return var1.stream().filter(var3x -> {
         Ned var4x = var3x.m6000();
         return (boolean)(var4x.method_10263() == var4 && var4x.method_10264() == var5 && var4x.method_10260() == var6 ? 1 : 0);
      }).anyMatch(var0 -> (boolean)(!var0.m4000().P() ? 1 : 0));
   }

   public void m18000(List<IlsImt> var1, Vector3i var2, Vector3i var3) {
      for (Rec0230 var5 : (List)IljirsrIn.f24000[0]) {
         if (var5.m12000(var1)) {
            this.m20000(var1, var5, var2, var3);
            break;
         }
      }
   }

   private void m20000(List<IlsImt> var1, Iface0624 var2, Vector3i var3, Vector3i var4) {
      Vector3i var5 = var4.sub(var3, new Vector3i());
      if (var5.x == var5.z && var5.y >= 3 && !this.m12000(var1, var5, var3)) {
         Vector3d var6 = new Vector3d(var5);
         Vector3d var7 = new Vector3d(var3);
         Vector3d var8 = var6.mul(f1000[0]).add(var7).add(f1000[1], f1000[2], f1000[3]);
         ((Iface0623)this.f2000[0])
            .m6000(new Rec0228(NQa.TW.E(), var2, new Vector3d(var8.x, var8.y, var8.z), NursultanClient.m74000().m10000() + var2.m2000()));
      }
   }
}
