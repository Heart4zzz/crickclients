package rw.setting;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.regex.Pattern;
import rw.NursultanClient;
import rw.api.Iface0196;
import rw.api.Iface0197;
import rw.api.Iface0202;
import rw.api.Iface0212;
import rw.core.Base0315;
import rw.core.C0089;
import rw.core.C0097;
import rw.core.C0258;
import rw.core.C0287;
import rw.core.C0290;
import rw.core.C0297;
import rw.core.C0310;
import rw.core.C0865;
import rw.core.C0871;
import rw.core.C0959;
import rw.core.C1002;
import rw.core.C1073;
import rw.core.C1139;
import rw.core.C1151;
import rw.core.C1235;
import rw.core.OlIrtqjti;
import rw.core.OlsmIikp;
import rw.core.VpFa;
import rw.data.ConfigFiles;
import rw.data.Rec0035;
import rw.data.Rec0076;
import rw.data.Rec0125;
import rw.data.Rec0259;
import rw.defs.Enum0026;
import rw.defs.Enum0065;

public class C0004 {
   public static Object[] f1000;
   private static long[] f2000;
   public static Object[] f3000;
   private static short[] f4000;
   private static float[] f5000;
   private static float[] f6000;
   private static short[] f7000;
   private static short[] f8000;
   private static short[] f9000;
   private static boolean[] f10000;
   private static boolean[] f11000;
   private static boolean[] f12000;
   public static Object[] f13000;
   private static byte[] f14000;
   private static float[] f15000;
   private static byte[] f16000;
   public static Object[] f17000;
   private static boolean[] f18000;
   private static boolean[] f19000;
   private static float[] f20000;
   private static boolean[] f21000;
   private static float[] f22000;
   private static byte[] f23000;
   private static byte[] f24000;
   private static boolean[] f25000;
   private static boolean[] f26000;
   private static String[] f27000;
   private static float[] f28000;
   private static float[] f29000;
   private static byte[] f30000;
   private static String[] f31000;
   private static String[] f32000;
   private static short[] f33000;
   private static int[] f34000;
   private static String[] f35000;
   private static byte[] f36000;
   private static float[] f37000;
   private static short[] f38000;
   public static Object[] f39000;
   private static boolean[] f40000;
   public static Object[] f41000;
   private static float[] f42000;
   private static boolean[] f43000;
   private static boolean[] f44000;
   private static boolean[] f45000;
   private static boolean[] f46000;
   private static byte[] f47000;
   private static byte[] f48000;
   private static short[] f49000;
   private static boolean[] f50000;
   private static String[] f51000;
   private static byte[] f52000;
   public static Object[] f53000;
   private static byte[] f54000;
   private static byte[] f55000;
   private static float[] f56000;
   private static short[] f57000;
   public static Object[] f58000;
   private static byte[] f59000;
   private static float[] f60000;
   private static float[] f61000;
   private static short[] f62000;
   private static boolean[] f63000;
   private static boolean[] f64000;
   private static String[] f65000;
   private static byte[] f66000;
   private static short[] f67000;
   private static float[] f68000;
   private static float[] f69000;
   private static boolean[] f70000;
   public static Object[] f71000;
   private static short[] f72000;
   private static float[] f73000;
   public static Object[] f74000;
   private static short[] f75000;
   private static byte[] f76000;

   private static void m2000(OlsmIikp var0) {
      byte[] var1;
      try {
         var1 = C0865.m14000(NursultanClient.m88000().m152000());
         C1151.m20000(var1);
      } catch (C1139 var3) {
         C0106.m32000(C1235.m36000(var3.m10000().m60000()));
         return;
      }

      var0.m60000(var1);
      var0.m52000(f40000[2]);
      var0.m54000(f40000[3]);
      var0.m58000(System.currentTimeMillis());
      if (var0.m8000() == (Enum0065)Enum0065.f2000[f7000[6]]) {
         var0.m48000((Enum0065)Enum0065.f2000[f7000[7]]);
      }

      NursultanClient.m116000().m54000(var0);
      NursultanClient.m30000().m8000(var0);
      if (NursultanClient.m32000().m84000(var0.m16000())) {
         NursultanClient.m32000().m52000();
      }

      m8000(var0.m32000());
   }

   private static void m8000(UUID var0) {
      C1002 var1 = NursultanClient.m10000().m62000(C1002.class);
      if (!var0.equals(var1.m4000())) {
         var1.m6000(var0);
         ConfigFiles.m54000(C1002.class);
      }
   }

