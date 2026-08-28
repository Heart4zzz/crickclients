package rw.setting;

import KDFzREm.NNNZg;
import KDFzREm.NNNwS;
import KDFzREm.NNuN;
import KDFzREm.NNuU;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import net.minecraft.client.renderer.item.SelectItemModel$UnbakedSwitch;
import rw.NursultanClient;
import rw.api.Iface0196;
import rw.api.Iface0197;
import rw.api.Iface0202;
import rw.api.Iface0212;
import rw.core.Base0315;
import rw.core.C0258;
import rw.core.C0287;
import rw.core.C0290;
import rw.core.C0297;
import rw.core.C0299;
import rw.core.C0368;
import rw.core.C0750;
import rw.core.C1073;
import rw.core.C1107;
import rw.core.C1131;
import rw.core.C1235;
import rw.core.IltqImqmt;
import rw.core.MSAuth;
import rw.core.Noqodls;
import rw.core.OlIrtqjti;
import rw.core.VpFa;
import rw.data.ConfigFiles;
import rw.data.Rec0076;
import rw.data.Rec0125;
import rw.data.Rec0222;
import rw.data.Rec0248;
import rw.data.Rec0259;
import rw.defs.Enum0002;
import rw.defs.Enum0004;
import rw.defs.Enum0019;
import rw.defs.Enum0026;

public class C0150 {
   private static byte[] f1000;
   public static Object[] f2000;
   private static short[] f3000;
   private static float[] f4000;
   private static boolean[] f5000;
   private static float[] f6000;
   private static boolean[] f7000;
   private static float[] f8000;
   private static float[] f9000;
   private static short[] f10000;
   private static float[] f11000;
   private static byte[] f12000;
   private static String[] f13000;
   private static boolean[] f14000;
   private static byte[] f15000;
   private static short[] f16000;
   private static byte[] f17000;
   private static short[] f18000;
   private static float[] f19000;
   private static byte[] f20000;
   private static byte[] f21000;
   private static boolean[] f22000;
   private static byte[] f23000;
   private static boolean[] f24000;
   private static short[] f25000;
   private static boolean[] f26000;
   private static boolean[] f27000;
   private static byte[] f28000;
   private static float[] f29000;
   public static Object[] f30000;
   private static byte[] f31000;
   private static float[] f32000;
   public static Object[] f33000;
   public static Object[] f34000;
   private static float[] f35000;
   private static byte[] f36000;
   private static String[] f37000;
   private static int[] f38000;
   private static byte[] f39000;
   public static Object[] f40000;
   private static float[] f41000;
   private static float[] f42000;
   private static boolean[] f43000;
   private static float[] f44000;
   public static Object[] f45000;
   private static boolean[] f46000;
   private static byte[] f47000;
   private static boolean[] f48000;
   private static short[] f49000;
   private static boolean[] f50000;
   private static float[] f51000;
   private static byte[] f52000;
   private static short[] f53000;
   private static float[] f54000;
   private static short[] f55000;
   private static boolean[] f56000;
   public static Object[] f57000;
   private static String[] f58000;
   private static float[] f59000;
   private static boolean[] f60000;
   private static boolean[] f61000;
   private static short[] f62000;
   private static boolean[] f63000;
   public static Object[] f64000;
   private static boolean[] f65000;
   private static byte[] f66000;
   private static byte[] f67000;
   private static boolean[] f68000;
   private static short[] f69000;
   private static short[] f70000;
   private static byte[] f71000;
   private static float[] f72000;
   private static byte[] f73000;
   public static Object[] f74000;
   private static boolean[] f75000;
   private static float[] f76000;
   private static boolean[] f77000;
   private static short[] f78000;
   private static byte[] f79000;
   private static short[] f80000;
   private static int[] f81000;
   public static Object[] f82000;
   private static byte[] f83000;
   private static long[] f84000;
   private static short[] f85000;
   private static float[] f86000;
   private static float[] f87000;
   public static Object[] f88000;
   private static boolean[] f89000;

   private static boolean m14000() {
      NNuU var0 = NNuU.Nq();
      return var0 != null && !var0.Ny().u().isEmpty() ? f5000[5] : f5000[6];
   }

   private static void m24000(Noqodls var0) {
      C0750.m26000(var0.m38000());
      IltqImqmt var1 = NursultanClient.m10000().m62000(IltqImqmt.class);
      if (var0.m38000().equals(var1.m4000())) {
         var1.m6000(null);
         ConfigFiles.m54000(IltqImqmt.class);
      }

      NursultanClient.m48000().m26000(var0.m38000());
   }

