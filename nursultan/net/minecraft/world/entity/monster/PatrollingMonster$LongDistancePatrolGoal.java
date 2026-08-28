package net.minecraft.world.entity.monster;

import KDFzREm.NNrm;
import KDFzREm.NNsH;
import KDFzREm.NXi;
import KDFzREm.Ned;
import KDFzREm.NjD;
import KDFzREm.Njx;
import KDFzREm.NnN;
import KDFzREm.NrY;
import java.util.EnumSet;
import java.util.List;

public class PatrollingMonster$LongDistancePatrolGoal<T extends NNsH> extends Njx {
   private static final int NAVIGATION_FAILED_COOLDOWN = 200;
   private final T y;
   private final double L;
   private final double u;
   private long cooldownUntil;

   public void L() {
   }

   private List<NNsH> findPatrolCompanions() {
      return this.y.method_73183().N(NNsH.class, this.y.method_5829().M(16.0), var1 -> var1.O() && !var1.method_5779(this.y));
   }

   public PatrollingMonster$LongDistancePatrolGoal(T var1, double var2, double var4) {
      this.y = (T)var1;
      this.L = var2;
      this.u = var4;
      this.cooldownUntil = -1L;
      this.N(EnumSet.of(NjD.field_18405));
   }

   private boolean Z() {
      NNrm var1 = this.y.method_59922();
      Ned var2 = this.y.method_73183().N(NrY.field_13203, this.y.method_24515().method_10069(-8 + var1.y(16), 0, -8 + var1.y(16)));
      return this.y.f().N(var2.method_10263(), var2.method_10264(), var2.method_10260(), this.L);
   }

   public void i() {
      boolean var1 = this.y.Q();
      NnN var2 = this.y.f();
      if (var2.U()) {
         List var3 = this.findPatrolCompanions();
         if (this.y.o() && var3.isEmpty()) {
            this.y.B(false);
         } else if (var1 && this.y.l().method_19769(this.y.method_73189(), 10.0)) {
            this.y.I();
         } else {
            NXi var4 = NXi.L(this.y.l());
            NXi var5 = this.y.method_73189();
            NXi var6 = var5.u(var4);
            var4 = var6.y(90.0F).L(0.4).i(var4);
            NXi var7 = var4.u(var5).u().L(10.0).i(var5);
            Ned var8 = Ned.method_49638(var7);
            var8 = this.y.method_73183().N(NrY.field_13203, var8);
            if (!var2.N(var8.method_10263(), var8.method_10264(), var8.method_10260(), var1 ? this.u : this.L)) {
               this.Z();
               this.cooldownUntil = this.y.method_73183().N() + 200L;
            } else if (var1) {
               for (NNsH var10 : var3) {
                  var10.N(var8);
               }
            }
         }
      }
   }

   public void u() {
   }

   public boolean N() {
      boolean var1 = this.y.method_73183().N() < this.cooldownUntil;
      return this.y.o() && this.y.T() == null && !this.y.method_42148() && this.y.d() && !var1;
   }
}
