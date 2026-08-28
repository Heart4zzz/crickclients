package rw.setting;

import KDFzREm.NNNNRZ;
import KDFzREm.NNNNug;
import KDFzREm.NNag;
import KDFzREm.NPh;
import KDFzREm.NQo;
import KDFzREm.NbK;
import KDFzREm.Nbh;
import KDFzREm.NpG;
import KDFzREm.Nwn;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import rw.api.Iface0652;
import rw.core.C0744;
import rw.core.C1013;
import rw.core.C1136;
import rw.core.C1137;
import rw.core.C1140;
import rw.core.C1141;
import rw.gui.GuiElement;

public class PublicBukkitValues extends C0744<Nwn> {
   private static short[] f1000;
   private static int[] f2000;
   private static byte[] f3000;
   public static Object[] f4000;
   private static short[] f5000;
   private static String[] f6000;
   private static boolean[] f7000;

   private static void m6000() {
      f2000 = new int[]{-1434451968};
   }

   private static void m8000() {
      f3000 = new byte[]{45, 2, 3};
   }

   public PublicBukkitValues(GuiElement var1, String var2, boolean var3) {
      super(var1, var2, var3);
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      f7000 = new boolean[]{false, true, true, false, false, true};
   }

   private String m8000(String var1) {
      if (var1.startsWith(f6000[2])) {
         String var2 = var1.substring(var1.indexOf(f3000[0]) + f7000[1]).toUpperCase();
         return NPh.field_1080 + " [" + NPh.field_1061 + var2 + NPh.field_1080 + "]" + NPh.field_1070;
      } else {
         return f6000[3];
      }
   }

   private static void m12000() {
      f4000 = new Object[]{null, null, null};
   }

   private static void m16000() {
      f6000 = new String[]{"", "", "sphere-", "", "don-item", "minecraft:don-item", "PublicBukkitValues"};
   }

   public NNag m16000(Nwn var1) {
      NNag var2 = super.m6000(var1);
      if (((C1013)((GuiElement)this.N[f5000[0]]).f2000[f5000[1]]).m14000()) {
         Nbh[] var3 = Nbh.values();
         int var4 = var3.length;

         for (int var5 = f7000[0]; var5 < var4; var5++) {
            Nbh var6 = var3[var5];
            String var7 = this.m22000(var1.method_61420(var6));
            if (!var7.isEmpty()) {
               var2.i(var7);
            }
         }
      }

      if (var1 instanceof Iface0652 var8 && var8.dataManager().m14000().m10000()) {
         var2.i(this.m26000());
      }

      return var2;
   }

   public boolean m22000(NbK var1) {
      return C1140.m12000()
         .and(C1140.m50000().or(var1x -> var1 instanceof Iface0652 var2 && var2.dataManager().m14000().m10000() ? f7000[2] : f7000[3]))
         .and(C1140.m42000().negate())
         .and(C1140.m28000().negate())
         .and(C1140.m36000().negate())
         .and((C1137)((GuiElement)this.N[f5000[2]]).f8000[f5000[3]])
         .and((C1136)((GuiElement)this.N[f5000[4]]).f8000[f5000[5]])
         .and((C1141)((GuiElement)this.N[f1000[0]]).f5000[f1000[1]])
         .test(var1);
   }

   private String m22000(NQo var1) {
      NNNNug var2 = (NNNNug)var1.y().method_58694(NNNNRZ.y);
      if (var2 == null) {
         return f6000[0];
      } else {
         Optional var3 = (Optional)((MapCodec)f4000[f1000[2]]).codec().parse(NpG.N, var2.y()).getOrThrow();
         if (var3.isPresent()) {
            return this.m8000((String)var3.get());
         } else {
            Optional var4 = (Optional)((MapCodec)f4000[f1000[3]]).codec().parse(NpG.N, var2.y()).getOrThrow();
            if (var4.isPresent()) {
               Optional var5 = (Optional)((MapCodec)f4000[f1000[4]]).codec().parse(NpG.N, ((NNNNug)var4.get()).y()).getOrThrow();
               if (var5.isPresent()) {
                  return this.m8000((String)var5.get());
               }
            }

            return f6000[1];
         }
      }
   }

   public int m24000(Nwn var1) {
      return !var1.method_5767() && !var1.method_21751() ? super.u(var1) : f2000[0];
   }

   private static void m30000() {
      f5000 = new short[]{0, 3, 0, 3, 0, 2};
      f1000 = new short[]{0, 0, 0, 2, 1};
   }

   private String m26000() {
      return NPh.field_1080 + " [" + NPh.field_1061 + "DORMANT" + NPh.field_1080 + "]" + NPh.field_1070;
   }
}
