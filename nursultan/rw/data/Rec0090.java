package rw.data;

import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Map;

public record Rec0090() {
   private final String f1000;
   private final String f2000;
   private final Map<String, String> f3000;
   private final List<Rec0090> f4000;

   public Map<String, String> m2000() {
      return this.f3000;
   }

   public Rec0090(String var1, String var2, Map<String, String> var3, List<Rec0090> var4) {
      this.f1000 = var1;
      this.f2000 = var2;
      this.f3000 = var3;
      this.f4000 = var4;
   }

   public final boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0090,"id;label;fields;children",Rec0090::f1000,Rec0090::f2000,Rec0090::f3000,Rec0090::f4000>(this, var1);
   }

   public List<Rec0090> m6000() {
      return this.f4000;
   }

   public String m8000() {
      return this.f2000;
   }

   public String m10000() {
      return this.f1000;
   }
}
