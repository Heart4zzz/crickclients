package rw.gui;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.StringJoiner;
import rw.NursultanClient;
import rw.api.Iface0196;
import rw.api.Iface0197;
import rw.api.Iface0202;
import rw.core.Base0315;
import rw.core.C0287;
import rw.core.C0288;
import rw.core.C0319;
import rw.core.C0750;
import rw.core.C1013;
import rw.core.C1052;
import rw.core.C1063;
import rw.core.C1235;
import rw.core.IltqImqmt;
import rw.core.Noqodls;
import rw.data.ConfigFiles;
import rw.data.Rec0034;
import rw.data.Rec0262;
import rw.defs.Enum0002;
import rw.defs.Enum0026;
import rw.setting.C0031;
import rw.setting.C0056;

public class C0005 {
   private static byte[] f1000;
   private static short[] f2000;
   private static float[] f3000;
   private static boolean[] f4000;
   private static boolean[] f5000;
   private static String[] f6000;
   public static Object[] f7000;
   private static boolean[] f8000;
   private static boolean[] f9000;
   private static float[] f10000;
   private static short[] f11000;
   private static byte[] f12000;
   private static float[] f13000;
   private static float[] f14000;
   private static byte[] f15000;
   private static boolean[] f16000;
   private static byte[] f17000;
   private static int[] f18000;
   private static String[] f19000;
   public static Object[] f20000;
   public static Object[] f21000;
   private static float[] f22000;
   public static Object[] f23000;
   private static boolean[] f24000;
   private static float[] f25000;
   private static boolean[] f26000;
   private static byte[] f27000;
   private static short[] f28000;
   private static String[] f29000;
   private static byte[] f30000;
   private static String[] f31000;
   private static String[] f32000;
   private static boolean[] f33000;
   public static Object[] f34000;
   private static boolean[] f35000;
   private static byte[] f36000;
   private static boolean[] f37000;
   private static byte[] f38000;
   private static boolean[] f39000;
   private static boolean[] f40000;
   private static short[] f41000;
   private static short[] f42000;
   private static boolean[] f43000;
   private static byte[] f44000;
   public static Object[] f45000;
   private static byte[] f46000;
   public static Object[] f47000;
   private static float[] f48000;

   private static void m2000() {
      f2000 = new short[]{1, 0, 5, 4, 0, 0};
      f41000 = new short[]{0, 0, 0, 0, 0, 0};
      f42000 = new short[]{0, 0, 6, 0, 1, 1, 2, 1};
      f28000 = new short[]{2, 3, 2, 4, 3};
      f11000 = new short[]{3, 256, 0, 1001, -29813, 256, 360, -29813};
   }

   private static List<C1013> m6000(int var0) {
      ArrayList var1 = new ArrayList(
         ((List)IlqntOpsO<"tembvo",-665821920,-2077348661,-2077348646,-2077348656,-1861947236,1371880026,808741498>()[f41000[0]]).size()
      );

      for (int var2 = f33000[5]; var2 < ((List)f21000[f41000[1]]).size(); var2++) {
         var1.add(new C1013(((Rec0034)((List)f21000[f41000[2]]).get(var2)).m6000(), (var0 & f33000[6] << var2) != 0 ? f33000[7] : f4000[0]));
      }

      return var1;
   }

   private static void m10000() {
      f29000 = new String[]{"nursultan:deleteAccountsModalOpened", "deleteAccountsTargets"};
      f6000 = new String[]{"deleteAccountsListOpened", ", ", "deleteAccountsTargetField", "—", "deleteAccountsTargetList"};
      f32000 = new String[]{
         "deleteAccountsTargetChevron",
         "icon:menu/angles",
         "deleteAccountsModalClose",
         "icon:menu/xmark",
         "deleteAccountsModalBlur",
         "deleteAccountsModalPanel",
         "deleteAccountsConfirmButton",
         "account.delete.confirm"
      };
      f31000 = new String[]{
         "deleteAccountsTargetGroup", "account.delete.select", "account.delete.title", "deleteAccountsModalHidden", "account-generated", "account-offline"
      };
      f19000 = new String[]{"account-microsoft", "account.delete.modal.close", "nursultan:deleteAccountsModalOpened", "icon:menu/angles"};
   }

   private C0005() {
   }

   static {
      ntfClinit();
   }

