package rw.data;

import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.UUID;
import rw.api.Iface0640;
import rw.defs.Enum0002;

public non-sealed record Rec0303() implements Iface0640 {
   public String f1000;
   public boolean f2000;
   public UUID f3000;

   public static UUID m2000(String var0) {
      return UUID.nameUUIDFromBytes(("OfflinePlayer:" + var0).getBytes(StandardCharsets.UTF_8));
   }

   public UUID m4000() {
      return this.f3000 != null ? this.f3000 : this.m20000();
   }

   public Rec0303(String var1, UUID var2, boolean var3) {
      this.f1000 = var1;
      this.f3000 = var2;
      this.f2000 = var3;
   }

   static {
      ntfClinit();
   }

   public boolean m8000(Object var1) {
      if (this == var1) {
         return (boolean)1;
      } else {
         return (boolean)(var1 instanceof Rec0303 var2 && Objects.equals(this.f1000, var2.f1000) ? 1 : 0);
      }
   }

   @Override
   public int hashCode() {
      return Objects.hashCode(this.f1000);
   }

   public UUID m12000() {
      return this.f3000;
   }

   public String m14000() {
      return this.f1000;
   }

   public static Rec0303 m18000(String var0) {
      return new Rec0303(var0, null, false);
   }

   public UUID m20000() {
      return m2000(this.f1000);
   }

   public static Rec0303 m22000(String var0) {
      return new Rec0303(var0, null, true);
   }

   public Enum0002 m24000() {
      return this.f2000 ? (Enum0002)Enum0002.f3000[0] : (Enum0002)Enum0002.f3000[1];
   }

   public boolean m28000() {
      return this.f2000;
   }
}
