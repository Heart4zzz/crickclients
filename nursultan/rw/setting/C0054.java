package rw.setting;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import net.minecraft.client.gui.font.TextRenderable$Styled;
import rw.api.Iface0215;
import rw.api.Iface0216;
import rw.core.C0327;
import rw.core.C0330;
import rw.core.C0331;
import rw.core.C0334;
import rw.core.C0337;
import rw.core.C0338;
import rw.core.C0342;
import rw.core.C0343;
import rw.core.C0346;
import rw.core.C0377;
import rw.core.C0385;
import rw.core.C0404;
import rw.data.Rec0089;
import rw.data.Rec0096;
import rw.data.Rec0108;
import rw.data.Rec0109;
import rw.data.Rec0112;
import rw.data.Rec0113;
import rw.data.Rec0118;
import rw.data.Rec0119;
import rw.data.Rec0122;
import rw.defs.Enum0036;

final class C0054 {
   private static final int f1000 = 1;
   private static final int f2000 = 2;
   private static final int f3000 = 4;
   private final C0337 f4000;
   private final C0377 f5000;
   private final C0343 f6000;
   private final C0331 f7000;
   private final C0327 f8000;
   private final C0342 f9000;
   private Rec0108 f10000;

   private static boolean m2000(rw.gui.C0019 var0) {
      return var0.m40000() > 0.0F;
   }

   C0054(rw.gui.C0013 var1) {
      rw.gui.C0013 var2 = Objects.requireNonNull(var1, "context");
      this.f4000 = new C0337(var2);
      this.f5000 = new C0377(var2);
      this.f6000 = new C0343(this.f4000, this.f5000);
      this.f7000 = new C0331(this.f5000);
      this.f8000 = new C0327();
      this.f9000 = new C0342(this.f5000, this.f4000);
   }

   private static boolean m4000(rw.gui.C0019 var0) {
      return !var0.m104000() || var0.m84000() <= 0.0F;
   }

   private static boolean m6000(List<C0059> var0) {
      for (C0059 var2 : var0) {
         if (var2.m178000(1)) {
            return true;
         }
      }

      return false;
   }

   private static boolean m8000(rw.gui.C0019 var0) {
      return var0.m84000() > 0.0F && var0.m84000() < 1.0F;
   }

   private static List<C0059> m10000(List<C0059> var0) {
      boolean var1 = false;

      for (C0059 var3 : var0) {
         if (C0385.m6000(var3)) {
            var1 = true;
            break;
         }
      }

      if (!var1) {
         return var0;
      } else {
         ArrayList var5 = new ArrayList(var0.size());

         for (C0059 var4 : var0) {
            if (!C0385.m6000(var4)) {
               var5.add(var4);
            }
         }

         return var5;
      }
   }

   private Rec0112 m12000(C0059 var1, Rec0112 var2, List<String> var3, C0330 var4) {
      if (var1.m24000() != null && var1.m24000().m12000()) {
         List var5 = var1.m24000().m16000();
         if (var5.isEmpty()) {
            return var2;
         } else {
            ArrayList var6 = null;
            int var7 = var2.m4000();

            for (C0059 var9 : var5) {
               Rec0112 var10 = this.m38000(var9, var3, var4, 0.0F, this.f10000);
               if (!var10.m6000().isEmpty()) {
                  if (var6 == null) {
                     var6 = new ArrayList(var2.m6000().size() + var5.size());
                     var6.addAll(var2.m6000());
                  }

                  var6.addAll(var10.m6000());
                  var7 += var10.m4000();
               }
            }

            return var6 == null ? var2 : new Rec0112(var6, var7);
         }
      } else {
         return var2;
      }
   }

   private static boolean m14000(Rec0119 var0, Rec0119 var1) {
      return var0.m10000() < var1.m10000() + var1.m8000()
         && var1.m10000() < var0.m10000() + var0.m8000()
         && var0.m2000() < var1.m2000() + var1.m6000()
         && var1.m2000() < var0.m2000() + var0.m6000();
   }