   private static void m10000() {
      float[] var128 = new float[6];
      f37000[(0 | -0) >>> 31] = Float.intBitsToFloat(-1031798784);
      f37000[(1 | -1) >>> 31] = Float.intBitsToFloat(0);
      f37000[2] = Float.intBitsToFloat(0);
      f37000[3] = Float.intBitsToFloat(0);
      f37000[4] = Float.intBitsToFloat(0);
      f37000[5] = Float.intBitsToFloat(1056964608);
      float[] var129 = new float[2];
      f29000[(0 | -0) >>> 31] = Float.intBitsToFloat(0);
      f29000[(1 | -1) >>> 31] = Float.intBitsToFloat(0);
      float[] var130 = new float[7];
      f56000[(0 | -0) >>> 31] = Float.intBitsToFloat(0);
      f56000[(1 | -1) >>> 31] = Float.intBitsToFloat(1132462080);
      f56000[2] = Float.intBitsToFloat(0);
      f56000[3] = Float.intBitsToFloat(0);
      f56000[4] = Float.intBitsToFloat(1121714176);
      f56000[5] = Float.intBitsToFloat(1073741824);
      f56000[6] = Float.intBitsToFloat(0);
      float[] var131 = new float[4];
      f6000[(0 | -0) >>> 31] = Float.intBitsToFloat(0);
      f6000[(1 | -1) >>> 31] = Float.intBitsToFloat(0);
      f6000[2] = Float.intBitsToFloat(0);
      f6000[3] = Float.intBitsToFloat(0);
      float[] var132 = new float[4];
      f28000[(0 | -0) >>> 31] = Float.intBitsToFloat(-1073741824);
      f28000[(1 | -1) >>> 31] = Float.intBitsToFloat(0);
      f28000[2] = Float.intBitsToFloat(0);
      f28000[3] = Float.intBitsToFloat(0);
      float[] var133 = new float[3];
      f15000[(0 | -0) >>> 31] = Float.intBitsToFloat(0);
      f15000[(1 | -1) >>> 31] = Float.intBitsToFloat(0);
      f15000[2] = Float.intBitsToFloat(0);
      float[] var134 = new float[7];
      f22000[(0 | -0) >>> 31] = Float.intBitsToFloat(0);
      f22000[(1 | -1) >>> 31] = Float.intBitsToFloat(0);
      f22000[2] = Float.intBitsToFloat(0);
      f22000[3] = Float.intBitsToFloat(0);
      f22000[4] = Float.intBitsToFloat(0);
      f22000[5] = Float.intBitsToFloat(0);
      f22000[6] = Float.intBitsToFloat(0);
      float[] var135 = new float[4];
      f60000[(0 | -0) >>> 31] = Float.intBitsToFloat(0);
      f60000[(1 | -1) >>> 31] = Float.intBitsToFloat(-1007681536);
      f60000[2] = Float.intBitsToFloat(1120403456);
      f60000[3] = Float.intBitsToFloat(1101004800);
      float[] var136 = new float[7];
      f69000[(0 | -0) >>> 31] = Float.intBitsToFloat(1065353216);
      f69000[(1 | -1) >>> 31] = Float.intBitsToFloat(1110441984);
      f69000[2] = Float.intBitsToFloat(1110441984);
      f69000[3] = Float.intBitsToFloat(1065353216);
      f69000[4] = Float.intBitsToFloat(1090519040);
      f69000[5] = Float.intBitsToFloat(1110441984);
      f69000[6] = Float.intBitsToFloat(1110441984);
      float[] var137 = new float[6];
      f68000[(0 | -0) >>> 31] = Float.intBitsToFloat(1065353216);
      f68000[(1 | -1) >>> 31] = Float.intBitsToFloat(1090519040);
      f68000[2] = Float.intBitsToFloat(1101004800);
      f68000[3] = Float.intBitsToFloat(1101004800);
      f68000[4] = Float.intBitsToFloat(1120403456);
      f68000[5] = Float.intBitsToFloat(1094713344);
      float[] var138 = new float[8];
      f73000[(0 | -0) >>> 31] = Float.intBitsToFloat(1065353216);
      f73000[(1 | -1) >>> 31] = Float.intBitsToFloat(1065353216);
      f73000[2] = Float.intBitsToFloat(1120403456);
      f73000[3] = Float.intBitsToFloat(1114636288);
      f73000[4] = Float.intBitsToFloat(1099431936);
      f73000[5] = Float.intBitsToFloat(1099431936);
      f73000[6] = Float.intBitsToFloat(1094713344);
      f73000[7] = Float.intBitsToFloat(1094713344);
      float[] var139 = new float[3];
      f42000[(0 | -0) >>> 31] = Float.intBitsToFloat(0);
      f42000[(1 | -1) >>> 31] = Float.intBitsToFloat(0);
      f42000[2] = Float.intBitsToFloat(0);
      float[] var140 = new float[3];
      f5000[(0 | -0) >>> 31] = Float.intBitsToFloat(2139095040);
      f5000[(1 | -1) >>> 31] = Float.intBitsToFloat(1106247680);
      f5000[2] = Float.intBitsToFloat(1120403456);
      float[] var141 = new float[7];
      f20000[(0 | -0) >>> 31] = Float.intBitsToFloat(1094713344);
      f20000[(1 | -1) >>> 31] = Float.intBitsToFloat(1082130432);
      f20000[2] = Float.intBitsToFloat(0);
      f20000[3] = Float.intBitsToFloat(1109393408);
      f20000[4] = Float.intBitsToFloat(1077936128);
      f20000[5] = Float.intBitsToFloat(1090519040);
      f20000[6] = Float.intBitsToFloat(1120403456);
      float[] var142 = new float[8];
      f61000[(0 | -0) >>> 31] = Float.intBitsToFloat(1115947008);
      f61000[(1 | -1) >>> 31] = Float.intBitsToFloat(1090519040);
      f61000[2] = Float.intBitsToFloat(1115684864);
      f61000[3] = Float.intBitsToFloat(0);
      f61000[4] = Float.intBitsToFloat(1132462080);
      f61000[5] = Float.intBitsToFloat(1121714176);
      f61000[6] = Float.intBitsToFloat(1073741824);
      f61000[7] = Float.intBitsToFloat(1109393408);
   }

