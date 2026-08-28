package rw.core;

import KDFzREm.NNuU;
import java.util.function.Supplier;
import rw.api.Iface0648;
import rw.gui.TapeMouse;

public class C0798 extends C1013 implements Iface0648<TapeMouse> {
   private static float[] f1000;
   public Object[] f2000;

   public C0798(String var1, boolean var2, String var3, Runnable var4) {
      super(var1, var2);
      this.m4000();
      NNuU var9 = NNuU.Nq();
      this.f2000[0] = var9;
      C0956 var10 = new C0956();
      this.f2000[1] = var10;
      this.f2000[2] = var3;
      this.f2000[3] = var4;
   }

   static {
      ntfClinit();
   }

   private void m4000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[5];
         Object[] var1 = this.f2000;
      }
   }

   private static void m6000() {
      f1000 = new float[]{5.0F, 0.1F, 120.0F, 0.1F, 1000.0F};
   }

   public void m4000(C0916 var1) {
      this.m4000();
      if (((C0956)this.f2000[1]).m20000((long)((Float)((C0988)this.f2000[4]).i() * f1000[4]))) {
         ((Runnable)this.f2000[3]).run();
         ((C0956)this.f2000[1]).m18000();
      }
   }

   public void m6000(TapeMouse var1) {
      this.m4000();
      C0988 var6 = (C0988)rw.setting.C0122.m12000(var1, (String)this.f2000[2], f1000[0], f1000[1], f1000[2], f1000[3])
         .m34000((Supplier<String>)OltlIpjm.f2000[2])
         .N(var1x -> this.U());
      this.f2000[4] = var6;
   }
}
