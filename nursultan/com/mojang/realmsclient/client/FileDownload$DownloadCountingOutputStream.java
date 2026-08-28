package com.mojang.realmsclient.client;

import KDFzREm.NNQy;
import java.io.IOException;
import java.io.OutputStream;
import org.apache.commons.io.output.CountingOutputStream;

class FileDownload$DownloadCountingOutputStream extends CountingOutputStream {
   private final NNQy N;

   public FileDownload$DownloadCountingOutputStream(OutputStream var1, NNQy var2) {
      super(var1);
      this.N = var2;
   }

   protected void afterWrite(int var1) throws IOException {
      super.afterWrite(var1);
      this.N.N = this.getByteCount();
   }
}
