package rw.core;

import java.util.AbstractList;
import java.util.NoSuchElementException;
import org.joml.Vector4f;
import org.joml.Vector4fc;

public class C1128 extends AbstractList<Vector4f> {
   public Object[] f1000;

   public C1128(int var1) {
      this.m12000();
      Vector4f[] var7 = new Vector4f[var1];
      this.f1000[0] = var7;

      for (int var2 = 0; var2 < var1; var2++) {
         ((Vector4f[])this.f1000[0])[var2] = new Vector4f();
      }
   }

   static {
      ntfClinit();
   }

   public int m6000() {
      return (Integer)this.f1000[1];
   }

   public void m10000() {
      Integer var5 = 0;
      this.f1000[1] = var5;
   }

   private void m12000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[2];
         Object[] var1 = this.f1000;
         var1[1] = 0;
      }
   }

   public Vector4f m22000() {
      if ((Integer)this.f1000[1] == 0) {
         throw new NoSuchElementException();
      } else {
         Integer var5 = (Integer)this.f1000[1] - 1;
         this.f1000[1] = var5;
         return ((Vector4f[])this.f1000[0])[this.f1000[1]];
      }
   }

   public Vector4f m24000(int var1) {
      return ((Vector4f[])this.f1000[0])[var1];
   }

   public void m26000(Vector4fc var1) {
      if ((Integer)this.f1000[1] == ((Vector4f[])this.f1000[0]).length) {
         Vector4f[] var2 = new Vector4f[((Vector4f[])this.f1000[0]).length * 2];
         System.arraycopy((Vector4f[])this.f1000[0], 0, var2, 0, ((Vector4f[])this.f1000[0]).length);

         for (int var3 = ((Vector4f[])this.f1000[0]).length; var3 < var2.length; var3++) {
            var2[var3] = new Vector4f();
         }

         this.f1000[0] = var2;
      }

      ((Vector4f[])this.f1000[0])[this.f1000[1]].set(var1);
      Integer var9 = (Integer)this.f1000[1] + 1;
      this.f1000[1] = var9;
   }
}
