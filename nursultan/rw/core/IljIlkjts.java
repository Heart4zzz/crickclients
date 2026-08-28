package rw.core;

import org.lwjgl.opengl.GL11;
import rw.api.Iface0003;
import rw.data.Rec0003;

public class IljIlkjts implements Iface0003 {
   public Object[] f1000;

   @Override
   public void m2000() {
      if ((Integer)this.f1000[1] != 0) {
         GL11.glDeleteTextures((Integer)this.f1000[1]);
         Integer var5 = 0;
         this.f1000[1] = var5;
      }
   }

   public IljIlkjts(Rec0003 var1, int var2) {
      this.m10000();
      this.f1000[0] = var1;
      Integer var8 = var2;
      this.f1000[1] = var8;
   }

   static {
      ntfClinit();
   }

   private void m10000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[2];
         Object[] var1 = this.f1000;
         var1[1] = 0;
      }
   }

   @Override
   public int m12000() {
      return (Integer)this.f1000[1];
   }

   public Rec0003 m16000() {
      return (Rec0003)this.f1000[0];
   }

   public boolean m18000() {
      return (boolean)(this.f1000[1] != 0 ? 1 : 0);
   }

   public int m22000() {
      return ((Rec0003)this.f1000[0]).m8000();
   }

   public int m26000() {
      return ((Rec0003)this.f1000[0]).m18000();
   }
}
