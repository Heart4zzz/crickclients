package rw.core;

import java.util.List;
import java.util.Map.Entry;
import rw.GuiWidget;
import rw.NursultanClient;
import rw.data.Rec0223;

public class IlkOjlim extends Base1005 {
   private static boolean[] f1000;
   private static byte[] f2000;

   static {
      ntfClinit();
   }

   private static void m6000() {
      byte[] var128 = new byte[(1 | -1) >>> 31];
      f2000[(0 | -0) >>> 31] = 2;
   }

   private void m2000(GuiWidget var1, String var2, List<String> var3, List<Rec0223> var4) {
      int var5 = this.N(var1.m2000(), var2);
      if (var5 != 0) {
         var4.add(new Rec0223(var3, var1, var5));
      } else {
         var5 = this.N(var1.m42000(), var2);
         if (var5 != 0) {
            var4.add(new Rec0223(var3, var1, var5));
         }
      }
   }

   public void m8000(String var1, int var2, List<Rec0223> var3) {
      boolean var4 = (var2 & f1000[0]) != 0 ? f1000[1] : f1000[2];
      boolean var5 = (var2 & f2000[0]) != 0 ? f1000[3] : f1000[4];
      if (var4 || var5) {
         for (GuiWidget var7 : NursultanClient.m88000().m152000()) {
            String var8 = C1235.m40000(var7.m4000().m52000());
            String var9 = var7.m2000();
            if (var4) {
               this.m2000(var7, var1, List.of(var8), var3);
            }

            if (var5) {
               this.m4000(var7, var1, List.of(var8, var9), var3);
            }
         }
      }
   }

   private void m4000(Base0995 var1, String var2, List<String> var3, List<Rec0223> var4) {
      for (Entry var6 : var1.m2000().entrySet()) {
         Base1014 var7 = (Base1014)var6.getValue();
         var7.m18000();
         if (!var7.m28000()) {
            return;
         }

         String var8 = C1235.m40000(var7.m6000());
         int var9 = this.N(var8, var2);
         if (var9 != 0) {
            var4.add(new Rec0223(var3, var7, var9));
         }

         this.m4000(var7, var2, this.N(var3, var8), var4);
      }
   }

   private static void m10000() {
      boolean[] var128 = new boolean[5];
      f1000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f1000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f1000[2] = (boolean)((0 | -0) >>> 31);
      f1000[3] = (boolean)((1 | -1) >>> 31);
      f1000[4] = (boolean)((0 | -0) >>> 31);
   }
}
