package rw.core;

public class C0723 extends RuntimeException {
   private static boolean[] f1000;
   public Object[] f2000;
   private static short[] f3000;

   private static void m2000() {
      boolean[] var128 = new boolean[(1 | -1) >>> 31];
      f1000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
   }

   public C0723(String var1, String var2) {
      super(var2);
      this.m4000();
      this.f2000[f3000[0]] = var1;
   }

   public C0723(String var1, String var2, Throwable var3) {
      super(var2, var3);
      this.m4000();
      this.f2000[f3000[1]] = var1;
   }

   static {
      ntfClinit();
   }

   private void m4000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[f1000[0]];
         Object[] var1 = this.f2000;
      }
   }

   private static void m6000() {
      short[] var128 = new short[3];
      f3000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f3000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f3000[2] = (short)((0 | -0) >>> 31);
   }

   public String m12000() {
      return (String)this.f2000[f3000[2]];
   }
}
