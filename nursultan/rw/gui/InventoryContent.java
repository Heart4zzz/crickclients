package rw.gui;

import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import KDFzREm.NQo;
import rw.NursultanClient;
import rw.api.Iface0202;
import rw.api.Iface0639;
import rw.api.Iface0642;
import rw.core.C0076;
import rw.core.C0286;
import rw.core.C0287;
import rw.core.C0288;
import rw.core.C0296;
import rw.core.C0297;
import rw.core.C0876;
import rw.core.C0902;
import rw.core.OlIrtqjti;
import rw.data.Oljjtpnom;
import rw.setting.C0031;
import rw.setting.C0056;

@Iface0639(
   u = "inventory",
   i = 100.0F,
   N = 320.0F
)
public class InventoryContent extends DragOffset {
   private static boolean[] f1000;
   private static boolean[] f2000;
   private static float[] f3000;
   public static Object[] f4000;
   private static boolean[] f5000;
   private static boolean[] f6000;
   private static byte[] f7000;
   private static byte[] f8000;
   private static float[] f9000;
   private static float[] f10000;
   private static float[] f11000;
   private static short[] f12000;
   private static boolean[] f13000;
   private static byte[] f14000;
   private static byte[] f15000;
   private static byte[] f16000;
   private static byte[] f17000;
   private static short[] f18000;
   private static boolean[] f19000;
   private static float[] f20000;
   private static boolean[] f21000;
   public static Object[] f22000;
   private static boolean[] f23000;
   private static int[] f24000;
   private static float[] f25000;
   private static byte[] f26000;
   public static Object[] f27000;
   private static byte[] f28000;
   private static byte[] f29000;
   private static byte[] f30000;
   private static String[] f31000;
   public static Object[] f32000;
   private static byte[] f33000;
   private static short[] f34000;
   public static Object[] f35000;
   private static short[] f36000;
   public static Object[] f37000;
   private static boolean[] f38000;
   private static byte[] f39000;

   private static void m4000() {
      f22000 = new Object[]{null, f31000[7], 9, 3, 9, 16};
      f35000 = new Object[]{32, 1, 296, 98, 1};
      f32000 = new Object[]{297, 100};
      f37000 = new Object[]{361, 1, 14, 2, 10};
      f27000 = new Object[]{-16777216, null, null, null, null, null};
      f4000 = new Object[]{null, null, null, null, null, null, null, null};
   }

   public InventoryContent() {
      super(InventoryContent::m24000);
   }

   static {
      ntfClinit();
   }

   private static C0031 m12000(int var0) {
      String var1 = "itemSlot" + var0;
      NQo var2 = (NNNwS)((NNuU)f22000[f18000[0]]).T[f18000[1]] == null
         ? NQo.E
         : ((NNNwS)((NNuU)f22000[f18000[2]]).T[f18000[3]]).method_31548().method_5438(var0);
      return C0287.m26000((C0056)f4000[f18000[4]], var2x -> {
         var2x.N(var1);
         if (!var2.R()) {
            Oljjtpnom var3 = NursultanClient.m66000().m70000(var2);
            if (var3.m4000()) {
               C0056[] var10000 = new C0056[f8000[0]];
               var10000[f6000[2]] = (C0056)f4000[f36000[2]];
               var10000[f6000[3]] = C0056.m130000().m114000(var3.m22000(), var3.m28000(), var3.m30000(), var3.m14000());
               C0056 var4 = C0056.m120000(var10000);
               var2x.L(var2xx -> ((C0286)var2xx.N(var1 + "-icon")).m2000(NursultanClient.m66000().m42000()).N(var4));
            }

            m50000(var2x, var1, var2);
            m24000(var2x, var1, var2);
         }
      });
   }

   private static C0031 m16000() {
      return C0287.m26000((C0056)f27000[f34000[2]], var0 -> {
         var0.N(f31000[0]);

         for (int var1 = f13000[0]; var1 < f8000[1]; var1++) {
            float var2 = var1 * f8000[2] + f8000[3];
            int var3 = var1;
            var0.N(var2x -> {
               C0288 var10000 = (C0288)var2x.N("inventoryVDivider-" + var3);
               C0056[] var10001 = new C0056[f28000[1]];
               var10001[f38000[1]] = (C0056)f4000[f12000[0]];
               var10001[f38000[2]] = C0056.m130000().m170000(var2, f20000[4]);
               var10000.N(C0056.m120000(var10001));
            });
         }

         for (int var4 = f13000[1]; var4 < f8000[4]; var4++) {
            float var6 = var4 * f8000[5] + f39000[0];
            int var8 = var4;
            var0.N(var2x -> {
               C0288 var10000 = (C0288)var2x.N("inventoryHDivider-" + var8);
               C0056[] var10001 = new C0056[f28000[0]];
               var10001[f13000[4]] = (C0056)f4000[f36000[4]];
               var10001[f38000[0]] = C0056.m130000().m170000(f20000[3], var6);
               var10000.N(C0056.m120000(var10001));
            });
         }

         for (int var5 = f13000[2]; var5 < f39000[1]; var5++) {
            int var7 = var5;
            var0.N((C0056)f27000[f36000[3]], var1x -> {
               var1x.N("inventoryRow-" + var7);

               for (int var2x = f13000[3]; var2x < f39000[2]; var2x++) {
                  int var3x = f15000[0] + var7 * f15000[1] + var2x;
                  var1x.y(m12000(var3x));
               }
            });
         }
      });
   }