   private static boolean m16000(List<Rec0050> var0, Rec0119 var1) {
      for (int var2 = 0; var2 < var0.size(); var2++) {
         if (m14000(((Rec0050)var0.get(var2)).m8000(), var1)) {
            return true;
         }
      }

      return false;
   }

   private static int m18000(List<Iface0216> var0, List<Rec0050> var1, int var2) {
      if (var1 != null && !var1.isEmpty()) {
         int var3 = var1.size();
         if (var3 == 1) {
            var0.add((Iface0216)var1.get(0));
            var1.clear();
            return var2;
         } else {
            Rec0050 var4 = (Rec0050)var1.get(0);
            int var5 = 0;

            for (int var6 = 0; var6 < var3; var6++) {
               var5 += ((Rec0050)var1.get(var6)).m2000().size();
            }

            ArrayList var15 = new ArrayList(var5);
            Rec0119 var7 = var4.m8000();
            float var8 = var7.m10000();
            float var9 = var7.m2000();
            float var10 = var7.m10000() + var7.m8000();
            float var11 = var7.m2000() + var7.m6000();
            var15.addAll(var4.m2000());

            for (int var12 = 1; var12 < var3; var12++) {
               Rec0050 var13 = (Rec0050)var1.get(var12);
               var15.addAll(var13.m2000());
               Rec0119 var14 = var13.m8000();
               var8 = Math.min(var8, var14.m10000());
               var9 = Math.min(var9, var14.m2000());
               var10 = Math.max(var10, var14.m10000() + var14.m8000());
               var11 = Math.max(var11, var14.m2000() + var14.m6000());
            }

            var0.add(new Rec0050(new Rec0119(var8, var9, var10 - var8, var11 - var9), var4.m6000(), var15));
            var1.clear();
            return var2;
         }
      } else {
         return 0;
      }
   }

   private static boolean m20000(C0059 var0, C0334 var1, int var2, int var3) {
      return !var0.m178000(1) && var1.m34000(var2, var3);
   }

