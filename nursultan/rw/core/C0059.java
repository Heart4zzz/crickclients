package rw.core;

import KDFzREm.NjL;
import rw.data.Rec0288;
import rw.gui.AttackAura;
import rw.module.AttackAura_x_x;

public class C0059 extends C0784 {
   private static double[] f1000;
   private static boolean[] f2000;
   private static byte[] f3000;
   private static short[] f4000;

   private static void m2000() {
      boolean[] var128 = new boolean[5];
      f2000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f2000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f2000[2] = (boolean)((1 | -1) >>> 31);
      f2000[3] = (boolean)((1 | -1) >>> 31);
      f2000[4] = (boolean)((0 | -0) >>> 31);
   }

   public C0059(AttackAura var1, String var2, boolean var3) {
      super(var1, var2, var3);
   }

   static {
      ntfClinit();
   }

   private static void m4000() {
      short[] var128 = new short[6];
      f4000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f4000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f4000[2] = (short)((0 | -0) >>> 31);
      f4000[3] = (short)((0 | -0) >>> 31);
      f4000[4] = (short)((0 | -0) >>> 31);
      f4000[5] = (short)((0 | -0) >>> 31);
   }

   private static void m4000() {
      byte[] var128 = new byte[(1 | -1) >>> 31];
      f3000[(0 | -0) >>> 31] = 4;
   }

   public boolean m10000() {
      return f2000[4];
   }

   public boolean m8000(NjL var1) {
      return ((AttackAura)this.y[f4000[4]]).m136000(C1177.m80000(var1), ((AttackAura)this.y[f4000[5]]).m76000());
   }

   public void m12000(AttackAura_x_x var1) {
      super.m4000(var1);
      NjL var2 = ((AttackAura)this.y[f4000[0]]).m96000();
      if (!((AttackAura)this.y[f4000[1]]).m136000(C1177.m80000(var2), ((AttackAura)this.y[f4000[2]]).m76000() - f1000[0])) {
         var1.m46000(f2000[0]);
      }

      Rec0288 var3 = OljOitkn.m32000(var1.m28000(), f3000[0]);
      if (var3.m12000().m6000().field_5976) {
         var1.m22000(f2000[1]);
      }

      if (!C0887.m32000(((Base0764)((AttackAura)this.y[f4000[3]]).m22000().i()).m32000() - f2000[2]) || var1.m6000()) {
         var1.m16000(f2000[3]);
      }
   }

   private static void m12000() {
      double[] var128 = new double[(1 | -1) >>> 31];
      f1000[(0 | -0) >>> 31] = Double.longBitsToDouble(4609434218613702656L);
   }
}
