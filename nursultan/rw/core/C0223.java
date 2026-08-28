package rw.core;

import KDFzREm.NHn;
import KDFzREm.NNNEB;
import KDFzREm.NRd;
import rw.data.Rec0162;

class C0223 extends NNNEB<T> {
   private NRd m2000(NRd var1) {
      return NNNEB.G;
   }

   C0223(NHn var1, int var2) {
      super(var1, var2);
   }

   private NRd m4000(NRd var1) {
      return NNNEB.l;
   }

   private NRd m6000(NRd var1) {
      return NNNEB.t;
   }

   private NRd m8000(NRd var1) {
      return NNNEB.n;
   }

   public NRd m10000(int var1) {
      return (NRd)(switch (var1) {
         case 0 -> NNNEB.L;
         case 1, 2, 3, 4 -> this.m12000(NNNEB.M, var1);
         case 5 -> this.m8000(NNNEB.B);
         case 6 -> this.m6000(NNNEB.Z);
         case 7 -> this.m2000(NNNEB.z);
         case 8 -> this.m4000(NNNEB.U);
         default -> new Rec0162(this.E, var1);
      });
   }

   private NRd m12000(NRd var1, int var2) {
      return var2 != 3 && var2 != 4 ? var1 : NNNEB.v;
   }
}
