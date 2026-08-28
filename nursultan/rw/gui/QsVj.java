package rw.gui;

import KDFzREm.Il;
import KDFzREm.NAC;
import KDFzREm.NCA;
import KDFzREm.NCV;
import KDFzREm.NCb;
import KDFzREm.NCq;
import KDFzREm.NNNDd;
import KDFzREm.NNNHB;
import KDFzREm.NNNJL;
import KDFzREm.NNNNR;
import KDFzREm.NNNNW;
import KDFzREm.NNNQQ;
import KDFzREm.NNNZg;
import KDFzREm.NNNwS;
import KDFzREm.NNNwd;
import KDFzREm.NNNwl;
import KDFzREm.NNuU;
import KDFzREm.NSH;
import KDFzREm.NSJ;
import KDFzREm.NSS;
import KDFzREm.NSd;
import KDFzREm.NXi;
import KDFzREm.NbK;
import KDFzREm.NfC;
import KDFzREm.Nfm;
import KDFzREm.Nfy;
import KDFzREm.NjL;
import KDFzREm.NxB;
import KDFzREm.NxP;
import KDFzREm.Nxb;
import KDFzREm.Nxt;
import KDFzREm.Nxu;
import KDFzREm.Nxy;
import java.util.LinkedList;
import java.util.function.Supplier;
import rw.GuiWidget;
import rw.api.AnnotationDefault;
import rw.api.Iface0642;
import rw.core.C0138;
import rw.core.C0151;
import rw.core.C0761;
import rw.core.C0916;
import rw.core.C0988;
import rw.core.C0998;
import rw.core.C1140;
import rw.core.OltlIpjm;
import rw.data.Rec0189;
import rw.defs.Enum0055;
import rw.defs.Enum0081;
import rw.module.AttackAura_x;
import rw.setting.C0122;

@AnnotationDefault(
   L = "Backtrack",
   y = Enum0055.COMBAT,
   N = Enum0070.TOOLS
)
public class QsVj extends GuiWidget {
   private static short[] f1000;
   private static short[] f2000;
   private static short[] f3000;
   private static float[] f4000;
   private static short[] f5000;
   private static short[] f6000;
   private static String[] f7000;
   private static short[] f8000;
   public Object[] f9000;
   private static short[] f10000;
   private static short[] f11000;
   private static short[] f12000;
   private static short[] f13000;
   private static short[] f14000;
   private static short[] f15000;
   private static short[] f16000;
   private static double[] f17000;
   private static short[] f18000;
   private static float[] f19000;
   public Object[] f20000;
   private static short[] f21000;
   private static short[] f22000;
   private static short[] f23000;
   private static short[] f24000;
   private static short[] f25000;
   private static short[] f26000;
   private static short[] f27000;
   public static Object[] f28000;
   private static short[] f29000;
   public Object[] f30000;
   private static short[] f31000;

   private void m4000(NAC<?> var1) {
      this.m20000();
      if (var1 instanceof Il var2 && var2.N() == (Integer)this.f9000[0]) {
         NXi var9 = var2.y().N();
         this.f9000[5] = var9;
         Float var10 = var2.y().L();
         this.f9000[7] = var10;
         Float var11 = var2.y().u();
         this.f9000[6] = var11;
      } else {
         if (var1 instanceof NSJ var16) {
            NbK var4 = var16.N((NNNZg)((NNuU)this.y[0]).T[3]);
            if (var4 instanceof NbK && var4.method_5628() == (Integer)this.f9000[0]) {
               Float var12 = var16.N();
               this.f9000[7] = var12;
               return;
            }
         }

         if (var1 instanceof NCA var17) {
            NbK var18 = var17.N((NNNZg)((NNuU)this.y[0]).T[3]);
            if (var18 instanceof NbK && var18.method_5628() == (Integer)this.f9000[0]) {
               if (var17.B()) {
                  Float var13 = var17.u();
                  this.f9000[7] = var13;
                  Float var14 = var17.M();
                  this.f9000[6] = var14;
               }

               if (var17.Z()) {
                  NXi var19 = (NXi)this.f9000[5] != null ? (NXi)this.f9000[5] : var18.method_43389().N();
                  NXi var15 = var19.y(var17.N() / f17000[0], var17.y() / f17000[1], var17.L() / f17000[2]);
                  this.f9000[5] = var15;
               }

               return;
            }
         }
      }
   }

