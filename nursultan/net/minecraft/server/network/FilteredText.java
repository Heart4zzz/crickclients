package net.minecraft.server.network;

import rw.core.C0414;

public record FilteredText() {
   private final String y;
   private final String L;
   private final boolean u;
   private final int i;
   private final int R;
   private final int M;
   private final float B;
   public static final FilteredText N;

   public FilteredText(String var1, String var2, boolean var3, int var4, int var5, int var6, float var7) {
      var1 = var1 == null ? "" : var1;
      var2 = var2 == null ? "" : var2;
      var4 = C0414.m10000(var1, var4);
      var5 = C0414.m10000(var1, var5);
      var6 = C0414.m10000(var1, var6);
      if (var5 > var6) {
         int var8 = var5;
         var5 = var6;
         var6 = var8;
      }

      var7 = Math.max(0.0F, var7);
      this.y = var1;
      this.L = var2;
      this.u = var3;
      this.i = var4;
      this.R = var5;
      this.M = var6;
      this.B = var7;
   }

   public boolean N() {
      return this.R != this.M;
   }
}
