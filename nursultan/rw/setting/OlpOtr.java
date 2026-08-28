package rw.setting;

import KDFzREm.NNBj;
import KDFzREm.NNuU;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.io.IOException;
import java.io.InputStream;
import java.nio.IntBuffer;
import java.nio.charset.StandardCharsets;
import java.util.function.IntFunction;
import org.apache.commons.io.IOUtils;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL31;
import rw.api.Iface0034;
import rw.api.Iface0667;
import rw.core.C0804;
import rw.core.C0821;
import rw.core.C0829;
import rw.core.C1223;
import rw.core.C1228;
import rw.core.C1233;
import rw.core.C1239;
import rw.core.C1249;
import rw.core.C1250;
import rw.core.IlrsjiOmn;
import rw.core.OlkriOrl;
import rw.core.OlssInijr;
import rw.data.Rec0059;
import rw.data.Rec0308;
import rw.defs.Enum0008;

public class OlpOtr extends OlkriOrl {
   private static String[] f1000;
   private static short[] f2000;
   private static short[] f3000;
   private static short[] f4000;
   private static short[] f5000;
   private static short[] f6000;
   private static short[] f7000;
   public Object[] f8000;
   private static short[] f9000;
   private static short[] f10000;
   private static short[] f11000;
   private static String[] f12000;
   private static short[] f13000;
   private static short[] f14000;
   private static String[] f15000;
   private static short[] f16000;
   private static short[] f17000;
   private static String[] f18000;
   private static short[] f19000;
   private static short[] f20000;

   @Override
   public void m2000() {
      this.m82000();
      this.m100000();
      ((Iface0034)this.f8000[3]).m2000();
      int var1 = 0;
      int var2 = 0;

      try {
         var1 = this.m92000(35633, (String)this.f8000[0]);
         var2 = this.m92000(35632, (String)this.f8000[1]);
         GL31.glAttachShader((Integer)this.y[0], var1);
         GL31.glAttachShader((Integer)this.y[0], var2);
         GL31.glLinkProgram((Integer)this.y[f9000[0]]);
         if (GL31.glGetProgrami((Integer)this.y[f9000[1]], 35714) == 0) {
            throw new IllegalStateException(
               "Shader link failed: " + (String)this.f8000[f9000[2]] + ", " + (String)this.f8000[1] + ". " + GL31.glGetProgramInfoLog((Integer)this.y[0])
            );
         }

         Object var8 = null;
         this.f8000[4] = var8;
         Object var9 = null;
         this.f8000[5] = var9;
         Object var10 = null;
         this.f8000[6] = var10;
      } finally {
         if (var1 != 0) {
            GL31.glDetachShader((Integer)this.y[0], var1);
            GL31.glDeleteShader(var1);
         }

         if (var2 != 0) {
            GL31.glDetachShader((Integer)this.y[0], var2);
            GL31.glDeleteShader(var2);
         }
      }
   }

   public C1228 m6000(String var1) {
      return this.m88000(var1, C1228::new, (Enum0008)Enum0008.f1000[2]);
   }

   public void m8000() {
      GL31.glUseProgram((Integer)this.y[0]);
   }

   public C1239 m10000(String var1) {
      return this.m88000(var1, C1239::new, (Enum0008)Enum0008.f2000[4]);
   }

   public OlpOtr(String var1, String var2, Iface0034 var3, String var4) {
      super(GL31.glCreateProgram());
      this.m82000();
      this.f8000[0] = var1;
      this.f8000[1] = var2;
      this.f8000[3] = var3;
      this.f8000[2] = var4;
      this.m2000();
   }

   public OlpOtr(String var1, String var2) {
      this(var1, var2, Iface0034.f1000, f1000[0]);
   }

   static {
      ntfClinit();
   }

   public boolean m22000(Object var1) {
      if (var1 == this) {
         return (boolean)1;
      } else if (!(var1 instanceof OlpOtr var2)) {
         return (boolean)0;
      } else if (!var2.m86000(this)) {
         return (boolean)0;
      } else {
         String var3 = this.m24000();
         String var4 = var2.m24000();
         if (var3 == null ? var4 == null : var3.equals(var4)) {
            String var5 = this.m102000();
            String var6 = var2.m102000();
            if (var5 == null ? var6 == null : var5.equals(var6)) {
               String var7 = this.m34000();
               String var8 = var2.m34000();
               return (boolean)((var7 == null ? var8 == null : var7.equals(var8)) ? 1 : 0);
            } else {
               return (boolean)0;
            }
         } else {
            return (boolean)0;
         }
      }
   }

   @Override
   public int hashCode() {
      byte var1 = 59;
      int var2 = 1;
      String var3 = this.m24000();
      var2 = var2 * 59 + (var3 == null ? 43 : var3.hashCode());
      String var4 = this.m102000();
      var2 = var2 * 59 + (var4 == null ? 43 : var4.hashCode());
      String var5 = this.m34000();
      return var2 * 59 + (var5 == null ? 43 : var5.hashCode());
   }

   public String m24000() {
      this.m82000();
      return (String)this.f8000[0];
   }

