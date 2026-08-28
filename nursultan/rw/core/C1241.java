package rw.core;

import KDFzREm.Fo;
import KDFzREm.NDP;
import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import KDFzREm.NkG;
import KDFzREm.Nkq;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.ArrayList;
import rw.api.Iface0673;
import rw.data.Rec0306;
import rw.data.Rec0313;

public class C1241 {
   public Object[] f1000;
   public static Object[] f2000;

   public void m4000() {
      ((C1227)Iljntl<"csrbwe",409283566,1223490022,1223490023,1223490021,752846806,-1191848882,-246424405>(this)[2]).m10000(this);
   }

   public C1241() {
      this.m8000();
      ArrayList var5 = new ArrayList();
      this.f1000[0] = var5;
      ArrayList var6 = new ArrayList();
      this.f1000[1] = var6;
      C1227 var7 = (C1227)f2000[0];
      this.f1000[2] = var7;
      Integer var8 = -1;
      this.f1000[3] = var8;
   }

   static {
      ntfClinit();
   }

   private void m8000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[5];
         Object[] var1 = this.f1000;
         var1[3] = 0;
         var1[4] = false;
      }
   }

   public C1241 m12000() {
      ((C1227)this.f1000[2]).m12000(this);
      return this;
   }

   private static void m14000() {
      f2000 = new Object[]{null};
   }

   public boolean m16000() {
      return ((C1227)this.f1000[2]).m4000(this);
   }

   public C1241 m20000(NDP var1) {
      return this.m32000(new Rec0306(var1.N(), var1.y(), var1.L(), var1.u(), var1.M(), var1.Z(), var1.B()));
   }

   public void m24000() {
      ((C1227)this.f1000[2]).m32000(this);
   }

   public C1241 m26000(Iface0673 var1) {
      ((C1227)this.f1000[2]).m14000(var1, this);
      return this;
   }

   public C1241 m28000(C1227 var1) {
      this.f1000[2] = var1;
      return this;
   }

   public C1241 m30000(NDP var1) {
      return this.m42000(new Rec0313(var1.N(), var1.L(), var1.u(), var1.M()));
   }

   public C1241 m32000(Rec0306 var1) {
      ((C1227)this.f1000[2]).m30000(var1, this);
      return this;
   }

   public C1241 m34000(Iface0673 var1) {
      ((C1227)this.f1000[2]).m34000(var1, this);
      return this;
   }

   public C1241 m36000() {
      ((C1227)this.f1000[2]).m6000(this);
      return this;
   }

   public C1241 m38000(int var1, int var2, int var3, Nkq var4) {
      return this.m42000(new Rec0313(var1, var2, var3, var4));
   }

   public C1241 m40000(int var1, short var2, byte var3, Nkq var4) {
      NkG var5 = (NkG)((NNNwS)NNuU.Nq().T[4]).fields_07fa3311b0e9d3e9b883d09222919bf5a[3];
      int var6 = var5.z();
      Int2ObjectOpenHashMap var7 = new Int2ObjectOpenHashMap();
      Fo var8 = Fo.y(var5.L(var2).i(), NNuU.Nq().NE().Q());
      var7.put(var2, var8);
      return this.m32000(new Rec0306(var1, var6, var2, var3, var4, var8, var7));
   }

   public C1241 m42000(Rec0313 var1) {
      ((C1227)this.f1000[2]).m20000(var1, this);
      return this;
   }
}
