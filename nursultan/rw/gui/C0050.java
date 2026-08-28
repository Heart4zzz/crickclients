package rw.gui;

import KDFzREm.NCG;
import KDFzREm.NCU;
import KDFzREm.NCa;
import KDFzREm.NCo;
import KDFzREm.NDZ;
import KDFzREm.NDe;
import KDFzREm.NDv;
import KDFzREm.NKi;
import KDFzREm.NNNZg;
import KDFzREm.NNNwS;
import KDFzREm.NNiz;
import KDFzREm.NNuU;
import KDFzREm.NXi;
import KDFzREm.Ned;
import KDFzREm.Neo;
import KDFzREm.Nfd;
import KDFzREm.Nff;
import KDFzREm.Ngq;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.ExecutorService;
import org.joml.Matrix4f;
import rw.GuiWidget;
import rw.NursultanClient;
import rw.api.AnnotationDefault;
import rw.api.Iface0642;
import rw.core.C0011;
import rw.core.C0138;
import rw.core.C0151;
import rw.core.C0811;
import rw.core.C0825;
import rw.core.C0830;
import rw.core.C0831;
import rw.core.C0832;
import rw.core.C0916;
import rw.core.C0991;
import rw.core.C0994;
import rw.core.C1246;
import rw.data.ConfigFiles;
import rw.data.Rec0004;
import rw.data.Rec0179;
import rw.data.Rec0182;
import rw.data.Rec0183;
import rw.defs.Enum0055;
import rw.setting.C0122;
import rw.setting.OlpOtr;

@AnnotationDefault(
   L = "BlockESP",
   y = Enum0055.VISUAL,
   N = Enum0070.WORLD
)
public class C0050 extends GuiWidget {
   private static short[] f1000;
   public static Object[] f2000;
   private static short[] f3000;
   private static boolean[] f4000;
   private static short[] f5000;
   private static short[] f6000;
   private static short[] f7000;
   public Object[] f8000;
   private static short[] f9000;
   private static short[] f10000;
   private static short[] f11000;
   private static boolean[] f12000;
   private static short[] f13000;
   private static boolean[] f14000;
   private static boolean[] f15000;
   private static short[] f16000;
   private static short[] f17000;
   private static boolean[] f18000;
   private static short[] f19000;
   private static boolean[] f20000;
   private static short[] f21000;
   private static short[] f22000;
   private static short[] f23000;
   private static boolean[] f24000;
   private static short[] f25000;
   public Object[] f26000;
   private static short[] f27000;
   private static short[] f28000;
   private static short[] f29000;
   private static boolean[] f30000;
   private static boolean[] f31000;
   private static short[] f32000;
   private static short[] f33000;
   private static short[] f34000;
   private static short[] f35000;
   private static short[] f36000;
   private static short[] f37000;
   private static String[] f38000;
   private static short[] f39000;
   private static short[] f40000;
   private static short[] f41000;
   private static boolean[] f42000;

   private void m4000(long var1) {
      this.m14000();
      Set var3 = (Set)((Map)this.f8000[3]).get(var1);
      if (var3 != null && (NNNZg)((NNuU)this.y[0]).T[3] != null) {
         Map var4 = (Map)this.f8000[0];
         IntArrayList var5 = new IntArrayList();
         IntArrayList var6 = new IntArrayList();
         int var7 = Ngq.N(var1) << 4;
         int var8 = Ngq.y(var1) << 4;
         Iterator var9 = var3.iterator();

         while (var9.hasNext()) {
            Ned var10 = (Ned)var9.next();
            NCa var11 = ((NNNZg)((NNuU)this.y[0]).T[3]).method_8320(var10);
            Rec0182 var12 = (Rec0182)var4.get(var11.i());
            if (var12 == null) {
               var9.remove();
            } else {
               NCU var13 = var11.R((NNNZg)((NNuU)this.y[0]).T[3], var10);
               if (!var13.method_1110()) {
                  int var14 = var10.method_10263() - var7;
                  int var15 = var10.method_10260() - var8;
                  if (NKi.N(var13)) {
                     this.m80000(var6, var14, var10.method_10264(), var15, var12.m4000());
                  } else {
                     this.m54000(var5, var13, var14, var10.method_10264(), var15, var12.m4000());
                  }
               }
            }
         }

         if (var3.isEmpty()) {
            ((Map)this.f8000[3]).remove(var1);
         }

         Rec0183 var21 = new Rec0183(var5.toIntArray(), var6.toIntArray());
         if (var21.m6000()) {
            ((Map)this.f8000[2]).remove(var1);
         } else {
            ((Map)this.f8000[2]).put(var1, var21);
         }

         Boolean var20 = f31000[0];
         this.f8000[5] = var20;
      }
   }

