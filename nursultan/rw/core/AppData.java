package rw.core;

import KDFzREm.NNuU;
import KDFzREm.NlQ;
import KDFzREm.NlT;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AppData {
   private static String[] f1000;
   public static Object[] f2000;
   private static short[] f3000;
   private static boolean[] f4000;
   private static byte[] f5000;

   private static void m4000() {
      f2000 = new Object[]{null};
   }

   private AppData() {
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      f3000 = new short[]{1};
   }

   private static void m18000() {
      f1000 = new String[]{"Nursultan", "user.home", "AppData", "Roaming", "Nursultan"};
   }

   private static Path m22000() {
      if (NlT.m() == NlQ.field_1137) {
         return ((File)NNuU.Nq().l[f3000[0]]).toPath().resolve(f1000[0]);
      } else {
         String var10000 = System.getProperty(f1000[1]);
         String[] var10001 = new String[f5000[0]];
         var10001[f4000[0]] = f1000[2];
         var10001[f4000[1]] = f1000[3];
         var10001[f5000[1]] = f1000[4];
         return Paths.get(var10000, var10001);
      }
   }

   private static void m26000() {
      f4000 = new boolean[]{false, true, false, true};
   }

   private static void m32000() {
      f5000 = new byte[]{3, 2};
   }
}
