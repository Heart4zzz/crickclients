package rw.core;

import java.util.Map;
import org.lwjgl.opengl.GL11;
import rw.data.Rec0250;

public class C1112 {
   private static float[] f1000;
   public Object[] f2000;

   public float m2000() {
      return (Float)this.f2000[3];
   }

   public C1112(int var1, int var2, int var3, float var4, Map<String, Rec0250> var5) {
      this.m8000();
      Integer var10 = var1;
      this.f2000[0] = var10;
      Integer var11 = var2;
      this.f2000[1] = var11;
      Integer var12 = var3;
      this.f2000[2] = var12;
      Float var13 = var4;
      this.f2000[3] = var13;
      this.f2000[4] = var5;
   }

   static {
      ntfClinit();
   }

   private void m8000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[5];
         Object[] var1 = this.f2000;
         var1[0] = 0;
         var1[1] = 0;
         var1[2] = 0;
         var1[3] = f1000[0];
      }
   }

   public int m12000() {
      return (Integer)this.f2000[2];
   }

   private static void m16000() {
      f1000 = new float[]{0.0F};
   }

   public int m20000() {
      return (Integer)this.f2000[1];
   }

   public int m24000() {
      return (Integer)this.f2000[0];
   }

   public Rec0250 m28000(String var1) {
      return (Rec0250)((Map)this.f2000[4]).get(var1);
   }

   public void m30000() {
      if ((Integer)this.f2000[0] != 0) {
         GL11.glDeleteTextures((Integer)this.f2000[0]);
      }
   }

   public Map<String, Rec0250> m32000() {
      return (Map<String, Rec0250>)this.f2000[4];
   }
}
