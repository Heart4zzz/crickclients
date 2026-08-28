package rw.core;

import java.util.ArrayDeque;
import java.util.Deque;
import rw.data.Rec0096;
import rw.data.Rec0108;
import rw.data.Rec0119;
import rw.defs.Enum0036;
import rw.defs.Enum0038;
import rw.defs.Enum0047;
import rw.gui.C0019;

final class C0342 {
   private static final int f1000 = 32;
   private final C0377 f2000;
   private final C0337 f3000;
   private final Deque<C0328> f4000 = new ArrayDeque<>();
   private final float[] f5000 = new float[128];
   private int f6000;
   private boolean f7000;

   Rec0119 m2000(rw.setting.C0059 var1) {
      C0328 var2 = this.m16000();

      Rec0119 var5;
      try {
         C0019 var3 = var1.m78000();
         if (var1.m120000() != Enum0047.f3000) {
            this.m12000(var1, var2);
            if (var3.m88000() != Enum0036.f3000) {
               this.m20000(this.f2000.m8000(var1, var3), var2);
            }

            this.m4000(var1, var2);
            return var2.m4000();
         }

         Rec0119 var4 = this.f3000.m16000(var1, var3);
         var2.m12000(var4.m10000(), var4.m2000(), var4.m8000(), var4.m6000());
         var5 = var2.m4000();
      } finally {
         this.m36000(var2);
      }

      return var5;
   }

   private void m4000(rw.setting.C0059 var1, C0328 var2) {
      float var3 = C0338.m20000(var1);

      for (rw.setting.C0059 var5 : C0404.m6000(var1)) {
         if (!C0385.m6000(var5)) {
            C0328 var6 = this.m16000();

            try {
               this.m26000(var5, var6);
               if (C0385.m4000(var5)) {
                  var6.m16000(0.0F, -var3);
               }

               var2.m14000(var6);
            } finally {
               this.m36000(var6);
            }
         }
      }
   }

   private static void m6000(rw.setting.C0059 var0, C0019 var1, C0328 var2) {
      if (!var2.m8000() && var1.m88000() != Enum0036.f1000) {
         Rec0108 var3 = C0338.m14000(var0, var1);
         if (var3 != null) {
            var2.m6000(var3.m10000(), var3.m2000(), var3.m8000(), var3.m6000());
         }
      }
   }

   C0342(C0377 var1, C0337 var2) {
      this.f2000 = var1;
      this.f3000 = var2;
   }

   private static void m8000(rw.setting.C0059 var0, C0328 var1) {
      var1.m12000(var0.m42000().m80000(), var0.m42000().m10000(), var0.m42000().m18000(), var0.m42000().m20000());
   }

   Rec0119 m10000(rw.setting.C0059 var1) {
      C0328 var2 = this.m16000();

      Rec0119 var3;
      try {
         this.m26000(var1, var2);
         var3 = var2.m4000();
      } finally {
         this.m36000(var2);
      }

      return var3;
   }

   private void m12000(rw.setting.C0059 var1, C0328 var2) {
      if (var1.m120000() == Enum0047.f2000) {
         if (var1.m94000() != null) {
            var2.m12000(var1.m42000().m58000(), var1.m42000().m8000(), var1.m42000().m48000(), var1.m42000().m22000());
         }
      } else if (var1.m120000() == Enum0047.f4000 && !var1.m32000().isEmpty()) {
         m8000(var1, var2);
      } else if (var1.m120000() == Enum0047.f3000) {
         m8000(var1, var2);
      } else {
         if (var1.m120000() == Enum0047.f5000 && !var1.m100000().isEmpty()) {
            m8000(var1, var2);
         }
      }
   }

   private void m14000(rw.setting.C0059 var1, C0019 var2, C0328 var3) {
      if (var1.m120000() != Enum0047.f2000) {
         boolean var4 = C0248.m24000(var2.m96000());
         boolean var5 = var2.m92000() > 0.0F && C0248.m24000(var2.m58000());
         boolean var6 = C0331.m4000(var2);
         if (var4 || var5 || var6) {
            float var7 = Math.max(0.0F, var2.m92000());
            float var8 = var5 && var2.m20000() == Enum0038.f2000 ? var7 : 0.0F;
            float var9 = var6 ? Math.max(0.0F, var2.m26000()) : 0.0F;
            float var10 = var8 + var9;
            var3.m12000(
               var1.m42000().m58000() - var10, var1.m42000().m8000() - var10, var1.m42000().m48000() + var10 * 2.0F, var1.m42000().m22000() + var10 * 2.0F
            );
         }
      }
   }

   private C0328 m16000() {
      C0328 var1 = this.f4000.pollFirst();
      if (var1 == null) {
         return new C0328();
      } else {
         var1.m10000();
         return var1;
      }
   }

   private void m18000(rw.setting.C0059 var1, C0019 var2, C0328 var3) {
      if (C0331.m6000(var2)) {
         var3.m12000(var1.m42000().m58000(), var1.m42000().m8000(), var1.m42000().m48000(), var1.m42000().m22000());
      }
   }

