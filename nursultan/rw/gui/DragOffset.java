package rw.gui;

import KDFzREm.NNWE;
import KDFzREm.NNuU;
import KDFzREm.ow;
import java.util.Objects;
import org.joml.Vector2f;
import org.joml.Vector4f;
import rw.NursultanClient;
import rw.api.Iface0196;
import rw.api.Iface0197;
import rw.api.Iface0202;
import rw.api.Iface0212;
import rw.api.Iface0639;
import rw.core.C0287;
import rw.core.C0288;
import rw.core.C0290;
import rw.core.C1050;
import rw.core.C1127;
import rw.core.IlmjIslp;
import rw.data.Rec0235;
import rw.defs.Enum0078;
import rw.defs.IlinkjOs;
import rw.setting.C0031;
import rw.setting.C0056;

public abstract class DragOffset {
   private static float[] f1000;
   private static float[] f2000;
   private static short[] f3000;
   public Object[] f4000;
   private static float[] f5000;
   private static short[] f6000;
   private static short[] f7000;
   private static short[] f8000;
   private static boolean[] f9000;
   public Object[] f10000;
   private static short[] f11000;
   private static boolean[] f12000;
   private static short[] f13000;
   private static boolean[] f14000;
   private static short[] f15000;
   public static Object[] f16000;
   private static boolean[] f17000;
   private static String[] f18000;
   private static short[] f19000;
   private static short[] f20000;
   private static boolean[] f21000;
   private static short[] f22000;
   private static short[] f23000;
   private static boolean[] f24000;
   private static byte[] f25000;
   private static short[] f26000;
   private static byte[] f27000;
   private static boolean[] f28000;

   public IlinkjOs m4000() {
      return (IlinkjOs)this.f10000[f6000[5]] != null ? (IlinkjOs)this.f10000[f6000[6]] : (IlinkjOs)IlinkjOs.f4000[f6000[7]];
   }

   public void m6000() {
      Vector2f var1 = this.m36000();
      IlinkjOs var6 = this.f10000[f6000[3]] ? IlinkjOs.m38000(var1.x, m12000()) : null;
      this.f10000[f6000[4]] = var6;
      this.m56000(var1.x, var1.y);
   }

   public void m8000() {
      if ((Iface0196)this.f10000[f8000[3]] != null) {
         int var10000 = (Integer)f16000[f23000[0]] + f17000[0];
         Integer var6 = var10000;
         f16000[f23000[1]] = var6;
         int var1 = var10000;
         if (((Iface0196)this.f10000[f13000[0]]).m2000() == null || (Integer)((Iface0196)this.f10000[f13000[1]]).m2000() != var1) {
            ((Iface0196)this.f10000[f13000[2]]).m6000(var1);
         }
      }
   }

   private static void m10000() {
      f27000 = new byte[]{4, 2, 3, 2, 2};
      f25000 = new byte[]{2, 3, 3, 8, 5, 4};
   }

   public DragOffset(Iface0197<Void> var1) {
      this.m30000();
      C0290 var7 = new C0290();
      this.f10000[f15000[0]] = var7;
      C0290 var8 = new C0290();
      this.f10000[f15000[1]] = var8;
      Iface0639 var2 = Objects.requireNonNull(this.getClass().getAnnotation(Iface0639.class), f18000[0]);
      String var9 = var2.m6000();
      this.f4000[f15000[2]] = var9;
      Vector2f var10 = new Vector2f(var2.m4000(), var2.m10000());
      this.f4000[f15000[3]] = var10;
      Enum0078 var11 = var2.m8000();
      this.f10000[f15000[4]] = var11;
      Boolean var12 = var2.m2000();
      this.f10000[f15000[5]] = var12;
      this.f4000[f15000[6]] = var1;
      C1127 var14 = new C1127(var2.m6000());
      this.f10000[f15000[7]] = var14;
      NursultanClient.m8000().m32000(this);
   }

   static {
      ntfClinit();
   }

   public static float m12000() {
      Huddumped var0 = NursultanClient.m42000();
      float var1 = var0 != null ? var0.m38000() : f2000[0];
      return Math.max(f28000[3], NNuU.Nq().Nt().U()) / var1;
   }

   public Iface0197<Void> m14000() {
      return this::m64000;
   }

   public C0290<Iface0212> m18000() {
      return (C0290<Iface0212>)this.f10000[f3000[5]];
   }

   private static void m20000() {
      f15000 = new short[]{2, 3, 1, 2, 0, 1, 0, 4};
      f6000 = new short[]{5, 5, 5, 1, 7, 7, 7, 0};
      f8000 = new short[]{5, 5, 2, 6};
      f23000 = new short[]{4, 4};
      f13000 = new short[]{6, 6, 6, 2, 0, 3, 2, 1};
      f7000 = new short[]{5, 1, 6, 1, 1, 1};
      f19000 = new short[]{0, 1, 2, 6, 5, 0, 1, 5};
      f26000 = new short[]{5, 7, 1, 7};
      f22000 = new short[]{0, 2};
      f20000 = new short[]{7, 7, 7, 7, 5, 5, 5};
      f3000 = new short[]{2, 5, 1, 2, 1, 3, 4, 1};
      f11000 = new short[]{0, 1, 3, 1, 0, 0};
   }

