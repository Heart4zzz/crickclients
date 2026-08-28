package rw.gui;

import java.util.function.Supplier;
import rw.GuiWidget;
import rw.api.AnnotationDefault;
import rw.api.Iface0642;
import rw.core.C0156;
import rw.core.C0742;
import rw.core.C0988;
import rw.core.C1000;
import rw.defs.Enum0055;
import rw.setting.C0122;

@AnnotationDefault(
   L = "TimeChanger",
   y = Enum0055.VISUAL,
   N = Enum0070.WORLD
)
public class TimeChanger extends GuiWidget {
   private static float[] f1000;
   private static String[] f2000;
   private static String[] f3000;
   public Object[] f4000;

   public TimeChanger() {
      this.m6000();
      C0742 var5 = new C0742(f3000[0], this::m18000, false);
      this.f4000[0] = var5;
      C1000 var6 = C0122.m18000(
         this,
         f3000[1],
         new C0742(f3000[2], () -> 23100, false),
         new C0742(f3000[3], () -> 100, false),
         new C0742(f3000[4], () -> 5000, true),
         new C0742(f3000[5], () -> 12000, false),
         new C0742(f2000[0], () -> 12500, false),
         new C0742(f2000[1], () -> 17000, false),
         (C0742)this.f4000[0]
      );
      this.f4000[1] = var6;
      C0988 var7 = (C0988)C0122.m12000(this, f2000[2], f1000[0], f1000[1], f1000[2], f1000[3]).N(var1 -> {
         this.m6000();
         return ((C0742)this.f4000[0]).U();
      });
      this.f4000[2] = var7;
   }

   static {
      ntfClinit();
   }

   private void m6000() {
      if (this.f4000 == null) {
         this.f4000 = new Object[3];
         Object[] var1 = this.f4000;
      }
   }

   private static void m8000() {
      f1000 = new float[]{120.0F, 0.0F, 240.0F, 1.0F};
   }

   private int m18000() {
      this.m6000();
      return ((Float)((C0988)this.f4000[2]).i()).intValue() * 100;
   }

   @Iface0642
   public void m32000(C0156 var1) {
      this.m6000();
      int var2 = (Integer)((Supplier)((C0742)((C1000)this.f4000[1]).i()).f1000[0]).get();
      if (var2 != -1) {
         long var3 = var1.m24000() - Math.floorMod(var1.m24000(), 24000L);
         var1.m20000(var3 + var2);
      }
   }

   private static void m40000() {
      f3000 = new String[]{"select", "time", "dawn", "morning", "day", "evening"};
      f2000 = new String[]{"sunset", "night", "select"};
   }
}
