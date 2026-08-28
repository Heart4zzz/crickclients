package rw.render;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;
import rw.NursultanClient;
import rw.core.C0903;
import rw.data.IlsOnqsqi;
import rw.data.OliOkkns;
import rw.defs.Nuker;

public class ShaderTypes {
   public Object[] f1000;

   public boolean m2000(String var1) {
      return ((Map)this.f1000[0]).containsKey(var1);
   }

   public Stream<String> m4000() {
      return ((Map)this.f1000[0]).keySet().stream();
   }

   public ShaderTypes() {
      this.m6000();
      LinkedHashMap var5 = new LinkedHashMap();
      this.f1000[0] = var5;
   }

   static {
      ntfClinit();
   }

   private void m6000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[1];
         Object[] var1 = this.f1000;
      }
   }

   public List<OliOkkns> m10000() {
      return List.copyOf(((Map)this.f1000[0]).values());
   }

   public boolean m14000(String var1) {
      OliOkkns var2 = (OliOkkns)((Map)this.f1000[0]).remove(var1);
      if (var2 == null) {
         return (boolean)0;
      } else {
         NursultanClient.m8000().m12000(C0903.m26000(var2));
         NursultanClient.m8000().m12000(IlsOnqsqi.m4000((Nuker)Nuker.f1000[0]));
         return (boolean)1;
      }
   }

   public Optional<OliOkkns> m16000(String var1) {
      return Optional.ofNullable((OliOkkns)((Map)this.f1000[0]).get(var1));
   }

   public boolean m18000(String var1, long var2) {
      if (((Map)this.f1000[0]).containsKey(var1)) {
         return (boolean)0;
      } else {
         OliOkkns var4 = new OliOkkns(var1, var2);
         ((Map)this.f1000[0]).put(var1, var4);
         NursultanClient.m8000().m12000(C0903.m30000(var4));
         NursultanClient.m8000().m12000(IlsOnqsqi.m4000((Nuker)Nuker.f1000[0]));
         return (boolean)1;
      }
   }

   public void m20000() {
      if (!((Map)this.f1000[0]).isEmpty()) {
         ((Map)this.f1000[0]).clear();
         NursultanClient.m8000().m12000(C0903.m4000());
         NursultanClient.m8000().m12000(IlsOnqsqi.m4000((Nuker)Nuker.f1000[0]));
      }
   }
}