   private static void m26000() {
      byte[] var128 = new byte[2];
      f47000[(0 | -0) >>> 31] = 2;
      f47000[(1 | -1) >>> 31] = 2;
      byte[] var129 = new byte[8];
      f15000[(0 | -0) >>> 31] = 2;
      f15000[(1 | -1) >>> 31] = 2;
      f15000[2] = 2;
      f15000[3] = 2;
      f15000[4] = 2;
      f15000[5] = 2;
      f15000[6] = 2;
      f15000[7] = 3;
      byte[] var130 = new byte[5];
      f67000[(0 | -0) >>> 31] = 2;
      f67000[(1 | -1) >>> 31] = 4;
      f67000[2] = 2;
      f67000[3] = 3;
      f67000[4] = 4;
      byte[] var131 = new byte[8];
      f66000[(0 | -0) >>> 31] = 5;
      f66000[(1 | -1) >>> 31] = 6;
      f66000[2] = 2;
      f66000[3] = 3;
      f66000[4] = 4;
      f66000[5] = 5;
      f66000[6] = 6;
      f66000[7] = 3;
      byte[] var132 = new byte[7];
      f28000[(0 | -0) >>> 31] = 7;
      f28000[(1 | -1) >>> 31] = 22;
      f28000[2] = 5;
      f28000[3] = 2;
      f28000[4] = 16;
      f28000[5] = 3;
      f28000[6] = 2;
      byte[] var133 = new byte[5];
      f31000[(0 | -0) >>> 31] = 3;
      f31000[(1 | -1) >>> 31] = 4;
      f31000[2] = 2;
      f31000[3] = 2;
      f31000[4] = 5;
      byte[] var134 = new byte[2];
      f17000[(0 | -0) >>> 31] = 6;
      f17000[(1 | -1) >>> 31] = 7;
      byte[] var135 = new byte[5];
      f73000[(0 | -0) >>> 31] = 2;
      f73000[(1 | -1) >>> 31] = 3;
      f73000[2] = 4;
      f73000[3] = 3;
      f73000[4] = 2;
      byte[] var136 = new byte[2];
      f79000[(0 | -0) >>> 31] = 2;
      f79000[(1 | -1) >>> 31] = 12;
      byte[] var137 = new byte[5];
      f12000[(0 | -0) >>> 31] = 3;
      f12000[(1 | -1) >>> 31] = 2;
      f12000[2] = 18;
      f12000[3] = 3;
      f12000[4] = 2;
      byte[] var138 = new byte[2];
      f36000[(0 | -0) >>> 31] = 2;
      f36000[(1 | -1) >>> 31] = 18;
      byte[] var139 = new byte[8];
      f1000[(0 | -0) >>> 31] = 3;
      f1000[(1 | -1) >>> 31] = 3;
      f1000[2] = 4;
      f1000[3] = 5;
      f1000[4] = 6;
      f1000[5] = 20;
      f1000[6] = 3;
      f1000[7] = 7;
      byte[] var140 = new byte[3];
      f52000[(0 | -0) >>> 31] = 2;
      f52000[(1 | -1) >>> 31] = 14;
      f52000[2] = 3;
      byte[] var141 = new byte[4];
      f23000[(0 | -0) >>> 31] = 2;
      f23000[(1 | -1) >>> 31] = 4;
      f23000[2] = 8;
      f23000[3] = 3;
      byte[] var142 = new byte[3];
      f20000[(0 | -0) >>> 31] = 4;
      f20000[(1 | -1) >>> 31] = 9;
      f20000[2] = 5;
      byte[] var143 = new byte[7];
      f83000[(0 | -0) >>> 31] = 6;
      f83000[(1 | -1) >>> 31] = 7;
      f83000[2] = 44;
      f83000[3] = 5;
      f83000[4] = 20;
      f83000[5] = 64;
      f83000[6] = 2;
      byte[] var144 = new byte[3];
      f71000[(0 | -0) >>> 31] = 3;
      f71000[(1 | -1) >>> 31] = 4;
      f71000[2] = 7;
      byte[] var145 = new byte[8];
      f39000[(0 | -0) >>> 31] = 2;
      f39000[(1 | -1) >>> 31] = 3;
      f39000[2] = 20;
      f39000[3] = 8;
      f39000[4] = 3;
      f39000[5] = 2;
      f39000[6] = 20;
      f39000[7] = 8;
      byte[] var146 = new byte[6];
      f21000[(0 | -0) >>> 31] = 12;
      f21000[(1 | -1) >>> 31] = 7;
      f21000[2] = 5;
      f21000[3] = 3;
      f21000[4] = 6;
      f21000[5] = 8;
   }

   private C0150() {
   }

   static {
      ntfClinit();
   }

   private static void m36000() {
      f64000 = new Object[f23000[(0 | -0) >>> 31]];
      f34000 = new Object[f23000[(1 | -1) >>> 31]];
      f45000 = new Object[f23000[2]];
      f45000[f75000[6]] = f22000[(0 | -0) >>> 31];
      f45000[f22000[1]] = f87000[5];
      f45000[f23000[3]] = f84000[3];
      f45000[f20000[0]] = Integer.valueOf(f20000[(1 | -1) >>> 31]);
      f45000[f20000[2]] = Integer.valueOf(f22000[2]);
      f45000[f83000[0]] = Integer.valueOf(f22000[3]);
      f45000[f83000[1]] = Integer.valueOf(f83000[2]);
      f57000 = new Object[f83000[3]];
      f57000[f22000[4]] = Integer.valueOf(f83000[4]);
      f57000[f7000[0]] = Integer.valueOf(f83000[5]);
      f57000[f83000[6]] = Integer.valueOf(f53000[4]);
      f57000[f71000[0]] = Integer.valueOf(f53000[5]);
      f57000[f71000[1]] = f87000[6];
      f88000 = new Object[f71000[2]];
      f88000[f7000[1]] = f8000[(0 | -0) >>> 31];
      f88000[f7000[2]] = f8000[(1 | -1) >>> 31];
      f88000[f39000[0]] = Integer.valueOf(f53000[6]);
      f88000[f39000[1]] = Integer.valueOf(f39000[2]);
      f33000 = new Object[f39000[3]];
      f2000 = new Object[f39000[4]];
      f2000[f39000[5]] = Integer.valueOf(f39000[6]);
      f40000 = new Object[f39000[7]];
      f40000[f7000[3]] = Integer.valueOf(f21000[(0 | -0) >>> 31]);
      f40000[f7000[4]] = Integer.valueOf(f7000[5]);
      f74000 = new Object[f21000[(1 | -1) >>> 31]];
      f74000[f21000[2]] = Integer.valueOf(f21000[3]);
      f74000[f21000[4]] = f8000[2];
      f30000 = new Object[f21000[5]];
      f82000 = new Object[f7000[6]];
   }

