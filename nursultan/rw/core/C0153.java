package rw.core;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;
import org.joml.Vector3d;
import rw.NursultanClient;
import rw.data.IltrpOnqk;

public class C0153 {
   private static byte[] f1000;
   public Object[] f2000;

   public void m2000() {
      if (!((Map)this.f2000[0]).isEmpty() || !((Set)this.f2000[1]).isEmpty()) {
         ((Map)this.f2000[0]).clear();
         ((Set)this.f2000[1]).clear();
         NursultanClient.m8000().m12000(C0912.m26000());
      }
   }

   private static void m6000() {
      f1000 = new byte[]{2};
   }

   public C0153() {
      this.m8000();
      LinkedHashMap var5 = new LinkedHashMap();
      this.f2000[0] = var5;
      LinkedHashSet var6 = new LinkedHashSet();
      this.f2000[1] = var6;
   }

   static {
      ntfClinit();
   }

   private void m8000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[2];
         Object[] var1 = this.f2000;
      }
   }

   public Collection<IltrpOnqk> m12000() {
      return Collections.unmodifiableCollection(((Map)this.f2000[0]).values());
   }

   public boolean m14000() {
      return ((Map)this.f2000[0]).isEmpty();
   }

   public boolean m16000(String var1) {
      IltrpOnqk var2 = (IltrpOnqk)((Map)this.f2000[0]).get(var1);
      return (boolean)(var2 != null && !var2.m8000().equals(((C0959)NursultanClient.f13000[2]).m20000()) ? 1 : 0);
   }

   public Stream<String> m20000() {
      return ((Map)this.f2000[0]).keySet().stream();
   }

   public void m22000(String var1, String var2, double var3, double var5, double var7) {
      for (C0130 var10 : (Set)this.f2000[1]) {
         if (((String)var10.f2000[0]).equals(var1)) {
            ((Vector3d)var10.f2000[3]).set((Vector3d)var10.f2000[4]);
            ((Vector3d)var10.f2000[4]).set(var3, var5, var7);
            var10.m30000(System.currentTimeMillis());
            return;
         }
      }

      ((Set)this.f2000[1]).add(new C0130(var1, var2, new Vector3d(var3, var5, var7)));
   }

   public void m28000(long var1, long var3) {
      ((Set)this.f2000[1]).removeIf(var4 -> (boolean)(var3 - ((C0130)var4).f2000[2] > var1 ? 1 : 0));
   }

   public void m30000(IltrpOnqk[] var1) {
      if (var1.length == 0) {
         this.m2000();
      } else {
         ((Map)this.f2000[0]).clear();
         ((Set)this.f2000[1]).clear();

         for (IltrpOnqk var5 : var1) {
            ((Map)this.f2000[0]).put(var5.m12000(), var5);
         }

         NursultanClient.m8000().m12000(C0912.m22000(var1));
      }
   }

   public Collection<C0130> m32000() {
      return Collections.unmodifiableCollection((Set)this.f2000[1]);
   }

   public boolean m34000(String var1) {
      return ((Map)this.f2000[0]).containsKey(var1);
   }
}