   public boolean m22000() {
      return (Enum0078)this.f10000[f13000[4]] != (Enum0078)Enum0078.f2000[f13000[5]] && Huddumped.m40000() && this.m54000() ? f17000[4] : f24000[0];
   }

   private static void m24000() {
      f18000 = new String[]{"The hud component should be annotated @HudComponentTag", "chatOpened"};
   }

   private static void m26000() {
      f17000 = new boolean[]{true, false, true, false, true};
      f24000 = new boolean[]{false, true};
      f28000 = new boolean[]{true, false, false, true};
      f14000 = new boolean[]{true, true, true};
      f9000 = new boolean[]{false, true, false, false, false};
      f21000 = new boolean[]{true, false, true, false, false, true, false, false};
      f12000 = new boolean[]{true, false, false};
   }

   public Vector2f m28000() {
      if ((Iface0196)this.f10000[f8000[0]] == null) {
         return null;
      } else {
         Vector4f var1 = (Vector4f)((Iface0196)this.f10000[f8000[1]]).m2000();
         return new Vector2f(var1.x(), var1.y());
      }
   }

   private void m30000() {
      if (this.f4000 == null) {
         this.f4000 = new Object[f25000[2]];
         Object[] var1 = this.f4000;
      }

      if (this.f10000 == null) {
         this.f10000 = new Object[f25000[3]];
         Object[] var2 = this.f10000;
         var2[f12000[0]] = f12000[1];
      }
   }

   private static void m32000() {
      f5000 = new float[]{0.0F, 0.0F, 0.0F, 0.5F};
      f2000 = new float[]{1.0F, 1.0F, 0.0F};
      f1000 = new float[]{0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F};
   }

   private static void m34000() {
      f16000 = new Object[]{null, null, null, null, 0};
   }

   public Vector2f m36000() {
      return (Vector2f)this.f4000[f13000[6]];
   }

   public C0056 m38000() {
      return C0056.f1000;
   }

   public static float m42000() {
      Huddumped var0 = NursultanClient.m42000();
      float var1 = var0 != null ? var0.m38000() : f2000[1];
      return Math.max(f14000[0], NNuU.Nq().Nt().E()) / var1;
   }

   public boolean m44000() {
      return f24000[1];
   }

   private void m50000(boolean var1) {
      if ((Boolean)this.f10000[f19000[6]] && (Iface0196)this.f10000[f19000[7]] != null) {
         Vector4f var2 = (Vector4f)((Iface0196)this.f10000[f26000[0]]).m2000();
         if (var2 != null) {
            if ((IlinkjOs)this.f10000[f26000[1]] == null) {
               IlinkjOs var14 = NursultanClient.m10000().m62000(HudPositions.class).m30000((String)this.f4000[f26000[2]]);
               IlinkjOs var12 = var14 != null ? var14 : IlinkjOs.m38000(var2.x, m12000());
               this.f10000[f26000[3]] = var12;
            } else if (var1 && ((Enum0078)this.f10000[f22000[0]]).m26000()) {
               Iface0212 var3 = (Iface0212)((C0290)this.f10000[f22000[1]]).m2000();
               if (var3 != null && var3.m10000() != null) {
                  float var4 = var3.m18000().m12000();
                  if (!(var4 <= f5000[2])) {
                     float var5 = var2.x + (f5000[3] - ((IlinkjOs)this.f10000[f20000[0]]).m36000()) * var4;
                     IlinkjOs var6 = IlinkjOs.m38000(var5, m12000());
                     if (var6 != (IlinkjOs)this.f10000[f20000[1]]) {
                        float var7 = (var6.m36000() - ((IlinkjOs)this.f10000[f20000[2]]).m36000()) * var4;
                        this.f10000[f20000[3]] = var6;
                        var2.x += var7;
                        var2.z += var7;
                        ((Iface0196)this.f10000[f20000[4]]).m6000(var2);
                     }
                  }
               }
            }
         }
      }
   }

   public String m52000() {
      return (String)this.f4000[f3000[4]];
   }

   public boolean m54000() {
      return f28000[0];
   }

   public void m56000(float var1, float var2) {
      if ((Iface0196)this.f10000[f6000[0]] != null) {
         ((Iface0196)this.f10000[f6000[1]]).m6000(((Vector4f)((Iface0196)this.f10000[f6000[2]]).m2000()).set(var1, var2, var1, var2));
      }
   }