   private void m20000(Rec0096 var1, C0328 var2) {
      if (var1 != null) {
         var2.m12000(var1.m12000(), var1.m28000(), var1.m4000(), var1.m8000());
         var2.m12000(var1.m10000(), var1.m16000(), var1.m14000(), var1.m22000());
      }
   }

   boolean m22000(rw.setting.C0059 var1) {
      this.f7000 = true;
      this.f6000 = 0;
      this.m34000(var1, 0.0F, 0.0F, true);
      return this.f7000 && !this.m32000();
   }

   private void m24000(rw.setting.C0059 var1, float var2, float var3) {
      float var4 = var1.m42000().m80000() + var2;
      float var5 = var1.m42000().m10000() + var3;
      float var6 = var1.m42000().m18000();
      float var7 = var1.m42000().m20000();
      if (!(var6 <= 0.0F) && !(var7 <= 0.0F)) {
         if (Float.isFinite(var4) && Float.isFinite(var5) && Float.isFinite(var6) && Float.isFinite(var7)) {
            if (this.f6000 >= 32) {
               this.f7000 = false;
            } else {
               int var8 = this.f6000 * 4;
               this.f5000[var8] = var4;
               this.f5000[var8 + 1] = var5;
               this.f5000[var8 + 2] = var4 + var6;
               this.f5000[var8 + 3] = var5 + var7;
               this.f6000++;
            }
         }
      }
   }

   private void m26000(rw.setting.C0059 var1, C0328 var2) {
      C0019 var3 = var1.m78000();
      if (var3.m104000() && !(var3.m84000() <= 0.0F)) {
         C0328 var4 = this.m16000();

         try {
            Rec0096 var5 = this.f2000.m8000(var1, var3);
            this.m38000(var1, var3, var5, var4);
            this.m4000(var1, var4);
            m6000(var1, var3, var4);
            var2.m14000(var4);
         } finally {
            this.m36000(var4);
         }
      }
   }

   private boolean m28000(rw.setting.C0059 var1, C0019 var2, float var3, float var4) {
      Enum0047 var5 = var1.m120000();
      if (var5 == Enum0047.f2000) {
         return var1.m94000() == null;
      } else if (C0248.m24000(var2.m96000())) {
         return false;
      } else if (var2.m92000() > 0.0F && C0248.m24000(var2.m58000())) {
         return false;
      } else if (C0331.m4000(var2)) {
         return false;
      } else if (this.f2000.m6000(var1, var2, this.f2000.m8000(var1, var2))) {
         return false;
      } else if (var5 == Enum0047.f3000) {
         return false;
      } else {
         if (var5 == Enum0047.f4000 && !var1.m32000().isEmpty()) {
            this.m24000(var1, var3, var4);
         } else if (var5 == Enum0047.f5000 && !var1.m100000().isEmpty()) {
            this.m24000(var1, var3, var4);
         }

         return true;
      }
   }

   private static boolean m30000(C0019 var0) {
      return var0.m84000() > 0.0F && var0.m84000() < 1.0F || var0.m40000() > 0.0F;
   }

   private boolean m32000() {
      for (int var1 = 0; var1 < this.f6000; var1++) {
         int var2 = var1 * 4;
         float var3 = this.f5000[var2];
         float var4 = this.f5000[var2 + 1];
         float var5 = this.f5000[var2 + 2];
         float var6 = this.f5000[var2 + 3];

         for (int var7 = var1 + 1; var7 < this.f6000; var7++) {
            int var8 = var7 * 4;
            if (var3 < this.f5000[var8 + 2] && this.f5000[var8] < var5 && var4 < this.f5000[var8 + 3] && this.f5000[var8 + 1] < var6) {
               return true;
            }
         }
      }

      return false;
   }

   private void m34000(rw.setting.C0059 var1, float var2, float var3, boolean var4) {
      if (this.f7000) {
         C0019 var5 = var1.m78000();
         if (var5.m104000() && !(var5.m84000() <= 0.0F)) {
            if (!var4 && m30000(var5)) {
               this.f7000 = false;
            } else if (C0331.m6000(var5)) {
               this.f7000 = false;
            } else if (!this.m28000(var1, var5, var2, var3)) {
               this.f7000 = false;
            } else {
               float var6 = C0338.m20000(var1);

               for (rw.setting.C0059 var8 : C0404.m6000(var1)) {
                  if (!C0385.m6000(var8)) {
                     float var10 = var3 + (C0385.m4000(var8) ? -var6 : 0.0F);
                     this.m34000(var8, var2, var10, false);
                     if (!this.f7000) {
                        return;
                     }
                  }
               }
            }
         }
      }
   }

   private void m36000(C0328 var1) {
      this.f4000.push(var1);
   }

   private void m38000(rw.setting.C0059 var1, C0019 var2, Rec0096 var3, C0328 var4) {
      this.m18000(var1, var2, var4);
      this.m14000(var1, var2, var4);
      this.m12000(var1, var4);
      this.m20000(var3, var4);
   }
}
