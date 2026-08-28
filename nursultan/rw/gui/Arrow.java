package rw.gui;

import KDFzREm.NNIo;
import KDFzREm.NNNYO;
import KDFzREm.NNNZg;
import KDFzREm.NNNxY;
import KDFzREm.NNuU;
import KDFzREm.NQa;
import KDFzREm.NQo;
import KDFzREm.NXi;
import KDFzREm.NbK;
import KDFzREm.NkN;
import KDFzREm.Nky;
import KDFzREm.NwI;
import KDFzREm.Nwx;
import KDFzREm.cz;
import java.util.ArrayList;
import java.util.List;
import org.joml.Matrix4fStack;
import org.joml.Vector2f;
import rw.GuiWidget;
import rw.api.AnnotationDefault;
import rw.api.Iface0642;
import rw.core.C0138;
import rw.core.C0704;
import rw.core.C0721;
import rw.core.C0805;
import rw.core.C0814;
import rw.core.C0836;
import rw.core.C0837;
import rw.core.C0849;
import rw.core.C0854;
import rw.core.C0876;
import rw.core.C0998;
import rw.core.C1003;
import rw.data.Rec0200;
import rw.data.Rec0202;
import rw.defs.Enum0055;
import rw.setting.C0122;

@AnnotationDefault(
   L = "Predictions",
   y = Enum0055.VISUAL,
   N = Enum0070.WORLD
)
public class Arrow extends GuiWidget {
   public static Object[] f1000;
   public Object[] f2000;
   private static String[] f3000;
   private static String[] f4000;
   private static float[] f5000;
   public Object[] f6000;

   private boolean m2000(NbK var1) {
      if (var1.method_24828()) {
         return (boolean)0;
      } else if (var1.field_6014 == var1.method_23317() && var1.field_5969 == var1.method_23321()) {
         return (boolean)0;
      } else if (var1.field_5960) {
         return (boolean)0;
      } else if (!var1.method_5805()) {
         return (boolean)0;
      } else if (var1 instanceof Nky) {
         return (boolean)(!((NNNZg)((NNuU)this.y[0]).T[3]).method_8600(var1, var1.method_5829()).iterator().hasNext() ? 1 : 0);
      } else {
         return (boolean)1;
      }
   }

   public Arrow() {
      this.m12000();
      C0854 var5 = new C0854(f3000[0], true, new C0837((Rec0200)Rec0200.f5000[2]));
      this.f6000[0] = var5;
      C0854 var6 = new C0854(f3000[1], true, new C0849((Rec0200)Rec0200.f5000[1]));
      this.f6000[1] = var6;
      C0854 var7 = new C0854(f3000[2], true, new C0849((Rec0200)Rec0200.f5000[0]));
      this.f2000[0] = var7;
      C0854 var8 = new C0854(f3000[3], true, new C0837((Rec0200)Rec0200.f5000[3]));
      this.f2000[1] = var8;
      C0854 var9 = new C0854(f3000[4], true, new C0837((Rec0200)Rec0200.f5000[4]));
      this.f2000[2] = var9;
      C0854 var10 = new C0854(f4000[0], true, new C0837((Rec0200)Rec0200.f5000[5]));
      this.f2000[3] = var10;
      C1003 var11 = C0122.m4000(
         this, f4000[1], (C0854)this.f6000[1], (C0854)this.f6000[0], (C0854)this.f2000[0], (C0854)this.f2000[1], (C0854)this.f2000[2], (C0854)this.f2000[3]
      );
      this.f2000[4] = var11;
      C0998 var12 = C0122.m6000(this, f4000[2], -11104513);
      this.f2000[5] = var12;
      ArrayList var13 = new ArrayList();
      this.f2000[6] = var13;
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      f5000 = new float[]{1.0F, 5.0F, 1.0F, 5.0F, 0.0F, 4.0F, 0.0F, 4.0F};
   }

   private static void m8000() {
      f1000 = new Object[]{4.0F};
   }

   private static void m10000() {
      f3000 = new String[]{"pearl", "trident", "arrow", "potions", "snowball"};
      f4000 = new String[]{"windcharge", "predict-entity", "line-color", ""};
   }

   private void m12000() {
      if (this.f6000 == null) {
         this.f6000 = new Object[2];
         Object[] var1 = this.f6000;
      }

      if (this.f2000 == null) {
         this.f2000 = new Object[7];
         Object[] var2 = this.f2000;
      }
   }

