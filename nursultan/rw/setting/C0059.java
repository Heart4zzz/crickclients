package rw.setting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import rw.api.Iface0207;
import rw.api.Iface0212;
import rw.api.Iface0217;
import rw.api.Iface0220;
import rw.core.Base0315;
import rw.core.C0259;
import rw.core.C0334;
import rw.core.C0347;
import rw.core.C0358;
import rw.core.C0360;
import rw.core.C0368;
import rw.core.C0373;
import rw.core.C0383;
import rw.core.C0409;
import rw.data.Rec0107;
import rw.defs.Enum0026;
import rw.defs.Enum0032;
import rw.defs.Enum0047;

public final class C0059 implements Iface0212 {
   private final String f1000;
   private final Enum0047 f2000;
   private final List<C0059> f3000 = new ArrayList<>();
   private final List<C0059> f4000 = Collections.unmodifiableList(this.f3000);
   private Map<Enum0026, List<C0383>> f5000;
   private final C0347 f6000 = new C0347(this);
   private final C0334 f7000 = new C0334();
   private final Iface0220 f8000;
   private C0038 f9000;
   private C0059 f10000;
   private int f11000 = -1;
   private boolean f12000;
   private boolean f13000;
   private boolean f14000;
   private boolean f15000;
   private String f16000;
   private int f17000 = 3;
   private int f18000 = 3;
   private int f19000 = 1;
   private C0056 f20000 = C0056.f1000;
   private List<C0368> f21000 = List.of();
   private rw.gui.C0019 f22000 = C0360.m4000();
   private C0373 f23000;
   private rw.gui.C0019 f24000;
   private boolean f25000;
   private int f26000;
   private int f27000;
   private int f28000;
   private int f29000;
   private int f30000;
   private int f31000;
   private int f32000;
   private int f33000;

   public int m2000() {
      return this.f29000;
   }

   public void m4000(int var1) {
      this.m98000(var1);
   }

   public void m6000(String var1) {
      String var2 = var1 == null ? "" : var1;
      if (!this.f8000.m8000().equals(var2)) {
         this.f8000.m4000(var2);
         this.m80000();
         this.m56000(1);
      }
   }

   private static boolean m8000(rw.gui.C0019 var0, rw.gui.C0019 var1) {
      return var0.m16000() == var1.m16000()
         && var0.m2000() == var1.m2000()
         && var0.m100000() == var1.m100000()
         && m146000(var0.m226000().m40000(), var1.m226000().m40000())
         && m146000(var0.m226000().m34000(), var1.m226000().m34000())
         && m146000(var0.m226000().m2000(), var1.m226000().m2000())
         && m146000(var0.m226000().m22000(), var1.m226000().m22000());
   }

   private boolean m10000(List<C0059> var1) {
      for (int var2 = 0; var2 < this.f3000.size(); var2++) {
         if (this.f3000.get(var2) != var1.get(var2)) {
            return false;
         }
      }

      return true;
   }

   public void m12000(boolean var1) {
      this.f14000 = var1;
   }

   public List<C0059> m14000() {
      return this.f4000;
   }

   public int m16000() {
      return this.f11000;
   }

   public boolean m18000(int var1) {
      return var1 == 1 ? this.m60000() : C0409.m4000(this.f17000, var1);
   }

   @Override
   public boolean m20000() {
      return this.f12000;
   }

   public C0038 m24000() {
      return this.f9000;
   }

   public boolean m26000() {
      return this.f25000;
   }

   public int m28000() {
      return this.f32000;
   }

   public C0059(Enum0047 var1) {
      this(null, var1);
   }

   public C0059(String var1, Enum0047 var2) {
      this.f1000 = var1 != null && !var1.isBlank() ? var1 : null;
      this.f2000 = Objects.requireNonNull(var2, "type");
      this.f8000 = Iface0220.m16000(var2);
   }

   public C0059 m30000(int var1) {
      if (var1 >= 0 && var1 < this.f3000.size()) {
         C0059 var2 = this.f3000.remove(var1);
         if (var2 != null) {
            if (var2.f19000 > 0) {
               this.m96000(-var2.f19000);
            }

            var2.f10000 = null;
            var2.m74000();
            var2.m168000(null);
         }

         this.m134000();
         this.m56000(2);
         return var2;
      } else {
         return null;
      }
   }

   public String m32000() {
      return this.f8000.m12000();
   }

   private void m34000() {
      for (C0059 var1 = this; var1 != null; var1 = var1.f10000) {
         var1.f33000++;
      }
   }

   private void m36000() {
      if (this.f19000 > 0) {
         this.f18000 |= 1;
      } else {
         this.f18000 &= -2;
      }
   }

