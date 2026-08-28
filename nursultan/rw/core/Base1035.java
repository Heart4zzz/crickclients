package rw.core;

import KDFzREm.NNNNRZ;
import KDFzREm.NNNNug;
import KDFzREm.NQo;
import KDFzREm.NpG;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import rw.api.Iface0606;
import rw.gui.HolyHelper;

public abstract class Base1035 extends Base1022<HolyHelper> {
   public Object[] f1000;
   private static short[] f2000;
   private static String[] f3000;

   @Override
   public Iface0606 m2000() {
      return var1 -> {
         this.m4000();
         NNNNug var2 = (NNNNug)var1.y().method_58694(NNNNRZ.y);
         if (var2 == null) {
            return (boolean)0;
         } else {
            Optional var3 = (Optional)((MapCodec)this.f1000[0]).codec().parse(NpG.N, var2.y()).getOrThrow();
            return (boolean)(!var3.<Boolean>map(var1x -> {
               this.m4000();
               return ((Optional)((MapCodec)this.f1000[1]).codec().parse(NpG.N, var1x.y()).getOrThrow()).orElse(f3000[0]).equals(this.N());
            }).orElse(false) && !this.m12000(var1) ? 0 : 1);
         }
      };
   }

   private static void m4000() {
      f3000 = new String[]{""};
   }

   public Base1035(HolyHelper var1, String var2, String var3, String var4) {
      super(var1, var2);
      this.m4000();
      MapCodec var9 = NNNNug.L.optionalFieldOf(var3);
      this.f1000[0] = var9;
      MapCodec var10 = Codec.STRING.optionalFieldOf(var4);
      this.f1000[1] = var10;
   }

   static {
      ntfClinit();
   }

   private void m4000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[2];
         Object[] var1 = this.f1000;
      }
   }

   private static void m6000() {
      f2000 = new short[]{0, 1, 0, 1};
   }

   private boolean m12000(NQo var1) {
      return (boolean)(var1.N(this.y().B()) && var1.Y().getString().contains(this.u()) ? 1 : 0);
   }
}
