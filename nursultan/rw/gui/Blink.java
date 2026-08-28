package rw.gui;

import KDFzREm.NAC;
import KDFzREm.NDL;
import KDFzREm.NDR;
import KDFzREm.NDj;
import KDFzREm.NHS;
import KDFzREm.NNNAF;
import KDFzREm.NNNNLQ;
import KDFzREm.NNNZg;
import KDFzREm.NNNpn;
import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import KDFzREm.NrK;
import KDFzREm.Nrh;
import KDFzREm.Nrr;
import java.util.LinkedList;
import java.util.List;
import rw.GuiWidget;
import rw.NursultanClient;
import rw.api.AnnotationDefault;
import rw.api.Iface0642;
import rw.core.C0138;
import rw.core.C0721;
import rw.core.C0805;
import rw.core.C0814;
import rw.core.C0988;
import rw.core.C0991;
import rw.core.C0998;
import rw.core.C1172;
import rw.core.IltOiis;
import rw.defs.Enum0055;
import rw.defs.Enum0081;
import rw.module.AttackAura_x;
import rw.setting.C0122;
import rw.setting.C0160;

@AnnotationDefault(
   L = "Blink",
   y = Enum0055.PLAYER,
   N = Enum0070.BASE
)
public class Blink extends GuiWidget {
   private static float[] f1000;
   public Object[] f2000;
   private static String[] f3000;

   private void m4000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[8];
         Object[] var1 = this.f2000;
         var1[7] = 0;
      }
   }

   public Blink() {
      this.m4000();
      C0991 var5 = C0122.m26000(this, f3000[0], true);
      this.f2000[0] = var5;
      C0991 var6 = C0122.m26000(this, f3000[1], true);
      this.f2000[1] = var6;
      C0998 var7 = (C0998)C0122.m6000(this, f3000[2], -11104513).N(var1 -> {
         this.m4000();
         return (Boolean)((C0991)this.f2000[1]).i();
      });
      this.f2000[2] = var7;
      C0991 var8 = (C0991)C0122.m26000(this, f3000[3], true).N((var1, var2) -> {
         this.m4000();
         Integer var7x = NursultanClient.m74000().m10000();
         this.f2000[7] = var7x;
      });
      this.f2000[3] = var8;
      C0988 var9 = (C0988)C0122.m12000(this, f3000[4], f1000[0], f1000[1], f1000[2], f1000[3]).N(var1 -> {
         this.m4000();
         return (Boolean)((C0991)this.f2000[3]).i();
      });
      this.f2000[4] = var9;
      LinkedList var10 = new LinkedList();
      this.f2000[5] = var10;
   }

   static {
      ntfClinit();
   }

   public boolean m6000() {
      this.m4000();
      if ((NNNZg)((NNuU)this.y[0]).T[3] != null) {
         ((List)this.f2000[5]).clear();
         this.m16000();
         Integer var5 = NursultanClient.m74000().m10000();
         this.f2000[7] = var5;
         return super.m12000();
      } else {
         return (boolean)0;
      }
   }

   public boolean m10000() {
      this.m8000();
      return super.m14000();
   }

   private static void m12000() {
      f3000 = new String[]{"release-packets-on-hit", "render-server-position", "render-color", "auto-release-packets", "release-packets-ticks"};
   }

   private static void m14000() {
      f1000 = new float[]{20.0F, 5.0F, 100.0F, 5.0F};
   }

   private void m8000() {
      this.m4000();
      synchronized ((List)this.f2000[5]) {
         if ((NNNwS)((NNuU)this.y[0]).T[4] == null) {
            ((List)this.f2000[5]).clear();
         } else {
            for (NAC var3 : (List)this.f2000[5]) {
               C0160.m74000(var3);
            }

            ((List)this.f2000[5]).clear();
            Integer var9 = NursultanClient.m74000().m10000();
            this.f2000[7] = var9;
            this.m16000();
         }
      }
   }

   private void m16000() {
      this.m4000();
      if ((NNNwS)((NNuU)this.y[0]).T[4] != null) {
         NHS var1 = ((NNNwS)((NNuU)this.y[0]).T[4]).method_5829();
         C1172 var6 = C1172.m50000(var1);
         this.f2000[6] = var6;
      }
   }

   @Iface0642
   public void m12000(C0138 var1) {
      this.m4000();
      if ((Boolean)((C0991)this.f2000[1]).i() && (C1172)this.f2000[6] != null) {
         IltOiis.m24000(
            var1.m36000(),
            ((C0805)C0814.f12000[2]).m18000(),
            ((C0805)C0814.f15000[3]).m18000(),
            var1.m24000().y(),
            (C1172)this.f2000[6],
            (Integer)((C0998)this.f2000[2]).i()
         );
      }
   }

   @Iface0642
   public void m14000(C0721 var1) {
      this.m4000();
      if ((Boolean)((C0991)this.f2000[3]).i()) {
         if (NursultanClient.m74000().m10000() - (Integer)this.f2000[7] > ((Float)((C0988)this.f2000[4]).i()).intValue()) {
            this.m8000();
         }
      }
   }

   @Iface0642(
      y = Enum0081.AFTER_ALL
   )
   public void m18000(rw.module.Blink var1) {
      this.m4000();
      if (!var1.y()) {
         NAC var2 = var1.m2000();
         if (!(var2 instanceof NDL)
            && !(var2 instanceof Nrr)
            && !(var2 instanceof NrK)
            && !(var2 instanceof NNNpn)
            && !(var2 instanceof NDR)
            && !(var2 instanceof NDj)
            && !(var2 instanceof NNNNLQ)
            && !(var2 instanceof NNNAF)
            && !(var2 instanceof Nrh)) {
            var1.N();
            synchronized ((List)this.f2000[5]) {
               ((List)this.f2000[5]).add(var2);
            }
         } else {
            this.m8000();
         }
      }
   }

   @Iface0642
   public void m20000(AttackAura_x var1) {
      this.m4000();
      if ((Boolean)((C0991)this.f2000[0]).i()) {
         this.m8000();
      }
   }
}
