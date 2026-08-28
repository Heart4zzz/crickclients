package rw.defs;

import java.nio.FloatBuffer;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import org.joml.Vector2fc;
import org.joml.Vector3fc;
import org.joml.Vector4fc;

public enum Enum0060 {
   public static Object[] f1000;
   private static String[] f2000;
   private static String[] f3000;
   public Object[] f4000;
   private static String[] f5000;
   private static String[] f6000;
   private static String[] f7000;

   private static boolean m6000(Object var0) {
      if (var0 instanceof Boolean var3) {
         return lOkjks<"fdvpotq",515795677,-1293390012,-1293389989,-1293389990,515795677,515795677>(var3);
      } else {
         if (var0 instanceof Number var1) {
            int var2 = m74000(var1);
            if (var2 == 0 || var2 == 1) {
               return (boolean)(var2 == 1 ? 1 : 0);
            }
         }

         throw new IllegalArgumentException("Expected boolean or 0/1 number, got " + m34000(var0));
      }
   }

   private static void m10000() {
      f1000 = new Object[]{null, null, null, null, null, null, null, null};
   }

   private Enum0060(String var3, String var4, boolean var5) {
      this.m70000();
      this.f4000[0] = var3;
      this.f4000[1] = var4;
      Boolean var12 = var5;
      this.f4000[2] = var12;
   }

   static {
      ntfClinit();
   }

   public static Enum0060[] m22000() {
      return (Enum0060[])((Enum0060[])f1000[7]).clone();
   }

   private static void m28000() {
      f3000 = new String[]{"1", "0", "vec2", "vec3", "vec4", "FLOAT_ARRAY needs defineDeclaration with array size", ", ", ", "};
      f7000 = new String[]{"%s", "null"};
      f5000 = new String[]{"FLOAT", "FLOAT", "float", "INT", "INT", "int", "BOOL", "BOOL"};
      f2000 = new String[]{"bool", "VEC2", "VEC2", "vec2", "VEC3", "VEC3", "vec3", "VEC4"};
      f6000 = new String[]{"VEC4", "vec4", "FLOAT_ARRAY", "FLOAT_ARRAY", "float"};
   }

   private static String m34000(Object var0) {
      return var0 == null ? f7000[1] : var0.getClass().getName();
   }

   private void m70000() {
      if (this.f4000 == null) {
         this.f4000 = new Object[3];
         Object[] var1 = this.f4000;
         var1[2] = false;
      }
   }

   private static Number m72000(Object var0) {
      if (var0 instanceof Number var1) {
         return var1;
      } else {
         throw new IllegalArgumentException("Expected number, got " + m34000(var0));
      }
   }

   private static int m74000(Object var0) {
      Number var1 = m72000(var0);
      double var2 = var1.doubleValue();
      int var4 = var1.intValue();
      if (var2 != var4) {
         throw new IllegalArgumentException("Expected integer number, got " + var0);
      } else {
         return var4;
      }
   }

   public String m76000() {
      return (String)this.f4000[0];
   }

   private static String m78000(Object var0, int var1) {
      StringBuilder var2 = new StringBuilder();
      m88000(var2, var0, var1);
      return var2.toString();
   }

   private static String m80000(String var0, Object var1, int var2) {
      float[] var3 = m106000(var1, var2);
      StringBuilder var4 = new StringBuilder(var0).append('(');

      for (int var5 = 0; var5 < var2; var5++) {
         if (var5 > 0) {
            var4.append(f3000[6]);
         }

         var4.append(m104000(var3[var5]));
      }

      return var4.append(')').toString();
   }