   private static void m22000() {
      int[] var128 = new int[8];
      f34000[(0 | -0) >>> 31] = -7171438;
      f34000[(1 | -1) >>> 31] = -11119018;
      f34000[2] = -6579301;
      f34000[3] = -7171438;
      f34000[4] = -7171438;
      f34000[5] = -7171438;
      f34000[6] = 6579300;
      f34000[7] = -7171438;
   }

   private C0004() {
   }

   static {
      ntfClinit();
   }

   private static void m30000() {
      f13000 = new Object[f23000[4]];
      f58000 = new Object[f23000[5]];
      f58000[f43000[2]] = f43000[3];
      f17000 = new Object[f23000[6]];
      f17000[f43000[4]] = f61000[3];
      f17000[f43000[5]] = Integer.valueOf(f76000[(0 | -0) >>> 31]);
      f17000[f76000[(1 | -1) >>> 31]] = Integer.valueOf(f76000[2]);
      f17000[f76000[3]] = Integer.valueOf(f76000[4]);
      f1000 = new Object[f76000[5]];
      f1000[f43000[6]] = Integer.valueOf(f4000[4]);
      f1000[f21000[(0 | -0) >>> 31]] = Integer.valueOf(f4000[5]);
      f1000[f76000[6]] = f61000[4];
      f1000[f55000[(0 | -0) >>> 31]] = f61000[5];
      f1000[f55000[(1 | -1) >>> 31]] = f61000[6];
      f74000 = new Object[f47000[(0 | -0) >>> 31]];
      f39000 = new Object[f47000[(1 | -1) >>> 31]];
      f39000[f21000[(1 | -1) >>> 31]] = Integer.valueOf(f47000[2]);
      f3000 = new Object[f47000[3]];
      f71000 = new Object[f47000[4]];
      f71000[f21000[2]] = Integer.valueOf(f47000[5]);
      f53000 = new Object[f47000[6]];
      f53000[f21000[3]] = f61000[7];
      f41000 = new Object[f47000[7]];
   }

   private static void m42000() {
      byte[] var128 = new byte[5];
      f52000[(0 | -0) >>> 31] = 2;
      f52000[(1 | -1) >>> 31] = 20;
      f52000[2] = 2;
      f52000[3] = 2;
      f52000[4] = 2;
      byte[] var129 = new byte[3];
      f59000[(0 | -0) >>> 31] = 2;
      f59000[(1 | -1) >>> 31] = 2;
      f59000[2] = 3;
      byte[] var130 = new byte[7];
      f16000[(0 | -0) >>> 31] = 4;
      f16000[(1 | -1) >>> 31] = 2;
      f16000[2] = 3;
      f16000[3] = 5;
      f16000[4] = 2;
      f16000[5] = 3;
      f16000[6] = 4;
      byte[] var131 = new byte[5];
      f24000[(0 | -0) >>> 31] = 5;
      f24000[(1 | -1) >>> 31] = 3;
      f24000[2] = 3;
      f24000[3] = 2;
      f24000[4] = 22;
      byte[] var132 = new byte[5];
      f14000[(0 | -0) >>> 31] = 5;
      f14000[(1 | -1) >>> 31] = 2;
      f14000[2] = 2;
      f14000[3] = 16;
      f14000[4] = 3;
      byte[] var133 = new byte[8];
      f54000[(0 | -0) >>> 31] = 3;
      f54000[(1 | -1) >>> 31] = 4;
      f54000[2] = 2;
      f54000[3] = 18;
      f54000[4] = 3;
      f54000[5] = 5;
      f54000[6] = 2;
      f54000[7] = 18;
      byte[] var134 = new byte[2];
      f48000[(0 | -0) >>> 31] = 3;
      f48000[(1 | -1) >>> 31] = 6;
      byte[] var135 = new byte[8];
      f66000[(0 | -0) >>> 31] = 3;
      f66000[(1 | -1) >>> 31] = 2;
      f66000[2] = 2;
      f66000[3] = 2;
      f66000[4] = 12;
      f66000[5] = 3;
      f66000[6] = 3;
      f66000[7] = 2;
      byte[] var136 = new byte[6];
      f36000[(0 | -0) >>> 31] = 2;
      f36000[(1 | -1) >>> 31] = 14;
      f36000[2] = 3;
      f36000[3] = 3;
      f36000[4] = 2;
      f36000[5] = 20;
      byte[] var137 = new byte[2];
      f30000[(0 | -0) >>> 31] = 3;
      f30000[(1 | -1) >>> 31] = 4;
      byte[] var138 = new byte[7];
      f23000[(0 | -0) >>> 31] = 5;
      f23000[(1 | -1) >>> 31] = 2;
      f23000[2] = 4;
      f23000[3] = 6;
      f23000[4] = 4;
      f23000[5] = 2;
      f23000[6] = 4;
      byte[] var139 = new byte[7];
      f76000[(0 | -0) >>> 31] = 44;
      f76000[(1 | -1) >>> 31] = 2;
      f76000[2] = 20;
      f76000[3] = 3;
      f76000[4] = 64;
      f76000[5] = 6;
      f76000[6] = 2;
      byte[] var140 = new byte[2];
      f55000[(0 | -0) >>> 31] = 3;
      f55000[(1 | -1) >>> 31] = 4;
      byte[] var141 = new byte[8];
      f47000[(0 | -0) >>> 31] = 6;
      f47000[(1 | -1) >>> 31] = 2;
      f47000[2] = 12;
      f47000[3] = 7;
      f47000[4] = 2;
      f47000[5] = 3;
      f47000[6] = 4;
      f47000[7] = 7;
   }

