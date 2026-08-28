package rw.core;

import KDFzREm.NxU;
import KDFzREm.pi;
import KDFzREm.pz;
import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import org.lwjgl.opengl.GL11;
import rw.api.Iface0006;

public class C0013 {
   public Object[] f1000;
   public static Object[] f2000;

   public Iface0006 m8000(C0012 var1) {
      lIss0<"evhxtsi",989216421,1606258837,1606258838,1606258876,989216421,989216421>(this, var1);
      return var1.m68000();
   }

   public C0013() {
      this.m54000();
      ObjectOpenHashSet var5 = new ObjectOpenHashSet();
      this.f1000[0] = var5;
   }

   static {
      ntfClinit();
   }

   private static void m14000() {
      f2000 = new Object[]{null, 10000L};
   }

   public void m20000(C0012 var1) {
      var1.m2000();
      ((ObjectOpenHashSet)this.f1000[0]).remove(var1);
   }

   public void m22000(C0012 var1) {
      this.m44000(var1);
      var1.m68000().m16000((boolean)1, var1.m62000());
   }

   private void m28000(long var1) {
      ObjectIterator var3 = ((ObjectOpenHashSet)this.f1000[0]).iterator();

      while (var3.hasNext()) {
         C0012 var4 = (C0012)var3.next();
         var4.m100000(var1, 10000L);
         if (!var4.m6000()) {
            var3.remove();
         }
      }
   }

   public void m30000() {
      this.m46000(System.currentTimeMillis());
   }

   public C0023 m32000(C0012 var1) {
      this.m52000(var1);
      C0023 var2 = var1.m64000();
      ((ObjectOpenHashSet)this.f1000[0]).add(var1);
      return var2;
   }

   public void m36000(C0012 var1, boolean var2) {
      this.m44000(var1);
      var1.m68000().m12000(var2);
   }

   public void m38000(NxU var1) {
      this.m40000(var1, (boolean)1);
      GL11.glClear(16640);
   }

   public void m40000(NxU var1, boolean var2) {
      int var3 = ((pz)var1.L()).N(((pi)RenderSystem.getDevice()).y(), var1.i());
      m48000(var3, var1.N, var1.y, var2);
   }

   public C0012 m44000(C0012 var1) {
      this.m52000(var1);
      var1.m20000();
      var1.m114000();
      ((ObjectOpenHashSet)this.f1000[0]).add(var1);
      return var1;
   }

   public void m46000(long var1) {
      this.m28000(var1);
   }

   public static void m48000(int var0, int var1, int var2, boolean var3) {
      GlStateManager._glBindFramebuffer(36160, var0);
      if (var3) {
         GL11.glViewport(0, 0, var1, var2);
      }
   }

   public NsVe m50000() {
      return new NsVe(this);
   }

   void m52000(C0012 var1) {
      if (var1.m82000()) {
         var1.m16000();
      }
   }

   private void m54000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[1];
         Object[] var1 = this.f1000;
      }
   }
}
