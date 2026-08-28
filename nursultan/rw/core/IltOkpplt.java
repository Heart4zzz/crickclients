package rw.core;

import KDFzREm.NHe;
import KDFzREm.NNNNRZ;
import KDFzREm.NNNNuS;
import KDFzREm.NNNNuc;
import KDFzREm.NNNwS;
import KDFzREm.NNcO;
import KDFzREm.NNuU;
import KDFzREm.NQa;
import KDFzREm.NQo;
import KDFzREm.Nbx;
import KDFzREm.Njt;
import KDFzREm.Njv;
import KDFzREm.Nkq;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import rw.NursultanClient;

public class IltOkpplt {
   public static Object[] f1000;
   private static boolean[] f2000;
   private static byte[] f3000;
   private static boolean[] f4000;
   private static byte[] f5000;
   private static byte[] f6000;
   private static boolean[] f7000;
   private static boolean[] f8000;
   private static boolean[] f9000;
   private static byte[] f10000;
   private static double[] f11000;
   public Object[] f12000;
   private static boolean[] f13000;

   public void m2000() {
      if (this.m14000()) {
         this.m56000((Integer)this.f12000[1]);
      }

      this.m22000();
   }

   private boolean m6000(NQo var1) {
      return (boolean)(var1.B() != NQa.la && var1.B() != NQa.Gw ? 0 : 1);
   }

   public void m8000() {
      if (!IljlItp.m36000((Integer)this.f12000[1])) {
         this.m10000();
      }
   }

   private void m10000() {
      this.m56000((Integer)this.f12000[1]);
      this.m22000();
   }

   private static void m12000() {
      f6000 = new byte[]{-1, 5, 2, 5};
      f3000 = new byte[]{-1, 40, -1, -1, 6};
      f5000 = new byte[]{3, 4, 5, 4};
      f10000 = new byte[]{40, 5, 2, 3, 2};
   }

   public IltOkpplt() {
      this.m42000();
      NNuU var5 = NNuU.Nq();
      this.f12000[0] = var5;
      Integer var6 = -1;
      this.f12000[1] = var6;
      NQo var7 = NQo.E;
      this.f12000[2] = var7;
   }

   static {
      ntfClinit();
   }

   private boolean m14000() {
      return (boolean)((NNNwS)((NNuU)this.f12000[0]).T[4] == null
            || IljlItp.m36000((Integer)this.f12000[1])
            || !this.m32000() && !NursultanClient.m60000().m16000()
         ? 0
         : 1);
   }

   public void m20000() {
      if (!IljlItp.m36000((Integer)this.f12000[1])) {
         Integer var5 = (Integer)this.f12000[3] + 1;
         this.f12000[3] = var5;
         int var10002 = (Integer)this.f12000[5] - f8000[0];
         Integer var6 = var10002;
         this.f12000[5] = var6;
         if (var10002 <= 0) {
            this.m10000();
         }
      }
   }

   private void m22000() {
      Integer var5 = -1;
      this.f12000[1] = var5;
      NQo var6 = NQo.E;
      this.f12000[2] = var6;
      Integer var7 = 0;
      this.f12000[3] = var7;
      Integer var8 = 0;
      this.f12000[5] = var8;
   }

   private static void m24000() {
      f11000 = new double[]{0.0, 0.0, 1.0, 1.0};
   }

   private static void m26000() {
      f2000 = new boolean[]{false, true, true, false, true};
      f8000 = new boolean[]{true, true, false};
      f9000 = new boolean[]{true, false, false, false, false, false, true, false};
      f4000 = new boolean[]{true, false, true, false, true, false, true};
      f7000 = new boolean[]{false, true};
      f13000 = new boolean[]{false, false, false, false, false, true, true};
   }

