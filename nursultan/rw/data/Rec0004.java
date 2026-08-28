package rw.data;

import java.lang.runtime.ObjectMethods;
import org.lwjgl.opengl.GL33;

public record Rec0004() {
   public Rec0002[] f1000;

   public int m2000() {
      int var1 = 0;

      for (Rec0002 var5 : this.f1000) {
         var1 += var5.m30000();
      }

      return var1;
   }

   public Rec0004(Rec0002... var1) {
      this.f1000 = var1;
   }

   static {
      ntfClinit();
   }

   public boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0004,"attrs",Rec0004::f1000>(this, var1);
   }

   public void m10000() {
      int var1 = this.m2000();
      int var2 = 0;

      for (int var3 = 0; var3 < this.f1000.length; var3++) {
         Rec0002 var4 = this.f1000[var3];
         GL33.glEnableVertexAttribArray(var3);
         if (var4.m16000() != 5124 && var4.m16000() != 5125) {
            GL33.glVertexAttribPointer(var3, var4.m22000(), var4.m16000(), var4.m2000(), var1, var2);
         } else {
            GL33.glVertexAttribIPointer(var3, var4.m22000(), var4.m16000(), var1, var2);
         }

         if (var4.m6000() != 0) {
            GL33.glVertexAttribDivisor(var3, var4.m6000());
         }

         var2 += var4.m30000();
      }
   }

   public Rec0002[] m14000() {
      return this.f1000;
   }
}
