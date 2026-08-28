package rw.gui;

import KDFzREm.NAJ;
import KDFzREm.NNNZZ;
import KDFzREm.NNNwS;
import KDFzREm.NNYH;
import KDFzREm.NNqv;
import KDFzREm.NNuU;
import KDFzREm.NYj;
import KDFzREm.NkQ;
import KDFzREm.Nkq;
import java.util.stream.IntStream;
import org.apache.commons.lang3.RandomUtils;
import rw.GuiWidget;
import rw.api.AnnotationDefault;
import rw.api.Iface0642;
import rw.core.Base1084;
import rw.core.C0151;
import rw.core.C0704;
import rw.core.C0956;
import rw.core.C0979;
import rw.core.C0991;
import rw.core.C1000;
import rw.core.C1004;
import rw.core.C1082;
import rw.core.C1083;
import rw.core.IljlItp;
import rw.core.IlkOkiqsp;
import rw.defs.Enum0055;
import rw.defs.Enum0081;
import rw.setting.C0122;

@AnnotationDefault(
   L = "ChestStealer",
   y = Enum0055.PLAYER,
   N = Enum0070.BASE
)
public class ChestStealer extends GuiWidget {
   private static String[] f1000;
   private static float[] f2000;
   public Object[] f3000;
   public Object[] f4000;

   private void m4000() {
      this.m10000();
      Integer var5 = RandomUtils.insecure().randomInt((int)((C0979)((C1004)this.f3000[6]).i()).m32000(), (int)((C0979)((C1004)this.f3000[6]).i()).m2000());
      this.f4000[2] = var5;
   }

   public ChestStealer() {
      this.m10000();
      C1082 var5 = new C1082(f1000[0], true);
      this.f3000[0] = var5;
      IlkOkiqsp var6 = new IlkOkiqsp(f1000[1]);
      this.f3000[1] = var6;
      C1083 var7 = new C1083(f1000[2]);
      this.f3000[2] = var7;
      C1000 var8 = C0122.m18000(this, f1000[3], (C1082)this.f3000[0], (IlkOkiqsp)this.f3000[1], (C1083)this.f3000[2]);
      this.f3000[3] = var8;
      C0991 var9 = C0122.m26000(this, f1000[4], true);
      this.f3000[4] = var9;
      C0991 var10 = C0122.m26000(this, f1000[5], false);
      this.f3000[5] = var10;
      C1004 var11 = C0122.m10000(this, f1000[6], new C0979(f2000[0], f2000[1]), new C0979(f2000[2], f2000[3]), f2000[4]);
      this.f3000[6] = var11;
      C0956 var12 = new C0956();
      this.f4000[0] = var12;
   }

   static {
      ntfClinit();
   }

   private void m8000() {
      this.m10000();
      Object var5 = null;
      this.f4000[1] = var5;
      Integer var6 = 0;
      this.f4000[2] = var6;
      Integer var7 = 0;
      this.f4000[3] = var7;
   }

   private void m10000() {
      if (this.f3000 == null) {
         this.f3000 = new Object[7];
         Object[] var1 = this.f3000;
      }

      if (this.f4000 == null) {
         this.f4000 = new Object[4];
         Object[] var2 = this.f4000;
         var2[2] = 0;
         var2[3] = 0;
      }
   }

   private static void m12000() {
      f1000 = new String[]{"normal", "reverse", "shuffle", "loot-type", "auto-close", "ignore-server-menus", "delay", "container."};
   }

   private static void m12000() {
      f2000 = new float[]{0.0F, 600.0F, 100.0F, 300.0F, 10.0F};
   }

   public void m20000() {
      this.m8000();
      super.m6000();
   }

   private boolean m16000(NNqv var1) {
      return (boolean)(var1.method_25440().method_10851() instanceof NAJ var2 && var2.y().startsWith(f1000[7]) ? 0 : 1);
   }

   private void m18000(NkQ var1) {
      this.m10000();
      int var2 = var1.E().method_5439();
      if ((int[])this.f4000[1] == null || ((int[])this.f4000[1]).length != var2) {
         this.m32000(var2);
      }

      for (int var6 : (int[])this.f4000[1]) {
         NYj var7 = var1.L(var6);
         if (var7.R() && ((C0956)this.f4000[0]).m20000(((Integer)this.f4000[2]).intValue())) {
            this.m28000(var1, var7);
            this.m4000();
            this.m32000(var2);
            ((C0956)this.f4000[0]).m18000();
            break;
         }
      }
   }

   @Iface0642
   public void m20000(C0151 var1) {
      this.m10000();
      Integer var6 = 0;
      this.f4000[3] = var6;
   }

   private boolean m22000(int var1, NkQ var2) {
      this.m10000();
      return (boolean)(IntStream.range(0, var1).noneMatch(var1x -> var2.L(var1x).R()) && this.f4000[3] > 40 && ((C0956)this.f4000[0]).m20000(100L) ? 1 : 0);
   }

   @Iface0642(
      y = Enum0081.BEFORE_ALL
   )
   public void m26000(C0704 var1) {
      this.m10000();
      NNYH var3 = (NNYH)((NNuU)this.y[0]).v[3];
      if (var3 instanceof NNqv var2) {
         if ((Boolean)((C0991)this.f3000[5]).i() && this.m16000(var2)) {
            if ((int[])this.f4000[1] != null) {
               this.m8000();
            }
         } else {
            NkQ var9 = (NkQ)var2.E();
            this.m18000(var9);
            if (!(Boolean)((C0991)this.f3000[4]).i() || !IljlItp.m46000() && !this.m22000(var9.E().method_5439(), var9)) {
               Integer var8 = (Integer)this.f4000[3] + 1;
               this.f4000[3] = var8;
            } else {
               ((NNNwS)((NNuU)this.y[0]).T[4]).method_7346();
               this.m8000();
            }
         }
      } else {
         if ((int[])this.f4000[1] != null) {
            this.m8000();
         }
      }
   }

   private void m28000(NkQ var1, NYj var2) {
      ((NNNZZ)((NNuU)this.y[0]).T[2]).N(var1.b, var2.u, 1, Nkq.field_7794, (NNNwS)((NNuU)this.y[0]).T[4]);
   }

   private void m32000(int var1) {
      this.m10000();
      int[] var6 = ((Base1084)((C1000)this.f3000[3]).i()).m2000(var1);
      this.f4000[1] = var6;
   }
}
