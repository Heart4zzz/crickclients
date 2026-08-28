package rw.core;

import KDFzREm.NHe;
import KDFzREm.NNNNRZ;
import KDFzREm.NNNNWJ;
import KDFzREm.NNNNuY;
import KDFzREm.NNNwS;
import KDFzREm.NNfc;
import KDFzREm.NNuU;
import KDFzREm.NQo;
import KDFzREm.NbL;
import KDFzREm.NkG;
import KDFzREm.NkS;
import KDFzREm.Nkq;
import KDFzREm.wY;
import java.util.ArrayDeque;
import java.util.Deque;
import rw.NursultanClient;
import rw.api.Iface0606;
import rw.api.Iface0653;
import rw.data.OljplImi;
import rw.data.Rec0208;

public class OlpkOimtk implements Iface0653 {
   private static byte[] f1000;
   private static boolean[] f2000;
   private static boolean[] f3000;
   private static short[] f4000;
   private static byte[] f5000;
   private static boolean[] f6000;
   private static byte[] f7000;
   private static short[] f8000;
   private static short[] f9000;
   private static short[] f10000;
   private static short[] f11000;
   private static short[] f12000;
   private static boolean[] f13000;
   private static short[] f14000;
   private static short[] f15000;
   private static byte[] f16000;
   private static short[] f17000;
   private static boolean[] f18000;
   private static short[] f19000;
   private static short[] f20000;
   private static short[] f21000;
   private static short[] f22000;
   private static boolean[] f23000;
   private static byte[] f24000;
   private static short[] f25000;
   private static short[] f26000;
   private static boolean[] f27000;
   private static short[] f28000;
   private static short[] f29000;
   private static short[] f30000;
   private static short[] f31000;
   private static short[] f32000;
   private static short[] f33000;
   private static short[] f34000;
   private static short[] f35000;
   private static boolean[] f36000;
   private static short[] f37000;
   private static short[] f38000;
   private static boolean[] f39000;
   private static byte[] f40000;
   private static byte[] f41000;
   private static short[] f42000;
   private static short[] f43000;
   public Object[] f44000;
   public Object[] f45000;
   private static boolean[] f46000;

   private void m2000() {
      Iface0606 var1 = (Iface0606)((Deque)this.f44000[1]).poll();
      if (var1 != null) {
         int var2 = IljlItp.m62000(var1);
         if (IljlItp.m36000(var2)) {
            if ((Integer)this.f44000[4] == -1 && (Integer)this.f45000[4] == -1 && this.m6000(var1) != null) {
               this.f45000[3] = var1;
               Boolean var8 = true;
               this.f45000[f34000[0]] = var8;
            }
         } else if (!((NNNwS)((NNuU)this.f44000[f34000[1]]).T[f34000[2]])
            .method_7357()
            .N((NQo)((NNNwS)((NNuU)this.f44000[f10000[0]]).T[f10000[1]]).method_31548().u().get(var2))) {
            if ((Integer)this.f44000[f10000[2]] == -1) {
               Integer var9 = var2;
               this.f44000[f10000[3]] = var9;
            }

            Integer var10 = var2;
            this.f44000[f10000[4]] = var10;
            Boolean var11 = true;
            this.f45000[f10000[5]] = var11;
         }
      }
   }

   private Rec0208 m6000(Iface0606 var1) {
      return IljlItp.m6000(var2 -> this.m50000(var2, var1)).findFirst().orElse(null);
   }

   private boolean m8000() {
      return (boolean)(this.f44000[2] <= 0 && this.f44000[3] <= 0 ? 1 : 0);
   }

   public OlpkOimtk(int var1) {
      this(var1, 0);
   }

   public OlpkOimtk(int var1, int var2) {
      this.m48000();
      NNuU var7 = NNuU.Nq();
      this.f44000[0] = var7;
      ArrayDeque var8 = new ArrayDeque();
      this.f44000[1] = var8;
      Integer var9 = -1;
      this.f44000[4] = var9;
      Integer var10 = -1;
      this.f44000[5] = var10;
      Integer var11 = -1;
      this.f45000[4] = var11;
      Integer var12 = -1;
      this.f45000[5] = var12;
      Integer var13 = var1;
      this.f44000[2] = var13;
      Integer var14 = var2;
      this.f44000[3] = var14;
   }

