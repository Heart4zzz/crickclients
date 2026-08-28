package rw.core;

import KDFzREm.NHS;
import KDFzREm.NNNwS;
import KDFzREm.NNWE;
import KDFzREm.NNuU;
import KDFzREm.NXi;
import KDFzREm.NjL;
import rw.defs.Enum0057;

public class C0762 {
   private static short[] f1000;
   private static short[] f2000;
   private static float[] f3000;
   private static float[] f4000;
   private static short[] f5000;
   private static short[] f6000;
   private static short[] f7000;
   public Object[] f8000;
   private static float[] f9000;
   private static double[] f10000;
   private static short[] f11000;
   private static short[] f12000;
   private static short[] f13000;
   private static double[] f14000;
   private static double[] f15000;
   private static float[] f16000;
   private static short[] f17000;
   private static float[] f18000;
   private static short[] f19000;
   private static short[] f20000;
   private static short[] f21000;
   private static float[] f22000;
   private static short[] f23000;
   private static float[] f24000;
   private static float[] f25000;
   private static short[] f26000;
   private static short[] f27000;
   private static double[] f28000;
   private static double[] f29000;
   private static short[] f30000;
   private static short[] f31000;
   private static short[] f32000;
   private static short[] f33000;
   public Object[] f34000;
   private static short[] f35000;
   private static float[] f36000;
   private static double[] f37000;
   private static float[] f38000;
   private static short[] f39000;
   private static double[] f40000;
   private static short[] f41000;
   public Object[] f42000;
   private static short[] f43000;
   private static float[] f44000;
   private static float[] f45000;
   private static short[] f46000;
   private static float[] f47000;
   private static float[] f48000;
   private static float[] f49000;
   private static float[] f50000;
   private static short[] f51000;
   private static float[] f52000;

   private static void m4000() {
      f37000 = new double[]{0.0, Math.PI * 2, 0.0, Math.PI * 2, 0.0, 0.0};
      f28000 = new double[]{0.42, 0.42, 0.18, 2.4, 0.18, 1.25, 0.46};
      f10000 = new double[]{5.8, 0.85};
      f14000 = new double[]{5.2, 0.42, 0.0, 1.45, 0.0105, 0.0073};
      f29000 = new double[]{0.28, 0.0121, 0.13, 0.075, 0.58, 0.38, 0.0, Math.PI * 2};
      f15000 = new double[]{64.0, 82.0, 58.0, 145.0, 205.0, 165.0, 0.0, 0.12};
      f40000 = new double[]{0.32, 0.2, 0.46, 0.92, 0.0, 0.0};
   }

   private boolean m6000(NHS var1) {
      NXi var2 = var1.R();
      double var3 = ((NNNwS)((NNuU)C0768.f1000[0]).T[4]).method_23317() - var2.M;
      double var5 = ((NNNwS)((NNuU)C0768.f1000[0]).T[4]).method_23321() - var2.Z;
      if (!(Boolean)this.f34000[5]) {
         Double var23 = var3;
         this.f34000[3] = var23;
         Double var24 = var5;
         this.f34000[4] = var24;
         Boolean var25 = true;
         this.f34000[5] = var25;
         return (boolean)0;
      } else {
         double var7 = (Double)this.f34000[3] * var3 + (Double)this.f34000[4] * var5;
         double var9 = (Double)this.f34000[3] * var5 - (Double)this.f34000[4] * var3;
         double var11 = var3 - (Double)this.f34000[3];
         double var13 = var5 - (Double)this.f34000[4];
         double var15 = Math.hypot(var11, var13);
         int var17 = var7 <= f15000[6] && var15 > f15000[7] ? 1 : 0;
         int var18 = Math.abs(var9) > f40000[0] && var15 > f40000[1] ? 1 : 0;
         Double var26 = var3;
         this.f34000[3] = var26;
         Double var27 = var5;
         this.f34000[4] = var27;
         return (boolean)(var17 == 0 && var18 == 0 ? 0 : 1);
      }
   }

   private static void m8000() {
      f47000 = new float[]{0.5F, 0.68F, 0.5F, 0.5F, 0.68F};
      f25000 = new float[]{0.5F, 1.0F, 0.5F};
      f16000 = new float[]{0.68F, 0.5F, 0.5F, 0.68F, 0.5F};
      f48000 = new float[]{1.0F, 0.014F, 0.046F, 0.73F, 1.31F, 1.0F};
      f50000 = new float[]{-0.08F, 0.08F, 0.5F};
      f4000 = new float[]{0.9F, 0.62F, 0.44F, 0.55F, 0.5F, -0.13F, 0.13F};
      f45000 = new float[]{0.34F, 0.66F, 0.78F, 0.91F, 0.5F, -0.11F, 0.11F, 0.34F};
      f52000 = new float[]{0.66F, 0.5F, 0.17F, 0.32F, 0.18F, 0.82F, 0.62F, 0.82F};
      f24000 = new float[]{0.78F, 0.5F, -0.2F};
      f3000 = new float[]{0.2F, 0.22F, 0.78F, 0.5F, -0.22F, 0.22F, 0.24F};
      f38000 = new float[]{0.76F, 0.56F, 0.69F, 0.5F, -0.22F, 0.22F, 0.24F};
      f44000 = new float[]{0.76F, 0.5F, -0.19F, 0.19F};
      f18000 = new float[]{0.26F, 0.74F, 0.66F, 0.86F, 0.82F, 0.5F, -0.2F, 0.2F};
      f22000 = new float[]{0.24F, 0.76F, 0.46F, 0.58F, 0.46F, 0.0F, 1.0F};
      f36000 = new float[]{0.42F, 0.74F, 0.38F, 0.76F, 0.91F};
      f49000 = new float[]{0.46F, 0.76F, 0.92F};
      f9000 = new float[]{0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F};
   }

   public C0762() {
      this.m16000();
      IllisOqkm var5 = new IllisOqkm();
      this.f42000[0] = var5;
      Enum0057 var6 = (Enum0057)Enum0057.f2000[1];
      this.f42000[2] = var6;
      Float var7 = f47000[0];
      this.f42000[3] = var7;
      Float var8 = f47000[1];
      this.f8000[0] = var8;
      Float var9 = f47000[2];
      this.f8000[1] = var9;
      Float var10 = f47000[3];
      this.f8000[2] = var10;
      Float var11 = f47000[4];
      this.f8000[f30000[0]] = var11;
      Float var12 = f25000[0];
      this.f34000[f30000[1]] = var12;
      Float var13 = C0052.m8000(f37000[0], f37000[1]);
      this.f34000[f30000[2]] = var13;
      Float var14 = f25000[1];
      this.f34000[f30000[3]] = var14;
   }