   private NQo m18000(NbK var1) {
      if (var1 instanceof NkN) {
         return NQa.nz.E();
      } else if (var1 instanceof Nky) {
         return NQa.db.E();
      } else if (var1 instanceof NwI var3) {
         return var3.B();
      } else if (var1 instanceof cz var2) {
         return var2.L();
      } else if (var1 instanceof Nwx) {
         return NQa.jP.E();
      } else {
         return var1 instanceof NNNxY ? NQa.Gz.E() : NQo.E;
      }
   }

   private C0854 m20000(NbK var1) {
      this.m12000();
      if (var1 instanceof NkN) {
         return (C0854)this.f6000[0];
      } else if (var1 instanceof Nky) {
         return (C0854)this.f6000[1];
      } else if (var1 instanceof NwI) {
         return (C0854)this.f2000[0];
      } else if (var1 instanceof cz) {
         return (C0854)this.f2000[1];
      } else if (var1 instanceof Nwx) {
         return (C0854)this.f2000[2];
      } else {
         return var1 instanceof NNNxY ? (C0854)this.f2000[3] : null;
      }
   }

   @Iface0642
   public void m22000(C0721 var1) {
      this.m12000();
      ((List)this.f2000[6]).clear();

      for (NbK var3 : ((NNNZg)((NNuU)this.y[0]).T[3]).M()) {
         C0854 var4 = this.m20000(var3);
         if (var4 != null && var4.U() && this.m2000(var3)) {
            ((List)this.f2000[6]).add(var4.m2000().m22000(var3, var3.method_73189(), var3.method_18798()));
         }
      }
   }

   @Iface0642
   public void m26000(C0138 var1) {
      this.m12000();
      if (!((List)this.f2000[6]).isEmpty()) {
         C0805 var2 = (C0805)C0814.f12000[2];
         NNIo var3 = var1.m2000();
         var3.N();
         NXi var4 = var1.m24000().y();
         Matrix4fStack var5 = var1.m36000();
         int var6 = (Integer)((C0998)this.f2000[5]).i();
         int var7 = C0876.m46000(var6);

         for (Rec0202 var9 : (List)this.f2000[6]) {
            var9.m6000().ifPresent(var2x -> {
               if (var2x.m6000() instanceof cz) {
                  C0836.m36000(var4, var2x.m10000(), f5000[5], var6);
               }
            });
            List var10 = var9.m4000();
            if (!var10.isEmpty()) {
               NXi var11 = (NXi)var10.getFirst();

               for (int var12 = 1; var12 < var10.size(); var12++) {
                  NXi var13 = (NXi)var10.get(var12);
                  NXi var14 = var11.u(var4);
                  NXi var15 = var13.u(var4);
                  var2.m38000()
                     .m42000(var5, (float)var14.M, (float)var14.B, (float)var14.Z)
                     .m42000(var5, (float)var15.M, (float)var15.B, (float)var15.Z)
                     .m26000(C0876.m70000(var6, (int)(Math.min(f5000[0], (var12 - 1) / f5000[1]) * var7)))
                     .m26000(C0876.m70000(var6, (int)(Math.min(f5000[2], var12 / f5000[3]) * var7)))
                     .m30000(f5000[4])
                     .m28000();
                  var11 = var13;
               }
            }
         }

         var3.y();
         C0836.m40000(var1);
      }
   }

   @Iface0642
   public void m28000(C0704 var1) {
      this.m12000();
      if (!((List)this.f2000[6]).isEmpty()) {
         C0805 var2 = (C0805)C0814.f15000[3];
         ZwBs var3 = C0002.m24000();

         for (Rec0202 var5 : (List)this.f2000[6]) {
            var5.m6000().ifPresent(var3x -> {
               NXi var4 = var3x.m10000().u(((NNNYO)((NNuU)this.y[0]).i[5]).s().y());
               Vector2f var5x = IlkOns.m72000((float)var4.M, (float)var4.B, (float)var4.Z);
               if (var5x != null) {
                  var5x = var5x.round();
                  int var6 = var3x.m2000();
                  float var7 = var6 <= 0 ? f5000[6] : (float)var6 / (var3x.m6000().field_6012 + var6);
                  IlkOns.m80000(var3, var2.m18000(), f4000[3], 16, var5x.x, var5x.y, this.m18000(var3x.m6000()), var6, var7);
               }
            });
         }
      }
   }
}
