package rw.setting;

import KDFzREm.NAB;
import KDFzREm.NAN;
import KDFzREm.NAd;
import KDFzREm.NNNP;
import KDFzREm.NNNZg;
import KDFzREm.NNNwS;
import KDFzREm.NNNwz;
import KDFzREm.NNag;
import KDFzREm.NNuU;
import KDFzREm.NPh;
import KDFzREm.NQa;
import KDFzREm.NQo;
import KDFzREm.NQr;
import KDFzREm.NSa;
import KDFzREm.NbL;
import KDFzREm.Nwn;
import java.util.WeakHashMap;
import rw.NursultanClient;
import rw.core.Base1039;
import rw.core.C0923;
import rw.core.C1189;
import rw.core.C1193;
import rw.core.C1235;
import rw.data.Rec0207;
import rw.data.Rec0225;
import rw.gui.UseTracker;
import rw.module.AutoAccept;

public class OlkqtOti extends Base1039 {
   private static short[] f1000;
   private static String[] f2000;
   private static short[] f3000;
   public Object[] f4000;
   public static Object[] f5000;

   private static void m6000() {
      f5000 = new Object[]{8, (byte)1, (byte)0, (byte)3, (byte)2};
   }

   public OlkqtOti(UseTracker var1, String var2, boolean var3) {
      super(var1, var2, var3);
      this.m8000();
      WeakHashMap var8 = new WeakHashMap();
      this.f4000[f3000[0]] = var8;
   }

   static {
      ntfClinit();
   }

   private void m8000() {
      if (this.f4000 == null) {
         this.f4000 = new Object[1];
         Object[] var1 = this.f4000;
      }
   }

   private static void m2000() {
      f2000 = new String[]{" ", "", " ", "food-used"};
   }

   // $VF: One or more variable merging failures!
   // $VF: Could not properly define all variable types!
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void m18000(Object var1) {
      this.m8000();
      switch (var1) {
         case C0923 var4:
            if (var4.m14000() instanceof Nwn var17) {
               ((WeakHashMap)this.f4000[f3000[1]]).remove(var17);
            }
            break;
         case AutoAccept var5:
            label73: {
               if (!(var5.m6000() instanceof NSa var8)) {
                  return;
               }

               NSa var10000 = var8;

               try {
                  var24 = var10000.N();
               } catch (Throwable var16) {
                  throw new MatchException(var16.toString(), var16);
               }

               int var10 = var24;
               var10000 = var8;

               try {
                  var10000.y();
               } catch (Throwable var15) {
                  throw new MatchException(var15.toString(), var15);
               }

               if ((NNNwS)((NNuU)this.N[f3000[2]]).T[f3000[3]] == null
                  || ((NNNwS)((NNuU)this.N[f3000[4]]).T[f3000[5]]).method_5628() == var10
                  || !(((NNNZg)((NNuU)this.N[f3000[6]]).T[3]).method_8469(var10) instanceof NNNwz var19)) {
                  return;
               }

               int var21 = NursultanClient.m74000().m10000();
               Rec0225 var23 = (Rec0225)((WeakHashMap)this.f4000[0]).get(var19);

               <unknown> var7;
               for (NNNP var12 : var7_1) {
                  if (var12.N() == 8) {
                     byte var13 = (Byte)var12.L();
                     if (var23 != null) {
                        int var14 = var21 - var23.f1000 >= 32 ? 1 : 0;
                        if (var14 != 0) {
                           this.m22000(var19, var23, var13);
                        } else {
                           ((WeakHashMap)this.f4000[0]).remove(var19);
                        }
                     }

                     this.m30000(var19, var13, var21);
                  }
               }
               break label73;
            }
         case null:
         default:
      }
   }

   private boolean m20000(NQo var1) {
      return (boolean)(!C1193.m22000(var1) && !(var1.B() instanceof NQr) && var1.B() != NQa.jT ? 1 : 0);
   }

   private void m22000(NNNwz var1, Rec0225 var2, byte var3) {
      this.m8000();

      for (NbL var7 : NbL.values()) {
         NQo var8 = var1.method_5998(var7);
         NQo var9 = var2.f2000;
         int var10 = var8.B() == NQa.nP && !this.m20000(var9) ? 0 : 1;
         if (var10 == 0 || !this.m20000(var8)) {
            if (var10 == 0) {
               var8 = var9;
            }

            if (var3 == (var7 == NbL.field_5808 ? 0 : 2)) {
               NQo var11 = var8;
               C1189.m22000(() -> this.m26000(var1, var11));
               ((WeakHashMap)this.f4000[0]).remove(var1);
               break;
            }
         }
      }
   }

   private static void m6000() {
      f3000 = new short[]{0, 0, 0, 4, 0, 4, 0};
      f1000 = new short[]{3, 0, 0, 0, 0, 0};
   }

   private void m26000(Nwn var1, NQo var2) {
      NAB var3 = new NAB(var2);
      NNag var4 = var1.method_5476().L();
      NAN var5 = var2.B() instanceof NQr ? var2.k() : var2.Y();
      Object var6 = NPh.N(var4.getString()).endsWith(f2000[0]) ? f2000[1] : f2000[2];
      NNag var7 = var4.i(NPh.field_1080 + var6 + C1235.m36000(f2000[3]) + " ").y(var5).y(NAd.N.N(var3));
      C0106.m52000(new Rec0207((UseTracker)this.u[0]), var7);
   }

   private void m30000(NNNwz var1, byte var2, int var3) {
      this.m8000();

      for (NbL var7 : NbL.values()) {
         NQo var8 = var1.method_5998(var7);
         if (!this.m20000(var8) && var2 == (var7 == NbL.field_5808 ? 1 : 3)) {
            ((WeakHashMap)this.f4000[0]).put(var1, new Rec0225(var3, var8));
            break;
         }
      }
   }
}
