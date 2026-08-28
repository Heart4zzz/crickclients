package rw.module;

import rw.Module;
import rw.core.C1231;
import rw.defs.Enum0072;
import rw.defs.SfDz;
import rw.gui.PgUp;

public class Huddumped extends Module {
   public static Object[] f1000;
   private static boolean[] f2000;
   private static boolean[] f3000;
   private static boolean[] f4000;
   public Object[] f5000;

   private boolean m2000(PgUp var1, int var2) {
      ll0Opq<"qkwyn",-1564783736,-607534457,-607534447,-607534448,-1564783736,-1564783736>(this);
      return var2 != 0 && C1231.m22000(var1, (Integer)this.f5000[1]) != var2 ? f4000[6] : f4000[5];
   }

   public boolean m4000(PgUp var1) {
      return this.m44000(var1.m8000());
   }

   public boolean m6000(int var1) {
      return (boolean)(this.m18000() && this.m24000(var1) ? 1 : 0);
   }

   public boolean m8000() {
      return this.m32000().m30000((SfDz)SfDz.f1000[2]);
   }

   @Override
   public boolean m10000() {
      return this.m32000().m30000((SfDz)SfDz.f1000[1]);
   }

   public Huddumped() {
      this.m28000();
   }

   static {
      ntfClinit();
   }

   public boolean m18000() {
      return this.m32000().m30000((SfDz)SfDz.f1000[0]);
   }

   public Enum0072 m20000() {
      this.m28000();
      return (Enum0072)this.f5000[4];
   }

   public int m22000() {
      this.m28000();
      return (Integer)this.f5000[2];
   }

   private boolean m24000(int var1) {
      return this.m30000() == var1 ? f4000[3] : f4000[4];
   }

   private void m28000() {
      if (this.f5000 == null) {
         this.f5000 = new Object[5];
         Object[] var1 = this.f5000;
         var1[0] = 0;
         var1[1] = 0;
         var1[2] = 0;
      }
   }

   public int m30000() {
      this.m28000();
      return (Integer)this.f5000[0];
   }

   public SfDz m32000() {
      this.m28000();
      return (SfDz)this.f5000[3];
   }

   public boolean m36000(PgUp var1) {
      return this.m6000(var1.m8000());
   }

   public boolean m38000(PgUp var1, int var2) {
      return (boolean)(this.m36000(var1) && this.m2000(var1, var2) ? 1 : 0);
   }

   public boolean m40000(int var1) {
      return (boolean)(this.m10000() && this.m24000(var1) ? 1 : 0);
   }

   private static void m42000() {
      f1000 = new Object[]{null};
   }

   public boolean m44000(int var1) {
      return this.m8000() && this.m24000(var1) ? f4000[1] : f4000[2];
   }

   public boolean m46000(PgUp var1) {
      return this.m40000(var1.m8000());
   }

   public boolean m48000(PgUp var1, int var2) {
      return (boolean)(this.m46000(var1) && this.m2000(var1, var2) ? 1 : f4000[0]);
   }

   public static Huddumped m50000(int var0, int var1, int var2, SfDz var3, Enum0072 var4) {
      Huddumped var10000 = (Huddumped)f1000[0];
      Integer var9 = var0;
      var10000.f5000[0] = var9;
      var10000 = (Huddumped)f1000[0];
      Integer var10 = var1;
      var10000.f5000[1] = var10;
      var10000 = (Huddumped)f1000[0];
      Integer var11 = var2;
      var10000.f5000[2] = var11;
      ((Huddumped)f1000[0]).f5000[4] = var4;
      ((Huddumped)f1000[0]).f5000[3] = var3;
      return (Huddumped)f1000[0];
   }

   public static Huddumped m52000(int var0, SfDz var1, Enum0072 var2) {
      Huddumped var3 = new Huddumped();
      Integer var8 = var0;
      var3.f5000[0] = var8;
      Integer var9 = var0;
      var3.f5000[2] = var9;
      Integer var10 = 0;
      var3.f5000[1] = var10;
      var3.f5000[3] = var1;
      var3.f5000[4] = var2;
      return var3;
   }

   private static void m54000() {
      f2000 = new boolean[]{false, true, false, true, false, true, false, true};
      f4000 = new boolean[]{false, true, false, true, false, true, false};
      f3000 = new boolean[]{false, false, false, true, false, false, true};
   }

   public int m58000() {
      this.m28000();
      return (Integer)this.f5000[1];
   }
}
