package rw.setting;

import KDFzREm.NCW;
import KDFzREm.NNNZZ;
import KDFzREm.NNNwS;
import KDFzREm.NNYH;
import KDFzREm.NNnq;
import KDFzREm.NNuU;
import KDFzREm.NQo;
import KDFzREm.NYj;
import KDFzREm.NkG;
import KDFzREm.Nkq;
import com.google.gson.JsonObject;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import rw.core.Base1148;
import rw.core.C0703;
import rw.core.C0719;
import rw.core.C0863;
import rw.core.C0954;
import rw.core.C1013;
import rw.core.C1193;
import rw.data.Rec0179;
import rw.data.Rec0192;
import rw.data.Rec0213;
import rw.gui.AuctionHelper;
import rw.gui.AutoBuy;
import rw.net.AutoBuyX;

public class C0087 extends Base1148<AutoBuy> {
   private static short[] f1000;
   public static Object[] f2000;
   private static String[] f3000;
   private static short[] f4000;
   private static short[] f5000;
   private static short[] f6000;
   private static short[] f7000;
   public Object[] f8000;
   private static short[] f9000;
   private static short[] f10000;
   private static short[] f11000;
   private static short[] f12000;
   private static short[] f13000;
   public Object[] f14000;
   private static short[] f15000;
   private static short[] f16000;
   private static String[] f17000;
   private static short[] f18000;
   private static short[] f19000;

   private void m6000() {
      this.m30000();
      if ((String)this.f14000[2] != null) {
         C0160.m70000("/" + (String)this.f14000[2]);
      } else {
         C0160.m70000(f3000[3]);
      }
   }

   private boolean m16000() {
      this.m30000();
      if ((Integer)this.f14000[f5000[7]] <= 0) {
         return (boolean)0;
      } else {
         Integer var5 = (Integer)this.f14000[3] - 1;
         this.f14000[3] = var5;
         if ((Integer)this.f14000[3] == 0) {
            this.m6000();
         }

         return (boolean)1;
      }
   }

   public C0087(AutoBuyX var1, AutoBuy var2, String var3, boolean var4, Consumer<C1013> var5) {
      super(var2, var3, var4, var5);
      this.m30000();
      C0863 var10 = new C0863();
      this.f14000[0] = var10;
      Long var11 = -1L;
      this.f8000[1] = var11;
      this.f14000[1] = var1;
   }

   static {
      ntfClinit();
   }

   private void m18000() {
      this.m30000();
      if ((Boolean)this.f8000[4] && (Integer)this.f8000[3] > 0) {
         Boolean var5 = false;
         this.f8000[4] = var5;
         Boolean var6 = true;
         this.f8000[5] = var6;
         Integer var7 = 0;
         this.f8000[3] = var7;
      }
   }

   private boolean m22000(String var1) {
      return Arrays.<String>stream((String[])AuctionHelper.f13000[1]).noneMatch(var1::contains);
   }

   private static void m28000() {
      f3000 = new String[]{"ah", "busy", "resume", "/ah", "seller", "price", "hash", ", "};
      f17000 = new String[]{",", "", "\\$\\s*.*?(\\d{1,3}(?:,\\d{3})*).*?\\?\\s*.*?:\\s*([A-Za-z0-9_]{3,16})"};
   }

   private void m30000() {
      if (this.f14000 == null) {
         this.f14000 = new Object[4];
         Object[] var1 = this.f14000;
         var1[3] = 0;
      }

      if (this.f8000 == null) {
         this.f8000 = new Object[7];
         Object[] var2 = this.f8000;
         var2[0] = 0;
         var2[1] = 0L;
         var2[2] = 0L;
         var2[3] = 0;
         var2[4] = false;
         var2[5] = false;
         var2[6] = false;
      }
   }

