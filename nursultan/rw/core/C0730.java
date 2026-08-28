package rw.core;

import KDFzREm.NbK;
import KDFzREm.Nbr;
import rw.gui.Friends;

public class C0730 extends rw.setting.C0083<Nbr> {
   public C0730(Friends var1, String var2, boolean var3) {
      super(var1, var2, var3);
   }

   static {
      ntfClinit();
   }

   public boolean m4000(NbK var1) {
      return C1140.m4000().and(C1140.m50000()).test(var1);
   }
}
