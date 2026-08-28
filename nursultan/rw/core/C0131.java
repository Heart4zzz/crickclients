package rw.core;

import rw.NursultanClient;
import rw.data.ConfigFiles;
import rw.data.IlsOnqsqi;
import rw.net.PacketListener;

public class C0131 implements PacketListener<IlsOnqsqi> {
   private static boolean[] f1000;

   static {
      ntfClinit();
   }

   public void m8000(IlsOnqsqi var1) {
      if (!C0875.m16000()) {
         NursultanClient.m10000().m68000(var1.m6000()).ifPresent(var0 -> var0.m6000((boolean)1));
         switch (((int[])C0149.f3000[0])[var1.m6000().ordinal()]) {
            case 1:
               ConfigFiles.m54000(C0978.class);
               break;
            case 2:
               ConfigFiles.m54000(C0894.class);
               break;
            case 3:
               ConfigFiles.m54000(C0990.class);
               break;
            case 4:
               ConfigFiles.m54000(C1015.class);
               break;
            case 5:
               ConfigFiles.m54000(C0997.class);
         }

         NursultanClient.m56000().m44000(var1.m6000());
      }
   }

   private static void m14000() {
      f1000 = new boolean[]{true};
   }
}