   private void m38000() {
      this.f29000++;
      this.f30000++;
      this.m34000();
   }

   public void m40000() {
      this.m44000();
   }

   public C0347 m42000() {
      return this.f6000;
   }

   private int m44000() {
      if (this.f19000 == 0) {
         return 0;
      } else {
         boolean var1 = this.m60000();
         this.f17000 &= -2;
         int var2 = var1 && !this.m60000() ? 1 : 0;

         for (C0059 var4 : this.f3000) {
            if (var4.f19000 != 0) {
               var2 += var4.m44000();
            }
         }

         if (var2 > 0) {
            this.f19000 -= var2;
         }

         this.m36000();
         return var2;
      }
   }

   public String m46000() {
      return this.f8000.m2000();
   }

   private int m48000(int var1) {
      boolean var2 = this.m60000();
      this.f17000 = C0409.m2000(this.f17000, var1);
      this.f18000 = C0409.m2000(this.f18000, var1);
      this.f7000.m12000();
      this.f7000.m24000();
      int var3 = !var2 && this.m60000() ? 1 : 0;

      for (C0059 var5 : this.f3000) {
         var3 += var5.m48000(var1);
      }

      if (var3 > 0) {
         this.f19000 += var3;
      }

      return var3;
   }

   public void m50000() {
      if (this.f5000 != null) {
         for (List var2 : this.f5000.values()) {
            for (C0383 var4 : var2) {
               var4.f3000 = true;
            }
         }

         this.f5000 = null;
      }
   }

   void m52000() {
      this.m34000();
   }

   public C0056 m54000() {
      return this.f20000;
   }

   public void m56000(int var1) {
      int var2 = C0409.m2000(0, var1);
      boolean var3 = this.m60000();
      this.f17000 = C0409.m2000(this.f17000, var2);
      this.f18000 = C0409.m2000(this.f18000, var2);
      if (!var3 && this.m60000()) {
         this.m96000(1);
      }

      this.f7000.m12000();
      this.f7000.m24000();

      for (C0059 var4 = this.f10000; var4 != null; var4 = var4.f10000) {
         var4.f18000 = C0409.m2000(var4.f18000, var2);
         var4.f7000.m24000();
      }
   }

   public void m58000() {
      if (!this.f25000) {
         this.f25000 = true;
         this.m112000(1);
      }
   }

   private boolean m60000() {
      return C0409.m4000(this.f17000, 1) || C0409.m4000(this.f17000, 2) || C0409.m4000(this.f17000, 4) || C0409.m4000(this.f17000, 8);
   }

   String m62000() {
      return this.f16000;
   }

   public C0373 m66000() {
      return this.f23000;
   }

   private void m68000() {
      this.f32000++;
   }

   public int m70000() {
      return this.f27000;
   }

   public int m72000() {
      return this.f28000;
   }

   private void m74000() {
      this.f11000 = -1;

      for (C0059 var2 : this.f3000) {
         var2.m74000();
      }
   }

   public boolean m76000() {
      return this.f15000;
   }

   public rw.gui.C0019 m78000() {
      return this.f22000;
   }

   private void m80000() {
      this.f29000++;
      this.m34000();
   }

   public int m82000() {
      return this.f30000;
   }

   public rw.gui.C0019 m84000() {
      return this.f24000;
   }

   public int m86000() {
      return this.f18000;
   }

   public List<C0368> m88000() {
      return this.f21000;
   }

   public void m90000() {
      if (this.f25000) {
         this.f25000 = false;
         this.m112000(1);
      }
   }

   public C0334 m92000() {
      return this.f7000;
   }

   public Iface0217 m94000() {
      return this.f8000.m20000();
   }

   private void m96000(int var1) {
      if (var1 != 0) {
         for (C0059 var2 = this; var2 != null; var2 = var2.f10000) {
            var2.f19000 += var1;
            var2.m36000();
         }
      }
   }

   private int m98000(int var1) {
      boolean var2 = this.m60000();
      this.f17000 &= ~var1;
      int var3 = (var1 & 1) != 0 && var2 && !this.m60000() ? 1 : 0;

      for (C0059 var5 : this.f3000) {
         var3 += var5.m98000(var1);
      }

      this.f18000 &= ~var1;
      if ((var1 & 1) != 0 && var3 > 0) {
         this.f19000 -= var3;
      }

      this.m36000();
      return var3;
   }

   public String m100000() {
      return this.f8000.m8000();
   }

   public int m102000() {
      return this.f3000.size();
   }

