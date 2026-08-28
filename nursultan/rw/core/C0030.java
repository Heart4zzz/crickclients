package rw.core;

import java.util.function.BooleanSupplier;
import java.util.function.IntSupplier;
import rw.defs.Enum0061;
import rw.defs.Enum0062;
import rw.defs.Enum0063;

public class C0030 {
   private static short[] f1000;
   private static short[] f2000;
   private static short[] f3000;
   public Object[] f4000;
   public Object[] f5000;
   private static short[] f6000;
   private static short[] f7000;
   private static short[] f8000;
   private static short[] f9000;
   public Object[] f10000;

   public C0030 m2000(boolean var1) {
      Boolean var6 = var1;
      this.f10000[1] = var6;
      return this;
   }

   public C0030 m6000(Enum0061 var1) {
      this.f5000[0] = var1;
      return this;
   }

   public C0030() {
      this.m10000();
   }

   static {
      ntfClinit();
   }

   @Override
   public String toString() {
      return "FbConfig.Builder(widthSupplier="
         + (IntSupplier)this.f4000[0]
         + ", heightSupplier="
         + (IntSupplier)this.f4000[1]
         + ", pixelFormat="
         + (Enum0062)this.f10000[0]
         + ", useDepth="
         + (Boolean)this.f10000[1]
         + ", minFilter="
         + (Enum0063)this.f10000[2]
         + ", magFilter="
         + (Enum0063)this.f10000[3]
         + ", wrapS="
         + (Enum0061)this.f5000[0]
         + ", wrapT="
         + (Enum0061)this.f5000[1]
         + ", mipmapped="
         + (Boolean)this.f5000[2]
         + ", label="
         + (String)this.f5000[3]
         + ", textureDeleteBlocked="
         + (BooleanSupplier)this.f5000[4]
         + ")";
   }

   private void m10000() {
      if (this.f4000 == null) {
         this.f4000 = new Object[2];
         Object[] var1 = this.f4000;
      }

      if (this.f10000 == null) {
         this.f10000 = new Object[4];
         Object[] var2 = this.f10000;
         var2[1] = false;
      }

      if (this.f5000 == null) {
         this.f5000 = new Object[5];
         Object[] var3 = this.f5000;
         var3[2] = false;
      }
   }

   public C0030 m14000(Enum0063 var1) {
      this.f10000[3] = var1;
      return this;
   }

   private static void m18000() {
      f9000 = new short[]{0, 0, 1};
      f7000 = new short[]{0, 1, 2};
      f1000 = new short[]{3, 0, 1, 2, 3, 4, 0};
      f6000 = new short[]{1, 0};
      f2000 = new short[]{1, 2, 3, 0, 1};
      f3000 = new short[]{2, 3, 4, 0, 1, 0, 1, 2};
      f8000 = new short[]{3, 0, 1, 2, 3, 4};
   }

   public C0030 m20000(Enum0062 var1) {
      this.f10000[f9000[0]] = var1;
      return this;
   }

   public C0030 m22000(boolean var1) {
      return this.m2000(var1);
   }

   public C0030 m24000(IntSupplier var1) {
      this.f4000[f9000[2]] = var1;
      return this;
   }

   public C0030 m26000(Enum0061 var1) {
      return this.m46000(var1, var1);
   }

   public C0030 m28000(Enum0061 var1) {
      this.f5000[1] = var1;
      return this;
   }

   public C0030 m32000(Enum0063 var1) {
      this.f10000[2] = var1;
      return this;
   }

   public C0030 m34000(String var1) {
      this.f5000[3] = var1;
      return this;
   }

   public C0030 m36000(boolean var1) {
      Boolean var6 = var1;
      this.f5000[2] = var6;
      return this;
   }

   public C0030 m38000(IntSupplier var1) {
      this.f4000[f9000[1]] = var1;
      return this;
   }

   public C0012 m40000() {
      return new C0012(
         (IntSupplier)this.f4000[0],
         (IntSupplier)this.f4000[1],
         (Enum0062)this.f10000[0],
         (Boolean)this.f10000[1],
         (Enum0063)this.f10000[2],
         (Enum0063)this.f10000[3],
         (Enum0061)this.f5000[0],
         (Enum0061)this.f5000[1],
         (Boolean)this.f5000[2],
         (String)this.f5000[3],
         (BooleanSupplier)this.f5000[4]
      );
   }

   public C0030 m42000(BooleanSupplier var1) {
      this.f5000[4] = var1;
      return this;
   }

   public C0030 m44000(Enum0063 var1, Enum0063 var2) {
      return this.m32000(var1).m14000(var2);
   }

   public C0030 m46000(Enum0061 var1, Enum0061 var2) {
      return this.m6000(var1).m28000(var2);
   }

   public C0030 m48000(Enum0062 var1) {
      this.f10000[0] = var1;
      return this;
   }
}
