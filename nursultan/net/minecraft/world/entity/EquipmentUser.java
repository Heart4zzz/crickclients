package net.minecraft.world.entity;

import KDFzREm.NCs;
import KDFzREm.NDg;
import KDFzREm.NNNBF;
import KDFzREm.NNNDJ;
import KDFzREm.NNNFv;
import KDFzREm.NNNNRZ;
import KDFzREm.NNNNud;
import KDFzREm.NNNZZ;
import KDFzREm.NNNZg;
import KDFzREm.NNNwS;
import KDFzREm.NNNwz;
import KDFzREm.NNcO;
import KDFzREm.NNty;
import KDFzREm.NNuU;
import KDFzREm.NQo;
import KDFzREm.NSy;
import KDFzREm.NXi;
import KDFzREm.NbB;
import KDFzREm.NbD;
import KDFzREm.NbK;
import KDFzREm.NbL;
import KDFzREm.NbZ;
import KDFzREm.Nbx;
import KDFzREm.NjL;
import KDFzREm.eR;
import KDFzREm.wY;
import baritone.api.BaritoneAPI;
import baritone.api.IBaritone;
import com.mojang.authlib.GameProfile;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.regex.Pattern;
import org.joml.Vector3d;
import rw.api.Iface0641;
import rw.api.Iface0643;
import rw.api.Iface0654;
import rw.core.C0892;
import rw.core.C1158;
import rw.core.C1160;
import rw.core.IljlItp;
import rw.gui.BypassHealth;
import rw.setting.C0071;
import rw.setting.C0160;

public class EquipmentUser {
   private static short[] y;
   private static boolean[] L;
   private static float[] u;
   public static Object[] N;
   private static short[] i;
   private static short[] R;
   private static boolean[] M;
   private static short[] B;
   private static short[] Z;
   private static String[] z;
   private static short[] U;
   private static short[] E;
   private static short[] W;
   private static boolean[] m;
   private static short[] P;
   private static boolean[] s;
   private static short[] T;
   private static boolean[] b;
   private static short[] j;
   private static boolean[] v;
   private static short[] n;
   private static short[] t;
   private static boolean[] G;
   private static byte[] l;
   private static double[] d;
   private static short[] w;

   public static List<NQo> L(NjL var0) {
      ArrayList var1 = new ArrayList();

      for (Nbx var3 : NNNNud.field_49224) {
         if (var3.N() == NbD.field_6178) {
            NQo var4 = var0.method_6118(var3);
            if (!var4.R()) {
               var1.add(var4);
            }
         }
      }

      return var1;
   }

   public static void L() {
      IBaritone var0 = wY.N();
      if (var0 != null) {
         var0.getPathingBehavior().cancelEverything();
      }
   }

   private static void M() {
      z = new String[2];
      z[(0 | -0) >>> 31] = "This is a utility class and cannot be instantiated";
      z[(1 | -1) >>> 31] = "^[а-яА-Яa-zA-Z0-9_Ёё]+$";
   }

   private EquipmentUser() {
      throw new UnsupportedOperationException(wY.z[0]);
   }

   static {
      ntfClinit();
   }

   private static void B() {
      float[] var128 = new float[2];
      u[(0 | -0) >>> 31] = Float.intBitsToFloat(0);
      u[(1 | -1) >>> 31] = Float.intBitsToFloat(0);
   }

