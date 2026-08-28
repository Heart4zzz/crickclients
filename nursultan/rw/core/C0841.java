package rw.core;

import KDFzREm.NNNYO;
import KDFzREm.NNuU;
import KDFzREm.NbK;
import KDFzREm.Nwn;
import rw.gui.GuiElement;
import rw.setting.PublicBukkitValues;

public class C0841 extends PublicBukkitValues {
   private static short[] f1000;
   private static int[] f2000;

   private static void m2000() {
      f2000 = new int[]{-1442182646};
   }

   public C0841(GuiElement var1, String var2, boolean var3) {
      super(var1, var2, var3);
   }

   static {
      ntfClinit();
   }

   public int m10000(Nwn var1) {
      return f2000[0];
   }

   public boolean m12000(NbK var1) {
      return C1140.m36000().and(var0 -> ((NNNYO)NNuU.Nq().i[f1000[0]]).s().z()).test(var1);
   }

   private static void m14000() {
      f1000 = new short[]{5};
   }
}
