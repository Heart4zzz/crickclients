package rw.data;

import KDFzREm.NAN;
import KDFzREm.NAd;
import KDFzREm.NNaI;
import KDFzREm.NNag;
import KDFzREm.NPh;
import java.lang.runtime.ObjectMethods;
import rw.GuiWidget;
import rw.api.Iface0605;

public record Rec0207() implements Iface0605 {
   public GuiWidget f1000;
   private static String[] f2000;

   private static void m2000() {
      f2000 = new String[(1 | -1) >>> 31];
      f2000[(0 | -0) >>> 31] = " ⇨ ";
   }

   public Rec0207(GuiWidget var1) {
      this.f1000 = var1;
   }

   static {
      ntfClinit();
   }

   public boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0207,"module",Rec0207::f1000>(this, var1);
   }

   public GuiWidget m6000() {
      return this.f1000;
   }

   public NNag m8000() {
      NNag var1 = NAN.y(f2000[0]).y(NAd.N.N(NNaI.N(NPh.field_1080)));
      return NAN.y(this.f1000.m42000()).y(var1);
   }
}