   public C0829 m26000(String var1) {
      return this.m88000(var1, C0829::new, (Enum0008)Enum0008.f2000[0]);
   }

   public Object2ObjectOpenHashMap<String, Iface0667> m28000() {
      this.m82000();
      return (Object2ObjectOpenHashMap<String, Iface0667>)this.f8000[4];
   }

   public C1249 m30000(String var1) {
      return this.m88000(var1, C1249::new, (Enum0008)Enum0008.f2000[2]);
   }

   public C0821 m32000(String var1) {
      return this.m88000(var1, C0821::new, (Enum0008)Enum0008.f1000[0]);
   }

   public String m34000() {
      this.m82000();
      return (String)this.f8000[2];
   }

   private Object2ObjectOpenHashMap<String, Rec0059> m40000() {
      this.m82000();
      if ((Object2ObjectOpenHashMap)this.f8000[5] != null) {
         return (Object2ObjectOpenHashMap<String, Rec0059>)this.f8000[5];
      } else {
         Object2ObjectOpenHashMap var11 = new Object2ObjectOpenHashMap();
         this.f8000[5] = var11;
         int var1 = GL31.glGetProgrami((Integer)this.y[0], 35718);
         IntBuffer var2 = BufferUtils.createIntBuffer(1);
         IntBuffer var3 = BufferUtils.createIntBuffer(1);

         for (int var4 = 0; var4 < var1; var4++) {
            var2.clear();
            var3.clear();
            String var5 = GL31.glGetActiveUniform((Integer)this.y[0], var4, var2, var3);
            Rec0059 var6 = new Rec0059(var5, var3.get(0), var2.get(0));
            ((Object2ObjectOpenHashMap)this.f8000[5]).put(m110000(var5), var6);
            ((Object2ObjectOpenHashMap)this.f8000[5]).put(var5, var6);
         }

         return (Object2ObjectOpenHashMap<String, Rec0059>)this.f8000[5];
      }
   }

   private String m50000(String var1) {
      NNBj var2 = (NNBj)NNuU.Nq().Nm().method_14486(C0161.m38000(var1)).orElseThrow(() -> new IllegalStateException("Shader resource was not found: " + var1));

      try {
         String var4;
         try (InputStream var3 = var2.method_14482()) {
            var4 = IOUtils.toString(var3, StandardCharsets.UTF_8);
         }

         return var4;
      } catch (IOException var8) {
         throw new IllegalStateException("Failed to read shader source: " + var1, var8);
      }
   }

   private static void m52000() {
      f7000 = new short[]{0, 1, 3, 2, 0, 3, 0};
      f14000 = new short[]{1, 0, 0};
      f9000 = new short[]{0, 0, 0};
      f3000 = new short[]{1, 0, 4, 5};
      f13000 = new short[]{6, 0, 0, 0, 0};
      f10000 = new short[]{0, 2, 3, 4, 5, 0, 1, 2};
      f16000 = new short[]{3, 4, 1, 6, 6, 6};
      f17000 = new short[]{0, 0, 1};
      f19000 = new short[]{0, 6, 4, 4, 4};
      f6000 = new short[]{0, 0, 0, 1, 3, 4};
      f4000 = new short[]{3, 0, 0, 0};
      f11000 = new short[]{0, 1};
      f2000 = new short[]{5, 5, 5, 0, 0};
      f20000 = new short[]{5, 5};
      f5000 = new short[]{5, 0, 1, 2, 3, 4, 6};
   }

   private static void m62000() {
      f1000 = new String[]{"", "[0]"};
      f18000 = new String[]{"]", "", "float"};
      f12000 = new String[]{"vec2", "vec3", "vec4"};
      f15000 = new String[]{"int", "ivec2", "ivec3", "ivec4", "bool", "mat4", "sampler2D"};
   }

   public C1233 m64000(String var1) {
      return this.m88000(var1, C1233::new, (Enum0008)Enum0008.f1000[4]);
   }

   public OlssInijr m66000(String var1) {
      return this.m88000(var1, OlssInijr::new, (Enum0008)Enum0008.f2000[3]);
   }

   public Object2ObjectOpenHashMap<String, Rec0308> m70000() {
      this.m82000();
      return (Object2ObjectOpenHashMap<String, Rec0308>)this.f8000[6];
   }

   public IlrsjiOmn m74000(String var1) {
      return this.m88000(var1, IlrsjiOmn::new, (Enum0008)Enum0008.f2000[1]);
   }

   public C0804 m76000(String var1) {
      return this.m88000(var1, C0804::new, (Enum0008)Enum0008.f1000[1]);
   }

   private static String m78000(int var0) {
      return switch (var0) {
         case 5124 -> f15000[0];
         case 5126 -> f18000[2];
         case 35664 -> f12000[0];
         case 35665 -> f12000[1];
         case 35666 -> f12000[2];
         case 35667 -> f15000[1];
         case 35668 -> f15000[2];
         case 35669 -> f15000[3];
         case 35670 -> f15000[4];
         case 35676 -> f15000[5];
         case 35678 -> f15000[6];
         default -> "0x" + Integer.toHexString(var0);
      };
   }