   private static boolean m22000(C0059 var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, List<C0059> var9) {
      boolean var10 = var0.m18000(1);
      boolean var11 = m6000(var9);
      return !var10 && !var11 && var0.m92000().m38000(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   private static boolean m24000(rw.gui.C0019 var0, List<C0059> var1, boolean var2) {
      return var1.isEmpty() ? !var2 : var0.m88000() != Enum0036.f1000 && !var2;
   }

   private static void m26000(C0059 var0, List<String> var1) {
      String var2 = var0.m154000();
      if (var2 != null && !var2.isBlank()) {
         var1.add(var2);
      }
   }

   private static boolean m28000(C0059 var0, int var1, int var2, int var3, int var4, int var5) {
      return !var0.m18000(1) && var0.m92000().m28000(var1, var2, var3, var4, var5);
   }

   private static Rec0112 m30000(C0334 var0) {
      return new Rec0112(var0.m6000(), var0.m8000());
   }

   private int m32000(C0059 var1, rw.gui.C0019 var2, Rec0108 var3, float var4, Rec0108 var5) {
      float var6 = C0343.m14000(var2);
      boolean var7 = var6 > 0.0F;
      boolean var8 = var3 != null && var3.m12000();
      if (!var8 && !var7) {
         return 0;
      } else {
         boolean var9 = var2.m88000() == Enum0036.f2000;
         boolean var10 = var9 && var8 && var2.m210000().m12000();
         boolean var11 = var8 && C0338.m2000(var3, var4, var5);
         boolean var12 = false;
         boolean var13 = false;
         boolean var14 = var1.m42000().m14000() > 0.0F;
         boolean var15 = var9 && var8 && (!var11 || var10) && !var14;
         if (var15 || var7) {
            Rec0119 var16 = this.f9000.m2000(var1);
            if (var16.m12000()) {
               if (var15) {
                  var11 = true;
                  var12 = var10;
               }
            } else {
               float var17 = var16.m10000();
               float var18 = var16.m2000();
               float var19 = var16.m10000() + var16.m8000();
               float var20 = var16.m2000() + var16.m6000();
               if (var15 && !var11 && C0338.m18000(var3, var17, var18, var19, var20)) {
                  var11 = true;
               }

               if (var15
                  && var10
                  && C0338.m10000(
                     var3,
                     var2.m210000().m10000() + var6,
                     var2.m210000().m8000() + var6,
                     var2.m210000().m20000() + var6,
                     var2.m210000().m4000() + var6,
                     var17,
                     var18,
                     var19,
                     var20
                  )) {
                  var12 = true;
               }

               if (var7) {
                  var13 = m34000(var1, var2, var6, var17, var18, var19, var20);
               }
            }
         }

         byte var21 = 0;
         if (var11) {
            var21 |= 1;
         }

         if (var12) {
            var21 |= 2;
         }

         if (var13) {
            var21 |= 4;
         }

         return var21;
      }
   }

   private static boolean m34000(C0059 var0, rw.gui.C0019 var1, float var2, float var3, float var4, float var5, float var6) {
      float var7 = var0.m42000().m58000();
      float var8 = var0.m42000().m8000();
      float var9 = Math.max(0.0F, var0.m42000().m48000());
      float var10 = Math.max(0.0F, var0.m42000().m22000());
      float var11 = var7 + var2;
      float var12 = var8 + var2;
      float var13 = var7 + Math.max(var2, var9 - var2);
      float var14 = var8 + Math.max(var2, var10 - var2);
      Rec0108 var15 = new Rec0108(var11, var12, Math.max(var11, var13), Math.max(var12, var14));
      return !C0338.m10000(var15, var1.m210000().m10000(), var1.m210000().m8000(), var1.m210000().m20000(), var1.m210000().m4000(), var3, var4, var5, var6);
   }

   private static Rec0112 m36000(C0334 var0, rw.gui.C0019 var1, Rec0108 var2, int var3, Rec0112 var4) {
      boolean var5 = (var3 & 4) != 0;
      List var6 = var5 ? var0.m2000() : var0.m22000();
      List var7 = var5 ? var0.m16000() : List.of();
      List var8 = var0.m10000();
      List var9 = var0.m52000();
      Iface0215 var10 = (var3 & 2) != 0 ? null : var0.m4000();
      Enum0036 var11 = var1.m88000();
      boolean var12 = var11 != Enum0036.f3000;
      boolean var13 = var2 != null && var2.m12000() && (var3 & 1) == 0 && var10 == null;
      int var14 = var8.size() + var4.m4000() + (var12 ? var9.size() : 0);
      int var15 = var6.size() + var14 + (var12 ? 0 : var9.size()) + var7.size();
      ArrayList var16 = new ArrayList(var6.size() + var8.size() + var4.m6000().size() + var9.size() + var7.size() + 1);
      var16.addAll(var6);
      if (var14 > 0) {
         if (var10 == null && !var13) {
            var16.addAll(var8);
            var16.addAll(var4.m6000());
            if (var12) {
               var16.addAll(var9);
            }
         } else {
            ArrayList var17 = new ArrayList(var8.size() + var4.m6000().size() + (var12 ? var9.size() : 0));
            var17.addAll(var8);
            var17.addAll(var4.m6000());
            if (var12) {
               var17.addAll(var9);
            }

            Rec0051 var18 = var10 != null ? new Rec0051(var10, var17) : null;
            if (var13) {
               Object var19 = var18 != null ? List.of(var18) : var17;
               var16.add(new Rec0046(var2.m10000(), var2.m2000(), var2.m8000() - var2.m10000(), var2.m6000() - var2.m2000(), (List<Iface0216>)var19));
            } else {
               var16.add(var18);
            }
         }
      }

      if (!var12) {
         var16.addAll(var9);
      }

      var16.addAll(var7);
      return var16.isEmpty() ? Rec0112.f3000 : new Rec0112(var16, var15);
   }

   private Rec0112 m38000(C0059 var1, List<String> var2, C0330 var3, float var4, Rec0108 var5) {
      C0334 var6 = var1.m92000();
      if (C0338.m8000(var5)) {
         return Rec0112.f3000;
      } else {
         int var7 = var6.m20000(var5, var4);
         int var8 = var1.m182000();
         if (m20000(var1, var6, var7, var8)) {
            var3.f1000++;
            return m30000(var6);
         } else {
            rw.gui.C0019 var9 = var1.m78000();
            Rec0096 var10 = this.f5000.m8000(var1, var9);
            List var11 = C0404.m6000(var1);
            Rec0108 var12 = C0338.m14000(var1, var9);
            Rec0108 var13 = C0338.m16000(var12, var4, var5);
            boolean var14 = C0338.m6000(var5, var1, var4);
            if (m24000(var9, var11, var14)) {
               return Rec0112.f3000;
            } else if (m4000(var9)) {
               return Rec0112.f3000;
            } else {
               Rec0118 var15 = this.f4000.m22000(var1);
               int var16 = var6.m26000(var15);
               int var17 = var6.m30000(var12);
               int var18 = var6.m32000(var13, var4);
               int var19 = var1.m186000();
               int var20 = var1.m42000().m78000();
               int var21 = var1.m2000();
               int var22 = this.m32000(var1, var9, var12, var4, var5);
               if (m22000(var1, var8, var19, var20, var21, var16, var17, var18, var22, var11)) {
                  var3.f1000++;
                  var6.m36000(var7);
                  return m30000(var6);
               } else {
                  var3.f2000++;
                  m26000(var1, var2);
                  if (!m28000(var1, var19, var20, var21, var16, var17)) {
                     this.f6000.m10000(var1, var9, var10, var15, var12, var19, var20, var21, var16, var17);
                     var3.f3000++;
                  }

                  Rec0112 var23 = this.m48000(m10000(var11), var2, var3, var4, var13, C0338.m20000(var1));
                  boolean var24 = var14 && this.f7000.m12000(var1, var9, var10, var15);
                  if (!var24 && var23.m4000() == 0) {
                     return Rec0112.f3000;
                  } else {
                     Rec0112 var25 = m36000(var6, var9, var12, var22, var23);
                     var25 = this.m56000(var1, var9, var25);
                     var6.m48000(var25.m6000(), var25.m4000(), var8, var18, var22, var7);
                     return m30000(var6);
                  }
               }
            }
         }
      }
   }

   C0346 m40000(C0059 var1, float var2, float var3, Rec0089 var4, boolean var5) {
      if (var1 == null) {
         return C0346.m14000();
      } else {
         Rec0089 var6 = var4 == null ? Rec0089.f3000 : var4;
         C0330 var7 = new C0330();
         ArrayList var8 = new ArrayList();
         Rec0108 var9 = C0338.m22000(var2, var3);
         this.f10000 = var9;
         Rec0112 var10 = this.m38000(var1, var8, var7, 0.0F, var9);
         var1.m40000();
         Rec0112 var11 = this.m12000(var1, var10, var8, var7);
         this.f8000.m8000(var1, var11.m4000(), var7, var6);
         return this.f8000.m6000(var1, var11, var8, var5);
      }
   }

   C0346 m42000(C0059 var1, float var2, float var3) {
      return this.m40000(var1, var2, var3, Rec0089.f3000, false);
   }

   private Rec0112 m44000(C0059 var1, Rec0112 var2, TextRenderable$Styled var3, float var4) {
      Rec0119 var5 = m46000(this.f9000.m10000(var1), var3.N() + var4);
      if (var5.m12000()) {
         return Rec0112.f3000;
      } else {
         List var6 = List.of(new Rec0050(var5, var3, var2.m6000()));
         return new Rec0112(var6, var2.m4000());
      }
   }

   private static Rec0119 m46000(Rec0119 var0, float var1) {
      return var1 <= 0.0F ? var0 : new Rec0119(var0.m10000() - var1, var0.m2000() - var1, var0.m8000() + var1 * 2.0F, var0.m6000() + var1 * 2.0F);
   }

   private Rec0112 m48000(List<C0059> var1, List<String> var2, C0330 var3, float var4, Rec0108 var5, float var6) {
      if (var1.isEmpty()) {
         return Rec0112.f3000;
      } else {
         boolean var7 = var6 > 0.0F;
         ArrayList var8 = new ArrayList(var1.size() + 1);
         int var9 = 0;
         ArrayList var10 = null;
         int var11 = 0;
         ArrayList var12 = null;
         float var13 = 0.0F;
         int var14 = 0;

         for (C0059 var16 : var1) {
            boolean var17 = C0385.m4000(var16);
            float var18 = !var17 ? var4 : var4 - var6;
            Rec0112 var19 = this.m38000(var16, var2, var3, var18, var5);
            if (!var19.m6000().isEmpty()) {
               if (var7 && var17) {
                  var9 += m18000(var8, var12, var14);
                  var14 = 0;
                  if (var10 == null) {
                     var10 = new ArrayList();
                  }

                  var10.addAll(var19.m6000());
                  var11 += var19.m4000();
               } else {
                  if (var10 != null) {
                     var8.add(Rec0048.m14000(0.0F, -var6, var10));
                     var9 += var11;
                     var10 = null;
                     var11 = 0;
                  }

                  Rec0050 var20 = m50000(var19);
                  if (var20 == null) {
                     var9 += m18000(var8, var12, var14);
                     var14 = 0;
                     var8.addAll(var19.m6000());
                     var9 += var19.m4000();
                  } else {
                     float var21 = ((Rec0122)var20.m6000()).m4000();
                     boolean var22 = var12 != null && !var12.isEmpty() && var21 == var13 && !m16000(var12, var20.m8000());
                     if (!var22) {
                        var9 += m18000(var8, var12, var14);
                        var14 = 0;
                        if (var12 == null) {
                           var12 = new ArrayList();
                        }

                        var13 = var21;
                     }

                     var12.add(var20);
                     var14 += var19.m4000();
                  }
               }
            }
         }

         var9 += m18000(var8, var12, var14);
         if (var10 != null) {
            var8.add(Rec0048.m14000(0.0F, -var6, var10));
            var9 += var11;
         }

         return var8.isEmpty() ? Rec0112.f3000 : new Rec0112(var8, var9);
      }
   }

   private static Rec0050 m50000(Rec0112 var0) {
      List var1 = var0.m6000();
      return var1.size() == 1 && var1.get(0) instanceof Rec0050 var2 && var2.m6000() instanceof Rec0122 ? var2 : null;
   }

   private static Rec0112 m52000(float var0, Rec0112 var1) {
      List var2 = List.of(new Rec0045(var0, var1.m6000()));
      return new Rec0112(var2, var1.m4000());
   }

   private static boolean m54000(rw.gui.C0019 var0) {
      return var0.m224000() != 1.0F || var0.m86000() != 0.0F;
   }

   private Rec0112 m56000(C0059 var1, rw.gui.C0019 var2, Rec0112 var3) {
      if (var3.m4000() == 0) {
         return var3;
      } else {
         float var4 = 0.0F;
         boolean var5 = m2000(var2);
         if (var5) {
            Rec0109 var6 = new Rec0109(var2.m40000());
            var3 = this.m44000(var1, var3, var6, var4);
            if (var3.m4000() == 0) {
               return var3;
            }

            var4 += var6.m6000();
         }

         if (m8000(var2)) {
            if (!var5 && this.f9000.m22000(var1)) {
               var3 = m52000(var2.m84000(), var3);
            } else {
               var3 = this.m44000(var1, var3, new Rec0122(var2.m84000()), var4);
            }
         }

         if (m54000(var2) && var3.m4000() > 0) {
            float var8 = var1.m42000().m58000() + var1.m42000().m48000() / 2.0F;
            float var7 = var1.m42000().m8000() + var1.m42000().m22000() / 2.0F;
            var3 = this.m44000(var1, var3, new Rec0113(var8, var7, var2.m224000(), var2.m86000()), var4);
         }

         return var3;
      }
   }
}
