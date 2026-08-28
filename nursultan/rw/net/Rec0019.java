package rw.net;

import KDFzREm.NAN;
import KDFzREm.NNNfr;
import KDFzREm.NNuU;
import KDFzREm.NXi;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.mojang.serialization.JsonOps;
import java.lang.runtime.ObjectMethods;
import java.util.Arrays;
import org.apache.logging.log4j.Logger;
import rw.NursultanClient;
import rw.api.Iface0027;
import rw.api.Iface0032;
import rw.api.Iface0605;
import rw.core.Base0943;
import rw.core.C0108;
import rw.core.C0109;
import rw.core.C0110;
import rw.core.C0112;
import rw.core.C0113;
import rw.core.C0114;
import rw.core.C0115;
import rw.core.C0116;
import rw.core.C0117;
import rw.core.C0119;
import rw.core.C0120;
import rw.core.C0121;
import rw.core.C0122;
import rw.core.C0123;
import rw.core.C0153;
import rw.core.C0884;
import rw.core.C0901;
import rw.core.C0970;
import rw.core.C1216;
import rw.core.IljOmq;
import rw.core.OlOqOnisn;
import rw.core.OlijOmtIm;
import rw.defs.Enum0088;
import rw.setting.C0106;
import rw.setting.C0158;
import rw.setting.C0160;
import rw.setting.C0163;

public record Rec0019() implements Iface0027, Iface0032 {
   public SocketConnector f1000;
   public IlpOks f2000;
   private static String[] f3000;
   public static Object[] f4000;

   public SocketConnector m4000() {
      return Ol0j0smlt<"ocjcpso",1453766114,-1911285329,-1911285341,-1911285364,-661115224,1002800285>(this);
   }

   public Rec0019(SocketConnector var1, IlpOks var2) {
      this.f1000 = var1;
      this.f2000 = var2;
   }

   static {
      ntfClinit();
   }

   public boolean m8000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0019,"client;connection",Rec0019::f1000,Rec0019::f2000>(this, var1);
   }

   private static void m12000() {
      f4000 = new Object[]{null, null, null};
   }

   public IlpOks m20000() {
      return this.f2000;
   }

   public void m26000() {
   }

   public void m50000(C0120 var1) {
   }

   public boolean m52000() {
      return this.f2000.m76000();
   }

   public void m54000(C0123 var1) {
      ((NNuU)f4000[1]).execute(() -> NursultanClient.m20000().m34000(var1.m22000()));
   }

   public void m56000(C0113 var1) {
      ((NNuU)f4000[1]).execute(() -> NursultanClient.m30000().m56000(var1));
   }

   public void m58000(C0108 var1) {
      ((NNuU)f4000[1]).execute(() -> NursultanClient.m32000().m80000(var1));
   }

   public void m60000(C0119 var1) {
      JsonElement var2 = JsonParser.parseString(var1.m14000());
      C0106.m52000((Iface0605)C0884.f2000[0], (NAN)NNNfr.N.parse(JsonOps.INSTANCE, var2).getOrThrow());
   }

   public void m62000(C0114 var1) {
      ((NNuU)f4000[1]).execute(() -> {
         String[] var1x = var1.m16000().split(f3000[0]);
         if (var1x.length != 0) {
            Enum0088.m40000(var1x[0]).ifPresent(C0158::m52000);
         }
      });
   }

   public void m64000(C0122 var1) {
      ((NNuU)f4000[1]).execute(() -> {
         C0153 var1x = NursultanClient.m100000();
         if (var1x.m16000(var1.m14000())) {
            var1x.m22000(var1.m14000(), var1.m12000(), var1.m2000(), var1.m26000(), var1.m16000());
         }
      });
   }

   public void m66000(C0116 var1) {
      ((NNuU)f4000[1]).execute(() -> NursultanClient.m56000().m38000(var1));
   }

   public void m68000(C0121 var1) {
   }

   public void m72000(C0117 var1) {
      ((NNuU)f4000[1])
         .execute(
            () -> NursultanClient.m96000()
               .m30000(new C0970(var1.m12000(), var1.m22000(), new NXi(var1.m18000(), var1.m30000(), var1.m2000()), C0160.m6000(), var1.m40000()))
         );
   }

   public void m74000(IljOmq var1) {
      ((NNuU)f4000[1]).execute(() -> C0901.m22000(var1.m20000()));
   }

   public void m76000(C0109 var1) {
      ((NNuU)f4000[1]).execute(() -> C0163.m48000(var1.m14000()));
   }

   public void m80000(C0110 var1) {
      ((NNuU)f4000[1]).execute(() -> NursultanClient.m100000().m30000(var1.m16000()));
   }

   public void m82000(C0115 var1) {
      ((NNuU)f4000[1]).execute(() -> this.f1000.m50000().addAll(Arrays.asList(var1.m12000())));
   }

   public void m86000(C0112 var1) {
      this.f2000.m58000(new C1216(var1.m22000()));
   }

   public void m88000(OlijOmtIm var1) {
      ((Logger)f4000[0]).error(var1.m12000());
      C0106.m40000((Iface0605)C0884.f2000[0], var1.m12000());
      NNuU.Nq().execute(() -> NursultanClient.m100000().m2000());
      this.f2000.m30000();
      NursultanClient.m82000().m28000();
   }

   public void m90000(C0002 var1) {
      PacketBuf var2 = var1.m26000();
      byte var3 = var1.m16000();
      Base0943 var4 = ((OlOqOnisn)f4000[2]).m12000(var3);
      if (var4 != null) {
         if (var4.m12000()) {
            var4.m16000(var2);
         } else {
            var2.m92000().retain();
            ((NNuU)f4000[1]).execute(() -> {
               try {
                  var4.m16000(var2);
               } finally {
                  var2.m30000();
               }
            });
         }
      }
   }

   private static void m92000() {
      f3000 = new String[]{"\\."};
   }
}
