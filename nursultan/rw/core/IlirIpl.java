package rw.core;

import KDFzREm.NNNNRZ;
import KDFzREm.NOl;
import KDFzREm.NQo;
import java.util.Optional;
import rw.module.AnarchyHelper;
import rw.setting.C0135;

public class IlirIpl extends rw.setting.C0127 {
   public static Object[] f1000;
   public Object[] f2000;

   public IlirIpl(AnarchyHelper var1, String var2, C0135 var3, String var4) {
      super(var1, var2, var3::m36000, var3.m32000(), var4);
      this.m4000();
      this.f2000[0] = var3;
   }

   static {
      ntfClinit();
   }

   private void m4000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[2];
         Object[] var1 = this.f2000;
      }
   }

   private static void m6000() {
      f1000 = new Object[]{10};
   }

   private Optional<Integer> m2000() {
      this.m4000();
      if ((Optional)this.f2000[1] == null) {
         try {
            Optional var6 = ((NOl)((C0135)this.f2000[0]).m36000().a_(NNNNRZ.h, NOl.N)).R();
            this.f2000[1] = var6;
         } catch (IllegalStateException var7) {
            return Optional.empty();
         }
      }

      return (Optional<Integer>)this.f2000[1];
   }

   public boolean m12000(NQo var1) {
      Optional var2 = ((NOl)var1.a_(NNNNRZ.h, NOl.N)).R();
      return (boolean)(var2.isEmpty() ? 0 : this.m2000().map(var1x -> C0876.m68000(var1x, (Integer)var2.get(), 10)).orElse(false));
   }
}
