package net.minecraft.client.renderer;

import KDFzREm.wP;

public class PostChain {
   private static boolean[] y;
   public static Object[] N;
   private static String[] L;

   private static void L() {
      N = new Object[]{null};
   }

   private PostChain() {
      throw new UnsupportedOperationException(wP.L[0]);
   }

   static {
      ntfClinit();
   }

   private static void y() {
      L = new String[]{"This is a utility class and cannot be instantiated", "pipeline/mojang_logo_shadows"};
   }

   private static void N() {
      y = new boolean[]{true, false, false, true};
   }
}
