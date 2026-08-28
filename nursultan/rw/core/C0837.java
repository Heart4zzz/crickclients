package rw.core;

import KDFzREm.NNEt;
import KDFzREm.NNNZg;
import KDFzREm.NNNwS;
import KDFzREm.NNnC;
import KDFzREm.NNnS;
import KDFzREm.NNnf;
import KDFzREm.NNty;
import KDFzREm.NNuU;
import KDFzREm.NXi;
import KDFzREm.NbK;
import KDFzREm.NcZ;
import KDFzREm.Ned;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.joml.Vector3d;
import rw.api.Iface0602;
import rw.data.Rec0199;
import rw.data.Rec0200;
import rw.data.Rec0202;

public class C0837 {
   private static short[] f1000;
   private static short[] f2000;
   private static short[] f3000;
   private static short[] f4000;
   private static short[] f5000;
   private static short[] f6000;
   private static double[] f7000;
   private static short[] f8000;
   private static short[] f9000;
   private static short[] f10000;
   public Object[] f11000;

   public void m4000() {
      ((Vector3d)this.f11000[2]).add(f7000[0], -((Rec0200)this.f11000[3]).m2000(), f7000[1]);
   }

   private void m6000() {
      if (this.f11000 == null) {
         this.f11000 = new Object[5];
         Object[] var1 = this.f11000;
      }
   }

   public C0837(Rec0200 var1, Iface0602 var2) {
      this.m6000();
      NNuU var7 = NNuU.Nq();
      this.f11000[0] = var7;
      Vector3d var8 = new Vector3d();
      this.f11000[1] = var8;
      Vector3d var9 = new Vector3d();
      this.f11000[2] = var9;
      this.f11000[3] = var1;
      this.f11000[4] = var2;
   }

   public C0837(Rec0200 var1) {
      this(var1, null);
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      f7000 = new double[]{0.0, 0.0};
   }

   private static void m10000() {
      f6000 = new short[]{0, 1, 2, 3, 4, 1};
      f1000 = new short[]{2, 300};
      f2000 = new short[]{1, 2, 0, 3};
      f5000 = new short[]{1, 1};
      f4000 = new short[]{1, 1, 1, 1, 1, 1, 2};
      f8000 = new short[]{1, 2, 1, 2, 0};
      f10000 = new short[]{3, 0, 4, 4, 2, 2};
      f9000 = new short[]{2, 4, 2, 3, 3, 0, 3, 1};
      f3000 = new short[]{0, 3, 1, 1, 1, 3, 2};
   }

   public void m14000() {
      float var1 = ((Rec0200)this.f11000[3]).m28000();
      if (((NNNZg)((NNuU)this.f11000[0]).T[3]).method_31601((int)((Vector3d)this.f11000[1]).y)
         && ((NNNZg)((NNuU)this.f11000[0]).T[3])
            .method_8316(Ned.method_49637(((Vector3d)this.f11000[1]).x, ((Vector3d)this.f11000[1]).y, ((Vector3d)this.f11000[1]).z))
            .N(NNEt.N)) {
         var1 = ((Rec0200)this.f11000[3]).m20000();
      }

      ((Vector3d)this.f11000[2]).mul(var1);
   }

   public void m20000() {
   }

   public Rec0202 m22000(NbK var1, NXi var2, NXi var3) {
      ArrayList var4 = new ArrayList();
      ((Vector3d)this.f11000[1]).set(var2.M, var2.B, var2.Z);
      ((Vector3d)this.f11000[2]).set(var3.M, var3.B, var3.Z);

      for (int var5 = 0; var5 < 300; var5++) {
         this.m28000();
         Rec0202 var6 = this.m30000(var1, var4, var5);
         if (var6 != null) {
            return var6;
         }

         ((Vector3d)this.f11000[1]).add((Vector3d)this.f11000[2]);
         if (((NNNZg)((NNuU)this.f11000[0]).T[3]).method_31607() > ((Vector3d)this.f11000[1]).y) {
            break;
         }

         this.m20000();
         var4.add(new NXi(((Vector3d)this.f11000[1]).x, ((Vector3d)this.f11000[1]).y, ((Vector3d)this.f11000[1]).z));
      }

      return new Rec0202(var4, Optional.empty());
   }

   public void m28000() {
      this.m4000();
      this.m14000();
   }

   public Rec0202 m30000(NbK var1, List<NXi> var2, int var3) {
      NXi var4 = new NXi(((Vector3d)this.f11000[1]).x, ((Vector3d)this.f11000[1]).y, ((Vector3d)this.f11000[1]).z);
      NXi var5 = new NXi(
         ((Vector3d)this.f11000[1]).x + ((Vector3d)this.f11000[2]).x,
         ((Vector3d)this.f11000[1]).y + ((Vector3d)this.f11000[2]).y,
         ((Vector3d)this.f11000[1]).z + ((Vector3d)this.f11000[2]).z
      );
      NNty var6 = ((NNNZg)((NNuU)this.f11000[0]).T[f10000[0]])
         .y(new NNnf(var4, var5, NNnS.field_17558, NNnC.field_1348, (NNNwS)((NNuU)this.f11000[f10000[1]]).T[f10000[2]]));
      Rec0202 var7 = null;
      if (var6.N() != NcZ.field_1333) {
         var2.add(var6.y());
         var7 = new Rec0202(var2, Optional.of(new Rec0199(var6.y(), var6, var3, var1)));
      }

      if ((Iface0602)this.f11000[f10000[3]] != null) {
         NXi var8 = new NXi(((Vector3d)this.f11000[f10000[4]]).x, ((Vector3d)this.f11000[f10000[5]]).y, ((Vector3d)this.f11000[2]).z);
         return ((Iface0602)this.f11000[4]).m4000(this, var7, var1, var4, var8, var2, var3);
      } else {
         return var7;
      }
   }
}
