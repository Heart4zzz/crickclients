package net.minecraft.util;

public class NativeModuleLister$NativeModuleVersion {
   public final String N;
   public final String y;
   public final String L;

   public NativeModuleLister$NativeModuleVersion(String var1, String var2, String var3) {
      this.N = var1;
      this.y = var2;
      this.L = var3;
   }

   @Override
   public String toString() {
      return this.N + ":" + this.y + ":" + this.L;
   }
}
