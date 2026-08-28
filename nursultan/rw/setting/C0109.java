package rw.setting;

import KDFzREm.NbK;
import KDFzREm.NjL;
import java.util.Optional;
import rw.core.Base0932;
import rw.core.C0998;
import rw.gui.Tracers;

public class C0109<T extends NjL> extends Base0932<T> {
   private static String[] f1000;
   public Object[] f2000;

   private static void m4000() {
      f1000 = new String[]{"living-color"};
   }

   public C0109(Tracers var1, String var2, boolean var3) {
      super(var1, var2, var3);
      this.m12000();
   }

   static {
      ntfClinit();
   }

   public void m16000(Tracers var1) {
      String var2 = f1000[0];
      Optional.ofNullable((C0998)var1.L(var1.N(var2).m10000())).ifPresentOrElse(var1x -> {
         this.m12000();
         C0998 var6 = (C0998)var1x.N(var1x.Z().or(var1xx -> this.U()));
         this.f2000[0] = var6;
      }, () -> {
         this.m12000();
         C0998 var7 = (C0998)C0122.m6000(var1, var2, -1).N(var1xx -> this.U());
         this.f2000[0] = var7;
      });
   }

   public boolean m22000(NbK var1) {
      return var1 instanceof NjL;
   }

   public int m10000() {
      this.m12000();
      return (Integer)((C0998)this.f2000[0]).i();
   }

   private void m12000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[1];
         Object[] var1 = this.f2000;
      }
   }
}
