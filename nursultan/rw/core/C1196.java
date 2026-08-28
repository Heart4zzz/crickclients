package rw.core;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import net.minecraft.client.sounds.LoopingAudioStream$AudioStreamProvider;
import rw.data.Rec0283;

public class C1196 {
   private static byte[] f1000;
   private static boolean[] f2000;
   public static Object[] f3000;
   public Object[] f4000;
   private static short[] f5000;

   private void m2000() {
      this.f4000 = new Object[f1000[7]];
   }

   public C1196() {
      this.m2000();
      C1191 var5 = new C1191();
      this.f4000[f5000[0]] = var5;
      C0972 var6 = new C0972();
      this.f4000[f5000[1]] = var6;
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      f3000 = new Object[f2000[6]];
   }

   private static void m10000() {
      boolean[] var128 = new boolean[7];
      f2000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f2000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f2000[2] = (boolean)((0 | -0) >>> 31);
      f2000[3] = (boolean)((0 | -0) >>> 31);
      f2000[4] = (boolean)((1 | -1) >>> 31);
      f2000[5] = (boolean)((0 | -0) >>> 31);
      f2000[6] = (boolean)((1 | -1) >>> 31);
   }

   private static void m14000() {
      byte[] var128 = new byte[8];
      f1000[(0 | -0) >>> 31] = 4;
      f1000[(1 | -1) >>> 31] = 79;
      f1000[2] = 103;
      f1000[3] = 2;
      f1000[4] = 103;
      f1000[5] = 3;
      f1000[6] = 83;
      f1000[7] = 2;
   }

   public Rec0283 m18000(InputStream var1) throws Exception {
      BufferedInputStream var2 = var1 instanceof BufferedInputStream var3 ? var3 : new BufferedInputStream(var1);
      return II0s0imr<"kchnghlo",1547265113,1852394214,1852394208,1852394217,577211039,-732689710,2015907612>(
         this.m24000(var2) ? (LoopingAudioStream$AudioStreamProvider)this.f4000[f5000[2]] : (LoopingAudioStream$AudioStreamProvider)this.f4000[f5000[3]], var2
      );
   }

   private static void m20000() {
      short[] var128 = new short[8];
      f5000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f5000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      f5000[2] = (short)((0 | -0) >>> 31);
      f5000[3] = (short)((1 | -1) >>> 31);
      f5000[4] = (short)((0 | -0) >>> 31);
      f5000[5] = (short)((0 | -0) >>> 31);
      f5000[6] = (short)((0 | -0) >>> 31);
      f5000[7] = (short)((0 | -0) >>> 31);
   }

   private boolean m24000(BufferedInputStream var1) throws IOException {
      var1.mark(((byte[])f3000[f5000[4]]).length);
      byte[] var2 = new byte[((byte[])f3000[f5000[5]]).length];
      int var3 = var1.readNBytes(var2, f2000[0], var2.length);
      var1.reset();
      return var3 == ((byte[])f3000[f5000[6]]).length && Arrays.equals(var2, (byte[])f3000[f5000[7]]) ? f2000[1] : f2000[2];
   }
}
