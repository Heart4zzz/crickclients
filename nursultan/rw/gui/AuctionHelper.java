package rw.gui;

import KDFzREm.NAN;
import KDFzREm.NCW;
import KDFzREm.NCz;
import KDFzREm.NNNNRZ;
import KDFzREm.NNNNin;
import KDFzREm.NNNwS;
import KDFzREm.NNYH;
import KDFzREm.NNuU;
import KDFzREm.NPh;
import KDFzREm.NQa;
import KDFzREm.NQo;
import KDFzREm.NYj;
import KDFzREm.NbL;
import KDFzREm.Ngj;
import KDFzREm.NkG;
import KDFzREm.XD;
import KDFzREm.cV;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;
import org.apache.commons.lang3.StringUtils;
import rw.GuiWidget;
import rw.api.AnnotationDefault;
import rw.api.Iface0642;
import rw.core.C0695;
import rw.core.C0876;
import rw.core.C0905;
import rw.core.C0907;
import rw.core.C0916;
import rw.core.C0988;
import rw.core.C0991;
import rw.core.C0998;
import rw.core.C1006;
import rw.core.C1193;
import rw.data.Rec0179;
import rw.data.Rec0229;
import rw.defs.Enum0055;
import rw.module.OlpnniIl;
import rw.setting.C0122;
import rw.setting.C0160;

@AnnotationDefault(
   L = "AuctionHelper",
   y = Enum0055.MISC,
   N = Enum0070.HELPER
)
public class AuctionHelper extends GuiWidget {
   private static short[] f1000;
   private static byte[] f2000;
   private static byte[] f3000;
   private static String[] f4000;
   private static String[] f5000;
   private static double[] f6000;
   private static long[] f7000;
   private static float[] f8000;
   private static String[] f9000;
   private static String[] f10000;
   private static short[] f11000;
   private static short[] f12000;
   public static Object[] f13000;
   private static short[] f14000;
   public Object[] f15000;
   private static String[] f16000;
   private static short[] f17000;
   private static short[] f18000;

   private static void m4000() {
      f10000 = new String[]{"profitable-color", "profitable-items-count", "open-auction-from-item", "show-item-price"};
      f16000 = new String[]{" Ценa", " Цена", "[^0-9]", "", "§a$ §fЗа штуку §a$###,###"};
      f4000 = new String[]{"[^\\p{L} \\-]", "", " (?i)xxx (?i)", ""};
      f5000 = new String[]{" (?i)xxx$", "", "^xxx (?i)", "", ", ", ", ", "[,\\s]"};
      f9000 = new String[]{"", "\\$\\s*.*?(\\d{1,3}(?:,\\d{3})*)", "▍ (?:Текущая цена|Цена): ([\\d ]+)¤", "поиск:", "аукционы", "аукцион", " п: ", "漢:"};
   }

   private static void m6000() {
      f8000 = new float[]{3.0F, 1.0F, 5.0F, 1.0F, 10.0F};
   }

   public AuctionHelper() {
      this.m14000();
      C0998 var5 = C0122.m6000(this, f10000[0], -11104513);
      this.f15000[0] = var5;
      C0988 var6 = C0122.m12000(this, f10000[1], f8000[0], f8000[1], f8000[2], f8000[3]);
      this.f15000[1] = var6;
      C1006 var7 = C0122.m14000(this, f10000[2], (PgUp)PgUp.f4000[0]);
      this.f15000[2] = var7;
      C0991 var8 = C0122.m26000(this, f10000[3], true);
      this.f15000[3] = var8;
      HashSet var9 = new HashSet();
      this.f15000[4] = var9;
      Comparator var10 = Comparator.comparingLong(var1 -> {
         long var2 = this.m78000(var1.i());
         int var4 = var1.i().c();
         return var4 == 0 ? Long.MAX_VALUE : Math.round((float)var2 / var4 / f8000[4]) * 10L;
      });
      this.f15000[5] = var10;
   }

   static {
      ntfClinit();
   }

   private static void m10000() {
      f2000 = new byte[]{16, 16, 5, 2};
      f3000 = new byte[]{5, 2, 3, 4, 7, 6, 2};
   }

   private static void m12000() {
      f13000 = new Object[]{null, null};
   }

   private static void m34000() {
      f6000 = new double[]{55.0, 200.0, 60.0, 2.0, 0.5};
   }

   private void m14000() {
      if (this.f15000 == null) {
         this.f15000 = new Object[7];
         Object[] var1 = this.f15000;
         var1[6] = false;
      }
   }

   private static void m44000() {
      f7000 = new long[]{45L, 0L, 1L, 1L, 0L, Long.MAX_VALUE, 10L};
   }

   private static void m16000() {
      f12000 = new short[]{0, 1, 0, 2, 3};
      f1000 = new short[]{4, 5, 6, 6, 6, 6, 6};
      f18000 = new short[]{6, 3, 4, 4, 0, 2, 0};
      f14000 = new short[]{4, 0, 3, 0};
      f11000 = new short[]{3, 4, 0, 4};
      f17000 = new short[]{3, 0, 4, 5, 1, 0, 1, 4};
   }

   private void m18000() {
      this.m14000();
      if ((NNYH)((NNuU)this.y[0]).v[3] != null) {
         String var1 = ((NNYH)((NNuU)this.y[0]).v[3]).method_25440().getString().toLowerCase();
         if (!this.m104000(var1)) {
            ((Set)this.f15000[4]).clear();
         } else {
            Stream var2 = this.m76000((NkG)((NNNwS)((NNuU)this.y[0]).T[4]).fields_07fa3311b0e9d3e9b883d09222919bf5a[3])
               .stream()
               .filter(var1x -> this.m62000(var1x.i()));
            this.m90000(var2);
         }
      }
   }