   private static void Z() {
      short[] var128 = new short[2];
      B[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      B[(1 | -1) >>> 31] = 4;
      short[] var129 = new short[4];
      i[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      i[(1 | -1) >>> 31] = 4;
      i[2] = (short)((0 | -0) >>> 31);
      i[3] = 4;
      short[] var130 = new short[7];
      W[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      W[(1 | -1) >>> 31] = 2;
      W[2] = (short)((0 | -0) >>> 31);
      W[3] = 4;
      W[4] = (short)((0 | -0) >>> 31);
      W[5] = 4;
      W[6] = (short)((0 | -0) >>> 31);
      short[] var131 = new short[7];
      E[(0 | -0) >>> 31] = 2;
      E[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      E[2] = 4;
      E[3] = (short)((0 | -0) >>> 31);
      E[4] = 4;
      E[5] = (short)((0 | -0) >>> 31);
      E[6] = 4;
      short[] var132 = new short[2];
      j[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      j[(1 | -1) >>> 31] = 4;
      short[] var133 = new short[3];
      y[(0 | -0) >>> 31] = (short)((1 | -1) >>> 31);
      y[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      y[2] = 4;
      short[] var134 = new short[2];
      t[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      t[(1 | -1) >>> 31] = 4;
      short[] var135 = new short[2];
      U[(0 | -0) >>> 31] = 2;
      U[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      short[] var136 = new short[3];
      w[(0 | -0) >>> 31] = 4;
      w[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      w[2] = 4;
      short[] var137 = new short[7];
      n[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      n[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      n[2] = 4;
      n[3] = (short)((0 | -0) >>> 31);
      n[4] = (short)((0 | -0) >>> 31);
      n[5] = 4;
      n[6] = (short)((0 | -0) >>> 31);
      short[] var138 = new short[8];
      Z[(0 | -0) >>> 31] = 4;
      Z[(1 | -1) >>> 31] = 2;
      Z[2] = (short)((0 | -0) >>> 31);
      Z[3] = 4;
      Z[4] = (short)((0 | -0) >>> 31);
      Z[5] = 4;
      Z[6] = (short)((0 | -0) >>> 31);
      Z[7] = 4;
      short[] var139 = new short[4];
      P[(0 | -0) >>> 31] = 2;
      P[(1 | -1) >>> 31] = 2;
      P[2] = (short)((0 | -0) >>> 31);
      P[3] = 4;
      short[] var140 = new short[5];
      T[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      T[(1 | -1) >>> 31] = 4;
      T[2] = (short)((0 | -0) >>> 31);
      T[3] = (short)((1 | -1) >>> 31);
      T[4] = (short)((0 | -0) >>> 31);
      short[] var141 = new short[4];
      R[(0 | -0) >>> 31] = 3;
      R[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      R[2] = (short)((0 | -0) >>> 31);
      R[3] = 3;
   }

   public static boolean i() {
      IBaritone var0 = wY.N();
      return var0 == null ? wY.v[0] : var0.getPathingBehavior().hasPath();
   }

   private static void U() {
      byte[] var128 = new byte[5];
      l[(0 | -0) >>> 31] = 2;
      l[(1 | -1) >>> 31] = 3;
      l[2] = 4;
      l[3] = 2;
      l[4] = 3;
   }

   private static void z() {
      N = new Object[l[4]];
   }

   private static NQo u(NjL var0) {
      NQo var1 = var0.method_62821();
      if (var1 != null) {
         return var1;
      } else if (!(var0 instanceof Iface0641) && var0.method_6115() && var0.method_6030().R()) {
         NQo var2 = var0.method_5998(var0.method_6058());
         return var2.method_58694(NNNNRZ.H) != null ? var2 : null;
      } else {
         return null;
      }
   }

   public static boolean u() {
      return (NNNwS)((NNuU)wY.N[wY.i[0]]).T[wY.i[1]] == null
         ? wY.v[1]
         : ((Iface0654)((NNNwS)((NNuU)wY.N[wY.i[2]]).T[wY.i[3]])).dataManager().m14000().m10000().m20000();
   }

   public static void y(C0071 var0) {
      C1160 var1 = (C1160)((Iface0643)var0).dataManager();
      C1158 var2 = var1.m2000();
      if (((Vector3d)var2.m10000()).y != wY.d[0]) {
         var0.method_5814(((Vector3d)var2.m10000()).x, ((Vector3d)var2.m10000()).y, ((Vector3d)var2.m10000()).z);
         ((Vector3d)var2.m10000()).y = wY.d[1];
      }
   }

   public static void y(NjL var0) {
      int var1 = IljlItp.m38000(
         var0x -> Optional.ofNullable((eR)var0x.y().method_58694(NNNNRZ.g)).<Float>map(eR::y).orElse(wY.u[0]) > wY.u[1] ? wY.G[5] : wY.G[6]
      );
      if (!IljlItp.m36000(var1)) {
         C0892.m44000(var1);
         ((NNNBF)((NNNwS)((NNuU)wY.N[wY.n[1]]).T[wY.n[2]]).y[wY.n[3]]).N(NDg.N(var0, ((NNNwS)((NNuU)wY.N[wY.n[4]]).T[wY.n[5]]).method_5715()));
         ((NNNwS)((NNuU)wY.N[wY.n[6]]).T[wY.Z[0]]).method_6104(NbL.field_5808);
         C0892.m20000();
      }
   }

   public static NXi y() {
      return new NXi(
         ((NNNwS)((NNuU)wY.N[wY.E[5]]).T[wY.E[6]]).method_23317() - (Double)((NNNwS)((NNuU)wY.N[wY.j[0]]).T[wY.j[1]]).M[wY.y[0]],
         ((NNNwS)((NNuU)wY.N[wY.y[1]]).T[wY.y[2]]).method_23318() - (Double)((NNNwS)((NNuU)wY.N[wY.t[0]]).T[wY.t[1]]).M[wY.U[0]],
         ((NNNwS)((NNuU)wY.N[wY.U[1]]).T[wY.w[0]]).method_23321() - (Double)((NNNwS)((NNuU)wY.N[wY.w[1]]).T[wY.w[2]]).R[wY.n[0]]
      );
   }

   public static boolean y(GameProfile var0) {
      if (!C0160.m24000()) {
         return wY.M[1];
      } else {
         NNNBF var1 = ((NNuU)wY.N[wY.T[2]]).NE();
         if (var1 == null) {
            return wY.M[2];
         } else {
            return var1.N(var0.id()) == null ? wY.m[0] : wY.m[1];
         }
      }
   }

   private static void E() {
      double[] var128 = new double[3];
      d[(0 | -0) >>> 31] = Double.longBitsToDouble(-4571373524106608640L);
      d[(1 | -1) >>> 31] = Double.longBitsToDouble(-4571373524106608640L);
      d[2] = Double.longBitsToDouble(0L);
   }

   public static boolean N(NbL var0, NNty var1) {
      if (((NNNZZ)((NNuU)wY.N[wY.W[6]]).T[wY.E[0]]).N((NNNwS)((NNuU)wY.N[wY.E[1]]).T[wY.E[2]], var0, var1) instanceof NbB var2 && var2.i() == NbZ.field_52427) {
         ((NNNwS)((NNuU)OOjttiqq<"ipkalqub",778484037,-2087810949,-2087810950,-2087810951,1644185481,-308804066,2104589802>()[wY.E[3]]).T[wY.E[4]])
            .method_6104(var0);
         return wY.v[2];
      } else {
         return wY.v[3];
      }
   }

   public static boolean N(NNNwz var0) {
      if ((NNNwS)((NNuU)wY.N[wY.P[2]]).T[wY.P[3]] == null || var0 == (NNNwS)((NNuU)wY.N[wY.T[0]]).T[wY.T[1]]) {
         return wY.v[5];
      } else if (C0160.m24000()) {
         return wY.v[6];
      } else if (var0.method_5740()) {
         return wY.L[0];
      } else {
         GameProfile var1 = var0.method_7334();
         if (wY.y(var1)) {
            return wY.L[1];
         } else {
            return !wY.N(var0, var1) && !wY.N(var1) ? wY.M[0] : wY.L[2];
         }
      }
   }

   public static boolean N(NNNwz var0, GameProfile var1) {
      boolean var2 = NNNNud.field_49224.N().stream().<NQo>map(var0::method_6118).anyMatch(var0x -> var0x.L(NNNNRZ.o));
      boolean var3 = var2 && var0.method_45325(NNcO.y) == wY.d[2] ? wY.s[0] : wY.s[1];
      int var4 = var1.id().version();
      if (var4 == wY.l[1] && var3) {
         return wY.s[2];
      } else {
         return var3 && var4 == wY.l[2] && var1.properties().isEmpty() ? wY.s[3] : wY.G[0];
      }
   }

   public static boolean N(NjL var0, NbK var1) {
      NQo var2 = wY.u(var0);
      return var2 != null && !var2.R() ? wY.G[3] : wY.G[4];
   }

   public static boolean N(NjL var0) {
      return wY.L(var0).isEmpty();
   }

   public static IBaritone N() {
      return BaritoneAPI.getProvider().getBaritoneForPlayer((NNNwS)((NNuU)wY.N[wY.B[0]]).T[wY.B[1]]);
   }

   public static void N(C0071 var0) {
      wY.N(var0, wY.v[4]);
   }

   public static void N(C0071 var0, boolean var1) {
      C1160 var2 = (C1160)((Iface0643)var0).dataManager();
      var2.m2000().m10000().set(var0.method_23317(), var0.method_23318(), var0.method_23321());
      if (!var0.method_5765()
         && var0.field_6012 >= wY.l[0]
         && (var0.field_6038 != var0.method_23317() || var0.field_5971 != var0.method_23318() || var0.field_5989 != var0.method_23321())) {
         if (!var1 && !var0.method_6128()) {
            ((Vector3d)wY.N[wY.Z[1]])
               .set(
                  ((NNNwS)((NNuU)wY.N[wY.Z[2]]).T[wY.Z[3]]).method_23317(),
                  ((NNNwS)((NNuU)wY.N[wY.Z[4]]).T[wY.Z[5]]).method_23320(),
                  ((NNNwS)((NNuU)wY.N[wY.Z[6]]).T[wY.Z[7]]).method_23321()
               );
            Vector3d var6 = var2.m12000().m10000();
            Vector3d var4 = var2.m18000().m10000();
            Vector3d var5 = ((Vector3d)wY.N[wY.P[0]]).distance(var6) > ((Vector3d)wY.N[wY.P[1]]).distance(var4) ? var4 : var6;
            var0.method_5814(var5.x, var5.y, var5.z);
         } else {
            Vector3d var3 = var2.m18000().m10000();
            var0.method_5814(var3.x, var3.y, var3.z);
         }
      }
   }

   public static boolean N(GameProfile var0) {
      return !((Pattern)wY.N[wY.T[3]]).matcher(var0.name()).find() ? wY.G[1] : wY.G[2];
   }

   public static void N(NbL var0) {
      if (((NNNZZ)((NNuU)wY.N[wY.W[0]]).T[wY.W[1]]).N((NNNwS)((NNuU)wY.N[wY.W[2]]).T[wY.W[3]], var0) instanceof NbB var1 && var1.i() == NbZ.field_52427) {
         ((NNNwS)((NNuU)wY.N[wY.W[4]]).T[wY.W[5]]).method_6104(var0);
      }
   }

   public static float N(NjL var0, float var1) {
      if ((NNNZg)((NNuU)wY.N[wY.T[4]]).T[wY.R[0]] != null && BypassHealth.m2000() && !((NNuU)wY.N[wY.R[1]]).q() && !(var0 instanceof Iface0641)) {
         NSy var2 = ((NNNZg)((NNuU)wY.N[wY.R[2]]).T[wY.R[3]]).method_8428();
         if (var2 == null) {
            return var1;
         } else {
            NCs var3 = var2.N(NNNFv.field_45158);
            if (var3 == null) {
               return var1;
            } else {
               int var4 = var2.N(NNNDJ.N(var0.method_5820()), var3).N();
               return var4 > 0 ? var4 : var1;
            }
         }
      } else {
         return var1;
      }
   }

   private static void R() {
      boolean[] var128 = new boolean[7];
      v[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      v[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      v[2] = (boolean)((1 | -1) >>> 31);
      v[3] = (boolean)((0 | -0) >>> 31);
      v[4] = (boolean)((0 | -0) >>> 31);
      v[5] = (boolean)((0 | -0) >>> 31);
      v[6] = (boolean)((0 | -0) >>> 31);
      boolean[] var129 = new boolean[3];
      L[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      L[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      L[2] = (boolean)((1 | -1) >>> 31);
      boolean[] var130 = new boolean[3];
      M[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      M[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      M[2] = (boolean)((0 | -0) >>> 31);
      boolean[] var131 = new boolean[2];
      m[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      m[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      boolean[] var132 = new boolean[4];
      s[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      s[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      s[2] = (boolean)((1 | -1) >>> 31);
      s[3] = (boolean)((1 | -1) >>> 31);
      boolean[] var133 = new boolean[7];
      G[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      G[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      G[2] = (boolean)((0 | -0) >>> 31);
      G[3] = (boolean)((1 | -1) >>> 31);
      G[4] = (boolean)((0 | -0) >>> 31);
      G[5] = (boolean)((1 | -1) >>> 31);
      G[6] = (boolean)((0 | -0) >>> 31);
      boolean[] var134 = new boolean[2];
      b[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      b[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
   }
}
