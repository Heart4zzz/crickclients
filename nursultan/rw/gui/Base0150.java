package rw.gui;

import KDFzREm.NAZ;
import KDFzREm.NAd;
import KDFzREm.NFC;
import KDFzREm.NNag;
import KDFzREm.NPh;
import KDFzREm.NXi;
import java.time.Duration;
import rw.NursultanClient;
import rw.core.AutomaticPartPart;
import rw.core.C1188;
import rw.setting.C0106;
import rw.setting.C0160;

public abstract class Base0150 {
   private static long[] f1000;
   private static String[] f2000;

   private static void m6000() {
      f1000 = new long[]{500L, 0L};
   }

   static {
      ntfClinit();
   }

   private String m12000(String var1) {
      String var2 = var1;
      long var3 = NursultanClient.m96000().m14000().filter(var1x -> var1x.equals(var1)).count();
      if (var3 > 0L) {
         var2 = var1 + " (" + var3 + ")";
      }

      return var2;
   }

   private static void m22000() {
      f2000 = new String[]{"event-waypoint", "click-to-way", "event-notify"};
   }

   private String m26000(double var1) {
      return "" + NPh.field_1068 + (int)var1 + NPh.field_1080;
   }

   public void m28000(String var1, double var2, double var4, double var6, boolean var8) {
      Object var9 = this.m12000(var1);
      if (var8) {
         this.m34000((String)var9, var2, var4, var6);
      }

      NNag var10 = C1188.m16000(f2000[0], NPh.field_1068 + var9 + NPh.field_1080, this.m26000(var2), this.m26000(var4), this.m26000(var6)).N(NPh.field_1080);
      if (!var8) {
         NAZ var11 = new NAZ(C1188.m12000(f2000[1]));
         NFC var12 = new NFC((Character)rw.cmd.C0013.f1000[1] + "gps " + var2 + " " + var6);
         var10.y(NAd.N.N(var11).N(var12));
      }

      C0106.m32000(var10);
   }

   public void m32000(String var1) {
      Object var2 = this.m12000(var1);
      NNag var3 = C1188.m16000(f2000[2], NPh.field_1068 + var2 + NPh.field_1080).N(NPh.field_1080);
      C0106.m32000(var3);
   }

   private void m34000(String var1, double var2, double var4, double var6) {
      String var8 = C0160.m6000();
      Duration var9 = Duration.ofSeconds(500L);
      NXi var10 = new NXi(var2, var4, var6);
      AutomaticPartPart var11 = new AutomaticPartPart(var1, var10, var9, var8);
      NursultanClient.m96000().m30000(var11);
   }

   public abstract void m38000(rw.module.AutoAccept var1);
}
