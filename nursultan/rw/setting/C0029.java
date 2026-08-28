package rw.setting;

import java.util.Objects;
import rw.api.Iface0209;
import rw.api.Iface0212;
import rw.core.C0306;
import rw.core.C0308;
import rw.core.C0312;
import rw.core.C0317;
import rw.core.C0318;
import rw.core.C0319;
import rw.core.C0320;
import rw.data.Rec0101;
import rw.data.Rec0102;
import rw.defs.Enum0026;
import rw.defs.Enum0047;

final class C0029 implements Iface0209 {
   private static final int f1000 = 0;
   private static final int f2000 = 99;
   private static final int f3000 = 67;
   private static final int f4000 = 118;
   private static final int f5000 = 86;
   private static final int f6000 = 120;
   private static final int f7000 = 88;
   private final rw.gui.C0013 f8000;
   private final C0053 f9000;
   private final C0041 f10000;
   private final rw.gui.C0016 f11000;
   private final C0066 f12000;
   private final C0065 f13000;
   private final C0058 f14000;
   private C0059 f15000;
   private C0059 f16000;
   private C0059 f17000;
   private C0059 f18000;
   private C0059 f19000;
   private C0059 f20000;
   private float f21000;
   private float f22000;
   private boolean f23000;

   public Iface0212 m2000() {
      return this.f17000;
   }

   public boolean m4000(Iface0212 var1) {
      if (var1 == null) {
         this.m28000(null);
         return false;
      } else if (var1 instanceof C0059 var2 && var2.m20000() && m24000(this.f15000, var2)) {
         this.m28000(var2);
         this.f12000.m18000(var2);
         return true;
      } else {
         return false;
      }
   }

   private void m6000(C0059 var1) {
      if (this.f18000 != var1) {
         C0059 var2 = this.f18000;
         this.f18000 = var1;
         if (var2 != null) {
            this.f9000.m22000(var2, var2 == this.f16000, var2 == this.f17000, false);
         }

         if (var1 != null) {
            this.f9000.m22000(var1, var1 == this.f16000, var1 == this.f17000, true);
         }
      }
   }

   private float m8000(float var1) {
      return var1 / this.f8000.m6000().m4000();
   }

   private Rec0101 m10000() {
      return this.f15000 == null ? Rec0101.f4000 : this.f10000.m14000(this.f15000, this.f21000, this.f22000);
   }

   private static void m12000(C0059 var0) {
      var0.m130000(false);
      var0.m12000(false);
      var0.m106000(false);

      for (int var1 = 0; var1 < var0.m102000(); var1++) {
         m12000(var0.m148000(var1));
      }
   }

   C0029(rw.gui.C0013 var1) {
      this.f8000 = Objects.requireNonNull(var1, "context");
      this.f9000 = C0053.m20000(var1);
      this.f10000 = new C0041(var1);
      this.f11000 = rw.gui.C0016.m36000(var1);
      this.f12000 = C0066.m10000(var1);
      this.f13000 = C0065.m38000(var1);
      this.f14000 = new C0058(var1);
   }

   private static C0059 m14000(C0059 var0) {
      if (var0 == null) {
         return null;
      } else {
         for (C0059 var1 = var0; var1 != null; var1 = var1.m180000()) {
            if (var1.m164000(Enum0026.f4000)) {
               return var1;
            }
         }

         return m20000(var0);
      }
   }

   public Iface0212 m16000() {
      return this.f19000;
   }

   public Iface0212 m18000() {
      return this.f18000;
   }

   private static C0059 m20000(C0059 var0) {
      if (var0 == null) {
         return null;
      } else {
         for (C0059 var1 = var0; var1 != null; var1 = var1.m180000()) {
            if (var1.m20000()) {
               return var1;
            }
         }

         return var0;
      }
   }

   public void m22000(Iface0212 var1) {
      if (var1 instanceof C0059 var2) {
         if (m24000(var2, this.f17000)) {
            this.f12000.m14000(this.f17000, null);
            this.f13000.m52000(this.f17000, null);
            this.f17000 = null;
         }

         if (m24000(var2, this.f16000)) {
            C0059 var3 = var2.m180000();
            if (var3 != null) {
               this.m54000(var3);
            } else {
               this.f16000 = null;
            }
         }

         if (m24000(var2, this.f18000)) {
            this.f18000 = null;
         }

         if (m24000(var2, this.f19000)) {
            this.f19000 = null;
         }

         if (m24000(var2, this.f20000)) {
            this.f20000 = null;
         }

         m12000(var2);
      }
   }

