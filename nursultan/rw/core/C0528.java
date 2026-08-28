package rw.core;

import KDFzREm.FF;
import KDFzREm.NGx;
import KDFzREm.NHp;
import KDFzREm.NNNJV;
import KDFzREm.NNNqi;
import KDFzREm.NNTn;
import KDFzREm.NNTs;
import KDFzREm.NNcO;
import KDFzREm.NQo;
import KDFzREm.Nbx;
import KDFzREm.NjD;
import KDFzREm.Njx;
import it.unimi.dsi.fastutil.ints.Int2LongOpenHashMap;
import java.util.EnumSet;
import net.caffeinemc.mods.lithium.common.world.LithiumData;
import org.jspecify.annotations.Nullable;

public class C0528<T extends NNTs> extends Njx {
   private final T f1000;
   private Int2LongOpenHashMap f2000;
   @Nullable
   private FF f3000;
   @Nullable
   private NGx f4000;

   public void m2000() {
      this.f1000.f().N(this.f3000, 1.15F);
   }

   private boolean m4000() {
      if (!this.f1000.NQ()) {
         return true;
      } else if (this.f1000.K().N()) {
         return true;
      } else if (!this.f1000.v()) {
         return true;
      } else {
         NQo var10000 = this.f1000.method_6118(Nbx.field_6169);
         NHp var2 = this.f1000.method_56673().N(NNNqi.NF);
         if (NQo.N(var10000, this.m14000(var2))) {
            return true;
         } else {
            NNTs var1 = this.f5000.i.y(this.f1000.NO());
            return var1 != null && var1.method_5805();
         }
      }
   }

   public C0528(T var1, NNTs var2) {
      this.f5000 = var1;
      this.f2000 = new Int2LongOpenHashMap();
      this.f1000 = (T)var2;
      this.N(EnumSet.of(NjD.field_18405));
   }

   public void m6000() {
      if (this.f4000 != null && this.f4000.method_24516(this.f1000, 1.414)) {
         this.f1000.N(N(this.f5000.method_73183()), this.f4000);
      }
   }

   public void m8000() {
      this.f3000 = null;
      this.f4000 = null;
   }

   public boolean m10000() {
      if (this.f4000 == null || this.f3000 == null) {
         return false;
      } else if (this.f4000.method_31481()) {
         return false;
      } else {
         return this.f3000.L() ? false : !this.m4000();
      }
   }

   public boolean m12000() {
      if (this.m4000()) {
         return false;
      } else {
         Int2LongOpenHashMap var1 = new Int2LongOpenHashMap();
         double var2 = this.f5000.method_45325(NNcO.P);

         for (NGx var6 : this.f1000.method_73183().N(NGx.class, this.f1000.method_5829().L(var2, 8.0, var2), NNTs.u)) {
            long var7 = this.f2000.getOrDefault(var6.method_5628(), Long.MIN_VALUE);
            if (this.f5000.method_73183().N() < var7) {
               var1.put(var6.method_5628(), var7);
            } else {
               FF var9 = this.f1000.f().N(var6, 1);
               if (var9 != null && var9.z()) {
                  this.f3000 = var9;
                  this.f4000 = var6;
                  return true;
               }

               var1.put(var6.method_5628(), this.f5000.method_73183().N() + 600L);
            }
         }

         this.f2000 = var1;
         return false;
      }
   }

   private NQo m14000(NNNJV var1) {
      NQo var2 = ((LithiumData)this.f1000.method_73183()).lithium$getData().ominousBanner();
      if (var2 == null) {
         var2 = NNTn.N(var1);
      }

      return var2;
   }
}
