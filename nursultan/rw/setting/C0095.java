package rw.setting;

import java.util.ArrayList;
import java.util.Objects;
import org.lwjgl.opengl.GL11;
import rw.api.Iface0595;
import rw.api.Iface0596;
import rw.api.Iface0597;
import rw.api.Iface0598;
import rw.api.Iface0599;
import rw.core.C0823;
import rw.core.IlksOmts;
import rw.core.NsVe;

public class C0095<C> implements Iface0595<C> {
   private static short[] f1000;
   private static short[] f2000;
   private static short[] f3000;
   private static short[] f4000;
   private static short[] f5000;
   private static String[] f6000;
   private static short[] f7000;
   public Object[] f8000;
   private static short[] f9000;

   private static void m8000() {
      f5000 = new short[]{1, 2, 3};
      f3000 = new short[]{0, 6, 0, 1, 2};
      f1000 = new short[]{4, 5, 3, 4, 3, 0, 6};
      f4000 = new short[]{3, 6, 6, 1, 1, 4, 5};
      f9000 = new short[]{4, 2, 3};
      f7000 = new short[]{0, 4, 0, 4, 3, 3};
      f2000 = new short[]{3, 3, 16384, 256};
   }

   C0095(Iface0597<C> var1) {
      this.m10000();
      ArrayList var6 = new ArrayList();
      this.f8000[1] = var6;
      ArrayList var7 = new ArrayList();
      this.f8000[2] = var7;
      ArrayList var8 = new ArrayList();
      this.f8000[3] = var8;
      int[] var9 = (int[])IlksOmts.f1000[0];
      this.f8000[6] = var9;
      Iface0597 var10 = Objects.requireNonNull(var1, f6000[0]);
      this.f8000[0] = var10;
   }

   static {
      ntfClinit();
   }

   private void m10000() {
      if (this.f8000 == null) {
         this.f8000 = new Object[7];
         Object[] var1 = this.f8000;
         var1[5] = false;
      }
   }

   private static void m16000() {
      f6000 = new String[]{"pass", "setup", "beforePass", "target", "input"};
   }

   void m20000(Iface0596<C> var1) {
      ((ArrayList)this.f8000[1]).add(Objects.requireNonNull(var1, f6000[1]));
   }

   void m26000(boolean var1) {
      Boolean var6 = var1;
      this.f8000[5] = var6;
   }

   public int[] m28000() {
      return (int[])this.f8000[6];
   }

   private static void m30000(boolean var0) {
      GL11.glColorMask((boolean)1, (boolean)1, (boolean)1, (boolean)1);
      GL11.glClear(16384 | (var0 ? 256 : 0));
   }

   void m32000(Iface0599 var1) {
      Iface0599 var6 = Objects.requireNonNull(var1, f6000[3]);
      this.f8000[4] = var6;
   }

   public void m34000(C0823 var1) {
      ((Iface0599)this.f8000[4]).m6000(var1);
      int var2 = 0;

      for (Iface0598 var4 : (ArrayList)this.f8000[3]) {
         var4.m8000(var1);
         if (var4.a_() >= 0) {
            var2++;
         }
      }

      if (var2 == 0) {
         int[] var12 = (int[])IlksOmts.f1000[0];
         this.f8000[6] = var12;
      } else {
         int[] var14 = new int[var2];
         int var15 = 0;

         for (Iface0598 var6 : (ArrayList)this.f8000[3]) {
            int var7 = var6.a_();
            if (var7 >= 0) {
               var14[var15++] = var7;
            }
         }

         this.f8000[6] = var14;
      }
   }

   void m36000(Iface0596<C> var1) {
      ((ArrayList)this.f8000[2]).add(Objects.requireNonNull(var1, f6000[2]));
   }

   public void m38000() {
      if ((Iface0599)this.f8000[4] == null) {
         throw new IllegalStateException("Pass step has no target: " + ((Iface0597)this.f8000[0]).getClass().getName());
      } else {
         rw.core.C0012 var1 = ((Iface0599)this.f8000[4]).m8000();

         for (int var2 = 0; var2 < ((ArrayList)this.f8000[3]).size(); var2++) {
            Iface0598 var3 = (Iface0598)((ArrayList)this.f8000[3]).get(var2);
            if (var1 != null && var1 == var3.m2000()) {
               throw new IllegalStateException("Pass reads and writes the same framebuffer: " + var1.m50000());
            }

            for (int var4 = var2 + 1; var4 < ((ArrayList)this.f8000[3]).size(); var4++) {
               if (var3.m4000() == ((Iface0598)((ArrayList)this.f8000[3]).get(var4)).m4000()) {
                  throw new IllegalStateException("Texture unit is bound twice in one pass: " + var3.m4000());
               }
            }
         }
      }
   }

   void m42000(Iface0598 var1) {
      ((ArrayList)this.f8000[3]).add(Objects.requireNonNull(var1, f6000[4]));
   }

   public void m44000(C var1, NsVe var2, rw.core.C0013 var3) {
      for (int var4 = 0; var4 < ((ArrayList)this.f8000[1]).size(); var4++) {
         ((Iface0596)((ArrayList)this.f8000[1]).get(var4)).m2000(var1);
      }

      ((Iface0599)this.f8000[4]).m4000(var2, var3);
      if ((Boolean)this.f8000[5]) {
         m30000(((Iface0599)this.f8000[f9000[0]]).m2000(var2));
      }

      for (Iface0596 var5 : (ArrayList)this.f8000[f9000[1]]) {
         var5.m2000(var1);
      }

      for (Iface0598 var8 : (ArrayList)this.f8000[f9000[2]]) {
         var8.m6000(var2);
      }

      ((Iface0597)this.f8000[0]).execute(var1);
   }
}
