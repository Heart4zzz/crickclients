package rw.data;

import KDFzREm.NNuU;
import java.lang.runtime.ObjectMethods;
import org.apache.logging.log4j.Logger;
import rw.NursultanClient;
import rw.api.Iface0028;
import rw.api.Iface0605;
import rw.core.C0118;
import rw.core.C0124;
import rw.core.C0884;
import rw.core.OlijtlOl;
import rw.net.Enum0031;
import rw.net.IlpOks;
import rw.net.Rec0019;
import rw.net.SocketConnector;
import rw.setting.C0106;

public record Rec0219() implements Iface0028 {
   public static Object[] f1000;
   public IlpOks f2000;
   public SocketConnector f3000;

   public SocketConnector m4000() {
      return III0qnist<"ptdngt",-448313982,-1970747540,-1970747536,-1970747535,3959468,262007295,-780603015>(this);
   }

   public Rec0219(SocketConnector var1, IlpOks var2) {
      this.f3000 = var1;
      this.f2000 = var2;
   }

   static {
      ntfClinit();
   }

   public boolean m8000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0219,"client;connection",Rec0219::f3000,Rec0219::f2000>(this, var1);
   }

   private static void m10000() {
      f1000 = new Object[]{null};
   }

   public IlpOks m16000() {
      return this.f2000;
   }

   public void m18000(C0118 var1) {
      this.f2000.m64000((Enum0031)Enum0031.f3000[1]);
      this.f2000.m66000(new Rec0019(this.f3000, this.f2000));
      this.f2000.m58000(OlijtlOl.m4000());
      NursultanClient.m30000().m80000();
      NursultanClient.m32000().m58000();
      NursultanClient.m56000().m50000();
      NursultanClient.m20000().m30000();
   }

   public boolean m22000() {
      return this.f2000.m76000();
   }

   public void m24000(C0124 var1) {
      ((Logger)f1000[0]).error(var1.m14000());
      C0106.m40000((Iface0605)C0884.f2000[0], var1.m14000());
      NNuU.Nq().execute(() -> NursultanClient.m100000().m2000());
      this.f2000.m30000();
      NursultanClient.m82000().m28000();
   }
}
