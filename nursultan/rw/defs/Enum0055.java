package rw.defs;

import java.util.Arrays;
import rw.data.Rec0312;
import rw.gui.Enum0070;

public enum Enum0055 {
   public Object[] f1000;
   public static Object[] f2000;
   private static String[] f3000;
   private static String[] f4000;

   private Enum0055(String var3, Enum0070... var4) {
      this.m22000();
      Rec0312 var9 = new Rec0312(f4000[0]).m12000(var3);
      this.f1000[0] = var9;
      this.f1000[1] = var4;
   }

   static {
      ntfClinit();
   }

   public static Enum0055[] m12000() {
      return (Enum0055[])((Enum0055[])f2000[5]).clone();
   }

   private static void m14000() {
      f2000 = new Object[]{null, null, null, null, null, null};
   }

   private void m22000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[2];
         Object[] var1 = this.f1000;
      }
   }

   private static void m32000() {
      f4000 = new String[]{"category", "COMBAT", "combat", "MOVEMENT", "movement", "VISUAL", "visual"};
      f3000 = new String[]{"PLAYER", "player", "MISC", "misc"};
   }

   public Enum0070[] m42000() {
      return (Enum0070[])this.f1000[1];
   }

   public static Enum0055 m46000(String var0) {
      return Arrays.stream(m12000()).filter(var1 -> ((Rec0312)var1.f1000[0]).m10000().equals(var0)).findFirst().orElse(null);
   }

   public Rec0312 m52000() {
      return (Rec0312)this.f1000[0];
   }
}
