package rw;

import KDFzREm.y..Lambda+0x0000000101e45978;
import java.util.concurrent.ExecutorService;
import rw.cmd.C0013;
import rw.core.C0153;
import rw.core.C0182;
import rw.core.C0607;
import rw.core.C0690;
import rw.core.C0752;
import rw.core.C0950;
import rw.core.C0951;
import rw.core.C0957;
import rw.core.C0959;
import rw.core.C1081;
import rw.core.C1117;
import rw.core.C1222;
import rw.core.C1235;
import rw.core.C1241;
import rw.core.DiscordRpc;
import rw.core.NuZz;
import rw.core.OlOqjil;
import rw.core.Scheduler;
import rw.core.XrayBlocks;
import rw.data.ConfigFiles;
import rw.event.EventBus;
import rw.gui.HudScale;
import rw.gui.Huddumped;
import rw.gui.ThemeManager;
import rw.net.CloudSync;
import rw.net.ConfigSync;
import rw.net.IlkmktOi;
import rw.net.PresetSync;
import rw.net.SocketConnector;
import rw.render.ShaderTypes;
import rw.setting.C0108;
import rw.setting.C0154;

public class NursultanClient {
   private static byte[] M;
   private static short[] B;
   private static boolean[] Z;
   private static byte[] z;
   private static byte[] U;
   private static short[] E;
   private static byte[] W;
   private static short[] m;
   public Object[] N;
   private static byte[] P;
   public Object[] y;
   private static short[] s;
   public static Object[] L;
   private static double[] T;
   private static short[] b;
   private static byte[] j;
   public Object[] u;
   private static byte[] v;
   private static boolean[] n;
   private static short[] t;
   private static byte[] G;
   private static short[] l;
   private static byte[] d;
   private static byte[] w;
   private static short[] k;
   private static byte[] Y;
   private static byte[] Q;
   private static boolean[] O;
   private static short[] g;
   private static short[] I;
   private static short[] J;
   public Object[] i;
   private static String[] o;
   public Object[] R;
   private static short[] q;
   public OlOqjil R_2;
   public C0951 R_1;
   public C0013 R_4;
   public XrayBlocks R_3;
   public C0108 R_6;
   public C0607 R_5;
   public IlkmktOi i_1;
   public PresetSync i_0;
   public ConfigSync i_3;
   public ConfigFiles i_2;
   public C1117 i_5;
   public CloudSync i_4;
   public C0154 i_6;
   public DiscordRpc u_1;
   public SocketConnector u_0;
   public Huddumped u_3;
   public ThemeManager u_2;
   public C0182 y_1;
   public C1241 u_5;
   public NuZz u_4;
   public Scheduler y_0;
   public C0752 y_3;
   public C1081 y_2;
   public C1235 u_6;
   public ShaderTypes y_5;
   public C0153 y_7;
   public C0690 y_6;
   public C0957 N_0;
   public static C0959 L_2;
   public static ExecutorService L_1;
   public static Boolean L_4;
   public static Boolean L_3;
   public static EventBus L_6;
   public static NursultanClient L_5;

   public static ThemeManager w() {
      return L_5.u_2;
   }

   public static EventBus L() {
      return L_6;
   }

   public static ConfigFiles M() {
      return L_5.i_2;
   }

   public static C1235 P() {
      return L_5.u_6;
   }

   private static void X() {
      o = new String[]{"Nursultan initialized in {} ms", "%.2f", "Nursultan Shutdown Thread"};
   }

   private void K() {
      this.u = new Object[7];
      this.y = new Object[8];
      this.N = new Object[2];
      this.R = new Object[7];
      this.i = new Object[7];
   }

   public static CloudSync T() {
      return L_5.i_4;
   }

   public static C0607 Q() {
      return L_5.R_5;
   }

   public NursultanClient() {
      this.K();
      SocketConnector var5 = new SocketConnector();
      this.u[0] = var5;
   }

   static {
      ntfClinit();
   }