   public void m4000() {
      this.m14000();
      Map var5 = Map.of();
      this.f8000[0] = var5;
      this.m14000();
      this.m88000();
   }

   private static void m6000() {
      f36000 = new short[]{0, 1, 2, 3, 4};
      f17000 = new short[]{7, 0};
      f35000 = new short[]{0, 1, 16384, 1, 0};
      f34000 = new short[]{4, 2};
      f27000 = new short[]{0, 1, 3, 4, 5, 1, 4};
      f16000 = new short[]{2, 3, 5, 4, 2};
      f21000 = new short[]{3, 5, 0, 0, 0, 3, 1, 4};
      f41000 = new short[]{1, 6, 6, 6, 5, 0, 1};
      f23000 = new short[]{0, 4, 7};
      f3000 = new short[]{7, 7, 6, 4, 0, 2, 0};
      f5000 = new short[]{2, 1, 3, 1};
      f37000 = new short[]{3, 1, 0, 0};
      f39000 = new short[]{0, 0, 0, 0};
      f9000 = new short[]{0, 0, 0, 0, 0};
      f25000 = new short[]{2, 5, 1, 3};
      f13000 = new short[]{4, 3};
      f1000 = new short[]{1, 0, 3};
      f40000 = new short[]{0, 3, 0, 3, 0, 0, 3, 0};
      f29000 = new short[]{3, 3, 2, 2, 5};
      f33000 = new short[]{0, 0, 3, 4, 3, 2, 5, 5};
      f22000 = new short[]{7, 0, 1, 2};
      f28000 = new short[]{7, 7, 7, 0};
      f19000 = new short[]{1, 0, 3, 0, 4, 0, 4};
      f10000 = new short[]{0, 7, 0, 3, 4};
      f6000 = new short[]{0, 0};
      f7000 = new short[]{0, 3, 1, 2};
      f11000 = new short[]{5, 2, 5, 1, 4, 3, 3, 4};
      f32000 = new short[]{4, 3, 2, 5};
   }

   public C0050() {
      this.m14000();
      Map var5 = Map.of();
      this.f8000[0] = var5;
      C0991 var6 = (C0991)C0122.m26000(this, f38000[0], false).N((var1, var2) -> this.m8000());
      this.f8000[1] = var6;
      HashMap var7 = new HashMap();
      this.f8000[2] = var7;
      HashMap var8 = new HashMap();
      this.f8000[3] = var8;
      LinkedHashSet var9 = new LinkedHashSet();
      this.f8000[4] = var9;
      NXi var10 = NXi.L;
      this.f8000[7] = var10;
      C0830 var11 = C0830.m42000((Rec0004)C0011.f5000[0], 65536, 0);
      this.f26000[0] = var11;
      C0830 var12 = C0830.m46000((Rec0004)f2000[1], 16384);
      this.f26000[1] = var12;
      C0825 var13 = C0825.m2000().m22000((C1246)C0831.f2000[0]).m16000((OlpOtr)EspMix.f3000[4]).m18000(1).m20000();
      this.f26000[2] = var13;
      C0825 var14 = C0825.m2000().m22000((C1246)C0831.f2000[0]).m16000((OlpOtr)EspMix.f46000[1]).m18000(1).m20000();
      this.f26000[3] = var14;
      Matrix4f var15 = new Matrix4f();
      this.f26000[4] = var15;
   }

   static {
      ntfClinit();
   }

   public boolean m8000() {
      this.m14000();
      Boolean var5 = true;
      this.f8000[5] = var5;
      if (!(Boolean)((C0991)this.f8000[1]).i()) {
         this.m18000();
      }

      return (boolean)1;
   }

   public boolean m10000() {
      this.m14000();
      ((Set)this.f8000[4]).clear();
      ((Map)this.f8000[2]).clear();
      ((Map)this.f8000[3]).clear();
      Boolean var5 = true;
      this.f8000[5] = var5;
      return (boolean)1;
   }

   private void m12000() {
      this.m14000();
      ((Set)this.f8000[4]).removeIf(var1 -> (boolean)(this.m52000(var1) == null ? 1 : 0));
      ((Map)this.f8000[3]).keySet().removeIf(var1 -> (boolean)(this.m52000(var1) == null ? 1 : 0));
      if (((Map)this.f8000[2]).keySet().removeIf(var1 -> (boolean)(this.m52000(var1) == null ? 1 : 0))) {
         Boolean var5 = f31000[2];
         this.f8000[5] = var5;
      }
   }

