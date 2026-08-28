package rw.setting;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.UnaryOperator;
import rw.core.C0258;
import rw.core.C0361;
import rw.core.C0368;
import rw.core.C0373;
import rw.core.C0376;
import rw.core.C0379;
import rw.core.C0381;
import rw.data.Rec0066;
import rw.data.Rec0068;
import rw.data.Rec0070;
import rw.data.Rec0125;
import rw.data.Rec0126;
import rw.data.Rec0128;
import rw.data.Rec0130;
import rw.data.Rec0131;
import rw.defs.Enum0031;
import rw.defs.Enum0032;
import rw.defs.Enum0033;
import rw.defs.Enum0034;
import rw.defs.Enum0035;
import rw.defs.Enum0036;
import rw.defs.Enum0037;
import rw.defs.Enum0040;
import rw.defs.Enum0041;
import rw.defs.Enum0042;
import rw.defs.Enum0044;

public final class C0056 {
   public static final C0056 f1000;
   private final C0373 f2000;
   private final C0379 f3000;
   private final C0376 f4000;
   private final C0373 f5000;
   private final C0373 f6000;
   private final List<C0368> f7000;

   public C0056 m2000(boolean var1) {
      return this.m116000(this.f2000.m38000(var1));
   }

   public C0056 m4000() {
      return this.m116000(this.f2000.m8000());
   }

   public C0056 m6000(Enum0034 var1) {
      return var1 == null ? this : this.m116000(this.f2000.m6000(var1));
   }

   public C0056 m8000(float var1, float var2) {
      return this.m144000(Rec0066.m12000(var1)).m98000(Rec0066.m12000(var2));
   }

   public C0056 m10000(float var1) {
      return this.m202000(var1).m18000(var1);
   }

   public C0056 m12000(C0368 var1, UnaryOperator<C0056> var2) {
      return this.m134000(Enum0037.f3000, var1, var2);
   }

   public C0056 m14000(UnaryOperator<C0056> var1) {
      return this.m118000(Enum0037.f1000, var1);
   }

   public C0056 m16000(int var1) {
      return this.m116000(this.f2000.m2000(var1));
   }

   public C0056 m18000(float var1) {
      return this.m116000(this.f2000.m36000(var1));
   }

   public C0056 m20000() {
      return this.m2000(true);
   }

   public C0056 m22000(float var1) {
      return this.m116000(this.f2000.m34000(var1));
   }

   public C0056 m24000(float var1) {
      return this.m178000(C0361.m2000(var1));
   }

   private C0056(C0373 var1, C0379 var2, C0376 var3, C0373 var4, C0373 var5, List<C0368> var6) {
      this.f2000 = var1 == null ? C0373.f1000 : var1;
      this.f3000 = var2 == null ? C0379.f1000 : var2;
      this.f4000 = var3 == null ? C0376.f1000 : var3;
      this.f5000 = var4 == null ? C0373.f1000 : var4;
      this.f6000 = var5 == null ? C0373.f1000 : var5;
      this.f7000 = m124000(var6);
   }

   public C0373 m26000() {
      return this.f2000;
   }

   public C0056 m28000(float var1) {
      return this.m166000(Rec0131.m16000(var1));
   }

   public C0056 m30000(float var1) {
      return this.m162000(Rec0126.m16000(var1));
   }

   public C0379 m32000() {
      return this.f3000;
   }

   public C0056 m34000() {
      return this.m116000(this.f2000.m56000(true));
   }

   public C0056 m36000(float var1, float var2) {
      return this.m188000(C0361.m8000(var1), C0361.m8000(var2));
   }

   public C0056 m38000(UnaryOperator<C0056> var1) {
      return this.m118000(Enum0037.f3000, var1);
   }

   public C0056 m40000(int var1) {
      return this.m116000(this.f2000.m26000(var1));
   }

   public C0056 m42000(float var1) {
      return this.m116000(this.f2000.m58000(var1));
   }

   public C0056 m44000(float var1) {
      return this.m90000(C0361.m2000(var1));
   }

   public C0056 m46000(float var1) {
      return this.m116000(this.f2000.m32000(var1));
   }

   public C0056 m48000(float var1) {
      return this.m116000(this.f2000.m124000(var1));
   }

   public C0056 m50000(float var1) {
      return this.m116000(this.f2000.m28000(var1));
   }

   public C0056 m52000(float var1) {
      return this.m116000(this.f2000.m16000(var1));
   }