   private static void m42000() {
      float[] var128 = new float[6];
      f76000[(0 | -0) >>> 31] = Float.intBitsToFloat(-1031798784);
      f76000[(1 | -1) >>> 31] = Float.intBitsToFloat(0);
      f76000[2] = Float.intBitsToFloat(0);
      f76000[3] = Float.intBitsToFloat(0);
      f76000[4] = Float.intBitsToFloat(0);
      f76000[5] = Float.intBitsToFloat(1056964608);
      float[] var129 = new float[4];
      f42000[(0 | -0) >>> 31] = Float.intBitsToFloat(0);
      f42000[(1 | -1) >>> 31] = Float.intBitsToFloat(0);
      f42000[2] = Float.intBitsToFloat(0);
      f42000[3] = Float.intBitsToFloat(1132462080);
      float[] var130 = new float[2];
      f44000[(0 | -0) >>> 31] = Float.intBitsToFloat(0);
      f44000[(1 | -1) >>> 31] = Float.intBitsToFloat(0);
      float[] var131 = new float[8];
      f86000[(0 | -0) >>> 31] = Float.intBitsToFloat(1121714176);
      f86000[(1 | -1) >>> 31] = Float.intBitsToFloat(1073741824);
      f86000[2] = Float.intBitsToFloat(0);
      f86000[3] = Float.intBitsToFloat(1065353216);
      f86000[4] = Float.intBitsToFloat(0);
      f86000[5] = Float.intBitsToFloat(0);
      f86000[6] = Float.intBitsToFloat(0);
      f86000[7] = Float.intBitsToFloat(0);
      float[] var132 = new float[7];
      f6000[(0 | -0) >>> 31] = Float.intBitsToFloat(0);
      f6000[(1 | -1) >>> 31] = Float.intBitsToFloat(-1073741824);
      f6000[2] = Float.intBitsToFloat(1065353216);
      f6000[3] = Float.intBitsToFloat(0);
      f6000[4] = Float.intBitsToFloat(0);
      f6000[5] = Float.intBitsToFloat(0);
      f6000[6] = Float.intBitsToFloat(0);
      float[] var133 = new float[8];
      f51000[(0 | -0) >>> 31] = Float.intBitsToFloat(0);
      f51000[(1 | -1) >>> 31] = Float.intBitsToFloat(0);
      f51000[2] = Float.intBitsToFloat(0);
      f51000[3] = Float.intBitsToFloat(0);
      f51000[4] = Float.intBitsToFloat(0);
      f51000[5] = Float.intBitsToFloat(0);
      f51000[6] = Float.intBitsToFloat(0);
      f51000[7] = Float.intBitsToFloat(0);
      float[] var134 = new float[4];
      f29000[(0 | -0) >>> 31] = Float.intBitsToFloat(0);
      f29000[(1 | -1) >>> 31] = Float.intBitsToFloat(0);
      f29000[2] = Float.intBitsToFloat(-1007681536);
      f29000[3] = Float.intBitsToFloat(1120403456);
      float[] var135 = new float[8];
      f11000[(0 | -0) >>> 31] = Float.intBitsToFloat(1101004800);
      f11000[(1 | -1) >>> 31] = Float.intBitsToFloat(1065353216);
      f11000[2] = Float.intBitsToFloat(1110441984);
      f11000[3] = Float.intBitsToFloat(1110441984);
      f11000[4] = Float.intBitsToFloat(1065353216);
      f11000[5] = Float.intBitsToFloat(1090519040);
      f11000[6] = Float.intBitsToFloat(1110441984);
      f11000[7] = Float.intBitsToFloat(1110441984);
      float[] var136 = new float[2];
      f72000[(0 | -0) >>> 31] = Float.intBitsToFloat(1065353216);
      f72000[(1 | -1) >>> 31] = Float.intBitsToFloat(1090519040);
      float[] var137 = new float[7];
      f32000[(0 | -0) >>> 31] = Float.intBitsToFloat(1101004800);
      f32000[(1 | -1) >>> 31] = Float.intBitsToFloat(1101004800);
      f32000[2] = Float.intBitsToFloat(1110441984);
      f32000[3] = Float.intBitsToFloat(1110441984);
      f32000[4] = Float.intBitsToFloat(1065353216);
      f32000[5] = Float.intBitsToFloat(1090519040);
      f32000[6] = Float.intBitsToFloat(1101004800);
      float[] var138 = new float[5];
      f54000[(0 | -0) >>> 31] = Float.intBitsToFloat(1101004800);
      f54000[(1 | -1) >>> 31] = Float.intBitsToFloat(1101004800);
      f54000[2] = Float.intBitsToFloat(1101004800);
      f54000[3] = Float.intBitsToFloat(0);
      f54000[4] = Float.intBitsToFloat(0);
      float[] var139 = new float[3];
      f4000[(0 | -0) >>> 31] = Float.intBitsToFloat(1101004800);
      f4000[(1 | -1) >>> 31] = Float.intBitsToFloat(1101004800);
      f4000[2] = Float.intBitsToFloat(1120403456);
      float[] var140 = new float[4];
      f9000[(0 | -0) >>> 31] = Float.intBitsToFloat(1094713344);
      f9000[(1 | -1) >>> 31] = Float.intBitsToFloat(1065353216);
      f9000[2] = Float.intBitsToFloat(1065353216);
      f9000[3] = Float.intBitsToFloat(1120403456);
      float[] var141 = new float[7];
      f41000[(0 | -0) >>> 31] = Float.intBitsToFloat(1094713344);
      f41000[(1 | -1) >>> 31] = Float.intBitsToFloat(1094713344);
      f41000[2] = Float.intBitsToFloat(1094713344);
      f41000[3] = Float.intBitsToFloat(0);
      f41000[4] = Float.intBitsToFloat(0);
      f41000[5] = Float.intBitsToFloat(1094713344);
      f41000[6] = Float.intBitsToFloat(1101004800);
      float[] var142 = new float[7];
      f59000[(0 | -0) >>> 31] = Float.intBitsToFloat(1101004800);
      f59000[(1 | -1) >>> 31] = Float.intBitsToFloat(1101004800);
      f59000[2] = Float.intBitsToFloat(1101004800);
      f59000[3] = Float.intBitsToFloat(0);
      f59000[4] = Float.intBitsToFloat(1120403456);
      f59000[5] = Float.intBitsToFloat(1091567616);
      f59000[6] = Float.intBitsToFloat(1090519040);
      float[] var143 = new float[8];
      f19000[(0 | -0) >>> 31] = Float.intBitsToFloat(1090519040);
      f19000[(1 | -1) >>> 31] = Float.intBitsToFloat(1090519040);
      f19000[2] = Float.intBitsToFloat(1108869120);
      f19000[3] = Float.intBitsToFloat(1107296256);
      f19000[4] = Float.intBitsToFloat(1107296256);
      f19000[5] = Float.intBitsToFloat(1107296256);
      f19000[6] = Float.intBitsToFloat(1120403456);
      f19000[7] = Float.intBitsToFloat(1120403456);
      float[] var144 = new float[3];
      f35000[(0 | -0) >>> 31] = Float.intBitsToFloat(1082130432);
      f35000[(1 | -1) >>> 31] = Float.intBitsToFloat(0);
      f35000[2] = Float.intBitsToFloat(1109393408);
      float[] var145 = new float[7];
      f87000[(0 | -0) >>> 31] = Float.intBitsToFloat(1077936128);
      f87000[(1 | -1) >>> 31] = Float.intBitsToFloat(1090519040);
      f87000[2] = Float.intBitsToFloat(1120403456);
      f87000[3] = Float.intBitsToFloat(1115947008);
      f87000[4] = Float.intBitsToFloat(1090519040);
      f87000[5] = Float.intBitsToFloat(0);
      f87000[6] = Float.intBitsToFloat(1132462080);
      float[] var146 = new float[3];
      f8000[(0 | -0) >>> 31] = Float.intBitsToFloat(1121714176);
      f8000[(1 | -1) >>> 31] = Float.intBitsToFloat(1073741824);
      f8000[2] = Float.intBitsToFloat(1109393408);
   }

