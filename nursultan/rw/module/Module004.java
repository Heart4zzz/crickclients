package rw.module;

import baritone.command.argument.ArgConsumer;
import rw.Module;

public class Module004 extends Module {
   public Object[] f1000;
   private static short[] f2000;
   private static boolean[] f3000;
   private static byte[] f4000;
   public static Object[] f5000;

   public ArgConsumer m4000() {
      this.m8000();
      return (ArgConsumer)this.f1000[f2000[6]];
   }

   private static void m6000() {
      f5000 = new Object[f3000[1]];
   }

   public Module004() {
      this.m8000();
   }

   static {
      ntfClinit();
   }

   private void m8000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[f4000[0]];
         Object[] var1 = this.f1000;
      }
   }

   private static void m10000() {
      byte[] var128 = new byte[(1 | -1) >>> 31];
      f4000[(0 | -0) >>> 31] = 2;
   }

   private static void m2000() {
      boolean[] var128 = new boolean[2];
      f3000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f3000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
   }

   public String m14000() {
      this.m8000();
      return (String)this.f1000[f2000[5]];
   }

   public static Module004 m16000(String var0, ArgConsumer var1) {
      ((Module004)f5000[f2000[0]]).f1000[f2000[1]] = var0;
      ((Module004)f5000[f2000[2]]).f1000[f2000[3]] = var1;
      return (Module004)f5000[f2000[4]];
   }

   private static void m18000() {
      short[] var128 = new short[7];
      f2000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f2000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f2000[2] = (short)((0 | -0) >>> 31);
      f2000[3] = (short)((1 | -1) >>> 31);
      f2000[4] = (short)((0 | -0) >>> 31);
      f2000[5] = (short)((0 | -0) >>> 31);
      f2000[6] = (short)((1 | -1) >>> 31);
   }
}
