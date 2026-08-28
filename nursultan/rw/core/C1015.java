package rw.core;

import KDFzREm.NKi;
import KDFzREm.NNNG;
import KDFzREm.NNNqL;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import org.apache.logging.log4j.Logger;
import org.msgpack.core.MessageBufferPacker;
import org.msgpack.core.MessageUnpacker;
import rw.NursultanClient;
import rw.api.Iface0621;
import rw.defs.Nuker;

public class C1015 extends Base0973 implements Iface0621 {
   private static String[] f1000;
   public Object[] f2000;
   public static Object[] f3000;

   private void m4000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[1];
         Object[] var1 = this.f2000;
         var1[0] = false;
      }
   }

   public C1015(String var1, int var2) {
      super(var1, var2, (Nuker)Nuker.f1000[3]);
      this.m4000();
   }

   static {
      ntfClinit();
   }

   private rw.gui.Nuker m2000() {
      return NursultanClient.m88000().m50000();
   }

   private static void m6000() {
      f3000 = new Object[]{null};
   }

   private static void m10000() {
      f1000 = new String[]{"Unknown block id '{}' in {}, skipped", "Skipped corrupt record #{} in {}: {}"};
   }

   public C1015 m6000(boolean var1) {
      this.m4000();
      Boolean var6 = var1;
      this.f2000[0] = var6;
      return this;
   }

   public boolean m8000() {
      this.m4000();
      return (Boolean)this.f2000[0];
   }

   public void m16000(int var1, MessageUnpacker var2) throws IOException {
      Set var3 = this.m2000().m4000();
      int var4 = var2.unpackArrayHeader();
      HashSet var5 = new HashSet(var4);

      for (int var6 = 0; var6 < var4; var6++) {
         try {
            String var7 = var2.unpackString();
            NNNG var8 = NNNG.L(var7);
            if (var8 != null && NNNqL.i.u(var8)) {
               var5.add((NKi)NNNqL.i.N(var8));
            } else {
               ((Logger)f3000[0]).warn(f1000[0], var7, this.u());
            }
         } catch (Exception var9) {
            ((Logger)f3000[0]).warn(f1000[1], var6, this.u(), var9.getMessage());
         }
      }

      var3.removeIf(var1x -> (boolean)(!var5.contains(var1x) ? 1 : 0));
      var3.addAll(var5);
   }

   public void m18000(MessageBufferPacker var1) throws IOException {
      Set var2 = this.m2000().m4000();
      var1.packArrayHeader(var2.size());

      for (NKi var4 : var2) {
         var1.packString(NNNqL.i.y(var4).toString());
      }
   }

   @Override
   public boolean d_() {
      return this.m2000().m4000().isEmpty();
   }
}
