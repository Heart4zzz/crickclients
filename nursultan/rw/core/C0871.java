package rw.core;

public class C0871 {
   static {
      ntfClinit();
   }

   public void m2000(int var1, byte[] var2) {
      switch (var1) {
         case 1:
            new OlOsim().m28000(var2);
            return;
         default:
            throw new IllegalStateException("Unsupported preset format: " + var1);
      }
   }
}