   private boolean m8000() {
      this.m20000();
      if ((NXi)this.f9000[5] != null) {
         NbK var2 = ((NNNZg)((NNuU)this.y[0]).T[3]).method_8469((Integer)this.f9000[0]);
         if (var2 instanceof NbK) {
            NXi var3 = ((NNNwS)((NNuU)this.y[0]).T[4]).method_73189();
            return (boolean)(((NXi)this.f9000[5]).M(var3) < var2.method_73189().M(var3) ? 1 : 0);
         }
      }

      return (boolean)0;
   }

   public QsVj() {
      this.m20000();
      C0988 var5 = C0122.m12000(this, f7000[0], f19000[0], f19000[1], f19000[2], f19000[3]);
      this.f20000[0] = var5;
      C0988 var6 = C0122.m12000(this, f7000[1], f19000[4], f19000[5], f19000[6], f4000[0]).m34000((Supplier<String>)OltlIpjm.f2000[3]);
      this.f20000[1] = var6;
      C0988 var7 = C0122.m12000(this, f7000[2], f4000[1], f4000[2], f4000[3], f4000[4]).m34000((Supplier<String>)OltlIpjm.f2000[3]);
      this.f20000[2] = var7;
      C0998 var8 = C0122.m6000(this, f7000[3], -1258337204);
      this.f30000[0] = var8;
      LinkedList var9 = new LinkedList();
      this.f30000[1] = var9;
      C0761 var10 = new C0761();
      this.f30000[2] = var10;
      Integer var11 = -1;
      this.f9000[0] = var11;
   }

   static {
      ntfClinit();
   }

   private boolean m16000(NAC<?> var1) {
      return (boolean)(!(var1 instanceof NNNwd)
            && !(var1 instanceof NNNwl)
            && !(var1 instanceof NNNJL)
            && !(var1 instanceof NNNNR)
            && !(var1 instanceof NNNQQ)
            && !(var1 instanceof NfC)
            && !(var1 instanceof Nxb)
            && !(var1 instanceof NxP)
            && !(var1 instanceof Nxt)
            && !(var1 instanceof NCV)
            && !(var1 instanceof NCq)
            && !(var1 instanceof Nfm)
            && !(var1 instanceof NNNHB)
            && !(var1 instanceof Nxy)
            && !(var1 instanceof NNNNW)
            && !(var1 instanceof Nxu)
            && !(var1 instanceof NxB)
            && !(var1 instanceof NNNDd)
            && !(var1 instanceof NSH)
            && !(var1 instanceof NCb)
            && !(var1 instanceof NSd)
         ? 0
         : 1);
   }

   private static void m6000() {
      f7000 = new String[]{"distance", "delay", "hold-after-attack", "color"};
   }

   private void m8000() {
      this.m20000();
      if ((NNNZg)((NNuU)this.y[0]).T[3] != null
         && ((NNNZg)((NNuU)this.y[0]).T[3]).method_8469((Integer)this.f9000[0]) instanceof NjL var1
         && var1.method_5805()) {
         NXi var7 = var1.method_43389().N();
         this.f9000[5] = var7;
         Float var8 = var1.method_36455();
         this.f9000[6] = var8;
         Float var9 = (Float)var1.fields_4212a028292fd3c078969e3ee4c71d9e8[2];
         this.f9000[7] = var9;
         ((C0761)this.f30000[2]).m48000(var1, (NXi)this.f9000[5]);
      }
   }

   private boolean m18000() {
      this.m20000();
      synchronized ((LinkedList)this.f30000[1]) {
         return (boolean)(!((LinkedList)this.f30000[1]).isEmpty() ? 1 : 0);
      }
   }

   private void m20000() {
      if (this.f20000 == null) {
         this.f20000 = new Object[3];
         Object[] var1 = this.f20000;
      }

      if (this.f30000 == null) {
         this.f30000 = new Object[3];
         Object[] var2 = this.f30000;
      }

      if (this.f9000 == null) {
         this.f9000 = new Object[8];
         Object[] var3 = this.f9000;
         var3[0] = 0;
         var3[1] = 0;
         var3[2] = 0;
         var3[3] = false;
         var3[4] = false;
         var3[6] = f4000[6];
         var3[7] = f4000[7];
      }
   }

   private boolean m22000() {
      this.m20000();
      if ((NNNZg)((NNuU)this.y[0]).T[3] != null && (NNNwS)((NNuU)this.y[0]).T[4] != null && (Integer)this.f9000[0] != -1 && (NXi)this.f9000[5] != null) {
         if (((NNNZg)((NNuU)this.y[0]).T[3]).method_8469((Integer)this.f9000[0]) instanceof NjL var1 && var1.method_5805()) {
            return (boolean)(((NXi)this.f9000[5]).R(((NNNwS)((NNuU)this.y[0]).T[4]).method_73189()) <= ((Float)((C0988)this.f20000[0]).i()).floatValue()
               ? 1
               : 0);
         } else {
            return (boolean)0;
         }
      } else {
         return (boolean)0;
      }
   }

