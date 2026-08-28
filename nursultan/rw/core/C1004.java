package rw.core;

import java.util.function.Supplier;
import rw.data.Rec0312;

public class C1004 extends Base1014<C0979> {
   private static float[] f1000;
   private static String[] f2000;
   public Object[] f3000;

   public Supplier<String> m2000() {
      this.m16000();
      return (Supplier<String>)this.f3000[2];
   }

   public C0979 m4000() {
      this.m16000();
      return (C0979)this.f3000[0];
   }

   public C1004(Rec0312 var1, C0979 var2, C0979 var3, float var4) {
      super(var1, m30000(var2, var3));
      this.m16000();
      Supplier var9 = () -> f2000[1];
      this.f3000[2] = var9;
      var2.m24000();
      this.f3000[0] = var2;
      Float var11 = var4;
      this.f3000[1] = var11;
   }

   static {
      ntfClinit();
   }

   private static void m10000() {
      f2000 = new String[]{"", ""};
   }

   private static void m12000() {
      f1000 = new float[]{0.0F};
   }

   private void m16000() {
      if (this.f3000 == null) {
         this.f3000 = new Object[3];
         Object[] var1 = this.f3000;
         var1[1] = f1000[0];
      }
   }

   public void m26000(C0979 var1) {
      this.m16000();
      super.m34000(m30000((C0979)this.f3000[0], var1));
   }

   public C1004 m28000(Supplier<String> var1) {
      this.m16000();
      Supplier var6 = var1 == null ? () -> f2000[0] : var1;
      this.f3000[2] = var6;
      return this;
   }

   private static C0979 m30000(C0979 var0, C0979 var1) {
      float var2 = Math.clamp(var1.m32000(), var0.m32000(), var0.m2000());
      float var3 = Math.clamp(var1.m2000(), var0.m32000(), var0.m2000());
      C0979 var4 = new C0979(var2, var3);
      var4.m30000(var0);
      return var4;
   }

   public float m32000() {
      this.m16000();
      return (Float)this.f3000[1];
   }
}
