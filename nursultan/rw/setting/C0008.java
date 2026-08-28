package rw.setting;

import KDFzREm.NNuU;
import KDFzREm.ow;
import org.joml.Vector2f;
import org.joml.Vector4f;
import rw.NursultanClient;
import rw.api.Iface0196;
import rw.api.Iface0197;
import rw.api.Iface0202;
import rw.api.Iface0212;
import rw.core.C0290;
import rw.core.C1050;
import rw.core.OlOikk;
import rw.data.Rec0235;
import rw.defs.Enum0086;
import rw.gui.HudPositions;
import rw.gui.OlritOjmp;
import rw.gui.ThemeManager;

public class C0008 {
   private static boolean[] f1000;
   private static float[] f2000;
   private static byte[] f3000;
   private static int[] f4000;
   private static byte[] f5000;
   private static short[] f6000;
   private static String[] f7000;
   private static short[] f8000;
   private static boolean[] f9000;
   private static boolean[] f10000;
   private static byte[] f11000;
   private static float[] f12000;
   private static byte[] f13000;
   private static short[] f14000;
   private static String[] f15000;
   public static Object[] f16000;
   private static String[] f17000;
   private static short[] f18000;
   public Object[] f19000;
   private static short[] f20000;
   private static String[] f21000;

   public static void m2000() {
      Iface0196 var0 = (Iface0196)((C0008)IIkIis<"nehjzmbs",-1693729239,972578449,972578448,972578451,-10419150,-1520686936>()[f6000[5]]).f19000[f6000[6]];
      if (var0 != null) {
         var0.m6000(!var0.m2000() ? f9000[2] : f9000[3]);
      }
   }

   private static void m10000() {
      f12000 = new float[]{1196.0F, 750.0F, 1196.0F, 750.0F, 10.0F, 20.0F, 0.2F, 1.0F};
      f2000 = new float[]{16.0F};
   }

   private C0008() {
      this.m78000();
      C0290 var5 = new C0290();
      this.f19000[f20000[0]] = var5;
   }

   static {
      ntfClinit();
   }

   private static void m18000() {
      f20000 = new short[]{0, 1, 1, 1, 1, 1, 0, 1};
      f6000 = new short[]{2, 3, 3, 1, 4, 1, 3, 1};
      f14000 = new short[]{0, 2};
      f18000 = new short[]{3, 4, 0};
      f8000 = new short[]{0, 4, 0, 0, 0, 0, 0, 0};
   }

   private static void m24000() {
      f15000 = new String[]{"menuPos", "menuDrag", "menuOffset"};
      f17000 = new String[]{
         "menuCategory", "nursultan:clientSettingsOpened", "nursultan:openModuleSettings", "", "nursultan:searchQuery", "", "searchCategory"
      };
      f21000 = new String[]{"", "draggableMenu", "menu", "sidebar", "main", "accountModal", "deleteAccountsModal", "sharePresetModal"};
      f7000 = new String[]{"menu"};
   }

   private static void m28000() {
      f4000 = new int[]{-16777216};
   }

   private static void m44000() {
      f11000 = new byte[]{2, 8};
      f3000 = new byte[]{2, 2, 3, 3};
      f13000 = new byte[]{4, 4, 5, 5, 6, 6, 7, 3};
      f5000 = new byte[]{2, 4, 5, 5};
   }

   private static void m46000() {
      f16000 = new Object[]{f7000[0], null, null, null, null};
   }

   public static Iface0212 m50000() {
      Iface0212 var0 = (Iface0212)((C0290)((C0008)f16000[f20000[5]]).f19000[f20000[6]]).m2000();
      return var0 != null && var0.m10000() != null ? var0 : null;
   }

   public static Vector2f m58000() {
      if ((Iface0196)((C0008)f16000[f20000[1]]).f19000[f20000[2]] == null) {
         return null;
      } else {
         Vector4f var0 = (Vector4f)((Iface0196)((C0008)f16000[f20000[3]]).f19000[f20000[4]]).m2000();
         return var0 == null ? null : new Vector2f(var0.x(), var0.y());
      }
   }

   private static void m62000() {
      f9000 = new boolean[]{true, false, true, false};
      f1000 = new boolean[]{false, false, true, true, true, true};
      f10000 = new boolean[]{false, false, true, true, false, true, false};
   }

