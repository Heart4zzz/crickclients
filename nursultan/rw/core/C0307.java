package rw.core;

import rw.data.Rec0103;
import rw.defs.Enum0036;
import rw.defs.Enum0047;
import rw.gui.C0019;

public final class C0307 {
   private static Rec0103 m2000(rw.setting.C0059 var0) {
      float var1 = var0.m42000().m58000();
      float var2 = var0.m42000().m8000();
      float var3 = var1 + Math.max(0.0F, var0.m42000().m48000());
      float var4 = var2 + Math.max(0.0F, var0.m42000().m22000());
      return new Rec0103(var1, var2, var3, var4);
   }

   private C0307() {
   }

   private static Rec0103 m4000(rw.setting.C0059 var0) {
      rw.setting.C0059 var1 = var0.m180000();
      if (var1 == null) {
         return null;
      } else {
         float var2 = C0385.m4000(var0) ? m22000(var1) : 0.0F;
         float var3 = var1.m42000().m58000();
         float var4 = var1.m42000().m8000() + var2;
         float var5 = var3 + Math.max(0.0F, var1.m42000().m48000());
         float var6 = var4 + Math.max(0.0F, var1.m42000().m22000());
         return new Rec0103(var3, var4, var5, var6);
      }
   }

   private static Rec0103 m6000(rw.setting.C0059 var0) {
      float var1 = var0.m42000().m80000();
      float var2 = var0.m42000().m10000();
      float var3 = var1 + Math.max(0.0F, var0.m42000().m18000());
      float var4 = var2 + Math.max(0.0F, var0.m42000().m20000());
      return new Rec0103(var1, var2, var3, var4);
   }

   private static boolean m8000(rw.setting.C0059 var0) {
      C0347 var1 = var0.m42000();
      int var2 = var0.m182000();
      if (var1.m28000() == var2) {
         return var1.m16000();
      } else {
         float var3 = var1.m58000();
         float var4 = var1.m8000();
         float var5 = var3 + Math.max(0.0F, var1.m48000());
         float var6 = var4 + Math.max(0.0F, var1.m22000());
         C0019 var8 = var0.m78000();
         boolean var7;
         if (var8.m88000() != Enum0036.f1000) {
            var7 = true;
         } else if (var8.m142000()) {
            var7 = false;
         } else {
            var7 = true;
            int var9 = 0;

            for (int var10 = var0.m102000(); var9 < var10; var9++) {
               rw.setting.C0059 var11 = var0.m148000(var9);
               if (!C0385.m6000(var11)) {
                  var7 &= m8000(var11);
                  C0347 var12 = var11.m42000();
                  var3 = Math.min(var3, var12.m26000());
                  var4 = Math.min(var4, var12.m42000());
                  var5 = Math.max(var5, var12.m40000());
                  var6 = Math.max(var6, var12.m30000());
               }
            }
         }

         var1.m62000(var3, var4, var5, var6, var2, var7);
         return var7;
      }
   }

   public static boolean m10000(rw.setting.C0059 var0, float var1, float var2, float var3) {
      if (!m8000(var0)) {
         return false;
      } else {
         C0347 var4 = var0.m42000();
         return var2 < var4.m26000() || var2 > var4.m40000() || var3 < var4.m42000() + var1 || var3 > var4.m30000() + var1;
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static Rec0103 m12000(rw.setting.C0059 var0, C0019 var1) {
      return switch (C0314.f1000[var1.m88000().ordinal()]) {
         case 1 -> var0.m120000() == Enum0047.f3000 ? m6000(var0) : m2000(var0);
         case 2 -> m4000(var0);
         default -> null;
      };
   }

   public static boolean m14000(rw.setting.C0059 var0, float var1, float var2, float var3) {
      float var4 = Math.max(0.0F, var0.m42000().m48000());
      float var5 = Math.max(0.0F, var0.m42000().m22000());
      if (!(var4 <= 0.0F) && !(var5 <= 0.0F)) {
         float var6 = var0.m42000().m58000();
         float var7 = var0.m42000().m8000() + var1;
         return var2 >= var6 && var2 <= var6 + var4 && var3 >= var7 && var3 <= var7 + var5;
      } else {
         return false;
      }
   }

   public static float m16000(float var0, rw.setting.C0059 var1, float var2) {
      return C0385.m4000(var1) ? var0 - var2 : var0;
   }

   public static Rec0103 m18000(rw.setting.C0059 var0, float var1) {
      float var2 = var0.m42000().m58000();
      float var3 = var0.m42000().m8000() + var1;
      float var4 = var2 + Math.max(0.0F, var0.m42000().m48000());
      float var5 = var3 + Math.max(0.0F, var0.m42000().m22000());
      return new Rec0103(var2, var3, var4, var5);
   }

   public static Rec0103 m20000(Rec0103 var0, float var1, Rec0103 var2) {
      if (var0 == null) {
         return var2;
      } else {
         float var3 = var0.m2000() + var1;
         float var4 = var0.m6000() + var1;
         return var2 == null
            ? new Rec0103(var0.m10000(), var3, var0.m8000(), var4)
            : new Rec0103(
               Math.max(var2.m10000(), var0.m10000()), Math.max(var2.m2000(), var3), Math.min(var2.m8000(), var0.m8000()), Math.min(var2.m6000(), var4)
            );
      }
   }

   public static float m22000(rw.setting.C0059 var0) {
      C0019 var1 = var0.m78000();
      return !var1.m142000() ? 0.0F : Math.max(0.0F, var0.m42000().m36000());
   }
}
