package rw.core;

import KDFzREm.NNNZg;
import KDFzREm.NNuU;
import KDFzREm.NQo;
import KDFzREm.NaK;
import KDFzREm.NpC;
import KDFzREm.Npi;
import java.util.ArrayList;
import rw.api.Iface0606;

public class C1088 {
   private static boolean[] f1000;
   private static short[] f2000;
   private static byte[] f3000;
   private static boolean[] f4000;
   public Object[] f5000;

   public Iface0606 m2000() {
      return (Iface0606)this.f5000[f2000[3]];
   }

   private static void m6000() {
      byte[] var128 = new byte[4];
      f3000[(0 | -0) >>> 31] = -1;
      f3000[(1 | -1) >>> 31] = -1;
      f3000[2] = 3;
      f3000[3] = 2;
   }

   public C1088(Iface0606 var1, NQo var2) {
      this.m32000();
      this.f5000[f2000[0]] = var1;
      this.f5000[f2000[1]] = var2;
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      boolean[] var128 = new boolean[7];
      f1000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f1000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f1000[2] = (boolean)((0 | -0) >>> 31);
      f1000[3] = (boolean)((1 | -1) >>> 31);
      f1000[4] = (boolean)((0 | -0) >>> 31);
      f1000[5] = (boolean)((0 | -0) >>> 31);
      f1000[6] = (boolean)((0 | -0) >>> 31);
      boolean[] var129 = new boolean[4];
      f4000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f4000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f4000[2] = (boolean)((0 | -0) >>> 31);
      f4000[3] = (boolean)((0 | -0) >>> 31);
   }

   private static void m10000() {
      short[] var128 = new short[7];
      f2000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f2000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      f2000[2] = 3;
      f2000[3] = (short)((0 | -0) >>> 31);
      f2000[4] = (short)((1 | -1) >>> 31);
      f2000[5] = 2;
      f2000[6] = 2;
   }

   private static NpC m12000(NQo var0) {
      return !var0.R() && (NNNZg)NNuU.Nq().T[f2000[2]] != null ? (NpC)NQo.L.encodeStart(rw.setting.C0159.m76000(), var0).result().orElse(null) : null;
   }

   private static boolean m16000(NpC var0, NQo var1) {
      return var0 != null && !var1.R() ? m22000(var0, m12000(var1)) : f1000[0];
   }

   public NQo m18000() {
      return (NQo)this.f5000[f2000[4]];
   }

   public C1088 m20000(boolean var1) {
      Boolean var6 = var1;
      this.f5000[f2000[6]] = var6;
      return this;
   }

   private static boolean m22000(NpC var0, NpC var1) {
      if (var0 instanceof NaK var2 && var1 instanceof NaK var10) {
         if (!var2.i().equals(var10.i())) {
            return f1000[1];
         } else {
            for (String var12 : var2.i()) {
               if (!m22000(var2.N(var12), var10.N(var12))) {
                  return f1000[2];
               }
            }

            return f1000[3];
         }
      } else if (!(var0 instanceof Npi var9 && var1 instanceof Npi var3)) {
         return var0 != null && var0.equals(var1) ? f4000[1] : f4000[2];
      } else if (var9.size() != var3.size()) {
         return f1000[4];
      } else {
         ArrayList var4 = new ArrayList(var3);

         for (NpC var6 : var9) {
            int var7 = f3000[0];

            for (int var8 = f1000[5]; var8 < var4.size(); var8++) {
               if (m22000(var6, (NpC)var4.get(var8))) {
                  var7 = var8;
                  break;
               }
            }

            if (var7 == f3000[1]) {
               return f1000[6];
            }

            var4.remove(var7);
         }

         return f4000[0];
      }
   }

   public static C1088 m26000(NQo var0) {
      var0 = var0.t();
      NpC var1 = m12000(var0);
      return new C1088(var1x -> m16000(var1, var1x), var0);
   }

   public boolean m28000() {
      return (Boolean)this.f5000[f2000[5]];
   }

   private void m32000() {
      if (this.f5000 == null) {
         this.f5000 = new Object[f3000[2]];
         Object[] var1 = this.f5000;
         var1[f3000[3]] = f4000[3];
      }
   }
}