   private boolean m62000(NQo var1) {
      if (var1.N(NQa.vv)) {
         cV var2 = (cV)var1.a_(NNNNRZ.v, cV.L);
         if (var2.y().size() > 5) {
            return (boolean)0;
         }
      }

      String var7 = String.join(f5000[4], C1193.m40000(var1));

      for (Pattern var6 : (Pattern[])f13000[0]) {
         if (var6.matcher(var7).find()) {
            return (boolean)1;
         }
      }

      return (boolean)0;
   }

   @Override
   public void m26000() {
      this.m14000();
      Boolean var5 = false;
      this.f15000[6] = var5;
      super.m6000();
   }

   @Iface0642
   public void m68000(C0907 var1) {
      this.m14000();
      if ((Boolean)((C0991)this.f15000[3]).i()) {
         NQo var2 = var1.m14000();
         if (var2.c() > 1) {
            List var3 = var1.m24000();

            for (int var4 = 0; var4 < var3.size(); var4++) {
               NAN var5 = (NAN)var3.get(var4);
               String var6 = var5.getString();
               if (var6.contains(f16000[0]) || var6.contains(f16000[1])) {
                  String var7 = var6.replaceAll(f16000[2], f16000[3]);
                  DecimalFormat var8 = new DecimalFormat(f16000[4]);
                  var8.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.US));
                  double var9 = (double)Long.parseLong(var7) / var2.c();
                  String var11 = var8.format(var9);
                  var3.add(var4 + 1, NAN.y(var11));
               }
            }

            var1.m18000(var3);
         }
      }
   }

   @Iface0642
   public void m70000(C0905 var1) {
      this.m14000();
      Boolean var6 = false;
      this.f15000[6] = var6;
   }

   private List<NYj> m76000(NkG var1) {
      return var1.T.stream().limit(45L).filter(var0 -> {
         NQo var1x = var0.i();
         return (boolean)(var0.R() && !var1x.R() ? 1 : 0);
      }).toList();
   }

   private long m78000(NQo var1) {
      String var2 = String.join(f5000[5], C1193.m40000(var1));

      for (Pattern var6 : (Pattern[])f13000[0]) {
         Matcher var7 = var6.matcher(var2);
         if (var7.find()) {
            String var8 = var7.group(1).replaceAll(f5000[6], f9000[0]);
            return Long.parseLong(var8);
         }
      }

      return 0L;
   }

   @Iface0642
   public void m80000(Rec0179 var1) {
      this.m14000();
      Object var2 = var1.m4000();
      switch (var2) {
         case NCW var5:
            if (var5.N() != 0) {
               Boolean var11 = true;
               this.f15000[6] = var11;
            }
            break;
         case NCz var6:
            if (var6.N() != 0) {
               Boolean var12 = true;
               this.f15000[6] = var12;
            }
            break;
         default:
      }
   }

   @Iface0642(
      u = true
   )
   public void m82000(OlpnniIl var1) {
      this.m14000();
      if (((C1006)this.f15000[2]).m4000(var1)) {
         for (NbL var5 : NbL.values()) {
            NQo var6 = ((NNNwS)((NNuU)this.y[0]).T[4]).method_5998(var5);
            if (var6.B() != NQa.N) {
               String var7 = NPh.N(var6.d().getString()).replaceAll(f4000[0], f4000[1]).trim();
               var7 = var7.replaceAll(f4000[2], f4000[3]).replaceAll(f5000[0], f5000[1]).replaceAll(f5000[2], f5000[3]);
               var7 = StringUtils.normalizeSpace(var7);
               C0160.m70000("/ah search " + var7);
               break;
            }
         }
      }
   }

   @Iface0642
   public void m86000(C0916 var1) {
      this.m14000();
      if ((Boolean)this.f15000[6]) {
         this.m18000();
         Boolean var6 = false;
         this.f15000[6] = var6;
      }
   }

   private void m90000(Stream<NYj> var1) {
      this.m14000();
      List var2 = var1.toList();
      ((Set)this.f15000[4]).clear();
      var2.stream()
         .filter(NYj::R)
         .sorted(
            Comparator.<NYj>comparingLong(
                  var0 -> ((NNNNin)var0.i().y().a_(NNNNRZ.P, NNNNin.N)).N().stream().anyMatch(var0x -> var0x.N(var0xx -> (boolean)(var0xx == Ngj.B ? 1 : 0)))
                     ? 1L
                     : 0L
               )
               .thenComparing((Comparator<? super NYj>)this.f15000[5])
         )
         .limit(((Float)((C0988)this.f15000[1]).i()).intValue())
         .forEach(var1x -> {
            this.m14000();
            ((Set)this.f15000[4]).add(new Rec0229(var1x, 1L));
         });
   }

   @Iface0642
   public void m92000(C0695 var1) {
      this.m14000();
      String var2 = var1.m22000().toLowerCase();
      if (!this.m104000(var2)) {
         ((Set)this.f15000[4]).clear();
      } else {
         for (Rec0229 var4 : (Set)this.f15000[4]) {
            int var5 = (int)(f6000[0] + f6000[1] * Math.sin(System.currentTimeMillis() / f6000[2]) / f6000[3] + f6000[4]);
            NYj var6 = var4.m6000();
            var1.m16000().N(XD.NH, var6.i, var6.R, var6.i + 16, var6.R + 16, C0876.m70000((Integer)((C0998)this.f15000[0]).i(), var5));
         }
      }
   }

   private boolean m104000(String var1) {
      return Arrays.<String>stream((String[])f13000[1]).anyMatch(var1::contains);
   }
}
