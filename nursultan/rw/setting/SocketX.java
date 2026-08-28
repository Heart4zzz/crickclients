package rw.setting;

import KDFzREm.NNNYO;
import KDFzREm.NNNZg;
import KDFzREm.NNNwS;
import KDFzREm.NNde;
import KDFzREm.NNnC;
import KDFzREm.NNnS;
import KDFzREm.NNnf;
import KDFzREm.NNtL;
import KDFzREm.NNty;
import KDFzREm.NNuU;
import KDFzREm.NPh;
import KDFzREm.NXi;
import KDFzREm.NbK;
import KDFzREm.NcB;
import KDFzREm.NcZ;
import rw.NursultanClient;
import rw.core.Base0793;
import rw.core.C1140;
import rw.core.C1176;
import rw.core.C1188;
import rw.core.IllillIms;
import rw.gui.ClickAction;
import rw.module.Huddumped;

public class SocketX extends Base0793 {
   private static String[] f1000;
   public Object[] f2000;
   private static double[] f3000;

   public SocketX(ClickAction var1) {
      super(var1, f1000[0]);
      this.m8000();
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      f3000 = new double[]{256.0, 256.0};
   }

   private static void m10000() {
      f1000 = new String[]{"point-key", "socket.not-connected"};
   }

   public void m2000(Huddumped var1) {
      this.m8000();
      if (System.currentTimeMillis() - (Long)this.f2000[0] >= 750L) {
         if (!NursultanClient.m82000().m72000()) {
            C0106.m32000(C1188.m12000(f1000[1]).N(NPh.field_1061));
         } else {
            NNde var2 = ((NNNYO)((NNuU)this.N[0]).i[5]).s();
            NXi var3 = ((NNNwS)((NNuU)this.N[0]).T[4]).method_5631(var2.i(), var2.R()).L(f3000[0]);
            NXi var4 = var2.y();
            NcB var5 = C1176.m68000((NNNwS)((NNuU)this.N[0]).T[4], var4, var3, f3000[1], true, C1140.m12000().and(C1140.m50000()));
            if (var5 != null && var5.N() == NcZ.field_1331) {
               NbK var15 = ((NNtL)var5).L();
               NursultanClient.m82000().m56000(new IllillIms(var15.method_23317(), var15.method_23318(), var15.method_23321(), var15.method_5628()));
               Long var13 = System.currentTimeMillis();
               this.f2000[0] = var13;
            } else {
               NXi var6 = var4.i(var3);
               NNty var7 = ((NNNZg)((NNuU)this.N[0]).T[3]).N(new NNnf(var4, var6, NNnS.field_17559, NNnC.field_1348, (NNNwS)((NNuU)this.N[0]).T[4]));
               if (var7.N() != NcZ.field_1333) {
                  NXi var8 = var7.y();
                  NursultanClient.m82000().m56000(new IllillIms(var8.N(), var8.y(), var8.L(), -1));
                  Long var14 = System.currentTimeMillis();
                  this.f2000[0] = var14;
               }
            }
         }
      }
   }

   private void m8000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[1];
         Object[] var1 = this.f2000;
         var1[0] = 0L;
      }
   }
}