   private void m104000(List<C0059> var1) {
      IdentityHashMap var2 = new IdentityHashMap();

      for (C0059 var4 : this.f3000) {
         var2.put(var4, Boolean.TRUE);
      }

      IdentityHashMap var6 = new IdentityHashMap();

      for (C0059 var5 : var1) {
         if (var5 == null || var5.f10000 != this || !var2.containsKey(var5)) {
            throw new IllegalArgumentException("Reordered child list contains an element outside this parent");
         }

         if (var6.put(var5, Boolean.TRUE) != null) {
            throw new IllegalArgumentException("Reordered child list contains duplicate elements");
         }
      }
   }

   public void m106000(boolean var1) {
      this.f15000 = var1;
   }

   void m108000(String var1) {
      this.f16000 = var1 != null && !var1.isBlank() ? var1 : null;
   }

   private static boolean m110000(rw.gui.C0019 var0, rw.gui.C0019 var1) {
      return var0.m76000() == var1.m76000() && var0.m28000() == var1.m28000() && var0.m70000() == var1.m70000();
   }

   public void m112000(int var1) {
      int var2 = C0409.m2000(0, var1);
      int var3 = this.m48000(var2);

      for (C0059 var4 = this.f10000; var4 != null; var4 = var4.f10000) {
         var4.f18000 = C0409.m2000(var4.f18000, var2);
         if (var3 > 0) {
            var4.f19000 += var3;
         }

         var4.f7000.m24000();
      }
   }

   public boolean m116000(C0059 var1) {
      if (var1 == null) {
         return false;
      } else {
         int var2 = this.f3000.indexOf(var1);
         if (var2 < 0) {
            return false;
         } else {
            this.m30000(var2);
            return true;
         }
      }
   }

   public void m118000(Enum0026 var1, Iface0207 var2) {
      if (var1 != null && var2 != null && this.f5000 != null) {
         List var3 = this.f5000.get(var1);
         if (var3 != null) {
            var3.removeIf(var1x -> {
               if (var1x.f1000 != var2) {
                  return false;
               } else {
                  var1x.f3000 = true;
                  return true;
               }
            });
            if (var3.isEmpty()) {
               this.f5000.remove(var1);
            }
         }
      }
   }

   public Enum0047 m120000() {
      return this.f2000;
   }

   public void m122000(int var1) {
      this.f11000 = Math.max(-1, var1);
   }

   private static boolean m124000(rw.gui.C0019 var0, rw.gui.C0019 var1) {
      return m146000(var0.m78000(), var1.m78000()) && Objects.equals(var0.m24000(), var1.m24000());
   }

   public void m126000(String var1) {
      String var2 = var1 == null ? "" : var1;
      if (!this.f8000.m2000().equals(var2)) {
         this.f8000.m10000(var2);
         this.m80000();
         this.m56000(1);
      }
   }

   public void m128000(List<C0059> var1) {
      if (var1 == null || var1.size() != this.f3000.size()) {
         throw new IllegalArgumentException("Reordered child list must contain every current child exactly once");
      } else if (!this.m10000(var1)) {
         this.m104000(var1);
         this.f3000.clear();
         this.f3000.addAll(var1);
         this.m134000();
         this.m56000(2);
      }
   }

   public void m130000(boolean var1) {
      this.f13000 = var1;
   }

   public boolean m132000() {
      return this.f13000;
   }

   private void m134000() {
      this.f31000++;
      this.f32000++;
      this.m34000();
   }

   public boolean m138000(C0368 var1) {
      return var1 != null && C0358.m4000(this.f21000, var1);
   }

   public void m140000(String var1) {
      String var2 = var1 == null ? "" : var1;
      if (!this.f8000.m12000().equals(var2)) {
         this.f8000.m18000(var2);
         if (this.f2000 == Enum0047.f4000) {
            this.f6000.m70000("");
         }

         this.m38000();
         this.m56000(this.f2000 == Enum0047.f4000 ? 2 : 1);
      }
   }

   public void m142000(C0056 var1) {
      this.f20000 = var1 == null ? C0056.f1000 : var1;
   }

   public void m144000(boolean var1) {
      this.f12000 = var1;
   }

   private static boolean m146000(float var0, float var1) {
      return Float.floatToIntBits(var0) == Float.floatToIntBits(var1);
   }

   public C0059 m148000(int var1) {
      return this.f3000.get(var1);
   }

   public void m150000(C0373 var1, rw.gui.C0019 var2) {
      this.f23000 = var1;
      this.f24000 = var2;
   }

   public void m152000(rw.gui.C0019 var1) {
      rw.gui.C0019 var2 = var1 == null ? C0360.m4000() : var1;
      rw.gui.C0019 var3 = this.f22000;
      if (!Objects.equals(var3, var2)) {
         boolean var4 = var3 != null && var3.m76000() == Enum0032.f3000;
         boolean var5 = var2.m76000() == Enum0032.f3000;
         if (this.f9000 != null && var4 != var5) {
            this.f9000.m40000(var5 ? 1 : -1);
         }

         boolean var6 = var3 != null && var3.m6000();
         boolean var7 = var2.m6000();
         if (this.f9000 != null && var6 != var7) {
            this.f9000.m18000(var7 ? 1 : -1);
         }

         this.f22000 = var2;
         this.m170000(var3, var2);
      }
   }