   private static boolean m46000(OlsmIikp var0) {
      UUID var1 = NursultanClient.m10000().m62000(C1002.class).m4000();
      return var0.m32000().equals(var1);
   }

   private static boolean m80000(OlsmIikp var0) {
      String var1 = var0.m30000();
      return var1 != null && var1.equals(((C0959)NursultanClient.f13000[f72000[1]]).m20000()) ? f40000[4] : f40000[5];
   }

   private static void m84000() {
      f27000 = new String[2];
      f27000[(0 | -0) >>> 31] = "nursultan:presetDeleting";
      f27000[(1 | -1) >>> 31] = "nursultan:shareModalTarget";
      f32000 = new String[5];
      f32000[(0 | -0) >>> 31] = "shareConnected";
      f32000[(1 | -1) >>> 31] = "nursultan:shareModalTarget";
      f32000[2] = "shareConnected";
      f32000[3] = "config.sync.progress";
      f32000[4] = "config.sync.offline";
      f35000 = new String[3];
      f35000[(0 | -0) >>> 31] = "icon:menu/save";
      f35000[(1 | -1) >>> 31] = "config.save";
      f35000[2] = "icon:menu/run";
      f31000 = new String[6];
      f31000[(0 | -0) >>> 31] = "config.load";
      f31000[(1 | -1) >>> 31] = "preset.error.not-available-offline";
      f31000[2] = "icon:menu/delete";
      f31000[3] = "icon:menu/pen";
      f31000[4] = "icon:menu/share";
      f31000[5] = "share";
      f65000 = new String[8];
      f65000[(0 | -0) >>> 31] = "delete";
      f65000[(1 | -1) >>> 31] = "action";
      f65000[2] = "icon:menu/delete";
      f65000[3] = "share";
      f65000[4] = "action";
      f65000[5] = "config.item.last-update";
      f65000[6] = "icon:menu/delete";
      f65000[7] = "HH:mm dd.MM.yy";
      f51000 = new String[(1 | -1) >>> 31];
      f51000[(0 | -0) >>> 31] = "^[A-Za-zА-Яа-яЁё0-9 _-]{0,32}$";
   }

   private static void m90000() {
      short[] var128 = new short[4];
      f62000[(0 | -0) >>> 31] = 6;
      f62000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f62000[2] = (short)((0 | -0) >>> 31);
      f62000[3] = 3;
      short[] var129 = new short[8];
      f67000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f67000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f67000[2] = (short)((0 | -0) >>> 31);
      f67000[3] = (short)((0 | -0) >>> 31);
      f67000[4] = (short)((0 | -0) >>> 31);
      f67000[5] = 5;
      f67000[6] = 2;
      f67000[7] = 3;
      short[] var130 = new short[3];
      f57000[(0 | -0) >>> 31] = (short)((1 | -1) >>> 31);
      f57000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      f57000[2] = (short)((0 | -0) >>> 31);
      short[] var131 = new short[3];
      f49000[(0 | -0) >>> 31] = 6;
      f49000[(1 | -1) >>> 31] = 5;
      f49000[2] = 6;
      short[] var132 = new short[8];
      f7000[(0 | -0) >>> 31] = (short)((1 | -1) >>> 31);
      f7000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f7000[2] = (short)((1 | -1) >>> 31);
      f7000[3] = 2;
      f7000[4] = (short)((0 | -0) >>> 31);
      f7000[5] = 4;
      f7000[6] = (short)((0 | -0) >>> 31);
      f7000[7] = (short)((1 | -1) >>> 31);
      short[] var133 = new short[3];
      f72000[(0 | -0) >>> 31] = -29813;
      f72000[(1 | -1) >>> 31] = 2;
      f72000[2] = 3;
      short[] var134 = new short[4];
      f8000[(0 | -0) >>> 31] = 2;
      f8000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f8000[2] = (short)((0 | -0) >>> 31);
      f8000[3] = (short)((0 | -0) >>> 31);
      short[] var135 = new short[5];
      f38000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f38000[(1 | -1) >>> 31] = 3;
      f38000[2] = (short)((0 | -0) >>> 31);
      f38000[3] = 3;
      f38000[4] = (short)((0 | -0) >>> 31);
      short[] var136 = new short[5];
      f33000[(0 | -0) >>> 31] = (short)((1 | -1) >>> 31);
      f33000[(1 | -1) >>> 31] = 2;
      f33000[2] = 4;
      f33000[3] = (short)((1 | -1) >>> 31);
      f33000[4] = (short)((0 | -0) >>> 31);
      short[] var137 = new short[2];
      f75000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f75000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      short[] var138 = new short[8];
      f9000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f9000[(1 | -1) >>> 31] = 2;
      f9000[2] = 3;
      f9000[3] = 5;
      f9000[4] = 6;
      f9000[5] = 3;
      f9000[6] = 5;
      f9000[7] = (short)((1 | -1) >>> 31);
      short[] var139 = new short[6];
      f4000[(0 | -0) >>> 31] = 3;
      f4000[(1 | -1) >>> 31] = 4;
      f4000[2] = -29813;
      f4000[3] = -29813;
      f4000[4] = -29813;
      f4000[5] = 480;
   }

