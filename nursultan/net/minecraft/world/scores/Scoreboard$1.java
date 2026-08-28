package net.minecraft.world.scores;

import KDFzREm.NAN;
import KDFzREm.NCQ;
import KDFzREm.NCs;
import KDFzREm.NNNDF;
import KDFzREm.NNNDI;
import KDFzREm.NNNDJ;
import KDFzREm.NSy;
import java.util.Objects;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.jspecify.annotations.Nullable;

class Scoreboard$1 implements NNNDI {
   public boolean val$objective() {
      return this.N.L();
   }

   Scoreboard$1(NSy var1, NCQ var2, boolean var3, MutableBoolean var4, NCs var5, NNNDJ var6) {
      this.R = var1;
      this.N = var2;
      this.val$canModify = var3;
      this.val$requiresSync = var4;
      this.u = var5;
      this.i = var6;
   }

   private void B() {
      this.R.N(this.i, this.u, this.N);
      this.val$requiresSync.setFalse();
   }

   public void i() {
      this.numberFormatOverride(true);
   }

   public void u() {
      this.numberFormatOverride(false);
   }

   @Nullable
   public NAN y() {
      return this.N.u();
   }

   public void N(@Nullable NNNDF var1) {
      this.N.N(var1);
      this.B();
   }

   private void numberFormatOverride(boolean var1) {
      this.N.N(var1);
      if (this.val$requiresSync.isTrue()) {
         this.B();
      }

      this.R.u(this.i, this.u);
   }

   public void N(@Nullable NAN var1) {
      if (this.val$requiresSync.isTrue() || !Objects.equals(var1, this.N.u())) {
         this.N.N(var1);
         this.B();
      }
   }

   public void numberFormatOverride(int var1) {
      if (!this.val$canModify) {
         throw new IllegalStateException("Cannot modify read-only score");
      } else {
         boolean var2 = this.val$requiresSync.isTrue();
         if (this.u.R()) {
            NAN var3 = this.i.method_5476();
            if (var3 != null && !var3.equals(this.N.u())) {
               this.N.N(var3);
               var2 = true;
            }
         }

         if (var1 != this.N.y()) {
            this.N.N(var1);
            var2 = true;
         }

         if (var2) {
            this.B();
         }
      }
   }

   public int numberFormatOverride() {
      return this.N.y();
   }
}
