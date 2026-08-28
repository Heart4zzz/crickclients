package rw.core;

import com.mojang.blaze3d.opengl.GlStateManager;
import java.nio.ByteBuffer;
import org.lwjgl.opengl.GL30;
import org.lwjgl.opengl.GL33;
import rw.api.Iface0003;
import rw.api.Iface0006;
import rw.api.NestMembersX;
import rw.data.Rec0003;
import rw.data.Rec0197;

public class C0009 implements NestMembersX {
   static {
      ntfClinit();
   }

   @Override
   public void m12000(Iface0006 var1, Iface0006 var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
      if (var5 > 0 && var6 > 0 && var9 > 0 && var10 > 0) {
         int var13 = GlStateManager.getFrameBuffer(36008);
         int var14 = GlStateManager.getFrameBuffer(36009);
         GlStateManager._glBindFramebuffer(36008, var1.m4000());
         GlStateManager._glBindFramebuffer(36009, var2.m4000());
         GlStateManager._glBlitFrameBuffer(var3, var4, var3 + var5, var4 + var6, var7, var8, var7 + var9, var8 + var10, var11, var12);
         GlStateManager._glBindFramebuffer(36009, var14);
         GlStateManager._glBindFramebuffer(36008, var13);
      }
   }

   public Iface0006 m14000(Iface0003 var1, Iface0003 var2, String var3) {
      return new C0026(var1, var2, var3);
   }

   public Iface0003 m16000(Rec0003 var1) {
      Rec0197 var2 = C0824.m20000(var1.m16000());
      int var3 = GL30.glGenTextures();
      GlStateManager._bindTexture(var3);
      GL30.glTexImage2D(3553, 0, var2.m6000(), var1.m8000(), var1.m18000(), 0, var2.m2000(), var2.m8000(), (ByteBuffer)null);
      GL30.glTexParameteri(3553, 10241, C0824.m18000(var1.m4000()));
      GL30.glTexParameteri(3553, 10240, C0824.m18000(var1.m20000()));
      GL30.glTexParameteri(3553, 10242, C0824.m16000(var1.m2000()));
      GL30.glTexParameteri(3553, 10243, C0824.m16000(var1.m12000()));
      if (var1.m14000()) {
         GL30.glGenerateMipmap(3553);
      }

      return new IljIlkjts(var1, var3);
   }

   public Iface0006 m20000(int var1, int var2, int var3) {
      return new IlpnitIl(var1, var2, var3);
   }

   public void m22000(int var1, Iface0003 var2) {
      GlStateManager._activeTexture(33984 + var1);
      GlStateManager._bindTexture(var2 == null ? 0 : var2.m4000());
      GL33.glBindSampler(var1, 0);
   }
}