   private static void m50000() {
      short[] var128 = new short[2];
      f70000[(0 | -0) >>> 31] = 6;
      f70000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      short[] var129 = new short[7];
      f3000[(0 | -0) >>> 31] = 6;
      f3000[(1 | -1) >>> 31] = 2;
      f3000[2] = (short)((0 | -0) >>> 31);
      f3000[3] = 2;
      f3000[4] = (short)((1 | -1) >>> 31);
      f3000[5] = (short)((1 | -1) >>> 31);
      f3000[6] = (short)((1 | -1) >>> 31);
      short[] var130 = new short[5];
      f85000[(0 | -0) >>> 31] = (short)((1 | -1) >>> 31);
      f85000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      f85000[2] = 4;
      f85000[3] = 4;
      f85000[4] = 2;
      short[] var131 = new short[2];
      f18000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f18000[(1 | -1) >>> 31] = 5;
      short[] var132 = new short[4];
      f10000[(0 | -0) >>> 31] = 2;
      f10000[(1 | -1) >>> 31] = 6;
      f10000[2] = 7;
      f10000[3] = 5;
      short[] var133 = new short[2];
      f49000[(0 | -0) >>> 31] = 2;
      f49000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      short[] var134 = new short[6];
      f55000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f55000[(1 | -1) >>> 31] = 3;
      f55000[2] = 2;
      f55000[3] = -29813;
      f55000[4] = 3;
      f55000[5] = 4;
      short[] var135 = new short[7];
      f25000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f25000[(1 | -1) >>> 31] = 2;
      f25000[2] = 3;
      f25000[3] = 6;
      f25000[4] = 4;
      f25000[5] = (short)((1 | -1) >>> 31);
      f25000[6] = (short)((0 | -0) >>> 31);
      short[] var136 = new short[6];
      f62000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f62000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f62000[2] = 3;
      f62000[3] = 4;
      f62000[4] = (short)((1 | -1) >>> 31);
      f62000[5] = 5;
      short[] var137 = new short[7];
      f69000[(0 | -0) >>> 31] = 3;
      f69000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      f69000[2] = 5;
      f69000[3] = 7;
      f69000[4] = 2;
      f69000[5] = 6;
      f69000[6] = 7;
      short[] var138 = new short[2];
      f80000[(0 | -0) >>> 31] = 4;
      f80000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      short[] var139 = new short[7];
      f78000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f78000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f78000[2] = 3;
      f78000[3] = 4;
      f78000[4] = (short)((0 | -0) >>> 31);
      f78000[5] = (short)((1 | -1) >>> 31);
      f78000[6] = 2;
      short[] var140 = new short[6];
      f16000[(0 | -0) >>> 31] = 3;
      f16000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      f16000[2] = 2;
      f16000[3] = 3;
      f16000[4] = (short)((1 | -1) >>> 31);
      f16000[5] = 6;
      short[] var141 = new short[7];
      f53000[(0 | -0) >>> 31] = (short)((1 | -1) >>> 31);
      f53000[(1 | -1) >>> 31] = -29813;
      f53000[2] = -29813;
      f53000[3] = -10496;
      f53000[4] = -29813;
      f53000[5] = 480;
      f53000[6] = -10496;
   }

