package rw.core;

import KDFzREm.NCM;
import KDFzREm.NDP;
import KDFzREm.NDT;
import KDFzREm.NNNwS;
import KDFzREm.NNNww;
import KDFzREm.NNYH;
import KDFzREm.NNeZ;
import KDFzREm.NNnq;
import KDFzREm.NNuU;
import KDFzREm.gB;
import java.util.Iterator;
import java.util.List;
import org.apache.logging.log4j.Logger;
import rw.api.Iface0673;
import rw.data.OljplImi;
import rw.data.Rec0306;
import rw.data.Rec0313;
import rw.module.AttackAura_x_x;
import rw.module.AutoAccept;
import rw.module.Blink;

public class OlkOrn extends C1227 {
   private static short[] f1000;
   private static short[] f2000;
   private static short[] f3000;
   private static short[] f4000;
   private static short[] f5000;
   private static short[] f6000;
   private static short[] f7000;
   private static short[] f8000;
   private static short[] f9000;
   public Object[] f10000;
   private static short[] f11000;
   private static short[] f12000;
   private static short[] f13000;
   private static short[] f14000;
   private static short[] f15000;
   public static Object[] f16000;
   private static short[] f17000;
   private static short[] f18000;

   private void m2000(Iface0673 var1, C1241 var2) {
      if (C1181.m46000(((NNNww)((NNNwS)((NNuU)this.u[0]).T[4]).L[1]).field_54155)) {
         ((List)var2.f1000[0]).add(var1);
      } else {
         Boolean var7 = true;
         var2.f1000[4] = var7;
         var1.m6000((NNuU)this.u[0]);
      }
   }

   public void m4000(C1241 var1) {
      this.m8000();
      if (!(Boolean)this.f10000[1]) {
         Boolean var6 = true;
         this.f10000[1] = var6;
         super.m6000(var1);
      }
   }

   private void m8000() {
      if (this.f10000 == null) {
         this.f10000 = new Object[3];
         Object[] var1 = this.f10000;
         var1[0] = false;
         var1[1] = false;
         var1[2] = false;
      }
   }

   public boolean m2000(C1241 var1) {
      this.m8000();
      return (boolean)(((List)var1.f1000[0]).isEmpty() && !this.f10000[2] ? 0 : 1);
   }

   public OlkOrn() {
      this.m8000();
   }

   static {
      ntfClinit();
   }

   public void m4000(C1241 var1) {
      if (C1181.m46000(((NNNww)((NNNwS)((NNuU)this.u[0]).T[4]).L[1]).field_54155)) {
         ((List)var1.f1000[0]).add(new OljplImi(() -> {
            if (!C1181.m46000(((NNNww)((NNNwS)((NNuU)this.u[0]).T[4]).L[1]).field_54155)) {
               this.m4000(var1);
            }
         }));
      } else {
         super.m6000(var1);
      }
   }

   @Override
   public void m6000(C1241 var1) {
      this.m8000();
      if (!((List)var1.f1000[0]).isEmpty() && (Integer)var1.f1000[3] == this.m22000() || (Boolean)var1.f1000[f8000[0]] && !(Boolean)this.f10000[f8000[1]]) {
         try {
            Iterator var2 = ((List)var1.f1000[0]).iterator();

            while (var2.hasNext()) {
               Iface0673 var3 = (Iface0673)var2.next();
               if (!var3.m8000((NNuU)this.u[0])) {
                  Integer var8 = this.m22000() + 1;
                  var1.f1000[3] = var8;
                  return;
               }

               var3.m6000((NNuU)this.u[0]);
               var2.remove();
            }

            if (!(Boolean)this.f10000[1]) {
               Boolean var9 = true;
               var1.f1000[4] = var9;
               ((NNuU)this.u[0]).NE().N(new NDT(0));
            }

            Boolean var10 = false;
            this.f10000[1] = var10;
            ((List)var1.f1000[1]).removeIf(var1x -> {
               var1x.m6000((NNuU)this.u[0]);
               return (boolean)1;
            });
            ((List)var1.f1000[0]).clear();
            ((List)var1.f1000[1]).clear();
         } catch (Exception var12) {
            ((Logger)f16000[0]).error(var12.getMessage(), var12.getCause());
            Boolean var11 = false;
            this.f10000[1] = var11;
            ((List)var1.f1000[0]).clear();
            ((List)var1.f1000[1]).clear();
         }
      }
   }

