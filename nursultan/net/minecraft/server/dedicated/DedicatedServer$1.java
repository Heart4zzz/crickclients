package net.minecraft.server.dedicated;

import KDFzREm.NNip;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

class DedicatedServer$1 extends Thread {
   DedicatedServer$1(NNip var1, String var2) {
      super(var2);
      this.N = var1;
   }

   @Override
   public void run() {
      BufferedReader var1 = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8));

      String var2;
      try {
         while (!this.N.NX() && this.N.Nj() && (var2 = var1.readLine()) != null) {
            this.N.N(var2, this.N.yu());
         }
      } catch (IOException var4) {
         NNip.N.error("Exception handling console input", var4);
      }
   }
}
