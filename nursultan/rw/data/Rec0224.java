package rw.data;

import java.lang.runtime.ObjectMethods;
import java.util.UUID;

public record Rec0224() {
   public String f1000;
   public UUID f2000;
   public String f3000;
   public String f4000;
   public String f5000;

   public String m2000() {
      return this.f4000;
   }

   public Rec0224(UUID var1, String var2, String var3, String var4, String var5) {
      this.f2000 = var1;
      this.f5000 = var2;
      this.f1000 = var3;
      this.f3000 = var4;
      this.f4000 = var5;
   }

   static {
      ntfClinit();
   }

   public boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0224,"uuid;name;token;refresh;xuid",Rec0224::f2000,Rec0224::f5000,Rec0224::f1000,Rec0224::f3000,Rec0224::f4000>(
         this, var1
      );
   }

   public String m6000() {
      return this.f5000;
   }

   public String m8000() {
      return this.f3000;
   }

   public String m10000() {
      return this.f1000;
   }

   public UUID m12000() {
      return this.f2000;
   }
}
