package rw.core;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import rw.NursultanClient;
import rw.defs.OlpiIqlss;

public class C0967 {
   private static long[] f1000;
   private static byte[] f2000;
   private static boolean[] f3000;
   private static short[] f4000;
   public static Object[] f5000;
   private static String[] f6000;
   private static String[] f7000;
   private static String[] f8000;

   public static String m6000() {
      return LocalDateTime.now().format(DateTimeFormatter.ofPattern(f8000[0]));
   }

   private static void m10000() {
      f5000 = new Object[f2000[(0 | -0) >>> 31]];
      f5000[f3000[(0 | -0) >>> 31]] = f7000[4];
      f5000[f3000[(1 | -1) >>> 31]] = f7000[5];
      f5000[f2000[(1 | -1) >>> 31]] = f7000[6];
   }

   private C0967() {
      throw new UnsupportedOperationException(f7000[3]);
   }

   static {
      ntfClinit();
   }

   private static void m12000() {
      f6000 = new String[4];
      f6000[(0 | -0) >>> 31] = "HH:mm";
      f6000[(1 | -1) >>> 31] = "dd.MM.yyyy HH:mm";
      f6000[2] = "dd.MM HH:mm";
      f6000[3] = "dd.MM.yyyy HH:mm";
      f8000 = new String[3];
      f8000[(0 | -0) >>> 31] = "dd.MM.yyyy";
      f8000[(1 | -1) >>> 31] = "HH:mm";
      f8000[2] = "Сегодня в";
      f7000 = new String[7];
      f7000[(0 | -0) >>> 31] = "Today at";
      f7000[(1 | -1) >>> 31] = "Вчера в";
      f7000[2] = "Yesterday at";
      f7000[3] = "This is a utility class and cannot be instantiated";
      f7000[4] = "dd.MM.yyyy HH:mm";
      f7000[5] = "dd.MM.yyyy";
      f7000[6] = "HH:mm";
   }

   private static void m16000() {
      long[] var128 = new long[(1 | -1) >>> 31];
      f1000[(0 | -0) >>> 31] = 1L;
   }

   private static void m20000() {
      boolean[] var128 = new boolean[2];
      f3000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f3000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
   }

   private static String m30000() {
      return NursultanClient.m14000().m34000() == (OlpiIqlss)OlpiIqlss.f2000[f4000[0]] ? f8000[2] : f7000[0];
   }

   private static void m32000() {
      byte[] var128 = new byte[2];
      f2000[(0 | -0) >>> 31] = 3;
      f2000[(1 | -1) >>> 31] = 2;
   }

   private static void m36000() {
      short[] var128 = new short[2];
      f4000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f4000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
   }

   public static String m48000() {
      return LocalDateTime.now().format(DateTimeFormatter.ofPattern(f6000[3]));
   }

   public static String m52000(String var0, long var1) {
      DateTimeFormatter var3 = DateTimeFormatter.ofPattern(var0);
      return Instant.ofEpochMilli(var1).atZone(ZoneId.systemDefault()).format(var3);
   }

   public static String m54000() {
      return LocalDateTime.now().format(DateTimeFormatter.ofPattern(f8000[1]));
   }

   public static String m58000(long var0) {
      ZoneId var2 = ZoneId.systemDefault();
      ZonedDateTime var3 = Instant.ofEpochMilli(var0).atZone(var2);
      LocalDate var4 = var3.toLocalDate();
      LocalDate var5 = LocalDate.now(var2);
      String var6 = var3.format(DateTimeFormatter.ofPattern(f6000[0]));
      if (var4.equals(var5)) {
         return m30000() + " " + var6;
      } else if (var4.equals(var5.minusDays(f1000[0]))) {
         return m70000() + " " + var6;
      } else {
         return var4.getYear() != var5.getYear() ? var3.format(DateTimeFormatter.ofPattern(f6000[1])) : var3.format(DateTimeFormatter.ofPattern(f6000[2]));
      }
   }

   private static String m70000() {
      return NursultanClient.m14000().m34000() == (OlpiIqlss)OlpiIqlss.f2000[f4000[1]] ? f7000[1] : f7000[2];
   }
}
