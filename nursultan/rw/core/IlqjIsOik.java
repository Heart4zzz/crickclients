package rw.core;

import it.unimi.dsi.fastutil.ints.IntArrayList;
import java.util.EnumMap;
import java.util.Map;
import rw.data.Rec0006;
import rw.defs.OlmmOsl;
import rw.gui.C0001;
import rw.gui.C0003;

public class IlqjIsOik {
   public Object[] f1000;
   private static byte[] f2000;
   private static byte[] f3000;
   private static byte[] f4000;
   private static byte[] f5000;
   private static byte[] f6000;
   private static byte[] f7000;
   private static byte[] f8000;
   public static Object[] f9000;
   private static byte[] f10000;

   public IlqjIsOik(C0003 var1, String var2, byte[] var3) {
      I1ipkI<"jvfxfjnv",294592793,-670091016,-670091011,-670091017,294592793>(this);
      EnumMap var8 = new EnumMap<>(OlmmOsl.class);
      this.f1000[0] = var8;
      this.f1000[1] = var1;
      this.f1000[2] = var2;
      this.f1000[3] = var3;
   }

   static {
      ntfClinit();
   }

   private static int[] m6000() {
      IntArrayList var0 = new IntArrayList();

      for (Rec0006 var4 : (Rec0006[])f9000[0]) {
         var4.m14000(var0);
      }

      return var0.toIntArray();
   }

   private void m12000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[f7000[7]];
         Object[] var1 = this.f1000;
      }
   }

   public C0001 m16000(OlmmOsl var1) {
      C0001 var2 = (C0001)((Map)this.f1000[0]).get(var1);
      if (var2 != null) {
         return var2;
      } else {
         C0001 var3 = ((C0003)this.f1000[1]).m46000((String)this.f1000[2], (byte[])this.f1000[3], var1);

         for (int var7 : (int[])f9000[1]) {
            var3.m62000(var7);
         }

         ((Map)this.f1000[0]).put(var1, var3);
         return var3;
      }
   }

   private static void m18000() {
      f4000 = new byte[]{23, 48, 57, 97, 122, 2};
      f6000 = new byte[]{65, 90, 3, 4, 5, 6, 7, 33};
      f8000 = new byte[]{47, 8, 9, 10};
      f2000 = new byte[]{11, 58, 64, 12, 91};
      f10000 = new byte[]{96, 13, 14};
      f3000 = new byte[]{123, 126, 15, 16};
      f7000 = new byte[]{32, 17, 18, 19, 20, 21, 22, 4};
      f5000 = new byte[]{2};
   }

   private static void m22000() {
      f9000 = new Object[]{null, null};
   }
}
