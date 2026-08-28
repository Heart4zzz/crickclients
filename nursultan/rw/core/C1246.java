package rw.core;

import rw.api.Iface0668;
import rw.data.CriticalPartApi;
import rw.data.OlnpOqOpi;
import rw.data.Rec0304;
import rw.data.Rec0309;

public class C1246 implements Iface0668 {
   private static short[] f1000;
   public Object[] f2000;
   private static short[] f3000;
   private static short[] f4000;
   private static short[] f5000;

   public C1230 m2000() {
      return new C1230().m24000((Rec0309)this.f2000[0]).m14000((CriticalPartApi)this.f2000[1]).m20000((OlnpOqOpi)this.f2000[2]).m22000((Rec0304)this.f2000[3]);
   }

   public OlnpOqOpi m4000() {
      return (OlnpOqOpi)this.f2000[2];
   }

   public C1246(Rec0309 var1, CriticalPartApi var2, OlnpOqOpi var3, Rec0304 var4) {
      this.m16000();
      this.f2000[0] = var1;
      this.f2000[1] = var2;
      this.f2000[2] = var3;
      this.f2000[3] = var4;
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      f5000 = new short[]{0, 1, 2};
      f1000 = new short[]{3, 3, 1, 1, 1, 0};
      f4000 = new short[]{1, 2, 3, 0, 1, 2};
      f3000 = new short[]{3, 0, 1, 2, 3};
   }

   public Rec0309 m10000() {
      return (Rec0309)this.f2000[0];
   }

   static Rec0304 m12000() {
      return (Rec0304)Rec0304.f1000[1];
   }

   static OlnpOqOpi m14000() {
      return (OlnpOqOpi)OlnpOqOpi.f1000[1];
   }

   private void m16000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[4];
         Object[] var1 = this.f2000;
      }
   }

   public static C1230 m18000() {
      return new C1230();
   }

   public Rec0304 m20000() {
      return (Rec0304)this.f2000[3];
   }

   static Rec0309 m24000() {
      return (Rec0309)Rec0309.f6000[3];
   }

   public void m26000() {
      ((Rec0309)this.f2000[0]).m26000();
      ((CriticalPartApi)this.f2000[1]).m18000();
      ((OlnpOqOpi)this.f2000[2]).m16000();
      ((Rec0304)this.f2000[3]).m18000();
   }

   static CriticalPartApi m30000() {
      return (CriticalPartApi)CriticalPartApi.f2000[1];
   }

   public CriticalPartApi m32000() {
      return (CriticalPartApi)this.f2000[1];
   }
}