   public static HudScale B() {
      return (HudScale)L_5.y[E[0]];
   }

   private static void F() {
      P = new byte[]{5, 6, 2};
      j = new byte[]{4, 5, 3, 4, 5, 6};
      v = new byte[]{7, 5, 2};
      z = new byte[]{3, 4};
      d = new byte[]{6, 6, 6, 2};
      W = new byte[]{2, 5, 6, 2};
      Y = new byte[]{3, 2, 2, 3, 4, 10};
      U = new byte[]{6, 6, 6, 6, 6, 6, 6, 6};
      w = new byte[]{6, 6, 6, 6, 6, 4, 6};
      G = new byte[]{5, 6, 5, 6, 5, 2, 5, 5};
      Q = new byte[]{6, 7, 8, 2, 7, 7};
      M = new byte[]{7, 3, 4};
   }

   public static PresetSync I() {
      return L_5.i_0;
   }

   public static IlkmktOi J() {
      return L_5.i_1;
   }

   public static Scheduler Z() {
      return L_5.y_0;
   }

   private static void V() {
      g = new short[]{0, 6, 5, 6, 5, 4, 5, 0};
      q = new short[]{5, 1, 5, 4, 5, 2, 5, 3};
      m = new short[]{5, 3, 5, 0, 5, 5, 5};
      k = new short[]{6, 5, 1};
      b = new short[]{5, 2, 5, 4, 5, 5};
      J = new short[]{5, 0};
      I = new short[]{5, 2, 5, 3, 5, 6, 5, 3};
      t = new short[]{5, 5, 5, 6, 5};
      l = new short[]{7, 5, 0, 5};
      E = new short[]{4, 5, 1, 5, 0};
      s = new short[]{5, 1, 5, 2, 5};
      B = new short[]{1, 5, 5, 2, 0, 1};
   }

