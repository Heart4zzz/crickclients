package rw.core;

import KDFzREm.NbK;
import KDFzREm.Nws;
import rw.gui.Friends;

public class C0736 extends rw.setting.C0083<Nws> {
   public C0736(Friends var1, String var2, boolean var3) {
      super(var1, var2, var3);
   }

   static {
      ntfClinit();
   }

   public boolean m4000(NbK var1) {
      return C1140.m56000().and(C1140.m50000()).test(var1);
   }
}