   static {
      ntfClinit();
   }

   private void m16000() {
      if (this.f42000 == null) {
         this.f42000 = new Object[4];
         Object[] var1 = this.f42000;
         var1[1] = 0L;
         var1[3] = f9000[0];
      }

      if (this.f8000 == null) {
         this.f8000 = new Object[4];
         Object[] var2 = this.f8000;
         var2[0] = f9000[1];
         var2[1] = f9000[2];
         var2[2] = f9000[3];
         var2[3] = f9000[4];
      }

      if (this.f34000 == null) {
         this.f34000 = new Object[6];
         Object[] var3 = this.f34000;
         var3[0] = f9000[5];
         var3[1] = f9000[6];
         var3[2] = f9000[7];
         var3[3] = f40000[4];
         var3[4] = f40000[5];
         var3[5] = false;
      }
   }

   public NXi m22000(NHS var1) {
      return this.m32000(var1, (Float)this.f42000[3], (Float)this.f8000[0], (Float)this.f8000[1]);
   }

   private static void m26000() {
      f27000 = new short[]{0, 1};
      f51000 = new short[]{2, 3, 0, 1, 2};
      f30000 = new short[]{3, 0, 1, 2};
      f7000 = new short[]{1, 1, 2, 3, 0};
      f41000 = new short[]{1, 2, 3};
      f20000 = new short[]{0, 1, 2, 3, 4, 5, 0, 1};
      f1000 = new short[]{1, 0, 4};
      f19000 = new short[]{0, 4};
      f2000 = new short[]{1, 1, 1, 3};
      f5000 = new short[]{0, 1, 3, 0, 0, 1, 2, 3};
      f39000 = new short[]{2, 0};
      f26000 = new short[]{3, 1, 0, 2};
      f23000 = new short[]{2, 0, 2, 0, 2};
      f32000 = new short[]{0, 2, 0, 2, 2, 0, 3};
      f33000 = new short[]{0, 0, 0, 1};
      f35000 = new short[]{2, 0, 3};
      f11000 = new short[]{0, 0, 0, 1, 0, 3, 0, 0};
      f17000 = new short[]{0, 1, 0};
      f13000 = new short[]{3, 0, 0, 0, 1, 2, 3, 3};
      f31000 = new short[]{3, 0, 0, 0, 1};
      f12000 = new short[]{1, 1, 0, 1, 0, 4};
      f21000 = new short[]{0, 4, 5, 3, 4, 5, 3, 4};
      f6000 = new short[]{3, 4, 3, 4, 3};
      f46000 = new short[]{4, 0, 1, 2, 3, 2};
      f43000 = new short[]{1, 0, 3, 1, 2, 0, 3};
   }

   private NXi m28000(NXi var1, NXi var2, double var3) {
      return new NXi(NNWE.u(var3, var1.M, var2.M), NNWE.u(var3, var1.B, var2.B), NNWE.u(var3, var1.Z, var2.Z));
   }

   public NXi m30000(NHS var1, NjL var2, boolean var3, boolean var4, boolean var5) {
      long var6 = System.currentTimeMillis();
      boolean var8 = this.m6000(var1);
      if (var8) {
         Long var44 = 0L;
         this.f42000[1] = var44;
      }

      if (var6 >= (Long)this.f42000[1] || !var3 || var8) {
         this.m34000(var6, var3, var4, var5);
      }

      NXi var9 = var1.R();
      NXi var10 = var2.method_18798();
      NXi var11 = ((NNNwS)((NNuU)C0768.f1000[0]).T[4]).method_18798();
      double var12 = var10.M - var11.M * f28000[0];
      double var14 = var10.Z - var11.Z * f28000[1];
      double var16 = Math.hypot(var12, var14);
      double var18 = ((NNNwS)((NNuU)C0768.f1000[0]).T[4]).method_33571().R(var9);
      double var20 = var3
         ? NNWE.N(var18 * f28000[2] + var16 * f28000[3], f28000[4], f28000[5])
         : NNWE.N(var18 * f28000[6] + var16 * f10000[0], f10000[1], f14000[0]);
      NXi var22 = this.m22000(var1);
      NXi var23 = new NXi(var9.M + var12 * var20, var9.B + var10.B * NNWE.N(var20 * f14000[1], f14000[2], f14000[3]), var9.Z + var14 * var20);
      var23 = C0758.m22000(var2, var23);
      float var24 = var3 ? f48000[1] : f48000[2];
      double var25 = var1.u - var1.N;
      double var27 = var1.R - var1.L;
      double var29 = var1.i - var1.y;
      double var31 = Math.sin(var6 * f14000[4] + ((Float)this.f34000[1]).floatValue()) * var25 * var24;
      double var33 = Math.cos(var6 * f14000[5] + (Float)this.f34000[1] * f48000[3]) * var29 * var24 * f29000[0];
      double var35 = Math.sin(var6 * f29000[1] + (Float)this.f34000[1] * f48000[4]) * var27 * var24;
      double var37 = var3 && !var8 ? (var4 && var5 ? f29000[2] : f29000[3]) : (var4 && var5 ? f29000[4] : f29000[5]);
      NXi var39 = this.m28000(var22, var23, var37).y(var31, var33, var35);
      return this.m44000(var1, var39);
   }

   private NXi m32000(NHS var1, float var2, float var3, float var4) {
      return new NXi(NNWE.u(var2, var1.N, var1.u), NNWE.u(var3, var1.y, var1.i), NNWE.u(var4, var1.L, var1.R));
   }

