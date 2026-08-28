package rw.core;

import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.Map.Entry;
import rw.data.Rec0066;
import rw.data.Rec0068;
import rw.data.Rec0070;
import rw.data.Rec0125;
import rw.data.Rec0126;
import rw.data.Rec0127;
import rw.data.Rec0128;
import rw.data.Rec0130;
import rw.data.Rec0131;
import rw.defs.Enum0031;
import rw.defs.Enum0032;
import rw.defs.Enum0033;
import rw.defs.Enum0034;
import rw.defs.Enum0035;
import rw.defs.Enum0036;
import rw.defs.Enum0038;
import rw.defs.Enum0040;
import rw.defs.Enum0041;
import rw.defs.Enum0042;
import rw.defs.Enum0044;
import rw.gui.C0019;
import rw.setting.Rec0036;

public final class C0373 {
   public static final C0373 f1000;
   private final EnumMap<Enum0041, Object> f2000;
   private final int f3000;

   public C0373 m2000(int var1) {
      return this.m88000(Enum0041.f47000, var1);
   }

   public C0373 m4000(float var1) {
      return this.m88000(Enum0041.f7000, var1);
   }

   public C0373 m6000(Enum0034 var1) {
      return this.m88000(Enum0041.f20000, var1);
   }

   public C0373 m8000() {
      return this.m88000(Enum0041.f14000, new Rec0127(true, 0));
   }

   public C0373 m10000(boolean var1) {
      return this.m88000(Enum0041.f42000, var1);
   }

   public C0373 m12000(float var1) {
      return this.m88000(Enum0041.f15000, var1);
   }

   public C0373 m14000(float var1) {
      return this.m88000(Enum0041.f54000, var1);
   }

   public C0373 m16000(float var1) {
      return this.m88000(Enum0041.f57000, var1);
   }

   private C0373() {
      this.f2000 = new EnumMap<>(Enum0041.class);
      this.f3000 = this.f2000.hashCode();
   }

   private C0373(EnumMap<Enum0041, Object> var1) {
      this.f2000 = m62000(var1);
      this.f3000 = this.f2000.hashCode();
   }

   public boolean m18000(Object var1) {
      if (var1 == this) {
         return true;
      } else if (var1 instanceof C0373 var2) {
         return this.f3000 != var2.f3000 ? false : this.f2000.equals(var2.f2000);
      } else {
         return false;
      }
   }

   @Override
   public String toString() {
      return "StylePatch[values=" + this.f2000 + "]";
   }

   @Override
   public int hashCode() {
      return this.f3000;
   }

   public C0373 m20000(float var1) {
      return this.m88000(Enum0041.f16000, var1);
   }

   public C0373 m22000(float var1) {
      return this.m88000(Enum0041.f19000, var1);
   }

   public C0373 m24000(float var1) {
      return this.m102000(Rec0131.m16000(var1));
   }

   public C0373 m26000(int var1) {
      return this.m88000(Enum0041.f49000, var1);
   }

   public C0373 m28000(float var1) {
      return this.m88000(Enum0041.f56000, var1);
   }

   public C0373 m30000(float var1) {
      return this.m88000(Enum0041.f50000, var1);
   }

   public C0373 m32000(float var1) {
      return this.m88000(Enum0041.f26000, var1);
   }

   public C0373 m34000(float var1) {
      return this.m88000(Enum0041.f25000, var1);
   }

   public C0373 m36000(float var1) {
      return this.m88000(Enum0041.f8000, var1);
   }

   public C0373 m38000(boolean var1) {
      return this.m88000(Enum0041.f43000, var1);
   }

   private EnumMap<Enum0041, Object> m40000() {
      return new EnumMap<>(this.f2000);
   }

   public C0373 m42000(int var1) {
      return this.m88000(Enum0041.f48000, var1);
   }

   public C0373 m44000(int var1) {
      return this.m88000(Enum0041.f44000, var1);
   }

   public Object m46000(Enum0041 var1) {
      return var1 == null ? null : this.f2000.get(var1);
   }

   public C0373 m48000(Rec0125 var1) {
      return this.m88000(Enum0041.f40000, var1);
   }

   public C0373 m50000(Rec0066 var1) {
      return this.m88000(Enum0041.f24000, var1);
   }

   public Set<Enum0041> m52000() {
      return Collections.unmodifiableSet(this.f2000.keySet());
   }

   public C0373 m54000(Enum0034 var1) {
      return this.m88000(Enum0041.f3000, var1);
   }

   public C0373 m56000(boolean var1) {
      return this.m88000(Enum0041.f22000, var1);
   }

   public C0373 m58000(float var1) {
      return this.m88000(Enum0041.f6000, var1);
   }

   public C0373 m60000(float var1) {
      return this.m88000(Enum0041.f45000, var1);
   }

   private static EnumMap<Enum0041, Object> m62000(Map<Enum0041, Object> var0) {
      EnumMap var1 = new EnumMap<>(Enum0041.class);
      if (var0 != null && !var0.isEmpty()) {
         for (Entry var3 : var0.entrySet()) {
            m66000(var1, (Enum0041)var3.getKey(), var3.getValue());
         }

         return var1;
      } else {
         return var1;
      }
   }

   public boolean m64000(Enum0041 var1) {
      return var1 != null && this.f2000.containsKey(var1);
   }