   static {
      ntfClinit();
   }

   private void m10000() {
      if (!NursultanClient.m60000().m16000()
         && (NkG)((NNNwS)((NNuU)this.f44000[0]).T[4]).fields_07fa3311b0e9d3e9b883d09222919bf5a[3]
            == (NkS)((NNNwS)((NNuU)this.f44000[0]).T[4]).fields_07fa3311b0e9d3e9b883d09222919bf5a[2]
         && ((NkG)((NNNwS)((NNuU)this.f44000[0]).T[4]).fields_07fa3311b0e9d3e9b883d09222919bf5a[3]).M().R()) {
         NQo var1 = (NQo)((NNNwS)((NNuU)this.f44000[0]).T[4]).method_31548().u().get((Integer)this.f45000[4]);
         NNNNuY var2 = (NNNNuY)var1.method_58694(NNNNRZ.D);
         if (var2 != null && !var2.M()) {
            int var3 = IljlItp.m4000((Integer)this.f45000[4]);
            if (var2.Z() && var2.B() != 0) {
               NNfc.N(var1, 0);
               ((NNuU)this.f44000[0]).NE().N(new NNNNWJ(var3, 0));
            }

            int var4 = IljlItp.m4000((Integer)this.f45000[5]);
            int var5 = !((NQo)((NNNwS)((NNuU)this.f44000[0]).T[4]).method_31548().u().get((Integer)this.f45000[5])).R() ? 1 : 0;
            C1241 var6 = NursultanClient.m60000().m38000(0, var3, 1, Nkq.field_7790).m38000(0, var4, 0, Nkq.field_7790);
            if (var5 != 0) {
               var6.m38000(0, var3, 0, Nkq.field_7790);
            }

            var6.m24000();
            Integer var13 = -1;
            this.f45000[4] = var13;
            Integer var14 = -1;
            this.f45000[5] = var14;
         } else {
            Integer var11 = -1;
            this.f45000[4] = var11;
            Integer var12 = -1;
            this.f45000[5] = var12;
         }
      }
   }

   private void m12000() {
      if ((Integer)this.f44000[3] <= 0) {
         this.m20000();
      } else {
         Integer var5 = (Integer)this.f44000[3];
         this.f44000[7] = var5;
         Boolean var6 = true;
         this.f45000[2] = var6;
      }
   }

   private void m16000() {
      int var1 = ((NNNwS)((NNuU)this.f44000[0]).T[4]).method_31548().N();
      if (IljlItp.m32000((Integer)this.f44000[5])) {
         C0892.m44000((Integer)this.f44000[5]);
         this.m12000();
         if (this.m8000()) {
            C0892.m20000();
            if ((Integer)this.f44000[4] == (Integer)this.f44000[5]) {
               Integer var6 = -1;
               this.f44000[4] = var6;
            }
         }
      } else if (this.m8000()) {
         NursultanClient.m60000()
            .m38000(((NkG)((NNNwS)((NNuU)this.f44000[0]).T[4]).fields_07fa3311b0e9d3e9b883d09222919bf5a[3]).b, (Integer)this.f44000[5], var1, Nkq.field_7791)
            .m12000()
            .m34000(new OljplImi(this::m12000))
            .m38000(((NkG)((NNNwS)((NNuU)this.f44000[0]).T[4]).fields_07fa3311b0e9d3e9b883d09222919bf5a[3]).b, (Integer)this.f44000[5], var1, Nkq.field_7791)
            .m4000();
         if ((Integer)this.f44000[4] == (Integer)this.f44000[5]) {
            Integer var7 = -1;
            this.f44000[4] = var7;
         }
      } else {
         NursultanClient.m60000()
            .m38000(((NkG)((NNNwS)((NNuU)this.f44000[0]).T[4]).fields_07fa3311b0e9d3e9b883d09222919bf5a[3]).b, (Integer)this.f44000[5], var1, Nkq.field_7791)
            .m26000(var1x -> this.m12000())
            .m24000();
      }
   }

