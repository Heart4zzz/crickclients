package net.minecraft.core;

public class QuartPos {
   private static byte[] M;
   private static byte[] B;
   public static Object[] N;
   private static byte[] Z;
   private static byte[] z;
   public static Object[] y;
   private static byte[] U;
   private static byte[] E;
   public static Object[] L;
   private static short[] W;
   public static Object[] u;
   private static boolean[] m;
   private static byte[] P;
   public static Object[] i;
   private static byte[] s;
   private static byte[] T;
   private static byte[] b;
   private static boolean[] j;
   private static byte[] v;
   private static boolean[] n;
   private static byte[] t;
   public static Object[] R;

   private static void L() {
      boolean[] var128 = new boolean[2];
      m[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      m[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      boolean[] var129 = new boolean[3];
      n[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      n[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      n[2] = (boolean)((0 | -0) >>> 31);
      boolean[] var130 = new boolean[7];
      j[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      j[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      j[2] = (boolean)((1 | -1) >>> 31);
      j[3] = (boolean)((0 | -0) >>> 31);
      j[4] = (boolean)((1 | -1) >>> 31);
      j[5] = (boolean)((0 | -0) >>> 31);
      j[6] = (boolean)((1 | -1) >>> 31);
   }

   private QuartPos() {
   }

   static {
      ntfClinit();
   }

   private static void u() {
      byte[] var128 = new byte[4];
      t[(0 | -0) >>> 31] = 8;
      t[(1 | -1) >>> 31] = 2;
      t[2] = 16;
      t[3] = 3;
      byte[] var129 = new byte[4];
      v[(0 | -0) >>> 31] = 10;
      v[(1 | -1) >>> 31] = 4;
      v[2] = 5;
      v[3] = 6;
      byte[] var130 = new byte[2];
      P[(0 | -0) >>> 31] = 89;
      P[(1 | -1) >>> 31] = 7;
      byte[] var131 = new byte[8];
      B[(0 | -0) >>> 31] = 52;
      B[(1 | -1) >>> 31] = 4;
      B[2] = 38;
      B[3] = 89;
      B[4] = 2;
      B[5] = 30;
      B[6] = 3;
      B[7] = 22;
      byte[] var132 = new byte[8];
      Z[(0 | -0) >>> 31] = 7;
      Z[(1 | -1) >>> 31] = 6;
      Z[2] = 9;
      Z[3] = 2;
      Z[4] = 33;
      Z[5] = 3;
      Z[6] = 4;
      Z[7] = 50;
      byte[] var133 = new byte[3];
      U[(0 | -0) >>> 31] = 5;
      U[(1 | -1) >>> 31] = 20;
      U[2] = 6;
      byte[] var134 = new byte[5];
      b[(0 | -0) >>> 31] = 20;
      b[(1 | -1) >>> 31] = 5;
      b[2] = 12;
      b[3] = 24;
      b[4] = 2;
      byte[] var135 = new byte[5];
      M[(0 | -0) >>> 31] = 18;
      M[(1 | -1) >>> 31] = 3;
      M[2] = 66;
      M[3] = 4;
      M[4] = 14;
      byte[] var136 = new byte[5];
      E[(0 | -0) >>> 31] = 7;
      E[(1 | -1) >>> 31] = 12;
      E[2] = 40;
      E[3] = 2;
      E[4] = 20;
      byte[] var137 = new byte[5];
      z[(0 | -0) >>> 31] = 3;
      z[(1 | -1) >>> 31] = 2;
      z[2] = 4;
      z[3] = 12;
      z[4] = 5;
      byte[] var138 = new byte[4];
      T[(0 | -0) >>> 31] = 60;
      T[(1 | -1) >>> 31] = 6;
      T[2] = 17;
      T[3] = 5;
      byte[] var139 = new byte[8];
      s[(0 | -0) >>> 31] = 18;
      s[(1 | -1) >>> 31] = 66;
      s[2] = 2;
      s[3] = 20;
      s[4] = 3;
      s[5] = 20;
      s[6] = 4;
      s[7] = 20;
   }

   private static void y() {
      N = new Object[t[(0 | -0) >>> 31]];
      N[m[(0 | -0) >>> 31]] = Integer.valueOf(W[0]);
      N[m[(1 | -1) >>> 31]] = Integer.valueOf(W[1]);
      N[t[(1 | -1) >>> 31]] = Integer.valueOf(t[2]);
      N[t[3]] = Integer.valueOf(v[0]);
      N[v[(1 | -1) >>> 31]] = Integer.valueOf(W[2]);
      N[v[2]] = Integer.valueOf(W[3]);
      N[v[3]] = Integer.valueOf(P[0]);
      N[P[(1 | -1) >>> 31]] = Integer.valueOf(B[0]);
      L = new Object[B[(1 | -1) >>> 31]];
      L[n[(0 | -0) >>> 31]] = Integer.valueOf(B[2]);
      L[n[(1 | -1) >>> 31]] = Integer.valueOf(B[3]);
      L[B[4]] = Integer.valueOf(B[5]);
      L[B[6]] = Integer.valueOf(B[7]);
      u = new Object[Z[(0 | -0) >>> 31]];
      u[n[2]] = Integer.valueOf(Z[1]);
      u[j[(0 | -0) >>> 31]] = Integer.valueOf(Z[2]);
      u[Z[3]] = Integer.valueOf(Z[4]);
      u[Z[5]] = Integer.valueOf(W[4]);
      u[Z[6]] = Integer.valueOf(Z[7]);
      u[U[(0 | -0) >>> 31]] = Integer.valueOf(U[1]);
      u[U[2]] = Integer.valueOf(b[0]);
      y = new Object[b[(1 | -1) >>> 31]];
      y[j[(1 | -1) >>> 31]] = Integer.valueOf(b[2]);
      y[j[2]] = Integer.valueOf(b[3]);
      y[b[4]] = Integer.valueOf(M[0]);
      y[M[(1 | -1) >>> 31]] = Integer.valueOf(M[2]);
      y[M[3]] = Integer.valueOf(M[4]);
      i = new Object[E[(0 | -0) >>> 31]];
      i[j[3]] = Integer.valueOf(E[1]);
      i[j[4]] = Integer.valueOf(E[2]);
      i[E[3]] = Integer.valueOf(E[4]);
      i[z[(0 | -0) >>> 31]] = Integer.valueOf(z[1]);
      i[z[2]] = Integer.valueOf(z[3]);
      i[z[4]] = Integer.valueOf(T[0]);
      i[T[(1 | -1) >>> 31]] = Integer.valueOf(T[2]);
      R = new Object[T[3]];
      R[j[5]] = Integer.valueOf(s[0]);
      R[j[6]] = Integer.valueOf(s[1]);
      R[s[2]] = Integer.valueOf(s[3]);
      R[s[4]] = Integer.valueOf(s[5]);
      R[s[6]] = Integer.valueOf(s[7]);
   }

   private static void N() {
      short[] var128 = new short[5];
      W[(0 | -0) >>> 31] = 1196;
      W[(1 | -1) >>> 31] = 750;
      W[2] = 270;
      W[3] = 269;
      W[4] = 229;
   }
}