   private void m32000() {
      this.m30000();
      Boolean var5 = false;
      this.f8000[5] = var5;
      Boolean var6 = false;
      this.f8000[f5000[0]] = var6;
      Integer var7 = 0;
      this.f8000[f5000[1]] = var7;
   }

   public void m46000(Object var1) {
      this.m30000();
      if (((AutoBuyX)this.f14000[1]).m58000().get()) {
         switch (var1) {
            case Rec0179 var4:
               this.m60000(var4);
               break;
            case C0719 var5:
               this.m70000(var5);
               break;
            case C0703 var6:
               this.m62000(var6);
               break;
            case Rec0213 var7:
               this.m56000(var7);
               break;
            case null:
            default:
         }
      }
   }

   private void m50000(NQo var1, String var2, long var3) {
      this.m30000();
      if (!(Boolean)this.f8000[5]) {
         JsonObject var5 = new JsonObject();
         var5.addProperty(f3000[4], var2);
         var5.addProperty(f3000[5], var3);
         var5.addProperty(f3000[6], AutoBuy.m40000(var1, var3));
         ((AutoBuyX)this.f14000[1]).m62000(var5.toString());
         Integer var10 = 5;
         this.f8000[3] = var10;
         Boolean var11 = true;
         this.f8000[4] = var11;
         Long var12 = -1L;
         this.f8000[1] = var12;
      }
   }

   private void m56000(Rec0213 var1) {
      String var2 = var1.m4000();
      if (var2 != null && !var2.isEmpty()) {
         switch (var2) {
            case f3000[1]:
               this.m18000();
               break;
            case f3000[2]:
               this.m32000();
         }
      }
   }

   private void m60000(Rec0179 var1) {
      switch (var1.m4000()) {
         case NCW var4:
            this.m80000(var4);
            break;
         case NNnq var5:
            this.m64000(var5);
            break;
         case null:
         default:
      }
   }

   private void m62000(C0703 var1) {
      this.m30000();
      if (var1.m20000().startsWith(f3000[0])) {
         String var6 = var1.m20000();
         this.f14000[2] = var6;
      }
   }

   private void m64000(NNnq var1) {
      String var2 = var1.L().getString().toLowerCase();
      ((NNuU)this.N[f5000[6]]).execute(() -> {
         this.m30000();
         if (!this.m22000(var2)) {
            if ((Long)this.f8000[1] != -1L) {
               if (System.currentTimeMillis() - (Long)this.f8000[1] > 400L) {
                  Integer var6 = (Integer)this.f8000[0] + 1;
                  this.f8000[0] = var6;
               }

               Long var7 = -1L;
               this.f8000[1] = var7;
            }
         }
      });
   }

   public void m68000() {
      this.m30000();
      Boolean var5 = false;
      this.f8000[5] = var5;
   }

