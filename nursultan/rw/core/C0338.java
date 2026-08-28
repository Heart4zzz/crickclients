package rw.core;

import rw.data.Rec0103;
import rw.data.Rec0108;
import rw.gui.C0019;

final class C0338 {
   private static final Rec0108 f1000;

   private C0338() {
   }

   static boolean m2000(Rec0108 var0, float var1, Rec0108 var2) {
      return var0.m10000() <= var2.m10000() && var0.m2000() + var1 <= var2.m2000() && var0.m8000() >= var2.m8000() && var0.m6000() + var1 >= var2.m6000();
   }

   private static Rec0103 m4000(Rec0108 var0) {
      return var0 == null ? null : new Rec0103(var0.m10000(), var0.m2000(), var0.m8000(), var0.m6000());
   }

   static boolean m6000(Rec0108 var0, rw.setting.C0059 var1, float var2) {
      return C0307.m18000(var1, var2).m12000(m4000(var0));
   }

   static boolean m8000(Rec0108 var0) {
      return var0.m8000() <= var0.m10000() || var0.m6000() <= var0.m2000();
   }

   static boolean m10000(Rec0108 var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      if (!m18000(var0, var5, var6, var7, var8)) {
         return false;
      } else if (var5 < var0.m10000() + var1 && var6 < var0.m2000() + var1) {
         return false;
      } else if (var7 > var0.m8000() - var2 && var6 < var0.m2000() + var2) {
         return false;
      } else {
         return var7 > var0.m8000() - var3 && var8 > var0.m6000() - var3 ? false : !(var5 < var0.m10000() + var4) || !(var8 > var0.m6000() - var4);
      }
   }

   private static Rec0108 m12000(Rec0103 var0) {
      return var0 == null ? null : new Rec0108(var0.m10000(), var0.m2000(), var0.m8000(), var0.m6000());
   }

   static Rec0108 m14000(rw.setting.C0059 var0, C0019 var1) {
      return m12000(C0307.m12000(var0, var1));
   }

   static Rec0108 m16000(Rec0108 var0, float var1, Rec0108 var2) {
      return var0 == null ? var2 : m12000(C0307.m20000(m4000(var0), var1, m4000(var2)));
   }

   static boolean m18000(Rec0108 var0, float var1, float var2, float var3, float var4) {
      return var1 >= var0.m10000() && var2 >= var0.m2000() && var3 <= var0.m8000() && var4 <= var0.m6000();
   }

   static float m20000(rw.setting.C0059 var0) {
      return C0307.m22000(var0);
   }

   static Rec0108 m22000(float var0, float var1) {
      return Float.isFinite(var0) && Float.isFinite(var1) ? new Rec0108(0.0F, 0.0F, Math.max(0.0F, var0), Math.max(0.0F, var1)) : f1000;
   }
}
