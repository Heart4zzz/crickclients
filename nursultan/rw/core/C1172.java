package rw.core;

import KDFzREm.NHS;
import KDFzREm.NXi;
import KDFzREm.Ned;
import org.joml.Vector3d;

public class C1172 {
   private static double[] f1000;
   private static byte[] f2000;
   private static double[] f3000;
   private static double[] f4000;
   public Object[] f5000;
   private static double[] f6000;

   public void m4000(double var1) {
      Double var7 = var1;
      this.f5000[1] = var7;
   }

   public static C1172 m6000() {
      return new C1172(f4000[0], f4000[1], f4000[2], f3000[0], f3000[1], f3000[2]);
   }

   public void m8000(double var1) {
      Double var7 = var1;
      this.f5000[5] = var7;
   }

   public double m10000() {
      return (Double)this.f5000[1];
   }

   public C1172(double var1, double var3, double var5, double var7, double var9, double var11) {
      this.m42000();
      Double var17 = Math.min(var1, var7);
      this.f5000[0] = var17;
      Double var18 = Math.min(var3, var9);
      this.f5000[1] = var18;
      Double var19 = Math.min(var5, var11);
      this.f5000[2] = var19;
      Double var20 = Math.max(var1, var7);
      this.f5000[3] = var20;
      Double var21 = Math.max(var3, var9);
      this.f5000[4] = var21;
      Double var22 = Math.max(var5, var11);
      this.f5000[5] = var22;
   }

   static {
      ntfClinit();
   }

   private static void m14000() {
      f2000 = new byte[]{6, 2, 3, 4, 5};
   }

   public C1172 m16000(double var1) {
      return this.m32000(var1, var1, var1);
   }

   public double m18000() {
      return (Double)this.f5000[0];
   }

   private static void m24000() {
      f4000 = new double[]{0.0, 0.0, 0.0};
      f3000 = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
      f6000 = new double[]{0.0, 0.0};
      f1000 = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
   }

   public double m26000() {
      return (Double)this.f5000[5];
   }

   public void m28000(double var1) {
      Double var7 = var1;
      this.f5000[3] = var7;
   }

   public C1172 m32000(double var1, double var3, double var5) {
      double var7 = (Double)this.f5000[0] - var1;
      double var9 = (Double)this.f5000[1] - var3;
      double var11 = (Double)this.f5000[2] - var5;
      double var13 = (Double)this.f5000[3] + var1;
      double var15 = (Double)this.f5000[4] + var3;
      double var17 = (Double)this.f5000[5] + var5;
      return this.m46000(var7, var9, var11, var13, var15, var17);
   }

   public double m36000() {
      return (Double)this.f5000[4];
   }

   public void m38000(double var1) {
      Double var7 = var1;
      this.f5000[4] = var7;
   }

   public C1172 m40000(Ned var1) {
      this.m62000(var1.method_10263());
      this.m4000(var1.method_10264());
      this.m68000(var1.method_10260());
      this.m28000(var1.method_10263() + 1);
      this.m38000(var1.method_10264() + 1);
      this.m8000(var1.method_10260() + 1);
      return this;
   }

   private void m42000() {
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
      // 01: getstatic rw/core/C1172.f2000 [B
      // 04: baload
      // 05: anewarray 4
      // 08: checkcast [Ljava/lang/Object;
      // 0b: putfield rw/core/C1172.f5000 [Ljava/lang/Object;
      // 0e: aload 0
      // 0f: getfield rw/core/C1172.f5000 [Ljava/lang/Object;
      // 12: bipush 0
      // 13: dconst_0
      // 14: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 17: aastore
      // 18: aload 0
      // 19: getfield rw/core/C1172.f5000 [Ljava/lang/Object;
      // 1c: bipush 1
      // 1d: dconst_0
      // 1e: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 21: aastore
      // 22: aload 0
      // 23: getfield rw/core/C1172.f5000 [Ljava/lang/Object;
      // 26: getstatic rw/core/C1172.f2000 [B
      // 29: baload
      // 2a: dconst_0
      // 2b: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 2e: aastore
      // 2f: aload 0
      // 30: getfield rw/core/C1172.f5000 [Ljava/lang/Object;
      // 33: bipush 3
      // 34: dconst_0
      // 35: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 38: aastore
      // 39: aload 0
      // 3a: getfield rw/core/C1172.f5000 [Ljava/lang/Object;
      // 3d: bipush 4
      // 3e: dconst_0
      // 3f: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 42: aastore
      // 43: aload 0
      // 44: getfield rw/core/C1172.f5000 [Ljava/lang/Object;
      // 47: bipush 5
      // 48: dconst_0
      // 49: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 4c: aastore
      // 4d: return
   }

   public C1172 m44000(Vector3d var1) {
      return this.m64000(var1.x, var1.y, var1.z);
   }

   public C1172 m46000(double var1, double var3, double var5, double var7, double var9, double var11) {
      this.m62000(var1);
      this.m4000(var3);
      this.m68000(var5);
      this.m28000(var7);
      this.m38000(var9);
      this.m8000(var11);
      return this;
   }

   public static C1172 m48000(Ned var0) {
      return new C1172(var0.method_10263(), var0.method_10264(), var0.method_10260(), var0.method_10263() + 1, var0.method_10264() + 1, var0.method_10260() + 1);
   }

   public static C1172 m50000(NHS var0) {
      return new C1172(var0.N, var0.y, var0.L, var0.u, var0.i, var0.R);
   }

   public C1172 m56000(NXi var1) {
      return this.m64000(var1.M, var1.B, var1.Z);
   }

   public static C1172 m58000(C1172 var0) {
      return new C1172((Double)var0.f5000[0], (Double)var0.f5000[1], (Double)var0.f5000[2], (Double)var0.f5000[3], (Double)var0.f5000[4], (Double)var0.f5000[5]);
   }

   public double m60000() {
      return (Double)this.f5000[3];
   }

   public void m62000(double var1) {
      Double var7 = var1;
      this.f5000[0] = var7;
   }

   public C1172 m64000(double var1, double var3, double var5) {
      double var7 = (Double)this.f5000[0];
      double var9 = (Double)this.f5000[1];
      double var11 = (Double)this.f5000[2];
      double var13 = (Double)this.f5000[3];
      double var15 = (Double)this.f5000[4];
      double var17 = (Double)this.f5000[5];
      if (var1 < f3000[3]) {
         var7 += var1;
      } else if (var1 > f3000[4]) {
         var13 += var1;
      }

      if (var3 < f3000[5]) {
         var9 += var3;
      } else if (var3 > f6000[0]) {
         var15 += var3;
      }

      if (var5 < f6000[1]) {
         var11 += var5;
      } else if (var5 > f1000[0]) {
         var17 += var5;
      }

      return this.m46000(var7, var9, var11, var13, var15, var17);
   }

   public void m68000(double var1) {
      Double var7 = var1;
      this.f5000[2] = var7;
   }

   public double m70000() {
      return (Double)this.f5000[2];
   }
}
