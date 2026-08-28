package rw.core;

import KDFzREm.NNNkM;
import KDFzREm.NNRq;
import KDFzREm.NNTs;
import KDFzREm.NNdj;
import KDFzREm.NNdn;
import KDFzREm.NNfq;
import KDFzREm.NNrm;
import KDFzREm.NXi;
import KDFzREm.Ned;
import KDFzREm.NjD;
import KDFzREm.Njx;
import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import net.caffeinemc.mods.lithium.common.util.POIRegistryEntries;
import net.caffeinemc.mods.lithium.common.world.interests.iterator.SinglePointOfInterestTypeFilter;

class C0531 extends Njx {
   private final NNTs f1000;
   private final double f2000;
   private Ned f3000;
   private final List<Ned> f4000 = Lists.newArrayList();
   private final int f5000;
   private boolean f6000;

   public void m2000() {
      super.L();
      this.f1000.method_16826(0);
      this.f1000.f().N(this.f3000.method_10263(), this.f3000.method_10264(), this.f3000.method_10260(), this.f2000);
      this.f6000 = false;
   }

   private boolean m4000() {
      return this.f1000.NQ() && !this.f1000.K().N();
   }

   public C0531(NNTs var1, double var2, int var4) {
      this.f1000 = var1;
      this.f2000 = var2;
      this.f5000 = var4;
      this.N(EnumSet.of(NjD.field_18405));
   }

   private boolean m6000() {
      NNRq var1 = (NNRq)this.f1000.method_73183();
      Ned var2 = this.f1000.method_24515();
      NNdj var10000 = var1.method_19494();
      Predicate var10001 = var0 -> var0.N(NNNkM.m);
      Predicate var10002 = this::m20000;
      NNdn var10003 = NNdn.field_18489;
      NNrm var10 = NNTs.i(this.f1000);
      byte var9 = 48;
      NNdn var7 = var10003;
      Predicate var6 = var10002;
      Predicate var5 = var10001;
      NNdj var4 = var10000;
      Optional var3 = this.m18000(var4, var5, var6, var7, var2, var9, var10);
      if (var3.isEmpty()) {
         return false;
      } else {
         this.f3000 = ((Ned)var3.get()).method_10062();
         return true;
      }
   }

   public void m8000() {
      if (this.f1000.f().U()) {
         NXi var1 = NXi.L(this.f3000);
         NXi var2 = NNfq.N(this.f1000, 16, 7, var1, (float) (Math.PI / 10));
         if (var2 == null) {
            var2 = NNfq.N(this.f1000, 8, 7, var1, (float) (Math.PI / 2));
         }

         if (var2 == null) {
            this.f6000 = true;
            return;
         }

         this.f1000.f().N(var2.M, var2.B, var2.Z, this.f2000);
      }
   }

   private void m10000() {
      if (this.f4000.size() > 2) {
         this.f4000.remove(0);
      }
   }

   public void m12000() {
      if (this.f3000.method_19769(this.f1000.method_73189(), this.f5000)) {
         this.f4000.add(this.f3000);
      }
   }

   public boolean m14000() {
      return this.f1000.f().U()
         ? false
         : this.f1000.T() == null && !this.f3000.method_19769(this.f1000.method_73189(), this.f1000.method_17681() + this.f5000) && !this.f6000;
   }

   private Optional m18000(NNdj var1, Predicate var2, Predicate var3, NNdn var4, Ned var5, int var6, NNrm var7) {
      return var1.N(new SinglePointOfInterestTypeFilter(POIRegistryEntries.HOME_ENTRY), var3, var4, var5, var6, var7);
   }

   private boolean m20000(Ned var1) {
      for (Ned var3 : this.f4000) {
         if (Objects.equals(var1, var3)) {
            return false;
         }
      }

      return true;
   }

   public boolean m22000() {
      this.m10000();
      return this.m4000() && this.m6000() && this.f1000.T() == null;
   }
}