   private static void m88000(StringBuilder var0, Object var1, int var2) {
      if (var1 instanceof FloatBuffer var9) {
         int var12 = var9.limit();
         if (var12 != var2) {
            throw new IllegalArgumentException("Expected float buffer with limit " + var2 + ", got " + var12);
         } else {
            for (int var13 = 0; var13 < var2; var13++) {
               m90000(var0, var13, var9.get(var13));
            }
         }
      } else if (var1 instanceof float[] var8) {
         if (var8.length != var2) {
            throw new IllegalArgumentException("Expected float array length " + var2 + ", got " + var8.length);
         } else {
            for (int var11 = 0; var11 < var2; var11++) {
               m90000(var0, var11, var8[var11]);
            }
         }
      } else if (var1 instanceof double[] var7) {
         if (var7.length != var2) {
            throw new IllegalArgumentException("Expected double array length " + var2 + ", got " + var7.length);
         } else {
            for (int var10 = 0; var10 < var2; var10++) {
               m90000(var0, var10, (float)var7[var10]);
            }
         }
      } else if (!(var1 instanceof Collection var3)) {
         throw new IllegalArgumentException("Expected float array, FloatBuffer, double array or number collection, got " + m34000(var1));
      } else if (var3.size() != var2) {
         throw new IllegalArgumentException("Expected collection size " + var2 + ", got " + var3.size());
      } else {
         int var4 = 0;

         for (Object var6 : var3) {
            m90000(var0, var4++, m72000(var6).floatValue());
         }
      }
   }

   private static void m90000(StringBuilder var0, int var1, float var2) {
      if (var1 > 0) {
         var0.append(f3000[7]);
      }

      var0.append(m104000(var2));
   }

   public String m94000(String var1, int var2) {
      if ((Boolean)this.f4000[2]) {
         if (var2 <= 0) {
            throw new IllegalArgumentException("Array template uniform needs a positive size: " + var1);
         } else {
            return "uniform " + (String)this.f4000[1] + " " + var1 + "[" + var2 + "];";
         }
      } else {
         return "uniform " + (String)this.f4000[1] + " " + var1 + ";";
      }
   }

   public String m96000(Object param1) {
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
      // 00: aload 0
      // 01: invokevirtual rw/defs/Enum0060.ordinal ()I
      // 04: tableswitch 44 0 6 54 64 74 105 127 149 172
      // 30: new java/lang/MatchException
      // 33: dup
      // 34: aconst_null
      // 35: aconst_null
      // 36: invokespecial java/lang/MatchException.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 39: athrow
      // 3a: aload 1
      // 3b: invokestatic rw/defs/Enum0060.m72000 (Ljava/lang/Object;)Ljava/lang/Number;
      // 3e: invokestatic rw/defs/Enum0060.m98000 (Ljava/lang/Number;)Ljava/lang/String;
      // 41: goto c1
      // 44: aload 1
      // 45: invokestatic rw/defs/Enum0060.m74000 (Ljava/lang/Object;)I
      // 48: invokestatic java/lang/Integer.toString (I)Ljava/lang/String;
      // 4b: goto c1
      // 4e: aload 1
      // 4f: invokestatic rw/defs/Enum0060.m6000 (Ljava/lang/Object;)Z
      // 52: ifeq 61
      // 55: getstatic rw/defs/Enum0060.f3000 [Ljava/lang/String;
      // 58: bipush 0
      // 59: nop
      // 5a: nop
      // 5b: nop
      // 5c: nop
      // 5d: aaload
      // 5e: goto c1
      // 61: getstatic rw/defs/Enum0060.f3000 [Ljava/lang/String;
      // 64: bipush 1
      // 65: nop
      // 66: nop
      // 67: nop
      // 68: nop
      // 69: aaload
      // 6a: goto c1
      // 6d: getstatic rw/defs/Enum0060.f3000 [Ljava/lang/String;
      // 70: bipush 2
      // 71: nop
      // 72: nop
      // 73: nop
      // 74: nop
      // 75: aaload
      // 76: aload 1
      // 77: ldc 2
      // 79: nop
      // 7a: nop
      // 7b: nop
      // 7c: nop
      // 7d: invokestatic rw/defs/Enum0060.m80000 (Ljava/lang/String;Ljava/lang/Object;I)Ljava/lang/String;
      // 80: goto c1
      // 83: getstatic rw/defs/Enum0060.f3000 [Ljava/lang/String;
      // 86: bipush 3
      // 87: nop
      // 88: nop
      // 89: nop
      // 8a: nop
      // 8b: aaload
      // 8c: aload 1
      // 8d: ldc 3
      // 8f: nop
      // 90: nop
      // 91: nop
      // 92: nop
      // 93: invokestatic rw/defs/Enum0060.m80000 (Ljava/lang/String;Ljava/lang/Object;I)Ljava/lang/String;
      // 96: goto c1
      // 99: getstatic rw/defs/Enum0060.f3000 [Ljava/lang/String;
      // 9c: bipush 4
      // 9d: nop
      // 9e: nop
      // 9f: nop
      // a0: nop
      // a1: aaload
      // a2: aload 1
      // a3: ldc_w 4
      // a6: nop
      // a7: nop
      // a8: nop
      // a9: nop
      // aa: invokestatic rw/defs/Enum0060.m80000 (Ljava/lang/String;Ljava/lang/Object;I)Ljava/lang/String;
      // ad: goto c1
      // b0: new java/lang/IllegalArgumentException
      // b3: dup
      // b4: getstatic rw/defs/Enum0060.f3000 [Ljava/lang/String;
      // b7: bipush 5
      // b8: nop
      // b9: nop
      // ba: nop
      // bb: nop
      // bc: aaload
      // bd: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // c0: athrow
      // c1: areturn
   }

