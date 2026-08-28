package rw.setting;

import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Objects;
import net.minecraft.server.network.FilteredText;
import rw.core.C0391;
import rw.core.C0406;
import rw.core.C0414;
import rw.defs.Enum0047;

public final class C0065 {
   private final C0060 f1000;
   private final Map<C0059, C0406> f2000 = new IdentityHashMap<>();

   public boolean m2000(C0059 var1) {
      if (!m8000(var1)) {
         return false;
      } else {
         C0406 var2 = this.m58000(var1);
         this.m56000(var2, var1.m32000());
         int var3 = var2.f1000;
         int var4 = var2.f2000;
         float var5 = var2.f3000;
         var2.f2000 = 0;
         var2.f1000 = var1.m32000().length();
         this.m24000(var1, var2);
         return this.m36000(var1, var2, var3, var4, var5);
      }
   }

   private static boolean m4000(C0059 var0, C0406 var1) {
      return C0414.m2000(var0.m32000(), var1.f2000, var1.f1000);
   }

   public boolean m6000(C0059 var1, boolean var2) {
      return !m8000(var1) ? false : this.m46000(var1, this.m58000(var1), 0, var2);
   }

   private static boolean m8000(C0059 var0) {
      return var0 != null && var0.m120000() == Enum0047.f3000;
   }

   private C0065(rw.gui.C0013 var1) {
      this.f1000 = new C0060(var1);
   }

   public FilteredText m12000(C0059 var1) {
      if (!m8000(var1)) {
         return FilteredText.N;
      } else {
         C0406 var2 = this.m58000(var1);
         this.m56000(var2, var1.m32000());
         this.m24000(var1, var2);
         return this.m54000(var1, var2);
      }
   }

   private static int m14000(C0059 var0, C0406 var1) {
      return C0414.m8000(var0.m32000(), var1.f2000, var1.f1000);
   }

   public boolean m16000(C0059 var1, boolean var2) {
      return !m8000(var1) ? false : this.m46000(var1, this.m58000(var1), var1.m32000().length(), var2);
   }

   private static int m18000(C0059 var0, C0406 var1) {
      return C0414.m12000(var0.m32000(), var1.f2000, var1.f1000);
   }

   public boolean m20000(C0059 var1) {
      if (!m8000(var1)) {
         return false;
      } else {
         C0406 var2 = this.m58000(var1);
         if (!var2.f4000) {
            return false;
         } else {
            var2.f4000 = false;
            return true;
         }
      }
   }

   private void m24000(C0059 var1, C0406 var2) {
      var2.f3000 = this.f1000.m6000(var1, var2.f1000, var2.f3000);
   }

   public boolean m26000(C0059 var1, boolean var2) {
      if (!m8000(var1)) {
         return false;
      } else {
         C0406 var3 = this.m58000(var1);
         return this.m46000(var1, var3, C0414.m4000(var1.m32000(), var3.f1000), var2);
      }
   }

   public boolean m28000(C0059 var1, float var2) {
      if (!m8000(var1)) {
         return false;
      } else {
         C0406 var3 = this.m58000(var1);
         if (!var3.f4000) {
            return false;
         } else {
            this.m56000(var3, var1.m32000());
            int var4 = var3.f1000;
            int var5 = var3.f2000;
            float var6 = var3.f3000;
            var3.f1000 = this.f1000.m8000(var1, var2, var3.f3000);
            this.m24000(var1, var3);
            return this.m36000(var1, var3, var4, var5, var6);
         }
      }
   }

   public boolean m30000(C0059 var1) {
      if (!m8000(var1)) {
         return false;
      } else {
         C0406 var2 = this.m58000(var1);
         String var3 = var1.m32000();
         this.m56000(var2, var3);
         if (m4000(var1, var2)) {
            return this.m44000(var1, var2, "");
         } else if (var2.f1000 >= var3.length()) {
            return false;
         } else {
            int var4 = C0414.m4000(var3, var2.f1000);
            return this.m48000(var1, var2, var2.f1000, var4, "");
         }
      }
   }

   private static boolean m32000(C0406 var0, int var1, int var2, float var3) {
      return var1 != var0.f1000 || var2 != var0.f2000 || Float.compare(var3, var0.f3000) != 0;
   }

   public boolean m34000(C0059 var1, boolean var2) {
      if (!m8000(var1)) {
         return false;
      } else {
         C0406 var3 = this.m58000(var1);
         return this.m46000(var1, var3, C0414.m6000(var1.m32000(), var3.f1000), var2);
      }
   }

   private boolean m36000(C0059 var1, C0406 var2, int var3, int var4, float var5) {
      if (!m32000(var2, var3, var4, var5)) {
         return false;
      } else {
         var1.m56000(1);
         return true;
      }
   }

