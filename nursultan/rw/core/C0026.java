package rw.core;

import com.mojang.blaze3d.opengl.GlStateManager;
import org.lwjgl.opengl.GL30;
import rw.api.Iface0003;
import rw.api.Iface0006;

public class C0026 implements Iface0006 {
   public Object[] f1000;

   public Iface0003 m4000() {
      return (Iface0003)this.f1000[1];
   }

   public String m6000() {
      return (String)this.f1000[2];
   }

   public C0026(Iface0003 var1, Iface0003 var2, String var3) {
      this.m10000();
      this.f1000[0] = var1;
      this.f1000[1] = var2;
      this.f1000[2] = var3;
   }

   static {
      ntfClinit();
   }

   private void m10000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[4];
         Object[] var1 = this.f1000;
         var1[3] = 0;
      }
   }

   public int m12000() {
      if ((Integer)this.f1000[3] == 0) {
         Integer var5 = GL30.glGenFramebuffers();
         this.f1000[3] = var5;
         GlStateManager._glBindFramebuffer(36160, (Integer)this.f1000[3]);
         GL30.glFramebufferTexture2D(36160, 36064, 3553, ((Iface0003)this.f1000[0]).m4000(), 0);
         if ((Iface0003)this.f1000[1] != null && ((Iface0003)this.f1000[1]).m10000()) {
            GL30.glFramebufferTexture2D(36160, 36096, 3553, ((Iface0003)this.f1000[1]).m4000(), 0);
         }
      }

      return (Integer)this.f1000[3];
   }

   @Override
   public int m18000() {
      return ((Iface0003)this.f1000[0]).m14000();
   }

   public void m22000() {
      if ((Integer)this.f1000[3] != 0) {
         GL30.glDeleteFramebuffers((Integer)this.f1000[3]);
         Integer var5 = 0;
         this.f1000[3] = var5;
      }
   }

   public void m28000(boolean var1, boolean var2) {
      this.m32000((boolean)1);
      short var3 = 0;
      if (var1) {
         var3 |= 16384;
      }

      if (var2 && (Iface0003)this.f1000[1] != null && ((Iface0003)this.f1000[1]).m10000()) {
         var3 |= 256;
      }

      if (var3 != 0) {
         GL30.glClear(var3);
      }
   }

   public void m32000(boolean var1) {
      GlStateManager._glBindFramebuffer(36160, this.m12000());
      if (var1) {
         GL30.glViewport(0, 0, this.m36000(), this.m18000());
      }
   }

   public Iface0003 m34000() {
      return (Iface0003)this.f1000[0];
   }

   public int m36000() {
      return ((Iface0003)this.f1000[0]).m12000();
   }
}