   public boolean m54000() {
      return this.f2000.m74000() && this.f3000.m6000() && this.f4000.m10000() && this.f5000.m74000() && this.f6000.m74000() && this.f7000.isEmpty();
   }

   public C0056 m56000(float var1) {
      return this.m98000(Rec0066.m16000(var1));
   }

   public C0056 m58000(float var1) {
      return this.m116000(this.f2000.m30000(var1));
   }

   public C0056 m60000(float var1) {
      return this.m116000(this.f2000.m124000(var1));
   }

   public C0056 m62000(float var1) {
      return this.m116000(this.f2000.m60000(var1));
   }

   public C0373 m64000() {
      return this.f5000;
   }

   public C0056 m66000(float var1) {
      return this.m116000(this.f2000.m12000(var1));
   }

   public C0376 m68000() {
      return this.f4000;
   }

   public C0056 m70000(float var1) {
      return this.m116000(this.f2000.m128000(var1));
   }

   public C0056 m72000(int var1) {
      return this.m116000(this.f2000.m42000(var1));
   }

   public C0056 m74000(UnaryOperator<C0056> var1) {
      return this.m118000(Enum0037.f2000, var1);
   }

   public C0056 m76000() {
      return this.m116000(this.f2000.m122000(true));
   }

   public C0056 m78000(float var1, float var2) {
      return this.m188000(C0361.m10000(var1), C0361.m10000(var2));
   }

   public C0056 m80000(float var1) {
      return this.m116000(this.f2000.m98000(var1));
   }

   public C0056 m82000(boolean var1) {
      return this.m116000(this.f2000.m10000(var1));
   }

   public C0056 m84000(C0368 var1, UnaryOperator<C0056> var2) {
      return this.m134000(Enum0037.f2000, var1, var2);
   }

   public C0056 m86000(int var1) {
      return this.m116000(this.f2000.m44000(var1));
   }

   public C0056 m88000(Enum0034 var1) {
      return var1 == null ? this : this.m116000(this.f2000.m54000(var1));
   }

   public C0056 m90000(Rec0125 var1) {
      return var1 == null ? this : this.m116000(this.f2000.m48000(var1));
   }

   public C0056 m92000() {
      return this.m166000(Rec0131.m14000());
   }

   public C0056 m94000(float var1, float var2) {
      return this.m144000(Rec0066.m16000(var1)).m98000(Rec0066.m16000(var2));
   }

   public C0056 m96000(float var1) {
      return this.m80000(var1).m42000(var1);
   }

   public C0056 m98000(Rec0066 var1) {
      return this.m116000(this.f2000.m50000(var1));
   }

   public C0056 m100000(UnaryOperator<C0056> var1) {
      Objects.requireNonNull(var1, "update");
      C0056 var2 = var1.apply(m130000());
      C0373 var3 = var2 == null ? C0373.f1000 : var2.m26000();
      return new C0056(this.f2000, this.f3000, this.f4000, this.f5000, var3, this.f7000);
   }

   public C0373 m102000() {
      return this.f6000;
   }

   public C0056 m104000(float var1) {
      return this.m116000(this.f2000.m20000(var1));
   }

   public C0056 m106000(Rec0057... var1) {
      Objects.requireNonNull(var1, "values");
      return this.m186000(C0258.m10000(var1));
   }

   public C0056 m108000(Rec0057 var1) {
      return this.m186000(C0258.m10000(Objects.requireNonNull(var1, "value")));
   }

   public C0056 m110000(UnaryOperator<C0056> var1) {
      Objects.requireNonNull(var1, "update");
      C0056 var2 = var1.apply(m130000());
      C0373 var3 = var2 == null ? C0373.f1000 : var2.m26000();
      return new C0056(this.f2000, this.f3000, this.f4000, var3, this.f6000, this.f7000);
   }

   public C0056 m112000(Rec0068 var1) {
      return var1 == null ? this : this.m116000(this.f2000.m80000(var1));
   }

   public C0056 m114000(float var1, float var2, float var3, float var4) {
      return this.m112000(new Rec0068(var1, var2, var3, var4));
   }

   private C0056 m116000(C0373 var1) {
      return new C0056(var1, this.f3000, this.f4000, this.f5000, this.f6000, this.f7000);
   }

