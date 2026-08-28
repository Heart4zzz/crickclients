package net.minecraft.world.level.block.entity;

import KDFzREm.NAQ;
import KDFzREm.NAc;
import KDFzREm.NCa;
import KDFzREm.NDv;
import KDFzREm.NNCE;
import KDFzREm.NNCZ;
import KDFzREm.NNPD;
import KDFzREm.NNRU;
import KDFzREm.NNRq;
import KDFzREm.Nbl;
import KDFzREm.Nbs;
import KDFzREm.Ned;
import KDFzREm.Ngq;
import KDFzREm.NtY;
import KDFzREm.NxK;
import KDFzREm.Nxa;
import KDFzREm.gQ;
import com.mojang.logging.LogUtils;
import net.caffeinemc.mods.lithium.common.world.blockentity.SupportCache;
import net.caffeinemc.mods.lithium.common.world.listeners.WorldBorderListenerOnce;

class TickingBlockEntity<T extends NAQ> implements NNCE, WorldBorderListenerOnce {
   private final T y;
   private final NNCZ<T> L;
   private boolean u;
   private byte i;

   TickingBlockEntity(T var1, NNCZ<T> var2, NNCZ var3) {
      this.N = var1;
      this.i = 0;
      this.y = (T)var2;
      this.L = var3;
   }

   @Override
   public String toString() {
      return "Level ticker for " + this.method_31706() + "@" + this.method_31705();
   }

   private boolean y(NDv var1, Ned var2) {
      if (this.N()) {
         return !(this.N.J() instanceof NNRq var4) ? true : this.N.g().N(NNRU.field_44856) && var4.method_37116(Ngq.N(var2));
      } else {
         return false;
      }
   }

   private void y() {
      this.i = 1;
      NxK var1 = this.N.J().method_8621();
      var1.N(this);
      boolean var2 = var1.y() == Nxa.field_12753;
      if (var1.N(this.method_31705())) {
         if (var2 || var1.y() == Nxa.field_12754) {
            this.i = (byte)(this.i | 6);
         }
      } else if (var2 || var1.y() == Nxa.field_12756) {
         this.i = (byte)(this.i | 2);
      }
   }

   private NCa N(NDv var1, Ned var2) {
      return this.y.w();
   }

   private boolean N() {
      if (this.i == 0) {
         this.y();
      }

      byte var1 = this.i;
      return (var1 & 3) == 3 ? (var1 & 4) != 0 : this.N.J().method_8621().N(this.method_31705());
   }

   private boolean N(NAc var1, NCa var2) {
      return ((SupportCache)this.y).lithium$isSupported();
   }

   public String method_31706() {
      return NAc.method_11033(this.y.O()).toString();
   }

   public Ned method_31705() {
      return this.y.d();
   }

   public boolean method_31704() {
      return this.y.k();
   }

   public void method_31703() {
      if (!this.y.k() && this.y.l()) {
         Ned var1 = this.y.d();
         NDv var5 = this.N;
         if (this.y(var5, var1)) {
            try {
               NNPD var2 = gQ.N();
               var2.N(this::method_31706);
               var5 = this.N;
               NCa var8 = this.N(var5, var1);
               NAc var10 = this.y.O();
               if (this.N(var10, var8)) {
                  this.L.tick(this.N.m, this.y.d(), var8, this.y);
                  this.u = false;
               } else if (!this.u) {
                  this.u = true;
                  NDv.W
                     .warn(
                        "Block entity {} @ {} state {} invalid for ticking:",
                        new Object[]{LogUtils.defer(this::method_31706), LogUtils.defer(this::method_31705), var8}
                     );
               }

               var2.L();
            } catch (Throwable var7) {
               Nbs var3 = Nbs.N(var7, "Ticking block entity");
               Nbl var4 = var3.N("Block entity being ticked");
               this.y.N(var4);
               throw new NtY(var3);
            }
         }
      }
   }

   public void lithium$onWorldBorderShapeChange(NxK var1) {
      this.i = 0;
   }
}
