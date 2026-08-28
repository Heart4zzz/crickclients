package rw.gui;

import KDFzREm.NAN;
import KDFzREm.NFA;
import KDFzREm.NNGc;
import KDFzREm.NNYH;
import KDFzREm.NNuU;
import KDFzREm.NNuo;
import KDFzREm.ow;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import org.joml.Vector2i;
import rw.NursultanClient;
import rw.api.Iface0209;
import rw.api.Iface0642;
import rw.core.C0077;
import rw.core.C0287;
import rw.core.C0297;
import rw.core.C0346;
import rw.core.C0711;
import rw.core.C0712;
import rw.core.C0881;
import rw.core.C1041;
import rw.core.C1108;
import rw.core.C1114;
import rw.core.C1117;
import rw.core.C1133;
import rw.core.LeAm;
import rw.core.OlIrtqjti;
import rw.data.Rec0089;
import rw.data.Rec0090;
import rw.data.Rec0092;
import rw.data.Rec0097;
import rw.defs.Enum0072;
import rw.defs.Enum0081;
import rw.defs.OlmmOsl;
import rw.module.IlmpqOjIi;
import rw.module.OlirIm;
import rw.setting.C0034;
import rw.setting.C0035;
import rw.setting.C0038;
import rw.setting.C0039;
import rw.setting.C0056;
import rw.setting.C0106;

public class Huddumped {
   private static short[] f1000;
   private static short[] f2000;
   private static byte[] f3000;
   private static short[] f4000;
   private static short[] f5000;
   private static boolean[] f6000;
   private static int[] f7000;
   private static short[] f8000;
   private static short[] f9000;
   private static float[] f10000;
   public static Object[] f11000;
   private static short[] f12000;
   private static boolean[] f13000;
   private static long[] f14000;
   private static short[] f15000;
   public Object[] f16000;
   private static float[] f17000;
   private static boolean[] f18000;
   private static short[] f19000;
   private static short[] f20000;
   private static boolean[] f21000;
   private static boolean[] f22000;
   private static short[] f23000;
   private static byte[] f24000;
   private static String[] f25000;

   public boolean m6000() {
      return m40000();
   }

   private static void m8000() {
      f21000 = new boolean[]{true, true, false, false, true};
      f13000 = new boolean[]{true, false};
      f6000 = new boolean[]{true, false};
      f22000 = new boolean[]{false, true, false, true, false, true, false};
      f18000 = new boolean[]{false, false, true};
   }

   private static void m12000() {
      f14000 = new long[]{0L, 0L};
   }

   public Huddumped() {
      this.m48000();
      NNuU var7 = NNuU.Nq();
      this.f16000[f5000[0]] = var7;
      C1117 var1 = NursultanClient.m112000();
      var1.m22000(f25000[0], f25000[1]);
      PdYp var8 = new PdYp(var1);
      this.f16000[f5000[1]] = var8;
      ((PdYp)this.f16000[f5000[2]]).m222000(f21000[0]);
      C1108 var2 = new C1108();
      C0013 var9 = new C0013(new C1041(), var2, new C1114(var2));
      this.f16000[f1000[0]] = var9;
      var2.m32000(((C0013)this.f16000[f1000[1]]).m6000());
      C0035 var10 = new C0035((C0013)this.f16000[f1000[2]]);
      this.f16000[f1000[3]] = var10;
      ((C0035)this.f16000[f1000[4]])
         .m26000(((C0035)this.f16000[f2000[0]]).m14000().m18000(f10000[0]).m20000(new Rec0097(f21000[1], f10000[1], f10000[2], f10000[3])));
      C0039 var11 = C0039.m16000((C0035)this.f16000[f2000[1]], f25000[2], (var0, var1x) -> {
         int var2x = var1x.m2000(f25000[4], C0077::m22000);
         return var1x.m30000((C0297<OlIrtqjti>)OlIrtqjti.f4000[f4000[7]], OlIrtqjti.m40000(var2x), () -> C0287.m26000((C0056)f11000[f20000[0]], var1xx -> {
            ((List)LeAm.f5000[f20000[1]]).forEach(var2xx -> var1xx.y(var1x.m18000(((DragOffset)var2xx).m52000(), ((DragOffset)var2xx).m14000(), null)));
            var1xx.y(var1x.m18000(f25000[5], HudSnapLines::m36000, null));
         }));
      }, null);
      this.f16000[f2000[2]] = var11;
      ((C0013)this.f16000[f2000[3]]).m4000().m16000(((C0039)this.f16000[f2000[4]]).m18000().m20000());
      ((C0039)this.f16000[f2000[5]]).m8000();
      NursultanClient.m8000().m32000(this);
   }

