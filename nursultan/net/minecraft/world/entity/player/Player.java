package net.minecraft.world.entity.player;

import KDFzREm.NNNZg;
import KDFzREm.NNNww;
import KDFzREm.NNUB;
import KDFzREm.NNWE;
import KDFzREm.NNcO;
import KDFzREm.NXi;
import KDFzREm.Nba;
import KDFzREm.NcV;
import KDFzREm.NgA;
import KDFzREm.NjL;
import KDFzREm.Nwn;
import KDFzREm.wO;
import com.mojang.authlib.GameProfile;
import java.util.UUID;
import rw.api.Iface0641;

public class Player extends Nwn implements Iface0641 {
   private static short[] L;
   private static short[] u;
   private static byte[] i;
   private static short[] R;
   private static boolean[] M;
   private static short[] B;
   public Object[] N;
   public Object[] y;
   private static boolean[] Z;
   private static String[] W;
   private static double[] m;
   private static boolean[] P;
   private static float[] s;

   private static NcV L(NcV var0) {
      float var1 = var0.y();
      if (var1 <= wO.s[3]) {
         return var0;
      } else {
         NcV var2 = var0.N(wO.s[4] / var1);
         return var2.N(Math.min(var1 * wO.N(var2), wO.s[5]));
      }
   }

   public boolean L() {
      return ooljtmtl<"wzkwl",-1121398146,359991885,359991905,359991895,-868827010,429406907>(this);
   }

   public double M() {
      return ooljtmtl<"blns",-1121398146,359991885,359991911,359991910,-868827010,429406907>(this);
   }

   private void P() {
      this.N = new Object[i[0]];
      this.y = new Object[P[2]];
      this.N[Z[1]] = Z[2];
      this.y[P[3]] = P[4];
      this.N[i[1]] = Z[3];
      this.N[i[2]] = P[(0 | -0) >>> 31];
      this.N[i[3]] = s[7];
      this.N[i[4]] = P[(1 | -1) >>> 31];
      this.N[i[5]] = m[3];
   }

   public boolean method_7325() {
      return wO.M[1];
   }

   public boolean method_66249() {
      return wO.M[0];
   }

   public Nba method_33570() {
      return Nba.field_28630;
   }

   public boolean method_5624() {
      ooljtmtl<"syiyxkr",-1121398146,359991885,359991877,359991876,-868827010,429406907>(this);
      return (Boolean)ooljtmtl<"ogtkq",-1121398148,359991885,359991879,359991878,1504286965,-1869969383>(this)[wO.L[2]];
   }

   public void method_5783(NNUB var1, float var2, float var3) {
   }

   public boolean method_68878() {
      return wO.M[2];
   }

   public boolean method_5715() {
      ooljtmtl<"blns",-1121398146,359991885,359991877,359991876,-868827010,429406907>(this);
      return (Boolean)ooljtmtl<"ogtkq",-1121398148,359991885,359991879,359991878,476092722,-1360629025>(this)[wO.L[1]];
   }

   public Player(NNNZg var1) {
      super(var1, new GameProfile(UUID.randomUUID(), wO.W[0]));
      ooljtmtl<"tcaalj",-1121398146,359991885,359991877,359991876,-868827010,429406907>(this);
      NNNww var6 = new NNNww();
      ooljtmtl<"blns",-1121398148,359991885,359991879,359991878,1262955610,-1839447381>(this)[wO.u[0]] = var6;
      Float var7 = wO.s[0];
      ooljtmtl<"syiyxkr",-1121398148,359991885,359991879,359991878,1891065308,934895906>(this)[wO.u[1]] = var7;
      NXi var8 = new NXi(wO.m[0], wO.m[1], wO.m[2]);
      ooljtmtl<"dkunpd",-1121398148,359991885,359991879,359991878,-1010752538,-1970605138>(this)[wO.u[2]] = var8;
   }

   static {
      ntfClinit();
   }

   public void B() {
      ooljtmtl<"syiyxkr",-1121398146,359991885,359991817,359991895,-868827010,429406907>(this);
      ooljtmtl<"blns",-1121398146,359991885,359991816,359991876,-868827010,429406907>(this);
      ooljtmtl<"bwuif",-1121398146,359991885,359991819,359991895,-868827010,429406907>(this);
      ooljtmtl<"wzkwl",-1121398146,359991885,359991818,359991876,-868827010,429406907>(this);
   }

   public NjL i() {
      return this;
   }

   private static void s() {
      byte[] var128 = new byte[6];
      i[(0 | -0) >>> 31] = 8;
      i[(1 | -1) >>> 31] = 2;
      i[2] = 3;
      i[3] = 4;
      i[4] = 5;
      i[5] = 6;
   }

   private static void m() {
      W = new String[(1 | -1) >>> 31];
      W[(0 | -0) >>> 31] = "mock-player";
   }

   private static void U() {
      float[] var128 = new float[8];
      s[(0 | -0) >>> 31] = Float.intBitsToFloat(1065353216);
      s[(1 | -1) >>> 31] = Float.intBitsToFloat(0);
      s[2] = Float.intBitsToFloat(1065017672);
      s[3] = Float.intBitsToFloat(0);
      s[4] = Float.intBitsToFloat(1065353216);
      s[5] = Float.intBitsToFloat(1065353216);
      s[6] = Float.intBitsToFloat(1065353216);
      s[7] = Float.intBitsToFloat(0);
   }

   private static void z() {
      double[] var128 = new double[4];
      m[(0 | -0) >>> 31] = Double.longBitsToDouble(0L);
      m[(1 | -1) >>> 31] = Double.longBitsToDouble(0L);
      m[2] = Double.longBitsToDouble(0L);
      m[3] = Double.longBitsToDouble(0L);
   }

