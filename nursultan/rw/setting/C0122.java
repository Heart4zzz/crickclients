package rw.setting;

import java.util.Arrays;
import java.util.regex.Pattern;
import rw.core.Base0995;
import rw.core.C0979;
import rw.core.C0988;
import rw.core.C0991;
import rw.core.C0998;
import rw.core.C1000;
import rw.core.C1003;
import rw.core.C1004;
import rw.core.C1006;
import rw.core.C1010;
import rw.core.C1013;
import rw.core.OlqIlmnt;
import rw.data.Rec0312;
import rw.gui.PgUp;

public class C0122 {
   private static String[] f1000;

   private C0122() {
      throw new UnsupportedOperationException(f1000[1]);
   }

   static {
      ntfClinit();
   }

   @SafeVarargs
   public static <T extends C1013> C1003<T> m4000(Base0995 var0, String var1, T... var2) {
      C1003 var3 = new C1003<>(var0.m22000(var1), Arrays.asList(var2));
      return (C1003<T>)var0.m18000(var3);
   }

   public static C0998 m6000(Base0995 var0, String var1, int var2) {
      C0998 var3 = new C0998(var0.m22000(var1), var2);
      return (C0998)var0.m18000(var3);
   }

   public static OlqIlmnt m8000(Base0995 var0, String var1, String var2, Pattern var3) {
      Rec0312 var4 = var0.m22000(var1);
      OlqIlmnt var5 = new OlqIlmnt(var4, var2, var4.m12000(f1000[0]).m10000(), var3);
      return (OlqIlmnt)var0.m18000(var5);
   }

   public static C1004 m10000(Base0995 var0, String var1, C0979 var2, C0979 var3, float var4) {
      C1004 var5 = new C1004(var0.m22000(var1), var2, var3, var4);
      return (C1004)var0.m18000(var5);
   }

   public static C0988 m12000(Base0995 var0, String var1, float var2, float var3, float var4, float var5) {
      C0988 var6 = new C0988(var0.m22000(var1), var2, var3, var4, var5);
      return (C0988)var0.m18000(var6);
   }

   public static C1006 m14000(Base0995 var0, String var1, PgUp var2) {
      C1006 var3 = new C1006(var0.m22000(var1), var2);
      return (C1006)var0.m18000(var3);
   }

   @SafeVarargs
   public static <T extends C1013> C1000<T> m18000(Base0995 var0, String var1, T... var2) {
      C1000 var3 = new C1000<>(var0.m22000(var1), Arrays.asList(var2));
      return (C1000<T>)var0.m18000(var3);
   }

   private static void m20000() {
      f1000 = new String[]{"place-holder", "This is a utility class and cannot be instantiated"};
   }

   public static C1010 m22000(Base0995 var0, String var1, Runnable var2) {
      C1010 var3 = new C1010(var0.m22000(var1), var2);
      return (C1010)var0.m18000(var3);
   }

   public static C0991 m26000(Base0995 var0, String var1, boolean var2) {
      C0991 var3 = new C0991(var0.m22000(var1), var2);
      return (C0991)var0.m18000(var3);
   }
}