   static {
      ntfClinit();
   }

   private static void m16000() {
      f5000 = new short[]{0, 1, 1};
      f1000 = new short[]{3, 3, 3, 4, 4};
      f2000 = new short[]{4, 4, 2, 3, 2, 2};
      f23000 = new short[]{6, 3, 6, 0, 5, 5, 5, 2};
      f15000 = new short[]{0, 1, 3, 3, 3, 1};
      f12000 = new short[]{2, 3, 3};
      f19000 = new short[]{3, 1, 301, 3, 1};
      f8000 = new short[]{295, 2, 3, 0, 3, 2, 2, 3};
      f9000 = new short[]{3, 3, 4, 4, 4};
      f4000 = new short[]{0, 2, 0, 2, 3, 3, 2, 6};
      f20000 = new short[]{4, 7, 240, 1100};
   }

   private void m18000() {
      boolean var1 = !((C0035)this.f16000[f9000[2]]).m14000().m6000() ? f22000[5] : f22000[6];
      ((C0035)this.f16000[f9000[3]]).m26000(((C0035)this.f16000[f9000[4]]).m14000().m22000(var1).m14000(var1 ? Rec0089.m2000() : Rec0089.f3000));
   }

   public C0038 m22000() {
      return ((C0039)this.f16000[f8000[5]]).m18000();
   }

   private static void m26000() {
      f10000 = new float[]{240.0F, 1100.0F, 16.0F, 4.0F, 0.0F};
      f17000 = new float[]{0.0F, 1.0E9F, 300.0F, 340.0F, 32.0F, 4.0F, 100.0F, 100.0F};
   }

   private static void m28000() {
      f25000 = new String[]{"hud", "icons/atlases/hud", "hud", "Hud dumped ", "accent", "snapGuides"};
   }

   private void m30000() {
      Vector2i var1 = C0881.m20000(((NNuo)((NNuU)this.f16000[f4000[0]]).L[f4000[1]]).i(), ((NNuo)((NNuU)this.f16000[f4000[2]]).L[f4000[3]]).R());
      ((C0013)this.f16000[f4000[4]]).m4000().m18000(var1.x(), var1.y());
   }

   private static void m32000() {
      f3000 = new byte[]{4, 7, 5, 6, 5, 2, 16};
      f24000 = new byte[]{3, 4};
   }

   public float m38000() {
      return ((C0013)this.f16000[f8000[7]]).m6000().m4000();
   }

   public static boolean m40000() {
      return (NNYH)NNuU.Nq().v[f8000[4]] instanceof NNGc;
   }

   private void m44000(rw.module.Huddumped var1) {
      Iface0209 var2 = ((C0013)this.f16000[f8000[2]]).m4000();
      switch (((int[])C1133.f2000[f8000[3]])[var1.m20000().ordinal()]) {
         case 1:
            this.m30000();
            if (var1.m18000()) {
               var2.m26000(var1.m30000(), f22000[1]);
            } else if (var1.m10000()) {
               var2.m26000(var1.m30000(), f22000[2]);
            }
            break;
         case 2:
            boolean var3 = var1.m8000();
            var2.m22000(var1.m30000(), !var1.m18000() && !var3 ? f22000[4] : f22000[3], C0881.m18000(var1.m58000()), var3);
      }
   }

   private void m48000() {
      if (this.f16000 == null) {
         this.f16000 = new Object[f3000[1]];
         Object[] var1 = this.f16000;
         var1[f3000[2]] = f14000[1];
         var1[f3000[3]] = f18000[0];
      }
   }

