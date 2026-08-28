package net.minecraft;

import org.jspecify.annotations.Nullable;

class CrashReportCategory$Entry {
   private final String N;
   private final String y;

   public CrashReportCategory$Entry(String var1, @Nullable Object var2) {
      this.N = var1;
      if (var2 == null) {
         this.y = "~~NULL~~";
      } else if (var2 instanceof Throwable var3) {
         this.y = "~~ERROR~~ " + var3.getClass().getSimpleName() + ": " + var3.getMessage();
      } else {
         this.y = var2.toString();
      }
   }

   public String y() {
      return this.y;
   }

   public String N() {
      return this.N;
   }
}
