package rw.core;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;
import rw.NursultanClient;
import rw.data.IlsOnqsqi;
import rw.data.Rec0305;
import rw.defs.Nuker;

public class C1222 {
   public Object[] f1000;

   public List<Rec0305> m4000() {
      return List.copyOf(((Map)this.f1000[0]).values());
   }

   public Optional<Rec0305> m6000(String var1) {
      return Optional.ofNullable((Rec0305)((Map)this.f1000[0]).get(var1));
   }

   public C1222() {
      this.m28000();
      LinkedHashMap var5 = new LinkedHashMap();
      this.f1000[0] = var5;
   }

   static {
      ntfClinit();
   }

   public boolean m12000(String var1) {
      return ((Map)this.f1000[0]).containsKey(var1);
   }

   public void m14000() {
      if (!((Map)this.f1000[0]).isEmpty()) {
         ((Map)this.f1000[0]).clear();
         NursultanClient.m8000().m12000(IlsOnqsqi.m4000((Nuker)Nuker.f1000[2]));
      }
   }

   public boolean m18000(String var1, String var2, int var3) {
      if (((Map)this.f1000[0]).containsKey(var1)) {
         return (boolean)0;
      } else {
         ((Map)this.f1000[0]).put(var1, new Rec0305(var1, var2, var3));
         NursultanClient.m8000().m12000(IlsOnqsqi.m4000((Nuker)Nuker.f1000[2]));
         return (boolean)1;
      }
   }

   public Stream<String> m20000() {
      return ((Map)this.f1000[0]).keySet().stream();
   }

   public List<Rec0305> m22000(int var1) {
      return ((Map)this.f1000[0]).values().stream().filter(var1x -> (boolean)(var1x.m10000() == var1 ? 1 : 0)).toList();
   }

   public boolean m24000(String var1) {
      int var2 = ((Map)this.f1000[0]).remove(var1) != null ? 1 : 0;
      if (var2 != 0) {
         NursultanClient.m8000().m12000(IlsOnqsqi.m4000((Nuker)Nuker.f1000[2]));
      }

      return (boolean)var2;
   }

   private void m28000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[1];
         Object[] var1 = this.f1000;
      }
   }
}