   private static void m12000() {
      f4000 = new short[]{0, 4, 1};
      f9000 = new short[]{0, 0, 0};
      f1000 = new short[]{0, 2, 0, 4, 1, 0, 0};
      f11000 = new short[]{4, 1};
      f3000 = new short[]{0, 1, 1, 3, 3};
      f17000 = new short[]{0, 3};
      f8000 = new short[]{4, 0};
      f12000 = new short[]{0, 0, 3};
      f18000 = new short[]{0, 1, 4, 0, 1, 1, 0, 1};
      f13000 = new short[]{0, 1, 0, 1, 0, 4, 2};
      f15000 = new short[]{4, 0, 2, 4, 0, 4, 0};
      f6000 = new short[]{0, 0, 3, 2};
      f14000 = new short[]{2, 0, 3, 2, 0};
      f7000 = new short[]{3, 2, 3};
      f2000 = new short[]{3, 3, 3, 3, 0, 4};
      f5000 = new short[]{1, 0, 4, 0, 0, 0, 4, 1};
   }

   @Override
   public void m8000(C1241 var1) {
      Integer var6 = this.m20000();
      var1.f1000[3] = var6;
   }

   @Override
   public void m12000(C1241 var1) {
      if (C1181.m46000(((NNNww)((NNNwS)((NNuU)this.u[0]).T[4]).L[1]).field_54155)) {
         ((List)var1.f1000[0]).add(new OljplImi(() -> this.m4000(var1)));
      } else {
         super.m6000(var1);
      }
   }

   @Override
   public void m14000(Iface0673 var1, C1241 var2) {
      ((List)var2.f1000[0]).add(var1);
   }

   public int m20000() {
      return 2;
   }

   public void m18000(OltqiIqs var1, C1241 var2) {
      if ((Integer)var2.f1000[3] > 1) {
         var1.m10000(new gB(false, false, false, false, false, false, false));
      }
   }

   @Override
   public void m20000(Rec0313 var1, C1241 var2) {
      this.m2000(var1, var2);
   }

   public void m22000(AttackAura_x_x var1, C1241 var2) {
      if ((Integer)var2.f1000[3] > 1) {
         C1181.m50000(var1);
      }
   }

   public void m24000(Rec0306 var1, C1241 var2) {
      if (!C1181.m46000(((NNNww)((NNNwS)((NNuU)this.u[0]).T[4]).L[1]).field_54155)) {
         var1.m12000((NNuU)this.u[0]);
      } else {
         ((List)var2.f1000[0]).add(var1);
      }
   }

   public void m26000(Blink var1, C1241 var2) {
      this.m8000();
      switch (var1.m2000()) {
         case NDT var5:
            if ((Boolean)var2.f1000[4] || (Boolean)this.f10000[0]) {
               Boolean var11 = false;
               var2.f1000[4] = var11;
               Boolean var12 = false;
               this.f10000[0] = var12;
               return;
            }

            if (((List)var2.f1000[0]).isEmpty()) {
               if (!((NNYH)((NNuU)this.u[0]).v[3] instanceof NNeZ) || !(Boolean)this.f10000[2]) {
                  var1.N();
               }

               Boolean var13 = false;
               this.f10000[2] = var13;
            } else if ((NNYH)((NNuU)this.u[0]).v[3] instanceof NNeZ) {
               var2.m4000();
               Boolean var14 = false;
               this.f10000[2] = var14;
               var1.N();
            }
            break;
         case NDP var6:
            if ((NNYH)((NNuU)this.u[0]).v[3] instanceof NNeZ) {
               var2.m20000(var6);
               Boolean var15 = true;
               this.f10000[2] = var15;
               var1.N();
            }
            break;
         default:
      }
   }

   public void m28000(C1241 var1) {
      Integer var6 = this.m20000();
      var1.f1000[3] = var6;
      var1.m36000();
   }

   public void m30000(Iface0673 var1, C1241 var2) {
      this.m2000(var1, var2);
   }

   public int m22000() {
      return 1;
   }

   public void m32000(AutoAccept var1, C1241 var2) {
      this.m8000();
      Object var3 = var1.m6000();
      switch (var3) {
         case NNnq var6:
            Boolean var12 = true;
            this.f10000[0] = var12;
            Boolean var13 = true;
            var2.f1000[4] = var13;
            Boolean var14 = false;
            this.f10000[2] = var14;
            break;
         case NCM var7:
            Boolean var15 = false;
            var2.f1000[4] = var15;
            Boolean var16 = false;
            this.f10000[0] = var16;
            Boolean var17 = false;
            this.f10000[2] = var17;
            break;
         default:
      }
   }

   private static void m24000() {
      f16000 = new Object[]{null};
   }

   public void m36000(C1241 var1) {
      if ((Integer)var1.f1000[3] >= 0) {
         Integer var6 = (Integer)var1.f1000[3] - 1;
         var1.f1000[3] = var6;
      }
   }
}
