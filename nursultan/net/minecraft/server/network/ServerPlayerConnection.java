package net.minecraft.server.network;

import KDFzREm.NAC;
import KDFzREm.NNGK;
import KDFzREm.NNMM;
import KDFzREm.NNMR;
import KDFzREm.NNRc;
import KDFzREm.NNSY;
import KDFzREm.NNvn;
import KDFzREm.NXi;
import KDFzREm.NbK;
import KDFzREm.Nfy;
import it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import net.fabricmc.fabric.mixin.networking.accessor.EntityTrackerAccessor;

public class ServerPlayerConnection implements NNMM, EntityTrackerAccessor {
   final NNMR N;
   final NbK y;
   private final int R;
   NNGK L;
   final Set<NNSY> u;

   private Set L() {
      return new ReferenceOpenHashSet();
   }

   public ServerPlayerConnection(NNvn var1, NbK var2, int var3, int var4, boolean var5) {
      this.i = var1;
      this.u = this.L();
      this.N = new NNMR(var1.u, var2, var4, var5, this);
      this.y = var2;
      this.R = var3;
      this.L = NNGK.N(var2);
   }

   @Override
   public boolean equals(Object var1) {
      return var1 instanceof ServerPlayerConnection ? ((ServerPlayerConnection)var1).y.method_5628() == this.y.method_5628() : false;
   }

   @Override
   public int hashCode() {
      return this.y.method_5628();
   }

   private int y() {
      int var1 = this.R;

      for (NbK var3 : this.y.method_5736()) {
         int var4 = var3.method_5864().W() * 16;
         if (var4 > var1) {
            var1 = var4;
         }
      }

      return this.N(var1);
   }

   public void y(NNRc var1) {
      if (var1 != this.y) {
         NXi var2 = var1.method_73189().u(this.y.method_73189());
         int var3 = this.i.N(var1);
         double var4 = Math.min(this.y(), var3 * 16);
         double var6 = var2.M * var2.M + var2.Z * var2.Z;
         double var8 = var4 * var4;
         boolean var10 = var6 <= var8 && this.y.method_5680(var1) && this.i.N(var1, this.y.method_31476().B, this.y.method_31476().Z);
         if (var10) {
            if (this.u.add(var1.field_13987)) {
               this.N.y(var1);
               if (this.u.size() == 1) {
                  this.i.u.method_74535().N(this.y);
               }

               this.i.u.method_74535().N(var1, this.y);
            }
         } else {
            this.N(var1);
         }
      }
   }

   public void y(NAC<? super Nfy> var1) {
      this.N(var1);
      if (this.y instanceof NNRc var2) {
         var2.field_13987.method_14364(var1);
      }
   }

   private int N(int var1) {
      return this.i.u.method_8503().N(var1);
   }

   public void N(List<NNRc> var1) {
      for (NNRc var3 : var1) {
         this.y(var3);
      }
   }

   public void N(NAC<? super Nfy> var1) {
      for (NNSY var3 : this.u) {
         var3.method_14364(var1);
      }
   }

   public void N(NAC<? super Nfy> var1, Predicate<NNRc> var2) {
      for (NNSY var4 : this.u) {
         if (var2.test(var4.method_32311())) {
            var4.method_14364(var1);
         }
      }
   }

   public void N() {
      for (NNSY var2 : this.u) {
         this.N.N(var2.method_32311());
      }
   }

   public void N(NNRc var1) {
      if (this.u.remove(var1.field_13987)) {
         this.N.N(var1);
         if (this.u.isEmpty()) {
            this.i.u.method_74535().y(this.y);
         }
      }
   }
}
