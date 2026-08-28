package net.minecraft.core;

import KDFzREm.Ned;
import KDFzREm.Neo;
import com.google.common.collect.AbstractIterator;

class BlockPos$3 extends AbstractIterator<Ned> {
   private final Neo B;
   private int Z;
   private int z;
   private int U;
   private int E;
   private int W;
   private boolean zMirror;

   BlockPos$3(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.N = var1;
      this.y = var2;
      this.L = var3;
      this.u = var4;
      this.i = var5;
      this.R = var6;
      this.M = var7;
      this.B = new Neo();
   }

   protected Ned N() {
      if (this.zMirror) {
         this.zMirror = false;
         this.B.L(this.N - (this.B.method_10260() - this.N));
         return this.B;
      } else {
         Neo var1;
         for (var1 = null; var1 == null; this.W++) {
            if (this.W > this.U) {
               this.E++;
               if (this.E > this.z) {
                  this.Z++;
                  if (this.Z > this.y) {
                     return (Ned)this.endOfData();
                  }

                  this.z = Math.min(this.L, this.Z);
                  this.E = -this.z;
               }

               this.U = Math.min(this.u, this.Z - Math.abs(this.E));
               this.W = -this.U;
            }

            int var2 = this.E;
            int var3 = this.W;
            int var4 = this.Z - Math.abs(var2) - Math.abs(var3);
            if (var4 <= this.i) {
               this.zMirror = var4 != 0;
               var1 = this.B.N(this.R + var2, this.M + var3, this.N + var4);
            }
         }

         return var1;
      }
   }
}
