package rw.core;

import java.util.ArrayList;
import java.util.List;
import org.joml.Vector4f;
import rw.api.Iface0214;
import rw.api.Iface0215;
import rw.api.Iface0216;
import rw.data.Rec0096;
import rw.data.Rec0108;
import rw.data.Rec0110;
import rw.data.Rec0111;
import rw.data.Rec0114;
import rw.data.Rec0115;
import rw.data.Rec0116;
import rw.data.Rec0118;
import rw.data.Rec0120;
import rw.data.Rec0121;
import rw.defs.Enum0036;
import rw.defs.Enum0038;
import rw.defs.Enum0047;
import rw.gui.C0019;
import rw.setting.Rec0047;

final class C0343 {
   private final C0337 f1000;
   private final C0377 f2000;

   C0343(C0337 var1, C0377 var2) {
      this.f1000 = var1;
      this.f2000 = var2;
   }

   private static Iface0214 m2000(rw.setting.C0059 var0, C0019 var1) {
      if (!C0331.m6000(var1)) {
         return null;
      } else {
         float var2 = var0.m42000().m48000();
         float var3 = var0.m42000().m22000();
         if (!(var2 <= 0.0F) && !(var3 <= 0.0F)) {
            float var4 = Math.max(0.0F, var1.m92000());
            return new Rec0116(
               var0.m42000().m58000(),
               var0.m42000().m8000(),
               var2,
               var3,
               var1.m110000(),
               -1,
               new Vector4f(var1.m210000().m10000() + var4, var1.m210000().m8000() + var4, var1.m210000().m20000() + var4, var1.m210000().m4000() + var4)
            );
         } else {
            return null;
         }
      }
   }

   private static void m4000(rw.setting.C0059 var0, C0019 var1, List<Iface0214> var2, List<Iface0214> var3, List<Iface0214> var4) {
      Iface0214 var5 = m2000(var0, var1);
      if (var5 != null) {
         var2.add(var5);
      }

      if (var0.m120000() != Enum0047.f2000) {
         int var6 = var1.m96000();
         boolean var7 = C0248.m24000(var6);
         float var8 = var1.m92000();
         int var9 = var1.m58000();
         boolean var10 = var8 > 0.0F && C0248.m24000(var9);
         float var11 = var1.m26000();
         int var12 = var11 > 0.01F ? var1.m56000() : 0;
         boolean var13 = var11 > 0.01F && C0248.m24000(var12);
         if (var7 || var10 || var13) {
            Enum0038 var14 = var1.m20000();
            float var15 = var10 && var14 == Enum0038.f2000 ? var8 : 0.0F;
            float var16 = var0.m42000().m58000() + var15;
            float var17 = var0.m42000().m8000() + var15;
            float var18 = Math.max(0.0F, var0.m42000().m48000() - var15 * 2.0F);
            float var19 = Math.max(0.0F, var0.m42000().m22000() - var15 * 2.0F);
            float var20 = var10 && var14 == Enum0038.f1000 ? var8 : 0.0F;
            Vector4f var21 = new Vector4f(
               var1.m210000().m10000() + var20, var1.m210000().m8000() + var20, var1.m210000().m20000() + var20, var1.m210000().m4000() + var20
            );
            var2.add(new Rec0120(var16, var17, var18, var19, var21, var7 ? var6 : 0, var10 ? var9 : 0, var10 ? var8 : 0.0F, var14, var12, var13 ? var11 : 0.0F));
            if (var10 && var14 == Enum0038.f1000) {
               if (var5 != null) {
                  var3.add(var5);
               }

               if (var7 || var13) {
                  var3.add(new Rec0120(var16, var17, var18, var19, var21, var7 ? var6 : 0, 0, 0.0F, var14, var12, var13 ? var11 : 0.0F));
               }

               var4.add(new Rec0120(var16, var17, var18, var19, var21, 0, var9, var8, var14, 0, 0.0F));
            }
         }
      }
   }