   public String m154000() {
      return this.f1000;
   }

   public void m156000(List<C0368> var1) {
      this.f21000 = C0358.m2000(var1);
   }

   public void m158000(Iface0217 var1) {
      if (this.f8000.m20000() != var1) {
         this.f8000.m14000(var1);
         this.m80000();
         this.m56000(1);
      }
   }

   public void m160000(Enum0026 var1, Iface0207 var2, Rec0107 var3) {
      if (var1 != null && var2 != null) {
         Rec0107 var4 = var3 == null ? Rec0107.f4000 : var3;
         if (this.f5000 == null) {
            this.f5000 = new EnumMap<>(Enum0026.class);
         }

         this.f5000.computeIfAbsent(var1, var0 -> new ArrayList<>()).add(new C0383(var2, var4));
      }
   }

   public void m162000(Base0315 var1, boolean var2) {
      if (var1 != null && var1.m12000() != null && this.f5000 != null) {
         List var3 = this.f5000.get(var1.m12000());
         if (var3 != null && !var3.isEmpty()) {
            for (C0383 var6 : List.copyOf(var3)) {
               if (!var6.f3000 && var6.f2000.m8000() == var2) {
                  var1.m32000(var6.f2000.m14000());

                  try {
                     var6.f1000.m2000(var1);
                  } finally {
                     var1.m20000();
                  }

                  if (var6.f2000.m6000()) {
                     var6.f3000 = true;
                     var3.remove(var6);
                  }

                  if (var1.m36000()) {
                     break;
                  }
               }
            }

            if (var3.isEmpty()) {
               this.f5000.remove(var1.m12000());
            }
         }
      }
   }

   public boolean m164000(Enum0026 var1) {
      if (var1 != null && this.f5000 != null) {
         List var2 = this.f5000.get(var1);
         if (var2 != null && !var2.isEmpty()) {
            for (C0383 var4 : var2) {
               if (!var4.f3000) {
                  return true;
               }
            }

            return false;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public void m166000(int var1, C0059 var2) {
      if (var2 != null) {
         if (this.f2000 == Enum0047.f2000) {
            throw new IllegalStateException("Element type '" + this.f2000 + "' cannot have children");
         } else {
            int var3 = C0259.m6000(var1, 0, this.f3000.size());
            var2.f10000 = this;
            var2.m74000();
            var2.m168000(this.f9000);
            this.f3000.add(var3, var2);
            if (var2.f19000 > 0) {
               this.m96000(var2.f19000);
            }

            this.m134000();
            this.m56000(2);
         }
      }
   }

   public void m168000(C0038 var1) {
      C0038 var2 = this.f9000;
      if (var2 != var1 && this.f22000 != null && this.f22000.m76000() == Enum0032.f3000) {
         if (var2 != null) {
            var2.m40000(-1);
         }

         if (var1 != null) {
            var1.m40000(1);
         }
      }

      if (var2 != var1 && this.f22000 != null && this.f22000.m6000()) {
         if (var2 != null) {
            var2.m18000(-1);
         }

         if (var1 != null) {
            var1.m18000(1);
         }
      }

      this.f9000 = var1;

      for (C0059 var4 : this.f3000) {
         var4.m168000(var1);
      }
   }

   private void m170000(rw.gui.C0019 var1, rw.gui.C0019 var2) {
      this.f26000++;
      if (!m124000(var1, var2)) {
         this.f27000++;
      }

      if (!m8000(var1, var2)) {
         this.f28000++;
      }

      this.m34000();
      if (!m110000(var1, var2)) {
         this.m184000();
      }
   }

   public void m172000(C0059 var1) {
      this.m166000(this.f3000.size(), var1);
   }

   public void m174000(Enum0026 var1, Iface0207 var2) {
      this.m160000(var1, var2, Rec0107.f4000);
   }

   public boolean m176000() {
      return this.f14000;
   }

   public boolean m178000(int var1) {
      return var1 == 1 ? this.f19000 > 0 : C0409.m4000(this.f18000, var1);
   }

   public C0059 m180000() {
      return this.f10000;
   }

   public int m182000() {
      return this.f33000;
   }

   void m184000() {
      if (this.f10000 != null) {
         this.f10000.m68000();
      }
   }

   public int m186000() {
      return this.f26000;
   }

   public int m188000() {
      return this.f31000;
   }
}