   private static void m28000() {
      f14000 = new float[]{328.0F, -12.0F, 0.0F, 0.0F, 0.0F, 0.0F};
      f48000 = new float[]{16.0F, 5.0F, 0.35F, 1.0F, 360.0F, 16.0F, 12.0F};
      f13000 = new float[]{1.0F, 12.0F, 20.0F, 0.25F, 100.0F};
      f10000 = new float[]{16.0F, 16.0F, 16.0F, 16.0F, 100.0F};
      f25000 = new float[]{6.0F, 100.0F, 44.0F};
      f3000 = new float[]{12.0F, 12.0F, 1.0F, 8.0F, 12.0F};
      f22000 = new float[]{12.0F, 100.0F, 44.0F, 12.0F, 1.0F, 8.0F, 0.5F, 328.0F};
   }

   private static String m54000(int var0) {
      StringJoiner var1 = new StringJoiner(f6000[1]);

      for (int var2 = f33000[3]; var2 < ((List)f21000[f2000[4]]).size(); var2++) {
         if ((var0 & f33000[4] << var2) != 0) {
            var1.add(C1235.m36000("entry." + ((Rec0034)((List)f21000[f2000[5]]).get(var2)).m6000()));
         }
      }

      return var1.toString();
   }

   private static Set<Enum0002> m58000(int var0) {
      EnumSet var1 = EnumSet.noneOf(Enum0002.class);

      for (int var2 = f4000[3]; var2 < ((List)f21000[f41000[5]]).size(); var2++) {
         if ((var0 & f4000[4] << var2) != 0) {
            var1.add(((Rec0034)((List)f21000[f42000[0]]).get(var2)).m4000());
         }
      }

      return var1;
   }

   private static void m60000() {
      f44000 = new byte[]{2, 2};
      f17000 = new byte[]{2, 20, 5};
      f38000 = new byte[]{3, 2, 2, 13, 3, 3, 4};
      f27000 = new byte[]{2, 4, 2, 5, 2, 16};
      f1000 = new byte[]{3, 6, 2, 16, 3, 2, 2};
      f15000 = new byte[]{2, 3, 2, 16, 3};
      f36000 = new byte[]{4, 4, 2, 3, 5, 44, 2};
      f12000 = new byte[]{12, 3, 4, 16};
      f46000 = new byte[]{3, 12};
      f30000 = new byte[]{2, 5, 4, 16, 2, 7, 5};
   }

   private static void m74000() {
      f18000 = new int[]{-16777216, -16777216, -7171438, -7171438, -7171438, -7171438};
   }

   private static void m84000(Set<Enum0002> var0) {
      IltqImqmt var1 = NursultanClient.m10000().m62000(IltqImqmt.class);
      boolean var2 = f9000[0];

      for (Noqodls var4 : NursultanClient.m48000().m16000()) {
         if (!var4.m24000() && var0.contains(var4.m2000())) {
            C0750.m26000(var4.m38000());
            if (var4.m38000().equals(var1.m4000())) {
               var1.m6000(null);
               var2 = f9000[1];
            }

            NursultanClient.m48000().m26000(var4.m38000());
         }
      }

      if (var2) {
         ConfigFiles.m54000(IltqImqmt.class);
      }
   }

   private C0031 m94000(Void var1, Iface0202 var2) {
      Iface0196 var3 = var2.m6000(f29000[0], f33000[0]);
      if (!(Boolean)var3.m2000()) {
         return C0287.m24000(var0 -> ((C0288)var0.N(f31000[3])).N(C1063.m20000()));
      } else {
         Iface0196 var4 = var2.m20000(f29000[1], Integer.valueOf(f33000[1]));
         Iface0196 var5 = var2.m20000(f6000[0], f33000[2]);
         Runnable var6 = () -> {
            var4.m6000(Integer.valueOf(f24000[0]));
            var5.m6000(f24000[1]);
            var3.m6000(f24000[2]);
         };
         return C0287.m26000((C0056)f21000[f2000[0]], var4x -> {
            var4x.N(f32000[4]);
            var4x.N(Enum0026.f2000, Base0315::m6000);
            var4x.N(Enum0026.f4000, Base0315::m6000);
            var4x.N(Enum0026.f6000, var1xx -> {
               if (var1xx instanceof C0319 var2xx && var2xx.m6000() && var2xx.m8000() == f11000[1]) {
                  var6.run();
                  var1xx.m6000();
               }
            });
            var4x.N((C0056)f21000[f42000[6]], var4xx -> {
               var4xx.N(f32000[5]);
               var4xx.N(Enum0026.f2000, Base0315::m6000);
               var4xx.N(Enum0026.f4000, Base0315::m6000);
               var4xx.N((C0056)f7000[f42000[7]], var1xxx -> {
                  var1xxx.N(C1235.m36000(f31000[2]), (C0056)f21000[f11000[0]]);
                  var1xxx.y(m122000(var6));
               });
               var4xx.N((C0056)f34000[f28000[0]], var3xxx -> {
                  var3xxx.N(f31000[0]);
                  var3xxx.N(C1235.m36000(f31000[1]), (C0056)f34000[f28000[4]]);
                  var3xxx.y(m116000(var2, var4, var5));
               });
               boolean var5x = var4.m2000() == 0 ? f16000[1] : f16000[2];
               var4xx.N(var5x ? (C0056)f23000[f28000[1]] : (C0056)f23000[f28000[2]], var3xxx -> {
                  var3xxx.N(f32000[6]);
                  var3xxx.N(Enum0026.f2000, Base0315::m6000);
                  if (!var5x) {
                     var3xxx.N(var2xxxx -> {
                        m84000(m58000((Integer)var4.m2000()));
                        var6.run();
                        var2xxxx.m6000();
                     });
                  }

                  var3xxx.N(C1235.m36000(f32000[7]), (C0056)f23000[f28000[3]]);
               });
            });
         });
      }
   }