   private static void m70000(Noqodls var0) {
      if (!m82000(var0)) {
         NNuU var1 = NNuU.Nq();
         boolean var2 = var1 == null || (NNNZg)var1.T[f55000[4]] == null && (NNNwS)var1.T[f55000[5]] == null && var1.NE() == null ? f77000[0] : f5000[7];
         if (var2) {
            C0750.m32000(var0);
         } else {
            C0750.m22000();
            IltqImqmt var3 = NursultanClient.m10000().m62000(IltqImqmt.class);
            var3.m6000(var0.m38000());
            ConfigFiles.m54000(IltqImqmt.class);
            MSAuth.m28000(var0);
         }
      }
   }

   private static void m76000() {
      boolean[] var128 = new boolean[6];
      f60000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f60000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f60000[2] = (boolean)((0 | -0) >>> 31);
      f60000[3] = (boolean)((1 | -1) >>> 31);
      f60000[4] = (boolean)((1 | -1) >>> 31);
      f60000[5] = (boolean)((0 | -0) >>> 31);
      boolean[] var129 = new boolean[5];
      f26000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f26000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f26000[2] = (boolean)((1 | -1) >>> 31);
      f26000[3] = (boolean)((0 | -0) >>> 31);
      f26000[4] = (boolean)((0 | -0) >>> 31);
      boolean[] var130 = new boolean[7];
      f27000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f27000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f27000[2] = (boolean)((1 | -1) >>> 31);
      f27000[3] = (boolean)((0 | -0) >>> 31);
      f27000[4] = (boolean)((1 | -1) >>> 31);
      f27000[5] = (boolean)((0 | -0) >>> 31);
      f27000[6] = (boolean)((1 | -1) >>> 31);
      boolean[] var131 = new boolean[4];
      f56000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f56000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f56000[2] = (boolean)((0 | -0) >>> 31);
      f56000[3] = (boolean)((1 | -1) >>> 31);
      boolean[] var132 = new boolean[8];
      f5000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f5000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f5000[2] = (boolean)((0 | -0) >>> 31);
      f5000[3] = (boolean)((1 | -1) >>> 31);
      f5000[4] = (boolean)((0 | -0) >>> 31);
      f5000[5] = (boolean)((1 | -1) >>> 31);
      f5000[6] = (boolean)((0 | -0) >>> 31);
      f5000[7] = (boolean)((1 | -1) >>> 31);
      boolean[] var133 = new boolean[7];
      f77000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f77000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f77000[2] = (boolean)((0 | -0) >>> 31);
      f77000[3] = (boolean)((0 | -0) >>> 31);
      f77000[4] = (boolean)((1 | -1) >>> 31);
      f77000[5] = (boolean)((0 | -0) >>> 31);
      f77000[6] = (boolean)((0 | -0) >>> 31);
      boolean[] var134 = new boolean[4];
      f46000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f46000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f46000[2] = (boolean)((0 | -0) >>> 31);
      f46000[3] = (boolean)((0 | -0) >>> 31);
      boolean[] var135 = new boolean[5];
      f48000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f48000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f48000[2] = (boolean)((0 | -0) >>> 31);
      f48000[3] = (boolean)((0 | -0) >>> 31);
      f48000[4] = (boolean)((0 | -0) >>> 31);
      boolean[] var136 = new boolean[5];
      f68000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f68000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f68000[2] = (boolean)((0 | -0) >>> 31);
      f68000[3] = (boolean)((0 | -0) >>> 31);
      f68000[4] = (boolean)((0 | -0) >>> 31);
      boolean[] var137 = new boolean[4];
      f65000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f65000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f65000[2] = (boolean)((1 | -1) >>> 31);
      f65000[3] = (boolean)((0 | -0) >>> 31);
      boolean[] var138 = new boolean[7];
      f24000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f24000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f24000[2] = (boolean)((0 | -0) >>> 31);
      f24000[3] = (boolean)((0 | -0) >>> 31);
      f24000[4] = (boolean)((1 | -1) >>> 31);
      f24000[5] = (boolean)((1 | -1) >>> 31);
      f24000[6] = (boolean)((0 | -0) >>> 31);
      boolean[] var139 = new boolean[3];
      f14000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f14000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f14000[2] = (boolean)((1 | -1) >>> 31);
      boolean[] var140 = new boolean[3];
      f61000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f61000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f61000[2] = (boolean)((1 | -1) >>> 31);
      boolean[] var141 = new boolean[3];
      f63000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f63000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f63000[2] = (boolean)((1 | -1) >>> 31);
      boolean[] var142 = new boolean[3];
      f89000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f89000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f89000[2] = (boolean)((1 | -1) >>> 31);
      boolean[] var143 = new boolean[7];
      f43000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f43000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f43000[2] = (boolean)((1 | -1) >>> 31);
      f43000[3] = (boolean)((0 | -0) >>> 31);
      f43000[4] = (boolean)((0 | -0) >>> 31);
      f43000[5] = (boolean)((0 | -0) >>> 31);
      f43000[6] = (boolean)((0 | -0) >>> 31);
      boolean[] var144 = new boolean[4];
      f50000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f50000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f50000[2] = (boolean)((0 | -0) >>> 31);
      f50000[3] = (boolean)((1 | -1) >>> 31);
      boolean[] var145 = new boolean[7];
      f75000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f75000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f75000[2] = (boolean)((1 | -1) >>> 31);
      f75000[3] = (boolean)((0 | -0) >>> 31);
      f75000[4] = (boolean)((1 | -1) >>> 31);
      f75000[5] = (boolean)((0 | -0) >>> 31);
      f75000[6] = (boolean)((0 | -0) >>> 31);
      boolean[] var146 = new boolean[5];
      f22000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f22000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f22000[2] = (boolean)((1 | -1) >>> 31);
      f22000[3] = (boolean)((0 | -0) >>> 31);
      f22000[4] = (boolean)((0 | -0) >>> 31);
      boolean[] var147 = new boolean[7];
      f7000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f7000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f7000[2] = (boolean)((1 | -1) >>> 31);
      f7000[3] = (boolean)((0 | -0) >>> 31);
      f7000[4] = (boolean)((1 | -1) >>> 31);
      f7000[5] = (boolean)((0 | -0) >>> 31);
      f7000[6] = (boolean)((1 | -1) >>> 31);
   }

