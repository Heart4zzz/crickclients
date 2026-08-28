package rw.core;

import java.util.Arrays;
import java.util.List;
import rw.api.Iface0595;
import rw.api.Iface0597;

public class IlksOmts<C> implements Iface0597<C> {
   public static Object[] f1000;
   public Object[] f2000;

   IlksOmts(List<Iface0595<C>> var1, C0013 var2) {
      this.m16000();
      this.f2000[0] = var1;
      this.f2000[1] = var2;
      C0823 var3 = new C0823();

      for (int var4 = 0; var4 < var1.size(); var4++) {
         ((Iface0595)var1.get(var4)).m4000(var3);
      }

      C0012[] var11 = var3.m8000();
      this.f2000[2] = var11;
      int[][] var12 = m20000(var1, ((C0012[])this.f2000[2]).length);
      this.f2000[3] = var12;
      NsVe var13 = var2.m50000();
      this.f2000[4] = var13;
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      f1000 = new Object[]{null};
   }

   public void m8000(C var1) {
      NsVe var2 = ((NsVe)this.f2000[4]).m22000((C0012[])this.f2000[2]);

      try {
         List var3 = (List)this.f2000[0];
         int[][] var4 = (int[][])this.f2000[3];
         C0012[] var5 = (C0012[])this.f2000[2];

         for (int var6 = 0; var6 < var3.size(); var6++) {
            ((Iface0595)var3.get(var6)).m6000(var1, var2, (C0013)this.f2000[1]);
            int[] var7 = var4[var6];

            for (int var11 : var7) {
               if (!var5[var11].m32000()) {
                  var2.m2000(var11);
               }
            }
         }
      } catch (Throwable var13) {
         if (var2 != null) {
            try {
               var2.m12000();
            } catch (Throwable var12) {
               var13.addSuppressed(var12);
            }
         }

         throw var13;
      }

      if (var2 != null) {
         var2.m12000();
      }
   }

   private void m16000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[5];
         Object[] var1 = this.f2000;
      }
   }

   private static <C> int[][] m20000(List<Iface0595<C>> var0, int var1) {
      int[] var2 = new int[var1];
      Arrays.fill(var2, -1);

      for (int var3 = 0; var3 < var0.size(); var3++) {
         for (int var7 : ((Iface0595)var0.get(var3)).m2000()) {
            var2[var7] = var3;
         }
      }

      int[][] var12 = new int[var0.size()][];
      boolean[] var13 = new boolean[var1];
      int[] var14 = new int[var1];

      for (int var15 = 0; var15 < var0.size(); var15++) {
         int var16 = 0;

         for (int var11 : ((Iface0595)var0.get(var15)).m2000()) {
            if (!var13[var11] && var2[var11] == var15) {
               var13[var11] = (boolean)1;
               var14[var16++] = var11;
            }
         }

         int[] var17 = Arrays.copyOf(var14, var16);

         for (int var18 = 0; var18 < var16; var18++) {
            var13[var17[var18]] = (boolean)0;
         }

         var12[var15] = var17.length == 0 ? (int[])f1000[0] : var17;
      }

      return var12;
   }

   public static <C> C0812<C> m22000() {
      return new C0812<>((C0013)C0013.f2000[0]);
   }

   public static <C> C0812<C> m24000(C0013 var0) {
      return new C0812<>(var0);
   }
}