   private static void m6000() {
      f24000 = new int[]{-16777216};
   }

   private static void m8000() {
      f20000 = new float[]{1.0F, 14.0F, 1.0F, 0.0F, 0.0F, 16.0F, 16.0F};
      f3000 = new float[]{0.0F, 361.0F, 100.0F, 12.0F, 11.0F, 297.0F, 100.0F};
      f10000 = new float[]{1.0F, 1.0F, 100.0F, 32.0F, 1.0F, 32.0F, 32.0F, 8.0F};
      f25000 = new float[]{16.0F, 16.0F};
      f11000 = new float[]{1.0F, 13.0F, 14.0F, 2.0F, 0.0F, 0.0F};
      f9000 = new float[]{1.0F, 98.0F, 296.0F, 1.0F, 8.0F, 1.0F};
   }

   private static void m10000() {
      f31000 = new String[]{
         "inventoryContent", "inventoryWindow", "inventoryDivider", "inventoryIconArea", "hud-inventory", "icon:hud/inventory", "minecraft", "itemSlot"
      };
   }

   private static void m12000() {
      f34000 = new short[]{6, 1, 4};
      f18000 = new short[]{0, 4, 0, 4, 0, 2};
      f36000 = new short[]{3, 7, 1, 5, 5};
      f12000 = new short[]{4, 2, 3, 3, 255, 296, 297, 361};
   }

   private static void m14000() {
      f6000 = new boolean[]{false, true, false, true};
      f13000 = new boolean[]{false, false, false, false, false};
      f38000 = new boolean[]{true, false, true};
      f23000 = new boolean[]{false, false, false, false, false};
      f1000 = new boolean[]{false, true, true, true, false, true, false};
      f2000 = new boolean[]{false, false};
      f21000 = new boolean[]{true, false, true};
      f5000 = new boolean[]{false, true, true};
      f19000 = new boolean[]{true, false, true, false, true, true, false, false};
   }

   public boolean m20000() {
      return NursultanClient.m88000().m160000().U();
   }

   private static void m24000(C0288 var0, String var1, NQo var2) {
      int var3 = var2.c();
      if (var3 > f6000[1]) {
         String var4 = Integer.toString(var3);
         var0.N((C0056)f4000[f36000[0]], var2x -> {
            var2x.N(var1 + "-count");
            var2x.y(var2xx -> ((C0296)var2xx.N(var1 + "-count-text")).m2000(var4).N((C0056)f4000[f36000[1]]));
         });
      }
   }

   private static C0031 m24000(Void var0, Iface0202 var1) {
      OlIrtqjti var2 = var1.m28000((C0297<OlIrtqjti>)OlIrtqjti.f4000[f34000[0]]);
      return C0287.m26000((C0056)f27000[f34000[1]], var1x -> {
         var1x.N(f31000[1]);
         var1x.N((C0056)f27000[f12000[1]], var1xx -> {
            var1xx.N(f31000[3]);
            var1xx.L(var1xxx -> ((C0286)var1xxx.N(f31000[4])).m2000(f31000[5]).N(((rw.core.C0097)f27000[f12000[3]]).m8000(var2)));
         });
         var1x.N(var0xx -> ((C0288)var0xx.N(f31000[2])).N((C0056)C0076.f5000[f12000[2]]));
         var1x.y(m16000());
      });
   }

   @Iface0642
   public void m46000(C0902 var1) {
      if (this.m20000()) {
         NursultanClient.m42000().m64000();
      }
   }

   private static void m50000(C0288 var0, String var1, NQo var2) {
      if (var2.m()) {
         int var3 = var2.s();
         if (var3 > 0) {
            float var4 = f20000[0] - (float)var2.P() / var3;
            int var5 = Math.max(f6000[0], Math.round(var4 * f20000[1]));
            int var6 = C0876.m60000(var4);
            var0.N((C0056)f4000[f18000[5]], var3x -> {
               var3x.N(var1 + "-damageBg");
               if (var5 > 0) {
                  C0056 var4x = C0056.m130000().m78000(var5, f20000[2]).m86000(var6);
                  var3x.N(var2xx -> ((C0288)var2xx.N(var1 + "-damageBar")).N(var4x));
               }
            });
         }
      }
   }

   private static void m56000() {
      f8000 = new byte[]{2, 8, 33, 32, 2, 33};
      f39000 = new byte[]{32, 3, 9};
      f15000 = new byte[]{9, 9};
      f28000 = new byte[]{2, 2, 2};
      f30000 = new byte[]{2, 3, 4, 5, 2, 3, 3};
      f26000 = new byte[]{4, 3};
      f29000 = new byte[]{5, 3, 6, 2, 6, 7};
      f17000 = new byte[]{6, 2, 9, 3, 3};
      f7000 = new byte[]{4, 9, 5, 16, 5, 32};
      f14000 = new byte[]{2, 3, 98, 4};
      f16000 = new byte[]{2, 100, 5, 2, 14, 3, 2, 4};
      f33000 = new byte[]{10, 6, 8};
   }
}
