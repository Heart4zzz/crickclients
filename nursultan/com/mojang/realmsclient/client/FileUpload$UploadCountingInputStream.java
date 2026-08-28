package com.mojang.realmsclient.client;

import KDFzREm.NNYY;
import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.io.input.CountingInputStream;

class FileUpload$UploadCountingInputStream extends CountingInputStream {
   private final NNYY N;

   FileUpload$UploadCountingInputStream(InputStream var1, NNYY var2) {
      super(var1);
      this.N = var2;
   }

   protected void afterRead(int var1) throws IOException {
      super.afterRead(var1);
      this.N.y(this.getByteCount());
   }
}