   private void m34000(long param1, boolean param3, boolean param4, boolean param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 0
      //   at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
      //   at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
      //   at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
      //   at java.base/java.util.Objects.checkIndex(Objects.java:385)
      //   at java.base/java.util.ArrayList.get(ArrayList.java:427)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SwitchHelper.simplifySwitchOnEnumJ21(SwitchHelper.java:341)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SwitchHelper.simplify(SwitchHelper.java:41)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SwitchHelper.simplifySwitches(SwitchHelper.java:30)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SwitchHelper.simplifySwitches(SwitchHelper.java:34)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SwitchHelper.simplifySwitches(SwitchHelper.java:34)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:388)
      //
      // Bytecode:
      // 000: aload 0
      // 001: getfield rw/core/C0762.f42000 [Ljava/lang/Object;
      // 004: ldc_w 2
      // 007: nop
      // 008: nop
      // 009: nop
      // 00a: aaload
      // 00b: checkcast rw/defs/Enum0057
      // 00e: astore 6
      // 010: aload 0
      // 011: aload 0
      // 012: getfield rw/core/C0762.f42000 [Ljava/lang/Object;
      // 015: ldc 3
      // 017: nop
      // 018: nop
      // 019: nop
      // 01a: aaload
      // 01b: checkcast java/lang/Float
      // 01e: invokevirtual java/lang/Float.floatValue ()F
      // 021: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 024: astore 15
      // 026: getfield rw/core/C0762.f8000 [Ljava/lang/Object;
      // 029: ldc_w 2
      // 02c: nop
      // 02d: nop
      // 02e: nop
      // 02f: nop
      // 030: aload 15
      // 032: aastore
      // 033: aload 0
      // 034: aload 0
      // 035: getfield rw/core/C0762.f8000 [Ljava/lang/Object;
      // 038: ldc 0
      // 03a: nop
      // 03b: nop
      // 03c: nop
      // 03d: nop
      // 03e: aaload
      // 03f: checkcast java/lang/Float
      // 042: invokevirtual java/lang/Float.floatValue ()F
      // 045: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 048: astore 16
      // 04a: getfield rw/core/C0762.f8000 [Ljava/lang/Object;
      // 04d: ldc 3
      // 04f: nop
      // 050: nop
      // 051: nop
      // 052: nop
      // 053: aload 16
      // 055: aastore
      // 056: aload 0
      // 057: aload 0
      // 058: getfield rw/core/C0762.f8000 [Ljava/lang/Object;
      // 05b: ldc 1
      // 05d: nop
      // 05e: nop
      // 05f: nop
      // 060: nop
      // 061: aaload
      // 062: checkcast java/lang/Float
      // 065: invokevirtual java/lang/Float.floatValue ()F
      // 068: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 06b: astore 17
      // 06d: getfield rw/core/C0762.f34000 [Ljava/lang/Object;
      // 070: ldc 0
      // 072: nop
      // 073: nop
      // 074: nop
      // 075: nop
      // 076: aload 17
      // 078: aastore
      // 079: aload 0
      // 07a: aload 0
      // 07b: iload 3
      // 07c: iload 4
      // 07e: iload 5
      // 080: invokevirtual rw/core/C0762.m38000 (ZZZ)Lrw/defs/Enum0057;
      // 083: astore 18
      // 085: getfield rw/core/C0762.f42000 [Ljava/lang/Object;
      // 088: ldc_w 2
      // 08b: nop
      // 08c: nop
      // 08d: nop
      // 08e: nop
      // 08f: aload 18
      // 091: aastore
      // 092: aload 0
      // 093: getfield rw/core/C0762.f42000 [Ljava/lang/Object;
      // 096: ldc_w 2
      // 099: nop
      // 09a: nop
      // 09b: nop
      // 09c: nop
      // 09d: aaload
      // 09e: checkcast rw/defs/Enum0057
      // 0a1: aload 6
      // 0a3: if_acmpne 103
      // 0a6: aload 0
      // 0a7: getfield rw/core/C0762.f42000 [Ljava/lang/Object;
      // 0aa: ldc 0
      // 0ac: nop
      // 0ad: nop
      // 0ae: nop
      // 0af: nop
      // 0b0: aaload
      // 0b1: checkcast rw/core/IllisOqkm
      // 0b4: iload 3
      // 0b5: ifeq 0c4
      // 0b8: getstatic rw/core/C0762.f4000 [F
      // 0bb: bipush 1
      // 0bc: nop
      // 0bd: nop
      // 0be: nop
      // 0bf: nop
      // 0c0: faload
      // 0c1: goto 0cd
      // 0c4: getstatic rw/core/C0762.f4000 [F
      // 0c7: bipush 2
      // 0c8: nop
      // 0c9: nop
      // 0ca: nop
      // 0cb: nop
      // 0cc: faload
      // 0cd: invokevirtual rw/core/IllisOqkm.m34000 (F)Z
      // 0d0: ifeq 103
      // 0d3: aload 0
      // 0d4: aload 0
      // 0d5: getfield rw/core/C0762.f42000 [Ljava/lang/Object;
      // 0d8: ldc_w 2
      // 0db: nop
      // 0dc: nop
      // 0dd: nop
      // 0de: nop
      // 0df: aaload
      // 0e0: checkcast rw/defs/Enum0057
      // 0e3: aload 0
      // 0e4: getfield rw/core/C0762.f42000 [Ljava/lang/Object;
      // 0e7: ldc 0
      // 0e9: nop
      // 0ea: nop
      // 0eb: nop
      // 0ec: nop
      // 0ed: aaload
      // 0ee: checkcast rw/core/IllisOqkm
      // 0f1: invokevirtual rw/defs/Enum0057.m32000 (Lrw/core/IllisOqkm;)Lrw/defs/Enum0057;
      // 0f4: astore 19
      // 0f6: getfield rw/core/C0762.f42000 [Ljava/lang/Object;
      // 0f9: ldc_w 2
      // 0fc: nop
      // 0fd: nop
      // 0fe: nop
      // 0ff: nop
      // 100: aload 19
      // 102: aastore
      // 103: aload 0
      // 104: aload 0
      // 105: getfield rw/core/C0762.f42000 [Ljava/lang/Object;
      // 108: ldc 0
      // 10a: nop
      // 10b: nop
      // 10c: nop
      // 10d: nop
      // 10e: aaload
      // 10f: checkcast rw/core/IllisOqkm
      // 112: getstatic rw/core/C0762.f4000 [F
      // 115: bipush 3
      // 116: nop
      // 117: nop
      // 118: nop
      // 119: nop
      // 11a: faload
      // 11b: invokevirtual rw/core/IllisOqkm.m34000 (F)Z
      // 11e: ifeq 137
      // 121: aload 0
      // 122: getfield rw/core/C0762.f34000 [Ljava/lang/Object;
      // 125: ldc_w 2
      // 128: nop
      // 129: nop
      // 12a: nop
      // 12b: nop
      // 12c: aaload
      // 12d: checkcast java/lang/Float
      // 130: invokevirtual java/lang/Float.floatValue ()F
      // 133: fneg
      // 134: goto 149
      // 137: aload 0
      // 138: getfield rw/core/C0762.f42000 [Ljava/lang/Object;
      // 13b: ldc 0
      // 13d: nop
      // 13e: nop
      // 13f: nop
      // 140: nop
      // 141: aaload
      // 142: checkcast rw/core/IllisOqkm
      // 145: invokevirtual rw/core/IllisOqkm.m40000 ()I
      // 148: i2f
      // 149: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 14c: astore 20
      // 14e: getfield rw/core/C0762.f34000 [Ljava/lang/Object;
      // 151: ldc_w 2
      // 154: nop
      // 155: nop
      // 156: nop
      // 157: nop
      // 158: aload 20
      // 15a: aastore
      // 15b: aload 0
      // 15c: getfield rw/core/C0762.f42000 [Ljava/lang/Object;
      // 15f: ldc_w 2
      // 162: nop
      // 163: nop
      // 164: nop
      // 165: nop
      // 166: aaload
      // 167: checkcast rw/defs/Enum0057
      // 16a: invokevirtual rw/defs/Enum0057.ordinal ()I
      // 16d: tableswitch 736 0 3 514 736 254 31
      // 18c: aload 0
      // 18d: getstatic rw/core/C0762.f4000 [F
      // 190: bipush 4
      // 191: nop
      // 192: nop
      // 193: nop
      // 194: nop
      // 195: faload
      // 196: aload 0
      // 197: getfield rw/core/C0762.f42000 [Ljava/lang/Object;
      // 19a: ldc 0
      // 19c: nop
      // 19d: nop
      // 19e: nop
      // 19f: nop
      // 1a0: aaload
      // 1a1: checkcast rw/core/IllisOqkm
      // 1a4: getstatic rw/core/C0762.f4000 [F
      // 1a7: bipush 5
      // 1a8: nop
      // 1a9: nop
      // 1aa: nop
      // 1ab: nop
      // 1ac: faload
      // 1ad: getstatic rw/core/C0762.f4000 [F
      // 1b0: bipush 6
      // 1b2: nop
      // 1b3: nop
      // 1b4: nop
      // 1b5: faload
      // 1b6: invokevirtual rw/core/IllisOqkm.m26000 (FF)F
      // 1b9: fadd
      // 1ba: getstatic rw/core/C0762.f45000 [F
      // 1bd: bipush 0
      // 1be: nop
      // 1bf: nop
      // 1c0: nop
      // 1c1: nop
      // 1c2: faload
      // 1c3: getstatic rw/core/C0762.f45000 [F
      // 1c6: bipush 1
      // 1c7: nop
      // 1c8: nop
      // 1c9: nop
      // 1ca: nop
      // 1cb: faload
      // 1cc: invokestatic KDFzREm/NNWE.N (FFF)F
      // 1cf: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 1d2: astore 21
      // 1d4: getfield rw/core/C0762.f42000 [Ljava/lang/Object;
      // 1d7: ldc 3
      // 1d9: nop
      // 1da: nop
      // 1db: nop
      // 1dc: aload 21
      // 1de: aastore
      // 1df: aload 0
      // 1e0: aload 0
      // 1e1: getfield rw/core/C0762.f42000 [Ljava/lang/Object;
      // 1e4: ldc 0
      // 1e6: nop
      // 1e7: nop
      // 1e8: nop
      // 1e9: nop
      // 1ea: aaload
      // 1eb: checkcast rw/core/IllisOqkm
      // 1ee: getstatic rw/core/C0762.f45000 [F
      // 1f1: bipush 2
      // 1f2: nop
      // 1f3: nop
      // 1f4: nop
      // 1f5: nop
      // 1f6: faload
      // 1f7: getstatic rw/core/C0762.f45000 [F
      // 1fa: bipush 3
      // 1fb: nop
      // 1fc: nop
      // 1fd: nop
      // 1fe: nop
      // 1ff: faload
      // 200: invokevirtual rw/core/IllisOqkm.m26000 (FF)F
      // 203: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 206: astore 22
      // 208: getfield rw/core/C0762.f8000 [Ljava/lang/Object;
      // 20b: ldc 0
      // 20d: nop
      // 20e: nop
      // 20f: nop
      // 210: nop
      // 211: aload 22
      // 213: aastore
      // 214: aload 0
      // 215: getstatic rw/core/C0762.f45000 [F
      // 218: bipush 4
      // 219: nop
      // 21a: nop
      // 21b: nop
      // 21c: nop
      // 21d: faload
      // 21e: aload 0
      // 21f: getfield rw/core/C0762.f42000 [Ljava/lang/Object;
      // 222: ldc 0
      // 224: nop
      // 225: nop
      // 226: nop
      // 227: nop
      // 228: aaload
      // 229: checkcast rw/core/IllisOqkm
      // 22c: getstatic rw/core/C0762.f45000 [F
      // 22f: bipush 5
      // 230: nop
      // 231: nop
      // 232: nop
      // 233: nop
      // 234: faload
      // 235: getstatic rw/core/C0762.f45000 [F
      // 238: bipush 6
      // 23a: nop
      // 23b: nop
      // 23c: nop
      // 23d: faload
      // 23e: invokevirtual rw/core/IllisOqkm.m26000 (FF)F
      // 241: fadd
      // 242: getstatic rw/core/C0762.f45000 [F
      // 245: bipush 7
      // 247: nop
      // 248: nop
      // 249: nop
      // 24a: faload
      // 24b: getstatic rw/core/C0762.f52000 [F
      // 24e: bipush 0
      // 24f: nop
      // 250: nop
      // 251: nop
      // 252: nop
      // 253: faload
      // 254: invokestatic KDFzREm/NNWE.N (FFF)F
      // 257: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 25a: astore 23
      // 25c: getfield rw/core/C0762.f8000 [Ljava/lang/Object;
      // 25f: ldc 1
      // 261: nop
      // 262: nop
      // 263: nop
      // 264: nop
      // 265: aload 23
      // 267: aastore
      // 268: goto 540
      // 26b: aload 0
      // 26c: getstatic rw/core/C0762.f52000 [F
      // 26f: bipush 1
      // 270: nop
      // 271: nop
      // 272: nop
      // 273: nop
      // 274: faload
      // 275: aload 0
      // 276: getfield rw/core/C0762.f34000 [Ljava/lang/Object;
      // 279: ldc_w 2
      // 27c: nop
      // 27d: nop
      // 27e: nop
      // 27f: nop
      // 280: aaload
      // 281: checkcast java/lang/Float
      // 284: invokevirtual java/lang/Float.floatValue ()F
      // 287: aload 0
      // 288: getfield rw/core/C0762.f42000 [Ljava/lang/Object;
      // 28b: ldc 0
      // 28d: nop
      // 28e: nop
      // 28f: nop
      // 290: nop
      // 291: aaload
      // 292: checkcast rw/core/IllisOqkm
      // 295: getstatic rw/core/C0762.f52000 [F
      // 298: bipush 2
      // 299: nop
      // 29a: nop
      // 29b: nop
      // 29c: nop
      // 29d: faload
      // 29e: getstatic rw/core/C0762.f52000 [F
      // 2a1: bipush 3
      // 2a2: nop
      // 2a3: nop
      // 2a4: nop
      // 2a5: nop
      // 2a6: faload
      // 2a7: invokevirtual rw/core/IllisOqkm.m26000 (FF)F
      // 2aa: fmul
      // 2ab: fadd
      // 2ac: getstatic rw/core/C0762.f52000 [F
      // 2af: bipush 4
      // 2b0: nop
      // 2b1: nop
      // 2b2: nop
      // 2b3: nop
      // 2b4: faload
      // 2b5: getstatic rw/core/C0762.f52000 [F
      // 2b8: bipush 5
      // 2b9: nop
      // 2ba: nop
      // 2bb: nop
      // 2bc: nop
      // 2bd: faload
      // 2be: invokestatic KDFzREm/NNWE.N (FFF)F
      // 2c1: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 2c4: astore 24
      // 2c6: getfield rw/core/C0762.f42000 [Ljava/lang/Object;
      // 2c9: ldc 3
      // 2cb: nop
      // 2cc: nop
      // 2cd: nop
      // 2ce: nop
      // 2cf: aload 24
      // 2d1: aastore
      // 2d2: aload 0
      // 2d3: aload 0
      // 2d4: getfield rw/core/C0762.f42000 [Ljava/lang/Object;
      // 2d7: ldc 0
      // 2d9: nop
      // 2da: nop
      // 2db: nop
      // 2dc: nop
      // 2dd: aaload
      // 2de: checkcast rw/core/IllisOqkm
      // 2e1: getstatic rw/core/C0762.f52000 [F
      // 2e4: bipush 6
      // 2e6: nop
      // 2e7: nop
      // 2e8: nop
      // 2e9: faload
      // 2ea: iload 4
      // 2ec: ifeq 2fb
      // 2ef: getstatic rw/core/C0762.f52000 [F
      // 2f2: bipush 7
      // 2f4: nop
      // 2f5: nop
      // 2f6: nop
      // 2f7: faload
      // 2f8: goto 304
      // 2fb: getstatic rw/core/C0762.f24000 [F
      // 2fe: bipush 0
      // 2ff: nop
      // 300: nop
      // 301: nop
      // 302: nop
      // 303: faload
      // 304: invokevirtual rw/core/IllisOqkm.m26000 (FF)F
      // 307: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 30a: astore 25
      // 30c: getfield rw/core/C0762.f8000 [Ljava/lang/Object;
      // 30f: ldc 0
      // 311: nop
      // 312: nop
      // 313: nop
      // 314: nop
      // 315: aload 25
      // 317: aastore
      // 318: aload 0
      // 319: getstatic rw/core/C0762.f24000 [F
      // 31c: bipush 1
      // 31d: nop
      // 31e: nop
      // 31f: nop
      // 320: nop
      // 321: faload
      // 322: aload 0
      // 323: getfield rw/core/C0762.f42000 [Ljava/lang/Object;
      // 326: ldc 0
      // 328: nop
      // 329: nop
      // 32a: nop
      // 32b: nop
      // 32c: aaload
      // 32d: checkcast rw/core/IllisOqkm
      // 330: getstatic rw/core/C0762.f24000 [F
      // 333: bipush 2
      // 334: nop
      // 335: nop
      // 336: nop
      // 337: nop
      // 338: faload
      // 339: getstatic rw/core/C0762.f3000 [F
      // 33c: bipush 0
      // 33d: nop
      // 33e: nop
      // 33f: nop
      // 340: nop
      // 341: faload
      // 342: invokevirtual rw/core/IllisOqkm.m26000 (FF)F
      // 345: fadd
      // 346: getstatic rw/core/C0762.f3000 [F
      // 349: bipush 1
      // 34a: nop
      // 34b: nop
      // 34c: nop
      // 34d: nop
      // 34e: faload
      // 34f: getstatic rw/core/C0762.f3000 [F
      // 352: bipush 2
      // 353: nop
      // 354: nop
      // 355: nop
      // 356: nop
      // 357: faload
      // 358: invokestatic KDFzREm/NNWE.N (FFF)F
      // 35b: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 35e: astore 26
      // 360: getfield rw/core/C0762.f8000 [Ljava/lang/Object;
      // 363: ldc 1
      // 365: nop
      // 366: nop
      // 367: nop
      // 368: nop
      // 369: aload 26
      // 36b: aastore
      // 36c: goto 540
      // 36f: aload 0
      // 370: getstatic rw/core/C0762.f3000 [F
      // 373: bipush 3
      // 374: nop
      // 375: nop
      // 376: nop
      // 377: nop
      // 378: faload
      // 379: aload 0
      // 37a: getfield rw/core/C0762.f42000 [Ljava/lang/Object;
      // 37d: ldc 0
      // 37f: nop
      // 380: nop
      // 381: nop
      // 382: nop
      // 383: aaload
      // 384: checkcast rw/core/IllisOqkm
      // 387: getstatic rw/core/C0762.f3000 [F
      // 38a: bipush 4
      // 38b: nop
      // 38c: nop
      // 38d: nop
      // 38e: nop
      // 38f: faload
      // 390: getstatic rw/core/C0762.f3000 [F
      // 393: bipush 5
      // 394: nop
      // 395: nop
      // 396: nop
      // 397: nop
      // 398: faload
      // 399: invokevirtual rw/core/IllisOqkm.m26000 (FF)F
      // 39c: fadd
      // 39d: getstatic rw/core/C0762.f3000 [F
      // 3a0: bipush 6
      // 3a2: nop
      // 3a3: nop
      // 3a4: nop
      // 3a5: faload
      // 3a6: getstatic rw/core/C0762.f38000 [F
      // 3a9: bipush 0
      // 3aa: nop
      // 3ab: nop
      // 3ac: nop
      // 3ad: nop
      // 3ae: faload
      // 3af: invokestatic KDFzREm/NNWE.N (FFF)F
      // 3b2: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 3b5: astore 27
      // 3b7: getfield rw/core/C0762.f42000 [Ljava/lang/Object;
      // 3ba: ldc 3
      // 3bc: nop
      // 3bd: nop
      // 3be: nop
      // 3bf: nop
      // 3c0: aload 27
      // 3c2: aastore
      // 3c3: aload 0
      // 3c4: aload 0
      // 3c5: getfield rw/core/C0762.f42000 [Ljava/lang/Object;
      // 3c8: ldc 0
      // 3ca: nop
      // 3cb: nop
      // 3cc: nop
      // 3cd: aaload
      // 3ce: checkcast rw/core/IllisOqkm
      // 3d1: getstatic rw/core/C0762.f38000 [F
      // 3d4: bipush 1
      // 3d5: nop
      // 3d6: nop
      // 3d7: nop
      // 3d8: nop
      // 3d9: faload
      // 3da: getstatic rw/core/C0762.f38000 [F
      // 3dd: bipush 2
      // 3de: nop
      // 3df: nop
      // 3e0: nop
      // 3e1: nop
      // 3e2: faload
      // 3e3: invokevirtual rw/core/IllisOqkm.m26000 (FF)F
      // 3e6: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 3e9: astore 28
      // 3eb: getfield rw/core/C0762.f8000 [Ljava/lang/Object;
      // 3ee: ldc 0
      // 3f0: nop
      // 3f1: nop
      // 3f2: nop
      // 3f3: aload 28
      // 3f5: aastore
      // 3f6: aload 0
      // 3f7: getstatic rw/core/C0762.f38000 [F
      // 3fa: bipush 3
      // 3fb: nop
      // 3fc: nop
      // 3fd: nop
      // 3fe: nop
      // 3ff: faload
      // 400: aload 0
      // 401: getfield rw/core/C0762.f42000 [Ljava/lang/Object;
      // 404: ldc 0
      // 406: nop
      // 407: nop
      // 408: nop
      // 409: nop
      // 40a: aaload
      // 40b: checkcast rw/core/IllisOqkm
      // 40e: getstatic rw/core/C0762.f38000 [F
      // 411: bipush 4
      // 412: nop
      // 413: nop
      // 414: nop
      // 415: nop
      // 416: faload
      // 417: getstatic rw/core/C0762.f38000 [F
      // 41a: bipush 5
      // 41b: nop
      // 41c: nop
      // 41d: nop
      // 41e: nop
      // 41f: faload
      // 420: invokevirtual rw/core/IllisOqkm.m26000 (FF)F
      // 423: fadd
      // 424: getstatic rw/core/C0762.f38000 [F
      // 427: bipush 6
      // 429: nop
      // 42a: nop
      // 42b: nop
      // 42c: faload
      // 42d: getstatic rw/core/C0762.f44000 [F
      // 430: bipush 0
      // 431: nop
      // 432: nop
      // 433: nop
      // 434: nop
      // 435: faload
      // 436: invokestatic KDFzREm/NNWE.N (FFF)F
      // 439: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 43c: astore 29
      // 43e: getfield rw/core/C0762.f8000 [Ljava/lang/Object;
      // 441: ldc 1
      // 443: nop
      // 444: nop
      // 445: nop
      // 446: nop
      // 447: aload 29
      // 449: aastore
      // 44a: goto 540
      // 44d: aload 0
      // 44e: getstatic rw/core/C0762.f44000 [F
      // 451: bipush 1
      // 452: nop
      // 453: nop
      // 454: nop
      // 455: nop
      // 456: faload
      // 457: aload 0
      // 458: getfield rw/core/C0762.f42000 [Ljava/lang/Object;
      // 45b: ldc 0
      // 45d: nop
      // 45e: nop
      // 45f: nop
      // 460: nop
      // 461: aaload
      // 462: checkcast rw/core/IllisOqkm
      // 465: getstatic rw/core/C0762.f44000 [F
      // 468: bipush 2
      // 469: nop
      // 46a: nop
      // 46b: nop
      // 46c: nop
      // 46d: faload
      // 46e: getstatic rw/core/C0762.f44000 [F
      // 471: bipush 3
      // 472: nop
      // 473: nop
      // 474: nop
      // 475: nop
      // 476: faload
      // 477: invokevirtual rw/core/IllisOqkm.m26000 (FF)F
      // 47a: fadd
      // 47b: getstatic rw/core/C0762.f18000 [F
      // 47e: bipush 0
      // 47f: nop
      // 480: nop
      // 481: nop
      // 482: nop
      // 483: faload
      // 484: getstatic rw/core/C0762.f18000 [F
      // 487: bipush 1
      // 488: nop
      // 489: nop
      // 48a: nop
      // 48b: nop
      // 48c: faload
      // 48d: invokestatic KDFzREm/NNWE.N (FFF)F
      // 490: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 493: astore 30
      // 495: getfield rw/core/C0762.f42000 [Ljava/lang/Object;
      // 498: ldc 3
      // 49a: nop
      // 49b: nop
      // 49c: nop
      // 49d: nop
      // 49e: aload 30
      // 4a0: aastore
      // 4a1: aload 0
      // 4a2: aload 0
      // 4a3: getfield rw/core/C0762.f42000 [Ljava/lang/Object;
      // 4a6: ldc 0
      // 4a8: nop
      // 4a9: nop
      // 4aa: nop
      // 4ab: nop
      // 4ac: aaload
      // 4ad: checkcast rw/core/IllisOqkm
      // 4b0: getstatic rw/core/C0762.f18000 [F
      // 4b3: bipush 2
      // 4b4: nop
      // 4b5: nop
      // 4b6: nop
      // 4b7: nop
      // 4b8: faload
      // 4b9: iload 4
      // 4bb: ifeq 4cf
      // 4be: iload 5
      // 4c0: ifeq 4cf
      // 4c3: getstatic rw/core/C0762.f18000 [F
      // 4c6: bipush 3
      // 4c7: nop
      // 4c8: nop
      // 4c9: nop
      // 4ca: nop
      // 4cb: faload
      // 4cc: goto 4d8
      // 4cf: getstatic rw/core/C0762.f18000 [F
      // 4d2: bipush 4
      // 4d3: nop
      // 4d4: nop
      // 4d5: nop
      // 4d6: nop
      // 4d7: faload
      // 4d8: invokevirtual rw/core/IllisOqkm.m26000 (FF)F
      // 4db: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 4de: astore 31
      // 4e0: getfield rw/core/C0762.f8000 [Ljava/lang/Object;
      // 4e3: ldc 0
      // 4e5: nop
      // 4e6: nop
      // 4e7: nop
      // 4e8: nop
      // 4e9: aload 31
      // 4eb: aastore
      // 4ec: aload 0
      // 4ed: getstatic rw/core/C0762.f18000 [F
      // 4f0: bipush 5
      // 4f1: nop
      // 4f2: nop
      // 4f3: nop
      // 4f4: nop
      // 4f5: faload
      // 4f6: aload 0
      // 4f7: getfield rw/core/C0762.f42000 [Ljava/lang/Object;
      // 4fa: ldc 0
      // 4fc: nop
      // 4fd: nop
      // 4fe: nop
      // 4ff: nop
      // 500: aaload
      // 501: checkcast rw/core/IllisOqkm
      // 504: getstatic rw/core/C0762.f18000 [F
      // 507: bipush 6
      // 509: nop
      // 50a: nop
      // 50b: nop
      // 50c: faload
      // 50d: getstatic rw/core/C0762.f18000 [F
      // 510: bipush 7
      // 512: nop
      // 513: nop
      // 514: nop
      // 515: faload
      // 516: invokevirtual rw/core/IllisOqkm.m26000 (FF)F
      // 519: fadd
      // 51a: getstatic rw/core/C0762.f22000 [F
      // 51d: bipush 0
      // 51e: nop
      // 51f: nop
      // 520: nop
      // 521: nop
      // 522: faload
      // 523: getstatic rw/core/C0762.f22000 [F
      // 526: bipush 1
      // 527: nop
      // 528: nop
      // 529: nop
      // 52a: nop
      // 52b: faload
      // 52c: invokestatic KDFzREm/NNWE.N (FFF)F
      // 52f: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 532: astore 32
      // 534: getfield rw/core/C0762.f8000 [Ljava/lang/Object;
      // 537: ldc 1
      // 539: nop
      // 53a: nop
      // 53b: nop
      // 53c: nop
      // 53d: aload 32
      // 53f: aastore
      // 540: iload 3
      // 541: ifeq 603
      // 544: aload 0
      // 545: getstatic rw/core/C0762.f22000 [F
      // 548: bipush 2
      // 549: nop
      // 54a: nop
      // 54b: nop
      // 54c: nop
      // 54d: faload
      // 54e: aload 0
      // 54f: getfield rw/core/C0762.f8000 [Ljava/lang/Object;
      // 552: ldc_w 2
      // 555: nop
      // 556: nop
      // 557: nop
      // 558: nop
      // 559: aaload
      // 55a: checkcast java/lang/Float
      // 55d: invokevirtual java/lang/Float.floatValue ()F
      // 560: aload 0
      // 561: getfield rw/core/C0762.f42000 [Ljava/lang/Object;
      // 564: ldc 3
      // 566: nop
      // 567: nop
      // 568: nop
      // 569: aaload
      // 56a: checkcast java/lang/Float
      // 56d: invokevirtual java/lang/Float.floatValue ()F
      // 570: invokestatic KDFzREm/NNWE.B (FFF)F
      // 573: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 576: astore 33
      // 578: getfield rw/core/C0762.f42000 [Ljava/lang/Object;
      // 57b: ldc 3
      // 57d: nop
      // 57e: nop
      // 57f: nop
      // 580: aload 33
      // 582: aastore
      // 583: aload 0
      // 584: getstatic rw/core/C0762.f22000 [F
      // 587: bipush 3
      // 588: nop
      // 589: nop
      // 58a: nop
      // 58b: nop
      // 58c: faload
      // 58d: aload 0
      // 58e: getfield rw/core/C0762.f8000 [Ljava/lang/Object;
      // 591: ldc 3
      // 593: nop
      // 594: nop
      // 595: nop
      // 596: nop
      // 597: aaload
      // 598: checkcast java/lang/Float
      // 59b: invokevirtual java/lang/Float.floatValue ()F
      // 59e: aload 0
      // 59f: getfield rw/core/C0762.f8000 [Ljava/lang/Object;
      // 5a2: ldc 0
      // 5a4: nop
      // 5a5: nop
      // 5a6: nop
      // 5a7: nop
      // 5a8: aaload
      // 5a9: checkcast java/lang/Float
      // 5ac: invokevirtual java/lang/Float.floatValue ()F
      // 5af: invokestatic KDFzREm/NNWE.B (FFF)F
      // 5b2: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 5b5: astore 34
      // 5b7: getfield rw/core/C0762.f8000 [Ljava/lang/Object;
      // 5ba: ldc 0
      // 5bc: nop
      // 5bd: nop
      // 5be: nop
      // 5bf: nop
      // 5c0: aload 34
      // 5c2: aastore
      // 5c3: aload 0
      // 5c4: getstatic rw/core/C0762.f22000 [F
      // 5c7: bipush 4
      // 5c8: nop
      // 5c9: nop
      // 5ca: nop
      // 5cb: nop
      // 5cc: faload
      // 5cd: aload 0
      // 5ce: getfield rw/core/C0762.f34000 [Ljava/lang/Object;
      // 5d1: ldc 0
      // 5d3: nop
      // 5d4: nop
      // 5d5: nop
      // 5d6: nop
      // 5d7: aaload
      // 5d8: checkcast java/lang/Float
      // 5db: invokevirtual java/lang/Float.floatValue ()F
      // 5de: aload 0
      // 5df: getfield rw/core/C0762.f8000 [Ljava/lang/Object;
      // 5e2: ldc 1
      // 5e4: nop
      // 5e5: nop
      // 5e6: nop
      // 5e7: nop
      // 5e8: aaload
      // 5e9: checkcast java/lang/Float
      // 5ec: invokevirtual java/lang/Float.floatValue ()F
      // 5ef: invokestatic KDFzREm/NNWE.B (FFF)F
      // 5f2: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 5f5: astore 35
      // 5f7: getfield rw/core/C0762.f8000 [Ljava/lang/Object;
      // 5fa: ldc 1
      // 5fc: nop
      // 5fd: nop
      // 5fe: nop
      // 5ff: nop
      // 600: aload 35
      // 602: aastore
      // 603: aload 0
      // 604: getstatic rw/core/C0762.f29000 [D
      // 607: bipush 6
      // 609: nop
      // 60a: nop
      // 60b: nop
      // 60c: daload
      // 60d: getstatic rw/core/C0762.f29000 [D
      // 610: bipush 7
      // 612: nop
      // 613: nop
      // 614: nop
      // 615: daload
      // 616: invokestatic rw/core/C0052.m8000 (DD)F
      // 619: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 61c: astore 36
      // 61e: getfield rw/core/C0762.f34000 [Ljava/lang/Object;
      // 621: ldc 1
      // 623: nop
      // 624: nop
      // 625: nop
      // 626: nop
      // 627: aload 36
      // 629: aastore
      // 62a: iload 3
      // 62b: ifeq 64b
      // 62e: iload 4
      // 630: ifeq 63f
      // 633: getstatic rw/core/C0762.f15000 [D
      // 636: bipush 0
      // 637: nop
      // 638: nop
      // 639: nop
      // 63a: nop
      // 63b: daload
      // 63c: goto 654
      // 63f: getstatic rw/core/C0762.f15000 [D
      // 642: bipush 1
      // 643: nop
      // 644: nop
      // 645: nop
      // 646: nop
      // 647: daload
      // 648: goto 654
      // 64b: getstatic rw/core/C0762.f15000 [D
      // 64e: bipush 2
      // 64f: nop
      // 650: nop
      // 651: nop
      // 652: nop
      // 653: daload
      // 654: d2l
      // 655: lstore 7
      // 657: iload 3
      // 658: ifeq 678
      // 65b: iload 4
      // 65d: ifeq 66c
      // 660: getstatic rw/core/C0762.f15000 [D
      // 663: bipush 3
      // 664: nop
      // 665: nop
      // 666: nop
      // 667: nop
      // 668: daload
      // 669: goto 681
      // 66c: getstatic rw/core/C0762.f15000 [D
      // 66f: bipush 4
      // 670: nop
      // 671: nop
      // 672: nop
      // 673: nop
      // 674: daload
      // 675: goto 681
      // 678: getstatic rw/core/C0762.f15000 [D
      // 67b: bipush 5
      // 67c: nop
      // 67d: nop
      // 67e: nop
      // 67f: nop
      // 680: daload
      // 681: d2l
      // 682: lstore 9
      // 684: aload 0
      // 685: lload 1
      // 686: aload 0
      // 687: getfield rw/core/C0762.f42000 [Ljava/lang/Object;
      // 68a: ldc 0
      // 68c: nop
      // 68d: nop
      // 68e: nop
      // 68f: nop
      // 690: aaload
      // 691: checkcast rw/core/IllisOqkm
      // 694: lload 7
      // 696: l2f
      // 697: lload 9
      // 699: l2f
      // 69a: invokevirtual rw/core/IllisOqkm.m26000 (FF)F
      // 69d: f2l
      // 69e: ladd
      // 69f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 6a2: astore 37
      // 6a4: getfield rw/core/C0762.f42000 [Ljava/lang/Object;
      // 6a7: ldc 1
      // 6a9: nop
      // 6aa: nop
      // 6ab: nop
      // 6ac: nop
      // 6ad: aload 37
      // 6af: aastore
      // 6b0: return
   }