   private static void m92000(OlsmIikp var0) {
      if (var0.m50000() && var0.m28000() != null) {
         new C0871().m2000(var0.m2000(), var0.m28000());
         m8000(var0.m32000());
      } else if (!var0.m46000() && NursultanClient.m82000().m72000()) {
         m8000(var0.m32000());
         NursultanClient.m30000().m52000(var0.m32000());
      } else {
         C0106.m32000(C1235.m36000(f31000[1]));
      }
   }

   private static boolean m98000(UUID var0) {
      if (!(Boolean)f58000[f57000[0]]) {
         Boolean var5 = f63000[0];
         f58000[f57000[1]] = var5;
         NursultanClient.m116000().m8000().forEach(var0x -> ((Set)f58000[f38000[2]]).add(var0x.m32000()));
      }

      return ((Set)f58000[f57000[2]]).add(var0);
   }

   private static Rec0259 m108000(OlsmIikp var0) {
      return new Rec0259(f31000[2], f72000[0], () -> m202000(var0));
   }

   private static String m110000(long var0) {
      return LocalDateTime.ofInstant(Instant.ofEpochMilli(var0), ZoneId.systemDefault()).format((DateTimeFormatter)f74000[f7000[5]]);
   }

   private static C0031 m114000(OlsmIikp var0, Iface0196<UUID> var1) {
      return C0287.m26000((C0056)f74000[f67000[6]], var2 -> {
         var2.N("configDeleteRequest:" + var0.m32000());
         var2.N(Enum0026.f2000, Base0315::m6000);
         var2.N(var2x -> {
            var1.m6000(var0.m32000());
            var2x.m6000();
         });
         var2.L(var0xx -> var0xx.m2000(f65000[2]).N((C0056)f74000[f38000[3]]));
      });
   }

   private static String m124000(OlsmIikp var0) {
      return switch (((int[])C0089.f1000[f7000[4]])[var0.m8000().ordinal()]) {
         case 1, 2 -> NursultanClient.m82000().m72000() ? f32000[3] : f32000[4];
         case 3, 4 -> null;
         default -> throw new MatchException(null, null);
      };
   }

   public static void m138000(Set<UUID> var0) {
      ((Map)f13000[f67000[7]]).keySet().retainAll(var0);
   }

   private C0031 m140000(OlsmIikp var1, Iface0202 var2) {
      OlIrtqjti var3 = var2.m28000((C0297<OlIrtqjti>)OlIrtqjti.f4000[f49000[0]]);
      boolean var4 = m46000(var1);
      Iface0196 var5 = var2.m6000(f32000[1], (UUID)null);
      boolean var6 = Boolean.TRUE.equals(var2.m2000(f32000[2], () -> NursultanClient.m82000().m72000()));
      boolean var7 = m80000(var1) && var1.m16000() > f2000[1] ? f63000[1] : f63000[2];
      boolean var8 = var7 && Boolean.TRUE.equals(var2.m2000("shared:" + var1.m32000(), () -> NursultanClient.m32000().m84000(var1.m16000())))
         ? f63000[3]
         : f63000[4];
      C0056 var9 = var4 ? ((C0097)f41000[f49000[1]]).m8000(var3) : (C0056)f41000[f49000[2]];
      return C0287.m26000((C0056)f41000[f7000[0]], var9x -> {
         var9x.N("presetSearch:" + var1.m32000());
         var9x.N(Enum0026.f2000, Base0315::m6000);
         var9x.N((C0056)f41000[f8000[0]], var2xx -> {
            var2xx.N(var1.m22000(), var9);
            var2xx.N(var1.m30000(), (C0056)f41000[f38000[1]]);
         });
         var9x.N((C0056)f41000[f8000[1]], var8xx -> {
            if (var7) {
               var8xx.y(var2.m18000(f31000[5], (Iface0197<Rec0259>)VpFa.f1000[f8000[2]], m154000(var1, var8, var6, var3, var5)));
            }

            if (!var4) {
               var8xx.y(var2.m18000(f65000[0], (Iface0197<Rec0259>)VpFa.f1000[f8000[3]], m108000(var1)));
            }

            var8xx.y(var2.m18000(f65000[1], (Iface0197<Rec0259>)VpFa.f1000[f38000[0]], m152000(var1, var4, var3)));
         });
      });
   }

   private static void m142000() {
      long[] var128 = new long[2];
      f2000[(0 | -0) >>> 31] = 0L;
      f2000[(1 | -1) >>> 31] = 0L;
   }

