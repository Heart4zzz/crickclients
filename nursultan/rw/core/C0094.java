package rw.core;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import rw.GuiWidget;
import rw.NursultanClient;
import rw.api.Iface0196;
import rw.api.Iface0197;
import rw.api.Iface0202;
import rw.data.Rec0260;
import rw.defs.Enum0055;
import rw.gui.Enum0070;
import rw.gui.HudPositions;
import rw.gui.OlIipltk;
import rw.setting.C0031;

public class C0094 {
   private static short[] f1000;
   public static Object[] f2000;
   private static boolean[] f3000;
   private static byte[] f4000;

   private static void m4000() {
      f1000 = new short[]{1, 0, 2, 0, 2, 1, 1};
   }

   private C0094() {
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      f4000 = new byte[]{20, 2, 3};
   }

   private static void m10000() {
      f2000 = new Object[]{null, null, null};
   }

   private static void m20000(C0288 var0, List<Entry<Enum0070, List<GuiWidget>>> var1, Iface0202 var2, Enum0055 var3) {
      for (Entry var5 : var1) {
         Enum0070 var6 = (Enum0070)var5.getKey();
         List var7 = (List)var5.getValue();
         String var8 = var6.m64000().m10000();
         String var9 = var8 + "expanded" + var3.m52000().m10000();
         Iface0196 var10 = var2.m8000("nursultan:subcategoryExpanded:" + var9, () -> {
            Boolean var1x = NursultanClient.m10000().m62000(HudPositions.class).m26000(var9);
            return var1x != null ? var1x : f3000[2];
         });
         ((Map)f2000[f1000[2]]).put(var9, var10);
         var0.y(var2.m18000(var8, (Iface0197<Rec0260>)OlIipltk.f8000[f1000[3]], new Rec0260(var10, var6, var7)));
      }
   }

   private C0031 m22000(Enum0055 var1, Iface0202 var2) {
      List var3 = ((Map)f2000[f1000[0]]).computeIfAbsent(var1, C0094::m32000);
      return C0287.m26000(
         (rw.setting.C0056)C0083.f2000[f1000[1]],
         var3x -> {
            var3x.N(
               (rw.setting.C0056)C0083.f2000[f1000[5]], var3xx -> m20000((C0288)var3xx, (List<Entry<Enum0070, List<GuiWidget>>>)var3.get(f3000[4]), var2, var1)
            );
            var3x.N(
               (rw.setting.C0056)C0083.f2000[f1000[6]], var3xx -> m20000((C0288)var3xx, (List<Entry<Enum0070, List<GuiWidget>>>)var3.get(f3000[3]), var2, var1)
            );
         }
      );
   }

   public static Map<String, Iface0196<Boolean>> m26000() {
      return (Map<String, Iface0196<Boolean>>)f2000[f1000[4]];
   }

   private static List<List<Entry<Enum0070, List<GuiWidget>>>> m32000(Enum0055 var0) {
      Map var1 = NursultanClient.m88000()
         .m68000()
         .filter(var1x -> var1x.m4000() == var0 ? f3000[0] : f3000[1])
         .collect(Collectors.groupingBy(GuiWidget::m32000, () -> new EnumMap<>(Enum0070.class), Collectors.toList()));
      return C0079.m14000(var0, var1, f4000[0]);
   }

   private static void m36000() {
      f3000 = new boolean[]{true, false, true, true, false, false, true};
   }
}
