package rw.data;

import java.lang.runtime.ObjectMethods;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import rw.NursultanClient;
import rw.core.C0959;

public record Rec0282() {
   public String f1000;
   public String f2000;
   private static String[] f3000;
   public long f4000;

   public String m2000() {
      return this.f1000;
   }

   public Rec0282(String var1, String var2, long var3) {
      this.f2000 = var1;
      this.f1000 = var2;
      this.f4000 = var3;
   }

   static {
      ntfClinit();
   }

   public boolean m8000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0282,"avatarRef;username;subscribeMinutes",Rec0282::f2000,Rec0282::f1000,Rec0282::f4000>(this, var1);
   }

   public String m12000() {
      return this.f2000;
   }

   public long m16000() {
      return this.f4000;
   }

   public String m20000() {
      Locale var1 = Locale.forLanguageTag(NursultanClient.m14000().m34000().m32000());
      return LocalDate.now()
         .plusDays(((C0959)NursultanClient.f13000[2]).m32000() / 1440L)
         .format(DateTimeFormatter.ofPattern(f3000[0], var1))
         .toLowerCase(var1);
   }

   private static void m26000() {
      f3000 = new String[]{"d MMMM yyyy"};
   }
}