   private static void m96000() {
      f45000 = new Object[]{null, f19000[2], 256, 360};
      f20000 = new Object[]{44, -29813, 12, f19000[3], 16};
      f47000 = new Object[]{12, 328.0F, 0};
      f21000 = new Object[]{null, null, null, null, 16};
      f7000 = new Object[]{null, null};
      f34000 = new Object[]{null, null, null, null, null, null, null};
      f23000 = new Object[]{null, null, null, null, null};
   }

   private static void m102000(Iface0196<Integer> var0, C1013 var1) {
      for (int var2 = f4000[1]; var2 < ((List)f21000[f41000[3]]).size(); var2++) {
         if (var1.m22000().m10000().equals("entry." + ((Rec0034)((List)f21000[f41000[4]]).get(var2)).m6000())) {
            var0.m6000((Integer)var0.m2000() ^ f4000[2] << var2);
            return;
         }
      }
   }

   private static C0031 m116000(Iface0202 var0, Iface0196<Integer> var1, Iface0196<Boolean> var2) {
      C0056 var3 = var2.m2000() ? (C0056)f34000[f2000[2]] : (C0056)f34000[f2000[3]];
      return C0287.m26000(
         var3,
         var3x -> {
            var3x.N(f6000[2]);
            var3x.N(Enum0026.f2000, Base0315::m6000);
            boolean var4 = var1.m2000() == 0 ? f9000[2] : f9000[3];
            var3x.N(var4 ? f6000[3] : m54000((Integer)var1.m2000()), var4 ? (C0056)f23000[f42000[1]] : (C0056)f34000[f42000[2]]);
            var3x.L(var0xx -> {
               var0xx.N(f32000[0]);
               var0xx.m2000(f32000[1]);
               var0xx.N((C0056)f23000[f42000[4]]);
            });
            var3x.N(var1xx -> {
               var2.m6000(f16000[0]);
               var1xx.m6000();
            });
            var3x.y(
               var0.m18000(
                  f6000[4],
                  (Iface0197<Rec0262>)C1052.f11000[f42000[3]],
                  new Rec0262(m6000((Integer)var1.m2000()), var2, var1xx -> m102000(var1, var1xx), f14000[0], f14000[1])
               )
            );
         }
      );
   }

   private static C0031 m122000(Runnable var0) {
      return C0287.m26000((C0056)f34000[f2000[1]], var1 -> {
         var1.N(f32000[2]);
         var1.N(Enum0026.f2000, Base0315::m6000);
         var1.N(var1x -> {
            var0.run();
            var1x.m6000();
         });
         var1.L(var0xx -> var0xx.m2000(f32000[3]).N((C0056)f34000[f42000[5]]));
      });
   }

   private static void m126000() {
      f33000 = new boolean[]{false, false, false, false, true, false, true, true};
      f4000 = new boolean[]{false, false, true, false, true};
      f9000 = new boolean[]{false, true, true, false};
      f16000 = new boolean[]{true, true, false};
      f24000 = new boolean[]{false, false, false, false, false};
      f26000 = new boolean[]{true, false, false, true};
      f35000 = new boolean[]{false, true};
      f5000 = new boolean[]{false, false, true, false, true, false, false, false};
      f8000 = new boolean[]{true, false, false};
      f40000 = new boolean[]{true, false, true, false, true, false, true, false};
      f43000 = new boolean[]{false, true, false, true, false, true, false};
      f37000 = new boolean[]{true, false, true, true, false, true, true, false};
      f39000 = new boolean[]{true, false, true, false};
   }
}
