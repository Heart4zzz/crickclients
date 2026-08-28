package rw.data;

import com.google.gson.annotations.SerializedName;
import java.lang.runtime.ObjectMethods;

public record Rec0244() {
   @SerializedName("name")
   private final String f1000;
   @SerializedName("password")
   private final String f2000;
   @SerializedName("last-login")
   private final String f3000;

   @SerializedName("name")
   public String m2000() {
      return this.f1000;
   }

   public Rec0244(String var1, String var2, String var3) {
      this.f1000 = var1;
      this.f2000 = var2;
      this.f3000 = var3;
   }

   static {
      ntfClinit();
   }

   public boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0244,"name;password;lastLogin",Rec0244::f1000,Rec0244::f2000,Rec0244::f3000>(this, var1);
   }

   @SerializedName("password")
   public String m6000() {
      return this.f2000;
   }

   @SerializedName("last-login")
   public String m8000() {
      return this.f3000;
   }
}
