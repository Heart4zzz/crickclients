package rw.core;

import rw.gui.Camera;

public class CameraPart extends Base1148<Camera> {
   public Object[] f1000;

   public CameraPart(Camera var1, CameraPartPart var2, OltqItr var3, String var4, boolean var5) {
      super(var1, var4, var5);
      this.m4000();
      this.f1000[1] = var2;
      this.f1000[0] = var3;
   }

   static {
      ntfClinit();
   }

   private void m4000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[2];
         Object[] var1 = this.f1000;
      }
   }

   public void m8000(Object var1) {
      this.m4000();
      ((OltqItr)this.f1000[0]).m4000(var1);
      ((CameraPartPart)this.f1000[1]).m2000(var1);
   }
}
