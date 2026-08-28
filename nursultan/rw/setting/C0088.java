package rw.setting;

import KDFzREm.Fo;
import KDFzREm.NCM;
import KDFzREm.NCz;
import KDFzREm.NDP;
import KDFzREm.NNNZZ;
import KDFzREm.NNNZg;
import KDFzREm.NNNwS;
import KDFzREm.NNnq;
import KDFzREm.NNuU;
import KDFzREm.NQa;
import KDFzREm.NQo;
import KDFzREm.NbL;
import KDFzREm.Nkq;
import KDFzREm.Nrm;
import KDFzREm.Nxl;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.regex.Pattern;
import rw.api.Iface0648;
import rw.core.Base0786;
import rw.core.C0721;
import rw.core.C0892;
import rw.core.C0983;
import rw.core.C0989;
import rw.core.IljlItp;
import rw.core.OlqIlmnt;
import rw.gui.AutoJoin;
import rw.module.AutoAccept;

public class C0088 extends Base0786 implements Iface0648<AutoJoin> {
   private static short[] f1000;
   private static short[] f2000;
   private static String[] f3000;
   private static short[] f4000;
   private static short[] f5000;
   private static short[] f6000;
   public Object[] f7000;

   private boolean m2000(String var1) {
      this.m8000();
      String var2 = "#" + ((OlqIlmnt)this.f7000[0]).m4000();
      int var3 = var1.indexOf(var2);

      while (var3 != -1) {
         int var4 = var3 + var2.length();
         if (var4 >= var1.length() || !Character.isDigit(var1.charAt(var4))) {
            return (boolean)1;
         }

         var3 = var1.indexOf(var2, var4);
      }

      return (boolean)0;
   }

   private void m6000() {
      int var1 = IljlItp.m60000(NQa.jJ);
      if (!IljlItp.m36000(var1)) {
         C0892.m18000(var1);
         C0983 var2 = C0989.m28000();
         ((NNNZZ)((NNuU)this.N[0]).T[2]).N((NNNZg)((NNuU)this.N[0]).T[3], var1x -> new Nrm(NbL.field_5808, var1x, var0.m38000(), var0.m68000()));
      }
   }

   public C0088(AutoJoin var1, String var2, boolean var3) {
      super(var1, var2, var3);
      this.m8000();
   }

   static {
      ntfClinit();
   }

   private void m8000() {
      if (this.f7000 == null) {
         this.f7000 = new Object[6];
         Object[] var1 = this.f7000;
         var1[1] = (short)0;
         var1[2] = 0;
         var1[3] = 0;
         var1[4] = 0;
      }
   }

   private void m12000() {
      this.m8000();
      Integer var5 = 0;
      this.f7000[f5000[0]] = var5;
      Short var6 = Short.valueOf((short)-1);
      this.f7000[f5000[1]] = var6;
      Integer var7 = -1;
      this.f7000[f5000[2]] = var7;
      Integer var8 = -1;
      this.f7000[f5000[3]] = var8;
      Object var9 = null;
      this.f7000[f5000[4]] = var9;
   }

   private static void m2000() {
      f3000 = new String[]{"grief", "1", "^[1-9]\\d{0,18}$", "ГРИФЕРСКОЕ ВЫЖИВАНИЕ"};
   }

   public void m20000(Object var1) {
      this.m8000();
      if (var1 instanceof C0721) {
         Integer var14 = (Integer)this.f7000[4] - 1;
         this.f7000[4] = var14;
         if ((Fo)this.f7000[5] != null) {
            if ((Integer)this.f7000[4] < 0) {
               Int2ObjectOpenHashMap var3 = new Int2ObjectOpenHashMap();
               var3.put((Short)this.f7000[1], (Fo)this.f7000[5]);
               C0160.m74000(new NDP((Integer)this.f7000[2], (Integer)this.f7000[3], (Short)this.f7000[1], (byte)0, Nkq.field_7790, var3, (Fo)this.f7000[5]));
               Integer var15 = 40;
               this.f7000[4] = var15;
            }
         } else {
            this.m6000();
         }
      } else if (var1 instanceof AutoAccept var2) {
         switch (var2.m6000()) {
            case NCz var6:
               ((NNuU)this.N[0]).execute(() -> {
                  this.m8000();
                  if ((NNNwS)((NNuU)this.N[f5000[6]]).T[f5000[7]] != null && ((NNuU)this.N[0]).NE() != null) {
                     List var2x = var6.L();

                     for (int var3x = 0; var3x < var2x.size(); var3x++) {
                        NQo var4 = (NQo)var2x.get(var3x);
                        String var5 = var4.d().getString();
                        int var6x = var6.N();
                        int var7x = var6.y();
                        if (var5.contains(f3000[3])) {
                           Fo var8x = Fo.y((NQo)var2x.get(var3x), ((NNuU)this.N[0]).NE().Q());
                           Int2ObjectOpenHashMap var9x = new Int2ObjectOpenHashMap();
                           var9x.put(var3x, var8x);
                           C0160.m74000(new NDP(var6x, var7x, (short)var3x, (byte)0, Nkq.field_7790, var9x, var8x));
                           break;
                        }

                        if (this.m2000(var5)) {
                           Integer var14x = var6x;
                           this.f7000[2] = var14x;
                           Integer var15x = var7x;
                           this.f7000[3] = var15x;
                           Short var16 = (short)var3x;
                           this.f7000[1] = var16;
                           Fo var17 = Fo.y((NQo)var2x.get(var3x), ((NNuU)this.N[0]).NE().Q());
                           this.f7000[5] = var17;
                           break;
                        }
                     }
                  }
               });
               break;
            case NNnq var7:
               var2.N();
               break;
            case NCM var8:
               this.m12000();
               var2.N();
               break;
            case Nxl var9:
               ((NNuU)this.N[0]).execute(() -> ((AutoJoin)this.y[f5000[5]]).N((boolean)0));
               break;
            case null:
            default:
         }
      }
   }

   public void m6000() {
      this.m12000();
   }

   public void m30000(AutoJoin var1) {
      this.m8000();
      OlqIlmnt var6 = (OlqIlmnt)C0122.m8000(var1, f3000[0], f3000[1], Pattern.compile(f3000[2])).N(var1x -> this.U());
      this.f7000[0] = var6;
   }

   private static void m36000() {
      f4000 = new short[]{4, 4, 5, 4, 1, 5, 2, 3};
      f2000 = new short[]{1, 5, 4, 0, 0, 0, 0};
      f6000 = new short[]{0, 2, 0, 3};
      f5000 = new short[]{4, 1, 2, 3, 5, 0, 0, 4};
      f1000 = new short[]{0, 0, 2, 3, 1, 0, 5};
   }

   @Override
   public void b_() {
      this.m12000();
      super.b_();
   }
}
