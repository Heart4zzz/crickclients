package rw.core;

import java.util.List;
import org.joml.Vector4f;
import rw.api.Iface0214;
import rw.data.Rec0096;
import rw.data.Rec0120;
import rw.data.Rec0130;
import rw.defs.Enum0033;
import rw.defs.Enum0045;
import rw.defs.Enum0047;
import rw.gui.C0016;
import rw.gui.C0019;

final class C0377 {
   private final C0016 f1000;

   C0377(rw.gui.C0013 var1) {
      this.f1000 = C0016.m36000(var1);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private static int m2000(Enum0045 var0, int var1, int var2, int var3) {
      return switch (C0369.f1000[var0.ordinal()]) {
         case 1 -> var1;
         case 2 -> var2;
         case 3 -> var3;
         default -> throw new MatchException(null, null);
      };
   }

   void m4000(rw.setting.C0059 var1, C0019 var2, Rec0096 var3, List<Iface0214> var4) {
      if (var1.m120000() != Enum0047.f2000) {
         if (var2.m100000() != Enum0033.f1000 && var3 != null) {
            Rec0130 var5 = var2.m226000();
            float var6 = var3.m4000() * 0.5F;
            float var7 = var3.m14000() * 0.5F;
            int var8 = m2000(this.f1000.m22000(var1), var5.m18000(), var5.m46000(), var5.m8000());
            if (C0248.m24000(var8)) {
               var4.add(new Rec0120(var3.m12000(), var3.m28000(), var3.m4000(), var3.m8000(), new Vector4f(var6, var6, var6, var6), var8, 0, 0.0F, 0, 0.0F));
            }

            int var9 = m2000(this.f1000.m2000(var1), var5.m12000(), var5.m14000(), var5.m20000());
            if (C0248.m24000(var9)) {
               var4.add(new Rec0120(var3.m10000(), var3.m16000(), var3.m14000(), var3.m22000(), new Vector4f(var7, var7, var7, var7), var9, 0, 0.0F, 0, 0.0F));
            }
         }
      }
   }

   boolean m6000(rw.setting.C0059 var1, C0019 var2, Rec0096 var3) {
      if (var2.m100000() != Enum0033.f1000 && var3 != null) {
         Rec0130 var4 = var2.m226000();
         int var5 = m2000(this.f1000.m22000(var1), var4.m18000(), var4.m46000(), var4.m8000());
         if (var3.m2000() > 0.0F && var3.m18000() > 0.0F && C0248.m24000(var5)) {
            return true;
         } else {
            int var6 = m2000(this.f1000.m2000(var1), var4.m12000(), var4.m14000(), var4.m20000());
            return var3.m14000() > 0.0F && var3.m22000() > 0.0F && C0248.m24000(var6);
         }
      } else {
         return false;
      }
   }

   Rec0096 m8000(rw.setting.C0059 var1, C0019 var2) {
      if (var1 == null || var2 == null) {
         return null;
      } else if (!var2.m142000()) {
         return null;
      } else if (var2.m100000() == Enum0033.f1000) {
         return null;
      } else if (var1.m42000().m14000() <= 0.0F) {
         return null;
      } else if (!(var1.m42000().m18000() <= 0.0F) && !(var1.m42000().m20000() <= 0.0F)) {
         Rec0130 var3 = var2.m226000();
         return var3.m40000() <= 0.0F ? null : this.f1000.m12000(var1);
      } else {
         return null;
      }
   }
}
