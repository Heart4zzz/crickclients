package rw.net;

import org.apache.logging.log4j.Logger;
import rw.NursultanClient;
import rw.core.C1201;
import rw.core.C1235;
import rw.data.Rec0267;
import rw.data.Rec0281;

public class CloudSync {
   private static String[] f1000;
   public static Object[] f2000;
   public Object[] f3000;

   private static void m8000() {
      f2000 = new Object[]{null, -1L};
   }

   public CloudSync() {
      this.m20000();
      Long var5 = -1L;
      this.f3000[0] = var5;
   }

   static {
      ntfClinit();
   }

   private static void m10000() {
      f1000 = new String[]{"Client update revision {} is ahead of session baseline {}", "icon:hud/arrows", "update.restart-required"};
   }

   private void m20000() {
      if (this.f3000 == null) {
         this.f3000 = new Object[2];
         Object[] var1 = this.f3000;
         var1[0] = 0L;
         var1[1] = 0;
      }
   }

   public synchronized void m30000() {
      SocketConnector var1 = NursultanClient.m82000();
      if (var1.m72000()) {
         var1.m56000(new C1201());
      }
   }

   public synchronized void m34000(long var1) {
      if ((Long)this.f3000[0] == -1L) {
         Long var7 = var1;
         this.f3000[0] = var7;
      } else if (var1 > (Long)this.f3000[0]) {
         if (!NursultanClient.m70000().m30000((Integer)this.f3000[1])) {
            ((Logger)f2000[0]).info(f1000[0], var1, (Long)this.f3000[0]);
            Integer var8 = NursultanClient.m70000()
               .m18000()
               .m4000()
               .m52000()
               .m46000(new Rec0281(f1000[1]))
               .m34000(new Rec0267(C1235.m36000(f1000[2])))
               .m44000();
            this.f3000[1] = var8;
         }
      }
   }
}
