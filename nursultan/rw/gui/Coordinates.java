package rw.gui;

import rw.GuiWidget;
import rw.NursultanClient;
import rw.api.AnnotationDefault;
import rw.core.C1000;
import rw.core.C1003;
import rw.core.C1013;
import rw.defs.Enum0055;
import rw.setting.C0122;

@AnnotationDefault(
   L = "Logo",
   y = Enum0055.VISUAL,
   N = Enum0070.INTERFACE
)
public class Coordinates extends GuiWidget {
   public Object[] f1000;
   private static String[] f2000;
   public Object[] f3000;
   private static String[] f4000;

   public C1013 m4000() {
      this.m48000();
      return (C1013)this.f1000[5];
   }

   public C1000<C1013> m6000() {
      this.m48000();
      return (C1000<C1013>)this.f3000[2];
   }

   public Coordinates() {
      this.m48000();
      C1013 var5 = new C1013(f2000[0], true);
      this.f1000[0] = var5;
      C1013 var6 = new C1013(f2000[1], true);
      this.f1000[1] = var6;
      C1013 var7 = new C1013(f2000[2], true);
      this.f1000[2] = var7;
      C1013 var8 = new C1013(f4000[0], true);
      this.f1000[3] = var8;
      C1013 var9 = new C1013(f4000[1], true);
      this.f1000[4] = var9;
      C1013 var10 = new C1013(f4000[2], true);
      this.f1000[5] = var10;
      C1013 var11 = new C1013(f4000[3], true);
      this.f1000[6] = var11;
      C1003 var12 = (C1003)C0122.m4000(
            this,
            f4000[4],
            (C1013)this.f1000[0],
            (C1013)this.f1000[1],
            (C1013)this.f1000[2],
            (C1013)this.f1000[3],
            (C1013)this.f1000[4],
            (C1013)this.f1000[5],
            (C1013)this.f1000[6]
         )
         .N((var0, var1) -> NursultanClient.m42000().m64000());
      this.f1000[7] = var12;
      C1013 var13 = new C1013(f4000[5], true);
      this.f3000[0] = var13;
      C1013 var14 = new C1013(f4000[6], false);
      this.f3000[1] = var14;
      C1000 var15 = (C1000)C0122.m18000(this, f4000[7], (C1013)this.f3000[0], (C1013)this.f3000[1]).N((var0, var1) -> NursultanClient.m42000().m64000());
      this.f3000[2] = var15;
   }

   static {
      ntfClinit();
   }

   public boolean m4000() {
      NursultanClient.m42000().m64000();
      return super.m12000();
   }

   public boolean m6000() {
      NursultanClient.m42000().m64000();
      return super.m14000();
   }

   public C1013 m14000() {
      this.m48000();
      return (C1013)this.f1000[2];
   }

   public C1013 m16000() {
      this.m48000();
      return (C1013)this.f1000[1];
   }

   public C1013 m18000() {
      this.m48000();
      return (C1013)this.f1000[4];
   }

   public C1013 m24000() {
      this.m48000();
      return (C1013)this.f3000[1];
   }

   private static void m26000() {
      f2000 = new String[]{"login", "fps", "ping"};
      f4000 = new String[]{"time", "tps", "bps", "coordinates", "details", "left", "right", "position"};
   }

   public C1013 m28000() {
      this.m48000();
      return (C1013)this.f1000[0];
   }

   public C1013 m30000() {
      this.m48000();
      return (C1013)this.f1000[3];
   }

   public C1013 m32000() {
      this.m48000();
      return (C1013)this.f1000[6];
   }

   public C1013 m46000() {
      this.m48000();
      return (C1013)this.f3000[0];
   }

   private void m48000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[8];
         Object[] var1 = this.f1000;
      }

      if (this.f3000 == null) {
         this.f3000 = new Object[3];
         Object[] var2 = this.f3000;
      }
   }
}
