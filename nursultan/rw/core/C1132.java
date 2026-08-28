package rw.core;

import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.io.IOUtils;
import rw.api.Iface0638;

public class C1132 implements Iface0638 {
   C1132() {
   }

   static {
      ntfClinit();
   }

   @Override
   public byte[] m2000(String var1) throws IOException {
      byte[] var3;
      try (InputStream var2 = rw.setting.C0161.m6000(var1).method_14482()) {
         var3 = IOUtils.toByteArray(var2);
      }

      return var3;
   }
}
