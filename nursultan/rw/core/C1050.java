package rw.core;

import org.joml.Vector2f;
import org.joml.Vector4f;
import rw.api.Iface0196;
import rw.api.Iface0202;
import rw.data.Rec0235;
import rw.defs.Enum0026;
import rw.defs.Enum0032;
import rw.setting.C0031;

public class C1050 {
   private static boolean[] f1000;
   public static Object[] f2000;

   private static void m2000() {
      f2000 = new Object[]{null};
   }

   private C1050() {
   }

   static {
      ntfClinit();
   }

   private static rw.setting.C0056 m18000(Rec0235 var0) {
      Vector2f var1 = var0.m14000().m2000();
      return var1 == null ? rw.setting.C0056.f1000 : rw.setting.C0056.m130000().m160000(Enum0032.f2000).m66000(var1.x).m104000(var1.y);
   }

   private static void m24000() {
      f1000 = new boolean[]{false, true, false, true};
   }

   private C0031 m26000(Rec0235 var1, Iface0202 var2) {
      Object var3 = var1.m18000() == null ? (OlOikk)OlOikk.f1000[0] : var1.m18000();
      return C0287.m26000(rw.setting.C0056.m120000(var1.m10000(), m18000(var1)), var3x -> {
         var3x.N(var1.m16000());
         var3x.N(var1.m4000());
         var3x.N(Enum0026.f2000, var2xx -> var3.m2000(var2xx, var1));
         var3x.N(Enum0026.f3000, var2xx -> var3.m6000(var2xx, var1));
         var3x.N(Enum0026.f1000, var2xx -> var3.m4000(var2xx, var1));
         var1.m8000().accept(var3x, var2);
      });
   }

   public static Iface0196<Vector2f> m28000(Iface0196<Vector4f> var0) {
      Vector2f var1 = new Vector2f();
      return new C1068(var0, var1);
   }
}
