package rw.setting;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import rw.api.Iface0212;
import rw.core.C0285;
import rw.core.C0294;
import rw.core.C0302;
import rw.core.C0309;
import rw.core.C0322;
import rw.core.C0385;
import rw.core.C0404;
import rw.data.Rec0090;
import rw.data.Rec0092;
import rw.data.Rec0099;
import rw.defs.Enum0032;
import rw.gui.Rec0015;

public final class C0038 {
   private final rw.gui.C0013 f1000;
   private final C0024 f2000;
   private final rw.gui.C0020 f3000;
   private final C0053 f4000;
   private final C0030 f5000;
   private final C0285 f6000;
   private C0059 f7000;
   private float f8000;
   private float f9000;
   private final Map<String, C0059> f10000 = new HashMap<>();
   private final List<C0059> f11000 = new ArrayList<>();
   private final List<C0059> f12000 = new ArrayList<>();
   private int f13000;
   private int f14000;
   private List<C0059> f15000 = List.of();
   private final ArrayList<C0059> f16000 = new ArrayList<>();
   private C0059 f17000;
   private int f18000 = -1;
   private boolean f19000;

   private void m2000(C0059 var1) {
      if (var1 != null) {
         this.f1000.m4000().m10000(var1);
         this.f2000.m6000(var1);
         this.f3000.m36000(var1);
      }
   }

   public String m4000() {
      return C0034.m6000(this.f7000, Rec0092.m10000());
   }

   public float m6000() {
      return this.f9000;
   }

   public C0038(rw.gui.C0013 var1, C0031 var2) {
      this.f1000 = Objects.requireNonNull(var1, "context");
      this.f2000 = C0024.m18000(var1);
      this.f3000 = rw.gui.C0020.m22000(var1);
      this.f4000 = C0053.m20000(var1);
      this.f5000 = new C0030(new C0032(), this::m2000);
      this.f6000 = new C0285();
      C0031 var3 = Objects.requireNonNull(var2, "rootSpec");
      this.f7000 = this.f5000.m16000(var3);
      this.f7000.m168000(this);
      this.f4000.m24000(this.f7000);
   }

   public C0038(rw.gui.C0013 var1, Iface0212 var2) {
      this(var1, var2, new C0032());
   }

   C0038(rw.gui.C0013 var1, Iface0212 var2, C0032 var3) {
      this.f1000 = Objects.requireNonNull(var1, "context");
      this.f2000 = C0024.m18000(var1);
      this.f3000 = rw.gui.C0020.m22000(var1);
      this.f4000 = C0053.m20000(var1);
      this.f5000 = new C0030(Objects.requireNonNull(var3, "nodeSpecCompiler"), this::m2000);
      this.f6000 = new C0285();
      this.f7000 = Objects.requireNonNull((C0059)var2, "root");
      this.f7000.m168000(this);
   }

   public boolean m8000() {
      ArrayList var1 = new ArrayList();
      this.m22000(this.f7000, var1);
      if (var1.isEmpty()) {
         return false;
      } else {
         for (C0059 var3 : var1) {
            this.m2000(var3);
            if (var3.m180000() != null) {
               var3.m180000().m116000(var3);
            }
         }

         return true;
      }
   }

   private boolean m10000() {
      this.f11000.clear();
      this.f12000.clear();
      m30000(this.f7000, this.f11000, this.f12000);
      if (this.f11000.isEmpty() && this.f12000.isEmpty()) {
         return false;
      } else {
         this.f10000.clear();
         m32000(this.f7000, this.f10000);
         boolean var1 = false;

         for (C0059 var3 : this.f11000) {
            C0059 var4 = this.f10000.get(var3.m78000().m72000());
            if (var4 != null && var4 != var3) {
               var1 |= C0302.m10000(var3, C0322.m4000(var4), this.f8000, this.f9000);
            }
         }

         for (C0059 var6 : this.f12000) {
            C0059 var7 = this.f10000.get(var6.m78000().m72000());
            if (var7 != null && var7 != var6) {
               var1 |= C0302.m10000(var6, m52000(var7), this.f8000, this.f9000);
            }
         }

         return var1;
      }
   }

   public boolean m12000() {
      return this.f13000 > 0;
   }

   public List<C0059> m16000() {
      if (this.f7000 == null) {
         return List.of();
      } else {
         int var1 = this.f7000.m182000();
         if (this.f19000 && this.f17000 == this.f7000 && this.f18000 == var1) {
            return this.f15000;
         } else {
            this.f16000.clear();
            m42000(this.f7000, this.f16000);
            if (this.f16000.size() > 1) {
               this.f16000.sort(Comparator.comparingInt(var0 -> var0.m42000().m46000()));
            }

            this.f15000 = this.f16000.isEmpty() ? List.of() : List.copyOf(this.f16000);
            this.f17000 = this.f7000;
            this.f18000 = var1;
            this.f19000 = true;
            return this.f15000;
         }
      }
   }

