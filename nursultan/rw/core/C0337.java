package rw.core;

import java.util.List;
import net.minecraft.server.network.FilteredText;
import rw.api.Iface0214;
import rw.data.Rec0114;
import rw.data.Rec0118;
import rw.data.Rec0119;
import rw.data.Rec0120;
import rw.data.Rec0121;
import rw.defs.Enum0012;
import rw.defs.Enum0047;
import rw.gui.C0019;
import rw.setting.C0065;

final class C0337 {
   private static final Rec0119 f1000;
   private final rw.gui.C0013 f2000;
   private final rw.setting.C0066 f3000;
   private final C0065 f4000;

   C0337(rw.gui.C0013 var1) {
      this.f2000 = var1;
      this.f3000 = rw.setting.C0066.m10000(var1);
      this.f4000 = C0065.m38000(var1);
   }

   private void m2000(Rec0118 var1, C0019 var2, List<Iface0214> var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      if (var1.m4000()) {
         FilteredText var11 = var1.m6000();
         float var12 = C0259.m8000(var6, 0.0F, var8);
         if (!(var12 <= 0.0F)) {
            float var13 = this.m4000(var11, var2, var11.i(), var9);
            float var14 = var4 + Math.max(0.0F, var5 - 1.0F);
            float var15 = C0259.m8000(var13, var4, var14);
            float var16 = var10 > 0.0F ? 1.0F / var10 : 1.0F;
            float var17 = C0259.m2000(var15, var10);
            float var18 = C0259.m2000(var15 + 1.0F, var10);
            if (var18 - var17 < var16) {
               var18 = var17 + var16;
            }

            float var19 = C0259.m2000(var7, var10);
            float var20 = C0259.m2000(var7 + var12, var10);
            if (!(var20 <= var19)) {
               var3.add(new Rec0120(var17, var19, var18 - var17, var20 - var19, C0326.f1000, var2.m222000(), 0, 0.0F, 0, 0.0F));
            }
         }
      }
   }

   private float m4000(FilteredText var1, C0019 var2, int var3, float var4) {
      String var5 = var1.y();
      int var6 = C0259.m6000(var3, 0, var5.length());
      float var7 = this.f2000.m8000().m6000(var5.substring(0, var6), var2.m78000(), var2.m24000());
      return var4 + var7;
   }

   private static Iface0214 m6000(String var0, float var1, float var2, int var3, C0019 var4) {
      float var5 = var4.m44000();
      int var6 = var4.m98000();
      return (Iface0214)(var5 > 0.0F && C0248.m24000(var6)
         ? new Rec0121(var0, var1, var2, var3, var4.m78000(), var4.m24000(), var6, var5)
         : new Rec0114(var0, var1, var2, var3, var4.m78000(), var4.m24000()));
   }

   private static int m8000(FilteredText var0, C0019 var1) {
      int var2 = var1.m222000();
      if (!var0.u()) {
         return var2;
      } else {
         int var3 = Math.max(1, Math.round(C0248.m20000(var2) * 0.55F));
         return C0248.m16000(var2, Enum0012.f1000, var3);
      }
   }

   private static int m10000(C0019 var0) {
      int var1 = var0.m222000();
      int var2 = Math.max(1, Math.round(C0248.m20000(var1) * 0.28F));
      return C0248.m16000(var1, Enum0012.f1000, var2);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private float m12000(C0019 var1, float var2, float var3, float var4) {
      float var5 = Math.max(0.0F, var3 - var4);

      return var2 + switch (C0329.f1000[var1.m52000().ordinal()]) {
         case 1 -> 0.0F;
         case 2 -> var5 * 0.5F;
         case 3 -> var5;
         default -> throw new MatchException(null, null);
      };
   }

   void m14000(Rec0118 var1, C0019 var2, List<Iface0214> var3, float var4, float var5, float var6, float var7) {
      FilteredText var8 = var1.m6000();
      float var9 = this.f2000.m6000().m4000();
      float var10 = this.f2000.m8000().m4000(var2.m78000(), var2.m24000());
      float var11 = this.m12000(var2, var5, var7, var10);
      float var12 = this.m18000(var2, var8.y(), var4, var6) - var8.B();
      this.m20000(var8, var2, var3, var4, var6, var7, var11, var10, var12, var9);
      if (!var8.L().isEmpty()) {
         float var13 = var8.u() ? this.m18000(var2, var8.L(), var4, var6) - var8.B() : var12;
         var3.add(m6000(var8.L(), C0259.m2000(var13, var9), C0259.m2000(var11, var9), m8000(var8, var2), var2));
      }

      this.m2000(var1, var2, var3, var4, var6, var7, var11, var10, var12, var9);
   }

   Rec0119 m16000(rw.setting.C0059 var1, C0019 var2) {
      if (var1.m120000() != Enum0047.f3000) {
         return f1000;
      } else {
         FilteredText var3 = this.f4000.m12000(var1);
         String var4 = var3.L();
         if (var4.isEmpty()) {
            return f1000;
         } else {
            float var5 = var1.m42000().m80000();
            float var6 = var1.m42000().m10000();
            float var7 = var1.m42000().m18000();
            float var8 = var1.m42000().m20000();
            float var9 = this.f2000.m8000().m4000(var2.m78000(), var2.m24000());
            float var10 = this.m12000(var2, var6, var8, var9);
            float var11 = this.m18000(var2, var4, var5, var7) - var3.B();
            float var12 = this.f2000.m8000().m6000(var4, var2.m78000(), var2.m24000());
            return new Rec0119(var11, var10, var12, var9);
         }
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private float m18000(C0019 var1, String var2, float var3, float var4) {
      float var5 = this.f2000.m8000().m6000(var2, var1.m78000(), var1.m24000());
      float var6 = Math.max(0.0F, var4 - var5);

      return var3 + switch (C0329.f1000[var1.m38000().ordinal()]) {
         case 1 -> 0.0F;
         case 2 -> var6 * 0.5F;
         case 3 -> var6;
         default -> throw new MatchException(null, null);
      };
   }

   private void m20000(FilteredText var1, C0019 var2, List<Iface0214> var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      if (!var1.u() && var1.N()) {
         float var11 = this.m4000(var1, var2, var1.R(), var9);
         float var12 = this.m4000(var1, var2, var1.M(), var9);
         float var13 = C0259.m8000(var11, var4, var4 + var5);
         float var14 = C0259.m8000(var12, var4, var4 + var5);
         if (!(var14 <= var13)) {
            float var15 = C0259.m8000(var6, 0.0F, var8);
            if (!(var15 <= 0.0F)) {
               float var16 = C0259.m2000(var13, var10);
               float var17 = C0259.m2000(var14, var10);
               float var18 = C0259.m2000(var7, var10);
               float var19 = C0259.m2000(var7 + var15, var10);
               if (!(var17 <= var16) && !(var19 <= var18)) {
                  var3.add(new Rec0120(var16, var18, var17 - var16, var19 - var18, C0326.f1000, m10000(var2), 0, 0.0F, 0, 0.0F));
               }
            }
         }
      }
   }

   Rec0118 m22000(rw.setting.C0059 var1) {
      if (var1.m120000() != Enum0047.f3000) {
         return Rec0118.f3000;
      } else {
         FilteredText var2 = this.f4000.m12000(var1);
         boolean var3 = this.f3000.m8000(var1) && var1.m42000().m18000() > 0.0F && var1.m42000().m20000() > 0.0F;
         return new Rec0118(var2, var3);
      }
   }
}
