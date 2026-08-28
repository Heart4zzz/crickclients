package rw.setting;

import rw.api.Iface0195;
import rw.core.C0361;
import rw.core.C1165;
import rw.data.Ilnotljq;
import rw.data.Rec0125;
import rw.defs.Enum0039;

public class C0152 implements Iface0195 {
   private static short[] f1000;
   private static short[] f2000;
   private static String[] f3000;
   private static short[] f4000;
   private static boolean[] f5000;
   public Object[] f6000;
   private static short[] f7000;
   private static byte[] f8000;
   private static short[] f9000;
   private static short[] f10000;

   private static void m6000() {
      f3000 = new String[4];
      f3000[(0 | -0) >>> 31] = "Spring AXIS_SIZE transitions require matching size modes";
      f3000[(1 | -1) >>> 31] = "min";
      f3000[2] = "max";
      f3000[3] = "value";
   }

   private static C0153 m8000(Rec0125 var0, Rec0125 var1, Ilnotljq var2) {
      return switch (((int[])C1165.f2000[f1000[5]])[var0.m20000().ordinal()]) {
         case 1, 2 -> null;
         case 3, 4 -> m32000(var0.m14000(), var1.m14000(), var2, f3000[1]);
         default -> throw new MatchException(null, null);
      };
   }

   private Rec0125 m10000() {
      return switch (((int[])C1165.f2000[f4000[2]])[((Enum0039)this.f6000[f4000[3]]).ordinal()]) {
         case 1 -> C0361.m10000(((C0153)this.f6000[f4000[4]]).m4000());
         case 2 -> C0361.m4000(((C0153)this.f6000[f4000[5]]).m4000());
         case 3 -> C0361.m12000(((C0153)this.f6000[f4000[6]]).m4000(), Math.max(((C0153)this.f6000[f1000[0]]).m4000(), ((C0153)this.f6000[f1000[1]]).m4000()));
         case 4 -> C0361.m6000(((C0153)this.f6000[f1000[2]]).m4000(), Math.max(((C0153)this.f6000[f1000[3]]).m4000(), ((C0153)this.f6000[f1000[4]]).m4000()));
         default -> throw new MatchException(null, null);
      };
   }

   public C0152(Rec0125 var1, Rec0125 var2, Ilnotljq var3) {
      this.m20000();
      if (var1.m20000() != var2.m20000()) {
         throw new IllegalArgumentException(f3000[0]);
      } else {
         Enum0039 var8 = var1.m20000();
         this.f6000[f9000[0]] = var8;
         C0153 var9 = m8000(var1, var2, var3);
         this.f6000[f9000[1]] = var9;
         C0153 var10 = m44000(var1, var2, var3);
         this.f6000[f9000[2]] = var10;
         C0153 var11 = m24000(var1, var2, var3);
         this.f6000[f9000[3]] = var11;
      }
   }

   static {
      ntfClinit();
   }

   private static void m12000() {
      short[] var128 = new short[4];
      f9000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f9000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      f9000[2] = 2;
      f9000[3] = 3;
      short[] var129 = new short[5];
      f10000[(0 | -0) >>> 31] = (short)((1 | -1) >>> 31);
      f10000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      f10000[2] = 2;
      f10000[3] = 2;
      f10000[4] = 3;
      short[] var130 = new short[7];
      f7000[(0 | -0) >>> 31] = 3;
      f7000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      f7000[2] = 2;
      f7000[3] = 3;
      f7000[4] = (short)((0 | -0) >>> 31);
      f7000[5] = (short)((1 | -1) >>> 31);
      f7000[6] = (short)((1 | -1) >>> 31);
      short[] var131 = new short[2];
      f2000[(0 | -0) >>> 31] = 2;
      f2000[(1 | -1) >>> 31] = 2;
      short[] var132 = new short[7];
      f4000[(0 | -0) >>> 31] = 3;
      f4000[(1 | -1) >>> 31] = 3;
      f4000[2] = (short)((0 | -0) >>> 31);
      f4000[3] = (short)((0 | -0) >>> 31);
      f4000[4] = 3;
      f4000[5] = 3;
      f4000[6] = (short)((1 | -1) >>> 31);
      short[] var133 = new short[8];
      f1000[(0 | -0) >>> 31] = (short)((1 | -1) >>> 31);
      f1000[(1 | -1) >>> 31] = 2;
      f1000[2] = (short)((1 | -1) >>> 31);
      f1000[3] = (short)((1 | -1) >>> 31);
      f1000[4] = 2;
      f1000[5] = (short)((0 | -0) >>> 31);
      f1000[6] = (short)((0 | -0) >>> 31);
      f1000[7] = (short)((0 | -0) >>> 31);
   }

