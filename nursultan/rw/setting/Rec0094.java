package rw.setting;

import com.mojang.blaze3d.opengl.GlStateManager;
import java.lang.runtime.ObjectMethods;
import java.util.Objects;
import java.util.function.IntSupplier;
import org.lwjgl.opengl.GL33;
import rw.api.Iface0598;
import rw.core.NsVe;

public record Rec0094() implements Iface0598 {
   public int f1000;
   public IntSupplier f2000;
   private static String[] f3000;

   Rec0094(int var1, IntSupplier var2) {
      Objects.requireNonNull(var2, f3000[0]);
      this.f1000 = var1;
      this.f2000 = var2;
   }

   static {
      ntfClinit();
   }

   public boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0094,"unit;texture",Rec0094::f1000,Rec0094::f2000>(this, var1);
   }

   public int m12000() {
      return this.f1000;
   }

   public IntSupplier m16000() {
      return this.f2000;
   }

   public void m20000(NsVe var1) {
      GlStateManager._activeTexture(this.f1000);
      GlStateManager._bindTexture(this.f2000.getAsInt());
      GL33.glBindSampler(this.f1000 - 33984, 0);
   }

   private static void m22000() {
      f3000 = new String[]{"texture"};
   }
}
