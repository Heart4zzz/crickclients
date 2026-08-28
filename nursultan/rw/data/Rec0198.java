package rw.data;

import java.lang.runtime.ObjectMethods;
import rw.defs.Enum0060;

public record Rec0198() {
   public String f1000;
   public Object f2000;
   private static String[] f3000;
   public Enum0060 f4000;
   public boolean f5000;

   public Object m2000() {
      return this.f2000;
   }

   private Rec0198(String var1, boolean var2, Object var3, Enum0060 var4) {
      this.f1000 = var1;
      this.f5000 = var2;
      this.f2000 = var3;
      this.f4000 = var4;
   }

   static {
      ntfClinit();
   }

   public boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0198,"name;uniform;value;expectedType",Rec0198::f1000,Rec0198::f5000,Rec0198::f2000,Rec0198::f4000>(this, var1);
   }

   public String m8000() {
      return this.f1000;
   }

   public boolean m12000() {
      return this.f5000;
   }

   public static Rec0198 m16000(String var0, Enum0060 var1) {
      return new Rec0198(m24000(var0), true, null, var1);
   }

   public static Rec0198 m18000(String var0, Object var1) {
      return new Rec0198(m24000(var0), false, var1, null);
   }

   public static Rec0198 m20000(Enum0060 var0) {
      return new Rec0198(null, true, null, var0);
   }

   public static Rec0198 m22000(Object var0) {
      return new Rec0198(null, false, var0, null);
   }

   private static String m24000(String var0) {
      if (var0 != null && !var0.isBlank()) {
         return var0;
      } else {
         throw new IllegalArgumentException(f3000[0]);
      }
   }

   public Enum0060 m26000() {
      return this.f4000;
   }

   private static void m30000() {
      f3000 = new String[]{"Shader template arg name is blank"};
   }
}