   private static Rec0259 m152000(OlsmIikp var0, boolean var1, OlIrtqjti var2) {
      return var1
         ? new Rec0259(f35000[0], var2.m6000(), C1235.m36000(f35000[1]), () -> m2000(var0))
         : new Rec0259(f35000[2], var2.m6000(), C1235.m36000(f31000[0]), () -> m92000(var0));
   }

   private static Rec0259 m154000(OlsmIikp var0, boolean var1, boolean var2, OlIrtqjti var3, Iface0196<UUID> var4) {
      String var5 = var1 ? f31000[3] : f31000[4];
      return !var2 ? new Rec0259(var5, f34000[1], () -> {}) : new Rec0259(var5, f34000[2], () -> var4.m6000(var0.m32000()));
   }

   private C0031 m160000(Rec0035 var1, Iface0202 var2) {
      OlsmIikp var3 = var1.m6000();
      boolean var4 = var1.m4000();
      OlIrtqjti var5 = var2.m28000((C0297<OlIrtqjti>)OlIrtqjti.f4000[f62000[0]]);
      boolean var6 = m46000(var3);
      Iface0196 var7 = var2.m20000("editedName:" + var3.m32000(), var3.m22000());
      Iface0196 var8 = var2.m6000(f27000[0], (UUID)null);
      boolean var9 = var3.m32000().equals(var8.m2000());
      Iface0196 var10 = var2.m6000(f27000[1], (UUID)null);
      boolean var11 = Boolean.TRUE.equals(var2.m2000(f32000[0], () -> NursultanClient.m82000().m72000()));
      boolean var12 = m80000(var3) && var3.m16000() > f2000[0] ? f44000[0] : f44000[1];
      boolean var13 = var12 && Boolean.TRUE.equals(var2.m2000("shared:" + var3.m32000(), () -> NursultanClient.m32000().m84000(var3.m16000())))
         ? f44000[2]
         : f46000[0];
      String var14 = var2.m2000("syncStatus:" + var3.m32000(), () -> m124000(var3));
      C0056 var15 = m178000(var6, var5);
      C0056[] var10000 = new C0056[f52000[0]];
      var10000[f46000[1]] = (C0056)f3000[f62000[1]];
      byte var10002 = f50000[0];
      C0056 var10003 = C0056.m130000().m198000(var9 ? f37000[0] : f37000[1]).m2000(var9);
      Rec0057[] var10004 = new Rec0057[f50000[1]];
      var10004[f50000[2]] = Rec0057.m14000((Rec0076)C1073.f1000[f62000[2]]);
      var10000[var10002] = var10003.m186000(C0258.m10000(var10004));
      C0056 var16 = C0056.m120000(var10000);
      C0290 var17 = ((Map)f13000[f62000[3]]).computeIfAbsent(var3.m32000(), var0 -> new C0290());
      Iface0196 var18 = var2.m20000("presetHeight:" + var3.m32000(), f37000[2]);
      float var19 = var17.m2000() != null ? ((Iface0212)var17.m2000()).m18000().m10000() : f37000[3];
      if (var19 > f37000[4] && Math.abs(var19 - (Float)var18.m2000()) > f37000[5]) {
         var18.m6000(var19);
      }

      float var20 = (Float)var18.m2000();
      if (var20 > f29000[0]) {
         Float var30 = var20;
         f17000[f67000[0]] = var30;
      }

      float var21 = var20 > f29000[1] ? var20 : (f17000[f67000[1]] > f56000[0] ? (Float)f17000[f67000[2]] : f56000[1]);
      float var22 = var20 > f56000[2] ? var20 : (f17000[f67000[3]] > f56000[3] ? (Float)f17000[f67000[4]] : f56000[4]);
      float var23 = var21 + f56000[5];
      byte var24 = var4 ? f50000[3] : f52000[1];
      var10000 = new C0056[f52000[2]];
      var10000[f50000[4]] = (C0056)f1000[f67000[5]];
      var10000[f19000[0]] = C0056.m130000().m90000(Rec0125.m32000(f56000[6], var23)).m18000(var24);
      C0056 var25 = C0056.m120000(var10000);
      if (m98000(var3.m32000())) {
         var10000 = new C0056[f52000[3]];
         var10000[f19000[1]] = var25;
         var10000[f19000[2]] = C0056.m130000()
            .m110000(var1x -> var1x.m90000(Rec0125.m32000(f6000[0], f6000[1])).m18000(f6000[2]).m50000(f6000[3]).m56000(f28000[0] * var22));
         var25 = C0056.m120000(var10000);
      }

      return C0287.m26000(var25, var15x -> {
         var15x.N("configWrapper:" + var3.m32000());
         if (var9) {
            var15x.N((C0056)f74000[f38000[4]], var2xx -> {
               var2xx.N("configDeleteLayer:" + var3.m32000());
               var2xx.N(Enum0026.f2000, Base0315::m6000);
               var2xx.N(var1xxx -> {
                  var8.m6000(null);
                  var1xxx.m6000();
               });
               var2xx.N((C0056)f74000[f9000[7]], var2xxx -> {
                  var2xxx.N("configDeleteConfirm:" + var3.m32000());
                  var2xxx.N(Enum0026.f2000, Base0315::m6000);
                  var2xxx.N(var2xxxx -> {
                     var8.m6000(null);
                     m202000(var3);
                     var2xxxx.m6000();
                  });
                  var2xxx.L(var0xxx -> var0xxx.m2000(f65000[6]).N((C0056)f74000[f4000[0]]));
               });
            });
         }

         var15x.N(var16, var13xx -> {
            var13xx.N("configCard:" + var3.m32000());
            var13xx.N(var17);
            var13xx.N(Enum0026.f2000, Base0315::m6000);
            var13xx.N(Enum0026.f4000, var1xxx -> {
               if (var8.m2000() != null) {
                  var8.m6000(null);
                  var1xxx.m6000();
               }
            });
            var13xx.N((C0056)f3000[f33000[0]], var3xxx -> {
               var3xxx.u(var3xxxx -> {
                  var3xxxx.N("nameInput:" + var3.m32000());
                  var3xxxx.m2000((String)var7.m2000());
                  var3xxxx.N(var15);
                  var3xxxx.N(Enum0026.f9000, var1xxxxx -> {
                     C0310 var2xxxxx = (C0310)var1xxxxx;
                     String var3xxxxx = var2xxxxx.m2000();
                     if (((Pattern)f74000[f9000[6]]).matcher(var3xxxxx).matches()) {
                        var7.m6000(var3xxxxx);
                     } else {
                        var1xxxxx.m26000().m42000(var2xxxxx.m4000());
                     }
                  });
                  var3xxxx.N(Enum0026.f12000, var2xxxxx -> m166000(var3, var7));
               });
               var3xxx.N(var3.m30000(), (C0056)f3000[f9000[5]]);
            });
            var13xx.y((C0056)rw.core.C0076.f5000[f33000[1]]);
            var13xx.N((C0056)f3000[f33000[2]], var10xxx -> {
               var10xxx.N((C0056)f53000[f33000[3]], var2xxxx -> {
                  var2xxxx.N((C0056)f71000[f9000[0]], var1xxxxx -> {
                     var1xxxxx.N(C1235.m36000(f65000[5]), (C0056)f3000[f9000[3]]);
                     var1xxxxx.N(m110000(var3.m14000()), (C0056)f3000[f9000[4]]);
                  });
                  if (var14 != null) {
                     var2xxxx.N((C0056)f53000[f9000[1]], var2xxxxx -> {
                        var2xxxxx.N("presetSyncStatus:" + var3.m32000());
                        var2xxxxx.N(C1235.m36000(var14), (C0056)f53000[f9000[2]]);
                     });
                  }
               });
               var10xxx.N((C0056)f41000[f33000[4]], var9xxxx -> {
                  if (var12) {
                     var9xxxx.y(var2.m18000(f65000[3], (Iface0197<Rec0259>)VpFa.f1000[f75000[0]], m154000(var3, var13, var11, var5, var10)));
                  }

                  if (!var6) {
                     var9xxxx.y(m114000(var3, var8));
                  }

                  var9xxxx.y(var2.m18000(f65000[4], (Iface0197<Rec0259>)VpFa.f1000[f75000[1]], m152000(var3, var6, var5)));
               });
            });
         });
      });
   }