   private Enum0057 m38000(boolean var1, boolean var2, boolean var3) {
      float var4 = ((IllisOqkm)this.f42000[0]).m36000(f22000[5], f22000[6]);
      if (var2 && var3) {
         if (var4 < f36000[0]) {
            return (Enum0057)Enum0057.f2000[1];
         } else {
            return var4 < f36000[1] ? (Enum0057)Enum0057.f2000[2] : (Enum0057)Enum0057.f2000[3];
         }
      } else if (var1) {
         if (var4 < f36000[2]) {
            return (Enum0057)Enum0057.f2000[2];
         } else if (var4 < f36000[3]) {
            return (Enum0057)Enum0057.f2000[1];
         } else {
            return var4 < f36000[4] ? (Enum0057)Enum0057.f2000[0] : (Enum0057)Enum0057.f2000[3];
         }
      } else if (var4 < f49000[0]) {
         return (Enum0057)Enum0057.f2000[1];
      } else if (var4 < f49000[1]) {
         return (Enum0057)Enum0057.f2000[2];
      } else {
         return var4 < f49000[2] ? (Enum0057)Enum0057.f2000[0] : (Enum0057)Enum0057.f2000[3];
      }
   }

   public NXi m42000(NHS var1) {
      return this.m32000(
         var1,
         f48000[5] - (Float)this.f42000[3],
         NNWE.N((Float)this.f8000[0] + ((IllisOqkm)this.f42000[0]).m36000(f50000[0], f50000[1]), f50000[2], f4000[0]),
         (Float)this.f8000[1]
      );
   }