   private static void m14000() {
      byte[] var128 = new byte[(1 | -1) >>> 31];
      f8000[(0 | -0) >>> 31] = 4;
   }

   private void m20000() {
      if (this.f6000 == null) {
         this.f6000 = new Object[f8000[0]];
         Object[] var1 = this.f6000;
      }
   }

   private static C0153 m24000(Rec0125 var0, Rec0125 var1, Ilnotljq var2) {
      return switch (((int[])C1165.f2000[f1000[7]])[var0.m20000().ordinal()]) {
         case 1, 2 -> m32000(var0.m8000(), var1.m8000(), var2, f3000[3]);
         case 3, 4 -> null;
         default -> throw new MatchException(null, null);
      };
   }

   public boolean m26000() {
      return m42000((C0153)this.f6000[f7000[1]]) && m42000((C0153)this.f6000[f7000[2]]) && m42000((C0153)this.f6000[f7000[3]]) ? f5000[1] : f5000[2];
   }

   public boolean m30000(float var1) {
      boolean var2 = f5000[0];
      if ((C0153)this.f6000[f10000[0]] != null) {
         var2 |= ((C0153)this.f6000[f10000[1]]).m36000(var1);
      }

      if ((C0153)this.f6000[f10000[2]] != null) {
         var2 |= ((C0153)this.f6000[f10000[3]]).m36000(var1);
      }

      if ((C0153)this.f6000[f10000[4]] != null) {
         var2 |= ((C0153)this.f6000[f7000[0]]).m36000(var1);
      }

      return var2;
   }

   private static C0153 m32000(float var0, float var1, Ilnotljq var2, String var3) {
      if (Float.isFinite(var0) && Float.isFinite(var1)) {
         return new C0153(var0, var1, var2);
      } else {
         throw new IllegalArgumentException("Spring AXIS_SIZE transitions require finite " + var3 + " values");
      }
   }

   public boolean m36000(C0027 var1) {
      Rec0125 var2 = var1.m8000();
      if (var2.m20000() != (Enum0039)this.f6000[f7000[4]]) {
         return f5000[3];
      } else {
         if ((C0153)this.f6000[f7000[5]] != null) {
            ((C0153)this.f6000[f7000[6]]).m30000(var2.m14000());
         }

         if ((C0153)this.f6000[f2000[0]] != null) {
            ((C0153)this.f6000[f2000[1]]).m30000(var2.m36000());
         }

         if ((C0153)this.f6000[f4000[0]] != null) {
            ((C0153)this.f6000[f4000[1]]).m30000(var2.m8000());
         }

         return f5000[4];
      }
   }

   public C0027 m40000() {
      return C0027.m14000(this.m10000());
   }

   private static boolean m42000(C0153 var0) {
      return var0 != null && !var0.m26000() ? f5000[6] : f5000[5];
   }

   private static C0153 m44000(Rec0125 var0, Rec0125 var1, Ilnotljq var2) {
      return switch (((int[])C1165.f2000[f1000[6]])[var0.m20000().ordinal()]) {
         case 1, 2 -> null;
         case 3, 4 -> m32000(var0.m36000(), var1.m36000(), var2, f3000[2]);
         default -> throw new MatchException(null, null);
      };
   }

   private static void m46000() {
      boolean[] var128 = new boolean[7];
      f5000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f5000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f5000[2] = (boolean)((0 | -0) >>> 31);
      f5000[3] = (boolean)((0 | -0) >>> 31);
      f5000[4] = (boolean)((1 | -1) >>> 31);
      f5000[5] = (boolean)((1 | -1) >>> 31);
      f5000[6] = (boolean)((0 | -0) >>> 31);
   }
}
