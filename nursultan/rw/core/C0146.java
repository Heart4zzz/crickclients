package rw.core;

import KDFzREm.NNuU;
import com.mojang.blaze3d.systems.RenderSystem;
import org.joml.Matrix4f;
import rw.NursultanClient;
import rw.gui.C0002;
import rw.gui.IlkOns;
import rw.net.PacketListener;

public class C0146 implements PacketListener<C0704> {
   private static String[] f1000;
   private static boolean[] f2000;
   private static short[] f3000;

   private static void m2000() {
      f3000 = new short[]{6, 3, 3, 1, 0};
   }

   static {
      ntfClinit();
   }

   private static void m12000() {
      f1000 = new String[]{"u_projection", "u_view", "texture_in"};
   }

   public void m18000(C0704 var1) {
      NNuU var2 = NNuU.Nq();
      rw.setting.C0154 var3 = NursultanClient.m66000();
      var3.m60000(var1.m26000());
      IlkOns.m94000(var2.e(), (boolean)1);
      ((C0832)IlkOns.f24000[6]).m18000(IlkOns.m10000(), (Matrix4f)IlkOns.f9000[3]);
      ((C0805)C0814.f15000[3]).m6000();
      ((C0805)C0814.f15000[1]).m32000(var1x -> {
         var1x.m66000(f1000[0]).m18000(IlkOns.m10000());
         var1x.m66000(f1000[1]).m18000(RenderSystem.getModelViewMatrix());
         var1x.m10000(f1000[2]).m8000(var3.m68000());
      });
      ((C0805)C0814.f12000[0]).m6000();
      C0002.m6000();
   }

   private static void m22000() {
      f2000 = new boolean[]{true};
   }
}
