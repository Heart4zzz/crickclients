package rw.core;

import KDFzREm.NHn;
import KDFzREm.NNNEB;
import KDFzREm.NRd;
import rw.data.Rec0162;

class C0227 extends NNNEB<T> {
   C0227(NHn var1, int var2) {
      super(var1, var2);
   }

   public NRd m2000(int var1) {
      return (NRd)(switch (var1) {
         case 0 -> NNNEB.L;
         case 1 -> NNNEB.u;
         case 2 -> NNNEB.i;
         case 3 -> this.m4000(NNNEB.R);
         default -> new Rec0162(this.E, var1);
      });
   }

   private NRd m4000(NRd var1) {
      return NNNEB.j;
   }
}
