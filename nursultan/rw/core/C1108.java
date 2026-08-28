package rw.core;

import rw.api.Iface0208;
import rw.defs.Enum0027;
import rw.defs.OlmmOsl;
import rw.gui.C0002;
import rw.gui.ZwBs;
import rw.setting.Rec0036;

public class C1108 implements Iface0208 {
   private static float[] f1000;
   public Object[] f2000;

   private boolean m2000(Rec0036 var1) {
      return (boolean)(var1 != null && var1.m2000() == Enum0027.f2000 ? 1 : 0);
   }

   public C1108() {
      this.m10000();
   }

   static {
      ntfClinit();
   }

   private void m10000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[1];
         Object[] var1 = this.f2000;
      }
   }

   private OlmmOsl m16000(Rec0036 var1) {
      return OlmmOsl.m44000(var1.m6000()).orElse((OlmmOsl)OlmmOsl.f7000[3]);
   }

   private float m22000(float var1, float var2) {
      return Math.max(f1000[2], (float)Math.round(var1 * var2));
   }

   public float m24000(String var1, float var2, Rec0036 var3) {
      float var4 = ((C0291)this.f2000[0]).m4000();
      return m28000(var3).m56000(var1, this.m22000(var2, var4), this.m16000(var3), this.m2000(var3)) / var4;
   }

   public float m26000(int var1, float var2, Rec0036 var3) {
      OlmmOsl var4 = this.m16000(var3);
      boolean var5 = this.m2000(var3);
      float var6 = ((C0291)this.f2000[0]).m4000();
      float var7 = this.m22000(var2, var6);

      return switch (var1) {
         case 9 -> Math.round(m28000(var3).m72000(var7, var4, var5, 32) * f1000[1]) / var6;
         case 10, 13 -> f1000[0];
         default -> Math.round(m28000(var3).m72000(var7, var4, var5, var1)) / var6;
      };
   }

   private static ZwBs m28000(Rec0036 var0) {
      ZwBs var1 = C0002.m40000(var0.m8000());
      if (var1 == null) {
         throw new IllegalArgumentException("Unknown font family: " + var0.m8000());
      } else {
         return var1;
      }
   }

   private static void m30000() {
      f1000 = new float[]{0.0F, 4.0F, 1.0F};
   }

   public void m32000(C0291 var1) {
      this.f2000[0] = var1;
   }

   public float m34000(float var1, Rec0036 var2) {
      float var3 = ((C0291)this.f2000[0]).m4000();
      return m28000(var2).m76000(this.m22000(var1, var3), this.m16000(var2), this.m2000(var2)) / var3;
   }

   public float m36000(int var1, int var2, float var3, Rec0036 var4) {
      float var5 = ((C0291)this.f2000[0]).m4000();
      ZwBs var6 = m28000(var4);
      OlmmOsl var7 = this.m16000(var4);
      boolean var8 = this.m2000(var4);
      float var9 = this.m22000(var3, var5);
      float var10 = var6.m72000(var9, var7, var8, var1);
      float var11 = var6.m90000(var9, var7, var8, var1, var2);
      return (Math.round(var10 + var11) - Math.round(var10)) / var5;
   }
}
