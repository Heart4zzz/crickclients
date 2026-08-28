package rw.setting;

import KDFzREm.NAN;
import KDFzREm.NNNNRZ;
import KDFzREm.NNNNin;
import KDFzREm.NNNNuc;
import KDFzREm.NNNNur;
import KDFzREm.NNpQ;
import KDFzREm.NNvQ;
import KDFzREm.NOl;
import KDFzREm.NQo;
import KDFzREm.Ngj;
import KDFzREm.Njv;
import java.util.List;
import java.util.Set;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import rw.NursultanClient;
import rw.core.PotionPart;
import rw.data.PotionData;
import rw.data.PotionData2;
import rw.defs.Enum0059;

public class Potion extends C0156 {
   private static short[] f1000;
   private static String[] f2000;
   private static short[] f3000;
   public Object[] f4000;

   private List<PotionData<?>> m4000() {
      this.m8000();
      if ((List)this.f4000[0] == null || (Boolean)NursultanClient.f13000[3]) {
         List var5 = this.m6000();
         this.f4000[0] = var5;
      }

      return (List<PotionData<?>>)this.f4000[0];
   }

   private List<PotionData<?>> m6000() {
      return PotionPart.m10000()
         .m16000(f2000[0], var0 -> (NNNNur)var0.y().method_58694(NNNNRZ.W), this::m40000)
         .m16000(f2000[1], var0 -> (NNvQ)var0.y().method_58694(NNNNRZ.R), (var0, var1) -> (boolean)(var0 == var1 && var0 == NNvQ.field_17274 ? 1 : 0))
         .m16000(f2000[2], var0 -> (NNNNuc)var0.y().method_58694(NNNNRZ.b), this::m30000)
         .m16000(f2000[3], var0 -> (NNNNin)var0.y().method_58694(NNNNRZ.P), this::m28000)
         .m16000(f2000[4], var0 -> (NOl)var0.y().method_58694(NNNNRZ.h), this::m36000)
         .m14000();
   }

   public Potion(NQo var1, String var2, String var3, Enum0059 var4) {
      super(var1, var2, var3, var4);
      this.m8000();
   }

   static {
      ntfClinit();
   }

   private static void m14000() {
      f2000 = new String[]{"lore", "unbreakable", "attributes", "enchantments", "potion"};
   }

   private void m8000() {
      if (this.f4000 == null) {
         this.f4000 = new Object[1];
         Object[] var1 = this.f4000;
      }
   }

   public boolean m10000(NQo var1) {
      PotionData2 var2 = (PotionData2)PotionData2.f4000[0];

      for (PotionData var4 : this.m4000()) {
         if (!var4.m10000((NQo)this.y[5], var1)) {
            var2 = NursultanClient.f13000[3] ? PotionData2.m16000(var4.m8000()) : (PotionData2)PotionData2.f4000[1];
            break;
         }
      }

      if ((Boolean)NursultanClient.f13000[3] && !var2.m12000()) {
         C0106.m42000("AutoBuy [" + this.R() + "] rejected on check: " + var2.m18000());
      }

      return var2.m12000();
   }

   private boolean m28000(NNNNin var1, NNNNin var2) {
      if (this.B() && var2.N().stream().anyMatch(var0 -> var0.N(var0x -> (boolean)(var0x == Ngj.B ? 1 : 0)))) {
         return (boolean)0;
      } else {
         Set var3 = var1.N();
         Set var4 = var2.N();
         return (boolean)(var3.isEmpty() && var4.isEmpty()
            ? 1
            : m32000(var3, var4, (var2x, var3x) -> (boolean)(var2x.N((NNpQ)var3x.i().get()) && var1.N(var2x) == var2.N(var3x) ? 1 : 0)));
      }
   }

   private boolean m30000(NNNNuc var1, NNNNuc var2) {
      return (boolean)(var1.y().isEmpty() && var2.y().isEmpty() ? 1 : m32000(var1.y(), var2.y(), (var0, var1x) -> {
         Njv var2x = var0.y();
         Njv var3 = var1x.y();
         return (boolean)(var0.L() == var1x.L() && var0.N() == var1x.N() && var2x.L() == var3.L() && var2x.y() == var3.y() ? 1 : 0);
      }));
   }

   public static <T> boolean m32000(Iterable<T> var0, Iterable<T> var1, BiPredicate<T, T> var2) {
      return StreamSupport.<Object>stream(var0.spliterator(), false)
         .allMatch(var2x -> StreamSupport.<Object>stream(var1.spliterator(), false).anyMatch(var2xx -> var2.test(var2x, var2xx)));
   }

   private boolean m36000(NOl var1, NOl var2) {
      Iterable var3 = var1.N();
      return (boolean)(!var3.iterator().hasNext()
         ? 1
         : m32000(var3, var2.N(), (var0, var1x) -> (boolean)(var0.i() == var1x.i() && var0.u() == var1x.u() ? 1 : 0)));
   }

   private static String m38000(NNNNur var0) {
      return var0.N().stream().<CharSequence>map(NAN::getString).collect(Collectors.joining());
   }

   private boolean m40000(NNNNur var1, NNNNur var2) {
      String var3 = m38000(var1);
      return (boolean)(!var3.isEmpty() && !m38000(var2).contains(var3) ? 0 : 1);
   }

   private static void m20000() {
      f3000 = new short[]{0, 5, 3, 1};
      f1000 = new short[]{3, 0, 3, 0, 0};
   }
}
