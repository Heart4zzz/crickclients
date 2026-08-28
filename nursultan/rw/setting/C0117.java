package rw.setting;

import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import rw.GuiWidget;
import rw.NursultanClient;
import rw.core.Base1148;
import rw.core.C0925;
import rw.core.C1235;
import rw.data.Rec0267;
import rw.data.Rec0280;
import rw.gui.C0110;

public class C0117 extends Base1148<C0110> {
   public static Object[] f1000;
   private static String[] f2000;
   public Object[] f3000;

   private static void m2000() {
      f2000 = new String[]{"module-enabled", "module-disabled"};
   }

   public C0117(C0110 var1, String var2, boolean var3) {
      super(var1, var2, var3);
      this.m22000();
      Object2IntOpenHashMap var8 = new Object2IntOpenHashMap();
      this.f3000[0] = var8;
   }

   static {
      ntfClinit();
   }

   public void m18000(Object var1) {
      this.m22000();
      if (var1 instanceof C0925 var2) {
         GuiWidget var3 = var2.m16000();
         if (!var3.m54000().m54000()) {
            return;
         }

         String var4 = C1235.m36000(var3.m30000() ? f2000[0] : f2000[1]).formatted(var3.m2000());
         int var5 = NursultanClient.m70000()
            .m40000(
               ((Object2IntMap)this.f3000[0]).getInt(var3),
               var2x -> var2x.m48000(new Rec0280(var3::m30000)).m34000(new Rec0267(var4)),
               var2x -> var2x.m26000().m46000(new Rec0280(var3::m30000)).m34000(new Rec0267(var4)).m38000(3000L)
            );
         ((Object2IntMap)this.f3000[0]).put(var3, var5);
      }
   }

   private void m22000() {
      if (this.f3000 == null) {
         this.f3000 = new Object[1];
         Object[] var1 = this.f3000;
      }
   }

   private static void m34000() {
      f1000 = new Object[]{3000L};
   }
}
