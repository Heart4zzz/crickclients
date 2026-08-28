package rw.setting;

import KDFzREm.NNNNRZ;
import KDFzREm.NNNNug;
import KDFzREm.NQl;
import KDFzREm.NQo;
import KDFzREm.NpG;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.Supplier;
import rw.api.Iface0606;
import rw.core.Base1022;
import rw.module.AnarchyHelper;

public class C0127 extends Base1022<AnarchyHelper> {
   private static short[] f1000;
   private static String[] f2000;
   public Object[] f3000;

   @Override
   public Iface0606 m2000() {
      return var1 -> {
         this.m18000();
         NNNNug var2 = (NNNNug)var1.y().method_58694(NNNNRZ.y);
         int var3 = var2 != null && ((Optional)((MapCodec)this.f3000[0]).codec().parse(NpG.N, var2.y()).getOrThrow()).orElse(f2000[1]).equals(this.m14000())
            ? 1
            : 0;
         return (boolean)(var3 == 0 && !this.m16000(var1) ? 0 : 1);
      };
   }

   private static void m4000() {
      f1000 = new short[]{1, 2, 3, 0, 1, 2, 3, 0};
   }

   public C0127(AnarchyHelper var1, String var2, Supplier<NQo> var3, String var4, String var5) {
      super(var1, var2);
      this.m18000();
      this.f3000[1] = var3;
      this.f3000[2] = var4;
      this.f3000[3] = var5;
      MapCodec var13 = Codec.STRING.optionalFieldOf(f2000[0]);
      this.f3000[0] = var13;
   }

   public C0127(AnarchyHelper var1, String var2, NQl var3, String var4, String var5) {
      this(var1, var2, var3::E, var4, var5);
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      f2000 = new String[]{"don-item", ""};
   }

   @Override
   public String m8000() {
      this.m18000();
      return (String)this.f3000[2];
   }

   public NQo m10000() {
      this.m18000();
      return (NQo)((Supplier)this.f3000[1]).get();
   }

   public String m14000() {
      this.m18000();
      return (String)this.f3000[3];
   }

   public boolean m16000(NQo var1) {
      return var1.Y().getString().toLowerCase().contains(this.m8000().toLowerCase());
   }

   private void m18000() {
      if (this.f3000 == null) {
         this.f3000 = new Object[4];
         Object[] var1 = this.f3000;
      }
   }
}