   public static C0065 m38000(rw.gui.C0013 var0) {
      return var0.m10000(C0065.class).orElseGet(() -> {
         C0065 var1 = new C0065(Objects.requireNonNull(var0, "context"));
         var0.m12000(C0065.class, var1);
         return var1;
      });
   }

   public boolean m40000(C0059 var1, String var2) {
      if (!m8000(var1)) {
         return false;
      } else {
         String var3 = C0391.m2000(var2);
         C0406 var4 = this.m58000(var1);
         this.m56000(var4, var1.m32000());
         return var3.isEmpty() && !m4000(var1, var4) ? false : this.m44000(var1, var4, var3);
      }
   }

   public boolean m42000(C0059 var1) {
      if (!m8000(var1)) {
         return false;
      } else {
         C0406 var2 = this.m58000(var1);
         String var3 = var1.m32000();
         this.m56000(var2, var3);
         if (m4000(var1, var2)) {
            return this.m44000(var1, var2, "");
         } else if (var2.f1000 <= 0) {
            return false;
         } else {
            int var4 = C0414.m6000(var3, var2.f1000);
            return this.m48000(var1, var2, var4, var2.f1000, "");
         }
      }
   }

   private boolean m44000(C0059 var1, C0406 var2, String var3) {
      return this.m48000(var1, var2, m18000(var1, var2), m14000(var1, var2), var3);
   }

   private boolean m46000(C0059 var1, C0406 var2, int var3, boolean var4) {
      String var5 = var1.m32000();
      this.m56000(var2, var5);
      int var6 = var2.f1000;
      int var7 = var2.f2000;
      float var8 = var2.f3000;
      int var9 = C0414.m10000(var5, var3);
      var2.f1000 = var9;
      if (!var4) {
         var2.f2000 = var9;
      }

      this.m24000(var1, var2);
      return this.m36000(var1, var2, var6, var7, var8);
   }

   private boolean m48000(C0059 var1, C0406 var2, int var3, int var4, String var5) {
      String var6 = var1.m32000();
      int var7 = var2.f1000;
      int var8 = var2.f2000;
      float var9 = var2.f3000;
      int var10 = C0414.m12000(var6, var3, var4);
      String var11 = C0391.m4000(var6, var10, var4, var5);
      int var12 = C0414.m10000(var11, var10 + var5.length());
      var2.f1000 = var12;
      var2.f2000 = var12;
      if (!var6.equals(var11)) {
         var1.m140000(var11);
      }

      this.m24000(var1, var2);
      boolean var13 = m32000(var2, var7, var8, var9);
      if (var13 && var6.equals(var11)) {
         var1.m56000(1);
      }

      return !var6.equals(var11) || var13;
   }

   public boolean m50000(C0059 var1, float var2) {
      if (!m8000(var1)) {
         return false;
      } else {
         C0406 var3 = this.m58000(var1);
         this.m56000(var3, var1.m32000());
         int var4 = var3.f1000;
         int var5 = var3.f2000;
         float var6 = var3.f3000;
         boolean var7 = var3.f4000;
         int var8 = this.f1000.m8000(var1, var2, var3.f3000);
         var3.f1000 = var8;
         var3.f2000 = var8;
         var3.f4000 = true;
         this.m24000(var1, var3);
         boolean var9 = var4 != var3.f1000 || var5 != var3.f2000 || Float.compare(var6, var3.f3000) != 0 || !var7;
         if (var9) {
            var1.m56000(1);
         }

         return var9;
      }
   }

   public void m52000(C0059 var1, C0059 var2) {
      if (m8000(var1) && var1 != var2) {
         C0406 var3 = this.m58000(var1);
         boolean var4 = m4000(var1, var3);
         var3.f4000 = false;
         var3.f2000 = var3.f1000;
         if (var4) {
            var1.m56000(1);
         }
      }

      if (m8000(var2)) {
         this.m56000(this.m58000(var2), var2.m32000());
      }
   }

   private FilteredText m54000(C0059 var1, C0406 var2) {
      String var3 = var1.m32000();
      boolean var4 = var3.isEmpty() && !var1.m46000().isEmpty();
      String var5 = var4 ? var1.m46000() : var3;
      return new FilteredText(var3, var5, var4, var2.f1000, m18000(var1, var2), m14000(var1, var2), var4 ? 0.0F : var2.f3000);
   }

   private void m56000(C0406 var1, String var2) {
      var1.f1000 = C0414.m10000(var2, var1.f1000);
      var1.f2000 = C0414.m10000(var2, var1.f2000);
   }

   private C0406 m58000(C0059 var1) {
      return this.f2000.computeIfAbsent(var1, var0 -> new C0406());
   }
}
