package rw.core;

import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import rw.api.Iface0003;
import rw.api.Iface0006;

public class NsVe implements AutoCloseable {
   private static short[] f1000;
   private static short[] f2000;
   private static short[] f3000;
   private static short[] f4000;
   private static short[] f5000;
   private static short[] f6000;
   private static short[] f7000;
   public Object[] f8000;
   private static short[] f9000;
   private static short[] f10000;
   private static short[] f11000;

   public void m2000(int var1) {
      C0023 var2 = ((C0023[])this.f8000[2])[var1];
      if (var2 != null) {
         ((C0023[])this.f8000[2])[var1] = null;
         C0023 var3 = ((C0012[])this.f8000[f10000[0]])[var1].m86000(var2);
         if (var3 != null) {
            ((C0023[])this.f8000[f10000[1]])[this.f8000[5]] = var3;
            ((int[])this.f8000[4])[this.f8000[5]] = var1;
            Integer var8 = (Integer)this.f8000[5] + 1;
            this.f8000[5] = var8;
         }
      }
   }

   private void m4000() {
      if (this.f8000 == null) {
         this.f8000 = new Object[6];
         Object[] var1 = this.f8000;
         var1[5] = 0;
      }
   }

   NsVe(C0013 var1) {
      this.m4000();
      this.f8000[0] = var1;
   }

   static {
      ntfClinit();
   }

   public Iface0003 m10000(int var1) {
      this.m24000(var1);
      return ((C0012[])this.f8000[1])[var1].m108000(((C0023[])this.f8000[2])[var1]);
   }

   public void m12000() {
      C0012[] var1 = (C0012[])this.f8000[1];
      C0023[] var2 = (C0023[])this.f8000[2];

      for (int var3 = 0; var3 < var1.length; var3++) {
         C0023 var4 = var2[var3];
         if (var4 != null) {
            var1[var3].m24000(var4);
            var2[var3] = null;
         }
      }

      for (int var11 = 0; var11 < this.f8000[5]; var11++) {
         var1[((int[])this.f8000[4])[var11]].m122000(((C0023[])this.f8000[3])[var11]);
         ((C0023[])this.f8000[3])[var11] = null;
      }

      Integer var9 = 0;
      this.f8000[5] = var9;
      Object var10 = null;
      this.f8000[1] = var10;
   }

   private static void m14000() {
      f2000 = new short[]{0, 1, 2, 2, 2, 3};
      f3000 = new short[]{4, 5, 2, 1, 0, 0, 0};
      f4000 = new short[]{0, 2, 1, 2, 1, 2};
      f9000 = new short[]{1, 2, 2, 2};
      f10000 = new short[]{1, 3};
      f1000 = new short[]{5, 4, 5, 5, 5};
      f11000 = new short[]{5, 4, 3, 5, 5};
      f7000 = new short[]{3, 3, 4, 4};
      f6000 = new short[]{3, 1, 2, 5};
      f5000 = new short[]{4, 3, 3, 5, 1};
   }

   public Iface0003 m16000(int var1) {
      this.m24000(var1);
      return ((C0012[])this.f8000[1])[var1].m72000(((C0023[])this.f8000[2])[var1]);
   }

   public Iface0006 m18000(int var1) {
      this.m24000(var1);
      return ((C0012[])this.f8000[1])[var1].m14000(((C0023[])this.f8000[2])[var1]);
   }

   public NsVe m22000(C0012[] var1) {
      this.f8000[1] = var1;
      int var2 = var1.length;
      if ((C0023[])this.f8000[2] == null || ((C0023[])this.f8000[2]).length < var2) {
         C0023[] var8 = new C0023[var2];
         this.f8000[2] = var8;
         C0023[] var9 = new C0023[var2];
         this.f8000[3] = var9;
         int[] var10 = new int[var2];
         this.f8000[4] = var10;
      }

      Integer var11 = 0;
      this.f8000[5] = var11;
      return this;
   }

   public void m24000(int var1) {
      if (((C0023[])this.f8000[2])[var1] == null) {
         C0012 var2 = ((C0012[])this.f8000[1])[var1];
         ((C0013)this.f8000[0]).m52000(var2);
         C0023 var3 = this.m26000(var2, var1);
         C0023 var4 = var3 == null ? ((C0013)this.f8000[0]).m32000(var2) : var2.m10000(var3);
         ((ObjectOpenHashSet)((C0013)this.f8000[0]).f1000[0]).add(var2);
         ((C0023[])this.f8000[2])[var1] = var4;
      }
   }

   private C0023 m26000(C0012 var1, int var2) {
      for (int var3 = 0; var3 < this.f8000[5]; var3++) {
         if (((int[])this.f8000[4])[var3] == var2) {
            C0023 var4 = ((C0023[])this.f8000[3])[var3];
            if (var1.m34000(var4)) {
               int var10002 = (Integer)this.f8000[5] - 1;
               Integer var10 = var10002;
               this.f8000[5] = var10;
               int var5 = var10002;
               ((C0023[])this.f8000[3])[var3] = ((C0023[])this.f8000[3])[var5];
               ((int[])this.f8000[4])[var3] = ((int[])this.f8000[4])[var5];
               ((C0023[])this.f8000[3])[var5] = null;
               return var4;
            }
         }
      }

      return null;
   }
}
