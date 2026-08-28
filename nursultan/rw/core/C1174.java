package rw.core;

import KDFzREm.NNF;
import KDFzREm.NNIo;
import KDFzREm.NNJB;
import KDFzREm.NNMH;
import KDFzREm.NNNQb;
import KDFzREm.NNS;
import KDFzREm.NNuU;
import KDFzREm.NXi;
import KDFzREm.NZH;
import KDFzREm.NbK;
import KDFzREm.Nyl;
import java.util.List;
import java.util.function.Consumer;
import rw.api.Iface0644;
import rw.data.Rec0285;

public class C1174 {
   private static byte[] f1000;
   private static short[] f2000;
   public static Object[] f3000;
   private static short[] f4000;
   private static String[] f5000;
   private static short[] f6000;
   private static short[] f7000;

   private static void m2000() {
      f3000 = new Object[f1000[1]];
   }

   private C1174() {
      throw new UnsupportedOperationException(f5000[0]);
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      f5000 = new String[(1 | -1) >>> 31];
      f5000[(0 | -0) >>> 31] = "This is a utility class and cannot be instantiated";
   }

   private static void m10000() {
      byte[] var128 = new byte[(1 | -1) >>> 31];
      f1000[(0 | -0) >>> 31] = 4;
   }

   private static void m14000() {
      short[] var128 = new short[3];
      f6000[(0 | -0) >>> 31] = 2;
      f6000[(1 | -1) >>> 31] = 3;
      f6000[2] = (short)((0 | -0) >>> 31);
      short[] var129 = new short[6];
      f4000[(0 | -0) >>> 31] = (short)((1 | -1) >>> 31);
      f4000[(1 | -1) >>> 31] = 2;
      f4000[2] = (short)((0 | -0) >>> 31);
      f4000[3] = (short)((1 | -1) >>> 31);
      f4000[4] = 2;
      f4000[5] = 3;
      short[] var130 = new short[8];
      f7000[(0 | -0) >>> 31] = 3;
      f7000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f7000[2] = 3;
      f7000[3] = (short)((1 | -1) >>> 31);
      f7000[4] = (short)((1 | -1) >>> 31);
      f7000[5] = 2;
      f7000[6] = (short)((0 | -0) >>> 31);
      f7000[7] = (short)((1 | -1) >>> 31);
      short[] var131 = new short[2];
      f2000[(0 | -0) >>> 31] = 2;
      f2000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static List<Rec0285> m18000(Consumer<NNF> var0) {
      NNuU var1 = NNuU.Nq();
      if ((Nyl)f3000[f6000[1]] == null) {
         NNS var8 = new NNS();
         f3000[f6000[2]] = var8;
         rw.setting.C0162 var9 = new rw.setting.C0162();
         f3000[f4000[0]] = var9;
         rw.setting.C0162 var10 = new rw.setting.C0162();
         f3000[f4000[1]] = var10;
         Nyl var11 = new Nyl(
            (NNS)f3000[f4000[2]],
            var1.yU(),
            (rw.setting.C0162)f3000[f4000[3]],
            var1.yW(),
            new NNJB(),
            (rw.setting.C0162)f3000[f4000[4]],
            (NNMH)var1.i[f4000[5]]
         );
         f3000[f7000[0]] = var11;
      }

      boolean var13 = false /* VF: Semaphore variable */;

      List var2;
      try {
         var13 = true;
         var0.accept((NNS)f3000[f7000[1]]);
         ((Nyl)f3000[f7000[2]]).N();
         var2 = ((rw.setting.C0162)f3000[f7000[3]]).m40000();
         var13 = false;
      } finally {
         if (var13) {
            ((rw.setting.C0162)f3000[f7000[7]]).m48000();
            ((rw.setting.C0162)f3000[f2000[0]]).m48000();
            ((NNS)f3000[f2000[1]]).N();
         }
      }

      ((rw.setting.C0162)f3000[f7000[4]]).m48000();
      ((rw.setting.C0162)f3000[f7000[5]]).m48000();
      ((NNS)f3000[f7000[6]]).N();
      return var2;
   }

   public static List<Rec0285> m20000(NbK var0, NXi var1, float var2) {
      NNuU var3 = NNuU.Nq();
      NZH var4 = ((NNNQb)var3.B[f6000[0]]).B.N;
      return m18000(var5 -> ((Iface0644)var3.Ng()).m2000(var0, var4, var1.M, var1.B, var1.Z, var2, new NNIo(), var5));
   }
}