   private static void m66000(Iface0196<Vector4f> var0, boolean var1) {
      if (!var1) {
         Vector4f var2 = (Vector4f)var0.m2000();
         if (var2 != null) {
            if (NursultanClient.m2000() != null) {
               ow var3 = NNuU.Nq().Nt();
               float var4 = ThemeManager.m4000();
               float var5 = Math.max(f1000[2], var3.U()) / var4;
               float var6 = Math.max(f1000[3], var3.E()) / var4;
               float var7 = OlOikk.m26000(var2.x, var5, f12000[0]);
               float var8 = OlOikk.m26000(var2.y, var6, f12000[1]);
               if (var7 != var2.z || var8 != var2.w) {
                  var2.z = var7;
                  var2.w = var8;
                  var0.m6000(var2);
               }
            }
         }
      }
   }

   public static boolean m72000() {
      Iface0196 var0 = (Iface0196)((C0008)f16000[f6000[3]]).f19000[f6000[4]];
      return var0 != null && !((String)var0.m2000()).isEmpty() ? f9000[0] : f9000[1];
   }

   public static void m74000(int var0) {
      Iface0196 var1 = (Iface0196)((C0008)f16000[f20000[7]]).f19000[f6000[0]];
      if (var1 != null && var0 >= 0 && var0 < ((Enum0086[])f16000[f6000[1]]).length) {
         var1.m6000(((Enum0086[])f16000[f6000[2]])[var0]);
      }
   }

   private C0031 m76000(Iface0196<Enum0086> var1, Iface0202 var2) {
      Iface0196 var3 = var2.m24000(f15000[0], () -> {
         Vector2f var0 = NursultanClient.m10000().m62000(HudPositions.class).m2000();
         return var0 == null ? null : new Vector4f(var0.x, var0.y, var0.x, var0.y);
      });
      this.f19000[f6000[7]] = var3;
      Iface0196 var4 = var2.m20000(f15000[1], f1000[0]);
      Iface0196 var5 = var2.m20000(f15000[2], new Vector2f());
      Iface0196 var6 = var2.m20000(f17000[0], (Enum0086)Enum0086.f1000[f14000[0]]);
      Iface0196 var7 = var2.m6000(f17000[1], f1000[1]);
      Iface0196 var8 = var2.m6000(f17000[2], f17000[3]);
      Iface0196 var9 = var2.m6000(f17000[4], f17000[5]);
      Iface0196 var10 = var2.m20000(f17000[6], (Enum0086)var6.m2000());
      if (var10.m2000() != var6.m2000()) {
         var10.m6000((Enum0086)var6.m2000());
         if (!((String)var9.m2000()).isEmpty()) {
            var9.m6000(f21000[0]);
         }
      }

      this.f19000[f14000[1]] = var6;
      this.f19000[f18000[0]] = var7;
      this.f19000[f18000[1]] = var8;
      m66000(var3, (Boolean)var4.m2000());
      return var2.m18000(
         f21000[1],
         (Iface0197<Rec0235>)C1050.f2000[f18000[2]],
         new Rec0235(
            f21000[2],
            (C0290<Iface0212>)this.f19000[f8000[0]],
            (C0056)f16000[f8000[1]],
            C1050.m28000(var3),
            var4,
            var5,
            (OlOikk)OlOikk.f1000[f8000[2]],
            (var2x, var3x) -> {
               var2x.y(var2.m18000(f21000[3], (Iface0197<Iface0196>)C0014.f4000[f8000[3]], var6));
               var2x.y(var2.m18000(f21000[4], (Iface0197<Iface0196>)C0010.f23000[f8000[4]], var6));
               var2x.y(var2.m18000(f21000[5], (Iface0197)OlritOjmp.f56000[f8000[5]], null));
               var2x.y(var2.m18000(f21000[6], (Iface0197)rw.gui.C0005.f45000[f8000[6]], null));
               var2x.y(var2.m18000(f21000[7], (Iface0197)rw.gui.C0008.f41000[f8000[7]], null));
            }
         )
      );
   }

   private void m78000() {
      if (this.f19000 == null) {
         this.f19000 = new Object[f5000[2]];
         Object[] var1 = this.f19000;
      }
   }
}
