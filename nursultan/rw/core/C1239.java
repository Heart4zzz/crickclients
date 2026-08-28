package rw.core;

import com.mojang.blaze3d.opengl.GlStateManager;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL33;
import rw.api.Iface0003;
import rw.api.NestMembersX;

public class C1239 extends C1228 {
   public C1239(int var1) {
      super(var1);
   }

   static {
      ntfClinit();
   }

   private static void m2000(int var0, int var1) {
      GL13.glActiveTexture(var0);
      GL11.glBindTexture(3553, var1);
      GL33.glBindSampler(var0 - 33984, 0);
      GlStateManager._activeTexture(var0);
      GlStateManager._bindTexture(var1);
   }

   public void m4000(int var1, int var2) {
      m2000(var1, var2);
      super.m20000(var1 - 33984);
   }

   public void m8000(int var1) {
      m2000(33984, var1);
      super.m20000(0);
   }

   public void m6000(Iface0003 var1) {
      NestMembersX.m4000().m8000(0, var1);
      super.m20000(0);
   }

   public void m8000(int var1, Iface0003 var2) {
      NestMembersX.m4000().m8000(var1, var2);
      super.m20000(var1);
   }
}
