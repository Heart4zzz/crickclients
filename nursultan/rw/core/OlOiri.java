package rw.core;

import rw.data.Rec0004;

public class OlOiri {
   public Object[] f1000;

   private void m2000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[3];
         Object[] var1 = this.f1000;
         var1[1] = 0;
         var1[2] = 0;
      }
   }

   public OlOiri() {
      this.m2000();
   }

   static {
      ntfClinit();
   }

   @Override
   public String toString() {
      return "Mesh.MeshBuilder(format="
         + (Rec0004)this.f1000[0]
         + ", initialVertexBytes="
         + (Integer)this.f1000[1]
         + ", initialIndices="
         + (Integer)this.f1000[2]
         + ")";
   }

   public OlOiri m14000(int var1) {
      Integer var6 = var1;
      this.f1000[2] = var6;
      return this;
   }

   public OlOiri m18000(Rec0004 var1) {
      this.f1000[0] = var1;
      return this;
   }

   public C0830 m20000() {
      return new C0830((Rec0004)this.f1000[0], (Integer)this.f1000[1], (Integer)this.f1000[2]);
   }

   public OlOiri m22000(int var1) {
      Integer var6 = var1;
      this.f1000[1] = var6;
      return this;
   }
}
