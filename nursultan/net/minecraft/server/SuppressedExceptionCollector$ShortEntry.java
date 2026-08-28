package net.minecraft.server;

record SuppressedExceptionCollector$ShortEntry() {
   final String location;
   final Class<? extends Throwable> cls;

   SuppressedExceptionCollector$ShortEntry(String var1, Class<? extends Throwable> var2) {
      this.location = var1;
      this.cls = var2;
   }

   public String N() {
      return this.location;
   }
}
