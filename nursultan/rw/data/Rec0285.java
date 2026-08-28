package rw.data;

import com.mojang.blaze3d.textures.GpuTextureView;
import java.lang.runtime.ObjectMethods;

public record Rec0285() {
   public float[] f1000;
   public int[] f2000;
   public float[] f3000;
   public int[] f4000;
   public float[] f5000;
   public GpuTextureView f6000;
   public float[] f7000;

   public int[] m2000() {
      return this.f4000;
   }

   public float[] m4000() {
      return this.f3000;
   }

   public Rec0285(GpuTextureView var1, float[] var2, float[] var3, int[] var4, float[] var5, float[] var6, int[] var7) {
      this.f6000 = var1;
      this.f3000 = var2;
      this.f5000 = var3;
      this.f4000 = var4;
      this.f1000 = var5;
      this.f7000 = var6;
      this.f2000 = var7;
   }

   static {
      ntfClinit();
   }

   public boolean m6000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0285,"texture;positions;uvs;colors;lights;normals;indices",Rec0285::f6000,Rec0285::f3000,Rec0285::f5000,Rec0285::f4000,Rec0285::f1000,Rec0285::f7000,Rec0285::f2000>(
         this, var1
      );
   }

   public GpuTextureView m8000() {
      return this.f6000;
   }

   public float[] m10000() {
      return this.f5000;
   }

   public int[] m12000() {
      return this.f2000;
   }

   public float[] m14000() {
      return this.f1000;
   }

   public float[] m18000() {
      return this.f7000;
   }
}