   private static void m24000() {
      f24000 = new short[]{0, 3, 1, 3, 2};
      f12000 = new short[]{0, 1, 2, 0, 0};
      f22000 = new short[]{1, 2};
      f27000 = new short[]{3, 4, 5, 2, 2, 2, 0};
      f15000 = new short[]{0, 5};
      f21000 = new short[]{5, 6, 2, 7, 4, 2};
      f23000 = new short[]{0, 3, 0};
      f8000 = new short[]{4, 0, 1, 3, 0, 4, 0, 4};
      f31000 = new short[]{2, 2, 1, 1, 4, 4};
      f5000 = new short[]{0, 0, 0, 3, 0, 3, 0, 5};
      f14000 = new short[]{6, 2, 7, 2, 5, 2, 0};
      f6000 = new short[]{1, 1, 2, 5, 6, 7, 1};
      f1000 = new short[]{1, 1, 2, 2, 2, 0, 5};
      f29000 = new short[]{3, 4, 2, 3, 3, 1, 4, 2};
      f2000 = new short[]{1, 4, 0, 1, 2, 3};
      f13000 = new short[]{4, 5, 2, 1, 1};
      f3000 = new short[]{0, 3, 0, 4, 0, 5, 0, 3};
      f25000 = new short[]{0, 5, 0, 4, 0, 5, 0};
      f16000 = new short[]{3, 0, 0, 4, 5, 0, 5, 7};
      f11000 = new short[]{6, 0, 3, 0, 7};
      f26000 = new short[]{0, 3, 0};
      f18000 = new short[]{7, 6, 5};
      f10000 = new short[]{5, 5, 0, 0, 0, 1, 1, 1};
   }

   private static void m26000() {
      f17000 = new double[]{4096.0, 4096.0, 4096.0, 4096.0};
   }

   private static void m10000() {
      f19000 = new float[]{4.0F, 3.0F, 10.0F, 0.1F, 4.0F, 1.0F, 20.0F};
      f4000 = new float[]{1.0F, 10.0F, 0.0F, 20.0F, 1.0F, 0.0F, 0.0F, 0.0F};
   }

   private boolean m28000(NAC<?> var1) {
      if (!(var1 instanceof NCb) && !(var1 instanceof NSd)) {
         return (boolean)(var1 instanceof Nxy var2 && var2.N() <= f4000[5] ? 1 : 0);
      } else {
         return (boolean)1;
      }
   }

   public void m16000() {
      this.m20000();
      Integer var5 = -1;
      this.f9000[0] = var5;
      Integer var6 = 0;
      this.f9000[1] = var6;
      Integer var7 = 0;
      this.f9000[2] = var7;
      Boolean var8 = false;
      this.f9000[3] = var8;
      Boolean var9 = false;
      this.f9000[4] = var9;
      Object var10 = null;
      this.f9000[5] = var10;
      ((C0761)this.f30000[2]).m44000();
      this.m32000((boolean)1);
      super.m6000();
   }

   private void m32000(boolean var1) {
      ((NNuU)this.y[0]).execute(() -> {
         this.m20000();
         if (((NNuU)this.y[0]).NE() != null) {
            synchronized ((LinkedList)this.f30000[1]) {
               long var3 = System.currentTimeMillis();
               long var5 = ((Float)((C0988)this.f20000[1]).i()).longValue() * 50L;
               ((LinkedList)this.f30000[1]).removeIf(var6 -> {
                  if (!var1 && var3 - var6.m6000() < var5) {
                     return (boolean)0;
                  } else {
                     try {
                        this.m34000(var6.m4000());
                     } catch (Exception var8) {
                     }

                     return (boolean)1;
                  }
               });
            }
         }
      });
   }

   private void m34000(NAC<?> var1) {
      var1.method_65081(((NNuU)this.y[0]).NE());
   }

