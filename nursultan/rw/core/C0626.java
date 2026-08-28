package rw.core;

import KDFzREm.NNNbw;
import KDFzREm.NbQ;
import KDFzREm.Nbw;
import KDFzREm.NjL;
import java.util.HashMap;
import rw.NursultanClient;
import rw.defs.Enum0053;

public class C0626 extends HashMap<NNNbw<Nbw>, NbQ> {
   private static short[] f1000;
   public Object[] f2000;
   private static boolean[] f3000;

   private static void m2000() {
      boolean[] var128 = new boolean[(1 | -1) >>> 31];
      f3000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
   }

   public C0626(NjL var1) {
      this.m18000();
      this.f2000[f1000[0]] = var1;
   }

   static {
      ntfClinit();
   }

   private static void m10000() {
      short[] var128 = new short[4];
      f1000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f1000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f1000[2] = (short)((1 | -1) >>> 31);
      f1000[3] = 3;
   }

   public NbQ m14000(Object var1) {
      NbQ var2 = (NbQ)super.remove(var1);
      if (var2 != null) {
         NursultanClient.m8000().m12000(C0722.m22000(var2, (Enum0053)Enum0053.f2000[f1000[3]]));
      }

      return var2;
   }

   public NbQ m16000(NNNbw<Nbw> var1, NbQ var2) {
      NbQ var3 = super.put(var1, var2);
      if (var3 == null) {
         NursultanClient.m8000().m12000(C0722.m22000(var2, (Enum0053)Enum0053.f2000[f1000[1]]));
      } else {
         NursultanClient.m8000().m12000(C0722.m22000(var2, (Enum0053)Enum0053.f2000[f1000[2]]));
      }

      return var3;
   }

   private void m18000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[f3000[0]];
         Object[] var1 = this.f2000;
      }
   }
}