   private void m14000() {
      this.m14000();
      ((Map)this.f8000[2]).clear();
      Boolean var5 = true;
      this.f8000[5] = var5;
      if ((Boolean)((C0991)this.f8000[1]).i()) {
         List.copyOf(((Map)this.f8000[3]).keySet()).forEach(this::m4000);
      } else {
         this.m18000();
      }
   }

   private void m8000() {
      this.m14000();
      ((Set)this.f8000[4]).clear();
      ((Map)this.f8000[3]).clear();
      this.m14000();
   }

   public Collection<Rec0182> m12000() {
      this.m14000();
      return ((Map)this.f8000[0]).values();
   }

   private void m14000() {
      if (this.f8000 == null) {
         this.f8000 = new Object[8];
         Object[] var1 = this.f8000;
         var1[5] = false;
         var1[6] = 0;
      }

      if (this.f26000 == null) {
         this.f26000 = new Object[5];
         Object[] var2 = this.f26000;
      }
   }

   private static void m16000() {
      f18000 = new boolean[]{false, false};
      f12000 = new boolean[]{true, true, true, true, true};
      f20000 = new boolean[]{true, true, false, true, false};
      f15000 = new boolean[]{true, false, true, true};
      f31000 = new boolean[]{true, false, true};
      f30000 = new boolean[]{false, false};
      f4000 = new boolean[]{true, true, false, false, false, false};
      f24000 = new boolean[]{false, true, true, true, false, true, false};
      f42000 = new boolean[]{true, false, true};
      f14000 = new boolean[]{false, true, true, false, false, false};
   }

   private static void m16000() {
      f2000 = new Object[]{-1, null, 24, 20};
   }

   private void m18000() {
      this.m14000();
      if ((NNNZg)((NNuU)this.y[0]).T[3] != null && (NNNwS)((NNuU)this.y[0]).T[4] != null) {
         Ngq var1 = ((NNNwS)((NNuU)this.y[0]).T[4]).method_31476();
         int var2 = (Integer)((NNiz)((NNuU)this.y[0]).i[7]).i().method_41753() + 1;

         for (int var3 = var1.B - var2; var3 <= var1.B + var2; var3++) {
            for (int var4 = var1.Z - var2; var4 <= var1.Z + var2; var4++) {
               if (((NNNZg)((NNuU)this.y[0]).T[3]).U().y(var3, var4, NDZ.m, false) != null) {
                  ((Set)this.f8000[4]).add(Ngq.u(var3, var4));
               }
            }
         }
      }
   }

   private void m24000(NDv var1) {
      this.m14000();
      Map var2 = (Map)this.f8000[0];
      IntArrayList var3 = new IntArrayList();
      IntArrayList var4 = new IntArrayList();
      Ngq var5 = var1.R();
      NDe[] var6 = var1.u();
      Neo var7 = new Neo();

      for (int var8 = 0; var8 < var6.length; var8++) {
         NDe var9 = var6[var8];
         if (!var9.L() && var9.N(var1x -> var2.containsKey(var1x.i()))) {
            int var10 = var1.method_31604(var8) << 4;

            for (int var11 = 0; var11 < 16; var11++) {
               for (int var12 = 0; var12 < 16; var12++) {
                  for (int var13 = 0; var13 < 16; var13++) {
                     NCa var14 = var9.N(var13, var11, var12);
                     Rec0182 var15 = (Rec0182)var2.get(var14.i());
                     if (var15 != null) {
                        var7.N(var5.i() + var13, var10 + var11, var5.R() + var12);
                        NCU var16 = var14.R(var1, var7);
                        if (!var16.method_1110()) {
                           if (NKi.N(var16)) {
                              this.m80000(var4, var13, var10 + var11, var12, var15.m4000());
                           } else {
                              this.m54000(var3, var16, var13, var10 + var11, var12, var15.m4000());
                           }
                        }
                     }
                  }
               }
            }
         }
      }

      long var17 = var5.y();
      Rec0183 var18 = new Rec0183(var3.toIntArray(), var4.toIntArray());
      ((NNuU)this.y[0]).execute(() -> this.m66000(var17, var18));
   }

