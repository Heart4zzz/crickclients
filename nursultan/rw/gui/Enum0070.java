package rw.gui;

import java.util.Arrays;
import java.util.Objects;
import rw.data.Rec0312;

public enum Enum0070 {
   public static Object[] f1000;
   public Object[] f2000;
   private static String[] f3000;
   private static String[] f4000;
   private static String[] f5000;
   private static String[] f6000;
   private static String[] f7000;
   public static Object[] f8000;

   private static void m6000() {
      f5000 = new String[]{"sub", "FIGHTING"};
      f3000 = new String[]{"fighting", "TOOLS", "tools", "OTHER", "other", "WORLD", "world"};
      f6000 = new String[]{"SCREEN", "screen", "AUTO", "auto", "HELPER"};
      f7000 = new String[]{"helper", "INTERFACE", "interface", "TRACKERS", "trackers", "CLIENT", "client", "BASE"};
      f4000 = new String[]{"base"};
   }

   private Enum0070(String var3) {
      this.m56000();
      Rec0312 var8 = new Rec0312(f5000[0]).m12000(var3);
      this.f2000[0] = var8;
   }

   static {
      ntfClinit();
   }

   public static Enum0070[] m16000() {
      return (Enum0070[])((Enum0070[])f1000[6]).clone();
   }

   private void m56000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[1];
         Object[] var1 = this.f2000;
      }
   }

   public Rec0312 m64000() {
      return (Rec0312)this.f2000[0];
   }

   public static Enum0070 m70000(String var0) {
      return Arrays.stream(m16000()).filter(var1 -> Objects.equals(((Rec0312)var1.f2000[0]).m10000(), var0)).findFirst().orElse(null);
   }

   private static void m76000() {
      f8000 = new Object[]{null, null, null, null, null};
      f1000 = new Object[]{null, null, null, null, null, null, null};
   }
}
