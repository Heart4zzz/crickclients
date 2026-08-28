package rw.core;

import java.time.Duration;
import rw.api.Iface0659;
import rw.defs.Enum0089;

public class C1197 {
   private static double[] f1000;
   private static short[] f2000;
   private static short[] f3000;
   private static short[] f4000;
   private static short[] f5000;
   private static short[] f6000;
   private static short[] f7000;
   private static short[] f8000;
   private static short[] f9000;
   private static byte[] f10000;
   private static short[] f11000;
   private static short[] f12000;
   public Object[] f13000;
   private static short[] f14000;
   public Object[] f15000;
   private static short[] f16000;

   public boolean m4000() {
      return (boolean)(this.f13000[4] && this.m28000() < ((Duration)this.f15000[1]).toNanos() ? 1 : 0);
   }

   public boolean m6000() {
      return (Boolean)this.f13000[4];
   }

   private static void m10000() {
      f16000 = new short[]{1, 5, 1, 3, 2};
      f7000 = new short[]{2, 2};
      f8000 = new short[]{2, 0, 0, 2};
      f9000 = new short[]{2, 0, 1, 1, 2};
      f5000 = new short[]{0, 3};
      f3000 = new short[]{2, 1, 3, 5, 2, 4, 0, 4};
      f12000 = new short[]{5, 4, 1, 2, 0, 2, 1};
      f4000 = new short[]{2, 0, 2, 4};
      f2000 = new short[]{5, 4, 3, 4};
      f14000 = new short[]{1, 5, 4, 3, 2, 2};
      f11000 = new short[]{2, 2, 0, 0, 0, 1, 2, 0};
      f6000 = new short[]{1, 2, 3, 4, 5};
   }

   public C1197(Enum0089 var1) {
      this.m26000();
      Duration var6 = Duration.ZERO;
      this.f15000[1] = var6;
      Iface0659 var7 = (Iface0659)C1182.f14000[5];
      this.f13000[1] = var7;
      this.f13000[3] = var1;
      Double var9 = var1.m2000() ? f1000[0] : f1000[1];
      this.f13000[2] = var9;
      Double var10 = (Double)this.f13000[2];
      this.f15000[2] = var10;
      Double var11 = (Double)this.f13000[f8000[0]];
      this.f13000[f8000[1]] = var11;
   }

   static {
      ntfClinit();
   }

   public double m12000() {
      return (Double)this.f15000[2];
   }

   public Enum0089 m14000() {
      return (Enum0089)this.f13000[3];
   }

   public Iface0659 m16000() {
      return (Iface0659)this.f13000[1];
   }

   private static void m22000() {
      f10000 = new byte[]{3, 2, 6, 4, 5};
   }

   private static void m24000() {
      f1000 = new double[]{0.0, 1.0, 1.0, 0.0, 1.0, 0.0, 0.0};
   }