   private NXi m44000(NHS var1, NXi var2) {
      double var3 = var1.i - var1.y;
      return new NXi(NNWE.N(var2.M, var1.N, var1.u), NNWE.N(var2.B, var1.y + var3 * f40000[2], var1.y + var3 * f40000[3]), NNWE.N(var2.Z, var1.L, var1.R));
   }

   public void m46000() {
      Long var5 = 0L;
      this.f42000[1] = var5;
      Enum0057 var6 = (Enum0057)Enum0057.f2000[1];
      this.f42000[2] = var6;
      Float var7 = f25000[2];
      this.f42000[3] = var7;
      Float var8 = f16000[0];
      this.f8000[0] = var8;
      Float var9 = f16000[1];
      this.f8000[1] = var9;
      Float var10 = f16000[2];
      this.f8000[2] = var10;
      Float var11 = f16000[3];
      this.f8000[3] = var11;
      Float var12 = f16000[4];
      this.f34000[0] = var12;
      Float var13 = C0052.m8000(f37000[2], f37000[3]);
      this.f34000[1] = var13;
      Float var14 = f48000[0];
      this.f34000[2] = var14;
      Double var15 = f37000[4];
      this.f34000[3] = var15;
      Double var16 = f37000[5];
      this.f34000[4] = var16;
      Boolean var17 = false;
      this.f34000[5] = var17;
      ((IllisOqkm)this.f42000[0]).m24000();
   }
}
