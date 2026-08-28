package rw.gui;

import rw.setting.C0161;

public class C0002 {
   private static String[] f1000;
   public static Object[] f2000;

   public static void m6000() {
      ((C0003)I1jnnntsi<"rkrx",-469751798,1125111670,1125111671,1125111668,-665564939>()[0]).m60000();
   }

   private static void m8000() {
      f1000 = new String[]{
         "Already initialized", "inter", "fonts/interm.ttf", "minecraft", "fonts/minecraft.ttf", "This is a utility class and cannot be instantiated"
      };
   }

   private C0002() {
      throw new UnsupportedOperationException(f1000[5]);
   }

   static {
      ntfClinit();
   }

   private static void m12000() {
      f2000 = new Object[]{null, null, null, true};
   }

   public static ZwBs m16000() {
      return (ZwBs)f2000[2];
   }

   public static ZwBs m24000() {
      return (ZwBs)f2000[1];
   }

   public static void m30000() {
      if ((Boolean)f2000[3]) {
         throw new IllegalStateException(f1000[0]);
      } else {
         ZwBs var4 = ((C0003)f2000[0]).m54000(f1000[1], C0161.m6000(f1000[2]));
         f2000[1] = var4;
         ZwBs var5 = ((C0003)f2000[0]).m54000(f1000[3], C0161.m6000(f1000[4]));
         f2000[2] = var5;
         Boolean var6 = true;
         f2000[3] = var6;
      }
   }

   public static void m36000() {
      ((C0003)f2000[0]).m6000();
   }

   public static ZwBs m40000(String var0) {
      return ((C0003)f2000[0]).m50000(var0);
   }
}
