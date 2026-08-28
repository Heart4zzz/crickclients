package rw.core;

public class C0984 extends C0983 {
   private static short[] f1000;

   public C0984(float var1, float var2) {
      super(var1, var2);
   }

   static {
      ntfClinit();
   }

   private static void m4000() {
      short[] var128 = new short[(1 | -1) >>> 31];
      f1000[(0 | -0) >>> 31] = (short)((1 | -1) >>> 31);
   }

   public float m6000() {
      return (Float)this.N[f1000[0]];
   }
}
