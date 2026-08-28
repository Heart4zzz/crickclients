package rw.core;

import java.util.List;
import org.joml.Vector3i;
import rw.api.Iface0624;
import rw.data.IlsImt;
import rw.data.Rec0230;

public abstract class Base1018 implements Iface0624 {
   private static short[] f1000;
   private static boolean[] f2000;
   private static byte[] f3000;
   public Object[] f4000;

   private static void m4000() {
      boolean[] var128 = new boolean[8];
      f2000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f2000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f2000[2] = (boolean)((1 | -1) >>> 31);
      f2000[3] = (boolean)((1 | -1) >>> 31);
      f2000[4] = (boolean)((1 | -1) >>> 31);
      f2000[5] = (boolean)((0 | -0) >>> 31);
      f2000[6] = (boolean)((1 | -1) >>> 31);
      f2000[7] = (boolean)((0 | -0) >>> 31);
   }

   public Base1018(String var1, int var2) {
      this.m6000();
      this.f4000[f1000[0]] = var1;
      Integer var8 = var2;
      this.f4000[f1000[1]] = var8;
   }

   static {
      ntfClinit();
   }

   private void m6000() {
      if (this.f4000 == null) {
         this.f4000 = new Object[f3000[4]];
         Object[] var1 = this.f4000;
         var1[f2000[6]] = Integer.valueOf(f2000[7]);
      }
   }

   private static void m8000() {
      short[] var128 = new short[5];
      f1000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f1000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      f1000[2] = (short)((0 | -0) >>> 31);
      f1000[3] = (short)((0 | -0) >>> 31);
      f1000[4] = (short)((1 | -1) >>> 31);
   }

   public int m12000() {
      return (Integer)this.f4000[f1000[4]];
   }

   public boolean m14000(List<IlsImt> var1) {
      for (Rec0230 var4 : (List)C1027.f16000[f1000[2]]) {
         if (var4.m12000(var1)) {
            return f2000[0];
         }
      }

      return f2000[1];
   }

   public abstract boolean m16000(List<IlsImt> var1, Vector3i var2, Vector3i var3);

   public boolean m18000(int var1, int var2, int var3) {
      return (var1 != f3000[0] || var3 != f2000[2] || var2 != f3000[1]) && (var1 != f3000[2] || var3 != f2000[3] || var2 != f3000[3]) ? f2000[5] : f2000[4];
   }

   public String m20000() {
      return (String)this.f4000[f1000[3]];
   }

   private static void m24000() {
      byte[] var128 = new byte[5];
      f3000[(0 | -0) >>> 31] = 4;
      f3000[(1 | -1) >>> 31] = 4;
      f3000[2] = 6;
      f3000[3] = 6;
      f3000[4] = 2;
   }
}