   private static void m66000(EnumMap<Enum0041, Object> var0, Enum0041 var1, Object var2) {
      if (var1 != null && var2 != null) {
         Object var3 = var1.m92000(var2);
         if (var3 != null) {
            var0.put(var1, var3);
         }
      }
   }

   public C0373 m68000(Enum0034 var1) {
      return this.m88000(Enum0041.f2000, var1);
   }

   public C0373 m70000(Rec0036 var1) {
      return this.m88000(Enum0041.f51000, var1);
   }

   public C0373 m72000(Enum0031 var1) {
      return this.m88000(Enum0041.f52000, var1);
   }

   public boolean m74000() {
      return this.f2000.isEmpty();
   }

   public C0373 m76000(Rec0070 var1) {
      return this.m88000(Enum0041.f55000, var1);
   }

   public C0373 m78000(C0373 var1) {
      if (var1 == null || var1.m74000()) {
         return this;
      } else if (this.m74000()) {
         return var1;
      } else {
         EnumMap var2 = this.m40000();
         var2.putAll(var1.f2000);
         return new C0373(var2);
      }
   }

   public C0373 m80000(Rec0068 var1) {
      return this.m88000(Enum0041.f58000, var1);
   }

   public C0373 m82000(Rec0126 var1) {
      return this.m88000(Enum0041.f10000, var1);
   }

   public C0373 m84000(Enum0038 var1) {
      return this.m88000(Enum0041.f12000, var1);
   }

   public C0373 m86000(Enum0032 var1) {
      return this.m88000(Enum0041.f13000, var1);
   }

   public C0373 m88000(Enum0041 var1, Object var2) {
      if (var1 != null && var2 != null) {
         Object var3 = var1.m92000(var2);
         if (var3 != null && !Objects.equals(this.f2000.get(var1), var3)) {
            EnumMap var4 = this.m40000();
            var4.put(var1, var3);
            return new C0373(var4);
         } else {
            return this;
         }
      } else {
         return this;
      }
   }

   public C0373 m90000(int var1) {
      return this.m88000(Enum0041.f14000, new Rec0127(false, var1));
   }

   public C0019 m92000(C0019 var1) {
      C0019 var2 = var1 == null ? C0360.m4000() : var1;
      return C0378.m10000(var2, this.f2000);
   }

   public C0373 m94000(Enum0040 var1) {
      return this.m88000(Enum0041.f4000, var1);
   }

   public C0373 m96000(Rec0128 var1) {
      if (var1 == null) {
         return this;
      } else {
         EnumMap var2 = this.m40000();
         m66000(var2, Enum0041.f5000, var1.m2000());
         m66000(var2, Enum0041.f6000, var1.m8000());
         m66000(var2, Enum0041.f7000, var1.m6000());
         m66000(var2, Enum0041.f8000, var1.m20000());
         return new C0373(var2);
      }
   }

   public C0373 m98000(float var1) {
      return this.m88000(Enum0041.f5000, var1);
   }

   public C0373 m100000(Enum0035 var1) {
      return this.m88000(Enum0041.f1000, var1);
   }

   public C0373 m102000(Rec0131 var1) {
      return this.m88000(Enum0041.f9000, var1);
   }

   public C0373 m104000(Rec0066 var1) {
      return this.m88000(Enum0041.f23000, var1);
   }

   public C0373 m106000(Rec0130 var1) {
      if (var1 == null) {
         return this;
      } else {
         EnumMap var2 = this.m40000();
         m66000(var2, Enum0041.f30000, var1.m40000());
         m66000(var2, Enum0041.f31000, var1.m34000());
         m66000(var2, Enum0041.f32000, var1.m22000());
         m66000(var2, Enum0041.f33000, var1.m18000());
         m66000(var2, Enum0041.f34000, var1.m46000());
         m66000(var2, Enum0041.f35000, var1.m8000());
         m66000(var2, Enum0041.f36000, var1.m12000());
         m66000(var2, Enum0041.f37000, var1.m14000());
         m66000(var2, Enum0041.f38000, var1.m20000());
         return new C0373(var2);
      }
   }

   public C0373 m108000(Enum0036 var1) {
      return this.m88000(Enum0041.f27000, var1);
   }

   public C0373 m110000(Enum0042 var1) {
      return this.m88000(Enum0041.f28000, var1);
   }

   public C0373 m112000(Enum0033 var1) {
      return this.m88000(Enum0041.f29000, var1);
   }

   public C0373 m114000(String var1) {
      return this.m88000(Enum0041.f17000, var1);
   }

   public C0373 m116000(Rec0125 var1) {
      return this.m88000(Enum0041.f39000, var1);
   }

   public C0373 m118000(Enum0044 var1) {
      return this.m88000(Enum0041.f18000, var1);
   }

   public <T> T m120000(Enum0041 var1, Class<T> var2) {
      Object var3 = this.m46000(var1);
      return (T)(var3 == null ? null : var2.cast(var3));
   }

   public C0373 m122000(boolean var1) {
      return this.m88000(Enum0041.f21000, var1);
   }

   public C0373 m124000(float var1) {
      return this.m88000(Enum0041.f46000, var1);
   }

   public C0373 m126000(int var1) {
      return this.m88000(Enum0041.f53000, var1);
   }

   public C0373 m128000(float var1) {
      return this.m88000(Enum0041.f11000, var1);
   }
}