   private void m18000() {
      Integer var6 = (Integer)this.f44000[6] - 1;
      this.f44000[6] = var6;
      if ((Boolean)this.f45000[2]) {
         if ((Integer)this.f44000[7] > 0) {
            Integer var7 = (Integer)this.f44000[7] - 1;
            this.f44000[7] = var7;
         } else {
            Boolean var8 = false;
            this.f45000[2] = var8;
            this.m20000();
         }
      } else {
         if (!(Boolean)this.f45000[0]) {
            this.m2000();
         }

         if ((Boolean)this.f45000[0]) {
            if ((Iface0606)this.f45000[3] != null) {
               Iface0606 var14 = (Iface0606)this.f45000[3];
               Object var9 = null;
               this.f45000[3] = var9;
               this.m32000(var14);
            } else if ((Boolean)this.f45000[1]) {
               this.m12000();
            } else if ((Integer)this.f44000[5] != -1) {
               this.m16000();
            }

            Integer var10 = -1;
            this.f44000[5] = var10;
            Boolean var11 = false;
            this.f45000[0] = var11;
            Boolean var12 = false;
            this.f45000[1] = var12;
         } else {
            if ((Integer)this.f44000[6] == 0 && (Integer)this.f44000[4] != -1) {
               int var1 = ((NNNwS)((NNuU)this.f44000[0]).T[4]).method_31548().N();
               if (IljlItp.m32000((Integer)this.f44000[4])) {
                  C0892.m20000();
               } else {
                  NursultanClient.m60000()
                     .m38000(
                        ((NkG)((NNNwS)((NNuU)this.f44000[0]).T[4]).fields_07fa3311b0e9d3e9b883d09222919bf5a[3]).b,
                        (Integer)this.f44000[4],
                        var1,
                        Nkq.field_7791
                     )
                     .m24000();
               }

               Integer var13 = -1;
               this.f44000[4] = var13;
            }

            if ((Integer)this.f44000[6] <= 0 && (Integer)this.f45000[4] != -1) {
               this.m10000();
            }
         }
      }
   }

   private void m20000() {
      if (!((NNNwS)((NNuU)this.f44000[0]).T[4]).method_6047().R()) {
         wY.N(NbL.field_5808);
         Integer var5 = (Integer)this.f44000[2];
         this.f44000[6] = var5;
      }
   }

   private static void m24000() {
      f8000 = new short[]{0, 1};
      f12000 = new short[]{4, 5, 4, 5, 2, 3};
      f29000 = new short[]{2, 0, 4, 2, 6, 3, 3, 7};
      f22000 = new short[]{2, 6, 6, 2, 7, 7};
      f43000 = new short[]{7, 2, 0, 0, 3};
      f30000 = new short[]{3, 3, 1};
      f38000 = new short[]{5, 5, 0};
      f15000 = new short[]{1, 6, 4, 0};
      f9000 = new short[]{4, 4, 0};
      f37000 = new short[]{4, 3, 4, 4, 6, 4, 0, 4};
      f26000 = new short[]{5, 5};
      f17000 = new short[]{4, 5, 4, 0, 4, 3, 5, 0};
      f11000 = new short[]{4, 3, 5, 4, 5};
      f21000 = new short[]{4, 0};
      f25000 = new short[]{4, 3, 5, 2, 3, 0};
      f4000 = new short[]{4, 3, 0, 4, 2, 0, 4, 3};
      f42000 = new short[]{0, 4, 0, 4, 0, 4};
      f33000 = new short[]{0, 4, 5, 4, 2, 6};
      f20000 = new short[]{0, 4, 3, 0, 4, 2, 0, 4};
      f35000 = new short[]{3, 0};
      f32000 = new short[]{4, 4, 4, 5};
      f28000 = new short[]{4, 0, 5};
      f14000 = new short[]{0, 4};
      f19000 = new short[]{5, 4, 5, 0, 4, 1};
      f31000 = new short[]{1, 4, 4, 3};
      f34000 = new short[]{0, 0, 4};
      f10000 = new short[]{0, 4, 4, 4, 5, 0};
   }

   private int m30000() {
      NHe var1 = ((NNNwS)((NNuU)this.f44000[0]).T[4]).method_31548().u();

      for (int var2 = 9; var2 < var1.size(); var2++) {
         if (((NQo)var1.get(var2)).R()) {
            return var2;
         }
      }

      return -1;
   }