   private void e() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 0
      //   at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
      //   at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
      //   at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
      //   at java.base/java.util.Objects.checkIndex(Objects.java:385)
      //   at java.base/java.util.ArrayList.remove(ArrayList.java:551)
      //   at org.jetbrains.java.decompiler.util.collections.ListStack.pop(ListStack.java:31)
      //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.processBlock(ExprProcessor.java:288)
      //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.processStatement(ExprProcessor.java:134)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:220)
      //
      // Bytecode:
      // 000: getstatic rw/NursultanClient.L [Ljava/lang/Object;
      // 003: getstatic rw/NursultanClient.U [B
      // 006: baload
      // 007: aaload
      // 008: checkcast rw/event/EventBus
      // 00b: aload 0
      // 00c: getfield rw/NursultanClient.i [Ljava/lang/Object;
      // 00f: getstatic rw/NursultanClient.U [B
      // 012: baload
      // 013: aaload
      // 014: checkcast java/lang/Object
      // 017: invokevirtual rw/event/EventBus.y (Ljava/lang/Object;)V
      // 01a: getstatic rw/NursultanClient.L_6 Lrw/event/EventBus;
      // 01d: checkcast rw/event/EventBus
      // 020: new rw/core/C1236
      // 023: dup
      // 024: invokespecial rw/core/C1236.<init> ()V
      // 027: invokevirtual rw/event/EventBus.y (Ljava/lang/Object;)V
      // 02a: getstatic rw/NursultanClient.L_6 Lrw/event/EventBus;
      // 02d: checkcast rw/event/EventBus
      // 030: new rw/core/C0981
      // 033: dup
      // 034: invokespecial rw/core/C0981.<init> ()V
      // 037: invokevirtual rw/event/EventBus.y (Ljava/lang/Object;)V
      // 03a: getstatic rw/NursultanClient.L_6 Lrw/event/EventBus;
      // 03d: checkcast rw/event/EventBus
      // 040: ldc java/lang/String
      // 042: new rw/core/C0136
      // 045: dup
      // 046: invokespecial rw/core/C0136.<init> ()V
      // 049: invokevirtual rw/event/EventBus.N (Ljava/lang/Class;Lrw/net/PacketListener;)V
      // 04c: getstatic rw/NursultanClient.L_6 Lrw/event/EventBus;
      // 04f: checkcast rw/event/EventBus
      // 052: ldc java/lang/String
      // 054: new rw/core/C0144
      // 057: dup
      // 058: invokespecial rw/core/C0144.<init> ()V
      // 05b: invokevirtual rw/event/EventBus.N (Ljava/lang/Class;Lrw/net/PacketListener;)V
      // 05e: getstatic rw/NursultanClient.L_6 Lrw/event/EventBus;
      // 061: checkcast rw/event/EventBus
      // 064: ldc java/lang/String
      // 066: new rw/core/C0137
      // 069: dup
      // 06a: invokespecial rw/core/C0137.<init> ()V
      // 06d: invokevirtual rw/event/EventBus.N (Ljava/lang/Class;Lrw/net/PacketListener;)V
      // 070: getstatic rw/NursultanClient.L_6 Lrw/event/EventBus;
      // 073: checkcast rw/event/EventBus
      // 076: ldc java/lang/String
      // 078: new rw/core/C0157
      // 07b: dup
      // 07c: invokespecial rw/core/C0157.<init> ()V
      // 07f: invokevirtual rw/event/EventBus.N (Ljava/lang/Class;Lrw/net/PacketListener;)V
      // 082: getstatic rw/NursultanClient.L [Ljava/lang/Object;
      // 085: getstatic rw/NursultanClient.w [B
      // 088: baload
      // 089: aaload
      // 08a: checkcast rw/event/EventBus
      // 08d: ldc java/lang/String
      // 08f: new rw/core/C0131
      // 092: dup
      // 093: invokespecial rw/core/C0131.<init> ()V
      // 096: invokevirtual rw/event/EventBus.N (Ljava/lang/Class;Lrw/net/PacketListener;)V
      // 099: getstatic rw/NursultanClient.L [Ljava/lang/Object;
      // 09c: getstatic rw/NursultanClient.w [B
      // 09f: baload
      // 0a0: aaload
      // 0a1: checkcast rw/event/EventBus
      // 0a4: ldc java/lang/String
      // 0a6: new rw/core/C0133
      // 0a9: dup
      // 0aa: invokespecial rw/core/C0133.<init> ()V
      // 0ad: invokevirtual rw/event/EventBus.N (Ljava/lang/Class;Lrw/net/PacketListener;)V
      // 0b0: getstatic rw/NursultanClient.L_6 Lrw/event/EventBus;
      // 0b3: checkcast rw/event/EventBus
      // 0b6: ldc java/lang/String
      // 0b8: new rw/setting/C0021
      // 0bb: dup
      // 0bc: invokespecial rw/setting/C0021.<init> ()V
      // 0bf: invokevirtual rw/event/EventBus.N (Ljava/lang/Class;Lrw/net/PacketListener;)V
      // 0c2: getstatic rw/NursultanClient.L_6 Lrw/event/EventBus;
      // 0c5: checkcast rw/event/EventBus
      // 0c8: ldc java/lang/String
      // 0ca: new rw/core/C0152
      // 0cd: dup
      // 0ce: invokespecial rw/core/C0152.<init> ()V
      // 0d1: invokevirtual rw/event/EventBus.N (Ljava/lang/Class;Lrw/net/PacketListener;)V
      // 0d4: getstatic rw/NursultanClient.L_6 Lrw/event/EventBus;
      // 0d7: checkcast rw/event/EventBus
      // 0da: getstatic rw/defs/Enum0081.staticFields_0d1998a71c0803f83aaed89a64f36d2f5 [Ljava/lang/Object;
      // 0dd: bipush 4
      // 0de: aaload
      // 0df: checkcast rw/defs/Enum0081
      // 0e2: ldc java/lang/String
      // 0e4: new rw/core/C0146
      // 0e7: dup
      // 0e8: invokespecial rw/core/C0146.<init> ()V
      // 0eb: invokevirtual rw/event/EventBus.N (Lrw/defs/Enum0081;Ljava/lang/Class;Lrw/net/PacketListener;)V
      // 0ee: getstatic rw/NursultanClient.L_6 Lrw/event/EventBus;
      // 0f1: checkcast rw/event/EventBus
      // 0f4: getstatic rw/defs/Enum0081.staticFields_0d1998a71c0803f83aaed89a64f36d2f5 [Ljava/lang/Object;
      // 0f7: getstatic rw/NursultanClient.G [B
      // 0fa: baload
      // 0fb: aaload
      // 0fc: checkcast rw/defs/Enum0081
      // 0ff: ldc java/lang/String
      // 101: new rw/core/C0134
      // 104: dup
      // 105: invokespecial rw/core/C0134.<init> ()V
      // 108: invokevirtual rw/event/EventBus.N (Lrw/defs/Enum0081;Ljava/lang/Class;Lrw/net/PacketListener;)V
      // 10b: getstatic rw/NursultanClient.L [Ljava/lang/Object;
      // 10e: getstatic rw/NursultanClient.G [B
      // 111: baload
      // 112: aaload
      // 113: checkcast rw/event/EventBus
      // 116: getstatic rw/defs/Enum0081.staticFields_0d1998a71c0803f83aaed89a64f36d2f5 [Ljava/lang/Object;
      // 119: bipush 5
      // 11a: aaload
      // 11b: checkcast rw/defs/Enum0081
      // 11e: ldc java/lang/String
      // 120: new rw/core/C0154
      // 123: dup
      // 124: invokespecial rw/core/C0154.<init> ()V
      // 127: invokevirtual rw/event/EventBus.N (Lrw/defs/Enum0081;Ljava/lang/Class;Lrw/net/PacketListener;)V
      // 12a: getstatic rw/NursultanClient.L_6 Lrw/event/EventBus;
      // 12d: checkcast rw/event/EventBus
      // 130: getstatic rw/defs/Enum0081.staticFields_0d1998a71c0803f83aaed89a64f36d2f5 [Ljava/lang/Object;
      // 133: bipush 5
      // 134: aaload
      // 135: checkcast rw/defs/Enum0081
      // 138: ldc java/lang/String
      // 13a: new rw/core/C0141
      // 13d: dup
      // 13e: invokespecial rw/core/C0141.<init> ()V
      // 141: invokevirtual rw/event/EventBus.N (Lrw/defs/Enum0081;Ljava/lang/Class;Lrw/net/PacketListener;)V
      // 144: return
   }

   public static Huddumped i() {
      return L_5.u_3;
   }

   public static C1081 b() {
      return L_5.y_2;
   }

   public static C0690 s() {
      return L_5.y_6;
   }

   private static void c() {
      T = new double[]{1000000.0};
   }

   public static XrayBlocks n() {
      return L_5.R_3;
   }

   public static void l() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 0
      //   at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
      //   at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
      //   at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
      //   at java.base/java.util.Objects.checkIndex(Objects.java:385)
      //   at java.base/java.util.ArrayList.remove(ArrayList.java:551)
      //   at org.jetbrains.java.decompiler.util.collections.ListStack.pop(ListStack.java:31)
      //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.processBlock(ExprProcessor.java:288)
      //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.processStatement(ExprProcessor.java:134)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:220)
      //
      // Bytecode:
      // 00: invokestatic java/lang/System.nanoTime ()J
      // 03: pop2
      // 04: getstatic rw/NursultanClient.L [Ljava/lang/Object;
      // 07: getstatic rw/NursultanClient.P [B
      // 0a: baload
      // 0b: aaload
      // 0c: checkcast rw/NursultanClient
      // 0f: invokevirtual rw/NursultanClient.H ()V
      // 12: getstatic rw/NursultanClient.L [Ljava/lang/Object;
      // 15: getstatic rw/NursultanClient.Z [Z
      // 18: baload
      // 19: aaload
      // 1a: checkcast org/apache/logging/log4j/Logger
      // 1d: getstatic rw/NursultanClient.o [Ljava/lang/String;
      // 20: aaload
      // 21: checkcast java/lang/String
      // 24: getstatic rw/NursultanClient.o [Ljava/lang/String;
      // 27: aaload
      // 28: checkcast java/lang/String
      // 2b: getstatic rw/NursultanClient.Z [Z
      // 2e: baload
      // 2f: anewarray 4
      // 32: dup
      // 33: bipush 0
      // 34: invokestatic java/lang/System.nanoTime ()J
      // 37: l2d
      // 38: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 3b: aastore
      // 3c: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 3f: invokeinterface org/apache/logging/log4j/Logger.info (Ljava/lang/String;Ljava/lang/Object;)V 3
      // 44: return
   }

   public static ConfigSync d() {
      return L_5.i_3;
   }

   private static void a() {
      Z = new boolean[]{false, true, false, true, true};
      n = new boolean[]{true, true, false, false, true, false, true, false};
      O = new boolean[]{true, false, false, false, true, false, false};
   }

   public static C1241 m() {
      return L_5.u_5;
   }

   private void p() {
      Thread var64 = new Thread(new Lambda+0x0000000101e45978(this));
      var64.setPriority(10);
      var64.setDaemon(false);
      var64.setName(o[2]);
      Runtime.getRuntime().addShutdownHook(var64);
   }

   public static C0154 k() {
      return L_5.i_6;
   }

   public static ShaderTypes t() {
      return L_5.y_5;
   }

   public static OlOqjil g() {
      return L_5.R_2;
   }

   public static NuZz v() {
      return L_5.u_4;
   }

   public static C0957 j() {
      return L_5.N_0;
   }

   private static void q() {
      L = new Object[]{null, null, null, false, false, null, null};
   }

   public static C0950 U() {
      return (C0950)((NursultanClient)L[E[1]]).N[E[2]];
   }

   public static SocketConnector z() {
      return L_5.u_0;
   }

   public static C0752 u() {
      return L_5.y_3;
   }

   public static C1222 y() {
      return (C1222)((NursultanClient)L[E[3]]).R[E[4]];
   }

   public static C0951 E() {
      return L_5.R_1;
   }

   public static C0153 N() {
      return L_5.y_7;
   }

   public static C0182 W() {
      return L_5.y_1;
   }

   public static DiscordRpc R() {
      return L_5.u_1;
   }

   public static C1117 O() {
      return L_5.i_5;
   }

   private void H() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 0
      //   at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
      //   at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
      //   at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
      //   at java.base/java.util.Objects.checkIndex(Objects.java:385)
      //   at java.base/java.util.ArrayList.remove(ArrayList.java:551)
      //   at org.jetbrains.java.decompiler.util.collections.ListStack.pop(ListStack.java:31)
      //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.processBlock(ExprProcessor.java:326)
      //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.processStatement(ExprProcessor.java:134)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:220)
      //
      // Bytecode:
      // 000: invokestatic rw/gui/C0002.y ()V
      // 003: aload 0
      // 004: getfield rw/NursultanClient.u [Ljava/lang/Object;
      // 007: bipush 1
      // 008: new rw/core/DiscordRpc
      // 00b: dup
      // 00c: invokespecial rw/core/DiscordRpc.<init> ()V
      // 00f: aastore
      // 010: aload 0
      // 011: getfield rw/NursultanClient.u [Ljava/lang/Object;
      // 014: getstatic rw/NursultanClient.P [B
      // 017: baload
      // 018: new rw/core/C1235
      // 01b: dup
      // 01c: getstatic rw/defs/OlpiIqlss.staticFields_012b09a0b8db6387686aa0e4095e29f49 [Ljava/lang/Object;
      // 01f: bipush 1
      // 020: aaload
      // 021: checkcast rw/defs/OlpiIqlss
      // 024: getstatic rw/defs/OlpiIqlss.staticFields_012b09a0b8db6387686aa0e4095e29f49 [Ljava/lang/Object;
      // 027: bipush 1
      // 028: aaload
      // 029: checkcast rw/defs/OlpiIqlss
      // 02c: invokespecial rw/core/C1235.<init> (Lrw/defs/OlpiIqlss;Lrw/defs/OlpiIqlss;)V
      // 02f: aastore
      // 030: aload 0
      // 031: getfield rw/NursultanClient.y [Ljava/lang/Object;
      // 034: getstatic rw/NursultanClient.n [Z
      // 037: baload
      // 038: new rw/core/C0182
      // 03b: dup
      // 03c: invokespecial rw/core/C0182.<init> ()V
      // 03f: aastore
      // 040: aload 0
      // 041: getfield rw/NursultanClient.y [Ljava/lang/Object;
      // 044: bipush 2
      // 045: new rw/core/C1081
      // 048: dup
      // 049: invokespecial rw/core/C1081.<init> ()V
      // 04c: aastore
      // 04d: aload 0
      // 04e: getfield rw/NursultanClient.u [Ljava/lang/Object;
      // 051: getstatic rw/NursultanClient.j [B
      // 054: baload
      // 055: new rw/core/NuZz
      // 058: dup
      // 059: invokespecial rw/core/NuZz.<init> ()V
      // 05c: aastore
      // 05d: aload 0
      // 05e: getfield rw/NursultanClient.u [Ljava/lang/Object;
      // 061: getstatic rw/NursultanClient.j [B
      // 064: baload
      // 065: new rw/core/C1241
      // 068: dup
      // 069: invokespecial rw/core/C1241.<init> ()V
      // 06c: aastore
      // 06d: aload 0
      // 06e: getfield rw/NursultanClient.y [Ljava/lang/Object;
      // 071: bipush 0
      // 072: new rw/core/Scheduler
      // 075: dup
      // 076: invokespecial rw/core/Scheduler.<init> ()V
      // 079: aastore
      // 07a: aload 0
      // 07b: getfield rw/NursultanClient.y [Ljava/lang/Object;
      // 07e: bipush 3
      // 07f: new rw/core/C0752
      // 082: dup
      // 083: invokespecial rw/core/C0752.<init> ()V
      // 086: aastore
      // 087: aload 0
      // 088: getfield rw/NursultanClient.y [Ljava/lang/Object;
      // 08b: bipush 4
      // 08c: new rw/gui/HudScale
      // 08f: dup
      // 090: invokespecial rw/gui/HudScale.<init> ()V
      // 093: aastore
      // 094: aload 0
      // 095: getfield rw/NursultanClient.y [Ljava/lang/Object;
      // 098: bipush 5
      // 099: new rw/render/ShaderTypes
      // 09c: dup
      // 09d: invokespecial rw/render/ShaderTypes.<init> ()V
      // 0a0: aastore
      // 0a1: aload 0
      // 0a2: getfield rw/NursultanClient.y [Ljava/lang/Object;
      // 0a5: bipush 6
      // 0a7: new rw/core/C0690
      // 0aa: dup
      // 0ab: invokespecial rw/core/C0690.<init> ()V
      // 0ae: aastore
      // 0af: aload 0
      // 0b0: getfield rw/NursultanClient.y [Ljava/lang/Object;
      // 0b3: getstatic rw/NursultanClient.v [B
      // 0b6: baload
      // 0b7: new rw/core/C0153
      // 0ba: dup
      // 0bb: invokespecial rw/core/C0153.<init> ()V
      // 0be: aastore
      // 0bf: aload 0
      // 0c0: getfield rw/NursultanClient.N [Ljava/lang/Object;
      // 0c3: bipush 0
      // 0c4: new rw/core/C0957
      // 0c7: dup
      // 0c8: invokespecial rw/core/C0957.<init> ()V
      // 0cb: aastore
      // 0cc: aload 0
      // 0cd: getfield rw/NursultanClient.N [Ljava/lang/Object;
      // 0d0: bipush 1
      // 0d1: new rw/core/C0950
      // 0d4: dup
      // 0d5: invokespecial rw/core/C0950.<init> ()V
      // 0d8: aastore
      // 0d9: aload 0
      // 0da: getfield rw/NursultanClient.R [Ljava/lang/Object;
      // 0dd: bipush 0
      // 0de: new rw/core/C1222
      // 0e1: dup
      // 0e2: invokespecial rw/core/C1222.<init> ()V
      // 0e5: aastore
      // 0e6: aload 0
      // 0e7: getfield rw/NursultanClient.R [Ljava/lang/Object;
      // 0ea: getstatic rw/NursultanClient.v [B
      // 0ed: baload
      // 0ee: new rw/core/C0607
      // 0f1: dup
      // 0f2: invokespecial rw/core/C0607.<init> ()V
      // 0f5: aastore
      // 0f6: aload 0
      // 0f7: getfield rw/NursultanClient.R [Ljava/lang/Object;
      // 0fa: bipush 1
      // 0fb: new rw/core/C0951
      // 0fe: dup
      // 0ff: invokespecial rw/core/C0951.<init> ()V
      // 102: aastore
      // 103: aload 0
      // 104: getfield rw/NursultanClient.R [Ljava/lang/Object;
      // 107: bipush 2
      // 108: new rw/core/OlOqjil
      // 10b: dup
      // 10c: invokespecial rw/core/OlOqjil.<init> ()V
      // 10f: aastore
      // 110: aload 0
      // 111: getfield rw/NursultanClient.R [Ljava/lang/Object;
      // 114: getstatic rw/NursultanClient.z [B
      // 117: baload
      // 118: new rw/core/XrayBlocks
      // 11b: dup
      // 11c: invokespecial rw/core/XrayBlocks.<init> ()V
      // 11f: aastore
      // 120: aload 0
      // 121: getfield rw/NursultanClient.R [Ljava/lang/Object;
      // 124: getstatic rw/NursultanClient.z [B
      // 127: baload
      // 128: new rw/cmd/C0013
      // 12b: dup
      // 12c: invokespecial rw/cmd/C0013.<init> ()V
      // 12f: aastore
      // 130: aload 0
      // 131: getfield rw/NursultanClient.R [Ljava/lang/Object;
      // 134: getstatic rw/NursultanClient.d [B
      // 137: baload
      // 138: new rw/setting/C0108
      // 13b: dup
      // 13c: invokespecial rw/setting/C0108.<init> ()V
      // 13f: aastore
      // 140: aload 0
      // 141: getfield rw/NursultanClient.R [Ljava/lang/Object;
      // 144: getstatic rw/NursultanClient.d [B
      // 147: baload
      // 148: aaload
      // 149: checkcast rw/setting/C0108
      // 14c: invokevirtual rw/setting/C0108.u ()V
      // 14f: aload 0
      // 150: getfield rw/NursultanClient.i [Ljava/lang/Object;
      // 153: bipush 0
      // 154: new rw/net/PresetSync
      // 157: dup
      // 158: aload 0
      // 159: getfield rw/NursultanClient.R_6 Lrw/setting/C0108;
      // 15c: checkcast rw/setting/C0108
      // 15f: invokespecial rw/net/PresetSync.<init> (Lrw/setting/C0108;)V
      // 162: aastore
      // 163: aload 0
      // 164: getfield rw/NursultanClient.i [Ljava/lang/Object;
      // 167: getstatic rw/NursultanClient.O [Z
      // 16a: baload
      // 16b: new rw/net/IlkmktOi
      // 16e: dup
      // 16f: invokespecial rw/net/IlkmktOi.<init> ()V
      // 172: aastore
      // 173: aload 0
      // 174: getfield rw/NursultanClient.i [Ljava/lang/Object;
      // 177: bipush 2
      // 178: new rw/data/ConfigFiles
      // 17b: dup
      // 17c: invokespecial rw/data/ConfigFiles.<init> ()V
      // 17f: aastore
      // 180: aload 0
      // 181: getfield rw/NursultanClient.i [Ljava/lang/Object;
      // 184: getstatic rw/NursultanClient.W [B
      // 187: baload
      // 188: aaload
      // 189: checkcast rw/data/ConfigFiles
      // 18c: ldc java/lang/String
      // 18e: invokevirtual rw/data/ConfigFiles.L (Ljava/lang/Class;)V
      // 191: aload 0
      // 192: getfield rw/NursultanClient.i [Ljava/lang/Object;
      // 195: getstatic rw/NursultanClient.W [B
      // 198: baload
      // 199: new rw/core/C1117
      // 19c: dup
      // 19d: invokespecial rw/core/C1117.<init> ()V
      // 1a0: aastore
      // 1a1: aload 0
      // 1a2: getfield rw/NursultanClient.i [Ljava/lang/Object;
      // 1a5: bipush 6
      // 1a7: new rw/setting/C0154
      // 1aa: dup
      // 1ab: invokespecial rw/setting/C0154.<init> ()V
      // 1ae: aastore
      // 1af: aload 0
      // 1b0: getfield rw/NursultanClient.u [Ljava/lang/Object;
      // 1b3: bipush 2
      // 1b4: new rw/gui/ThemeManager
      // 1b7: dup
      // 1b8: invokespecial rw/gui/ThemeManager.<init> ()V
      // 1bb: aastore
      // 1bc: aload 0
      // 1bd: getfield rw/NursultanClient.u [Ljava/lang/Object;
      // 1c0: getstatic rw/NursultanClient.Y [B
      // 1c3: baload
      // 1c4: new rw/gui/Huddumped
      // 1c7: dup
      // 1c8: invokespecial rw/gui/Huddumped.<init> ()V
      // 1cb: aastore
      // 1cc: aload 0
      // 1cd: getfield rw/NursultanClient.i [Ljava/lang/Object;
      // 1d0: getstatic rw/NursultanClient.Y [B
      // 1d3: baload
      // 1d4: aaload
      // 1d5: checkcast rw/data/ConfigFiles
      // 1d8: invokevirtual rw/data/ConfigFiles.y ()V
      // 1db: invokestatic rw/setting/C0107.y ()V
      // 1de: aload 0
      // 1df: getfield rw/NursultanClient.i [Ljava/lang/Object;
      // 1e2: bipush 3
      // 1e3: new rw/net/ConfigSync
      // 1e6: dup
      // 1e7: aload 0
      // 1e8: getfield rw/NursultanClient.i_2 Lrw/data/ConfigFiles;
      // 1eb: checkcast rw/data/ConfigFiles
      // 1ee: invokespecial rw/net/ConfigSync.<init> (Lrw/data/ConfigFiles;)V
      // 1f1: aastore
      // 1f2: aload 0
      // 1f3: getfield rw/NursultanClient.i [Ljava/lang/Object;
      // 1f6: bipush 4
      // 1f7: new rw/net/CloudSync
      // 1fa: dup
      // 1fb: invokespecial rw/net/CloudSync.<init> ()V
      // 1fe: aastore
      // 1ff: aload 0
      // 200: getfield rw/NursultanClient.u [Ljava/lang/Object;
      // 203: getstatic rw/NursultanClient.O [Z
      // 206: baload
      // 207: aaload
      // 208: checkcast rw/net/SocketConnector
      // 20b: invokevirtual rw/net/SocketConnector.z ()V
      // 20e: aload 0
      // 20f: invokevirtual rw/NursultanClient.e ()V
      // 212: aload 0
      // 213: invokevirtual rw/NursultanClient.p ()V
      // 216: invokestatic rw/core/C1153.N ()V
      // 219: return
   }

   public static C0108 G() {
      return L_5.R_6;
   }

   public static C0013 Y() {
      return L_5.R_4;
   }
}
