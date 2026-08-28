package rw.core;

import KDFzREm.Ned;
import java.util.List;
import org.joml.Vector3i;
import rw.data.IlsImt;

public class C1037 extends Base1018 {
   private static boolean[] f1000;
   private static byte[] f2000;
   private static boolean[] f3000;
   private static boolean[] f4000;

   private static void m2000() {
      boolean[] var128 = new boolean[2];
      f4000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f4000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      boolean[] var129 = new boolean[3];
      f3000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f3000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f3000[2] = (boolean)((0 | -0) >>> 31);
      boolean[] var130 = new boolean[8];
      f1000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f1000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f1000[2] = (boolean)((0 | -0) >>> 31);
      f1000[3] = (boolean)((0 | -0) >>> 31);
      f1000[4] = (boolean)((0 | -0) >>> 31);
      f1000[5] = (boolean)((0 | -0) >>> 31);
      f1000[6] = (boolean)((1 | -1) >>> 31);
      f1000[7] = (boolean)((0 | -0) >>> 31);
   }

   public C1037(String var1, int var2) {
      super(var1, var2);
   }

   static {
      ntfClinit();
   }

   private static void m4000() {
      byte[] var128 = new byte[4];
      f2000[(0 | -0) >>> 31] = -1;
      f2000[(1 | -1) >>> 31] = -1;
      f2000[2] = -1;
      f2000[3] = -1;
   }

   private boolean m2000(List<IlsImt> var1, Vector3i var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = f1000[3];

      for (int var9 = f1000[4]; var9 <= var4; var9++) {
         for (int var10 = f1000[5]; var10 <= var3; var10++) {
            int var11 = var2.x + var9 * var6 + var5;
            int var12 = var2.y + var10;
            int var13 = var2.z + var9;
            int var14 = var13 + var7;

            for (IlsImt var16 : var1) {
               Ned var17 = var16.m6000();
               if (var17.method_10263() == var11 && var17.method_10264() == var12 && (var17.method_10260() == var13 || var17.method_10260() == var14)) {
                  var8++;
               }
            }
         }
      }

      return var8 == var1.size() ? f1000[6] : f1000[7];
   }

   public boolean m8000(List<IlsImt> var1, Vector3i var2, Vector3i var3) {
      return !this.m2000(var1, var2, var3.y, var3.x, var3.x, f2000[0], f4000[0])
            && !this.m2000(var1, var2, var3.y, var3.x, f4000[1], f3000[0], f3000[1])
            && !this.m2000(var1, var2, var3.y, var3.x, var3.x, f2000[1], f2000[2])
            && !this.m2000(var1, var2, var3.y, var3.x, f3000[2], f1000[0], f2000[3])
         ? f1000[2]
         : f1000[1];
   }
}