   @Iface0642(
      y = Enum0081.AFTER_ALL
   )
   public void m50000(rw.module.Huddumped var1) {
      if (!var1.y()) {
         if ((Boolean)NursultanClient.f13000[f19000[0]] && var1.m20000().m26000((Enum0072)Enum0072.f1000[f19000[1]]) && var1.m6000(f19000[2])) {
            this.m18000();
         } else if ((Boolean)NursultanClient.f13000[f19000[3]] && var1.m20000().m26000((Enum0072)Enum0072.f1000[f19000[4]]) && var1.m6000(f8000[0])) {
            try {
               Rec0090 var2 = ((C0039)this.f16000[f8000[1]]).m18000().m24000(Rec0092.m10000().m12000(f6000[0]));
               String var3 = C0034.m8000(var2);
               Path var4 = Path.of("ui_dump_" + System.currentTimeMillis() + ".json");
               Files.writeString(var4, var3, StandardCharsets.UTF_8);
               C0106.m42000(NAN.y(f25000[3]).y(NAN.y(var4.getFileName().toString()).N(var1x -> var1x.N(new NFA(var4.toAbsolutePath().toString())))));
            } catch (Exception var5) {
            }
         } else if (this.m6000()) {
            this.m44000(var1);
         }
      }
   }

   public float m52000(float var1, OlmmOsl var2) {
      return ((C0013)this.f16000[f9000[1]]).m8000().m4000(var1, rw.setting.C0017.m24000(var2));
   }

   @Iface0642
   public void m60000(C0712 var1) {
      ((C0039)this.f16000[f12000[0]]).m8000();
   }

   @Iface0642
   public void m62000(IlmpqOjIi var1) {
      if (this.m6000()) {
         ((C0013)this.f16000[f12000[1]]).m4000().m24000((float)var1.m4000());
      }
   }

   public void m64000() {
      ((C0039)this.f16000[f8000[6]]).m8000();
   }

   @Iface0642
   public void m70000(C0711 var1) {
      boolean var2 = this.m6000();
      if (!var2 && (Boolean)this.f16000[f23000[0]]) {
         ((C0013)this.f16000[f23000[1]]).m4000().m26000(f21000[2], f21000[3]);
      }

      Boolean var14 = var2;
      this.f16000[f23000[2]] = var14;
      if (var2) {
         this.m30000();
      }

      ow var3 = ((NNuU)this.f16000[f23000[3]]).Nt();
      int var4 = Math.max(f21000[4], var3.U());
      int var5 = Math.max(f13000[0], var3.E());
      long var6 = System.nanoTime();
      float var8 = this.f16000[f23000[4]] == f14000[0] ? f10000[4] : Math.max(f17000[0], (float)(var6 - (Long)this.f16000[f23000[5]]) / f17000[1]);
      Long var15 = var6;
      this.f16000[f23000[6]] = var15;
      C0346 var9 = ((C0039)this.f16000[f23000[7]]).m10000(var4, var5, var8);
      if (!var9.m8000().isEmpty()) {
         NursultanClient.m66000().m60000(var1.m22000());
         IlkOns.m94000(((NNuU)this.f16000[f15000[0]]).e(), f13000[1]);
         ((PdYp)this.f16000[f15000[1]]).m144000(var1.m22000(), var9, ((C0013)this.f16000[f15000[2]]).m6000().m4000());
         if ((Boolean)NursultanClient.f13000[f15000[3]]) {
            C0002.m16000()
               .m86000(f17000[2], f17000[3])
               .m102000(f17000[4])
               .m50000(f7000[0])
               .m40000(f17000[5])
               .m98000((OlmmOsl)OlmmOsl.f7000[f15000[4]])
               .m28000(f7000[1])
               .m62000("hud " + ((PdYp)this.f16000[f15000[5]]).m12000())
               .m4000();
         }
      }
   }

   public static void m74000(float var0) {
      Huddumped var1 = NursultanClient.m42000();
      ((C0013)var1.f16000[f4000[5]]).m6000().m6000(var0);
      ((C0039)var1.f16000[f4000[6]]).m8000();
   }

   @Iface0642
   public void m78000(OlirIm var1) {
      if (this.m6000()) {
         ((C0013)this.f16000[f12000[2]]).m4000().m14000(var1.m2000());
      }
   }

   public float m80000(String var1, float var2, OlmmOsl var3) {
      return ((C0013)this.f16000[f9000[0]]).m8000().m6000(var1, var2, rw.setting.C0017.m24000(var3));
   }

   private static void m84000() {
      f7000 = new int[]{1677721600, -6305237};
   }

   private static void m86000() {
      f11000 = new Object[]{240, 1100, 16, 4, null};
   }
}
