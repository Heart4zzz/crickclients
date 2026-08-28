package net.minecraft.util;

import KDFzREm.NlT;

class Util$9 extends Thread {
   Util$9(String var1) {
      super(var1);
   }

   @Override
   public void run() {
      while (true) {
         try {
            Thread.sleep(2147483647L);
         } catch (InterruptedException var2) {
            NlT.N.warn("Timer hack thread interrupted, that really should not happen");
            return;
         }
      }
   }
}
