package rw.core;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import rw.NursultanClient;
import rw.api.Iface0196;
import rw.api.Iface0197;
import rw.api.Iface0202;
import rw.data.Rec0269;
import rw.defs.Enum0059;
import rw.setting.C0031;

public class NkNw {
   public static Object[] f1000;
   private static byte[] f2000;
   private static short[] f3000;
   private static boolean[] f4000;
   private static boolean[] f5000;

   private static void m4000() {
      byte[] var128 = new byte[4];
      f2000[(0 | -0) >>> 31] = 2;
      f2000[(1 | -1) >>> 31] = 2;
      f2000[2] = 20;
      f2000[3] = 2;
   }

   private NkNw() {
   }

   static {
      ntfClinit();
   }

   private static List<List<Entry<Enum0059, List<rw.setting.C0156>>>> m8000() {
      EnumMap var0 = new EnumMap<>(Enum0059.class);
      NursultanClient.m52000().m8000().forEach(var1x -> var0.computeIfAbsent(var1x.m28000(), var0xx -> new ArrayList()).add(var1x));
      ArrayList var1 = new ArrayList(f2000[0]);
      var1.add(new ArrayList());
      var1.add(new ArrayList());
      int[] var2 = new int[f2000[1]];
      Enum0059[] var3 = Enum0059.m16000();
      int var4 = var3.length;

      for (int var5 = f5000[1]; var5 < var4; var5++) {
         Enum0059 var6 = var3[var5];
         List var7 = (List)var0.get(var6);
         if (var7 != null && !var7.isEmpty()) {
            byte var8 = var2[f4000[0]] <= var2[f4000[1]] ? f4000[2] : f4000[3];
            ((List)var1.get(var8)).add(Map.entry(var6, var7));
            var2[var8] += rw.gui.C0007.m40000(var7.size()) + f2000[2];
         }
      }

      return var1;
   }

   private static void m12000() {
      boolean[] var128 = new boolean[2];
      f5000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f5000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      boolean[] var129 = new boolean[7];
      f4000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f4000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f4000[2] = (boolean)((0 | -0) >>> 31);
      f4000[3] = (boolean)((1 | -1) >>> 31);
      f4000[4] = (boolean)((1 | -1) >>> 31);
      f4000[5] = (boolean)((0 | -0) >>> 31);
      f4000[6] = (boolean)((0 | -0) >>> 31);
   }

   private static void m14000() {
      f1000 = new Object[f2000[3]];
   }

   private C0031 m20000(Void var1, Iface0202 var2) {
      List var3 = m22000();
      return C0287.m26000((rw.setting.C0056)C0083.f2000[f3000[0]], var2x -> {
         var2x.N((rw.setting.C0056)C0083.f2000[f3000[5]], var2xx -> m28000(var2xx, (List<Entry<Enum0059, List<rw.setting.C0156>>>)var3.get(f4000[5]), var2));
         var2x.N((rw.setting.C0056)C0083.f2000[f3000[6]], var2xx -> m28000(var2xx, (List<Entry<Enum0059, List<rw.setting.C0156>>>)var3.get(f4000[4]), var2));
      });
   }

   private static List<List<Entry<Enum0059, List<rw.setting.C0156>>>> m22000() {
      if ((List)f1000[f3000[2]] == null) {
         List var4 = m8000();
         f1000[f3000[3]] = var4;
      }

      return (List<List<Entry<Enum0059, List<rw.setting.C0156>>>>)f1000[f3000[4]];
   }

   private static void m28000(C0288 var0, List<Entry<Enum0059, List<rw.setting.C0156>>> var1, Iface0202 var2) {
      for (Entry var4 : var1) {
         Enum0059 var5 = (Enum0059)var4.getKey();
         List var6 = (List)var4.getValue();
         Iface0196 var7 = var2.m6000("nursultan:autoBuyExpanded:" + var5.name(), f5000[0]);
         var0.y(var2.m18000("autoBuy" + var5.name(), (Iface0197<Rec0269>)rw.gui.C0007.f17000[f3000[1]], new Rec0269(var7, var5, var6)));
      }
   }

   private static void m34000() {
      short[] var128 = new short[7];
      f3000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f3000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f3000[2] = (short)((1 | -1) >>> 31);
      f3000[3] = (short)((1 | -1) >>> 31);
      f3000[4] = (short)((1 | -1) >>> 31);
      f3000[5] = (short)((1 | -1) >>> 31);
      f3000[6] = (short)((1 | -1) >>> 31);
   }
}