   private static void m166000(OlsmIikp var0, Iface0196<String> var1) {
      String var2 = (String)var1.m2000();

      String var3;
      try {
         var3 = C1151.m24000(var2);
      } catch (C1139 var5) {
         var1.m6000(var0.m22000());
         return;
      }

      if (var3.equals(var0.m22000())) {
         var1.m6000(var3);
      } else {
         var0.m56000(var3);
         var0.m58000(System.currentTimeMillis());
         if (var0.m8000() == (Enum0065)Enum0065.f2000[f7000[1]]) {
            var0.m48000((Enum0065)Enum0065.f2000[f7000[2]]);
         }

         NursultanClient.m116000().m54000(var0);
         if (!var0.m46000()) {
            NursultanClient.m30000().m72000(var0);
            if (NursultanClient.m32000().m84000(var0.m16000())) {
               NursultanClient.m32000().m52000();
            }
         }

         var1.m6000(var3);
      }
   }

   private static C0056 m178000(boolean var0, OlIrtqjti var1) {
      int var2 = var0 ? var1.m6000() : f34000[0];
      C0056[] var10000 = new C0056[f52000[4]];
      var10000[f40000[0]] = (C0056)f3000[f7000[3]];
      var10000[f40000[1]] = C0056.m130000().m40000(var2);
      return C0056.m120000(var10000);
   }