   private static boolean m82000(Noqodls var0) {
      NNuU var1 = NNuU.Nq();
      return var1 != null && var0.m20000().equals(var1.Ny().L()) ? f5000[1] : f5000[2];
   }

   private static String m92000(long var0) {
      return LocalDateTime.ofInstant(Instant.ofEpochMilli(var0), ZoneId.systemDefault()).format((DateTimeFormatter)f45000[f25000[1]]);
   }

   private static C0031 m110000(Noqodls var0) {
      C0056[] var10000 = new C0056[f15000[2]];
      var10000[f27000[5]] = (C0056)f40000[f85000[3]];
      var10000[f27000[6]] = C0056.m130000().m132000((C0368)f40000[f85000[4]], var0x -> var0x.m40000((Integer)f40000[f69000[1]]));
      C0056 var1 = C0056.m120000(var10000);
      return C0287.m26000(var1, var1x -> {
         var1x.N("accountCopy:" + var0.m38000());
         var1x.N(Enum0026.f2000, Base0315::m6000);
         var1x.N(var1xx -> {
            ((NNuN)NNuU.Nq().L[f69000[0]]).N(var0.m20000());
            var1xx.m6000();
         });
         var1x.L(var0xx -> var0xx.m2000(f58000[5]).N((C0056)f40000[f62000[5]]));
      });
   }

   private static void m112000() {
      int[] var128 = new int[8];
      f81000[(0 | -0) >>> 31] = -7171438;
      f81000[(1 | -1) >>> 31] = -7171438;
      f81000[2] = -7171438;
      f81000[3] = -7171438;
      f81000[4] = -7171438;
      f81000[5] = -7171438;
      f81000[6] = -7171438;
      f81000[7] = -7171438;
      int[] var129 = new int[(1 | -1) >>> 31];
      f38000[(0 | -0) >>> 31] = -7171438;
   }

   private C0031 m118000(Noqodls var1, Iface0202 var2) {
      boolean var3 = var1.m24000();
      C0056[] var10000 = new C0056[f15000[3]];
      var10000[f56000[0]] = (C0056)f33000[f18000[1]];
      var10000[f56000[1]] = C0056.m130000().m50000(var3 ? f86000[3] : f86000[4]);
      C0056 var4 = C0056.m120000(var10000);
      return C0287.m26000((C0056)f33000[f10000[0]], var2x -> {
         var2x.N("accountFavorite:" + var1.m38000());
         var2x.N(Enum0026.f2000, Base0315::m6000);
         var2x.N(var1xx -> {
            NursultanClient.m48000().m18000(var1.m38000());
            var1xx.m6000();
         });
         var2x.N((C0056)f33000[f62000[2]], var1xx -> {
            var1xx.L(var0xx -> var0xx.m2000(f58000[3]).N((C0056)f33000[f62000[3]]));
            var1xx.L(var1xxx -> var1xxx.m2000(f58000[2]).N(var4));
         });
      });
   }

