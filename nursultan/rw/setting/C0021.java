package rw.setting;

import KDFzREm.NAC;
import KDFzREm.NAN;
import KDFzREm.NCH;
import KDFzREm.NNNSl;
import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import KDFzREm.NTA;
import KDFzREm.NTf;
import KDFzREm.NfY;
import KDFzREm.Nfg;
import KDFzREm.NxW;
import java.util.UUID;
import rw.NursultanClient;
import rw.api.Iface0654;
import rw.api.Iface0655;
import rw.core.C0950;
import rw.core.C1142;
import rw.core.IliIjtsr;
import rw.defs.Enum0091;
import rw.module.AutoAccept;
import rw.net.PacketListener;

public class C0021 implements Nfg, PacketListener<AutoAccept> {
   private static short[] f1000;
   private static short[] f2000;
   public Object[] f3000;
   private static boolean[] f4000;
   private static byte[] f5000;
   private static short[] f6000;
   private static short[] f7000;
   private static String[] f8000;

   private void m2000() {
      if (this.f3000 == null) {
         this.f3000 = new Object[f5000[0]];
         Object[] var1 = this.f3000;
      }
   }

   public C0021() {
      this.m2000();
      C0950 var5 = NursultanClient.m78000();
      this.f3000[f2000[0]] = var5;
      NNuU var6 = NNuU.Nq();
      this.f3000[f2000[1]] = var6;
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      f2000 = new short[]{0, 1, 1, 1, 1, 0, 1};
      f7000 = new short[]{0, 1, 4};
      f1000 = new short[]{1, 4, 1, 4, 1, 4, 0};
      f6000 = new short[]{0, 1, 1, 4, 1, 4};
   }

   private static void m12000() {
      f4000 = new boolean[]{false, true, false};
   }

   private static void m20000() {
      f5000 = new byte[]{2};
   }

   public void m22000(UUID var1, NAN var2, float var3, NTA var4, NTf var5, boolean var6, boolean var7, boolean var8) {
      if (var2.getString().toLowerCase().contains(f8000[0]) && (NNNwS)((NNuU)this.f3000[f7000[1]]).T[f7000[2]] != null) {
         IliIjtsr var9 = ((Iface0654)((NNNwS)((NNuU)this.f3000[f1000[0]]).T[f1000[1]])).dataManager().m14000().m10000();
         var9.m14000(var1);
         var9.m16000(f4000[1]);
      }
   }

   public void m26000(AutoAccept var1) {
      Object var2 = var1.m6000();
      Enum0091.m34000((NAC<?>)var2, var1x -> ((NNuU)this.f3000[f6000[1]]).execute(() -> {
         if ((NNNwS)((NNuU)this.f3000[f6000[2]]).T[f6000[3]] != null) {
            ((C1142)((Iface0655)((NNNwS)((NNuU)this.f3000[f6000[4]]).T[f6000[5]])).dataManager()).m18000().m12000(var1x);
         }
      }));
      switch (var2) {
         case NfY var5:
            ((NNuU)this.f3000[f2000[2]]).execute(() -> this.m36000(var5));
            break;
         case NNNSl var6:
            ((NNuU)this.f3000[f2000[3]]).execute(() -> {
               ((C0950)this.f3000[f1000[6]]).m30000(var6.N());
               ((C0950)this.f3000[f6000[0]]).m32000();
            });
            break;
         case NxW var7:
            ((NNuU)this.f3000[f2000[4]]).execute(((C0950)this.f3000[f2000[5]])::m2000);
            break;
         case NCH var8:
            ((NNuU)this.f3000[f2000[6]]).execute(((C0950)this.f3000[f7000[0]])::m32000);
            break;
         case null:
         default:
      }
   }

   private static void m30000() {
      f8000 = new String[]{"pvp"};
   }

   public void m34000(UUID var1) {
      if ((NNNwS)((NNuU)this.f3000[f1000[2]]).T[f1000[3]] != null) {
         IliIjtsr var2 = ((C1142)((Iface0655)((NNNwS)((NNuU)this.f3000[f1000[4]]).T[f1000[5]])).dataManager()).m14000().m10000();
         if (var2.m20000() && var2.m12000() != null && var2.m12000().equals(var1)) {
            var2.m14000(null);
            var2.m16000(f4000[2]);
         }
      }
   }

   private void m36000(NfY var1) {
      var1.N(this);
   }
}