   private C0056 m118000(Enum0037 var1, UnaryOperator<C0056> var2) {
      Objects.requireNonNull(var2, "update");
      C0056 var3 = var2.apply(m130000());
      C0373 var4 = var3 == null ? C0373.f1000 : var3.m26000();
      return new C0056(this.f2000, this.f3000.m10000(var1, var4), this.f4000, this.f5000, this.f6000, this.f7000);
   }

   public static C0056 m120000(C0056... var0) {
      C0056 var1 = f1000;
      if (var0 == null) {
         return var1;
      } else if (var0.length == 1) {
         return var0[0];
      } else {
         for (C0056 var5 : var0) {
            var1 = var1.m122000(var5);
         }

         return var1;
      }
   }

   public C0056 m122000(C0056 var1) {
      if (var1 == null || var1.m54000()) {
         return this;
      } else {
         return this.m54000()
            ? var1
            : new C0056(
               this.f2000.m78000(var1.f2000),
               this.f3000.m4000(var1.f3000),
               this.f4000.m4000(var1.f4000),
               this.f5000.m78000(var1.f5000),
               this.f6000.m78000(var1.f6000),
               m126000(this.f7000, var1.f7000)
            );
      }
   }

   private static List<C0368> m124000(List<C0368> var0) {
      if (var0 != null && !var0.isEmpty()) {
         ArrayList var1 = new ArrayList(var0.size());

         for (C0368 var3 : var0) {
            if (var3 != null && !m128000(var1, var3)) {
               var1.add(var3);
            }
         }

         return var1.isEmpty() ? List.of() : List.copyOf(var1);
      } else {
         return List.of();
      }
   }

   private static List<C0368> m126000(List<C0368> var0, List<C0368> var1) {
      if (var1 != null && !var1.isEmpty()) {
         if (var0 != null && !var0.isEmpty()) {
            ArrayList var2 = new ArrayList(var0.size() + var1.size());
            var2.addAll(var0);

            for (C0368 var4 : var1) {
               if (var4 != null && !m128000(var2, var4)) {
                  var2.add(var4);
               }
            }

            return List.copyOf(var2);
         } else {
            return m124000(var1);
         }
      } else {
         return m124000(var0);
      }
   }

