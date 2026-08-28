package rw.core;

import KDFzREm.NAC;
import KDFzREm.NCF;
import KDFzREm.NNNNLG;
import KDFzREm.NqL;
import KDFzREm.Nqi;
import KDFzREm.Nwn;
import java.util.Collection;
import org.jspecify.annotations.Nullable;

public class C0651 {
   public final Nwn f1000;
   private boolean f2000;
   private int f3000;
   private int f4000;
   private int f5000;
   private int f6000;
   private boolean f7000;
   private int f8000;
   public int f9000;

   C0651(NqL var1, Nwn var2) {
      this.f10000 = var1;
      this.f2000 = true;
      this.f5000 = 127;
      this.f6000 = 127;
      this.f7000 = true;
      this.f1000 = var2;
   }

   private void m2000() {
      this.f7000 = true;
   }

   private Nqi m4000() {
      int var1 = this.f3000;
      int var2 = this.f4000;
      int var3 = this.f5000 + 1 - this.f3000;
      int var4 = this.f6000 + 1 - this.f4000;
      byte[] var5 = new byte[var3 * var4];

      for (int var6 = 0; var6 < var3; var6++) {
         for (int var7 = 0; var7 < var4; var7++) {
            var5[var6 + var7 * var3] = this.f10000.B[var1 + var6 + (var2 + var7) * 128];
         }
      }

      return new Nqi(var1, var2, var3, var4, var5);
   }

   void m6000(int var1, int var2) {
      if (this.f2000) {
         this.f3000 = Math.min(this.f3000, var1);
         this.f4000 = Math.min(this.f4000, var2);
         this.f5000 = Math.max(this.f5000, var1);
         this.f6000 = Math.max(this.f6000, var2);
      } else {
         this.f2000 = true;
         this.f3000 = var1;
         this.f4000 = var2;
         this.f5000 = var1;
         this.f6000 = var2;
      }
   }

   @Nullable
   NAC<?> m8000(NNNNLG var1) {
      Nqi var2;
      if (this.f2000) {
         this.f2000 = false;
         var2 = this.m4000();
      } else {
         var2 = null;
      }

      Collection var3;
      if (this.f7000 && this.f8000++ % 5 == 0) {
         this.f7000 = false;
         var3 = this.f10000.z.values();
      } else {
         var3 = null;
      }

      return var3 == null && var2 == null ? null : new NCF(var1, this.f10000.M, this.f10000.Z, var3, var2);
   }
}
