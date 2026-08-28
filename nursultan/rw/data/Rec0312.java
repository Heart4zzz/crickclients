package rw.data;

import java.util.Objects;

public record Rec0312() {
   public String f1000;

   public Rec0312(String var1) {
      this.f1000 = var1;
   }

   static {
      ntfClinit();
   }

   public boolean m2000(Object var1) {
      if (var1 instanceof Rec0312 var3) {
         Rec0312 var10000 = var3;

         try {
            var6 = var10000.m10000();
         } catch (Throwable var5) {
            throw new MatchException(var5.toString(), var5);
         }

         String var4 = var6;
         return Objects.equals(this.f1000, var4);
      } else {
         return (boolean)0;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hashCode(this.f1000);
   }

   public String m6000(String var1) {
      return var1 + "." + this.f1000;
   }

   public String m10000() {
      return this.f1000;
   }

   public Rec0312 m12000(String var1) {
      return new Rec0312(this.f1000 + "." + var1);
   }

   public Rec0312 m14000(Rec0312 var1) {
      return new Rec0312(this.f1000 + "." + var1.f1000);
   }
}