   private static boolean m128000(List<C0368> var0, C0368 var1) {
      if (var1 != null && var0 != null) {
         for (C0368 var3 : var0) {
            if (var3 == var1) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   public static C0056 m130000() {
      return f1000;
   }

   public C0056 m132000(C0368 var1, UnaryOperator<C0056> var2) {
      return this.m134000(Enum0037.f1000, var1, var2);
   }

   public C0056 m134000(Enum0037 var1, C0368 var2, UnaryOperator<C0056> var3) {
      if (var1 != null && var2 != null) {
         Objects.requireNonNull(var3, "update");
         C0056 var4 = var3.apply(m130000());
         C0373 var5 = var4 == null ? C0373.f1000 : var4.m26000();
         return new C0056(this.f2000, this.f3000, this.f4000.m12000(var1, var2, var5), this.f5000, this.f6000, this.f7000);
      } else {
         return this;
      }
   }

   public C0056 m136000(C0055 var1) {
      if (var1 == null) {
         return this;
      } else {
         C0056 var2 = this;
         if (var1.m14000() != null) {
            var2 = this.m176000(var1.m14000());
         }

         if (var1.m10000() != null) {
            var2 = var2.m180000(var1.m10000());
         }

         if (var1.m30000() != null) {
            var2 = var2.m88000(var1.m30000());
         }

         if (var1.m6000() != null) {
            var2 = var2.m166000(var1.m6000());
         }

         return var2;
      }
   }

   public C0056 m138000(C0368 var1) {
      if (var1 != null && !m128000(this.f7000, var1)) {
         ArrayList var2 = new ArrayList(this.f7000.size() + 1);
         var2.addAll(this.f7000);
         var2.add(var1);
         return new C0056(this.f2000, this.f3000, this.f4000, this.f5000, this.f6000, var2);
      } else {
         return this;
      }
   }

   public C0056 m140000(C0368... var1) {
      if (var1 != null && var1.length != 0) {
         C0056 var2 = this;

         for (C0368 var6 : var1) {
            var2 = var2.m138000(var6);
         }

         return var2;
      } else {
         return this;
      }
   }

   public C0373 m142000(boolean var1, boolean var2, boolean var3) {
      return this.f2000.m78000(this.f3000.m12000(var1, var2, var3));
   }

   public C0056 m144000(Rec0066 var1) {
      return this.m116000(this.f2000.m104000(var1));
   }

   public C0056 m146000(Rec0066 var1, Rec0066 var2) {
      return this.m144000(var1).m98000(var2);
   }

   public C0056 m148000(Enum0044 var1) {
      return this.m150000(var1, 0.0F);
   }

   public C0056 m150000(Enum0044 var1, float var2) {
      return var1 == null ? this : this.m116000(this.f2000.m118000(var1).m22000(var2));
   }

   public C0056 m152000(Enum0033 var1) {
      return var1 == null ? this : this.m116000(this.f2000.m112000(var1));
   }

   public C0056 m154000(Enum0042 var1) {
      return var1 == null ? this : this.m116000(this.f2000.m110000(var1));
   }

   public C0056 m156000(Enum0036 var1) {
      return var1 == null ? this : this.m116000(this.f2000.m108000(var1));
   }

   public C0056 m158000(float var1) {
      return this.m192000(Rec0128.m18000(var1));
   }

   public C0056 m160000(Enum0032 var1) {
      return var1 == null ? this : this.m116000(this.f2000.m86000(var1));
   }

   public C0056 m162000(Rec0126 var1) {
      return var1 == null ? this : this.m116000(this.f2000.m82000(var1));
   }

   public C0056 m164000(C0381 var1) {
      if (var1 == null) {
         return this;
      } else {
         C0056 var2 = this;
         if (var1.m8000() != null) {
            var2 = this.m70000(var1.m8000());
         }

         if (var1.m4000() != null) {
            var2 = var2.m72000(var1.m4000());
         }

         if (var1.m2000() != null) {
            var2 = var2.m162000(var1.m2000());
         }

         return var2;
      }
   }

   public C0056 m166000(Rec0131 var1) {
      return var1 == null ? this : this.m116000(this.f2000.m102000(var1));
   }

   public C0056 m168000(int var1) {
      return this.m116000(this.f2000.m90000(var1));
   }

   public C0056 m170000(float var1, float var2) {
      return this.m66000(var1).m104000(var2);
   }

   public C0056 m172000(String var1) {
      return var1 == null ? this : this.m116000(this.f2000.m114000(var1));
   }

   public C0056 m174000(Rec0036 var1) {
      return var1 == null ? this : this.m116000(this.f2000.m70000(var1));
   }

   public C0056 m176000(Enum0035 var1) {
      return var1 == null ? this : this.m116000(this.f2000.m100000(var1));
   }

   public C0056 m178000(Rec0125 var1) {
      return var1 == null ? this : this.m116000(this.f2000.m116000(var1));
   }

   public C0056 m180000(Enum0034 var1) {
      return var1 == null ? this : this.m116000(this.f2000.m68000(var1));
   }

   public C0056 m182000(Enum0031 var1) {
      return var1 == null ? this : this.m116000(this.f2000.m72000(var1));
   }

   public C0056 m184000(float var1, int var2) {
      return this.m208000(var1).m204000(var2);
   }

   public C0056 m186000(Rec0070 var1) {
      return this.m116000(this.f2000.m76000(Objects.requireNonNull(var1, "value")));
   }

   public C0056 m188000(Rec0125 var1, Rec0125 var2) {
      return this.m178000(var1).m90000(var2);
   }

   public C0056 m190000(Rec0130 var1) {
      return var1 == null ? this : this.m116000(this.f2000.m106000(var1));
   }

   public C0056 m192000(Rec0128 var1) {
      return var1 == null ? this : this.m116000(this.f2000.m96000(var1));
   }

   public C0056 m194000(boolean var1) {
      return this.m116000(this.f2000.m88000(Enum0041.f41000, var1));
   }

   public C0056 m196000(Enum0040 var1) {
      return var1 == null ? this : this.m116000(this.f2000.m94000(var1));
   }

   public C0056 m198000(float var1) {
      return this.m144000(Rec0066.m16000(var1));
   }

   public List<C0368> m200000() {
      return this.f7000;
   }

   public C0056 m202000(float var1) {
      return this.m116000(this.f2000.m4000(var1));
   }

   public C0056 m204000(int var1) {
      return this.m116000(this.f2000.m126000(var1));
   }

   public C0056 m206000() {
      return this.m188000(C0361.m4000(100.0F), C0361.m4000(100.0F));
   }

   public C0056 m208000(float var1) {
      return this.m116000(this.f2000.m14000(var1));
   }
}
