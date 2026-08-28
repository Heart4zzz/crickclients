package rw.core;

import java.util.function.BooleanSupplier;
import java.util.function.IntSupplier;
import rw.api.Iface0003;
import rw.api.Iface0006;
import rw.data.Rec0003;
import rw.data.Rec0007;
import rw.defs.Enum0061;
import rw.defs.Enum0062;
import rw.defs.Enum0063;

public class C0012 {
   private static short[] f1000;
   private static short[] f2000;
   public Object[] f3000;
   private static short[] f4000;
   private static short[] f5000;
   private static short[] f6000;
   private static short[] f7000;
   private static short[] f8000;
   private static short[] f9000;
   private static short[] f10000;
   private static short[] f11000;
   private static short[] f12000;
   private static short[] f13000;
   private static short[] f14000;
   private static short[] f15000;
   private static short[] f16000;
   private static short[] f17000;
   private static short[] f18000;
   private static short[] f19000;
   public Object[] f20000;
   private static short[] f21000;

   public void m2000() {
      ((C0025)this.f3000[7]).m14000();
   }

   public void m4000(int var1, int var2) {
      Integer var7 = var1;
      this.f20000[2] = var7;
      Integer var8 = var2;
      this.f20000[3] = var8;
   }

   public boolean m6000() {
      return ((C0025)this.f3000[7]).m20000();
   }

   public C0023 m10000(C0023 var1) {
      return ((C0025)this.f3000[7]).m58000(var1);
   }

   public C0012 m12000(boolean var1) {
      if ((Boolean)this.f20000[5] != var1) {
         this.m2000();
         Boolean var6 = var1;
         this.f20000[5] = var6;
      }

      return this;
   }

   public Iface0006 m14000(C0023 var1) {
      return ((C0025)this.f3000[f11000[2]]).m16000(var1);
   }

   public void m16000() {
      this.m116000(this.m52000(), this.m26000());
   }

   public Iface0003 m18000() {
      return ((C0025)this.f3000[7]).m12000();
   }

   public void m20000() {
      ((C0025)this.f3000[7]).m22000();
   }

   C0012(
      IntSupplier var1,
      IntSupplier var2,
      Enum0062 var3,
      boolean var4,
      Enum0063 var5,
      Enum0063 var6,
      Enum0061 var7,
      Enum0061 var8,
      boolean var9,
      String var10,
      BooleanSupplier var11
   ) {
      this.m128000();
      C0025 var16 = new C0025(this);
      this.f3000[7] = var16;
      this.f20000[0] = var1;
      this.f20000[1] = var2;
      Integer var19 = this.m52000();
      this.f20000[2] = var19;
      Integer var20 = this.m26000();
      this.f20000[3] = var20;
      this.f20000[4] = var3;
      Boolean var22 = var4;
      this.f20000[5] = var22;
      this.f3000[0] = var5;
      this.f3000[1] = var6;
      this.f3000[2] = var7;
      this.f3000[3] = var8;
      Boolean var27 = var9;
      this.f3000[4] = var27;
      this.f3000[5] = var10;
      BooleanSupplier var29 = var11 == null ? () -> (boolean)0 : var11;
      this.f3000[6] = var29;
   }

   static {
      ntfClinit();
   }

   public void m24000(C0023 var1) {
      ((C0025)this.f3000[7]).m10000(var1);
   }

   public int m26000() {
      return Math.max(1, ((IntSupplier)this.f20000[1]).getAsInt());
   }

   public boolean m32000() {
      return ((BooleanSupplier)this.f3000[6]).getAsBoolean();
   }

   public boolean m34000(C0023 var1) {
      return ((C0025)this.f3000[7]).m6000(var1);
   }

   public Rec0007 m38000() {
      return this.m44000();
   }

   public Rec0007 m40000(int var1, int var2) {
      Rec0003 var3 = new Rec0003(
         var1,
         var2,
         (Enum0062)this.f20000[4],
         (Enum0063)this.f3000[0],
         (Enum0063)this.f3000[1],
         (Enum0061)this.f3000[2],
         (Enum0061)this.f3000[3],
         (Boolean)this.f3000[4],
         3
      );
      Rec0003 var4 = this.f20000[5]
         ? new Rec0003(
            var1,
            var2,
            (Enum0062)Enum0062.f2000[4],
            (Enum0063)Enum0063.f1000[0],
            (Enum0063)Enum0063.f1000[0],
            (Enum0061)Enum0061.f1000[0],
            (Enum0061)Enum0061.f1000[0],
            false,
            5
         )
         : null;
      return new Rec0007(var3, var4, (String)this.f3000[5]);
   }

   public Enum0063 m42000() {
      return (Enum0063)this.f3000[1];
   }

   public Rec0007 m44000() {
      return this.m40000(this.m52000(), this.m26000());
   }

   public Enum0061 m46000() {
      return (Enum0061)this.f3000[2];
   }

   public Enum0063 m48000() {
      return (Enum0063)this.f3000[0];
   }

   public String m50000() {
      return (String)this.f3000[5];
   }

   public int m52000() {
      return Math.max(1, ((IntSupplier)this.f20000[0]).getAsInt());
   }

   public static C0030 m56000() {
      return new C0030();
   }

   public boolean m58000() {
      return ((C0025)this.f3000[7]).m38000();
   }

   public boolean m62000() {
      return (Boolean)this.f20000[5];
   }

   public C0023 m64000() {
      return ((C0025)this.f3000[7]).m50000();
   }

   public Iface0003 m66000() {
      return ((C0025)this.f3000[7]).m64000();
   }

