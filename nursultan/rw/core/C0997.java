package rw.core;

import java.io.IOException;
import java.util.ArrayList;
import org.apache.logging.log4j.Logger;
import org.msgpack.core.MessageBufferPacker;
import org.msgpack.core.MessageUnpacker;
import org.msgpack.value.ImmutableValue;
import rw.NursultanClient;
import rw.api.Iface0621;
import rw.defs.Nuker;
import rw.gui.HudScale;

public class C0997 extends Base0973 implements Iface0621 {
   public static Object[] f1000;
   private static String[] f2000;
   public Object[] f3000;

   public HudScale m2000() {
      this.m8000();
      return (HudScale)this.f3000[0];
   }

   private static void m4000() {
      f2000 = new String[]{"Unknown client setting '{}' in {}, skipped", "Skipped corrupt client setting '{}' in {}: {}"};
   }

   public C0997(String var1, int var2) {
      super(var1, var2, (Nuker)Nuker.f1000[4]);
      this.m8000();
      HudScale var7 = NursultanClient.m26000();
      this.f3000[0] = var7;
   }

   static {
      ntfClinit();
   }

   private static void m4000() {
      f1000 = new Object[]{null};
   }

   private void m8000() {
      if (this.f3000 == null) {
         this.f3000 = new Object[2];
         Object[] var1 = this.f3000;
         var1[1] = false;
      }
   }

   public boolean m8000() {
      this.m8000();
      return (Boolean)this.f3000[1];
   }

   public C0997 m10000(boolean var1) {
      this.m8000();
      Boolean var6 = var1;
      this.f3000[1] = var6;
      return this;
   }

   public void m14000(MessageBufferPacker var1) throws IOException {
      this.m8000();
      ArrayList var2 = new ArrayList();

      for (Base1014 var4 : ((HudScale)this.f3000[0]).w().values()) {
         if (var4.c_() && !var4.m36000()) {
            var2.add(var4);
         }
      }

      var1.packArrayHeader(var2.size());

      for (Base1014 var6 : var2) {
         var1.packArrayHeader(2);
         var1.packString(var6.m6000().m10000());
         C1009.m10000(var1, var6);
      }

      var1.packInt(((C0959)NursultanClient.f13000[2]).m4000());
   }

   public void m18000(int var1, MessageUnpacker var2) throws IOException {
      this.m8000();
      int var3 = var2.unpackArrayHeader();

      for (int var4 = 0; var4 < var3; var4++) {
         var2.unpackArrayHeader();
         String var5 = var2.unpackString();
         ImmutableValue var6 = var2.unpackValue();
         Base1014 var7 = ((HudScale)this.f3000[0]).L(var5);
         if (var7 == null) {
            ((Logger)f1000[0]).warn(f2000[0], var5, this.u());
         } else {
            try {
               C1009.m24000(var7, var6);
            } catch (Exception var9) {
               ((Logger)f1000[0]).warn(f2000[1], var5, this.u(), var9.getMessage());
            }
         }
      }

      if (var2.hasNext()) {
         ((C0959)NursultanClient.f13000[2]).m2000(var2.unpackInt());
      }
   }

   @Override
   public boolean d_() {
      this.m8000();
      return (boolean)(((C0959)NursultanClient.f13000[2]).m4000() == -1 && ((HudScale)this.f3000[0]).w().values().stream().noneMatch(Base1014::c_) ? 1 : 0);
   }
}
