package rw.core;

import KDFzREm.NAd;
import KDFzREm.NNNCu;
import KDFzREm.NNag;
import KDFzREm.NNpD;
import KDFzREm.NNpx;
import java.util.Optional;

public class C1188 implements NNNCu {
   private static short[] f1000;
   public Object[] f2000;
   private static boolean[] f3000;

   private void m4000() {
      this.f2000 = new Object[1];
   }

   private C1188(String var1, Object... var2) {
      this.m4000();
      String var7 = C1235.m36000(var1).formatted(var2);
      this.f2000[f1000[1]] = var7;
   }

   private C1188(String var1) {
      this.m4000();
      String var6 = C1235.m36000(var1);
      this.f2000[f1000[0]] = var6;
   }

   static {
      ntfClinit();
   }

   @Override
   public String toString() {
      return "clientTranslatableText{" + (String)this.f2000[f1000[4]] + "}";
   }

   private static void m6000() {
      f3000 = new boolean[]{true};
   }

   private static void m8000() {
      f1000 = new short[]{0, 0, 0, 0, 0, 0};
   }

   public static NNag m12000(String var0) {
      return NNag.N(new C1188(var0));
   }

   public static NNag m16000(String var0, Object... var1) {
      return NNag.N(new C1188(var0, var1));
   }

   public String comp_737() {
      return (String)this.f2000[f1000[5]];
   }

   public <T> Optional<T> method_27660(NNpD<T> var1, NAd var2) {
      return var1.accept(var2, (String)this.f2000[f1000[3]]);
   }

   public <T> Optional<T> method_27659(NNpx<T> var1) {
      return var1.accept((String)this.f2000[f1000[2]]);
   }
}
