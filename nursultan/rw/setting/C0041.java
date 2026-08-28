package rw.setting;

import java.util.List;
import java.util.Objects;
import rw.core.C0307;
import rw.core.C0385;
import rw.core.C0404;
import rw.data.Rec0096;
import rw.data.Rec0101;
import rw.data.Rec0103;
import rw.defs.Enum0028;
import rw.defs.Enum0036;

public final class C0041 {
   private final rw.gui.C0016 f1000;

   public C0041(rw.gui.C0013 var1) {
      this.f1000 = rw.gui.C0016.m36000(Objects.requireNonNull(var1, "context"));
   }

   private Rec0101 m2000(C0059 var1, float var2, float var3, boolean var4) {
      C0038 var5 = var1.m24000();
      if (var5 != null && var5.m12000()) {
         List var6 = var5.m16000();

         for (int var7 = var6.size() - 1; var7 >= 0; var7--) {
            C0059 var8 = (C0059)var6.get(var7);
            if (!m12000(var8)) {
               Rec0101 var9 = this.m10000(var8, var2, var3, null, 0.0F, var4);
               if (var9 != null) {
                  return var9;
               }
            }
         }

         return null;
      } else {
         return null;
      }
   }

   public C0059 m4000(C0059 var1, float var2, float var3) {
      return this.m16000(var1, var2, var3, false).m2000();
   }

   private static Enum0028 m6000(Rec0096 var0, float var1, float var2, float var3) {
      float var4 = var3 - var1;
      if (var2 >= var0.m10000() && var2 <= var0.m10000() + var0.m14000() && var4 >= var0.m16000() && var4 <= var0.m16000() + var0.m22000()) {
         return Enum0028.f3000;
      } else {
         return var2 >= var0.m24000() && var2 <= var0.m24000() + var0.m2000() && var4 >= var0.m20000() && var4 <= var0.m20000() + var0.m18000()
            ? Enum0028.f2000
            : Enum0028.f1000;
      }
   }

   private Rec0101 m8000(C0059 var1, rw.gui.C0019 var2, Rec0103 var3, float var4, float var5, float var6) {
      if (!var2.m142000()) {
         return null;
      } else {
         Rec0096 var7 = this.f1000.m12000(var1);
         if (var7 == null) {
            return null;
         } else {
            Enum0028 var8 = m6000(var7, var4, var5, var6);
            if (var8 == Enum0028.f1000) {
               return null;
            } else {
               if (var2.m88000() != Enum0036.f3000) {
                  Rec0103 var9 = C0307.m20000(C0307.m12000(var1, var2), var4, var3);
                  if (var9 != null && !var9.m16000(var5, var6)) {
                     return null;
                  }
               }

               return new Rec0101(var1, var8, var4);
            }
         }
      }
   }

   private Rec0101 m10000(C0059 var1, float var2, float var3, Rec0103 var4, float var5, boolean var6) {
      if (var1 != null && !var1.m26000()) {
         rw.gui.C0019 var7 = var1.m78000();
         if (!var7.m104000() || var7.m84000() <= 0.0F || var7.m48000()) {
            return null;
         } else if (var4 != null && !var4.m16000(var2, var3)) {
            return null;
         } else if (var1.m102000() > 0 && C0307.m10000(var1, var5, var2, var3)) {
            return null;
         } else {
            if (var6) {
               Rec0101 var8 = this.m8000(var1, var7, var4, var5, var2, var3);
               if (var8 != null) {
                  return var8;
               }
            }

            Rec0103 var16 = C0307.m20000(C0307.m12000(var1, var7), var5, var4);
            boolean var9 = var16 != null && !var16.m14000();
            if (!var9) {
               List var10 = C0404.m6000(var1);
               float var11 = C0307.m22000(var1);

               for (int var12 = var10.size() - 1; var12 >= 0; var12--) {
                  C0059 var13 = (C0059)var10.get(var12);
                  if (!C0385.m6000(var13)) {
                     float var14 = C0307.m16000(var5, var13, var11);
                     Rec0101 var15 = this.m10000(var13, var2, var3, var16, var14, var6);
                     if (var15 != null) {
                        return var15;
                     }
                  }
               }
            }

            return C0307.m14000(var1, var5, var2, var3) ? new Rec0101(var1, Enum0028.f1000, var5) : null;
         }
      } else {
         return null;
      }
   }

   private static boolean m12000(C0059 var0) {
      for (C0059 var1 = var0; var1 != null; var1 = var1.m180000()) {
         if (var1.m26000()) {
            return true;
         }
      }

      return false;
   }

   public Rec0101 m14000(C0059 var1, float var2, float var3) {
      return this.m16000(var1, var2, var3, true);
   }

   private Rec0101 m16000(C0059 var1, float var2, float var3, boolean var4) {
      if (var1 == null) {
         return Rec0101.f4000;
      } else {
         Rec0101 var5 = this.m2000(var1, var2, var3, var4);
         if (var5 != null) {
            return var5;
         } else {
            Rec0101 var6 = this.m10000(var1, var2, var3, null, 0.0F, var4);
            return var6 != null ? var6 : Rec0101.f4000;
         }
      }
   }
}
