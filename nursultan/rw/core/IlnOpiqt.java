package rw.core;

import java.util.List;
import rw.NursultanClient;
import rw.data.Rec0223;

public class IlnOpiqt extends Base1005 {
   private static byte[] f1000;

   static {
      ntfClinit();
   }

   private static void m4000() {
      byte[] var128 = new byte[(1 | -1) >>> 31];
      f1000[(0 | -0) >>> 31] = 8;
   }

   public void m6000(String var1, int var2, List<Rec0223> var3) {
      if ((var2 & f1000[0]) != 0) {
         for (rw.setting.C0156 var5 : NursultanClient.m52000().m76000().values()) {
            int var6 = this.N(var5.m64000(), var1);
            if (var6 != 0) {
               var3.add(new Rec0223(List.of(C1235.m36000(var5.m28000().m54000())), var5, var6));
            }
         }
      }
   }
}
