package rw.setting;

import KDFzREm.NAN;
import KDFzREm.NNBK;
import KDFzREm.NNG;
import KDFzREm.NNMH;
import KDFzREm.NNNG;
import KDFzREm.NNNZQ;
import KDFzREm.NNO;
import KDFzREm.NNPP;
import KDFzREm.NNag;
import KDFzREm.NNal;
import KDFzREm.NNdc;
import KDFzREm.NNg;
import KDFzREm.NNl;
import KDFzREm.NNt;
import KDFzREm.NNw;
import KDFzREm.NNxm;
import KDFzREm.NNzw;
import KDFzREm.NPh;
import com.google.common.collect.Lists;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
class C0072 extends NNg {
   private static final int f1000 = 60;
   private final NNNG f2000;
   protected final List<NNzw> f3000;
   private final NNxm<Boolean> f4000;
   private final NNxm<Boolean> f5000;
   private final NNxm<Boolean> f6000;
   private final String f7000;
   private final boolean f8000;

   public C0072(NNO var1, NNNG var2) {
      this.f9000 = var1;
      this.f3000 = Lists.newArrayList();
      this.f2000 = var2;
      NNG var3 = NNt.N(var2);
      this.f8000 = var3 != null && var3.method_72753(NNO.y(var1).h());
      Object var4 = this.m10000(var2, var0 -> {
         WrapOperationRuntime.checkArgumentCount(var0, 1, "[net.minecraft.class_2960]");
         return ((NNNG)var0[0]).N();
      });
      if (this.f8000) {
         this.f7000 = (String)var4;
      } else {
         this.f7000 = NPh.field_1056 + var4;
      }

      this.f4000 = NNxm.N(NNO.N.L().y(-2142128), NNO.N.L().y(-4539718), false)
         .N()
         .N(this::m14000)
         .N(10, 5, 60, 16, NAN.y((String)var4), (var2x, var3x) -> this.m16000(var2, NNw.field_61593));
      this.f5000 = NNxm.N(NNO.y.L().y(-171), NNO.y.L().y(-4539718), false)
         .N()
         .N(this::m14000)
         .N(10, 5, 60, 16, NAN.y((String)var4), (var2x, var3x) -> this.m16000(var2, NNw.field_61594));
      this.f6000 = NNxm.N(NNO.L.L().y(-1), NNO.L.L().y(-4539718), false)
         .N()
         .N(this::m14000)
         .N(10, 5, 60, 16, NAN.y((String)var4), (var2x, var3x) -> this.m16000(var2, NNw.field_61595));
      this.f3000.add(this.f6000);
      this.f3000.add(this.f5000);
      this.f3000.add(this.f4000);
      this.m6000();
   }

   public void m6000() {
      NNw var1 = ((NNl)NNO.R(this.f9000).L[0]).N(this.f2000);
      this.f4000.N(var1 == NNw.field_61593);
      this.f5000.N(var1 == NNw.field_61594);
      this.f6000.N(var1 == NNw.field_61595);
      this.f4000.field_22763 = !(Boolean)this.f4000.y();
      this.f5000.field_22763 = !(Boolean)this.f5000.y();
      this.f6000.field_22763 = !(Boolean)this.f6000.y();
   }

   private String m10000(NNNG var1, Operation var2) {
      return !"minecraft".equals(var1.y()) ? var1.toString() : (String)var2.call(new Object[]{var1});
   }

   private NNag m14000(NNxm<Boolean> var1) {
      NNw var2 = ((NNl)NNO.L(this.f9000).L[0]).N(this.f2000);
      NNag var3 = NAN.N("debug.entry.currently." + var2.method_15434(), new Object[]{this.f7000});
      return NNal.N(var3, var1.method_25369());
   }

   private void m16000(NNNG var1, NNw var2) {
      ((NNl)NNO.u(this.f9000).L[0]).N(var1, var2);

      for (NNdc var4 : this.f9000.R) {
         var4.field_22763 = true;
      }

      this.m6000();
   }

   public List<? extends NNPP> method_25396() {
      return this.f3000;
   }

   public List<? extends NNNZQ> method_37025() {
      return this.f3000;
   }

   public void method_25343(NNBK var1, int var2, int var3, boolean var4, float var5) {
      int var6 = this.method_73380();
      int var7 = this.method_73382();
      var1.y((NNMH)NNO.i(this.f9000).i[3], this.f7000, var6, var7 + 5, this.f8000 ? -1 : -8355712);
      int var8 = var6 + this.method_73387() - this.f6000.method_25368() - this.f5000.method_25368() - this.f4000.method_25368();
      if (!this.f8000 && var4 && var2 < var8) {
         var1.N(NNO.u, var2, var3);
      }

      this.f6000.method_46421(var8);
      this.f5000.method_46421(this.f6000.method_46426() + this.f6000.method_25368());
      this.f4000.method_46421(this.f5000.method_46426() + this.f5000.method_25368());
      this.f4000.method_46419(var7);
      this.f5000.method_46419(var7);
      this.f6000.method_46419(var7);
      this.f4000.method_25394(var1, var2, var3, var5);
      this.f5000.method_25394(var1, var2, var3, var5);
      this.f6000.method_25394(var1, var2, var3, var5);
   }
}
