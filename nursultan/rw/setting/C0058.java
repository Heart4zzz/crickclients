package rw.setting;

import java.util.Objects;
import net.minecraft.server.network.FilteredText;
import rw.core.C0310;
import rw.core.C0317;
import rw.core.C0391;
import rw.data.Rec0102;
import rw.defs.Enum0026;
import rw.defs.Enum0047;

public final class C0058 {
   private static final int f1000 = 259;
   private static final int f2000 = 261;
   private static final int f3000 = 257;
   private static final int f4000 = 335;
   private static final int f5000 = 263;
   private static final int f6000 = 262;
   private static final int f7000 = 268;
   private static final int f8000 = 269;
   private final rw.gui.C0013 f9000;
   private final C0065 f10000;

   private boolean m2000(C0059 var1) {
      String var2 = C0391.m2000(this.f9000.m14000().m2000());
      return var2.isEmpty() ? true : this.m22000(var1, var2);
   }

   private static boolean m4000(C0059 var0) {
      return var0 != null && var0.m120000() == Enum0047.f3000;
   }

   public C0058(rw.gui.C0013 var1) {
      this.f9000 = Objects.requireNonNull(var1, "context");
      this.f10000 = C0065.m38000(var1);
   }

   private boolean m6000(C0059 var1) {
      String var2 = var1.m32000();
      boolean var3 = this.f10000.m30000(var1);
      this.m12000(var1, var2);
      return var3;
   }

   private boolean m8000(C0059 var1) {
      String var2 = var1.m32000();
      boolean var3 = this.f10000.m42000(var1);
      this.m12000(var1, var2);
      return var3;
   }

   private boolean m10000(C0059 var1) {
      this.m18000(var1);
      FilteredText var2 = this.f10000.m12000(var1);
      if (!var2.N() && var1.m32000().isEmpty()) {
         return true;
      } else {
         if (!var2.N()) {
            this.f10000.m2000(var1);
         }

         return this.m6000(var1);
      }
   }

   private void m12000(C0059 var1, String var2) {
      String var3 = var1.m32000();
      if (!var2.equals(var3)) {
         C0317.m2000(new C0310(Enum0026.f9000, var1, var2, var3));
      }
   }

   public boolean m14000(C0059 var1, int var2) {
      if (!m4000(var1)) {
         return false;
      } else {
         return switch (var2) {
            case 65, 97 -> this.f10000.m2000(var1);
            case 67, 99 -> this.m18000(var1);
            case 86, 118 -> this.m2000(var1);
            case 88, 120 -> this.m10000(var1);
            default -> false;
         };
      }
   }

   public boolean m16000(C0059 var1, int var2, Rec0102 var3, boolean var4) {
      if (!m4000(var1)) {
         return false;
      } else {
         boolean var5 = var3 != null && var3.m8000();

         return switch (var2) {
            case 257, 335 -> this.m24000(var1);
            case 259 -> this.m8000(var1);
            case 261 -> this.m6000(var1);
            case 262 -> this.f10000.m26000(var1, var5);
            case 263 -> this.f10000.m34000(var1, var5);
            case 268 -> this.f10000.m6000(var1, var5);
            case 269 -> this.f10000.m16000(var1, var5);
            default -> false;
         };
      }
   }

   private boolean m18000(C0059 var1) {
      FilteredText var2 = this.f10000.m12000(var1);
      String var3 = var1.m32000();
      if (!var2.N()) {
         this.f9000.m14000().m4000(var3);
      } else {
         this.f9000.m14000().m4000(var3.substring(var2.R(), var2.M()));
      }

      return true;
   }

   public boolean m20000(C0059 var1, int var2) {
      if (m4000(var1) && Character.isValidCodePoint(var2) && !Character.isISOControl(var2)) {
         String var3 = C0391.m2000(new String(Character.toChars(var2)));
         return var3.isEmpty() ? false : this.m22000(var1, var3);
      } else {
         return false;
      }
   }

   private boolean m22000(C0059 var1, String var2) {
      String var3 = var1.m32000();
      boolean var4 = this.f10000.m40000(var1, var2);
      this.m12000(var1, var3);
      return var4;
   }

   private boolean m24000(C0059 var1) {
      C0317.m2000(new C0310(Enum0026.f10000, var1, var1.m32000(), var1.m32000()));
      return true;
   }
}
