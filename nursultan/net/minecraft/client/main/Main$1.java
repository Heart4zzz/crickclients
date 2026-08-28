package net.minecraft.client.main;

import java.net.Authenticator;
import java.net.PasswordAuthentication;

public class Main$1 extends Authenticator {
   public Main$1(String var1, String var2) {
      this.N = var1;
      this.y = var2;
   }

   @Override
   protected PasswordAuthentication getPasswordAuthentication() {
      return new PasswordAuthentication(this.N, this.y.toCharArray());
   }
}
