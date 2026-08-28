package rw.net;

import java.util.Map;
import rw.core.C1215;
import rw.core.OljltOqi;
import rw.defs.IlmOnqm;

public enum Enum0031 {
   private static short[] f1000;
   private static byte[] f2000;
   public static Object[] f3000;
   private static byte[] f4000;
   private static byte[] f5000;
   private static byte[] f6000;
   public Object[] f7000;
   private static boolean[] f8000;
   private static byte[] f9000;
   private static byte[] f10000;
   private static boolean[] f11000;
   private static boolean[] f12000;
   private static String[] f13000;
   private static byte[] f14000;
   private static short[] f15000;
   private static boolean[] f16000;
   private static byte[] f17000;

   private static void m2000() {
      f3000 = new Object[]{null, null, null, null, null, null};
   }

   private static void m8000() {
      f4000 = new byte[]{2, 2, 3, 4, 5, 6, 7};
      f9000 = new byte[]{8, 9, 10, 11};
      f10000 = new byte[]{12, 13, 14, 15, 16, 16, 2};
      f2000 = new byte[]{3, 4, 5};
      f5000 = new byte[]{6, 7};
      f17000 = new byte[]{8, 9, 10, 11, 12, 13, 14};
      f14000 = new byte[]{15, 16, 17, 16, 5, 2};
      f6000 = new byte[]{3, 4, 6};
   }

   private Enum0031(C1215 var3) {
      l1lrr<"grpe",-828077332,1799868078,1799868086,1799868087,-828077332,-828077332,-828077332>(this);
      Map var8 = (Map)var3.f1000[f1000[1]];
      this.f7000[f1000[2]] = var8;
   }

   static {
      ntfClinit();
   }

   public static Enum0031[] m10000() {
      return (Enum0031[])((Enum0031[])f3000[f1000[0]]).clone();
   }

   private static void m14000() {
      f13000 = new String[]{"AUTH", "PLAY", "protocol", "protocolVersion"};
   }

   private static void m18000() {
      f12000 = new boolean[]{false, true, false, false, false, true};
      f8000 = new boolean[]{true, false, false, true, false};
      f11000 = new boolean[]{false, true, true};
      f16000 = new boolean[]{false, true, true, false, false, true};
   }

   public Integer m28000(IlmOnqm var1, PacketHandlers<?> var2) {
      return ((OljltOqi)((Map)this.f7000[f1000[4]]).get(var1)).m22000(var2.getClass());
   }

   public boolean m30000(IlmOnqm var1, PacketHandlers<?> var2, int var3) {
      return ((OljltOqi)((Map)this.f7000[f1000[5]]).get(var1)).m20000(var2.getClass(), var3);
   }

   public static Enum0031 m36000(PacketHandlers<?> var0) {
      return (Enum0031)((Map)f3000[f1000[3]]).get(var0.getClass());
   }

   private static void m38000() {
      f1000 = new short[]{5, 0, 0, 4, 0, 0};
      f15000 = new short[]{0, 4, 4, 4, 4, 0, 1};
   }

   public PacketHandlers<?> m42000(IlmOnqm var1, int var2, int var3) {
      return ((OljltOqi)((Map)this.f7000[f15000[0]]).get(var1)).m24000(var2, var3);
   }

   private void m46000() {
      if (this.f7000 == null) {
         this.f7000 = new Object[f16000[5]];
         Object[] var1 = this.f7000;
      }
   }
}