   private void m70000(C0719 var1) {
      this.m30000();
      if ((Boolean)this.f8000[6]) {
         ((NkG)((NNNwS)((NNuU)this.N[0]).T[4]).fields_07fa3311b0e9d3e9b883d09222919bf5a[3])
            .T
            .stream()
            .limit(45L)
            .<NQo>map(NYj::i)
            .filter(var0 -> (boolean)(!var0.R() ? 1 : 0))
            .map(var1x -> {
               this.m30000();
               Matcher var2x = ((Pattern)f2000[1]).matcher(String.join(f3000[7], C1193.m40000(var1x)));
               Optional var3x = var2x.find() ? Optional.of(var2x) : Optional.empty();
               if (var3x.isPresent()) {
                  Matcher var4x = (Matcher)var3x.get();
                  String var5 = var4x.group(2);
                  long var6 = Long.parseLong(var4x.group(1).replaceAll(f17000[0], f17000[1]));
                  if (this.m74000(var1x, var5, var6)) {
                     return new Rec0192(var1x, var5, var6);
                  }

                  if (((C0863)this.f14000[0]).m6000(var1x, var5, var6).isPresent()) {
                     return new Rec0192(var1x, var5, var6);
                  }
               }

               return null;
            })
            .filter(Objects::nonNull)
            .min(Comparator.comparingLong(Rec0192::m8000))
            .ifPresent(var1x -> this.m50000(var1x.m6000(), var1x.m2000(), var1x.m8000()));
         Boolean var9 = false;
         this.f8000[6] = var9;
      }

      if ((Integer)this.f8000[3] > 0) {
         Integer var10 = (Integer)this.f8000[3] - 1;
         this.f8000[3] = var10;
         if ((Integer)this.f8000[3] == 0 && (Boolean)this.f8000[4]) {
            Boolean var11 = false;
            this.f8000[4] = var11;
         }
      }

      if (!(Boolean)this.f8000[5]) {
         if (!this.m16000()) {
            if ((Integer)this.f8000[0] >= 5) {
               ((AutoBuy)this.N[1]).m14000();
               Integer var12 = C0954.m20000(11);
               this.f14000[3] = var12;
               Integer var13 = 0;
               this.f8000[0] = var13;
            } else if ((Integer)this.f8000[3] <= 0 && !((AutoBuyX)this.f14000[1]).m52000()) {
               NNYH var2 = (NNYH)((NNuU)this.N[0]).v[3];
               NkG var3 = (NkG)((NNNwS)((NNuU)this.N[0]).T[4]).fields_07fa3311b0e9d3e9b883d09222919bf5a[3];
               if (var2 != null && var3 != null) {
                  String var4 = var2.method_25440().getString().toLowerCase();
                  if (!this.m22000(var4)) {
                     if (System.currentTimeMillis() - (Long)this.f8000[2] > 500L) {
                        this.m86000(var3.b);
                        Long var14 = System.currentTimeMillis();
                        this.f8000[2] = var14;
                        if ((Long)this.f8000[1] == -1L) {
                           Long var15 = (Long)this.f8000[2];
                           this.f8000[1] = var15;
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private boolean m74000(NQo var1, String var2, long var3) {
      this.m30000();
      if (C1193.m32000(var1)) {
         for (NQo var6 : C1193.m18000(var1)) {
            if (((C0863)this.f14000[0]).m6000(var6, var2, var3).isPresent()) {
               return (boolean)1;
            }
         }
      }

      return (boolean)0;
   }

   private void m80000(NCW var1) {
      this.m30000();
      if (!(Boolean)this.f8000[f5000[2]]) {
         if ((Integer)this.f8000[f5000[3]] <= 0 && !((AutoBuyX)this.f14000[f5000[4]]).m52000()) {
            Boolean var6 = true;
            this.f8000[f5000[5]] = var6;
         }
      }
   }

   private static void m82000() {
      f13000 = new short[]{0, 1};
      f18000 = new short[]{1, 1};
      f11000 = new short[]{2, 6, 0, 4, 3, 6};
      f19000 = new short[]{3, 3, 3};
      f9000 = new short[]{3, 4};
      f16000 = new short[]{4, 5, 0, 1};
      f1000 = new short[]{3, 0, 3, 1, 0};
      f15000 = new short[]{3, 0, 4, 3, 2, 2, 1, 2};
      f6000 = new short[]{1, 4, 3, 4, 5, 3, 5};
      f5000 = new short[]{4, 3, 5, 3, 1, 6, 0, 3};
      f7000 = new short[]{3, 3, 3, 2, 2, 0, 5, 1};
      f10000 = new short[]{3, 4, 1, 5, 0, 2, 0};
      f4000 = new short[]{4, 1, 1, 1, 0, 0};
      f12000 = new short[]{1, 1, 0};
   }

   private void m86000(int var1) {
      ((NNNZZ)((NNuU)this.N[0]).T[2]).N(var1, 49, 0, Nkq.field_7790, (NNNwS)((NNuU)this.N[0]).T[4]);
   }

   private static void m90000() {
      f2000 = new Object[]{49, null};
   }
}
