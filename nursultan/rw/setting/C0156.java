package rw.setting;

import KDFzREm.NNNNRZ;
import KDFzREm.NQo;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.regex.Pattern;
import rw.core.Base0995;
import rw.core.Base1014;
import rw.core.C0991;
import rw.core.C1235;
import rw.core.OlqIlmnt;
import rw.data.Rec0312;
import rw.defs.Enum0059;

public class C0156 extends Base0995 implements Predicate<NQo> {
   private static short[] f1000;
   public Object[] f2000;
   private static short[] f3000;
   private static float[] f4000;
   private static float[] f5000;
   public Object[] f6000;
   private static String[] f7000;
   private static short[] f8000;
   private static String[] f9000;
   private static short[] f10000;
   private static short[] f11000;
   private static short[] f12000;

   public boolean m2000(NQo var1) {
      this.m80000();
      return NQo.y((NQo)this.f6000[5], var1);
   }

   public Rec0312 m4000() {
      this.m80000();
      return (Rec0312)this.f2000[0];
   }

   public boolean m6000() {
      this.m80000();
      return (Boolean)this.f6000[6];
   }

   public C0156(NQo var1, String var2, String var3, Enum0059 var4) {
      this.m80000();
      C0991 var9 = C0122.m26000(this, f9000[0], true);
      this.f6000[0] = var9;
      OlqIlmnt var10 = C0122.m8000(this, f9000[1], f9000[2], Pattern.compile(f9000[3]));
      this.f6000[1] = var10;
      this.f6000[5] = var1;
      Rec0312 var12 = new Rec0312(f9000[4]).m12000(var2);
      this.f2000[0] = var12;
      this.f2000[1] = var3;
      this.f2000[2] = var4;
      Optional var15 = m72000(m32000(var1), () -> C0122.m12000(this, f7000[0], f5000[3], f5000[4], f5000[5], f5000[6]));
      this.f6000[2] = var15;
      Optional var16 = m72000(var1.W(), () -> C0122.m12000(this, f9000[7], f4000[1], f5000[0], f5000[1], f5000[2]));
      this.f6000[3] = var16;
      Optional var17 = m72000(m84000(var1), () -> C0122.m26000(this, f9000[6], true));
      this.f6000[4] = var17;
   }

   static {
      ntfClinit();
   }

   public boolean m14000(Object var1) {
      this.m80000();
      return (boolean)(var1 instanceof C0156 var2 ? ((Rec0312)this.f2000[0]).m2000((Rec0312)var2.f2000[0]) : 0);
   }

   @Override
   public String toString() {
      this.m80000();
      return (String)this.f2000[1];
   }

   @Override
   public int hashCode() {
      this.m80000();
      return ((Rec0312)this.f2000[0]).hashCode();
   }

   public boolean m18000() {
      this.m80000();
      return ((Optional)this.f6000[4]).map(Base1014::m14000).orElse(false);
   }

   public OlqIlmnt m24000() {
      this.m80000();
      return (OlqIlmnt)this.f6000[1];
   }

   public Enum0059 m28000() {
      this.m80000();
      return (Enum0059)this.f2000[2];
   }

   private static boolean m32000(NQo var0) {
      return (boolean)(var0.y().N(NNNNRZ.L) && var0.method_58694(NNNNRZ.L) > 1 ? 1 : 0);
   }

   private static void m36000() {
      f11000 = new short[]{0, 1};
      f12000 = new short[]{5, 0, 1, 2, 2, 3, 4, 6};
      f10000 = new short[]{2, 3, 4, 0, 5};
      f8000 = new short[]{0, 0, 0, 1};
      f3000 = new short[]{0, 1, 2, 0, 1};
      f1000 = new short[]{5, 6, 5, 6};
   }

   private static void m40000() {
      f4000 = new float[]{1.0F, 50.0F};
      f5000 = new float[]{1.0F, 100.0F, 1.0F, 1.0F, 1.0F, 64.0F, 1.0F};
   }

   private static void m44000() {
      f9000 = new String[]{
         "auto-parser-include", "max-price", "0", "^[1-9]\\d{0,18}$", "autobuy.name", "autobuy.item", "ignore-thorns", "min-durability-percentage"
      };
      f7000 = new String[]{"min-count"};
   }

   public NQo m46000() {
      this.m80000();
      return (NQo)this.f6000[5];
   }

   public void m52000() {
      this.m80000();
      Boolean var5 = false;
      this.f6000[6] = var5;
      this.w().forEach((var0, var1) -> var1.m16000());
   }

   public boolean m56000(NQo var1) {
      return (boolean)1;
   }

   public C0991 m60000() {
      this.m80000();
      return (C0991)this.f6000[0];
   }

   public boolean m62000(NQo var1) {
      return (boolean)(this.m2000(var1) && this.m56000(var1) ? 1 : 0);
   }

   public String m64000() {
      this.m80000();
      return C1235.m40000((Rec0312)this.f2000[0]);
   }

   public int m66000() {
      this.m80000();
      return ((Optional)this.f6000[2]).<Integer>map(var0 -> ((Float)var0.i()).intValue()).orElse(1);
   }

   public C0156 m68000(boolean var1) {
      this.m80000();
      Boolean var6 = var1;
      this.f6000[6] = var6;
      return this;
   }

   public Rec0312 m8000(String var1) {
      return new Rec0312(f9000[5]).m12000(var1);
   }

   private static <T> Optional<T> m72000(boolean var0, Supplier<T> var1) {
      return var0 ? Optional.of((T)var1.get()) : Optional.empty();
   }

   public float m74000() {
      this.m80000();
      return ((Optional)this.f6000[3]).map(Base1014::m14000).orElse(f4000[0]);
   }

   public C0156 m78000(NQo var1) {
      this.m80000();
      this.f6000[5] = var1;
      return this;
   }

   private void m80000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[3];
         Object[] var1 = this.f2000;
      }

      if (this.f6000 == null) {
         this.f6000 = new Object[7];
         Object[] var2 = this.f6000;
         var2[6] = false;
      }
   }

   public String m82000() {
      this.m80000();
      return (String)this.f2000[1];
   }

   private static boolean m84000(NQo var0) {
      return (boolean)(var0.y().N(NNNNRZ.o) && var0.y().N(NNNNRZ.q) ? 1 : 0);
   }
}
