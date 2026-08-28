package rw.core;

import java.util.List;
import java.util.Optional;
import org.joml.Vector4f;
import org.joml.Vector4fc;
import rw.data.OltrInps;
import rw.data.Rec0233;

public class C1057 {
   private static short[] f1000;
   public static Object[] f2000;
   private static byte[] f3000;
   private static boolean[] f4000;

   public static void m2000() {
      OltrInps var4 = (OltrInps)f2000[f1000[4]];
      f2000[f1000[5]] = var4;
   }

   private static void m6000() {
      boolean[] var128 = new boolean[4];
      f4000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f4000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f4000[2] = (boolean)((0 | -0) >>> 31);
      f4000[3] = (boolean)((1 | -1) >>> 31);
   }

   private C1057() {
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      short[] var128 = new short[6];
      f1000[(0 | -0) >>> 31] = (short)((1 | -1) >>> 31);
      f1000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      f1000[2] = (short)((1 | -1) >>> 31);
      f1000[3] = (short)((1 | -1) >>> 31);
      f1000[4] = (short)((0 | -0) >>> 31);
      f1000[5] = (short)((1 | -1) >>> 31);
   }

   private static void m10000() {
      byte[] var128 = new byte[(1 | -1) >>> 31];
      f3000[(0 | -0) >>> 31] = 2;
   }

   public static Optional<Rec0233> m14000() {
      return ((OltrInps)f2000[f1000[1]]).m2000();
   }

   public static OltrInps m18000() {
      return (OltrInps)f2000[f1000[0]];
   }

   public static void m20000(List<Vector4f> var0, List<Vector4f> var1, Rec0233 var2, Rec0233 var3) {
      int var4 = Math.min(var0.size(), var1.size());
      Vector4f[] var5 = new Vector4f[var4];
      Vector4f[] var6 = new Vector4f[var4];

      for (int var7 = f4000[0]; var7 < var4; var7++) {
         var5[var7] = new Vector4f((Vector4fc)var0.get(var7));
         var6[var7] = new Vector4f((Vector4fc)var1.get(var7));
      }

      OltrInps var12 = new OltrInps(List.of(var5), List.of(var6), Optional.ofNullable(var2), Optional.ofNullable(var3));
      f2000[f1000[3]] = var12;
   }

   public static Optional<Rec0233> m24000() {
      return ((OltrInps)f2000[f1000[2]]).m8000();
   }

   private static void m26000() {
      f2000 = new Object[f3000[1]];
   }
}