   private void m32000(Iface0606 var1) {
      if (!NursultanClient.m60000().m16000()
         && (NkG)((NNNwS)((NNuU)this.f44000[0]).T[4]).fields_07fa3311b0e9d3e9b883d09222919bf5a[3]
            == (NkS)((NNNwS)((NNuU)this.f44000[0]).T[4]).fields_07fa3311b0e9d3e9b883d09222919bf5a[2]
         && ((NkG)((NNNwS)((NNuU)this.f44000[0]).T[4]).fields_07fa3311b0e9d3e9b883d09222919bf5a[3]).M().R()) {
         Rec0208 var2 = this.m6000(var1);
         if (var2 != null) {
            NNNNuY var3 = (NNNNuY)var2.m6000().method_58694(NNNNRZ.D);
            int var4 = this.m46000(var3, var1);
            if (var4 != -1 && !((NNNwS)((NNuU)this.f44000[0]).T[4]).method_7357().N(var3.N(var4))) {
               NQo var5 = ((NNNwS)((NNuU)this.f44000[0]).T[4]).method_6047();
               int var6 = !var5.R() && var3.i() == 1 && NNNNuY.y(var5) ? 1 : 0;
               int var7 = !var5.R() && var6 == 0 ? this.m30000() : -1;
               if (var5.R() || var6 != 0 || !IljlItp.m36000(var7)) {
                  int var8 = IljlItp.m4000(var2.m4000());
                  int var9 = ((NNNwS)((NNuU)this.f44000[0]).T[4]).method_31548().N();
                  int var10 = IljlItp.m4000(var9);
                  if (var3.B() != var4) {
                     NNfc.N(var2.m6000(), var4);
                     ((NNuU)this.f44000[0]).NE().N(new NNNNWJ(var8, var4));
                  }

                  C1241 var11 = NursultanClient.m60000().m38000(0, var8, 1, Nkq.field_7790).m38000(0, var10, 0, Nkq.field_7790);
                  if (!var5.R()) {
                     if (var6 != 0) {
                        var11.m38000(0, var8, 0, Nkq.field_7790);
                        Integer var16 = var2.m4000();
                        this.f45000[4] = var16;
                        Integer var17 = var9;
                        this.f45000[5] = var17;
                     } else {
                        var11.m38000(0, IljlItp.m4000(var7), 0, Nkq.field_7790);
                        Integer var18 = var7;
                        this.f44000[4] = var18;
                     }
                  }

                  var11.m26000(var1x -> this.m12000()).m24000();
                  Integer var19 = (Integer)this.f44000[2];
                  this.f44000[6] = var19;
               }
            }
         }
      }
   }

   public void m34000(Object var1) {
      if (var1 instanceof C0719) {
         this.m18000();
      }
   }

   private static void m36000() {
      f13000 = new boolean[]{false, true, true, true, false};
      f6000 = new boolean[]{false, false, true, false, true, true};
      f39000 = new boolean[]{false, false, true};
      f23000 = new boolean[]{false, false, false, false, false, false, false, false};
      f18000 = new boolean[]{true, false};
      f36000 = new boolean[]{false, true, false};
      f46000 = new boolean[]{false, false, false, false, false};
      f2000 = new boolean[]{true, true};
      f27000 = new boolean[]{false, false, false, false, false, false};
      f3000 = new boolean[]{false, false, true, false, false, false, false};
   }

   public void m38000(int var1) {
      Integer var6 = var1;
      this.f44000[2] = var6;
   }

   public void m42000(Iface0606 var1) {
      ((Deque)this.f44000[1]).add(var1);
   }

   private int m46000(NNNNuY var1, Iface0606 var2) {
      for (int var3 = 0; var3 < var1.i(); var3++) {
         if (var2.test(var1.N(var3))) {
            return var3;
         }
      }

      return -1;
   }

