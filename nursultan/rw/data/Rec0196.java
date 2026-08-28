package rw.data;

import java.util.Objects;
import java.util.UUID;
import rw.api.Iface0640;
import rw.defs.Enum0002;

public non-sealed record Rec0196() implements Iface0640 {
   public UUID f1000;
   private static byte[] f2000;
   private static boolean[] f3000;
   private static short[] f4000;
   public byte[] f5000;
   public String f6000;
   public boolean f7000;

   public UUID m4000() {
      return this.f1000;
   }

   private static void m6000() {
      byte[] var128 = new byte[(1 | -1) >>> 31];
      f2000[(0 | -0) >>> 31] = 2;
   }

   public Rec0196(boolean var1, UUID var2, String var3, byte[] var4) {
      this.f7000 = var1;
      this.f1000 = var2;
      this.f6000 = var3;
      this.f5000 = (byte[])var4.clone();
   }

   static {
      ntfClinit();
   }

   public boolean m8000(Object var1) {
      if (this == var1) {
         return f3000[0];
      } else {
         return var1 instanceof Rec0196 var2 && Objects.equals(this.f1000, var2.f1000) && Objects.equals(this.f6000, var2.f6000) ? f3000[1] : f3000[2];
      }
   }

   @Override
   public int hashCode() {
      Object[] var10000 = new Object[f2000[0]];
      var10000[f3000[3]] = this.f1000;
      var10000[f3000[4]] = this.f6000;
      return Objects.hash(var10000);
   }

   private static void m10000() {
      short[] var128 = new short[(1 | -1) >>> 31];
      f4000[(0 | -0) >>> 31] = 2;
   }

   private static void m12000() {
      boolean[] var128 = new boolean[5];
      f3000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f3000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f3000[2] = (boolean)((0 | -0) >>> 31);
      f3000[3] = (boolean)((0 | -0) >>> 31);
      f3000[4] = (boolean)((1 | -1) >>> 31);
   }

   public boolean m14000() {
      return this.f7000;
   }

   public String m16000() {
      return this.f6000;
   }

   public UUID m18000() {
      return this.f1000;
   }

   public Enum0002 m22000() {
      return (Enum0002)Enum0002.f3000[f4000[0]];
   }

   public byte[] m26000() {
      return (byte[])this.f5000.clone();
   }
}
