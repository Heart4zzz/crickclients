package rw.core;

import KDFzREm.NKi;
import KDFzREm.NNNG;
import KDFzREm.NNNqL;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import org.apache.logging.log4j.Logger;
import org.msgpack.core.MessageBufferPacker;
import org.msgpack.core.MessageUnpacker;
import rw.NursultanClient;
import rw.data.Rec0182;

public class C0994 extends Base0973 {
   private static boolean[] f1000;
   private static String[] f2000;
   public static Object[] f3000;

   private static void m4000() {
      f1000 = new boolean[]{false, false, true};
   }

   public C0994(String var1, int var2) {
      super(var1, var2, null);
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      f2000 = new String[]{"Unknown block id '{}' in {}, skipped", "Skipped corrupt record #{} in {}: {}"};
   }

   private static void m8000() {
      f3000 = new Object[]{null};
   }

   private rw.gui.C0050 m4000() {
      return NursultanClient.m88000().m110000();
   }

   public void m16000(MessageBufferPacker var1) throws IOException {
      Collection var2 = this.m4000().m12000();
      var1.packArrayHeader(var2.size());

      for (Rec0182 var4 : var2) {
         var1.packString(NNNqL.i.y(var4.m6000()).toString());
         var1.packInt(var4.m4000());
      }
   }

   public void m18000(int var1, MessageUnpacker var2) throws IOException {
      int var3 = var2.unpackArrayHeader();
      ArrayList var4 = new ArrayList(var3);

      for (int var5 = 0; var5 < var3; var5++) {
         try {
            String var6 = var2.unpackString();
            int var7 = var2.unpackInt();
            NNNG var8 = NNNG.L(var6);
            if (var8 != null && NNNqL.i.u(var8)) {
               var4.add(new Rec0182((NKi)NNNqL.i.N(var8), var7));
            } else {
               ((Logger)f3000[0]).warn(f2000[0], var6, this.u());
            }
         } catch (Exception var9) {
            ((Logger)f3000[0]).warn(f2000[1], var5, this.u(), var9.getMessage());
         }
      }

      this.m4000().m36000(var4);
   }

   @Override
   public boolean d_() {
      return this.m4000().m12000().isEmpty();
   }
}
