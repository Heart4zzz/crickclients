package rw.defs;

import java.util.Objects;
import rw.api.Iface0192;
import rw.api.Iface0203;
import rw.core.C0264;
import rw.core.C0370;
import rw.data.Rec0066;
import rw.data.Rec0076;
import rw.data.Rec0125;
import rw.data.Rec0126;
import rw.data.Rec0131;
import rw.gui.C0019;
import rw.setting.C0026;
import rw.setting.C0027;

public enum Enum0019 {
   f1000,
   f2000,
   f3000,
   f4000,
   f5000,
   f6000,
   f7000,
   f8000,
   f9000,
   f10000,
   f11000,
   f12000,
   f13000,
   f14000,
   f15000,
   f16000,
   f17000,
   f18000,
   f19000,
   f20000,
   f21000;

   private final Enum0041 f22000;

   public boolean m2000(C0019 var1, C0019 var2) {
      return switch (this) {
         case f4000 -> var1.m210000().m2000() && var2.m210000().m2000();
         case f6000 -> var1.m150000().m2000() && var2.m150000().m2000();
         case f17000 -> m32000(var1.m32000(), var2.m32000());
         case f18000 -> m32000(var1.m220000(), var2.m220000());
         default -> true;
      };
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private static Rec0125 m4000(C0026 var0, float var1) {
      Rec0125 var2 = var0.m16000();
      Rec0125 var3 = var0.m14000();
      if (var2 != null && var3 != null && var2.m20000() == var3.m20000()) {
         float var4 = C0264.m2000(var2.m14000(), var3.m14000(), var1);
         float var5 = C0264.m2000(var2.m36000(), var3.m36000(), var1);
         if (var5 < var4) {
            var5 = var4;
         }

         float var6 = C0264.m2000(var2.m8000(), var3.m8000(), var1);

         return switch (var2.m20000()) {
            case f4000 -> Rec0125.m24000(var6);
            case f3000 -> Rec0125.m28000(var6);
            case f1000 -> Rec0125.m32000(var4, var5);
            case f2000 -> Rec0125.m26000(var4, var5);
         };
      } else {
         return var3;
      }
   }

   public boolean m6000() {
      return this.f22000.m96000();
   }

   private Enum0019(Enum0041 var3) {
      this.f22000 = var3;
   }

   public static Enum0019[] m8000() {
      return (Enum0019[])f23000.clone();
   }

   public Enum0041 m12000() {
      return this.f22000;
   }

   public boolean m14000() {
      return this.f22000.m38000();
   }

   public void m16000(Iface0192 var1) {
      if (!this.m34000(var1)) {
         throw new IllegalArgumentException(this.name() + " does not support transition spec " + var1.getClass().getName());
      }
   }

   private static Rec0066 m18000(C0026 var0, float var1) {
      Rec0066 var2 = var0.m26000();
      Rec0066 var3 = var0.m46000();
      if (var2 != null && var3 != null) {
         return Rec0066.m14000(C0264.m2000(var2.m10000(), var3.m10000(), var1), C0264.m2000(var2.m4000(), var3.m4000(), var1));
      } else {
         return var3 == null ? Rec0066.f3000 : var3;
      }
   }

   public C0019 m20000(C0019 var1, C0019 var2) {
      return switch (this) {
         case f1000 -> var2.m146000(var1.m96000());
         case f2000 -> var2.m120000(var1.m58000());
         case f3000 -> var2.m62000(var1.m222000());
         case f4000 -> var2.m166000(var1.m180000());
         case f5000 -> var2.m18000(var1.m92000());
         case f6000 -> var2.m154000(var1.m150000());
         case f7000 -> var2.m14000(var1.m112000().m2000());
         case f8000 -> var2.m126000(var1.m112000().m8000());
         case f9000 -> var2.m66000(var1.m112000().m6000());
         case f10000 -> var2.m214000(var1.m112000().m20000());
         case f11000 -> var2.m36000(var1.m108000());
         case f12000 -> var2.m54000(var1.m106000());
         case f13000 -> var2.m184000(var1.m80000());
         case f14000 -> var2.m136000(var1.m102000());
         case f15000 -> var2.m118000(var1.m224000());
         case f16000 -> var2.m114000(var1.m86000());
         case f17000 -> var2.m198000(var1.m32000());
         case f18000 -> var2.m134000(var1.m220000());
         case f19000 -> var2.m212000(var1.m26000());
         case f20000 -> var2.m10000(var1.m56000());
         case f21000 -> var2.m74000(var1.m84000());
      };
   }

   public boolean m22000(C0019 var1, C0019 var2, Iface0192 var3) {
      return this.m34000(var3) && this.m2000(var1, var2);
   }

   public boolean m24000(C0019 var1, C0019 var2) {
      return this.f22000.m86000(var1, var2);
   }

   public Enum0022 m26000() {
      return switch (this) {
         case f1000, f2000, f3000, f20000 -> Enum0022.f2000;
         default -> Enum0022.f1000;
         case f13000, f14000 -> Enum0022.f4000;
         case f17000, f18000 -> Enum0022.f3000;
      };
   }

   private static float m28000(float var0) {
      return Math.max(0.0F, var0);
   }

   private int m30000(C0026 var1, float var2) {
      return C0264.m4000(var1.m48000(), var1.m4000(), var2);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private static boolean m32000(Rec0125 var0, Rec0125 var1) {
      if (var0 != null && var1 != null) {
         Enum0039 var2 = var0.m20000();
         Enum0039 var3 = var1.m20000();
         if (var2 != var3) {
            return false;
         } else {
            return switch (var2) {
               case f4000, f3000 -> Float.isFinite(var0.m8000()) && Float.isFinite(var1.m8000());
               case f1000, f2000 -> Float.isFinite(var0.m14000())
                  && Float.isFinite(var0.m36000())
                  && Float.isFinite(var1.m14000())
                  && Float.isFinite(var1.m36000());
            };
         }
      } else {
         return false;
      }
   }

   public boolean m34000(Iface0192 var1) {
      Objects.requireNonNull(var1, "spec");
      if (!var1.m4000() || var1 instanceof Rec0076) {
         return true;
      } else {
         return var1 instanceof Iface0203 var2 ? var2.m2000(this.m26000()) : false;
      }
   }

   public boolean m36000(C0026 var1, C0019 var2) {
      return var1.m40000(this.m46000(var2));
   }

   public C0019 m38000(C0019 var1, C0026 var2) {
      C0370 var3 = var1.m216000();
      this.m40000(var3, var2);
      return var3.m60000();
   }

   public void m40000(C0370 var1, C0026 var2) {
      if (var2.m12000() == Enum0017.f3000) {
         this.m44000(var1, var2.m18000());
      } else {
         float var3 = var2.m24000();
         switch (this) {
            case f1000:
               var1.m36000(this.m30000(var2, var3));
               break;
            case f2000:
               var1.m30000(this.m30000(var2, var3));
               break;
            case f3000:
               var1.m20000(this.m30000(var2, var3));
               break;
            case f4000:
               var1.m86000(Rec0126.m16000(var2.m2000()));
               break;
            case f5000:
               var1.m88000(var2.m2000());
               break;
            case f6000:
               var1.m94000(Rec0131.m16000(var2.m2000()));
               break;
            case f7000:
               var1.m58000(m28000(var2.m2000()), null, null, null);
               break;
            case f8000:
               var1.m58000(null, m28000(var2.m2000()), null, null);
               break;
            case f9000:
               var1.m58000(null, null, m28000(var2.m2000()), null);
               break;
            case f10000:
               var1.m58000(null, null, null, m28000(var2.m2000()));
               break;
            case f11000:
               var1.m38000(var2.m2000());
               break;
            case f12000:
               var1.m6000(var2.m2000());
               break;
            case f13000:
               var1.m72000(m18000(var2, var3));
               break;
            case f14000:
               var1.m42000(m18000(var2, var3));
               break;
            case f15000:
               var1.m26000(var2.m2000());
               break;
            case f16000:
               var1.m18000(var2.m2000());
               break;
            case f17000:
               var1.m70000(m4000(var2, var3));
               break;
            case f18000:
               var1.m32000(m4000(var2, var3));
               break;
            case f19000:
               var1.m10000(var2.m2000());
               break;
            case f20000:
               var1.m8000(this.m30000(var2, var3));
               break;
            case f21000:
               var1.m24000(var2.m2000());
         }
      }
   }

   public C0019 m42000(C0019 var1, C0027 var2) {
      C0370 var3 = var1.m216000();
      this.m44000(var3, var2);
      return var3.m60000();
   }

   public void m44000(C0370 var1, C0027 var2) {
      switch (this) {
         case f1000:
            var1.m36000(var2.m2000());
            break;
         case f2000:
            var1.m30000(var2.m2000());
            break;
         case f3000:
            var1.m20000(var2.m2000());
            break;
         case f4000:
            var1.m86000(Rec0126.m16000(var2.m10000()));
            break;
         case f5000:
            var1.m88000(var2.m10000());
            break;
         case f6000:
            var1.m94000(Rec0131.m16000(var2.m10000()));
            break;
         case f7000:
            var1.m58000(m28000(var2.m10000()), null, null, null);
            break;
         case f8000:
            var1.m58000(null, m28000(var2.m10000()), null, null);
            break;
         case f9000:
            var1.m58000(null, null, m28000(var2.m10000()), null);
            break;
         case f10000:
            var1.m58000(null, null, null, m28000(var2.m10000()));
            break;
         case f11000:
            var1.m38000(var2.m10000());
            break;
         case f12000:
            var1.m6000(var2.m10000());
            break;
         case f13000:
            var1.m72000(var2.m6000());
            break;
         case f14000:
            var1.m42000(var2.m6000());
            break;
         case f15000:
            var1.m26000(var2.m10000());
            break;
         case f16000:
            var1.m18000(var2.m10000());
            break;
         case f17000:
            var1.m70000(var2.m8000());
            break;
         case f18000:
            var1.m32000(var2.m8000());
            break;
         case f19000:
            var1.m10000(var2.m10000());
            break;
         case f20000:
            var1.m8000(var2.m2000());
            break;
         case f21000:
            var1.m24000(var2.m10000());
      }
   }

   public C0027 m46000(C0019 var1) {
      return switch (this) {
         case f1000 -> C0027.m16000(var1.m96000());
         case f2000 -> C0027.m16000(var1.m58000());
         case f3000 -> C0027.m16000(var1.m222000());
         case f4000 -> C0027.m22000(var1.m180000());
         case f5000 -> C0027.m22000(var1.m92000());
         case f6000 -> C0027.m22000(var1.m150000().m8000());
         case f7000 -> C0027.m22000(var1.m112000().m2000());
         case f8000 -> C0027.m22000(var1.m112000().m8000());
         case f9000 -> C0027.m22000(var1.m112000().m6000());
         case f10000 -> C0027.m22000(var1.m112000().m20000());
         case f11000 -> C0027.m22000(var1.m108000());
         case f12000 -> C0027.m22000(var1.m106000());
         case f13000 -> C0027.m12000(var1.m80000());
         case f14000 -> C0027.m12000(var1.m102000());
         case f15000 -> C0027.m22000(var1.m224000());
         case f16000 -> C0027.m22000(var1.m86000());
         case f17000 -> C0027.m14000(var1.m32000());
         case f18000 -> C0027.m14000(var1.m220000());
         case f19000 -> C0027.m22000(var1.m26000());
         case f20000 -> C0027.m16000(var1.m56000());
         case f21000 -> C0027.m22000(var1.m84000());
      };
   }

   public C0026 m48000(C0019 var1, C0019 var2, Iface0192 var3) {
      this.m16000(var3);

      return switch (this) {
         case f1000 -> C0026.m28000(this, var3, var1.m96000(), var2.m96000());
         case f2000 -> C0026.m28000(this, var3, var1.m58000(), var2.m58000());
         case f3000 -> C0026.m28000(this, var3, var1.m222000(), var2.m222000());
         case f4000 -> C0026.m30000(this, var3, var1.m180000(), var2.m180000());
         case f5000 -> C0026.m30000(this, var3, var1.m92000(), var2.m92000());
         case f6000 -> C0026.m30000(this, var3, var1.m150000().m8000(), var2.m150000().m8000());
         case f7000 -> C0026.m30000(this, var3, var1.m112000().m2000(), var2.m112000().m2000());
         case f8000 -> C0026.m30000(this, var3, var1.m112000().m8000(), var2.m112000().m8000());
         case f9000 -> C0026.m30000(this, var3, var1.m112000().m6000(), var2.m112000().m6000());
         case f10000 -> C0026.m30000(this, var3, var1.m112000().m20000(), var2.m112000().m20000());
         case f11000 -> C0026.m30000(this, var3, var1.m108000(), var2.m108000());
         case f12000 -> C0026.m30000(this, var3, var1.m106000(), var2.m106000());
         case f13000 -> C0026.m42000(this, var3, var1.m80000(), var2.m80000());
         case f14000 -> C0026.m42000(this, var3, var1.m102000(), var2.m102000());
         case f15000 -> C0026.m30000(this, var3, var1.m224000(), var2.m224000());
         case f16000 -> C0026.m30000(this, var3, var1.m86000(), var2.m86000());
         case f17000 -> C0026.m32000(this, var3, var1.m32000(), var2.m32000());
         case f18000 -> C0026.m32000(this, var3, var1.m220000(), var2.m220000());
         case f19000 -> C0026.m30000(this, var3, var1.m26000(), var2.m26000());
         case f20000 -> C0026.m28000(this, var3, var1.m56000(), var2.m56000());
         case f21000 -> C0026.m30000(this, var3, var1.m84000(), var2.m84000());
      };
   }
}