   private void m28000(Nff var1) {
      this.m14000();
      if (!(Boolean)((C0991)this.f8000[1]).i()) {
         var1.N((var1x, var2x) -> {
            this.m14000();
            ((Set)this.f8000[4]).add(Ngq.N(var1x));
         });
      } else if ((NNNZg)((NNuU)this.y[0]).T[3] != null) {
         Map var2 = (Map)this.f8000[0];
         LinkedHashSet var3 = new LinkedHashSet();
         var1.N((var3x, var4) -> {
            this.m14000();
            long var5 = Ngq.N(var3x);
            if (var2.containsKey(var4.i())) {
               ((Map)this.f8000[3]).computeIfAbsent(var5, var0 -> new HashSet<>()).add(var3x.method_10062());
               var3.add(var5);
            } else {
               Set var7 = (Set)((Map)this.f8000[3]).get(var5);
               if (var7 != null && var7.remove(var3x)) {
                  var3.add(var5);
               }
            }
         });
         var3.forEach(this::m4000);
      }
   }

   public Rec0182 m30000(NKi var1) {
      this.m14000();
      return (Rec0182)((Map)this.f8000[0]).get(var1);
   }

   private void m34000(long var1) {
      ((NNuU)this.y[0]).execute(() -> {
         this.m14000();
         if (!(Boolean)((C0991)this.f8000[1]).i()) {
            ((Set)this.f8000[4]).add(var1);
         }
      });
   }

   public void m36000(Collection<Rec0182> var1) {
      this.m14000();
      LinkedHashMap var2 = new LinkedHashMap();
      var1.forEach(var1x -> var2.put(((Rec0182)var1x).m6000(), var1x));
      Map var7 = Collections.unmodifiableMap(var2);
      this.f8000[0] = var7;
      this.m14000();
   }

   public boolean m38000(NKi var1) {
      this.m14000();
      if (!((Map)this.f8000[0]).containsKey(var1)) {
         return (boolean)0;
      } else {
         LinkedHashMap var2 = new LinkedHashMap((Map)this.f8000[0]);
         var2.remove(var1);
         Map var7 = Collections.unmodifiableMap(var2);
         this.f8000[0] = var7;
         this.m14000();
         this.m88000();
         return (boolean)1;
      }
   }

   private void m48000(NXi var1) {
      this.m14000();
      Boolean var15 = false;
      this.f8000[5] = var15;
      this.f8000[7] = var1;
      C0811 var2 = ((C0830)this.f26000[0]).m6000();
      C0811 var3 = ((C0830)this.f26000[1]).m6000();
      var2.m34000();
      var3.m34000();

      for (Entry var5 : ((Map)this.f8000[2]).entrySet()) {
         long var6 = (Long)var5.getKey();
         float var8 = (float)((Ngq.N(var6) << 4) - ((NXi)this.f8000[7]).M);
         float var9 = (float)(-((NXi)this.f8000[7]).B);
         float var10 = (float)((Ngq.y(var6) << 4) - ((NXi)this.f8000[7]).Z);
         this.m50000(var2, ((Rec0183)var5.getValue()).m8000(), var8, var9, var10);
         this.m50000(var3, ((Rec0183)var5.getValue()).m12000(), var8, var9, var10);
      }

      ((C0830)this.f26000[0]).m54000(var2, 35048);
      ((C0830)this.f26000[1]).m54000(var3, 35048);
   }

   private void m50000(C0811 var1, int[] var2, float var3, float var4, float var5) {
      for (byte var6 = 0; var6 < var2.length; var6 += 4) {
         var1.m30000(Float.intBitsToFloat(var2[var6]) + var3)
            .m30000(Float.intBitsToFloat(var2[var6 + 1]) + var4)
            .m30000(Float.intBitsToFloat(var2[var6 + 2]) + var5)
            .m36000(var2[var6 + 3]);
         var1.m28000();
      }
   }

   private NDv m52000(long var1) {
      return ((NNNZg)((NNuU)this.y[0]).T[3]).U().y(Ngq.N(var1), Ngq.y(var1), NDZ.m, f31000[1]);
   }

   private void m54000(IntArrayList var1, NCU var2, int var3, int var4, int var5, int var6) {
      var2.method_1104((var6x, var8, var10, var12, var14, var16) -> {
         this.m80000(var1, var3 + var6x, var4 + var8, var5 + var10, var6);
         this.m80000(var1, var3 + var12, var4 + var14, var5 + var16, var6);
      });
   }

   public void m58000(Collection<Rec0182> var1) {
      this.m14000();
      LinkedHashMap var2 = new LinkedHashMap((Map)this.f8000[0]);
      var1.forEach(var1x -> var2.put(var1x.m6000(), var1x));
      Map var7 = Collections.unmodifiableMap(var2);
      this.f8000[0] = var7;
      this.m14000();
      this.m88000();
   }