   private static void m196000() {
      boolean[] var128 = new boolean[3];
      f44000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f44000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f44000[2] = (boolean)((1 | -1) >>> 31);
      boolean[] var129 = new boolean[2];
      f46000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f46000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      boolean[] var130 = new boolean[5];
      f50000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f50000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f50000[2] = (boolean)((0 | -0) >>> 31);
      f50000[3] = (boolean)((0 | -0) >>> 31);
      f50000[4] = (boolean)((0 | -0) >>> 31);
      boolean[] var131 = new boolean[3];
      f19000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f19000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f19000[2] = (boolean)((1 | -1) >>> 31);
      boolean[] var132 = new boolean[5];
      f63000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f63000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f63000[2] = (boolean)((0 | -0) >>> 31);
      f63000[3] = (boolean)((1 | -1) >>> 31);
      f63000[4] = (boolean)((0 | -0) >>> 31);
      boolean[] var133 = new boolean[6];
      f40000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f40000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f40000[2] = (boolean)((1 | -1) >>> 31);
      f40000[3] = (boolean)((1 | -1) >>> 31);
      f40000[4] = (boolean)((1 | -1) >>> 31);
      f40000[5] = (boolean)((0 | -0) >>> 31);
      boolean[] var134 = new boolean[8];
      f70000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f70000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f70000[2] = (boolean)((0 | -0) >>> 31);
      f70000[3] = (boolean)((0 | -0) >>> 31);
      f70000[4] = (boolean)((1 | -1) >>> 31);
      f70000[5] = (boolean)((0 | -0) >>> 31);
      f70000[6] = (boolean)((0 | -0) >>> 31);
      f70000[7] = (boolean)((0 | -0) >>> 31);
      boolean[] var135 = new boolean[7];
      f10000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f10000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f10000[2] = (boolean)((0 | -0) >>> 31);
      f10000[3] = (boolean)((0 | -0) >>> 31);
      f10000[4] = (boolean)((0 | -0) >>> 31);
      f10000[5] = (boolean)((0 | -0) >>> 31);
      f10000[6] = (boolean)((1 | -1) >>> 31);
      boolean[] var136 = new boolean[7];
      f18000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f18000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f18000[2] = (boolean)((0 | -0) >>> 31);
      f18000[3] = (boolean)((0 | -0) >>> 31);
      f18000[4] = (boolean)((1 | -1) >>> 31);
      f18000[5] = (boolean)((0 | -0) >>> 31);
      f18000[6] = (boolean)((1 | -1) >>> 31);
      boolean[] var137 = new boolean[8];
      f45000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f45000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f45000[2] = (boolean)((0 | -0) >>> 31);
      f45000[3] = (boolean)((0 | -0) >>> 31);
      f45000[4] = (boolean)((1 | -1) >>> 31);
      f45000[5] = (boolean)((1 | -1) >>> 31);
      f45000[6] = (boolean)((0 | -0) >>> 31);
      f45000[7] = (boolean)((0 | -0) >>> 31);
      boolean[] var138 = new boolean[8];
      f11000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f11000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f11000[2] = (boolean)((0 | -0) >>> 31);
      f11000[3] = (boolean)((1 | -1) >>> 31);
      f11000[4] = (boolean)((0 | -0) >>> 31);
      f11000[5] = (boolean)((1 | -1) >>> 31);
      f11000[6] = (boolean)((0 | -0) >>> 31);
      f11000[7] = (boolean)((1 | -1) >>> 31);
      boolean[] var139 = new boolean[7];
      f25000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f25000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f25000[2] = (boolean)((1 | -1) >>> 31);
      f25000[3] = (boolean)((0 | -0) >>> 31);
      f25000[4] = (boolean)((1 | -1) >>> 31);
      f25000[5] = (boolean)((0 | -0) >>> 31);
      f25000[6] = (boolean)((0 | -0) >>> 31);
      boolean[] var140 = new boolean[3];
      f26000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f26000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f26000[2] = (boolean)((0 | -0) >>> 31);
      boolean[] var141 = new boolean[7];
      f64000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f64000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f64000[2] = (boolean)((0 | -0) >>> 31);
      f64000[3] = (boolean)((1 | -1) >>> 31);
      f64000[4] = (boolean)((0 | -0) >>> 31);
      f64000[5] = (boolean)((1 | -1) >>> 31);
      f64000[6] = (boolean)((0 | -0) >>> 31);
      boolean[] var142 = new boolean[2];
      f12000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f12000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      boolean[] var143 = new boolean[7];
      f43000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f43000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f43000[2] = (boolean)((1 | -1) >>> 31);
      f43000[3] = (boolean)((0 | -0) >>> 31);
      f43000[4] = (boolean)((0 | -0) >>> 31);
      f43000[5] = (boolean)((1 | -1) >>> 31);
      f43000[6] = (boolean)((0 | -0) >>> 31);
      boolean[] var144 = new boolean[4];
      f21000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f21000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f21000[2] = (boolean)((1 | -1) >>> 31);
      f21000[3] = (boolean)((0 | -0) >>> 31);
   }

   private static void m202000(OlsmIikp var0) {
      C1002 var1 = NursultanClient.m10000().m62000(C1002.class);
      if (var0.m32000().equals(var1.m4000())) {
         var1.m6000(null);
         ConfigFiles.m54000(C1002.class);
      }

      if (var0.m46000()) {
         NursultanClient.m116000().m44000(var0.m32000());
      } else {
         var0.m48000((Enum0065)Enum0065.f2000[f72000[2]]);
         var0.m58000(System.currentTimeMillis());
         NursultanClient.m116000().m54000(var0);
         NursultanClient.m30000().m28000(var0);
         NursultanClient.m32000().m6000(var0.m16000());
      }
   }
}
