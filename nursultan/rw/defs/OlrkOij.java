package rw.defs;

import java.util.Arrays;
import rw.core.C1145;

public enum OlrkOij {
   public static Object[] f1000;
   public Object[] f2000;
   private static String[] f3000;

   private void m2000() {
      if (llrrjjIp<"ywfrw",1437758376,1229271984,1229271985,1229271986,1437758376>(this) == null) {
         this.f2000 = new Object[2];
         Object[] var1 = this.f2000;
         var1[1] = 0;
      }
   }

   private OlrkOij(String var3, int var4) {
      this.m2000();
      this.f2000[0] = var3;
      Integer var10 = var4;
      this.f2000[1] = var10;
   }

   static {
      ntfClinit();
   }

   public static OlrkOij[] m12000() {
      return (OlrkOij[])((OlrkOij[])f1000[4]).clone();
   }

   private static void m20000() {
      f3000 = new String[]{"HELPER", "helper", "MODERATOR", "moderator", "ADMINISTRATOR", "administrator", "DEVELOPER", "developer"};
   }

   public String m36000() {
      return (String)this.f2000[0];
   }

   public int m42000() {
      return (Integer)this.f2000[1];
   }

   public boolean m44000(C1145 var1) {
      return (boolean)(var1.m16000() >= this.f2000[1] ? 1 : 0);
   }

   public static OlrkOij m48000(String var0) {
      return Arrays.stream(m12000())
         .filter(var1 -> ((String)llrrjjIp<"ywfrw",1437758376,1229271984,1229271985,1229271986,1437758376>(var1)[0]).equals(var0))
         .findFirst()
         .orElse(null);
   }

   private static void m52000() {
      f1000 = new Object[]{null, null, null, null, null};
   }
}
