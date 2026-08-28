package rw.core;

import KDFzREm.NNBK;
import KDFzREm.NNag;
import KDFzREm.NbK;
import org.joml.Vector4f;
import rw.defs.OlmmOsl;
import rw.gui.GuiElement;
import rw.gui.ZwBs;

public abstract class Base0748<T extends NbK> extends Base1156 {
   public Object[] f1000;
   private static float[] f2000;
   private static float[] f3000;
   private static float[] f4000;
   private static float[] f5000;
   private static float[] f6000;
   private static float[] f7000;
   private static float[] f8000;

   public NNag m2000(T var1) {
      return var1.method_5476().L();
   }

   private void m4000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[1];
         Object[] var1 = this.f1000;
      }
   }

   public void m8000(NNBK var1, ZwBs var2, Vector4f var3, T var4) {
   }

   public Base0748(GuiElement var1, String var2, boolean var3) {
      super(var2, var3);
      this.m4000();
      this.f1000[0] = var1;
   }

   static {
      ntfClinit();
   }

   private static void m12000() {
      f2000 = new float[]{4.0F, 4.0F, 0.5F, 2.0F, 1.0F};
      f7000 = new float[]{1.0F, 1.0F, 3.0F, 2.0F, 1.0F, 1.0F};
      f4000 = new float[]{3.0F, 2.0F, 2.0F, 1.0F};
      f3000 = new float[]{3.0F, 3.0F, 2.0F, 2.0F, 3.0F};
      f8000 = new float[]{3.0F, 1.0F};
      f5000 = new float[]{1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F};
      f6000 = new float[]{1.0F, 1.0F, 4.0F, 4.0F};
   }

   public int m20000(T var1) {
      return -1442182646;
   }

   public int m22000(T var1) {
      return -1;
   }

   public void m26000(NNBK var1, ZwBs var2, Vector4f var3, T var4) {
   }

   public void m28000(NNBK var1, ZwBs var2, Vector4f var3, T var4) {
      this.m36000(var1, var2, var3, (T)var4, this.m2000((T)var4), this.m22000((T)var4), this.m20000((T)var4));
   }

   public void m32000(NNBK var1, ZwBs var2, Vector4f var3, T var4, int var5) {
      this.m4000();
      float var6 = var3.x;
      float var7 = var3.y;
      float var8 = var3.z - var6;
      float var9 = var3.w - var7;
      int var10 = -1291187702;
      float var11 = f2000[4];
      C0805 var12 = (C0805)C0814.f15000[3];
      C0806.m36000(var12.m18000(), var6 - f7000[0], var7 - f7000[1], f7000[2], var9 + f7000[3], var10);
      C0806.m36000(var12.m18000(), var6 - f7000[4] + var8, var7 - f7000[5], f4000[0], var9 + f4000[1], var10);
      C0806.m36000(var12.m18000(), var6 + f4000[2], var7 - f4000[3], var8 - f3000[0], f3000[1], var10);
      C0806.m36000(var12.m18000(), var6 + f3000[2], var7 - f3000[3] + var9, var8 - f3000[4], f8000[0], var10);
      C0806.m36000(var12.m18000(), var6, var7, f8000[1], var9, var5);
      C0806.m36000(var12.m18000(), var6 + var8, var7, f5000[0], var9, var5);
      C0806.m36000(var12.m18000(), var6 + f5000[1], var7, var8 - f5000[2], f5000[3], var5);
      C0806.m36000(var12.m18000(), var6 + f5000[4], var7 + var9 - f5000[5], var8 - f6000[0], f6000[1], var5);
      float var13 = (Float)((GuiElement)this.f1000[0]).m44000().i();
      float var14 = (var13 - f6000[2]) / f6000[3];
      var3.y = Math.round(var3.y - var14);
   }

   public void m34000(NNBK var1, ZwBs var2, Vector4f var3, T var4, int var5, int var6) {
   }

   public void m36000(NNBK var1, ZwBs var2, Vector4f var3, T var4, NNag var5, int var6, int var7) {
      this.m4000();
      float var8 = (Float)((GuiElement)this.f1000[0]).m44000().i();
      float var9 = (var8 - f2000[0]) / f2000[1];
      float var10 = var2.m76000(var8, (OlmmOsl)OlmmOsl.f7000[3], false) + var9;
      var3.y -= var10;
      float var11 = var3.x();
      float var12 = var3.y();
      float var13 = var3.z();
      float var14 = var11 + (var13 - var11) * f2000[2];
      float var15 = var2.m64000(var5, var8, (OlmmOsl)OlmmOsl.f7000[3], false);
      float var16 = var14 - var15 / f2000[3];
      var2.m54000(var5).m86000(var16, var12).m102000(var8).m50000(var7).m40000(var9).m98000((OlmmOsl)OlmmOsl.f7000[3]).m28000(var6).m4000();
   }
}