   private C0031 m64000(Void var1, Iface0202 var2) {
      Iface0196 var9 = var2.m24000((String)this.f4000[f13000[7]] + "Position", () -> {
         Vector2f var1x = NursultanClient.m10000().m62000(HudPositions.class).m4000((String)this.f4000[f11000[3]]);
         Vector2f var2x = this.m36000();
         float var3x = var1x != null && ((Enum0078)this.f10000[f11000[4]]).m26000() ? var1x.x : var2x.x;
         float var4x = var1x != null && ((Enum0078)this.f10000[f11000[5]]).m30000() ? var1x.y : var2x.y;
         return new Vector4f(var3x, var4x, var3x, var4x);
      });
      this.f10000[f7000[0]] = var9;
      Iface0196 var10 = var2.m20000((String)this.f4000[f7000[1]] + "ZIndex", Integer.valueOf(f28000[1]));
      this.f10000[f7000[2]] = var10;
      Iface0196 var3 = var2.m20000((String)this.f4000[f7000[3]] + "Dragging", f28000[2]);
      Iface0196 var4 = var2.m20000((String)this.f4000[f7000[4]] + "DragOffset", new Vector2f());
      this.m50000((Boolean)var3.m2000());
      this.m68000((Boolean)var3.m2000());
      if (!this.m44000()) {
         return C0287.m24000(var1x -> ((C0288)var1x.N((String)this.f4000[f11000[1]] + "Draggable")).N((C0056)f16000[f11000[2]]));
      } else {
         var2.m2000(f18000[1], Huddumped::m40000);
         return var2.m18000(
            (String)this.f4000[f7000[5]] + "Draggable",
            (Iface0197<Rec0235>)C1050.f2000[f19000[0]],
            new Rec0235(
               (String)this.f4000[f19000[1]],
               (C0290<Iface0212>)this.f10000[f19000[2]],
               m66000((Integer)((Iface0196)this.f10000[f19000[3]]).m2000(), this.m54000(), this.m38000(), this.m4000().m28000()),
               C1050.m28000((Iface0196<Vector4f>)this.f10000[f19000[4]]),
               var3,
               var4,
               IlmjIslp.m10000((Enum0078)this.f10000[f19000[5]]),
               (var2x, var3x) -> {
                  var2x.y(
                     ((C1127)this.f10000[f3000[6]])
                        .m40000(var3x, this, var3, var3x.m18000((String)this.f4000[f3000[7]] + "Content", (Iface0197)this.f4000[f11000[0]], null))
                  );
                  var2x.y(HintTargeted.m52000(var3x, this));
               }
            )
         );
      }
   }

   private static C0056 m66000(int var0, boolean var1, C0056 var2, C0056 var3) {
      C0056 var4 = var1 ? (C0056)f16000[f3000[2]] : (C0056)f16000[f3000[3]];
      C0056[] var10000 = new C0056[f27000[0]];
      var10000[f9000[0]] = var4;
      var10000[f9000[1]] = var2;
      var10000[f27000[1]] = var3;
      var10000[f27000[2]] = C0056.m130000().m168000(var0);
      return C0056.m120000(var10000);
   }

   private void m68000(boolean var1) {
      if (!var1 && (Iface0196)this.f10000[f20000[5]] != null) {
         Vector4f var2 = (Vector4f)((Iface0196)this.f10000[f20000[6]]).m2000();
         if (var2 != null) {
            Huddumped var3 = NursultanClient.m42000();
            if (var3 != null) {
               Iface0212 var4 = (Iface0212)((C0290)this.f10000[f3000[0]]).m2000();
               if (var4 != null && var4.m10000() != null) {
                  float var5 = var4.m18000().m12000();
                  float var6 = var4.m18000().m10000();
                  if (!(var5 <= f2000[2]) && !(var6 <= f1000[0])) {
                     ow var7 = NNuU.Nq().Nt();
                     float var8 = var3.m38000();
                     float var9 = Math.max(f1000[1], Math.max(f14000[1], var7.U()) / var8 - var5);
                     float var10 = Math.max(f1000[2], Math.max(f14000[2], var7.E()) / var8 - var6);
                     float var11 = this.m4000().m36000() * var5;
                     float var12 = NNWE.N(var2.x, var11, var9 + var11);
                     float var13 = NNWE.N(var2.y, f1000[3], var10);
                     if (var12 != var2.z || var13 != var2.w) {
                        var2.z = var12;
                        var2.w = var13;
                        ((Iface0196)this.f10000[f3000[1]]).m6000(var2);
                     }
                  }
               }
            }
         }
      }
   }

   public boolean m72000() {
      if (!this.m22000()) {
         return f17000[1];
      } else {
         Iface0212 var1 = (Iface0212)((C0290)this.f10000[f13000[3]]).m2000();
         return var1 != null && var1.m32000() ? f17000[2] : f17000[3];
      }
   }

   public Vector4f m76000() {
      if (this.m44000() && this.m54000()) {
         Iface0212 var1 = (Iface0212)((C0290)this.f10000[f8000[2]]).m2000();
         if (var1 != null && var1.m10000() != null) {
            float var2 = var1.m18000().m12000();
            float var3 = var1.m18000().m10000();
            return !(var2 <= f5000[0]) && !(var3 <= f5000[1]) ? new Vector4f(var1.m18000().m14000(), var1.m18000().m2000(), var2, var3) : null;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }
}