   @Iface0642
   public void m36000(AttackAura_x var1) {
      this.m20000();
      if (var1.m2000() instanceof NjL var2) {
         if (!C1140.m32000().test(var2)) {
            Integer var8 = ((Float)((C0988)this.f20000[2]).i()).intValue();
            this.f9000[2] = var8;
            if (var2.method_5628() != (Integer)this.f9000[0]) {
               Integer var9 = var2.method_5628();
               this.f9000[0] = var9;
               if ((NXi)this.f9000[5] == null) {
                  NXi var10 = var2.method_43389().N();
                  this.f9000[f21000[0]] = var10;
                  Float var11 = var2.method_36455();
                  this.f9000[f21000[1]] = var11;
                  Float var12 = (Float)var2.fields_4212a028292fd3c078969e3ee4c71d9e8[f21000[2]];
                  this.f9000[f21000[3]] = var12;
                  Boolean var13 = false;
                  this.f9000[f21000[4]] = var13;
                  ((C0761)this.f30000[f21000[5]]).m44000();
               }
            }
         }
      }
   }

   @Iface0642
   public void m38000(C0151 var1) {
      this.m20000();
      Integer var8 = -1;
      this.f9000[0] = var8;
      Integer var9 = 0;
      this.f9000[1] = var9;
      Integer var10 = 0;
      this.f9000[2] = var10;
      Boolean var11 = false;
      this.f9000[3] = var11;
      Boolean var12 = false;
      this.f9000[4] = var12;
      Object var13 = null;
      this.f9000[5] = var13;
      ((C0761)this.f30000[2]).m44000();
      synchronized ((LinkedList)this.f30000[1]) {
         ((LinkedList)this.f30000[1]).clear();
      }
   }

   @Iface0642(
      y = Enum0081.AFTER_ALL,
      u = true
   )
   public void m40000(rw.module.AutoAccept var1) {
      this.m20000();
      if ((NNNZg)((NNuU)this.y[0]).T[3] != null && (NNNwS)((NNuU)this.y[0]).T[4] != null && (Integer)this.f9000[0] != -1 && (Integer)this.f9000[1] <= 0) {
         if (var1.m2000().method_10744() instanceof Nfy) {
            NAC var2 = var1.m6000();
            if (this.m16000(var2)) {
               if (this.m28000(var2)) {
                  Boolean var9 = true;
                  this.f9000[3] = var9;
               }
            } else {
               if (var2 instanceof NSS var3 && (NNNwS)((NNuU)this.y[0]).T[4] != null && ((NNNwS)((NNuU)this.y[0]).T[4]).method_5628() == var3.N()) {
                  Integer var10 = ((Float)((C0988)this.f20000[2]).i()).intValue();
                  this.f9000[2] = var10;
               }

               synchronized ((LinkedList)this.f30000[1]) {
                  var1.N();
                  ((LinkedList)this.f30000[1]).add(new Rec0189(var2, System.currentTimeMillis()));
               }

               if (!(Boolean)this.f9000[4]) {
                  Boolean var11 = true;
                  this.f9000[4] = var11;
                  ((NNuU)this.y[0]).execute(this::m8000);
               }

               ((NNuU)this.y[0]).execute(() -> this.m4000(var2));
            }
         }
      }
   }

   @Iface0642
   public void m44000(C0138 var1) {
      this.m20000();
      if (this.m18000()) {
         ((C0761)this.f30000[2]).m56000(var1, (Integer)((C0998)this.f30000[0]).i());
      }
   }

   @Iface0642
   public void m46000(C0916 var1) {
      this.m20000();
      ((C0761)this.f30000[2]).m54000((NXi)this.f9000[5], (Float)this.f9000[6], (Float)this.f9000[7]);
      if ((Integer)this.f9000[1] > 0) {
         Integer var6 = (Integer)this.f9000[1] - 1;
         this.f9000[1] = var6;
      }

      if ((Integer)this.f9000[2] > 0) {
         Integer var7 = (Integer)this.f9000[2] - 1;
         this.f9000[2] = var7;
      }

      if (!this.m22000()) {
         Integer var8 = -1;
         this.f9000[0] = var8;
         Object var9 = null;
         this.f9000[5] = var9;
         Boolean var10 = false;
         this.f9000[3] = var10;
         Boolean var11 = false;
         this.f9000[4] = var11;
         ((C0761)this.f30000[2]).m44000();
         this.m32000((boolean)1);
      } else if ((Boolean)this.f9000[3]) {
         Boolean var12 = false;
         this.f9000[3] = var12;
         Integer var13 = 5;
         this.f9000[1] = var13;
         Boolean var14 = false;
         this.f9000[4] = var14;
         this.m32000((boolean)1);
      } else if ((Integer)this.f9000[2] == 0 && this.m8000()) {
         Integer var15 = 5;
         this.f9000[1] = var15;
         Boolean var16 = false;
         this.f9000[4] = var16;
         this.m32000((boolean)1);
      } else {
         this.m32000((boolean)0);
      }
   }

   private static void m54000() {
      f28000 = new Object[]{4096.0, 5};
   }
}