   private void m82000() {
      if (this.f8000 == null) {
         this.f8000 = new Object[7];
         Object[] var1 = this.f8000;
      }
   }

   public Rec0308 m84000(String var1, int var2) {
      this.m82000();
      if ((Object2ObjectOpenHashMap)this.f8000[6] == null) {
         Object2ObjectOpenHashMap var9 = new Object2ObjectOpenHashMap();
         this.f8000[6] = var9;
      } else {
         Rec0308 var3 = (Rec0308)((Object2ObjectOpenHashMap)this.f8000[6]).get(var1);
         if (var3 != null) {
            return var3;
         }
      }

      int var10 = GL31.glGetUniformBlockIndex((Integer)this.y[0], var1);
      if (var10 == -1) {
         throw new IllegalArgumentException(
            "Uniform block was not found or is inactive: " + var1 + " in " + (String)this.f8000[0] + ", " + (String)this.f8000[1]
         );
      } else {
         GL31.glUniformBlockBinding((Integer)this.y[0], var10, var2);
         Rec0308 var4 = new Rec0308(var10, var2);
         ((Object2ObjectOpenHashMap)this.f8000[6]).put(var1, var4);
         return var4;
      }
   }

   public boolean m86000(Object var1) {
      return var1 instanceof OlpOtr;
   }

   private <T extends Iface0667> T m88000(String var1, IntFunction<T> var2, Enum0008 var3) {
      this.m82000();
      if ((Object2ObjectOpenHashMap)this.f8000[4] == null) {
         Object2ObjectOpenHashMap var10 = new Object2ObjectOpenHashMap();
         this.f8000[4] = var10;
      } else {
         Iface0667 var4 = (Iface0667)((Object2ObjectOpenHashMap)this.f8000[4]).get(var1);
         if (var4 != null) {
            return (T)var4;
         }
      }

      int var11 = GL31.glGetUniformLocation((Integer)this.y[0], var1);
      if (var11 < 0 && !var1.endsWith(f1000[1])) {
         var11 = GL31.glGetUniformLocation((Integer)this.y[0], var1 + "[0]");
      }

      if (var11 < 0) {
         throw new IllegalArgumentException("Uniform was not found or is inactive: " + var1 + " in " + (String)this.f8000[0] + ", " + (String)this.f8000[1]);
      } else {
         if (((Iface0034)this.f8000[3]).m4000()) {
            this.m90000(var1, var3);
         }

         Iface0667 var5 = (Iface0667)var2.apply(var11);
         ((Object2ObjectOpenHashMap)this.f8000[4]).put(var1, var5);
         return (T)var5;
      }
   }

   private void m90000(String var1, Enum0008 var2) {
      this.m82000();
      Rec0059 var3 = (Rec0059)this.m40000().get(m110000(var1));
      if (var3 != null) {
         if (!var2.m70000(var3.m8000(), var3.m6000(), var1.endsWith(f18000[0]))) {
            throw new IllegalArgumentException(
               "Uniform type mismatch: "
                  + var1
                  + " in "
                  + (String)this.f8000[0]
                  + ", "
                  + (String)this.f8000[1]
                  + ". Expected "
                  + var2.m66000()
                  + ", actual "
                  + m78000(var3.m8000())
                  + (var3.m6000() > 1 ? "[" + var3.m6000() + "]" : f18000[1])
            );
         }
      }
   }

   private int m92000(int var1, String var2) {
      this.m82000();
      String var3 = ((Iface0034)this.f8000[3]).m6000(var1, var2, this.m50000(var2));
      int var4 = GL31.glCreateShader(var1);
      GL31.glShaderSource(var4, var3);
      GL31.glCompileShader(var4);
      if (GL31.glGetShaderi(var4, 35713) == 0) {
         String var5 = GL31.glGetShaderInfoLog(var4);
         GL31.glDeleteShader(var4);
         throw new IllegalStateException("Shader compile failed: " + var2 + ". " + var5);
      } else {
         return var4;
      }
   }

   public C1250 m94000(String var1) {
      return this.m88000(var1, C1250::new, (Enum0008)Enum0008.f1000[5]);
   }

   public Iface0034 m96000() {
      this.m82000();
      return (Iface0034)this.f8000[3];
   }

   private void m100000() {
      int var1 = GL31.glGetProgrami((Integer)this.y[0], 35717);
      if (var1 > 0) {
         IntBuffer var2 = BufferUtils.createIntBuffer(1);
         IntBuffer var3 = BufferUtils.createIntBuffer(var1);
         GL31.glGetAttachedShaders((Integer)this.y[0], var2, var3);

         for (int var4 = 0; var4 < var2.get(0); var4++) {
            GL31.glDetachShader((Integer)this.y[0], var3.get(var4));
         }
      }
   }

   public String m102000() {
      this.m82000();
      return (String)this.f8000[1];
   }

   public C1223 m106000(String var1) {
      return this.m88000(var1, C1223::new, (Enum0008)Enum0008.f1000[3]);
   }

   private static String m110000(String var0) {
      int var1 = var0.indexOf(91);
      return var1 >= 0 ? var0.substring(0, var1) : var0;
   }
}
