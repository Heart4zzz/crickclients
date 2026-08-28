package net.minecraft.server.gui;

import KDFzREm.NNiD;
import KDFzREm.NNip;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

class MinecraftServerGui$1 extends WindowAdapter {
   MinecraftServerGui$1(NNiD var1, JFrame var2, NNip var3) {
      this.N = var1;
      this.val$frame = var2;
      this.L = var3;
   }

   @Override
   public void windowClosing(WindowEvent var1) {
      if (!this.N.N.getAndSet(true)) {
         this.val$frame.setTitle("Minecraft server - shutting down!");
         this.L.y(true);
         this.N.L();
      }
   }
}
