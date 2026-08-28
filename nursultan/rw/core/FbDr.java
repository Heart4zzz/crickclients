package rw.core;

import KDFzREm.NNNNRZ;
import KDFzREm.NNNNuO;
import KDFzREm.NNNZZ;
import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import KDFzREm.NQo;
import KDFzREm.NQy;
import KDFzREm.NXi;
import KDFzREm.NbL;
import KDFzREm.wY;
import java.util.ArrayList;
import java.util.function.Function;
import org.joml.Quaternionf;
import org.joml.Vector3f;
import rw.api.Iface0602;
import rw.data.Rec0199;
import rw.data.Rec0200;
import rw.data.Rec0204;
import rw.gui.Crossbow;
import rw.gui.ItemRelease;

public class FbDr extends Base0788 {
   private static short[] f1000;
   private static short[] f2000;
   public Object[] f3000;
   private static short[] f4000;
   private static float[] f5000;

   private void m2000() {
      if (this.f3000 == null) {
         this.f3000 = new Object[1];
         Object[] var1 = this.f3000;
      }
   }

   public FbDr(ItemRelease var1, String var2, boolean var3) {
      super(var1, var2, var3);
      this.m2000();
      C0849 var8 = new C0849((Rec0200)Rec0200.f5000[0], Iface0602.f1000);
      this.f3000[0] = var8;
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      f5000 = new float[]{1.0F, (float) (Math.PI / 180.0), 3.15F};
   }

   @Override
   public void m2000(NNuU var1, NbL var2) {
      if (((NNNwS)var1.T[4]).method_6115()) {
         ((NNNZZ)var1.T[2]).y((NNNwS)var1.T[4]);
      } else {
         wY.N(var2);
      }
   }

   public boolean m16000(NNuU var1, NbL var2) {
      return NQy.u(((NNNwS)var1.T[4]).method_5998(var2));
   }

   @Override
   public boolean m4000(NNuU var1, NbL var2, Function<Rec0199, Boolean> var3) {
      this.m2000();
      NQo var4 = ((NNNwS)var1.T[4]).method_5998(var2);
      NXi var5 = new NXi(
         (Double)((NNNwS)var1.T[4]).M[1],
         (Double)((NNNwS)var1.T[4]).M[2] + ((NNNwS)var1.T[4]).method_18381(((NNNwS)var1.T[4]).method_18376()),
         (Double)((NNNwS)var1.T[4]).R[0]
      );
      float var6 = (Float)((NNNwS)var1.T[4]).R[2];
      float var7 = (Float)((NNNwS)var1.T[4]).R[1];
      int[] var8;
      if (((NNNNuO)var4.a_(NNNNRZ.x, NNNNuO.N)).N().size() == 1) {
         var8 = new int[]{0};
      } else {
         var8 = new int[]{-10, 0, 10};
      }

      ArrayList var9 = new ArrayList();

      for (int var13 : var8) {
         NXi var14 = ((NNNwS)var1.T[4]).method_18864(f5000[0]);
         Quaternionf var15 = new Quaternionf().setAngleAxis(var13 * f5000[1], var14.M, var14.B, var14.Z);
         NXi var16 = ((NNNwS)var1.T[4]).method_5631(var6, var7);
         Vector3f var17 = var16.W().rotate(var15);
         NXi var18 = Crossbow.m40000(var17.x, var17.y, var17.z, f5000[2]);
         var9.add(new Rec0204(var5, var18, (C0849)this.f3000[0]));
      }

      for (Rec0204 var20 : var9) {
         if (var20.m10000().m6000().<Boolean>map(var3).orElse(false)) {
            return (boolean)1;
         }
      }

      return (boolean)0;
   }

   private static void m22000() {
      f2000 = new short[]{0, 0, 4, 4, 2, 4, 4};
      f1000 = new short[]{4, 1, 4, 2, 4, 4, 4};
      f4000 = new short[]{0, 4, 2, 4, 1, 4, 4, 0};
   }
}
