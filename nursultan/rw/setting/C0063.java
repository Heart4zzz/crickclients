package rw.setting;

import java.util.Map;
import java.util.Objects;
import java.util.logging.Logger;
import rw.core.C0387;
import rw.core.C0393;
import rw.core.C0394;
import rw.core.C0400;
import rw.core.C0411;
import rw.data.Rec0089;
import rw.data.Rec0132;
import rw.data.Rec0133;

public final class C0063 {
   private static final Logger f1000;
   private static final int f2000 = 8192;
   private static final C0400 f3000;
   private final rw.gui.C0013 f4000;
   private final rw.gui.C0020 f5000;
   private final Map<C0059, C0411> f6000 = new C0394(this, 256, 0.75F, true);
   private C0393 f7000 = new C0393();
   private int f8000;

   C0063(rw.gui.C0013 var1) {
      this.f4000 = Objects.requireNonNull(var1, "context");
      this.f5000 = rw.gui.C0020.m22000(var1);
   }

   rw.gui.C0020 m4000() {
      return this.f5000;
   }

   private static String m6000(C0059 var0) {
      String var1 = var0.m154000();
      return var1 != null && !var1.isBlank() ? var1 : "<anonymous>";
   }

   private C0411 m8000(C0059 var1, rw.gui.C0019 var2) {
      C0411 var3 = this.f6000.computeIfAbsent(var1, var0 -> new C0411());
      int var4 = var1.m82000();
      int var5 = var1.m70000();
      int var6 = this.f4000.m6000().m2000();
      if (!var3.f5000 || var3.f2000 != var4 || var3.f3000 != var5 || var3.f4000 != var6) {
         var3.f5000 = true;
         var3.f2000 = var4;
         var3.f3000 = var5;
         var3.f4000 = var6;
         var3.f6000 = null;
         var3.f7000.clear();
      }

      return var3;
   }

   public boolean m12000(C0059 var1, float var2, float var3, Rec0089 var4) {
      if (var1 == null) {
         return false;
      } else {
         Rec0089 var5 = var4 == null ? Rec0089.f3000 : var4;
         C0062 var6 = new C0062(this, var1, Math.max(0.0F, var2), Math.max(0.0F, var3), this.f4000.m6000().m4000(), ++this.f8000);
         var6.m6000();
         this.f7000 = var6.m8000();
         C0393 var7 = this.f7000;
         if (var5.m8000()) {
            f1000.info(
               () -> "Layout rebuilt for root='"
                  + m6000(var1)
                  + "', viewport="
                  + var6.m12000()
                  + "x"
                  + var6.m2000()
                  + ", epoch="
                  + var6.m10000()
                  + ", metadataNodes="
                  + var7.f1000
                  + ", intrinsicNodes="
                  + var7.f2000
                  + ", widthSizingNodes="
                  + var7.f3000
                  + ", heightSizingNodes="
                  + var7.f4000
                  + ", textWrapNodes="
                  + var7.f5000
                  + ", heightRecomputeNodes="
                  + var7.f6000
                  + ", positioningNodes="
                  + var7.f7000
            );
         }

         return true;
      }
   }

   public boolean m16000(C0059 var1, float var2, float var3) {
      return this.m12000(var1, var2, var3, Rec0089.f3000);
   }

   public static C0063 m18000(rw.gui.C0013 var0) {
      rw.gui.C0013 var1 = Objects.requireNonNull(var0, "context");
      return var1.m10000(C0063.class).orElseGet(() -> {
         C0063 var1x = new C0063(var1);
         var1.m12000(C0063.class, var1x);
         return var1x;
      });
   }

   C0393 m20000() {
      return this.f7000;
   }

   Rec0133 m22000(C0059 var1, rw.gui.C0019 var2) {
      C0411 var3 = this.m8000(var1, var2);
      if (var3.f6000 != null) {
         return var3.f6000;
      } else {
         var3.f6000 = C0064.m8000(this.f4000, var1.m32000(), var2.m78000(), var2.m24000());
         return var3.f6000;
      }
   }

   Rec0132 m24000(C0059 var1, rw.gui.C0019 var2, float var3) {
      C0411 var4 = this.m8000(var1, var2);
      int var5 = Float.floatToIntBits(var3);
      Rec0132 var6 = var4.f7000.get(var5);
      if (var6 != null) {
         return var6;
      } else {
         Rec0132 var7 = C0064.m10000(this.f4000, var1.m32000(), var3, var2.m78000(), var2.m24000(), this.m22000(var1, var2));
         var4.f7000.put(var5, var7);
         return var7;
      }
   }

   public boolean m26000(C0059 var1) {
      if (var1 == null) {
         return false;
      } else {
         C0393 var2 = new C0393();
         C0387 var3 = new C0387(var2, f3000, this.f4000.m6000().m4000(), false);
         var3.m12000(var1);
         var1.m4000(4);
         this.f7000 = var2;
         return true;
      }
   }
}
