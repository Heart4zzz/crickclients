package rw.core;

import KDFzREm.NNWE;

public class C0950 {
   private static float[] f1000;
   public Object[] f2000;

   public void m2000() {
      long var1 = System.currentTimeMillis();
      float var3 = (float)(var1 - (Long)this.f2000[3]) / f1000[1];
      if (var3 > f1000[2]) {
         long var4 = (long)NNWE.N((Float)this.f2000[2] / var3, f1000[3], (Float)this.f2000[2]);
         ((C0889)this.f2000[1]).m6000(var4);
      }

      Long var10 = var1;
      this.f2000[3] = var10;
      this.m20000();
   }

   public C0950() {
      this.m16000();
      Integer var5 = 20;
      this.f2000[0] = var5;
      C0889 var6 = new C0889((Integer)this.f2000[0]);
      this.f2000[1] = var6;
      Float var7 = f1000[0];
      this.f2000[2] = var7;
      Float var8 = (Float)this.f2000[2];
      this.f2000[5] = var8;
   }

   static {
      ntfClinit();
   }

   private static void m10000() {
      f1000 = new float[]{20.0F, 1000.0F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F};
   }

   private void m16000() {
      this.f2000 = new Object[6];
      this.f2000[0] = 0;
      this.f2000[2] = 0.0F;
      this.f2000[3] = 0L;
      this.f2000[4] = 0L;
      this.f2000[5] = 0.0F;
   }

   public void m20000() {
      long var1 = System.currentTimeMillis();
      if (var1 - (Long)this.f2000[4] >= 4000L) {
         double var3 = ((C0889)this.f2000[1])
            .stream()
            .filter(var0 -> (boolean)(var0 != null && var0 > 0L ? 1 : 0))
            .mapToLong(Long::longValue)
            .average()
            .orElse(((Float)this.f2000[2]).floatValue());
         Float var9 = C1183.m32000((float)var3, f1000[4]);
         this.f2000[5] = var9;
         Long var10 = var1;
         this.f2000[4] = var10;
      }
   }

   public float m24000() {
      return (Float)this.f2000[5];
   }

   public void m30000(float var1) {
      Integer var6 = (int)Math.ceil(var1);
      this.f2000[0] = var6;
      Float var7 = var1;
      this.f2000[2] = var7;
      C0889 var8 = new C0889((Integer)this.f2000[0]);
      this.f2000[1] = var8;
   }

   public void m32000() {
      ((C0889)this.f2000[1]).clear();

      for (int var1 = 0; var1 < this.f2000[0]; var1++) {
         ((C0889)this.f2000[1]).m6000(0L);
      }

      long var10003 = System.currentTimeMillis();
      Long var6 = var10003;
      this.f2000[3] = var6;
      Long var7 = var10003;
      this.f2000[4] = var7;
      this.m20000();
   }
}