   public double u() {
      ooljtmtl<"dkunpd",-1121398146,359991885,359991877,359991876,-868827010,429406907>(this);
      return (Double)ooljtmtl<"dkunpd",-1121398148,359991885,359991879,359991878,-149254679,515006539>(this)[wO.B[1]];
   }

   private NcV y(NcV var1) {
      ooljtmtl<"nric",-1121398146,359991885,359991877,359991876,-868827010,429406907>(this);
      if (var1.L() == wO.s[1]) {
         return var1;
      } else {
         NcV var2 = var1.N(wO.s[2]).N((Float)ooljtmtl<"wzkwl",-1121398148,359991885,359991879,359991878,-703609894,-1482576960>(this)[wO.L[0]]);
         if (ooljtmtl<"jhak",-1121398146,359991885,359991933,359991895,-868827010,429406907>(this)
            || ooljtmtl<"ogtkq",-1121398146,359991885,359991932,359991895,-868827010,429406907>(this)) {
            var2 = var2.N((float)ooljtmtl<"ogtkq",-1121398146,359991885,359991928,359991931,-868827010,429406907>(this, NNcO.Y));
         }

         return wO.L(var2);
      }
   }

   public boolean y() {
      ooljtmtl<"ogtkq",-1121398146,359991885,359991877,359991876,-868827010,429406907>(this);
      return (Boolean)ooljtmtl<"ogtkq",-1121398148,359991885,359991879,359991878,612873776,-127269172>(this)[wO.B[0]];
   }

   private static void E() {
      short[] var128 = new short[3];
      u[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      u[(1 | -1) >>> 31] = 4;
      u[2] = 7;
      short[] var129 = new short[5];
      R[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      R[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      R[2] = 2;
      R[3] = (short)((1 | -1) >>> 31);
      R[4] = 4;
      short[] var130 = new short[7];
      L[(0 | -0) >>> 31] = 4;
      L[(1 | -1) >>> 31] = 2;
      L[2] = 3;
      L[3] = 7;
      L[4] = 7;
      L[5] = (short)((0 | -0) >>> 31);
      L[6] = (short)((0 | -0) >>> 31);
      short[] var131 = new short[2];
      B[(0 | -0) >>> 31] = 5;
      B[(1 | -1) >>> 31] = 6;
   }

   public NXi N() {
      ooljtmtl<"nric",-1121398146,359991885,359991877,359991876,-868827010,429406907>(this);
      return (NXi)ooljtmtl<"dkunpd",-1121398148,359991885,359991879,359991878,1996808769,1066931934>(this)[wO.L[3]];
   }

   public void N(boolean var1) {
      ooljtmtl<"nric",-1121398146,359991885,359991877,359991876,-868827010,429406907>(this);
      Boolean var6 = var1;
      ooljtmtl<"blns",-1121398148,359991885,359991899,359991878,-1180343966,801395549>(this)[wO.L[6]] = var6;
   }

   private static float N(NcV var0) {
      float var1 = Math.abs(var0.z);
      float var2 = Math.abs(var0.U);
      float var3 = var2 > var1 ? var1 / var2 : var2 / var1;
      return NNWE.N(wO.s[6] + NNWE.z(var3));
   }

   public void N(NXi var1) {
      ooljtmtl<"jhak",-1121398146,359991885,359991877,359991876,-868827010,429406907>(this);
      ooljtmtl<"blns",-1121398148,359991885,359991879,359991878,375301121,-435516540>(this)[wO.L[4]] = var1;
   }

   private static void W() {
      boolean[] var128 = new boolean[3];
      M[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      M[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      M[2] = (boolean)((0 | -0) >>> 31);
      boolean[] var129 = new boolean[4];
      Z[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      Z[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      Z[2] = (boolean)((0 | -0) >>> 31);
      Z[3] = (boolean)((0 | -0) >>> 31);
      boolean[] var130 = new boolean[5];
      P[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      P[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      P[2] = (boolean)((1 | -1) >>> 31);
      P[3] = (boolean)((0 | -0) >>> 31);
      P[4] = (boolean)((0 | -0) >>> 31);
   }

   public boolean R() {
      ooljtmtl<"nric",-1121398146,359991885,359991877,359991876,-868827010,429406907>(this);
      return (Boolean)ooljtmtl<"ogtkq",-1121398148,359991885,359991899,359991878,-759309459,38458905>(this)[wO.L[5]];
   }

   public void method_66282() {
      ooljtmtl<"wzkwl",-1121398146,359991885,359991877,359991876,-868827010,429406907>(this);
      NcV var1 = ooljtmtl<"dkunpd",-1121398146,359991885,359991899,359991930,-868827010,429406907>(
         this, ((NNNww)ooljtmtl<"tcaalj",-1121398148,359991885,359991879,359991878,-2069460090,-719396218>(this)[wO.R[0]]).method_3128()
      );
      Float var6 = var1.z;
      ooljtmtl<"blns",-1121398148,359991885,359991921,359991878,-1043357882,338826206>(this)[wO.R[1]] = var6;
      Float var7 = var1.U;
      ooljtmtl<"nric",-1121398148,359991885,359991921,359991878,-452222144,-46225147>(this)[wO.R[2]] = var7;
      Boolean var8 = (Boolean)ooljtmtl<"jhak",-1121398148,359991885,359991879,359991878,-1650098853,-1308005279>(this)[wO.R[3]];
      ooljtmtl<"nric",-1121398148,359991885,359991923,359991878,748129423,586505889>(this)[wO.R[4]] = var8;
   }

   public void method_6070() {
   }

   public void method_29242(boolean var1) {
   }

   public NgA onInsideBubbleColumn() {
      return NgA.field_9215;
   }

   public boolean method_7340() {
      return wO.Z[0];
   }
}
