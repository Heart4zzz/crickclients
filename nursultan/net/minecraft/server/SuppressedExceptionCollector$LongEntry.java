package net.minecraft.server;

record SuppressedExceptionCollector$LongEntry() {
   final long timestampMs;
   final String y;
   final Class<? extends Throwable> cls;
   final String u;

   SuppressedExceptionCollector$LongEntry(long var1, String var3, Class<? extends Throwable> var4, String var5) {
      this.timestampMs = var1;
      this.y = var3;
      this.cls = var4;
      this.u = var5;
   }
}
