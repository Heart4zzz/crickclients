package rw.setting;

import KDFzREm.NNNZg;
import KDFzREm.NNNwz;
import KDFzREm.NXi;
import KDFzREm.Nbj;
import KDFzREm.Nfu;
import KDFzREm.gJ;
import KDFzREm.gQ;
import com.mojang.authlib.GameProfile;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import rw.api.Iface0652;
import rw.core.C1160;

public class C0071 extends NNNwz implements Iface0652 {
   private static boolean[] f1000;
   private static short[] f2000;
   private static short[] f3000;
   private static short[] f4000;
   private static short[] f5000;
   private static double[] f6000;
   private static boolean[] f7000;
   public Object[] f8000;
   private static byte[] f9000;
   private static String[] f10000;

   private static void m4000() {
      short[] var128 = new short[2];
      f4000[(0 | -0) >>> 31] = 2;
      f4000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      short[] var129 = new short[6];
      f2000[(0 | -0) >>> 31] = 5;
      f2000[(1 | -1) >>> 31] = 5;
      f2000[2] = 4;
      f2000[3] = 5;
      f2000[4] = 5;
      f2000[5] = (short)((1 | -1) >>> 31);
      short[] var130 = new short[6];
      f3000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f3000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      f3000[2] = (short)((0 | -0) >>> 31);
      f3000[3] = (short)((1 | -1) >>> 31);
      f3000[4] = (short)((0 | -0) >>> 31);
      f3000[5] = (short)((1 | -1) >>> 31);
      short[] var131 = new short[5];
      f5000[(0 | -0) >>> 31] = (short)((1 | -1) >>> 31);
      f5000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      f5000[2] = (short)((0 | -0) >>> 31);
      f5000[3] = (short)((1 | -1) >>> 31);
      f5000[4] = 2;
   }

   private static void m6000() {
      f10000 = new String[(1 | -1) >>> 31];
      f10000[(0 | -0) >>> 31] = "push";
   }

   public void method_31471(Nfu var1) {
      super.method_31471(var1);
      this.method_22862();
   }

   public void method_5773() {
      super.method_5773();
      this.method_29242(f1000[4]);
   }

   public boolean method_5640(double var1) {
      double var3 = this.method_5829().N() * f6000[0];
      if (Double.isNaN(var3)) {
         var3 = f6000[1];
      }

      var3 *= f6000[2] * method_5824();
      return var1 < var3 * var3 ? f1000[1] : f1000[2];
   }

   public boolean method_5643(Nbj var1) {
      return f1000[3];
   }

   public void method_5750(NXi var1) {
      this.m30000();
      this.f8000[f5000[2]] = var1;
      Integer var7 = this.method_5864().m() + f7000[2];
      this.f8000[f5000[3]] = var7;
   }

   public C0071(NNNZg var1, GameProfile var2) {
      super(var1, var2);
      this.m30000();
      C1160 var7 = new C1160();
      this.f8000[f4000[0]] = var7;
      NXi var8 = NXi.L;
      this.f8000[f4000[1]] = var8;
      this.field_5960 = f1000[0];
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      double[] var128 = new double[3];
      f6000[(0 | -0) >>> 31] = Double.longBitsToDouble(4621819117588971520L);
      f6000[(1 | -1) >>> 31] = Double.longBitsToDouble(4607182418800017408L);
      f6000[2] = Double.longBitsToDouble(4634204016564240384L);
   }

   private static void m14000() {
      boolean[] var128 = new boolean[5];
      f1000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f1000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f1000[2] = (boolean)((0 | -0) >>> 31);
      f1000[3] = (boolean)((1 | -1) >>> 31);
      f1000[4] = (boolean)((0 | -0) >>> 31);
      boolean[] var129 = new boolean[5];
      f7000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f7000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f7000[2] = (boolean)((1 | -1) >>> 31);
      f7000[3] = (boolean)((1 | -1) >>> 31);
      f7000[4] = (boolean)((0 | -0) >>> 31);
   }

   private static void m18000() {
      byte[] var128 = new byte[(1 | -1) >>> 31];
      f9000[(0 | -0) >>> 31] = 3;
   }

   private void m22000(CallbackInfo var1) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_13_2)) {
         super.method_7318();
      }
   }

   public C1160 m28000() {
      this.m30000();
      return (C1160)this.f8000[f5000[4]];
   }

   private void m30000() {
      if (this.f8000 == null) {
         this.f8000 = new Object[f9000[0]];
         Object[] var1 = this.f8000;
         var1[f7000[3]] = Integer.valueOf(f7000[4]);
      }
   }

   public void method_6007() {
      this.m30000();
      if (this.method_66245()) {
         this.method_66233().method_66271();
      }

      if ((Integer)this.fields_7212a028292fd3c078969e3ee4c71d9e8[f2000[0]] > 0) {
         this.method_52539((Integer)this.fields_7212a028292fd3c078969e3ee4c71d9e8[f2000[1]], (Double)this.fields_7212a028292fd3c078969e3ee4c71d9e8[f2000[2]]);
         Integer var8 = (Integer)this.fields_7212a028292fd3c078969e3ee4c71d9e8[f2000[3]] - f7000[0];
         this.fields_7212a028292fd3c078969e3ee4c71d9e8[f2000[4]] = var8;
      }

      if ((Integer)this.f8000[f2000[5]] > 0) {
         this.method_45319(
            new NXi(
               (((NXi)this.f8000[f3000[0]]).M - this.method_18798().M) / ((Integer)this.f8000[f3000[1]]).intValue(),
               (((NXi)this.f8000[f3000[2]]).B - this.method_18798().B) / ((Integer)this.f8000[f3000[3]]).intValue(),
               (((NXi)this.f8000[f3000[4]]).Z - this.method_18798().Z) / ((Integer)this.f8000[f3000[5]]).intValue()
            )
         );
         Integer var9 = (Integer)this.f8000[f5000[0]] - f7000[1];
         this.f8000[f5000[1]] = var9;
      }

      this.method_6119();
      this.W();
      gJ var1 = gQ.N().i(f10000[0]);

      try {
         this.method_6070();
      } catch (Throwable var11) {
         if (var1 != null) {
            try {
               var1.close();
            } catch (Throwable var10) {
               var11.addSuppressed(var10);
            }
         }

         throw var11;
      }

      if (var1 != null) {
         var1.close();
      }
   }

   public void method_7318() {
      this.m22000(null);
   }
}