   private void m48000() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 0
      //   at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
      //   at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
      //   at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
      //   at java.base/java.util.Objects.checkIndex(Objects.java:385)
      //   at java.base/java.util.ArrayList.remove(ArrayList.java:551)
      //   at org.jetbrains.java.decompiler.util.collections.ListStack.pop(ListStack.java:31)
      //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.processBlock(ExprProcessor.java:326)
      //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.processStatement(ExprProcessor.java:134)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:220)
      //
      // Bytecode:
      // 00: aload 0
      // 01: bipush 8
      // 03: anewarray 4
      // 06: checkcast [Ljava/lang/Object;
      // 09: putfield rw/core/OlpkOimtk.f44000 [Ljava/lang/Object;
      // 0c: aload 0
      // 0d: bipush 6
      // 0f: anewarray 4
      // 12: checkcast [Ljava/lang/Object;
      // 15: putfield rw/core/OlpkOimtk.f45000 [Ljava/lang/Object;
      // 18: aload 0
      // 19: getfield rw/core/OlpkOimtk.f44000 [Ljava/lang/Object;
      // 1c: getstatic rw/core/OlpkOimtk.f24000 [B
      // 1f: baload
      // 20: bipush 0
      // 21: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 24: aastore
      // 25: aload 0
      // 26: getfield rw/core/OlpkOimtk.f45000 [Ljava/lang/Object;
      // 29: getstatic rw/core/OlpkOimtk.f3000 [Z
      // 2c: baload
      // 2d: bipush 0
      // 2e: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 31: aastore
      // 32: aload 0
      // 33: getfield rw/core/OlpkOimtk.f44000 [Ljava/lang/Object;
      // 36: getstatic rw/core/OlpkOimtk.f24000 [B
      // 39: baload
      // 3a: bipush 0
      // 3b: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 3e: aastore
      // 3f: aload 0
      // 40: getfield rw/core/OlpkOimtk.f45000 [Ljava/lang/Object;
      // 43: bipush 1
      // 44: bipush 0
      // 45: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 48: aastore
      // 49: aload 0
      // 4a: getfield rw/core/OlpkOimtk.f44000 [Ljava/lang/Object;
      // 4d: bipush 4
      // 4e: bipush 0
      // 4f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 52: aastore
      // 53: aload 0
      // 54: getfield rw/core/OlpkOimtk.f45000 [Ljava/lang/Object;
      // 57: bipush 2
      // 58: bipush 0
      // 59: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 5c: aastore
      // 5d: aload 0
      // 5e: getfield rw/core/OlpkOimtk.f44000 [Ljava/lang/Object;
      // 61: bipush 5
      // 62: bipush 0
      // 63: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 66: aastore
      // 67: aload 0
      // 68: getfield rw/core/OlpkOimtk.f45000 [Ljava/lang/Object;
      // 6b: bipush 4
      // 6c: bipush 0
      // 6d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 70: aastore
      // 71: aload 0
      // 72: getfield rw/core/OlpkOimtk.f44000 [Ljava/lang/Object;
      // 75: getstatic rw/core/OlpkOimtk.f40000 [B
      // 78: baload
      // 79: bipush 0
      // 7a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 7d: aastore
      // 7e: aload 0
      // 7f: getfield rw/core/OlpkOimtk.f45000 [Ljava/lang/Object;
      // 82: bipush 5
      // 83: bipush 0
      // 84: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 87: aastore
      // 88: aload 0
      // 89: getfield rw/core/OlpkOimtk.f44000 [Ljava/lang/Object;
      // 8c: getstatic rw/core/OlpkOimtk.f40000 [B
      // 8f: baload
      // 90: bipush 0
      // 91: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 94: aastore
      // 95: return
   }

   private boolean m50000(NQo var1, Iface0606 var2) {
      NNNNuY var3 = (NNNNuY)var1.method_58694(NNNNRZ.D);
      return (boolean)(var3 == null ? 0 : var3.y().anyMatch(var2::test));
   }

   private static void m52000() {
      f41000 = new byte[]{-1, -1, -1, -1, -1, -1, -1, -1};
      f16000 = new byte[]{-1, -1, -1};
      f1000 = new byte[]{-1, -1, -1, -1, -1};
      f5000 = new byte[]{-1, -1, 9, -1};
      f7000 = new byte[]{-1, -1, -1, 8};
      f24000 = new byte[]{2, 3, 4, 5};
      f40000 = new byte[]{6, 7, 6, 2, 4, 5};
   }
}
