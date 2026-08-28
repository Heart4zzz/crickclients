package rw.setting;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import net.minecraft.client.gui.font.glyphs.SpecialGlyphs$PixelProvider;
import net.minecraft.client.gui.font.providers.UnihexProvider$IntContents;
import rw.core.C0270;
import rw.data.Rec0074;
import rw.data.Rec0077;
import rw.data.Rec0082;

final class C0028 {
   final ByteBuffer f1000;
   int f2000 = 1000;

   int m2000(int var1) {
      return this.f1000.getShort(var1);
   }

   UnihexProvider$IntContents m4000(int var1) {
      int var2 = this.m16000(var1);
      ArrayList var3 = new ArrayList();
      if (var2 == 1) {
         int var4 = this.m16000(var1 + 2);
         int var5 = this.m16000(var1 + 4);

         for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.m16000(var1 + 6 + var6 * 2);
            if (var7 != 0) {
               var3.add(new int[]{var4 + var6, var4 + var6, var7});
            }
         }
      } else if (var2 == 2) {
         int var8 = this.m16000(var1 + 2);

         for (int var10 = 0; var10 < var8; var10++) {
            int var12 = var1 + 4 + var10 * 6;
            var3.add(new int[]{this.m16000(var12), this.m16000(var12 + 2), this.m16000(var12 + 4)});
         }
      }

      var3.sort((var0, var1x) -> Integer.compare((int)((Object[])var0)[0], (int)((Object[])var1x)[0]));
      int[] var9 = new int[var3.size()];
      int[] var11 = new int[var3.size()];
      int[] var13 = new int[var3.size()];

      for (int var14 = 0; var14 < var3.size(); var14++) {
         var9[var14] = ((int[])var3.get(var14))[0];
         var11[var14] = ((int[])var3.get(var14))[1];
         var13[var14] = ((int[])var3.get(var14))[2];
      }

