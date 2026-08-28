package rw.gui;

import KDFzREm.NNuU;
import java.util.ArrayList;
import java.util.List;
import org.joml.Vector2f;
import org.joml.Vector4f;
import rw.NursultanClient;
import rw.api.Iface0202;
import rw.core.C0287;
import rw.core.C0288;
import rw.core.LeAm;
import rw.defs.Enum0032;
import rw.setting.C0031;
import rw.setting.C0056;

public class HudSnapLines {
   private static float[] f1000;
   private static boolean[] f2000;
   private static float[] f3000;
   private static float[] f4000;
   private static byte[] f5000;
   private static short[] f6000;
   private static float[] f7000;
   private static boolean[] f8000;
   public Object[] f9000;
   private static short[] f10000;
   private static int[] f11000;
   private static String[] f12000;
   public static Object[] f13000;
   private static float[] f14000;
   private static float[] f15000;

   private static void m4000() {
      f1000 = new float[]{2.0F, 2.0F, -1.0F, -1.0F};
      f14000 = new float[]{5.0F, 5.0F};
      f15000 = new float[]{2.0F, 5.0F};
      f4000 = new float[]{2.0F, Float.NaN, 1.0F, -1.0F};
      f3000 = new float[]{1.0F, 1.0F, -1.0F, 1.0F};
      f7000 = new float[]{1.0F, 0.0F, 0.0F, 100.0F, 100.0F, 5.0F, 1.0F};
   }

   private static void m10000() {
      f11000 = new int[]{Integer.MAX_VALUE};
   }

   private HudSnapLines() {
      this.m14000();
      ArrayList var5 = new ArrayList();
      this.f9000[f6000[0]] = var5;
   }

   static {
      ntfClinit();
   }

   private static void m12000() {
      f13000 = new Object[]{null, 5.0F, 1.0F, 1694498815, null, null};
   }

   private void m14000() {
      if (this.f9000 == null) {
         this.f9000 = new Object[f8000[2]];
         Object[] var1 = this.f9000;
      }
   }

   private static void m18000() {
      f5000 = new byte[]{-1, 100, 3, 4, 5, 6, 2, 3};
   }

   private static void m22000() {
      f2000 = new boolean[]{true, false, true, false, false};
      f8000 = new boolean[]{false, true, true, true, false};
   }

   private static void m26000() {
      f12000 = new String[]{"hudSnapLines", "snapGuides", "snapGuides"};
   }

   private void m30000(float var1, Vector2f var2, float var3) {
      float var4 = this.m34000(var1, var2.x, var3);
      if (!Float.isNaN(var4)) {
         var2.x = var4;
         ((List)this.f9000[f6000[3]]).add(new Vector2f(var1, f1000[2]));
      }
   }

   private float m34000(float var1, float var2, float var3) {
      if (Math.abs(var1 - var2) < f14000[0]) {
         return var1;
      } else if (Math.abs(var1 - (var2 + var3)) < f14000[1]) {
         return var1 - var3;
      } else {
         return Math.abs(var1 - (var2 + var3 / f15000[0])) < f15000[1] ? var1 - var3 / f4000[0] : f4000[1];
      }
   }

   public static C0031 m36000(Void var0, Iface0202 var1) {
      var1.m2000(f12000[0], ((List)((HudSnapLines)f13000[f6000[5]]).f9000[f6000[6]])::hashCode);
      List var2 = (List)((HudSnapLines)f13000[f6000[7]]).f9000[f10000[0]];
      if (var2.isEmpty()) {
         return C0287.m24000(var0x -> ((C0288)var0x.N(f12000[2])).N((C0056)f13000[f10000[3]]));
      } else {
         float var3 = m38000(f2000[0]);
         float var4 = m38000(f2000[1]);
         return C0287.m26000((C0056)f13000[f10000[1]], var3x -> {
            var3x.N(f12000[1]);

            for (int var4x = f2000[3]; var4x < var2.size(); var4x++) {
               Vector2f var5 = (Vector2f)var2.get(var4x);
               float var6 = var5.x == f4000[3] ? f3000[0] : var4 + f3000[1];
               float var7 = var5.y == f3000[2] ? f3000[3] : var3 + f7000[0];
               C0056 var8 = C0056.m130000().m160000(Enum0032.f2000).m66000(var5.x).m104000(var5.y).m78000(var7, var6).m86000((Integer)f13000[f10000[2]]);
               String var9 = "snapLine-" + var4x;
               var3x.N(var8, var1xx -> var1xx.N(var9));
            }
         });
      }
   }

   private static float m38000(boolean var0) {
      Huddumped var1 = NursultanClient.m42000();
      float var2 = var1 != null ? var1.m38000() : f4000[2];
      NNuU var3 = NNuU.Nq();
      int var4 = var0 ? var3.Nt().U() : var3.Nt().E();
      return Math.max(f2000[2], var4) / var2;
   }

   public void m40000(String var1, Vector2f var2, float var3, float var4, float var5, float var6, boolean var7, boolean var8) {
      for (DragOffset var10 : (List)LeAm.f5000[f6000[2]]) {
         if (!var10.m52000().equals(var1)) {
            Vector4f var11 = var10.m76000();
            if (var11 != null) {
               if (var7) {
                  this.m30000(var11.x(), var2, var3);
                  this.m30000(var11.x() + var11.z(), var2, var3);
               }

               if (var8) {
                  this.m42000(var11.y(), var2, var4);
                  this.m42000(var11.y() + var11.w(), var2, var4);
               }
            }
         }
      }

      if (var7) {
         this.m30000(var5 / f1000[0], var2, var3);
      }

      if (var8) {
         this.m42000(var6 / f1000[1], var2, var4);
      }
   }

   private void m42000(float var1, Vector2f var2, float var3) {
      float var4 = this.m34000(var1, var2.y, var3);
      if (!Float.isNaN(var4)) {
         var2.y = var4;
         ((List)this.f9000[f6000[4]]).add(new Vector2f(f1000[3], var1));
      }
   }

   public void m46000() {
      ((List)this.f9000[f6000[1]]).clear();
   }

   private static void m54000() {
      f6000 = new short[]{0, 0, 7, 0, 0, 0, 0, 0};
      f10000 = new short[]{0, 5, 3, 4};
   }
}
