package rw.core;

import java.util.function.ObjIntConsumer;
import rw.api.Iface0642;
import rw.defs.Enum0072;
import rw.defs.Enum0081;
import rw.gui.PgUp;
import rw.module.Huddumped;

public class C0899 {
   private static short[] f1000;
   public Object[] f2000;
   private static boolean[] f3000;
   private static short[] f4000;
   private static byte[] f5000;

   private static boolean m2000(Huddumped var0) {
      return !var0.m20000().m26000((Enum0072)Enum0072.f1000[f4000[5]])
            || !var0.m36000((PgUp)PgUp.f16000[f4000[6]]) && !var0.m36000((PgUp)PgUp.f75000[f4000[7]])
         ? f3000[3]
         : f3000[2];
   }

   private void m6000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[f5000[0]];
         Object[] var1 = this.f2000;
      }
   }

   public C0899(ObjIntConsumer<PgUp> var1) {
      this.m6000();
      this.f2000[f1000[0]] = var1;
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      boolean[] var128 = new boolean[4];
      f3000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f3000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f3000[2] = (boolean)((1 | -1) >>> 31);
      f3000[3] = (boolean)((0 | -0) >>> 31);
   }

   private void m10000(Huddumped var1) {
      if (m2000(var1)) {
         Object var7 = null;
         this.f2000[f1000[1]] = var7;
         ((ObjIntConsumer)this.f2000[f1000[2]]).accept((PgUp)PgUp.f4000[f1000[3]], f3000[0]);
         var1.N();
      } else {
         PgUp var2 = PgUp.m76000(var1.m30000());
         if (C1231.m34000(var2)) {
            this.f2000[f1000[4]] = var2;
            var1.N();
         } else {
            Object var9 = null;
            this.f2000[f1000[5]] = var9;
            ((ObjIntConsumer)this.f2000[f1000[6]]).accept(var2, var2.m80000() ? f3000[1] : C1231.m22000(var2, var1.m58000()));
            var1.N();
         }
      }
   }

   private void m12000(Huddumped var1) {
      if ((PgUp)this.f2000[f4000[0]] != null && ((PgUp)this.f2000[f4000[1]]).m88000(var1.m30000())) {
         PgUp var2 = (PgUp)this.f2000[f4000[2]];
         Object var7 = null;
         this.f2000[f4000[3]] = var7;
         ((ObjIntConsumer)this.f2000[f4000[4]]).accept(var2, C1231.m22000(var2, var1.m58000()));
         var1.N();
      }
   }

   private static void m16000() {
      byte[] var128 = new byte[(1 | -1) >>> 31];
      f5000[(0 | -0) >>> 31] = 2;
   }

   @Iface0642(
      y = Enum0081.BEFORE_ALL
   )
   public void m18000(Huddumped var1) {
      if (var1.m18000()) {
         this.m10000(var1);
      } else {
         if (var1.m10000()) {
            this.m12000(var1);
         }
      }
   }

   private static void m22000() {
      short[] var128 = new short[7];
      f1000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f1000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      f1000[2] = (short)((0 | -0) >>> 31);
      f1000[3] = (short)((0 | -0) >>> 31);
      f1000[4] = (short)((1 | -1) >>> 31);
      f1000[5] = (short)((1 | -1) >>> 31);
      f1000[6] = (short)((0 | -0) >>> 31);
      short[] var129 = new short[8];
      f4000[(0 | -0) >>> 31] = (short)((1 | -1) >>> 31);
      f4000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      f4000[2] = (short)((1 | -1) >>> 31);
      f4000[3] = (short)((1 | -1) >>> 31);
      f4000[4] = (short)((0 | -0) >>> 31);
      f4000[5] = (short)((1 | -1) >>> 31);
      f4000[6] = (short)((1 | -1) >>> 31);
      f4000[7] = 2;
   }
}
