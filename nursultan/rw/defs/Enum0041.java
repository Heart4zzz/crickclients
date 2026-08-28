package rw.defs;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import rw.core.C0259;
import rw.core.C0360;
import rw.core.C0378;
import rw.data.Rec0131;
import rw.gui.C0019;

public enum Enum0041 {
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
   f21000,
   f22000,
   f23000,
   f24000,
   f25000,
   f26000,
   f27000,
   f28000,
   f29000,
   f30000,
   f31000,
   f32000,
   f33000,
   f34000,
   f35000,
   f36000,
   f37000,
   f38000,
   f39000,
   f40000,
   f41000,
   f42000,
   f43000,
   f44000,
   f45000,
   f46000,
   f47000,
   f48000,
   f49000,
   f50000,
   f51000,
   f52000,
   f53000,
   f54000,
   f55000,
   f56000,
   f57000,
   f58000;

   private static final List<Enum0041> f59000;
   private static final List<Enum0041> f60000;
   private static final List<Enum0041> f61000;
   private static final List<Enum0041> f62000;
   private final boolean f63000;
   private final boolean f64000;
   private final boolean f65000;
   private final boolean f66000;
   private final Function<C0019, Object> f67000;
   private final BiPredicate<C0019, C0019> f68000;
   private final UnaryOperator<Object> f69000;

   public static List<Enum0041> m4000() {
      return f61000;
   }

   private static Object m6000(Object var0) {
      return Rec0131.class.cast(var0);
   }

   public boolean m12000() {
      return this.f65000;
   }

   private static Object m14000(Object var0) {
      float var1 = (Float)var0;
      return Float.isFinite(var1) ? var1 : 0.0F;
   }

   private Enum0041(
      boolean var3, boolean var4, boolean var5, boolean var6, Function<C0019, Object> var7, BiPredicate<C0019, C0019> var8, UnaryOperator<Object> var9
   ) {
      this.f63000 = var3;
      this.f64000 = var4;
      this.f65000 = var5;
      this.f66000 = var6;
      this.f67000 = var7;
      this.f68000 = var8;
      this.f69000 = var9;
   }

   private Enum0041(boolean var3, boolean var4, boolean var5, Function<C0019, Object> var6, BiPredicate<C0019, C0019> var7, UnaryOperator<Object> var8) {
      this(var3, false, var4, var5, var6, var7, var8);
   }

   private Enum0041(boolean var3, boolean var4, boolean var5, boolean var6, Function<C0019, Object> var7, BiPredicate<C0019, C0019> var8) {
      this(var3, var4, var5, var6, var7, var8, var0 -> var0);
   }

   private Enum0041(boolean var3, boolean var4, boolean var5, Function<C0019, Object> var6, BiPredicate<C0019, C0019> var7) {
      this(var3, false, var4, var5, var6, var7, var0 -> var0);
   }

   public static Enum0041[] m20000() {
      return (Enum0041[])f70000.clone();
   }

   private static Object m22000(Object var0) {
      return Math.max(0.0F, (Float)var0);
   }

   public boolean m24000() {
      return this.f66000;
   }

   private static Object m34000(Object var0) {
      return C0259.m8000((Float)var0, 0.0F, 1.0F);
   }

   public boolean m38000() {
      return this.f63000;
   }

   public static List<Enum0041> m68000() {
      return f62000;
   }

   private static Object m70000(Object var0) {
      float var1 = (Float)var0;
      return Float.isFinite(var1) && !(var1 <= 0.0F) ? var1 : 16.0F;
   }

   C0019 m76000(C0019 var1, Object var2) {
      C0019 var3 = var1 == null ? C0360.m4000() : var1;
      return var2 == null ? var3 : C0378.m8000(var3, this, var2);
   }

   public static List<Enum0041> m78000() {
      return f60000;
   }

   private static Object m80000(Object var0) {
      float var1 = (Float)var0;
      return !Float.isFinite(var1) ? 0.0F : Math.max(0.0F, var1);
   }

   public C0019 m84000(C0019 var1, Object var2) {
      C0019 var3 = var1 == null ? C0360.m4000() : var1;
      Object var4 = this.m92000(var2);
      return var4 == null ? var3 : this.m76000(var3, var4);
   }

   public boolean m86000(C0019 var1, C0019 var2) {
      return var1 != null && var2 != null ? this.f68000.test(var1, var2) : var1 != var2;
   }

   public static List<Enum0041> m88000() {
      return f59000;
   }

   public Object m90000(C0019 var1) {
      return var1 == null ? null : this.f67000.apply(var1);
   }

   public Object m92000(Object var1) {
      return var1 == null ? null : this.f69000.apply(var1);
   }

   public boolean m96000() {
      return this.f64000;
   }

   private static Object m98000(Object var0) {
      float var1 = (Float)var0;
      return !Float.isFinite(var1) ? 1.0F : Math.max(0.0F, var1);
   }
}
