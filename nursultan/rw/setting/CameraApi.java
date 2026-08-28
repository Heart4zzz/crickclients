package rw.setting;

import java.util.List;
import rw.api.Iface0648;
import rw.core.Base0995;
import rw.core.Base1148;
import rw.core.C1003;
import rw.core.C1092;
import rw.core.CameraApiPart;
import rw.core.CameraApiPart3;
import rw.core.CameraPartPart;
import rw.core.OltqItr;
import rw.gui.Camera;

public class CameraApi extends Base1148<Camera> implements Iface0648<Camera> {
   private static String[] f1000;
   public Object[] f2000;

   public CameraApi(Camera var1, CameraPartPart var2, OltqItr var3, String var4, boolean var5) {
      super(var1, var4, var5);
      this.m32000();
      this.f2000[1] = var2;
      this.f2000[2] = var3;
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      f1000 = new String[]{"action", "jump", "command", "swing"};
   }

   public void m20000(Object var1) {
      this.m32000();
      ((List)((C1003)this.f2000[0]).i()).forEach(var1x -> var1x.y(var1));
   }

   public void m30000(Camera var1) {
      this.m32000();
      C1003 var6 = (C1003)C0122.m4000(
            (Base0995)this.N[1],
            f1000[0],
            new CameraApiPart(f1000[1], false),
            new CameraApiPart3(f1000[2], true),
            new C1092(f1000[3], false),
            (CameraPartPart)this.f2000[1],
            (OltqItr)this.f2000[2]
         )
         .N(var1x -> this.U());
      this.f2000[0] = var6;
   }

   private void m32000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[3];
         Object[] var1 = this.f2000;
      }
   }
}
