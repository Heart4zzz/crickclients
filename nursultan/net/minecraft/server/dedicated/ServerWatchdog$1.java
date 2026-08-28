package net.minecraft.server.dedicated;

import KDFzREm.NNif;
import java.util.TimerTask;

class ServerWatchdog$1 extends TimerTask {
   ServerWatchdog$1(NNif var1) {
   }

   @Override
   public void run() {
      Runtime.getRuntime().halt(1);
   }
}
