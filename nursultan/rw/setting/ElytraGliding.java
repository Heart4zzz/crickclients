package rw.setting;

import KDFzREm.NNJg;
import KDFzREm.NNNZZ;
import KDFzREm.NNNwS;
import KDFzREm.NNYH;
import KDFzREm.NNuU;
import java.util.function.Predicate;
import rw.NursultanClient;
import rw.core.C1013;
import rw.core.C1187;
import rw.core.C1193;

public class ElytraGliding extends C1013 implements Predicate<NNuU> {
   private static String[] f1000;
   public Object[] f2000;

   public static ElytraGliding m6000(boolean var0) {
      return new ElytraGliding(f1000[2], var0, var0x -> ((NNNZZ)var0x.T[2]).E());
   }

   private void m2000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[1];
         Object[] var1 = this.f2000;
      }
   }

   public ElytraGliding(String var1, boolean var2, Predicate<NNuU> var3) {
      super(var1, var2);
      this.m2000();
      this.f2000[0] = var3;
   }

   static {
      ntfClinit();
   }

   public static ElytraGliding m12000(boolean var0) {
      return new ElytraGliding(f1000[5], var0, var0x -> (boolean)(!((NNYH)var0x.v[3] instanceof NNJg) && !NursultanClient.m60000().m16000() ? 0 : 1));
   }

   public static ElytraGliding m18000(boolean var0) {
      return new ElytraGliding(f1000[0], var0, var0x -> (boolean)(((NNNwS)var0x.T[4]).method_6115() && !((NNNwS)var0x.T[4]).method_6039() ? 1 : 0));
   }

   private static void m6000() {
      f1000 = new String[]{"using-item", "using-shield", "block-breaking", "no-weapon", "elytra-gliding", "moving-items"};
   }

   public static ElytraGliding m26000(boolean var0) {
      return new ElytraGliding(
         f1000[3], var0, var0x -> (boolean)(!C1193.m26000(((NNNwS)var0x.T[4]).method_6047()) && !C1193.m26000(((NNNwS)var0x.T[4]).method_6079()) ? 1 : 0)
      );
   }

   public static ElytraGliding m30000(boolean var0) {
      return new ElytraGliding(f1000[1], var0, var0x -> ((NNNwS)var0x.T[4]).method_6039());
   }

   public boolean m32000(NNuU var1) {
      this.m2000();
      return ((Predicate)this.f2000[0]).test(var1);
   }

   public static ElytraGliding m42000(boolean var0) {
      return new ElytraGliding(f1000[4], var0, var0x -> C1187.m36000());
   }
}
