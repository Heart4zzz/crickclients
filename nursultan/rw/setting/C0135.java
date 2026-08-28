package rw.setting;

import KDFzREm.NNuU;
import KDFzREm.NQl;
import KDFzREm.NQo;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import rw.defs.Enum0059;

public class C0135 {
   private static String[] f1000;
   public Object[] f2000;

   public Enum0059 m2000() {
      return (Enum0059)this.f2000[3];
   }

   private void m10000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[4];
         Object[] var1 = this.f2000;
      }
   }

   public C0135(NQl var1) {
      this.m10000();
      this.f2000[0] = var1;
   }

   static {
      ntfClinit();
   }

   public NQl m18000() {
      return (NQl)this.f2000[0];
   }

   public String m24000() {
      return (String)this.f2000[1];
   }

   public C0135 m28000(String var1) {
      this.f2000[1] = var1;
      return this;
   }

   public String m32000() {
      return (String)this.f2000[2];
   }

   public NQo m36000() {
      if ((String)this.f2000[1] == null) {
         throw new IllegalStateException(f1000[0]);
      } else {
         Path var1 = ((File)NNuU.Nq().l[1]).toPath();
         Path var2 = var1.resolve(f1000[1]);
         if (!Files.exists(var2)) {
            throw new IllegalStateException(f1000[2]);
         } else {
            Path var3 = var2.resolve(f1000[3]);
            if (!Files.exists(var3)) {
               throw new IllegalStateException(f1000[4]);
            } else {
               Path var4 = var3.resolve((String)this.f2000[1] + ".nbt");
               if (!Files.exists(var4)) {
                  throw new IllegalStateException("Item NBT file not found: " + var4);
               } else {
                  return C0159.m70000(var4);
               }
            }
         }
      }
   }

   public C0135 m38000(Enum0059 var1) {
      this.f2000[3] = var1;
      return this;
   }

   public C0135 m40000(String var1) {
      this.f2000[2] = var1;
      return this;
   }

   private static void m44000() {
      f1000 = new String[]{"Item id not set", "public-resources", "Resources directory not found", "ab-items", "ab-items directory not found"};
   }
}