   @Iface0642
   public void m60000(C0151 var1) {
      this.m14000();
      ((Set)this.f8000[4]).clear();
      ((Map)this.f8000[2]).clear();
      ((Map)this.f8000[3]).clear();
      Boolean var6 = true;
      this.f8000[5] = var6;
   }

   private void m66000(long var1, Rec0183 var3) {
      this.m14000();
      if (this.U() && (NNNZg)((NNuU)this.y[0]).T[3] != null && !(Boolean)((C0991)this.f8000[1]).i()) {
         if (var3.m6000()) {
            if (((Map)this.f8000[2]).remove(var1) != null) {
               Boolean var8 = true;
               this.f8000[5] = var8;
            }
         } else {
            ((Map)this.f8000[2]).put(var1, var3);
            Boolean var9 = true;
            this.f8000[5] = var9;
         }
      }
   }

   public void m70000(Rec0182 var1) {
      this.m14000();
      LinkedHashMap var2 = new LinkedHashMap((Map)this.f8000[0]);
      var2.put(var1.m6000(), var1);
      Map var7 = Collections.unmodifiableMap(var2);
      this.f8000[0] = var7;
      this.m14000();
      this.m88000();
   }

   @Iface0642
   public void m76000(Rec0179 var1) {
      switch (var1.m4000()) {
         case NCo var4:
            this.m34000(Ngq.u(var4.N(), var4.y()));
            break;
         case Nfd var5:
            this.m34000(Ngq.N(var5.y()));
            break;
         case Nff var6:
            ((NNuU)this.y[0]).execute(() -> this.m28000(var6));
            break;
         case NCG var7:
            ((NNuU)this.y[0]).execute(() -> {
               this.m14000();
               long var2 = var7.N().y();
               ((Set)this.f8000[4]).remove(var2);
               ((Map)this.f8000[3]).remove(var2);
               if (((Map)this.f8000[2]).remove(var2) != null) {
                  Boolean var8 = true;
                  this.f8000[5] = var8;
               }
            });
            break;
         default:
      }
   }

   @Iface0642
   public void m78000(C0138 var1) {
      this.m14000();
      NXi var2 = var1.m24000().y();
      if ((Boolean)this.f8000[5]) {
         this.m48000(var2);
      }

      if (!((C0830)this.f26000[0]).m12000() || !((C0830)this.f26000[1]).m12000()) {
         IlkOns.m94000(((NNuU)this.y[0]).e(), (boolean)1);
         ((Matrix4f)this.f26000[4])
            .set(var1.m26000())
            .translate((float)(((NXi)this.f8000[7]).M - var2.M), (float)(((NXi)this.f8000[7]).B - var2.B), (float)(((NXi)this.f8000[7]).Z - var2.Z));
         ((C0832)IlkOns.f24000[6]).m18000(var1.m12000(), (Matrix4f)this.f26000[4]);
         if (!((C0830)this.f26000[0]).m12000()) {
            ((C0825)this.f26000[2]).m20000();
            ((C0830)this.f26000[0]).m56000(((C0825)this.f26000[2]).m12000());
         }

         if (!((C0830)this.f26000[1]).m12000()) {
            ((C0825)this.f26000[3]).m20000();
            ((C0830)this.f26000[1]).m44000(((C0825)this.f26000[3]).m12000(), 24, ((C0830)this.f26000[1]).m32000());
         }
      }
   }

   private void m80000(IntArrayList var1, double var2, double var4, double var6, int var8) {
      var1.add(Float.floatToRawIntBits((float)var2));
      var1.add(Float.floatToRawIntBits((float)var4));
      var1.add(Float.floatToRawIntBits((float)var6));
      var1.add(var8);
   }

   @Iface0642
   public void m82000(C0916 var1) {
      this.m14000();
      if ((NNNZg)((NNuU)this.y[0]).T[3] != null) {
         if (!(Boolean)((C0991)this.f8000[1]).i()) {
            Iterator var2 = ((Set)this.f8000[4]).iterator();

            while (var2.hasNext()) {
               long var3 = (Long)var2.next();
               NDv var5 = this.m52000(var3);
               if (var5 != null) {
                  var2.remove();
                  ((ExecutorService)NursultanClient.f13000[1]).execute(() -> this.m24000(var5));
               }
            }
         }

         int var10002 = (Integer)this.f8000[6] + 1;
         Integer var10 = var10002;
         this.f8000[6] = var10;
         if (var10002 >= 20) {
            Integer var11 = 0;
            this.f8000[6] = var11;
            this.m12000();
         }
      }
   }

   private static void m86000() {
      f38000 = new String[]{"delta-mode"};
   }

   private void m88000() {
      ConfigFiles.m54000(C0994.class);
   }
}
