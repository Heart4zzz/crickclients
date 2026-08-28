package rw.core;

import KDFzREm.NNNZZ;
import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import KDFzREm.NXi;
import KDFzREm.NjL;
import rw.NursultanClient;
import rw.api.Iface0647;
import rw.gui.AttackAura;

public class C0768 {
   public static Object[] f1000;
   private static float[] f2000;
   public Object[] f3000;

   public boolean m2000() {
      AttackAura var1 = NursultanClient.m88000().m30000();
      return (boolean)(var1 != null && var1.m68000() ? 1 : 0);
   }

   private static void m6000() {
      f1000 = new Object[]{null};
   }

   C0768() {
      this.m18000();
      C0757 var5 = new C0757();
      this.f3000[0] = var5;
      C0044 var6 = new C0044();
      this.f3000[1] = var6;
      Long var7 = System.currentTimeMillis();
      this.f3000[4] = var7;
   }

   static {
      ntfClinit();
   }

   public int m12000() {
      return 800;
   }

   private void m18000() {
      if (this.f3000 == null) {
         this.f3000 = new Object[6];
         Object[] var1 = this.f3000;
         var1[2] = f2000[0];
         var1[3] = false;
         var1[4] = 0L;
         var1[5] = 0;
      }
   }

   public int m22000() {
      return (Integer)this.f3000[5];
   }

   public C0044 m24000() {
      return (C0044)this.f3000[1];
   }

   public C0983 m26000(NjL var1) {
      NXi var2 = HlPo.m6000(var1, C0989.m28000(), (Float)this.f3000[2]);
      return var2 != null ? C0070.m14000(var2) : C0989.m28000();
   }

   public void m34000(float var1, boolean var2, boolean var3) {
      Float var8 = var1;
      this.f3000[2] = var8;
      Boolean var9 = var2;
      this.f3000[3] = var9;
   }

   public boolean m36000(NjL var1, C0983 var2) {
      return HlPo.m4000(var1, var2, (Float)this.f3000[2]);
   }

   public float m38000(NjL var1) {
      return (Float)this.f3000[2];
   }

   public boolean m40000() {
      if ((NNNwS)((NNuU)f1000[0]).T[4] != null && (NNNZZ)((NNuU)f1000[0]).T[2] != null) {
         AttackAura var1 = NursultanClient.m88000().m30000();
         int var2 = var1 != null ? Math.max(1, ((Base0764)var1.m22000().i()).m32000() - 1) : 9;
         return (boolean)(((Iface0647)((NNNZZ)((NNuU)f1000[0]).T[2])).m2000() >= var2 ? 1 : 0);
      } else {
         return (boolean)0;
      }
   }

   public void m44000(float var1) {
      Float var6 = var1;
      this.f3000[2] = var6;
      ((C0044)this.f3000[1]).m20000();
      Integer var7 = (Integer)this.f3000[5] + 1;
      this.f3000[5] = var7;
   }

   private static void m46000() {
      f2000 = new float[]{0.0F};
   }
}
