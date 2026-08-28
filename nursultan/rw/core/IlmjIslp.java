package rw.core;

import KDFzREm.NNuU;
import org.joml.Vector2f;
import rw.api.Iface0211;
import rw.api.Iface0212;
import rw.api.Iface0625;
import rw.api.Iface0626;
import rw.defs.Enum0078;
import rw.gui.DragOffset;
import rw.gui.HudSnapLines;

public class IlmjIslp extends OlOikk<Iface0626> {
   private static short[] f1000;
   public Object[] f2000;
   public static Object[] f3000;
   private static float[] f4000;
   private static boolean[] f5000;
   private static short[] f6000;
   private static byte[] f7000;

   @Override
   public void m2000(Base0315 var1, Iface0626 var2) {
      DragOffset var3 = LeAm.m18000(var2.m8000());
      if (var3 != null && var1 instanceof C0318 var4) {
         switch (var4.m2000()) {
            case 0:
               var3.m8000();
               break;
            case 2:
               var3.m6000();
         }
      }

      super.m6000(var1, var2);
   }

   private static void m4000() {
      short[] var128 = new short[6];
      f1000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f1000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f1000[2] = (short)((0 | -0) >>> 31);
      f1000[3] = (short)((1 | -1) >>> 31);
      f1000[4] = 2;
      f1000[5] = (short)((0 | -0) >>> 31);
      short[] var129 = new short[7];
      f6000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f6000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f6000[2] = (short)((0 | -0) >>> 31);
      f6000[3] = (short)((0 | -0) >>> 31);
      f6000[4] = (short)((0 | -0) >>> 31);
      f6000[5] = (short)((0 | -0) >>> 31);
      f6000[6] = (short)((0 | -0) >>> 31);
   }

   private static void m2000() {
      f3000 = new Object[f7000[2]];
   }

   private IlmjIslp(Enum0078 var1) {
      this.m12000();
      this.f2000[f1000[0]] = var1;
   }

   static {
      ntfClinit();
   }

   private static void m4000() {
      byte[] var128 = new byte[3];
      f7000[(0 | -0) >>> 31] = 2;
      f7000[(1 | -1) >>> 31] = 2;
      f7000[2] = 3;
   }

   private static void m8000() {
      float[] var128 = new float[(1 | -1) >>> 31];
      f4000[(0 | -0) >>> 31] = Float.intBitsToFloat(0);
   }

   private static boolean m8000() {
      return NNuU.Nq().s();
   }

   private void m12000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[f5000[4]];
         Object[] var1 = this.f2000;
      }
   }

   @Override
   public void m14000(Base0315 var1, Iface0626 var2) {
      this.m12000();
      super.m14000(var1, var2);
      if (var2.m4000().m2000()) {
         ((HudSnapLines)HudSnapLines.f13000[f6000[1]]).m46000();
         Vector2f var3 = var2.m6000().m2000();
         if (var3 != null) {
            Iface0212 var4 = var1.m26000();
            Iface0211 var5 = var4.m8000().m18000();
            Vector2f var6 = new Vector2f(var3);
            if (m8000()) {
               ((HudSnapLines)HudSnapLines.f13000[f6000[2]])
                  .m40000(
                     var2.m8000(),
                     var6,
                     var4.m18000().m12000(),
                     var4.m18000().m10000(),
                     var5.m12000(),
                     var5.m10000(),
                     ((Enum0078)this.f2000[f6000[3]]).m26000(),
                     ((Enum0078)this.f2000[f6000[4]]).m30000()
                  );
            }

            if (((Enum0078)this.f2000[f6000[5]]).m26000()) {
               var6.x = var6.x + m12000(var2.m8000(), var4.m18000().m12000());
            }

            if (!var6.equals(var3)) {
               var2.m6000().m6000(var6);
            }
         }
      }
   }

   public Enum0078 m20000() {
      this.m12000();
      return (Enum0078)this.f2000[f6000[0]];
   }

   public static Iface0625<Iface0626> m10000(Enum0078 var0) {
      return (Iface0625<Iface0626>)(switch (((int[])C1069.f2000[f1000[1]])[var0.ordinal()]) {
         case 1 -> (IlmjIslp)f3000[f1000[2]];
         case 2 -> (IlmjIslp)f3000[f1000[3]];
         case 3 -> (IlmjIslp)f3000[f1000[4]];
         case 4 -> (C1061)C1061.f1000[f1000[5]];
         default -> throw new MatchException(null, null);
      });
   }

   private static float m12000(String var0, float var1) {
      DragOffset var2 = LeAm.m18000(var0);
      return var2 != null ? var2.m4000().m36000() * var1 : f4000[0];
   }

   @Override
   public void m22000(Base0315 var1, Iface0626 var2) {
      super.m22000(var1, var2);
      if (!var2.m4000().m2000()) {
         ((HudSnapLines)HudSnapLines.f13000[f6000[6]]).m46000();
      }
   }

   private static void m14000() {
      boolean[] var128 = new boolean[5];
      f5000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f5000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f5000[2] = (boolean)((1 | -1) >>> 31);
      f5000[3] = (boolean)((1 | -1) >>> 31);
      f5000[4] = (boolean)((1 | -1) >>> 31);
   }
}
