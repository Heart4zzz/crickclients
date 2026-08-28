package rw.core;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.Logger;
import org.msgpack.core.MessageBufferPacker;
import org.msgpack.core.MessageUnpacker;
import org.msgpack.value.ImmutableValue;
import rw.NursultanClient;

public class C0999 extends Base0973 {
   public static Object[] f1000;
   private static String[] f2000;

   private static void m2000() {
      f2000 = new String[]{
         "Unknown autobuy item '{}' in {}, skipped", "Unknown autobuy setting '{}' for '{}' in {}, skipped", "Skipped corrupt autobuy setting '{}' in {}: {}"
      };
   }

   public C0999(String var1, int var2) {
      super(var1, var2, null);
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      f1000 = new Object[]{null};
   }

   private static List<Base1014<?>> m6000(rw.setting.C0156 var0) {
      ArrayList var1 = new ArrayList();

      for (Base1014 var3 : var0.w().values()) {
         if (var3.c_() && !var3.m36000()) {
            var1.add(var3);
         }
      }

      return var1;
   }

   public void m14000(int var1, MessageUnpacker var2) throws IOException {
      int var3 = var2.unpackArrayHeader();

      for (int var4 = 0; var4 < var3; var4++) {
         var2.unpackArrayHeader();
         String var5 = var2.unpackString();
         boolean var6 = var2.unpackBoolean();
         int var7 = var2.unpackArrayHeader();
         rw.setting.C0156 var8 = NursultanClient.m52000().m84000(var5).orElse(null);
         if (var8 == null) {
            ((Logger)f1000[0]).warn(f2000[0], var5, this.u());
         } else {
            var8.m68000(var6);
         }

         for (int var9 = 0; var9 < var7; var9++) {
            var2.unpackArrayHeader();
            String var10 = var2.unpackString();
            ImmutableValue var11 = var2.unpackValue();
            if (var8 != null) {
               Base1014 var12 = var8.L(var10);
               if (var12 == null) {
                  ((Logger)f1000[0]).warn(f2000[1], var10, var5, this.u());
               } else {
                  try {
                     C1009.m24000(var12, var11);
                  } catch (Exception var14) {
                     ((Logger)f1000[0]).warn(f2000[2], var10, this.u(), var14.getMessage());
                  }
               }
            }
         }
      }
   }

   public void m18000(MessageBufferPacker var1) throws IOException {
      List var2 = NursultanClient.m52000().m8000().filter(C0999::m8000).toList();
      var1.packArrayHeader(var2.size());

      for (rw.setting.C0156 var4 : var2) {
         List var5 = m6000(var4);
         var1.packArrayHeader(3);
         var1.packString(var4.m4000().m10000());
         var1.packBoolean(var4.m6000());
         var1.packArrayHeader(var5.size());

         for (Base1014 var7 : var5) {
            var1.packArrayHeader(2);
            var1.packString(var7.m6000().m10000());
            C1009.m10000(var1, var7);
         }
      }
   }

   private static boolean m8000(rw.setting.C0156 var0) {
      return (boolean)(!var0.m6000() && !var0.w().values().stream().anyMatch(Base1014::c_) ? 0 : 1);
   }

   @Override
   public boolean d_() {
      return NursultanClient.m52000().m8000().noneMatch(C0999::m8000);
   }
}
