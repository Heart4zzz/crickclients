package rw.core;

import KDFzREm.NNag;
import KDFzREm.NPh;
import KDFzREm.NbK;
import KDFzREm.Nwn;
import rw.gui.GuiElement;
import rw.setting.PublicBukkitValues;

public class C0726 extends PublicBukkitValues {
   private static int[] f1000;

   public C0726(GuiElement var1, String var2, boolean var3) {
      super(var1, var2, var3);
   }

   static {
      ntfClinit();
   }

   public NNag m8000(Nwn var1) {
      return super.m16000(var1).i(NPh.field_1080 + " [" + NPh.field_1060 + "F" + NPh.field_1080 + "]" + NPh.field_1070);
   }

   private static void m12000() {
      f1000 = new int[]{-1442807808};
   }

   public int m14000(Nwn var1) {
      return f1000[0];
   }

   @Override
   public boolean m16000(NbK var1) {
      return C1140.m42000().or(C1140.m28000()).and(C1140.m36000().negate()).and(C1140.m50000()).test(var1);
   }
}
