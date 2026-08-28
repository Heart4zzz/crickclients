package rw.gui;

import rw.NursultanClient;
import rw.api.Iface0642;
import rw.core.Base0995;
import rw.core.Base1014;
import rw.core.C0077;
import rw.core.C0991;
import rw.core.C0998;
import rw.core.C1000;
import rw.core.C1006;
import rw.core.C1013;
import rw.core.IlsIrs;
import rw.data.IlsOnqsqi;
import rw.data.Rec0312;
import rw.defs.Enum0081;
import rw.defs.OlpiIqlss;
import rw.setting.C0122;

public class HudScale extends Base0995 {
   private static float[] f1000;
   public Object[] f2000;
   private static String[] f3000;
   public Object[] f4000;
   private static String[] f5000;
   private static String[] f6000;
   public static Object[] f7000;
   public Object[] f8000;
   public Object[] f9000;
   private static String[] f10000;

   public void m2000() {
      this.m76000();
      C1013 var1 = NursultanClient.m14000().m34000() == (OlpiIqlss)OlpiIqlss.f2000[0] ? (C1013)this.f9000[0] : (C1013)this.f9000[1];
      if (((C1000)this.f4000[3]).i() != var1) {
         ((C1000)this.f4000[3]).m18000(var1);
      }
   }

   private static void m6000() {
      f5000 = new String[]{"ru", "en"};
      f10000 = new String[]{"scale_100", "scale_150", "scale_200", "scale_100"};
      f6000 = new String[]{"scale_150", "scale_200", "bind", "language", "menu-scale", "hud-scale", "accent", "descriptions"};
      f3000 = new String[]{"auto-save-preset", "menu.setting", "menu.setting"};
   }

   public HudScale() {
      this.m76000();
      C1013 var5 = new C1013(f5000[0], false);
      this.f9000[0] = var5;
      C1013 var6 = new C1013(f5000[1], true);
      this.f9000[1] = var6;
      IlsIrs var7 = new IlsIrs(f10000[0], true, f1000[0]);
      this.f9000[2] = var7;
      IlsIrs var8 = new IlsIrs(f10000[1], false, f1000[1]);
      this.f9000[3] = var8;
      IlsIrs var9 = new IlsIrs(f10000[2], false, f1000[2]);
      this.f2000[0] = var9;
      IlsIrs var10 = new IlsIrs(f10000[3], true, f1000[3]);
      this.f2000[1] = var10;
      IlsIrs var11 = new IlsIrs(f6000[0], false, f1000[4]);
      this.f4000[0] = var11;
      IlsIrs var12 = new IlsIrs(f6000[1], false, f1000[5]);
      this.f4000[1] = var12;
      C1006 var13 = (C1006)C0122.m14000(this, f6000[2], (PgUp)PgUp.f41000[2]).N(this::m66000);
      this.f4000[2] = var13;
      C1000 var14 = (C1000)C0122.m18000(this, f6000[3], (C1013)this.f9000[0], (C1013)this.f9000[1]).N(this::m62000);
      this.f4000[3] = var14;
      C1000 var15 = (C1000)C0122.m18000(this, f6000[4], (IlsIrs)this.f9000[2], (IlsIrs)this.f9000[3], (IlsIrs)this.f2000[0]).N(this::m48000);
      this.f8000[0] = var15;
      C1000 var16 = (C1000)C0122.m18000(this, f6000[5], (IlsIrs)this.f2000[1], (IlsIrs)this.f4000[0], (IlsIrs)this.f4000[1]).N(this::m56000);
      this.f8000[1] = var16;
      C0998 var17 = (C0998)C0122.m6000(this, f6000[6], -7623425).m8000(true).m10000(false).N(this::m64000);
      this.f8000[2] = var17;
      C0991 var18 = (C0991)C0122.m26000(this, f6000[7], true).N((var1, var2) -> this.m12000());
      this.f8000[3] = var18;
      C0991 var19 = (C0991)C0122.m26000(this, f3000[0], true).N((var1, var2) -> this.m12000());
      this.f8000[4] = var19;
      NursultanClient.m8000().m32000(this);
   }

   static {
      ntfClinit();
   }

   private void m12000() {
      NursultanClient.m8000().m12000(IlsOnqsqi.m4000((rw.defs.Nuker)rw.defs.Nuker.f1000[4]));
   }

   private static void m22000() {
      f7000 = new Object[]{f3000[2]};
   }

   private static void m34000() {
      f1000 = new float[]{1.0F, 1.5F, 2.0F, 1.0F, 1.5F, 2.0F};
   }

   private void m48000(Base1014<IlsIrs> var1, IlsIrs var2) {
      ThemeManager.m88000(var2.m2000());
      this.m12000();
   }

   public boolean m50000() {
      this.m76000();
      return (Boolean)((C0991)this.f8000[3]).i();
   }

   private void m56000(Base1014<IlsIrs> var1, IlsIrs var2) {
      Huddumped.m74000(var2.m2000());
      this.m12000();
   }

   public boolean m60000() {
      this.m76000();
      return (Boolean)((C0991)this.f8000[4]).i();
   }

   private void m62000(Base1014<C1013> var1, C1013 var2) {
      this.m76000();
      if (((C1013)this.f9000[0]).m14000()) {
         NursultanClient.m14000().m32000((OlpiIqlss)OlpiIqlss.f2000[0]);
      } else {
         NursultanClient.m14000().m32000((OlpiIqlss)OlpiIqlss.f2000[1]);
      }

      this.m12000();
   }

   private void m64000(Base1014<Integer> var1, Integer var2) {
      C0077.m24000(var2);
      this.m12000();
   }

   public Rec0312 m12000(String var1) {
      return new Rec0312(f3000[1]).m12000(var1);
   }

   private void m66000(Base1014<PgUp> var1, PgUp var2) {
      this.m76000();
      if (!var2.m80000() && var2 != (PgUp)PgUp.f4000[1]) {
         this.m12000();
      } else {
         ((C1006)this.f4000[2]).N((PgUp)PgUp.f41000[2]);
      }
   }

   @Iface0642(
      y = Enum0081.BEFORE,
      L = {ThemeManager.class},
      u = true
   )
   public void m68000(rw.module.Huddumped var1) {
      this.m76000();
      if (((C1006)this.f4000[2]).m4000(var1)) {
         ThemeManager.m82000();
         var1.N();
      }
   }

   private void m76000() {
      if (this.f9000 == null) {
         this.f9000 = new Object[4];
         Object[] var1 = this.f9000;
      }

      if (this.f2000 == null) {
         this.f2000 = new Object[2];
         Object[] var2 = this.f2000;
      }

      if (this.f4000 == null) {
         this.f4000 = new Object[4];
         Object[] var3 = this.f4000;
      }

      if (this.f8000 == null) {
         this.f8000 = new Object[5];
         Object[] var4 = this.f8000;
      }
   }
}