   private static boolean m24000(C0059 var0, C0059 var1) {
      if (var0 != null && var1 != null) {
         for (C0059 var2 = var1; var2 != null; var2 = var2.m180000()) {
            if (var2 == var0) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   private void m26000(int var1, C0059 var2) {
      C0059 var3 = m20000(var2);
      C0059 var4 = this.f19000 != null ? this.f19000 : var3;
      if (var4 != null) {
         C0317.m2000(new C0318(Enum0026.f3000, var4, this.f21000, this.f22000, var1, false));
      }

      if (var1 == 0) {
         C0059 var5 = m14000(var2);
         if (this.f20000 != null && var5 == this.f20000 && var2 != null) {
            C0317.m2000(new C0318(Enum0026.f4000, var2, this.f21000, this.f22000, var1, false));
         }

         this.f20000 = null;
         if (this.f19000 != null && this.f19000.m120000() == Enum0047.f3000) {
            this.f13000.m20000(this.f19000);
         }

         this.f19000 = null;
         this.m6000(null);
      }
   }

   private void m28000(C0059 var1) {
      if (this.f17000 != var1) {
         C0059 var2 = this.f17000;
         this.f17000 = var1;
         if (var2 != null) {
            this.f9000.m22000(var2, var2 == this.f16000, false, var2 == this.f18000);
            C0317.m2000(new C0320(Enum0026.f12000, var2, var1));
         }

         if (var1 != null) {
            this.f9000.m22000(var1, var1 == this.f16000, true, var1 == this.f18000);
            C0317.m2000(new C0320(Enum0026.f11000, var1, var2));
         }

         this.f12000.m14000(var2, var1);
         this.f13000.m52000(var2, var1);
      }
   }

   public Iface0212 m30000() {
      return this.f16000;
   }

   private float m32000(float var1) {
      return var1 / this.f8000.m6000().m4000();
   }

   private void m34000(int var1, C0059 var2) {
      C0059 var3 = m20000(var2);
      C0059 var4 = this.f19000 != null ? this.f19000 : var3;
      if (var4 != null) {
         C0317.m2000(new C0318(Enum0026.f2000, var4, this.f21000, this.f22000, var1, true));
      }

      if (var1 == 0) {
         this.f20000 = m14000(var2);
         this.f19000 = var3;
         this.m28000(var3 != null && var3.m20000() ? var3 : null);
         this.m6000(var3);
         if (var3 != null && var3.m120000() == Enum0047.f3000) {
            this.f13000.m50000(var3, this.f21000);
         }

         this.f12000.m18000(var3);
      }
   }

   public void m36000(Iface0212 var1) {
      this.f12000.m14000(this.f17000, null);
      this.f13000.m52000(this.f17000, null);
      this.f15000 = (C0059)var1;
      this.f16000 = null;
      this.f17000 = null;
      this.f18000 = null;
      this.f19000 = null;
      this.f20000 = null;
      this.f23000 = false;
      this.f11000.m30000(this.f15000);
   }

   private void m38000(Rec0101 var1) {
      if (var1.m12000()) {
         this.f11000.m38000(var1.m2000(), var1.m8000());
      } else {
         this.f11000.m38000(null, null);
      }
   }

   private static C0059 m40000(C0059 var0, C0059 var1) {
      int var2 = m60000(var0);
      int var3 = m60000(var1);
      C0059 var4 = var0;

      C0059 var5;
      for (var5 = var1; var2 > var3 && var4 != null; var2--) {
         var4 = var4.m180000();
      }

      while (var3 > var2 && var5 != null) {
         var5 = var5.m180000();
         var3--;
      }

      while (var4 != var5) {
         if (var4 != null) {
            var4 = var4.m180000();
         }

         if (var5 != null) {
            var5 = var5.m180000();
         }
      }

      return var4;
   }

   private boolean m42000(C0059 var1, int var2) {
      if (this.f14000.m14000(var1, var2)) {
         return true;
      } else if (this.f17000 == null) {
         return false;
      } else if (var2 == 99 || var2 == 67) {
         this.f8000.m14000().m4000(this.f17000.m32000());
         return true;
      } else if (var2 == 120 || var2 == 88) {
         this.f8000.m14000().m4000(this.f17000.m32000());
         return true;
      } else if (var2 != 118 && var2 != 86) {
         return false;
      } else {
         this.f8000.m14000().m2000();
         return true;
      }
   }

   public void m44000(int var1, boolean var2, Rec0102 var3, boolean var4) {
      C0059 var5 = this.f17000 != null ? this.f17000 : this.f15000;
      if (var5 != null) {
         Enum0026 var6 = var2 ? Enum0026.f6000 : Enum0026.f7000;
         C0319 var7 = new C0319(var6, var5, var1, var2, var3, var4);
         C0317.m2000(var7);
         if (var2 && !var7.P() && !var7.m()) {
            if (!var4 && var3 != null && var3.m10000() && this.m42000(var5, var1)) {
               this.f12000.m18000(var5);
            } else {
               if (this.f14000.m16000(var5, var1, var3, var4)) {
                  this.f12000.m18000(var5);
               }
            }
         }
      }
   }

   public void m46000(int var1, boolean var2) {
      Rec0101 var3 = this.m10000();
      this.m54000(var3.m2000());
      if (var2) {
         if (var3.m12000() && var1 == 0) {
            this.f11000.m40000(var3.m2000(), var3.m8000(), this.f22000, var3.m6000());
         } else {
            this.m34000(var1, this.m48000(var3, var1));
         }
      } else {
         boolean var4 = var1 == 0 && this.f11000.m4000();
         this.m38000(var3);
         if (!var4) {
            this.m26000(var1, this.m48000(var3, var1));
         }
      }
   }

   private C0059 m48000(Rec0101 var1, int var2) {
      return var1.m12000() && var2 != 0 ? this.f10000.m4000(this.f15000, this.f21000, this.f22000) : var1.m2000();
   }

   public void m50000(int var1) {
      C0059 var2 = this.f17000 != null ? this.f17000 : this.f15000;
      if (var2 != null) {
         C0312 var3 = new C0312(var2, var1);
         C0317.m2000(var3);
         if (!var3.P() && !var3.m() && this.f14000.m20000(var2, var1)) {
            this.f12000.m18000(var2);
         }
      }
   }

   public void m52000(float var1, float var2) {
      var1 = this.m32000(var1);
      var2 = this.m8000(var2);
      if (!this.f23000 || Float.compare(this.f21000, var1) != 0 || Float.compare(this.f22000, var2) != 0) {
         this.f23000 = true;
         this.f21000 = var1;
         this.f22000 = var2;
         if (this.f19000 != null && this.f19000.m120000() == Enum0047.f3000) {
            this.f13000.m28000(this.f19000, this.f21000);
            this.f12000.m18000(this.f19000);
         }

         if (!this.f11000.m6000(this.f15000, this.f22000)) {
            Rec0101 var3 = this.m10000();
            this.m38000(var3);
            this.m54000(var3.m2000());
            C0059 var4 = this.f19000 != null ? this.f19000 : var3.m2000();
            if (var4 != null) {
               C0317.m2000(new C0318(Enum0026.f1000, var4, var1, var2, -1, false));
            }
         }
      }
   }

   private void m54000(C0059 var1) {
      if (this.f16000 != var1) {
         C0059 var2 = this.f16000;
         this.f16000 = var1;
         C0059 var3 = m40000(var2, var1);

         for (C0059 var4 = var2; var4 != null && var4 != var3; var4 = var4.m180000()) {
            this.f9000.m22000(var4, false, var4 == this.f17000, var4 == this.f18000);
         }

         for (C0059 var5 = var1; var5 != null && var5 != var3; var5 = var5.m180000()) {
            this.f9000.m22000(var5, true, var5 == this.f17000, var5 == this.f18000);
         }

         for (C0059 var6 = var2; var6 != null && var6 != var3; var6 = var6.m180000()) {
            C0317.m2000(new C0306(Enum0026.f14000, var6, this.f21000, this.f22000, var1));
         }

         for (C0059 var7 = var1; var7 != null && var7 != var3; var7 = var7.m180000()) {
            C0317.m2000(new C0306(Enum0026.f13000, var7, this.f21000, this.f22000, var2));
         }
      }
   }

   public void m56000() {
      if (this.f23000 && this.f15000 != null) {
         if (this.f19000 == null && !this.f11000.m28000()) {
            Rec0101 var1 = this.m10000();
            this.m38000(var1);
            this.m54000(var1.m2000());
         }
      }
   }

   public void m58000(float var1) {
      Rec0101 var2 = this.m10000();
      this.m54000(var2.m2000());
      if (this.f15000 != null) {
         C0059 var3 = this.f19000 != null ? this.f19000 : var2.m2000();
         if (var3 != null) {
            C0308 var4 = new C0308(var3, this.f21000, this.f22000, var1);
            C0317.m2000(var4);
            if (!var4.P() && !var4.m()) {
               this.f11000.m48000(var3, this.f15000, var1);
            }
         }
      }
   }

   private static int m60000(C0059 var0) {
      if (var0 == null) {
         return 0;
      } else if (var0.m16000() >= 0) {
         return var0.m16000();
      } else {
         int var1 = 0;

         for (C0059 var2 = var0; var2 != null; var2 = var2.m180000()) {
            var1++;
         }

         return var1;
      }
   }

   public void m62000() {
      this.m28000(null);
   }
}