   private C0031 m122000(Rec0248 var1, Iface0202 var2) {
      Noqodls var3 = var1.m4000();
      OlIrtqjti var4 = var2.m28000((C0297<OlIrtqjti>)OlIrtqjti.f4000[f70000[0]]);
      int var5 = m82000(var3) ? var4.m6000() : f81000[0];
      C0056[] var10000 = new C0056[f47000[0]];
      var10000[f60000[0]] = (C0056)f2000[f70000[1]];
      var10000[f60000[1]] = C0056.m130000().m40000(var5);
      C0056 var6 = C0056.m120000(var10000);
      Rec0222 var7 = var2.m2000("accountStatus:" + var3.m38000(), () -> C1107.m20000(var3.m38000()));
      Iface0196 var8 = var2.m20000("accountClick:" + var3.m38000(), f84000[0]);
      Iface0196 var9 = var2.m6000(f13000[0], (UUID)null);
      boolean var10 = var3.m38000().equals(var9.m2000());
      boolean var11 = var2.m2000("accountLoginPending:" + var3.m38000(), () -> C0750.m18000(var3.m38000()));
      boolean var12 = m146000(var3.m38000());
      Iface0196 var13 = var2.m20000("accountEntering:" + var3.m38000(), f60000[2]);
      if (var12) {
         var13.m6000(f60000[3]);
      }

      boolean var14 = !var12 && !var13.m2000() && !var10 ? f60000[5] : f60000[4];
      var10000 = new C0056[f47000[1]];
      var10000[f26000[0]] = (C0056)f33000[f3000[0]];
      byte var10002 = f26000[1];
      C0056 var10003 = C0056.m130000().m132000((C0368)f40000[f3000[1]], var0 -> var0.m50000(f6000[2])).m198000(var10 ? f76000[0] : f76000[1]).m2000(var10);
      Rec0057[] var10004 = new Rec0057[f26000[2]];
      var10004[f26000[3]] = Rec0057.m14000((Rec0076)C1073.f1000[f3000[2]]);
      var10000[var10002] = var10003.m186000(C0258.m10000(var10004));
      C0056 var15 = C0056.m120000(var10000);
      C0290 var16 = ((Map)f34000[f3000[3]]).computeIfAbsent(var3.m38000(), var0 -> new C0290());
      Iface0196 var17 = var2.m20000("accountHeight:" + var3.m38000(), f76000[2]);
      float var18 = var16.m2000() != null ? ((Iface0212)var16.m2000()).m18000().m10000() : f76000[3];
      if (var18 > f76000[4] && Math.abs(var18 - (Float)var17.m2000()) > f76000[5]) {
         var17.m6000(var18);
      }

      float var19 = (Float)var17.m2000();
      if (var19 > f42000[0]) {
         Float var28 = var19;
         f45000[f3000[4]] = var28;
      }

      float var20 = var19 > f42000[1] ? var19 : (f45000[f3000[5]] > f42000[2] ? (Float)f45000[f3000[6]] : f42000[3]);
      float var21 = var19 > f44000[0] ? var19 : (f45000[f85000[0]] > f44000[1] ? (Float)f45000[f85000[1]] : f86000[0]);
      float var22 = var20 + f86000[1];
      var10000 = new C0056[f15000[0]];
      var10000[f26000[4]] = (C0056)f88000[f85000[2]];
      var10000[f27000[0]] = C0056.m130000().m90000(Rec0125.m32000(f86000[2], var22)).m168000(var14 ? f27000[1] : f27000[2]);
      C0056 var23 = C0056.m120000(var10000);
      if (var12) {
         var10000 = new C0056[f15000[1]];
         var10000[f27000[3]] = var23;
         var10000[f27000[4]] = C0056.m130000()
            .m110000(var1x -> var1x.m90000(Rec0125.m32000(f86000[5], f86000[6])).m18000(f86000[7]).m50000(f6000[0]).m56000(f6000[1] * var21));
         var23 = C0056.m120000(var10000);
      }

      return C0287.m26000(
         var23,
         var12x -> {
            var12x.N("accountWrapper:" + var3.m38000());
            var12x.N(
               Enum0026.f15000,
               var1xx -> {
                  if (var1xx instanceof SelectItemModel$UnbakedSwitch var2xx
                     && OOnjmjp<"uhvddb",1299910674,-533271325,-533271369,-533271326,-1871667584>(var2xx) == Enum0019.f14000) {
                     var13.m6000(f77000[1]);
                  }
               }
            );
            if (var10) {
               var12x.N((C0056)f88000[f69000[2]], var2xx -> {
                  var2xx.N("accountDeleteLayer:" + var3.m38000());
                  var2xx.N(Enum0026.f2000, Base0315::m6000);
                  var2xx.N(var1xxx -> {
                     var9.m6000(null);
                     var1xxx.m6000();
                  });
                  var2xx.N((C0056)f88000[f16000[5]], var2xxx -> {
                     var2xxx.N("accountDeleteConfirm:" + var3.m38000());
                     var2xxx.N(Enum0026.f2000, Base0315::m6000);
                     var2xxx.N(var2xxxx -> {
                        var9.m6000(null);
                        m24000(var3);
                        var2xxxx.m6000();
                     });
                     var2xxx.L(var0xxx -> var0xxx.m2000(f37000[1]).N((C0056)f33000[f53000[0]]));
                  });
               });
            }

            var12x.N(
               var15,
               var9xx -> {
                  var9xx.N("accountCard:" + var3.m38000());
                  var9xx.N(var16);
                  var9xx.N(Enum0026.f2000, Base0315::m6000);
                  var9xx.N(Enum0026.f4000, var3xxx -> {
                     if (var9.m2000() != null) {
                        var9.m6000(null);
                        var3xxx.m6000();
                     } else {
                        long var4xxx = System.currentTimeMillis();
                        if (var4xxx - (Long)var8.m2000() <= f84000[1]) {
                           var8.m6000(f84000[2]);
                           m70000(var3);
                        } else {
                           var8.m6000(var4xxx);
                        }

                        var3xxx.m6000();
                     }
                  });
                  var9xx.N((C0056)f33000[f69000[3]], var2xxx -> {
                     var2xxx.N((C0056)f40000[f16000[3]], var2xxxx -> {
                        var2xxxx.N(m142000(var3), var6);
                        var2xxxx.y(m110000(var3));
                     });
                     var2xxx.N(C1235.m36000(var3.m2000().m34000()), (C0056)f2000[f16000[4]]);
                  });
                  var9xx.y((C0056)rw.core.C0076.f5000[f69000[4]]);
                  var9xx.N(
                     (C0056)f40000[f69000[5]],
                     var6xxx -> {
                        var6xxx.N(
                           (C0056)f40000[f69000[6]],
                           var3xxxx -> {
                              var3xxxx.N(
                                 (C0056)f74000[f78000[1]],
                                 var1xxxxx -> var1xxxxx.N(
                                    (C0056)f74000[f16000[1]],
                                    var1xxxxxx -> var1xxxxxx.y(
                                       ((C0299)((C0299)C0287.m36000().N("accountHead:" + var3.m38000())).N((C0056)f74000[f16000[2]]))
                                          .m4000(
                                             var1xxxxxxx -> C1131.m36000(
                                                var3.m34000(),
                                                var3.m20000(),
                                                var1xxxxxxx.m14000(),
                                                var1xxxxxxx.m12000(),
                                                var1xxxxxxx.m2000(),
                                                var1xxxxxxx.m10000()
                                             )
                                          )
                                          .m2000()
                                    )
                                 )
                              );
                              var3xxxx.N((C0056)f74000[f78000[2]], var3xxxxx -> {
                                 var3xxxxx.N((C0056)f74000[f78000[3]], var1xxxxxx -> {
                                    var1xxxxxx.N(C1235.m36000(f37000[0]), (C0056)f30000[f78000[6]]);
                                    var1xxxxxx.N(m92000(var3.m6000()), (C0056)f30000[f16000[0]]);
                                 });
                                 String var4xxxx = m180000(var11, var7);
                                 if (var4xxxx != null) {
                                    var3xxxxx.N((C0056)f30000[f78000[4]], var2xxxxxx -> {
                                       var2xxxxxx.N("accountPending:" + var3.m38000());
                                       var2xxxxxx.N(var4xxxx, (C0056)f30000[f78000[5]]);
                                    });
                                 }
                              });
                           }
                        );
                        var6xxx.N((C0056)f30000[f80000[0]], var4xxxx -> {
                           var4xxxx.y(var2.m18000(f58000[6], (Iface0197<Noqodls>)f34000[f80000[1]], var3));
                           var4xxxx.y(m128000(var3, var9));
                           var4xxxx.y(var2.m18000(f58000[7], (Iface0197<Rec0259>)VpFa.f1000[f78000[0]], m136000(var3, var4)));
                        });
                     }
                  );
               }
            );
         }
      );
   }