   private static String m98000(Number var0) {
      return m104000(var0.floatValue());
   }

   public boolean m100000() {
      return (Boolean)this.f4000[2];
   }

   public String m102000(String var1, Object var2, int var3) {
      if ((Boolean)this.f4000[2]) {
         if (var3 <= 0) {
            throw new IllegalArgumentException("Array template define needs a positive size: " + var1);
         } else {
            return "const " + (String)this.f4000[1] + " " + var1 + "[" + var3 + "] = " + (String)this.f4000[1] + "[" + var3 + "](" + m78000(var2, var3) + ");";
         }
      } else {
         return "#define " + var1 + " " + this.m96000(var2);
      }
   }

   private static String m104000(float var0) {
      if (!Float.isFinite(var0)) {
         throw new IllegalArgumentException("GLSL float literal must be finite: " + var0);
      } else {
         String var1 = String.format(Locale.ROOT, f7000[0], var0);
         return var1.indexOf(46) < 0 && var1.indexOf(69) < 0 && var1.indexOf(101) < 0 ? var1 + ".0" : var1;
      }
   }

   private static float[] m106000(Object var0, int var1) {
      if (var0 instanceof Vector2fc var2 && var1 == 2) {
         return new float[]{var2.x(), var2.y()};
      } else if (var0 instanceof Vector3fc var6 && var1 == 3) {
         return new float[]{var6.x(), var6.y(), var6.z()};
      } else if (var0 instanceof Vector4fc var7 && var1 == 4) {
         return new float[]{var7.x(), var7.y(), var7.z(), var7.w()};
      } else if (var0 instanceof float[] var8 && var8.length == var1) {
         return (float[])var8.clone();
      } else if (var0 instanceof double[] var9 && var9.length == var1) {
         float[] var11 = new float[var1];

         for (int var12 = 0; var12 < var1; var12++) {
            var11[var12] = (float)var9[var12];
         }

         return var11;
      } else if (var0 instanceof Collection var10 && var10.size() == var1) {
         float[] var3 = new float[var1];
         Iterator var4 = var10.iterator();

         for (int var5 = 0; var5 < var1; var5++) {
            var3[var5] = m72000(var4.next()).floatValue();
         }

         return var3;
      } else {
         throw new IllegalArgumentException("Expected " + var1 + " float values, got " + m34000(var0));
      }
   }

   public static Enum0060 m108000(String var0) {
      for (Enum0060 var4 : m22000()) {
         if (((String)var4.f4000[0]).equals(var0)) {
            return var4;
         }
      }

      throw new IllegalArgumentException("Unknown shader template marker type: " + var0);
   }
}
