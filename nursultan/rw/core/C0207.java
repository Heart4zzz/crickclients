package rw.core;

import KDFzREm.NNIr;
import KDFzREm.NNNTJ;
import KDFzREm.NNNTg;
import KDFzREm.NaF;
import KDFzREm.NpT;
import java.io.DataInput;
import java.io.IOException;

class C0207 implements NNIr<NaF> {
   private IOException m4000() {
      return new IOException("Invalid tag id: " + this.f1000);
   }

   C0207(int var1) {
      this.f1000 = var1;
   }

   public void m6000(DataInput var1, NpT var2) throws IOException {
      throw this.m4000();
   }

   public String m8000() {
      return "UNKNOWN_" + this.f1000;
   }

   public String m10000() {
      return "INVALID[" + this.f1000 + "]";
   }

   public void m12000(DataInput var1, int var2, NpT var3) throws IOException {
      throw this.m4000();
   }

   public NaF m14000(DataInput var1, NpT var2) throws IOException {
      throw this.m4000();
   }

   public NNNTJ m16000(DataInput var1, NNNTg var2, NpT var3) throws IOException {
      throw this.m4000();
   }
}
