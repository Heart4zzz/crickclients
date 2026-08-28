package rw.core;

import KDFzREm.NAN;
import KDFzREm.NCW;
import KDFzREm.NCz;
import KDFzREm.NNNwS;
import KDFzREm.NNNwd;
import KDFzREm.NNag;
import KDFzREm.NNuU;
import KDFzREm.NPh;
import KDFzREm.NQo;
import KDFzREm.NYj;
import KDFzREm.NkG;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Queue;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.LongStream;
import rw.api.Iface0653;
import rw.setting.C0106;

public class C0778 implements Iface0653 {
   private static short[] f1000;
   private static short[] f2000;
   private static short[] f3000;
   private static short[] f4000;
   private static short[] f5000;
   private static short[] f6000;
   private static short[] f7000;
   private static short[] f8000;
   private static String[] f9000;
   private static short[] f10000;
   private static short[] f11000;
   private static short[] f12000;
   private static short[] f13000;
   private static short[] f14000;
   private static short[] f15000;
   public Object[] f16000;
   public static Object[] f17000;
   private static String[] f18000;

   private void m10000() {
      Long var1 = (Long)((Function)this.f16000[3])
         .apply(
            ((NkG)((NNNwS)((NNuU)this.f16000[0]).T[4]).fields_07fa3311b0e9d3e9b883d09222919bf5a[3])
               .T
               .stream()
               .limit(45L)
               .<NQo>map(NYj::i)
               .filter(var1x -> ((rw.setting.C0156)this.f16000[4]).m62000(var1x))
               .mapToLong(C0778::m54000)
               .filter(var0 -> (boolean)(var0 > 0L ? 1 : 0))
         );
      if (var1 > 0L) {
         DecimalFormat var2 = new DecimalFormat(f18000[0]);
         var2.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.US));
         String var3 = var2.format(var1);
         NNag var4 = NAN.y(((rw.setting.C0156)this.f16000[4]).m82000()).N(NPh.field_1080).i(f18000[1]).y(NAN.y(var3).N(NPh.field_1054));
         C0106.m32000(var4);
         ((rw.setting.C0156)this.f16000[4]).m24000().m10000(String.valueOf(var1));
      }
   }

   private void m12000(int var1) {
      if (var1 != 0 && (Integer)this.f16000[5] <= 0) {
         Boolean var6 = true;
         this.f16000[7] = var6;
         Integer var7 = Integer.MAX_VALUE;
         this.f16000[6] = var7;
      }
   }

   private static void m14000() {
      f17000 = new Object[]{null};
   }

   public C0778() {
      this.m32000();
      NNuU var5 = NNuU.Nq();
      this.f16000[0] = var5;
   }

   static {
      ntfClinit();
   }

   private void m16000() {
      rw.setting.C0156 var5 = (rw.setting.C0156)((Queue)this.f16000[f7000[2]]).poll();
      this.f16000[f7000[3]] = var5;
      if ((rw.setting.C0156)this.f16000[f7000[4]] != null) {
         rw.setting.C0160.m70000("/ah search " + ((rw.setting.C0156)this.f16000[f7000[5]]).m82000());
         Integer var6 = 60;
         this.f16000[f7000[6]] = var6;
         Integer var7 = 1;
         this.f16000[5] = var7;
      }
   }

   private void m30000() {
      this.m76000();
   }

   private void m32000() {
      if (this.f16000 == null) {
         this.f16000 = new Object[8];
         Object[] var1 = this.f16000;
         var1[5] = 0;
         var1[6] = 0;
         var1[7] = false;
      }
   }

   private void m36000() {
      if ((rw.setting.C0156)this.f16000[4] != null) {
         this.m10000();
      }

      Integer var5 = 18;
      this.f16000[5] = var5;
      ((NNNwS)((NNuU)this.f16000[0]).T[4]).method_7346();
      rw.setting.C0156 var6 = (rw.setting.C0156)((Queue)this.f16000[2]).poll();
      this.f16000[4] = var6;
      if ((rw.setting.C0156)this.f16000[4] == null) {
         ((CompletableFuture)this.f16000[1]).complete(null);
      }

      Boolean var7 = false;
      this.f16000[7] = var7;
   }

   private void m42000() {
      if ((rw.setting.C0156)this.f16000[4] != null) {
         rw.setting.C0160.m70000("/ah search " + ((rw.setting.C0156)this.f16000[f7000[0]]).m82000());
         Integer var5 = 60;
         this.f16000[f7000[1]] = var5;
      }
   }

   public void m48000(Object var1) {
      if ((CompletableFuture)this.f16000[1] != null && !((CompletableFuture)this.f16000[1]).isDone()) {
         switch (var1) {
            case C0719 var4:
               this.m78000();
               break;
            case C0151 var5:
               this.m30000();
               break;
            case NCz var6:
               this.m12000(var6.N());
               break;
            case NCW var7:
               this.m12000(var7.N());
               break;
            case NNNwd var8:
               this.m66000(var8);
               break;
            case null:
            default:
         }
      }
   }

   private static void m52000() {
      f9000 = new String[]{"не существует", "после входа на режим необходимо", "сек.", "\\D+", "", "команда недоступна в режиме afk"};
      f18000 = new String[]{"$###,###", " ", ", ", "[,\\s]", "", "\\$\\s*.*?(\\d{1,3}(?:,\\d{3})*)"};
   }

   private static long m54000(NQo var0) {
      String var1 = String.join(f18000[2], C1193.m40000(var0));

      for (Pattern var5 : (Pattern[])f17000[0]) {
         Matcher var6 = var5.matcher(var1);
         if (var6.find()) {
            String var7 = var6.group(1).replaceAll(f18000[3], f18000[4]);
            return Long.parseLong(var7) / var0.c();
         }
      }

      return -1L;
   }

   private static void m60000() {
      f2000 = new short[]{0, 1, 1, 1, 1, 1, 7};
      f14000 = new short[]{6, 5, 4, 2};
      f8000 = new short[]{3, 1, 2, 4};
      f5000 = new short[]{0, 4};
      f13000 = new short[]{3, 0, 4, 5, 1, 5};
      f1000 = new short[]{7, 6, 5};
      f4000 = new short[]{5, 6, 6, 7, 5, 6, 5};
      f3000 = new short[]{2, 4, 2, 4, 5, 2, 4, 5};
      f11000 = new short[]{4, 5};
      f15000 = new short[]{0, 4};
      f6000 = new short[]{2, 4, 4, 1, 7, 4};
      f7000 = new short[]{4, 6, 2, 4, 4, 4, 6};
      f12000 = new short[]{5, 3, 0, 4, 3, 4, 4, 0};
      f10000 = new short[]{4};
   }

   private void m66000(NNNwd var1) {
      String var2 = var1.N().getString().toLowerCase();
      if (var2.contains(f9000[0])) {
         Integer var10 = 18;
         this.f16000[5] = var10;
         rw.setting.C0156 var11 = (rw.setting.C0156)((Queue)this.f16000[2]).poll();
         this.f16000[4] = var11;
      } else if (var2.contains(f9000[1]) && var2.contains(f9000[2])) {
         ((Queue)this.f16000[2]).add((rw.setting.C0156)this.f16000[4]);
         String var3 = var2.replaceAll(f9000[3], f9000[4]);
         int var4 = 20;

         try {
            int var5 = Integer.parseInt(var3);
            var4 += var4 * (var5 + 3);
         } catch (NumberFormatException var14) {
         }

         Integer var12 = var4;
         this.f16000[5] = var12;
      } else if (var2.contains(f9000[5])) {
         ((Queue)this.f16000[2]).add((rw.setting.C0156)this.f16000[4]);
         Integer var13 = 60;
         this.f16000[5] = var13;
      }
   }

   public CompletableFuture<Void> m74000(Collection<rw.setting.C0156> var1, Function<LongStream, Long> var2) {
      LinkedList var7 = new LinkedList(var1);
      this.f16000[2] = var7;
      this.f16000[3] = var2;
      this.m76000();
      CompletableFuture var9 = new CompletableFuture();
      this.f16000[1] = var9;
      rw.setting.C0156 var10 = (rw.setting.C0156)((Queue)this.f16000[2]).poll();
      this.f16000[4] = var10;
      if (((NkG)((NNNwS)((NNuU)this.f16000[0]).T[4]).fields_07fa3311b0e9d3e9b883d09222919bf5a[3]).b != 0) {
         ((NNNwS)((NNuU)this.f16000[0]).T[4]).method_7346();
         Integer var11 = 60;
         this.f16000[5] = var11;
      }

      return (CompletableFuture<Void>)this.f16000[1];
   }

   public void m76000() {
      if ((CompletableFuture)this.f16000[1] != null && !((CompletableFuture)this.f16000[1]).isDone()) {
         ((CompletableFuture)this.f16000[1]).cancel((boolean)0);
      }

      Boolean var5 = false;
      this.f16000[7] = var5;
      Integer var6 = Integer.MAX_VALUE;
      this.f16000[6] = var6;
      Integer var7 = 10;
      this.f16000[5] = var7;
      Object var8 = null;
      this.f16000[4] = var8;
   }

   private void m78000() {
      Integer var5 = (Integer)this.f16000[5] - 1;
      this.f16000[5] = var5;
      Integer var6 = (Integer)this.f16000[6] - 1;
      this.f16000[6] = var6;
      if ((Boolean)this.f16000[7]) {
         this.m36000();
      }

      if ((Integer)this.f16000[5] == 0) {
         this.m42000();
      }

      if ((Integer)this.f16000[6] <= 0) {
         this.m16000();
      }
   }
}
