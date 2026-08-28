package rw.setting;

import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import KDFzREm.Ned;
import KDFzREm.Nff;
import java.util.ArrayList;
import java.util.List;
import org.joml.Vector3i;
import rw.api.Iface0623;
import rw.core.C0991;
import rw.core.C1030;
import rw.core.IlsipOp;
import rw.data.IlsImt;
import rw.data.OlmIqkn;
import rw.module.AnarchyHelper;
import rw.module.AutoAccept;

public class C0130 {
   private static double[] f1000;
   private static String[] f2000;
   public Object[] f3000;

   private static void m6000() {
      f2000 = new String[]{"structure-detector"};
   }

   public C0130(AnarchyHelper var1, Iface0623 var2) {
      this.m10000();
      NNuU var7 = NNuU.Nq();
      this.f3000[0] = var7;
      ArrayList var8 = new ArrayList();
      this.f3000[1] = var8;
      C0991 var9 = C0122.m26000(var1, f2000[0], true);
      this.f3000[4] = var9;
      C1030 var10 = new C1030(var2);
      this.f3000[2] = var10;
      IlsipOp var11 = new IlsipOp(var2);
      this.f3000[3] = var11;
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      f1000 = new double[]{25600.0};
   }

   private void m10000() {
      if (this.f3000 == null) {
         this.f3000 = new Object[5];
         Object[] var1 = this.f3000;
      }
   }

   public void m22000() {
      ((List)this.f3000[1]).clear();
   }

   public void m32000() {
      if ((Boolean)((C0991)this.f3000[4]).i() && !((List)this.f3000[1]).isEmpty()) {
         OlmIqkn var1 = this.m42000();
         ((C1030)this.f3000[2]).m18000((List<IlsImt>)this.f3000[1], var1.m6000(), var1.m4000());
         ((IlsipOp)this.f3000[3]).m18000((List<IlsImt>)this.f3000[1], var1.m6000(), var1.m4000());
         ((List)this.f3000[1]).clear();
      }
   }

   public void m36000(AutoAccept var1) {
      if ((Boolean)((C0991)this.f3000[4]).i()) {
         if (var1.m6000() instanceof Nff var2) {
            ((NNuU)this.f3000[0])
               .execute(
                  () -> var2.N(
                     (var1xx, var2x) -> {
                        if (!var2x.P()
                           && ((NNNwS)((NNuU)this.f3000[0]).T[4]).method_5649(var1xx.method_10263(), var1xx.method_10264(), var1xx.method_10260()) < f1000[0]) {
                           ((List)this.f3000[1]).add(new IlsImt(new Ned(var1xx), var2x));
                        }
                     }
                  )
               );
         }
      }
   }

   private OlmIqkn m42000() {
      Vector3i var1 = new Vector3i(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
      Vector3i var2 = new Vector3i(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

      for (IlsImt var4 : (List)this.f3000[1]) {
         Ned var5 = var4.m6000();
         var1.x = Math.min(var1.x, var5.method_10263());
         var1.y = Math.min(var1.y, var5.method_10264());
         var1.z = Math.min(var1.z, var5.method_10260());
         var2.x = Math.max(var2.x, var5.method_10263());
         var2.y = Math.max(var2.y, var5.method_10264());
         var2.z = Math.max(var2.z, var5.method_10260());
      }

      return new OlmIqkn(var1, var2);
   }
}
