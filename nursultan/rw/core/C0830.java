package rw.core;

import java.nio.ByteBuffer;
import org.lwjgl.opengl.GL33;
import rw.data.Rec0004;

public class C0830 {
   private static short[] f1000;
   private static short[] f2000;
   private static short[] f3000;
   private static String[] f4000;
   private static short[] f5000;
   private static short[] f6000;
   private static short[] f7000;
   public Object[] f8000;
   private static short[] f9000;
   private static short[] f10000;
   private static short[] f11000;

   public C0038 m2000() {
      return (C0038)this.f8000[0];
   }

   public C0811 m6000() {
      return (C0811)this.f8000[3];
   }

   public C0830(Rec0004 var1, int var2, int var3) {
      this.m38000();
      this.f8000[2] = var1;
      C0833 var9 = var3 > 0 ? C0833.m26000() : C0833.m2000();
      this.f8000[1] = var9;
      C0038 var10 = new C0038();
      this.f8000[0] = var10;
      ((C0038)this.f8000[0]).m2000();
      ((C0833)this.f8000[1]).m12000().m8000();
      if (((C0833)this.f8000[1]).m18000() != null) {
         ((C0833)this.f8000[1]).m18000().m8000();
      }

      var1.m10000();
      C0811 var11 = new C0811(var2);
      this.f8000[3] = var11;
      C0808 var12 = var3 > 0 ? new C0808(var3) : null;
      this.f8000[4] = var12;
   }

   static {
      ntfClinit();
   }

   public boolean m12000() {
      if (this.m14000().m22000()) {
         return (boolean)(this.f8000[6] == 0 ? 1 : 0);
      } else {
         return (boolean)(this.f8000[5] == 0 ? 1 : 0);
      }
   }

   public C0833 m14000() {
      return (C0833)this.f8000[1];
   }

   public static OlOiri m16000() {
      return new OlOiri();
   }

   private static void m22000() {
      f6000 = new short[]{2, 1, 0, 0, 1, 1, 1};
      f9000 = new short[]{3, 4, 3};
      f3000 = new short[]{3, 4, 4};
      f2000 = new short[]{1, 5, 1, 2, 5, 1, 0};
      f7000 = new short[]{1, 6, 1, 0};
      f5000 = new short[]{1, 6, 0, 1, 6, 6};
      f10000 = new short[]{5125, 5, 5};
      f11000 = new short[]{0, 1, 6, 5125, 6, 5, 0};
      f1000 = new short[]{1, 2, 3, 4, 5, 6};
   }

   private static void m24000() {
      f4000 = new String[]{"Mesh has no EBO", "Mesh has no EBO"};
   }

   public int m28000() {
      return (Integer)this.f8000[6];
   }

   public int m32000() {
      return (Integer)this.f8000[5];
   }

   public void m34000(ByteBuffer var1, int var2) {
      if (((C0833)this.f8000[1]).m18000() == null) {
         throw new IllegalStateException(f4000[1]);
      } else {
         ((C0038)this.f8000[0]).m2000();
         ((C0833)this.f8000[1]).m18000().m12000(var1, var2);
         Integer var7 = var1.position() / 4;
         this.f8000[6] = var7;
      }
   }

   public void m36000(int var1) {
      if (((C0811)this.f8000[3]).m16000() != 0) {
         this.m54000((C0811)this.f8000[3], var1);
         if ((C0808)this.f8000[4] != null) {
            this.m40000((C0808)this.f8000[4], var1);
         }
      }
   }

   private void m38000() {
      if (this.f8000 == null) {
         this.f8000 = new Object[7];
         Object[] var1 = this.f8000;
         var1[5] = 0;
         var1[6] = 0;
      }
   }

   public void m40000(C0808 var1, int var2) {
      if (((C0833)this.f8000[1]).m18000() == null) {
         throw new IllegalStateException(f4000[0]);
      } else {
         ((C0038)this.f8000[0]).m2000();
         ((C0833)this.f8000[1]).m18000().m12000(var1.m22000(), var2);
         Integer var7 = var1.m22000().position() / 4;
         this.f8000[6] = var7;
         var1.m20000();
      }
   }

   public static C0830 m42000(Rec0004 var0, int var1, int var2) {
      return m16000().m18000(var0).m22000(var1).m14000(var2).m20000();
   }

   public void m44000(int var1, int var2, int var3) {
      if (var3 != 0) {
         ((C0038)this.f8000[0]).m2000();
         if (((C0833)this.f8000[1]).m22000()) {
            GL33.glDrawElementsInstanced(var1, (Integer)this.f8000[6], 5125, 0L, var3);
         } else {
            GL33.glDrawArraysInstanced(var1, 0, var2, var3);
         }
      }
   }

   public static C0830 m46000(Rec0004 var0, int var1) {
      return m16000().m18000(var0).m22000(var1).m14000(0).m20000();
   }

   public void m48000(ByteBuffer var1, int var2) {
      ((C0833)this.f8000[1]).m12000().m12000(var1, var2);
      Integer var7 = var1.position() / ((Rec0004)this.f8000[2]).m2000();
      this.f8000[5] = var7;
   }

   public C0808 m52000() {
      return (C0808)this.f8000[4];
   }

   public void m54000(C0811 var1, int var2) {
      ((C0833)this.f8000[1]).m12000().m12000(var1.m22000(), var2);
      Integer var7 = var1.m16000();
      this.f8000[5] = var7;
      var1.m34000();
   }

   public void m56000(int var1) {
      if (!this.m12000()) {
         ((C0038)this.f8000[0]).m2000();
         if (((C0833)this.f8000[1]).m22000()) {
            if ((Integer)this.f8000[6] == 0) {
               return;
            }

            GL33.glDrawElements(var1, (Integer)this.f8000[6], f10000[0], 0L);
         } else {
            if ((Integer)this.f8000[f10000[1]] == 0) {
               return;
            }

            GL33.glDrawArrays(var1, 0, (Integer)this.f8000[f10000[2]]);
         }
      }
   }

   public Rec0004 m64000() {
      return (Rec0004)this.f8000[2];
   }
}