   private static C0031 m128000(Noqodls var0, Iface0196<UUID> var1) {
      return C0287.m26000((C0056)f33000[f18000[0]], var2 -> {
         var2.N("accountDeleteRequest:" + var0.m38000());
         var2.N(Enum0026.f2000, Base0315::m6000);
         var2.N(var2x -> {
            var1.m6000(var0.m38000());
            var2x.m6000();
         });
         var2.L(var0xx -> var0xx.m2000(f58000[4]).N((C0056)f33000[f62000[4]]));
      });
   }

   private C0031 m132000(Noqodls var1, Iface0202 var2) {
      OlIrtqjti var3 = var2.m28000((C0297<OlIrtqjti>)OlIrtqjti.f4000[f10000[1]]);
      int var4 = m82000(var1) ? var3.m6000() : f81000[1];
      C0056[] var10000 = new C0056[f15000[4]];
      var10000[f56000[2]] = (C0056)f30000[f10000[2]];
      var10000[f56000[3]] = C0056.m130000().m40000(var4);
      C0056 var5 = C0056.m120000(var10000);
      String var6 = C1235.m36000(var1.m2000().m34000());
      return C0287.m26000((C0056)f30000[f10000[3]], var5x -> {
         var5x.N("accountSearch:" + var1.m38000());
         var5x.N(Enum0026.f2000, Base0315::m6000);
         var5x.N((C0056)f30000[f25000[3]], var3xx -> {
            var3xx.N(m142000(var1), var5);
            var3xx.N(var6, (C0056)f82000[f62000[1]]);
         });
         var5x.N((C0056)f30000[f25000[4]], var3xx -> {
            var3xx.y(var2.m18000(f13000[6], (Iface0197<Noqodls>)f34000[f25000[5]], var1));
            var3xx.y(var2.m18000(f58000[0], (Iface0197<Rec0259>)VpFa.f1000[f25000[6]], m194000(var1)));
            var3xx.y(var2.m18000(f58000[1], (Iface0197<Rec0259>)VpFa.f1000[f62000[0]], m136000(var1, var3)));
         });
      });
   }

   public static void m134000(Set<UUID> var0) {
      ((Map)f34000[f49000[0]]).keySet().retainAll(var0);
   }

   private static Rec0259 m136000(Noqodls var0, OlIrtqjti var1) {
      boolean var2 = m82000(var0);
      return new Rec0259(f13000[1], var2 ? f81000[2] : var1.m6000(), C1235.m36000(f13000[2]), () -> m70000(var0), var2);
   }

   private static String m142000(Noqodls var0) {
      boolean var1 = var0.m2000() == (Enum0002)Enum0002.f3000[f55000[2]] && m82000(var0) && !m14000() ? f5000[3] : f5000[4];
      return var1 ? "* " + var0.m20000() : var0.m20000();
   }

   private static boolean m146000(UUID var0) {
      if (!(Boolean)f45000[f49000[1]]) {
         Boolean var5 = f5000[0];
         f45000[f55000[0]] = var5;
         NursultanClient.m48000().m16000().forEach(var0x -> ((Set)f34000[f25000[2]]).add(var0x.m38000()));
      }

      return ((Set)f34000[f55000[1]]).add(var0);
   }

   private static void m170000() {
      f13000 = new String[7];
      f13000[(0 | -0) >>> 31] = "nursultan:accountDeleting";
      f13000[(1 | -1) >>> 31] = "icon:menu/run";
      f13000[2] = "account.login";
      f13000[3] = "icon:menu/delete";
      f13000[4] = "account.item.pending";
      f13000[5] = ". ";
      f13000[6] = "favorite";
      f58000 = new String[8];
      f58000[(0 | -0) >>> 31] = "delete";
      f58000[(1 | -1) >>> 31] = "login";
      f58000[2] = "icon:menu/star-filled";
      f58000[3] = "icon:menu/star";
      f58000[4] = "icon:menu/delete";
      f58000[5] = "icon:menu/copy";
      f58000[6] = "favorite";
      f58000[7] = "login";
      f37000 = new String[4];
      f37000[(0 | -0) >>> 31] = "account.item.created";
      f37000[(1 | -1) >>> 31] = "icon:menu/delete";
      f37000[2] = "HH:mm dd.MM.yy";
      f37000[3] = "account.copy.icon";
   }

   private static String m180000(boolean var0, Rec0222 var1) {
      ArrayList var2 = new ArrayList(f15000[5]);
      if (var0) {
         var2.add(C1235.m36000(f13000[4]));
      }

      if (var1.m6000() != (Enum0004)Enum0004.f5000[f25000[0]]) {
         var2.add(C1235.m36000(var1.m4000()));
      }

      return var2.isEmpty() ? null : String.join(f13000[5], var2);
   }

   private static void m192000() {
      long[] var128 = new long[4];
      f84000[(0 | -0) >>> 31] = 0L;
      f84000[(1 | -1) >>> 31] = 300L;
      f84000[2] = 0L;
      f84000[3] = 300L;
   }

   private static Rec0259 m194000(Noqodls var0) {
      return new Rec0259(f13000[3], f55000[3], () -> m24000(var0));
   }
}