   private void m6000(rw.setting.C0059 var1, Rec0118 var2, List<Iface0214> var3) {
      if (var1.m120000() == Enum0047.f2000) {
         if (var1.m94000() != null && var1.m42000().m48000() > 0.0F && var1.m42000().m22000() > 0.0F) {
            var3.add(new Rec0110(var1.m94000(), var1.m42000().m58000(), var1.m42000().m8000(), var1.m42000().m48000(), var1.m42000().m22000()));
         }
      } else {
         C0019 var4 = var1.m78000();
         float var5 = var1.m42000().m80000();
         float var6 = var1.m42000().m10000();
         float var7 = var1.m42000().m18000();
         float var8 = var1.m42000().m20000();
         if (var1.m120000() == Enum0047.f4000 && !var1.m32000().isEmpty()) {
            String var9 = var1.m42000().m60000().isEmpty() ? var1.m32000() : var1.m42000().m60000();
            var3.add(m8000(var9, var5, var6, var4.m222000(), var4));
         } else if (var1.m120000() == Enum0047.f3000) {
            this.f1000.m14000(var2, var4, var3, var5, var6, var7, var8);
         } else {
            if (var1.m120000() == Enum0047.f5000 && !var1.m100000().isEmpty()) {
               var3.add(new Rec0115(var1.m100000(), var5, var6, var7, var8, var4.m222000(), var4.m50000()));
            }
         }
      }
   }

   private static Iface0214 m8000(String var0, float var1, float var2, int var3, C0019 var4) {
      float var5 = var4.m44000();
      int var6 = var4.m98000();
      return (Iface0214)(var5 > 0.0F && C0248.m24000(var6)
         ? new Rec0121(var0, var1, var2, var3, var4.m78000(), var4.m24000(), var6, var5)
         : new Rec0114(var0, var1, var2, var3, var4.m78000(), var4.m24000()));
   }

   void m10000(rw.setting.C0059 var1, C0019 var2, Rec0096 var3, Rec0118 var4, Rec0108 var5, int var6, int var7, int var8, int var9, int var10) {
      ArrayList var11 = new ArrayList(2);
      ArrayList var12 = new ArrayList(2);
      ArrayList var13 = new ArrayList(1);
      m4000(var1, var2, var11, var12, var13);
      ArrayList var14 = new ArrayList(4);
      this.m6000(var1, var4, var14);
      ArrayList var15 = new ArrayList(2);
      this.f2000.m4000(var1, var2, var3, var15);
      Iface0215 var16 = m12000(var2, var5);
      var1.m92000().m40000(m16000(var11), m16000(var12), m16000(var13), m16000(var14), m16000(var15), var16, var6, var7, var8, var9, var10);
   }

   private static Iface0215 m12000(C0019 var0, Rec0108 var1) {
      if (var0.m88000() != Enum0036.f2000 || !var0.m210000().m12000()) {
         return null;
      } else if (var1 != null && var1.m12000()) {
         float var2 = m14000(var0);
         Vector4f var3 = new Vector4f(
            var0.m210000().m10000() + var2, var0.m210000().m8000() + var2, var0.m210000().m20000() + var2, var0.m210000().m4000() + var2
         );
         return new Rec0111(var1.m10000(), var1.m2000(), var1.m8000() - var1.m10000(), var1.m6000() - var1.m2000(), var3);
      } else {
         return null;
      }
   }

   static float m14000(C0019 var0) {
      boolean var1 = var0.m92000() > 0.0F && C0248.m24000(var0.m58000());
      return var1 && var0.m20000() == Enum0038.f1000 ? var0.m92000() : 0.0F;
   }

   private static List<Iface0216> m16000(List<Iface0214> var0) {
      if (var0.isEmpty()) {
         return List.of();
      } else {
         ArrayList var1 = new ArrayList(var0.size());

         for (int var2 = 0; var2 < var0.size(); var2++) {
            var1.add(new Rec0047((Iface0214)var0.get(var2)));
         }

         return var1;
      }
   }
}
