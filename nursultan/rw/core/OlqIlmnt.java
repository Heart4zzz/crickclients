package rw.core;

import java.util.regex.Pattern;
import rw.data.Rec0312;

public class OlqIlmnt extends Base1014<String> {
   public Object[] f1000;

   public String m2000() {
      this.m2000();
      return (String)this.f1000[0];
   }

   public String m4000() {
      this.m2000();
      String var1 = (String)super.m14000();
      return var1 != null && ((Pattern)this.f1000[1] == null || ((Pattern)this.f1000[1]).matcher(var1).matches()) ? var1 : (String)this.U();
   }

   private void m2000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[2];
         Object[] var1 = this.f1000;
      }
   }

   public OlqIlmnt(Rec0312 var1, String var2, String var3, Pattern var4) {
      super(var1, var2);
      this.m2000();
      this.f1000[0] = var3;
      this.f1000[1] = var4;
   }

   static {
      ntfClinit();
   }

   public void m10000(String var1) {
      this.m2000();
      if (var1 != null && ((Pattern)this.f1000[1] == null || ((Pattern)this.f1000[1]).matcher(var1).matches())) {
         super.m34000(var1);
      } else {
         super.m34000((String)this.U());
      }
   }

   public Pattern m12000() {
      this.m2000();
      return (Pattern)this.f1000[1];
   }
}
