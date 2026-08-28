package rw.core;

import KDFzREm.NxU;
import java.util.Deque;

public class OlqOrnin {
   public static Object[] f1000;

   public static void m2000() {
      if (((Deque)f1000[0]).isEmpty()) {
         Object var4 = null;
         f1000[1] = var4;
      } else {
         NxU var5 = (NxU)((Deque)f1000[0]).removeLast();
         f1000[1] = var5;
      }
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      f1000 = new Object[]{null, null};
   }

   public static void m16000() {
      ((Deque)f1000[0]).clear();
      Object var4 = null;
      f1000[1] = var4;
   }

   public static void m20000(NxU var0) {
      if ((NxU)f1000[1] != null) {
         ((Deque)f1000[0]).addLast((NxU)f1000[1]);
      }

      f1000[1] = var0;
   }

   public static NxU m22000() {
      return (NxU)f1000[1];
   }
}
