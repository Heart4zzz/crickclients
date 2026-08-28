package rw.data;

import java.lang.runtime.ObjectMethods;
import java.nio.ByteBuffer;

public record Rec0283() {
   public int f1000;
   public int f2000;
   public int f3000;
   public ByteBuffer f4000;

   public int m2000() {
      return this.f1000;
   }

   public Rec0283(ByteBuffer var1, int var2, int var3, int var4) {
      this.f4000 = var1;
      this.f1000 = var2;
      this.f3000 = var3;
      this.f2000 = var4;
   }

   static {
      ntfClinit();
   }

   public boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0283,"pcm;channels;sampleBits;sampleRate",Rec0283::f4000,Rec0283::f1000,Rec0283::f3000,Rec0283::f2000>(
         this, var1
      );
   }

   public ByteBuffer m6000() {
      return this.f4000;
   }

   public int m8000() {
      return this.f3000;
   }

   public int m10000() {
      return this.f2000;
   }
}
