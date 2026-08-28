package rw.core;

import KDFzREm.NNuU;
import org.joml.Matrix4f;
import rw.gui.IlkOns;
import rw.net.PacketListener;

public class C0134 implements PacketListener<C0138> {
   private static short[] f1000;
   private static boolean[] f2000;

   static {
      ntfClinit();
   }

   private static void m4000() {
      f2000 = new boolean[]{true};
   }

   private static void m8000() {
      f1000 = new short[]{4, 4, 6, 3, 1};
   }

   public void m10000(C0138 var1) {
      ((Matrix4f)IlkOns.f9000[4]).set(new Matrix4f(var1.m12000()));
      ((Matrix4f)IlkOns.f9000[4]).mul(var1.m26000());
      IlkOns.m94000(NNuU.Nq().e(), (boolean)1);
      ((C0832)IlkOns.f24000[6]).m18000(var1.m12000(), var1.m26000());
      ((C0805)C0814.f15000[3]).m6000();
      ((C0805)C0814.f12000[1]).m6000();
      C0814.m26000();
   }
}
