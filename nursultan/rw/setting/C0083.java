package rw.setting;

import KDFzREm.NbK;
import KDFzREm.NjL;
import java.util.Optional;
import rw.core.Base0738;
import rw.core.C0988;
import rw.core.C0998;
import rw.gui.Friends;

public class C0083<T extends NjL> extends Base0738<T> {
   private static String[] f1000;
   private static float[] f2000;
   public Object[] f3000;

   public int m4000() {
      this.m6000();
      return (Integer)((C0998)this.f3000[1]).i();
   }

   public C0083(Friends var1, String var2, boolean var3) {
      super(var1, var2, var3);
      this.m6000();
   }

   static {
      ntfClinit();
   }

   private void m6000() {
      if (this.f3000 == null) {
         this.f3000 = new Object[2];
         Object[] var1 = this.f3000;
      }
   }

   private static void m8000() {
      f2000 = new float[]{90.0F, 70.0F, 140.0F, 1.0F};
   }

   private static void m10000() {
      f1000 = new String[]{"living-radius", "living-color"};
   }

   public void m18000(Friends var1) {
      String var2 = f1000[0];
      String var3 = f1000[1];
      Optional.ofNullable((C0988)var1.L(var1.N(var2).m10000())).ifPresentOrElse(var1x -> {
         this.m6000();
         C0988 var6 = (C0988)var1x.N(var1x.Z().or(var1xx -> this.U()));
         this.f3000[0] = var6;
      }, () -> {
         this.m6000();
         C0988 var7 = (C0988)C0122.m12000(var1, var2, f2000[0], f2000[1], f2000[2], f2000[3]).N(var1xx -> this.U());
         this.f3000[0] = var7;
      });
      Optional.ofNullable((C0998)var1.L(var1.N(var3).m10000())).ifPresentOrElse(var1x -> {
         this.m6000();
         C0998 var6 = (C0998)var1x.N(var1x.Z().or(var1xx -> this.U()));
         this.f3000[1] = var6;
      }, () -> {
         this.m6000();
         C0998 var7 = (C0998)C0122.m6000(var1, var3, -1).N(var1xx -> this.U());
         this.f3000[1] = var7;
      });
   }

   @Override
   public float m18000() {
      this.m6000();
      return (Float)((C0988)this.f3000[0]).i();
   }

   public boolean m26000(NbK var1) {
      return var1 instanceof NjL;
   }
}
