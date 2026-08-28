package rw.defs;

import java.util.Set;

public enum Enum0008 {
   public static Object[] f1000;
   public static Object[] f2000;
   private static String[] f3000;
   private static String[] f4000;
   private static String[] f5000;
   public Object[] f6000;
   private static String[] f7000;

   private static void m6000() {
      f1000 = new Object[]{null, null, null, null, null, null};
      f2000 = new Object[]{null, null, null, null, null, null};
   }

   private void m8000() {
      if (lIttspr<"idyzhtpr",-2114325723,-1135611159,-1135611140,-1135611157,-2114325723,-2114325723,-2114325723>(this) == null) {
         this.f6000 = new Object[3];
         Object[] var1 = this.f6000;
         var1[2] = false;
      }
   }

   private Enum0008(String var3, Set<Integer> var4, boolean var5) {
      this.m8000();
      this.f6000[0] = var3;
      this.f6000[1] = var4;
      Boolean var12 = var5;
      this.f6000[2] = var12;
   }

   static {
      ntfClinit();
   }

   public static Enum0008[] m16000() {
      return (Enum0008[])((Enum0008[])f2000[5]).clone();
   }

   private static void m20000() {
      f3000 = new String[]{"FLOAT", "float", "FLOAT_ARRAY", "float[]", "INT", "int/bool/sampler2D", "VEC2"};
      f7000 = new String[]{"vec2", "VEC3", "vec3"};
      f4000 = new String[]{"VEC4", "vec4", "IVEC2", "ivec2", "IVEC3", "ivec3", "IVEC4"};
      f5000 = new String[]{"ivec4", "MAT4", "mat4", "SAMPLER_2D", "sampler2D"};
   }

   public String m66000() {
      return (String)this.f6000[0];
   }

   public boolean m70000(int var1, int var2, boolean var3) {
      return (boolean)(!((Set)this.f6000[1]).contains(var1) || !this.f6000[2] && !var3 && var2 != 1 ? 0 : 1);
   }
}
