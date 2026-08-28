package rw.cmd;

import KDFzREm.NNuU;
import KDFzREm.Nog;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.concurrent.ExecutorService;
import rw.NursultanClient;
import rw.setting.C0106;

public class C0013 {
   public static Object[] f1000;
   private static boolean[] f2000;

   public C0013() {
      ((ExecutorService)NursultanClient.f13000[1]).submit(() -> {
         new C0001().m10000((CommandDispatcher<Nog>)llmqsq<"hipd",-708792432,-1419799285,-1419799286,-1419799287,-708792432,-708792432,-708792432>()[0]);
         new C0014().m12000((CommandDispatcher<Nog>)f1000[0]);
         new Time().m16000((CommandDispatcher<Nog>)f1000[0]);
         new Accept().m12000((CommandDispatcher<Nog>)f1000[0]);
         new C0007().m12000((CommandDispatcher<Nog>)f1000[0]);
         new Waypoint().m14000((CommandDispatcher<Nog>)f1000[0]);
         new C0028().m12000((CommandDispatcher<Nog>)llmqsq<"hipd",-708792432,-1419799285,-1419799286,-1419799287,-708792432,-708792432,-708792432>()[0]);
         new Nuker().m10000((CommandDispatcher<Nog>)f1000[0]);
         new BlockEspCommand().m14000((CommandDispatcher<Nog>)f1000[0]);
         new OlkOink().m14000((CommandDispatcher<Nog>)f1000[0]);
         new C0019().m16000((CommandDispatcher<Nog>)f1000[0]);
         new C0017().m12000((CommandDispatcher<Nog>)f1000[0]);
      });
   }

   static {
      ntfClinit();
   }

   private static void m12000() {
      f2000 = new boolean[]{false, true, true, false};
   }

   public void m16000(StringReader var1) {
      try {
         ((CommandDispatcher)f1000[0]).execute(var1, NNuU.Nq().NE().L());
      } catch (CommandSyntaxException var3) {
         C0106.m32000(var3.getMessage());
      }
   }

   private static void m20000() {
      f1000 = new Object[]{null, '.'};
   }
}