   public Iface0006 m68000() {
      return ((C0025)this.f3000[7]).m4000();
   }

   public static C0012 m70000(int var0, int var1) {
      return m84000(var0, var1).m40000();
   }

   public Iface0003 m72000(C0023 var1) {
      return ((C0025)this.f3000[f11000[1]]).m30000(var1);
   }

   public int m76000() {
      return (Integer)this.f20000[3];
   }

   public boolean m82000() {
      return (boolean)(this.f20000[2] == this.m52000() && this.f20000[3] == this.m26000() ? 0 : 1);
   }

   public static C0030 m84000(int var0, int var1) {
      return m96000(() -> var0, () -> var1);
   }

   public C0023 m86000(C0023 var1) {
      return ((C0025)this.f3000[7]).m66000(var1);
   }

   public C0012 m88000(boolean var1) {
      return this.m112000(() -> (boolean)(!var1 ? 1 : 0));
   }

   public boolean m90000() {
      return (Boolean)this.f3000[4];
   }

   public C0012 m92000(Enum0061 var1) {
      return this.m102000(var1, var1);
   }

   public C0012 m94000(String var1) {
      this.f3000[5] = var1;
      return this;
   }

   public static C0030 m96000(IntSupplier var0, IntSupplier var1) {
      return m56000()
         .m38000(var0)
         .m24000(var1)
         .m48000((Enum0062)Enum0062.f2000[0])
         .m32000((Enum0063)Enum0063.f1000[0])
         .m14000((Enum0063)Enum0063.f1000[0])
         .m6000((Enum0061)Enum0061.f1000[0])
         .m28000((Enum0061)Enum0061.f1000[0])
         .m42000(() -> (boolean)0);
   }

   public C0012 m98000(Enum0062 var1) {
      if ((Enum0062)this.f20000[4] != var1) {
         this.m2000();
         this.f20000[4] = var1;
      }

      return this;
   }

   public void m100000(long var1, long var3) {
      ((C0025)this.f3000[7]).m60000(var1, var3);
   }

   public C0012 m102000(Enum0061 var1, Enum0061 var2) {
      if ((Enum0061)this.f3000[2] != var1 || (Enum0061)this.f3000[3] != var2) {
         this.m2000();
         this.f3000[2] = var1;
         this.f3000[3] = var2;
      }

      return this;
   }

   public C0012 m104000(boolean var1) {
      if ((Boolean)this.f3000[4] != var1) {
         this.m2000();
         Boolean var6 = var1;
         this.f3000[4] = var6;
      }

      return this;
   }

   public C0012 m106000(Enum0063 var1, Enum0063 var2) {
      if ((Enum0063)this.f3000[0] != var1 || (Enum0063)this.f3000[1] != var2) {
         this.m2000();
         this.f3000[0] = var1;
         this.f3000[1] = var2;
      }

      return this;
   }

   public Iface0003 m108000(C0023 var1) {
      return ((C0025)this.f3000[f11000[0]]).m24000(var1);
   }

   public C0012 m112000(BooleanSupplier var1) {
      BooleanSupplier var6 = var1 == null ? () -> (boolean)0 : var1;
      this.f3000[6] = var6;
      return this;
   }

   public void m114000() {
      ((C0025)this.f3000[7]).m32000();
   }

   public void m116000(int var1, int var2) {
      var1 = Math.max(1, var1);
      var2 = Math.max(1, var2);
      if ((Integer)this.f20000[2] != var1 || (Integer)this.f20000[3] != var2) {
         this.m4000(var1, var2);
         ((C0025)this.f3000[7]).m36000(var1, var2);
      }
   }

   public Enum0062 m118000() {
      return (Enum0062)this.f20000[4];
   }

   public Enum0061 m120000() {
      return (Enum0061)this.f3000[3];
   }

   public void m122000(C0023 var1) {
      ((C0025)this.f3000[7]).m34000(var1);
   }

   private static void m124000() {
      f19000 = new short[]{7, 0, 1, 2, 3, 4};
      f13000 = new short[]{5, 0, 1};
      f4000 = new short[]{2, 3, 4, 5, 6};
      f16000 = new short[]{0, 0, 0, 0, 0};
      f1000 = new short[]{2, 3};
      f9000 = new short[]{4, 5, 0, 1};
      f6000 = new short[]{2, 3};
      f7000 = new short[]{4, 5, 6, 7, 7};
      f2000 = new short[]{7, 7, 5, 5, 0, 1, 0};
      f14000 = new short[]{1, 2, 3, 2};
      f17000 = new short[]{3, 4, 4, 4, 4, 6, 5, 2};
      f8000 = new short[]{3, 7};
      f10000 = new short[]{2, 3, 2, 3, 7};
      f12000 = new short[]{7, 7};
      f18000 = new short[]{7, 7, 7, 7, 7, 7, 7};
      f11000 = new short[]{7, 7, 7};
      f15000 = new short[]{7, 4, 0, 1, 2};
      f5000 = new short[]{3, 4, 5, 4, 0, 0, 0, 0};
      f21000 = new short[]{5, 0, 1};
   }

   public int m126000() {
      return (Integer)this.f20000[2];
   }

   private void m128000() {
      if (this.f20000 == null) {
         this.f20000 = new Object[6];
         Object[] var1 = this.f20000;
         var1[2] = 0;
         var1[3] = 0;
         var1[5] = false;
      }

      if (this.f3000 == null) {
         this.f3000 = new Object[8];
         Object[] var2 = this.f3000;
         var2[4] = false;
      }
   }
}