   public void m18000(int var1) {
      this.f14000 = Math.max(0, this.f14000 + var1);
   }

   public Iface0212 m20000() {
      return this.f7000;
   }

   private void m22000(C0059 var1, List<C0059> var2) {
      if (var1 != null) {
         for (int var3 = var1.m102000() - 1; var3 >= 0; var3--) {
            C0059 var4 = var1.m148000(var3);
            if (var4.m26000() && !this.f2000.m20000(var4)) {
               var2.add(var4);
            } else {
               this.m22000(var4, var2);
            }
         }
      }
   }

   public Rec0090 m24000(Rec0092 var1) {
      return C0034.m26000(this.f7000, var1);
   }

   private void m26000(C0059 var1) {
      if (var1 != null) {
         ArrayDeque var2 = new ArrayDeque();
         var2.push(var1);

         while (!var2.isEmpty()) {
            C0059 var3 = (C0059)var2.pop();
            if (var3.m26000()) {
               this.f1000.m4000().m10000(var3);
            } else {
               for (int var4 = 0; var4 < var3.m102000(); var4++) {
                  var2.push(var3.m148000(var4));
               }
            }
         }
      }
   }

   private static C0059 m28000(C0059 var0, String var1) {
      if (var1.equals(var0.m154000())) {
         return var0;
      } else {
         for (int var2 = 0; var2 < var0.m102000(); var2++) {
            C0059 var3 = m28000(var0.m148000(var2), var1);
            if (var3 != null) {
               return var3;
            }
         }

         return null;
      }
   }

   private static void m30000(C0059 var0, List<C0059> var1, List<C0059> var2) {
      rw.gui.C0019 var3 = var0.m78000();
      if (var3.m72000() != null) {
         if (var3.m76000() == Enum0032.f3000) {
            var1.add(var0);
         } else if (var3.m76000() == Enum0032.f2000) {
            var2.add(var0);
         }
      }

      for (int var4 = 0; var4 < var0.m102000(); var4++) {
         m30000(var0.m148000(var4), var1, var2);
      }
   }

   private static void m32000(C0059 var0, Map<String, C0059> var1) {
      String var2 = var0.m154000();
      if (var2 != null) {
         var1.putIfAbsent(var2, var0);
      }

      for (int var3 = 0; var3 < var0.m102000(); var3++) {
         m32000(var0.m148000(var3), var1);
      }
   }

   public boolean m34000(float var1, float var2, float var3, boolean var4) {
      this.f8000 = Math.max(0.0F, var1);
      this.f9000 = Math.max(0.0F, var2);
      if (var4 && this.f7000 != null && this.f14000 != 0) {
         C0309.m6000(this.f7000);
         boolean var5 = this.m10000();
         return var5 | C0309.m4000(this.f7000, var3);
      } else {
         return false;
      }
   }

   public rw.gui.C0013 m36000() {
      return this.f1000;
   }

   private void m38000(C0294 var1) {
      this.m2000(this.f7000);
      this.f7000.m168000(null);
      this.f7000 = Objects.requireNonNull(var1.m4000(), "resolvedElement");
      this.f7000.m168000(this);
   }

   public void m40000(int var1) {
      this.f13000 = Math.max(0, this.f13000 + var1);
   }

   private static void m42000(C0059 var0, List<C0059> var1) {
      rw.gui.C0019 var2 = var0.m78000();
      if (var2.m104000() && !(var2.m84000() <= 0.0F)) {
         for (C0059 var4 : C0404.m6000(var0)) {
            if (C0385.m6000(var4)) {
               var1.add(var4);
            }

            m42000(var4, var1);
         }
      }
   }

   public Iface0212 m44000(C0031 var1, Rec0015 var2) {
      Objects.requireNonNull(var1, "spec");
      Objects.requireNonNull(var2, "options");
      rw.data.Rec0094 var3 = this.f6000.m2000(this.f7000, var1, var2, this.f2000);
      this.f5000.m14000(var3);
      if (var3.m4000().m16000()) {
         this.f5000.m10000(var3.m4000(), var2);
      } else {
         this.m38000(var3.m4000());
      }

      this.m26000(this.f7000);
      this.f4000.m26000(this.f7000);
      this.m8000();
      return this.f7000;
   }

   public Iface0212 m46000(C0031 var1) {
      return this.m44000(var1, Rec0015.m8000());
   }

   public String m48000(Rec0092 var1) {
      return C0034.m6000(this.f7000, var1);
   }

   public Rec0099 m50000(String var1) {
      if (var1 != null && this.f7000 != null) {
         C0059 var2 = m28000(this.f7000, var1);
         return var2 == null ? null : C0322.m4000(var2);
      } else {
         return null;
      }
   }

   private static Rec0099 m52000(C0059 var0) {
      return new Rec0099(var0.m42000().m58000(), var0.m42000().m8000(), var0.m42000().m48000(), var0.m42000().m22000());
   }

   public float m54000() {
      return this.f8000;
   }
}