   private int m28000() {
      Njt var1 = ((NNNwS)((NNuU)this.f12000[0]).T[4]).method_5996(NNcO.u);
      if (var1 == null) {
         return -1;
      } else {
         List var2 = this.m50000(((NNNwS)((NNuU)this.f12000[0]).T[4]).method_6079());
         Set var3 = var2.stream().map(Njv::N).collect(Collectors.toSet());
         List var4 = var1.L().stream().filter(var1x -> (boolean)(!var3.contains(var1x.N()) ? 1 : 0)).toList();
         double var5 = var1.y();
         double var7 = this.m44000(var5, var4, var2);
         int var9 = -1;
         NHe var10 = ((NNNwS)((NNuU)this.f12000[0]).T[4]).method_31548().u();
         int var11 = ((NNNwS)((NNuU)this.f12000[0]).T[4]).method_31548().N();

         for (int var12 = 0; var12 < var10.size(); var12++) {
            if (var12 != var11) {
               NQo var13 = (NQo)var10.get(var12);
               if (!var13.R() && this.m6000(var13)) {
                  List var14 = this.m50000(var13);
                  if (!var14.isEmpty()) {
                     double var15 = this.m44000(var5, var4, var14);
                     if (var15 > var7) {
                        var7 = var15;
                        var9 = var12;
                     }
                  }
               }
            }
         }

         return var9;
      }
   }

   public boolean m32000() {
      return !IljlItp.m36000((Integer)this.f12000[1])
            && (NNNwS)((NNuU)this.f12000[0]).T[4] != null
            && !((NQo)this.f12000[2]).R()
            && ((NNNwS)((NNuU)this.f12000[0]).T[4]).method_6079().N(((NQo)this.f12000[2]).B())
         ? f8000[1]
         : f8000[2];
   }

   private boolean m34000(NQo var1) {
      return (boolean)(var1.B() != NQa.la && !var1.L(NNNNRZ.e) ? 0 : 1);
   }

   public boolean m38000() {
      return (boolean)(!IljlItp.m36000((Integer)this.f12000[1]) && this.f12000[3] < this.f12000[4] ? 0 : 1);
   }

   private void m42000() {
      if (this.f12000 == null) {
         this.f12000 = new Object[6];
         Object[] var1 = this.f12000;
         var1[1] = 0;
         var1[3] = 0;
         var1[4] = 0;
         var1[5] = 0;
      }
   }

   private double m44000(double var1, List<Njv> var3, List<Njv> var4) {
      Set var5 = var4.stream().map(Njv::N).collect(Collectors.toSet());
      double var6 = f11000[0];
      double var8 = f11000[1];
      double var10 = f11000[2];

      for (Njv var13 : Stream.concat(var3.stream().filter(var1x -> (boolean)(!var5.contains(var1x.N()) ? 1 : 0)), var4.stream()).toList()) {
         switch (((int[])C0772.f3000[0])[var13.L().ordinal()]) {
            case 1:
               var6 += var13.y();
               break;
            case 2:
               var8 += var13.y();
               break;
            case 3:
               var10 *= f11000[3] + var13.y();
         }
      }

      double var14 = var1 + var6;
      return (var14 + var14 * var8) * var10;
   }

   public void m48000() {
      if (!IljlItp.m36000((Integer)this.f12000[1]) && !NursultanClient.m60000().m16000()) {
         if (!this.m32000()) {
            this.m22000();
         }
      }
   }

   private List<Njv> m50000(NQo var1) {
      return ((NNNNuc)var1.a_(NNNNRZ.b, NNNNuc.N))
         .y()
         .stream()
         .filter(var0 -> (boolean)(var0.N() == NNcO.u && var0.L().y(Nbx.field_6171) ? 1 : 0))
         .<Njv>map(NNNNuS::y)
         .toList();
   }

   private void m56000(int var1) {
      NursultanClient.m60000().m38000(0, IljlItp.m4000(var1), 40, Nkq.field_7791).m24000();
   }

   private static void m58000() {
      f1000 = new Object[]{40, 5, 1, 2};
   }

   public void m62000() {
      if (!IljlItp.m36000((Integer)this.f12000[1])) {
         Integer var6 = 5;
         this.f12000[5] = var6;
      } else if (!this.m34000(((NNNwS)((NNuU)this.f12000[0]).T[4]).method_6079())) {
         int var1 = this.m28000();
         if (!IljlItp.m36000(var1)) {
            NQo var7 = (NQo)((NNNwS)((NNuU)this.f12000[0]).T[4]).method_31548().u().get(var1);
            this.f12000[2] = var7;
            this.m56000(var1);
            Integer var8 = var1;
            this.f12000[1] = var8;
            Integer var9 = 0;
            this.f12000[3] = var9;
            Integer var10 = NursultanClient.m60000().m16000() ? 2 : 1;
            this.f12000[4] = var10;
            Integer var11 = 5;
            this.f12000[5] = var11;
         }
      }
   }
}
