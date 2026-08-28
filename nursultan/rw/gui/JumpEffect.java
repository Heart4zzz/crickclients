package rw.gui;

import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import KDFzREm.NXi;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.lwjgl.BufferUtils;
import rw.GuiWidget;
import rw.api.AnnotationDefault;
import rw.api.Iface0642;
import rw.core.C0011;
import rw.core.C0012;
import rw.core.C0138;
import rw.core.C0721;
import rw.core.C0741;
import rw.core.C0747;
import rw.core.C0830;
import rw.core.C0988;
import rw.core.C0998;
import rw.core.IlksOmts;
import rw.core.KrHa;
import rw.core.OlppikpIs;
import rw.data.Rec0004;
import rw.defs.Enum0055;
import rw.defs.Enum0081;
import rw.setting.C0082;
import rw.setting.C0122;

@AnnotationDefault(
   L = "JumpEffect",
   y = Enum0055.VISUAL,
   N = Enum0070.WORLD
)
public class JumpEffect extends GuiWidget {
   public Object[] f1000;
   private static float[] f2000;
   public Object[] f3000;
   private static float[] f4000;
   private static String[] f5000;
   public static Object[] f6000;
   private static float[] f7000;

   public JumpEffect() {
      this.m18000();
      C0988 var5 = C0122.m12000(this, f5000[0], f4000[0], f4000[1], f4000[2], f4000[3]);
      this.f3000[0] = var5;
      C0988 var6 = C0122.m12000(this, f5000[1], f7000[0], f7000[1], f7000[2], f7000[3]);
      this.f3000[1] = var6;
      C0998 var7 = C0122.m6000(this, f5000[2], -11104513);
      this.f3000[2] = var7;
      C0998 var8 = C0122.m6000(this, f5000[3], -11104513);
      this.f3000[3] = var8;
      ArrayList var9 = new ArrayList();
      this.f3000[4] = var9;
      FloatBuffer var10 = BufferUtils.createFloatBuffer(40);
      this.f1000[0] = var10;
      C0830 var11 = C0830.m42000((Rec0004)C0011.f5000[2], 4096, 1024);
      this.f1000[2] = var11;
      C0012 var12 = KrHa.m18000(() -> ((NNuU)this.y[0]).e().N, () -> ((NNuU)this.y[0]).e().y);
      this.f1000[3] = var12;
      IlksOmts var13 = IlksOmts.<C0138>m22000()
         .m18000(new C0082(this, (C0830)this.f1000[2]))
         .m36000((C0012)this.f1000[3])
         .m50000(() -> IlkOns.m74000(((NNuU)this.y[0]).e()))
         .m46000(33990, () -> IlkOns.m46000(((NNuU)this.y[0]).e()))
         .m32000(new C0747(this, (C0830)this.f1000[2]))
         .m4000(((NNuU)this.y[0])::e)
         .m10000((C0012)this.f1000[3])
         .m52000();
      this.f1000[4] = var13;
   }

   static {
      ntfClinit();
   }

   private static void m12000() {
      f6000 = new Object[]{8};
   }

   private static void m14000() {
      f5000 = new String[]{"radius", "wave-amplitude", "first-color", "second-color"};
   }

   private void m18000() {
      if (this.f3000 == null) {
         this.f3000 = new Object[5];
         Object[] var1 = this.f3000;
      }

      if (this.f1000 == null) {
         this.f1000 = new Object[5];
         Object[] var2 = this.f1000;
         var2[1] = 0;
      }
   }

   private static void m6000() {
      f4000 = new float[]{2.0F, 1.0F, 2.5F, 0.1F};
      f7000 = new float[]{1.0F, 0.1F, 3.0F, 0.05F, 0.0F, 0.0F, 0.0F, 0.0F};
      f2000 = new float[]{0.0F};
   }

   @Iface0642
   public void m22000(OlppikpIs var1) {
      this.m18000();
      ((List)this.f3000[4]).add(new C0741(((NNNwS)((NNuU)this.y[0]).T[4]).method_73189()));
   }

   @Iface0642(
      y = Enum0081.AFTER_ALL
   )
   public void m24000(C0138 var1) {
      this.m18000();
      if (!((List)this.f3000[4]).isEmpty()) {
         ((IlksOmts)this.f1000[4]).m8000(var1);
      }
   }

   void m26000(NXi var1, float var2) {
      this.m18000();
      ((FloatBuffer)this.f1000[0]).clear();
      int var3 = Math.max(0, ((List)this.f3000[4]).size() - 8);

      for (int var4 = 0; var4 < 8; var4++) {
         int var5 = var3 + var4;
         if (var5 < ((List)this.f3000[4]).size()) {
            C0741 var6 = (C0741)((List)this.f3000[4]).get(var5);
            ((FloatBuffer)this.f1000[0]).put((float)(((NXi)var6.f1000[0]).M - var1.M));
            ((FloatBuffer)this.f1000[0]).put((float)(((NXi)var6.f1000[0]).B - var1.B));
            ((FloatBuffer)this.f1000[0]).put((float)(((NXi)var6.f1000[0]).Z - var1.Z));
            ((FloatBuffer)this.f1000[0]).put((Float)((C0988)this.f3000[0]).i() * var6.m24000(var2));
            ((FloatBuffer)this.f1000[0]).put(var6.m22000(var2));
         } else {
            ((FloatBuffer)this.f1000[0]).put(f7000[4]).put(f7000[5]).put(f7000[6]).put(f7000[7]).put(f2000[0]);
         }
      }
   }

   @Iface0642
   public void m30000(C0721 var1) {
      this.m18000();
      Integer var8 = (Integer)this.f1000[1] + 1;
      this.f1000[1] = var8;
      Iterator var2 = ((List)this.f3000[4]).iterator();

      while (var2.hasNext()) {
         C0741 var3 = (C0741)var2.next();
         var3.m4000();
         if (var3.m28000()) {
            var2.remove();
         }
      }
   }
}
