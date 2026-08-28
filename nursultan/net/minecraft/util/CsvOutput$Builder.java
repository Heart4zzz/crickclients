package net.minecraft.util;

import KDFzREm.NNOE;
import com.google.common.collect.Lists;
import java.io.IOException;
import java.io.Writer;
import java.util.List;

public class CsvOutput$Builder {
   private final List<String> headers = Lists.newArrayList();

   public CsvOutput$Builder N(String var1) {
      this.headers.add(var1);
      return this;
   }

   public NNOE N(Writer var1) throws IOException {
      return new NNOE(var1, this.headers);
   }
}