      return new UnihexProvider$IntContents(var9, var11, var13);
   }

   C0028(byte[] var1) {
      this.f1000 = ByteBuffer.wrap(var1);
   }

   static int m6000(int var0) {
      return Integer.bitCount(var0 & 65535) * 2;
   }

   static int m8000(int var0) {
      if ((var0 & 4) == 0) {
         return -1;
      } else {
         byte var1 = 0;
         if ((var0 & 1) != 0) {
            var1 += 2;
         }

         if ((var0 & 2) != 0) {
            var1 += 2;
         }

         return var1;
      }
   }

   String m10000(int var1) {
      return "" + (char)this.m22000(var1) + (char)this.m22000(var1 + 1) + (char)this.m22000(var1 + 2) + (char)this.m22000(var1 + 3);
   }

   long m12000(int var1) {
      return this.f1000.getInt(var1) & 4294967295L;
   }

   SpecialGlyphs$PixelProvider m14000(int var1, int var2, int var3, int var4) {
      Rec0077 var5 = new Rec0077(this.m28000(var1 + this.m16000(var1 + 2)));
      UnihexProvider$IntContents var6 = this.m4000(var1 + this.m16000(var1 + 8));
      UnihexProvider$IntContents var7 = this.m4000(var1 + this.m16000(var1 + 10));
      int var8 = this.m16000(var1 + 12);
      int var9 = this.m16000(var1 + 14);
      int var10 = m6000(var2);
      int var11 = m6000(var3);
      int var12 = var10 + var11;
      int var13 = var1 + 16;
      int[][] var14 = new int[var8][var9];

      for (int var15 = 0; var15 < var8; var15++) {
         for (int var16 = 0; var16 < var9; var16++) {
            int var17 = var13 + (var15 * var9 + var16) * var12;
            var14[var15][var16] = var4 >= 0 ? this.m2000(var17 + var4) : 0;
         }
      }

      return new Rec0074(var5, var6, var7, var14);
   }

   int m16000(int var1) {
      return this.f1000.getShort(var1) & 65535;
   }

   C0270 m20000() {
      int var1 = this.m16000(4);
      int var2 = -1;
      int var3 = -1;

      for (int var4 = 0; var4 < var1; var4++) {
         int var5 = 12 + var4 * 16;
         String var6 = this.m10000(var5);
         if (var6.equals("GPOS")) {
            var2 = (int)this.m12000(var5 + 8);
         } else if (var6.equals("head")) {
            var3 = (int)this.m12000(var5 + 8);
         }
      }

      if (var3 >= 0) {
         this.f2000 = this.m16000(var3 + 18);
      }

      if (var2 < 0) {
         return new C0270(this.f2000, List.of());
      } else {
         int var18 = var2 + this.m16000(var2 + 6);
         int var19 = var2 + this.m16000(var2 + 8);
         LinkedHashSet var20 = new LinkedHashSet();
         int var7 = this.m16000(var18);

         for (int var8 = 0; var8 < var7; var8++) {
            int var9 = var18 + 2 + var8 * 6;
            if (this.m10000(var9).equals("kern")) {
               int var10 = var18 + this.m16000(var9 + 4);
               int var11 = this.m16000(var10 + 2);

               for (int var12 = 0; var12 < var11; var12++) {
                  var20.add(this.m16000(var10 + 4 + var12 * 2));
               }
            }
         }

         if (var20.isEmpty()) {
            return new C0270(this.f2000, List.of());
         } else {
            int var21 = this.m16000(var19);
            ArrayList var22 = new ArrayList();

            for (int var24 : var20) {
               if (var24 < var21) {
                  int var25 = var19 + this.m16000(var19 + 2 + var24 * 2);
                  int var13 = this.m16000(var25);
                  int var14 = this.m16000(var25 + 4);
                  ArrayList var15 = new ArrayList();

                  for (int var16 = 0; var16 < var14; var16++) {
                     int var17 = var25 + this.m16000(var25 + 6 + var16 * 2);
                     if (var13 == 2) {
                        this.m26000(var15, var17);
                     } else if (var13 == 9 && this.m16000(var17) == 1 && this.m16000(var17 + 2) == 2) {
                        this.m26000(var15, var17 + (int)this.m12000(var17 + 4));
                     }
                  }

                  if (!var15.isEmpty()) {
                     var22.add(var15);
                  }
               }
            }

            return new C0270(this.f2000, var22);
         }
      }
   }

   int m22000(int var1) {
      return this.f1000.get(var1) & 0xFF;
   }

   SpecialGlyphs$PixelProvider m24000(int var1, int var2, int var3, int var4) {
      int[] var5 = this.m28000(var1 + this.m16000(var1 + 2));
      int var6 = m6000(var2);
      int var7 = m6000(var3);
      int var8 = this.m16000(var1 + 8);
      HashMap var9 = new HashMap();

      for (int var10 = 0; var10 < var8 && var10 < var5.length; var10++) {
         int var11 = var1 + this.m16000(var1 + 10 + var10 * 2);
         int var12 = this.m16000(var11);
         int var13 = var11 + 2;

         for (int var14 = 0; var14 < var12; var14++) {
            int var15 = this.m16000(var13);
            int var16 = var4 >= 0 ? this.m2000(var13 + 2 + var4) : 0;
            if (var16 != 0) {
               var9.put((long)var5[var10] << 32 | var15 & 4294967295L, var16);
            }

            var13 += 2 + var6 + var7;
         }
      }

      return new Rec0082(var9);
   }

   void m26000(List<SpecialGlyphs$PixelProvider> var1, int var2) {
      int var3 = this.m16000(var2);
      int var4 = this.m16000(var2 + 4);
      int var5 = this.m16000(var2 + 6);
      int var6 = m8000(var4);
      if (var3 == 1) {
         var1.add(this.m24000(var2, var4, var5, var6));
      } else if (var3 == 2) {
         var1.add(this.m14000(var2, var4, var5, var6));
      }
   }

   int[] m28000(int var1) {
      int var2 = this.m16000(var1);
      if (var2 == 1) {
         int var8 = this.m16000(var1 + 2);
         int[] var9 = new int[var8];

         for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = this.m16000(var1 + 4 + var11 * 2);
         }

         return var9;
      } else {
         int var3 = this.m16000(var1 + 2);
         ArrayList var4 = new ArrayList();

         for (int var5 = 0; var5 < var3; var5++) {
            int var6 = var1 + 4 + var5 * 6;

            for (int var7 = this.m16000(var6); var7 <= this.m16000(var6 + 2); var7++) {
               var4.add(var7);
            }
         }

         int[] var10 = new int[var4.size()];

         for (int var12 = 0; var12 < var10.length; var12++) {
            var10[var12] = (Integer)var4.get(var12);
         }

         Arrays.sort(var10);
         return var10;
      }
   }
}