   private void m26000() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 0
      //   at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
      //   at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
      //   at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
      //   at java.base/java.util.Objects.checkIndex(Objects.java:385)
      //   at java.base/java.util.ArrayList.remove(ArrayList.java:551)
      //   at org.jetbrains.java.decompiler.util.collections.ListStack.pop(ListStack.java:31)
      //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.processBlock(ExprProcessor.java:471)
      //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.processStatement(ExprProcessor.java:134)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:220)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getstatic rw/core/C1197.f10000 [B
      // 04: baload
      // 05: anewarray 4
      // 08: checkcast [Ljava/lang/Object;
      // 0b: putfield rw/core/C1197.f15000 [Ljava/lang/Object;
      // 0e: aload 0
      // 0f: bipush 6
      // 11: anewarray 4
      // 14: checkcast [Ljava/lang/Object;
      // 17: putfield rw/core/C1197.f13000 [Ljava/lang/Object;
      // 1a: aload 0
      // 1b: getfield rw/core/C1197.f15000 [Ljava/lang/Object;
      // 1e: bipush 0
      // 1f: lconst_0
      // 20: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 23: aastore
      // 24: aload 0
      // 25: getfield rw/core/C1197.f13000 [Ljava/lang/Object;
      // 28: bipush 0
      // 29: dconst_0
      // 2a: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 2d: aastore
      // 2e: aload 0
      // 2f: getfield rw/core/C1197.f15000 [Ljava/lang/Object;
      // 32: getstatic rw/core/C1197.f10000 [B
      // 35: baload
      // 36: dconst_0
      // 37: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 3a: aastore
      // 3b: aload 0
      // 3c: getfield rw/core/C1197.f13000 [Ljava/lang/Object;
      // 3f: bipush 4
      // 40: bipush 0
      // 41: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 44: aastore
      // 45: aload 0
      // 46: getfield rw/core/C1197.f13000 [Ljava/lang/Object;
      // 49: bipush 5
      // 4a: bipush 0
      // 4b: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 4e: aastore
      // 4f: return
   }

   private long m28000() {
      return System.nanoTime() - (Long)this.f15000[0];
   }

   public boolean m30000() {
      return (Boolean)this.f13000[5];
   }

   public long m32000() {
      return (Long)this.f15000[0];
   }

   public void m36000() {
      Boolean var5 = false;
      this.f13000[5] = var5;
      Boolean var6 = false;
      this.f13000[4] = var6;
      Double var7 = ((Enum0089)this.f13000[3]).m2000() ? f1000[3] : f1000[4];
      this.f13000[2] = var7;
      Double var8 = (Double)this.f13000[2];
      this.f15000[2] = var8;
      Double var9 = (Double)this.f13000[2];
      this.f13000[0] = var9;
   }

   public Duration m42000() {
      return (Duration)this.f15000[1];
   }

   public Double m44000() {
      return (Double)this.f13000[2];
   }

   public void m48000(double var1, Duration var3, Iface0659 var4) {
      if (Double.compare((Double)this.f13000[f8000[2]], var1) != 0) {
         Double var9 = (Double)this.f13000[f8000[3]];
         this.f15000[2] = var9;
         Double var10 = var1;
         this.f13000[0] = var10;
         this.f15000[1] = var3;
         this.f13000[1] = var4;
         if (var1 > (Double)this.f15000[2]) {
            Enum0089 var13 = (Enum0089)Enum0089.f1000[0];
            this.f13000[3] = var13;
         } else if (var1 < (Double)this.f15000[2]) {
            Enum0089 var14 = (Enum0089)Enum0089.f1000[1];
            this.f13000[3] = var14;
         }

         Boolean var15 = true;
         this.f13000[5] = var15;
         if (!var3.isZero() && !var3.isNegative()) {
            Long var18 = System.nanoTime();
            this.f15000[0] = var18;
            Boolean var19 = true;
            this.f13000[4] = var19;
         } else {
            Double var16 = var1;
            this.f13000[2] = var16;
            Boolean var17 = false;
            this.f13000[4] = var17;
         }
      }
   }

   public boolean m52000(Enum0089 var1) {
      return (boolean)(this.m56000() && (Enum0089)this.f13000[3] == var1 ? 1 : 0);
   }

   public void m54000() {
      if ((Boolean)this.f13000[5] && (Boolean)this.f13000[4]) {
         double var1 = (double)this.m28000() / ((Duration)this.f15000[1]).toNanos();
         if (var1 < f1000[2]) {
            Double var7 = (Double)this.f15000[2] + ((Double)this.f13000[0] - (Double)this.f15000[2]) * ((Iface0659)this.f13000[1]).m2000(var1);
            this.f13000[2] = var7;
         } else {
            Double var8 = (Double)this.f13000[0];
            this.f13000[2] = var8;
            Boolean var9 = false;
            this.f13000[4] = var9;
         }
      }
   }

   public boolean m56000() {
      return (boolean)(this.f13000[5] && !this.f13000[4] ? 1 : 0);
   }

   public double m60000() {
      return (Double)this.f13000[0];
   }
}
