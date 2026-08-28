package rw.core;

import KDFzREm.NBB;
import KDFzREm.NBM;
import KDFzREm.NBS;
import KDFzREm.NBZ;
import KDFzREm.NBf;
import KDFzREm.NNRc;
import KDFzREm.NNRq;
import KDFzREm.NZZ;
import KDFzREm.NbK;
import KDFzREm.Ned;
import KDFzREm.Ngq;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.Map.Entry;
import rw.api.Iface0515;

public class C0603<T> extends NZZ<T> {
   private final Map<Ngq, C0600<T>> f1000 = new HashMap<>();
   private final Map<Ned, C0600<T>> f2000 = new HashMap<>();
   private final Map<UUID, C0600<T>> f3000 = new HashMap<>();

   public C0603(NBf<T> var1) {
      super(var1);
   }

   protected void m2000(NNRc var1, Ngq var2) {
      C0600 var3 = this.f1000.get(var2);
      if (var3 != null && var3.f2000 != null) {
         var1.field_13987.method_14364(new NBB(var2, this.N.N(var3.f2000)));
      }

      for (Entry var5 : this.f2000.entrySet()) {
         Object var6 = ((C0600)var5.getValue()).f2000;
         if (var6 != null) {
            Ned var7 = (Ned)var5.getKey();
            if (var2.y(var7)) {
               var1.field_13987.method_14364(new NBM(var7, this.N.N(var6)));
            }
         }
      }
   }

   protected void m4000(NNRc var1, NbK var2) {
      C0600 var3 = this.f3000.get(var2.method_5667());
      if (var3 != null && var3.f2000 != null) {
         var1.field_13987.method_14364(new NBZ(var2.method_5628(), this.N.N(var3.f2000)));
      }
   }

   protected void m6000(NNRq var1) {
      for (Entry var3 : this.f1000.entrySet()) {
         NBS var4 = ((C0600)var3.getValue()).m2000(this.N);
         if (var4 != null) {
            Ngq var5 = (Ngq)var3.getKey();
            this.N(var1, var5, new NBB(var5, var4));
         }
      }

      for (Entry var9 : this.f2000.entrySet()) {
         NBS var11 = ((C0600)var9.getValue()).m2000(this.N);
         if (var11 != null) {
            Ned var13 = (Ned)var9.getKey();
            Ngq var6 = new Ngq(var13);
            this.N(var1, var6, new NBM(var13, var11));
         }
      }

      for (Entry var10 : this.f3000.entrySet()) {
         NBS var12 = ((C0600)var10.getValue()).m2000(this.N);
         if (var12 != null) {
            NbK var14 = Objects.requireNonNull(var1.method_66347((UUID)var10.getKey()));
            this.N(var1, var14, new NBZ(var14.method_5628(), var12));
         }
      }
   }

   public void m8000(NNRq var1, Ned var2) {
      C0600 var3 = this.f2000.remove(var2);
      if (var3 != null) {
         Ngq var4 = new Ngq(var2);
         this.N(var1, var4, new NBM(var2, this.N.N()));
      }
   }

   public void m10000(NbK var1) {
      this.f3000.remove(var1.method_5667());
   }

   public void m12000(UUID var1, Iface0515<T> var2) {
      this.f3000.put(var1, new C0600<>(var2));
   }

   protected void m14000() {
      this.f1000.clear();
      this.f2000.clear();
      this.f3000.clear();
   }

   public void m16000(Ngq var1) {
      this.f1000.remove(var1);
      this.f2000.keySet().removeIf(var1::y);
   }

   public void m18000(Ned var1, Iface0515<T> var2) {
      this.f2000.put(var1, new C0600<>(var2));
   }

   public void m20000(Ngq var1, Iface0515<T> var2) {
      this.f1000.put(var1, new C0600<>(var2));
   }
}
