package rw.gui;

import KDFzREm.NAN;
import KDFzREm.NNAf;
import KDFzREm.NNBj;
import java.io.IOException;
import java.io.InputStream;
import java.io.UncheckedIOException;
import rw.api.Iface0005;
import rw.core.C0028;
import rw.core.C0033;
import rw.core.C0039;
import rw.core.IlqOtnm;
import rw.core.IlqjIsOik;
import rw.defs.OlmmOsl;

public class ZwBs {
   private static short[] f1000;
   private static short[] f2000;
   private static String[] f3000;
   private static short[] f4000;
   private static short[] f5000;
   private static short[] f6000;
   private static short[] f7000;
   private static float[] f8000;
   private static short[] f9000;
   private static short[] f10000;
   private static short[] f11000;
   private static short[] f12000;
   private static short[] f13000;
   private static short[] f14000;
   private static float[] f15000;
   private static float[] f16000;
   private static short[] f17000;
   private static short[] f18000;
   public Object[] f19000;
   public static Object[] f20000;
   private static short[] f21000;
   private static short[] f22000;
   private static short[] f23000;
   private static short[] f24000;
   private static short[] f25000;
   private static short[] f26000;
   private static short[] f27000;
   private static float[] f28000;
   private static float[] f29000;
   private static short[] f30000;
   public Object[] f31000;
   private static short[] f32000;
   public Object[] f33000;

   public int m2000(int var1) {
      return ((C0003)this.f31000[4]).m2000(var1);
   }

   public void m4000() {
      if ((NAN)this.f19000[3] != null && !((NAN)this.f19000[3]).getString().isEmpty()) {
         ((C0039)this.f31000[5])
            .m66000(
               ((NAN)this.f19000[3]).method_30937(),
               (Float)this.f33000[1],
               (Float)this.f33000[2],
               (byte)((Float)this.f19000[4]).floatValue(),
               (OlmmOsl)this.f19000[5],
               (Boolean)this.f33000[5],
               (Integer)this.f19000[6],
               (Integer)this.f33000[0],
               (Integer)this.f33000[3],
               (byte)((Float)this.f33000[4]).floatValue()
            );
         this.m12000();
      } else {
         if ((String)this.f19000[2] != null && !((String)this.f19000[2]).isEmpty()) {
            ((C0039)this.f31000[5])
               .m46000(
                  (String)this.f19000[2],
                  (Float)this.f33000[1],
                  (Float)this.f33000[2],
                  (byte)((Float)this.f19000[4]).floatValue(),
                  (OlmmOsl)this.f19000[5],
                  (Boolean)this.f33000[5],
                  (Integer)this.f19000[6],
                  (Integer)this.f33000[0],
                  (Integer)this.f33000[3],
                  (byte)((Float)this.f33000[4]).floatValue()
               );
         }

         this.m12000();
      }
   }

   public float m6000(NAN var1) {
      return this.m64000(var1, (Float)this.f19000[4], (OlmmOsl)this.f19000[5], (Boolean)this.f33000[5]);
   }

   public float m8000(String var1) {
      return this.m92000(var1, (Float)this.f19000[4], (OlmmOsl)this.f19000[5], (Boolean)this.f33000[5]);
   }

   public ZwBs m10000(float var1) {
      Float var6 = var1;
      this.f33000[1] = var6;
      return this;
   }

   private void m12000() {
      String var5 = f3000[1];
      this.f19000[2] = var5;
      Object var6 = null;
      this.f19000[3] = var6;
      Float var7 = f15000[0];
      this.f19000[4] = var7;
      OlmmOsl var8 = (OlmmOsl)OlmmOsl.f7000[3];
      this.f19000[5] = var8;
      Boolean var9 = false;
      this.f33000[5] = var9;
      Integer var10 = -1;
      this.f19000[6] = var10;
      Integer var11 = 0;
      this.f33000[0] = var11;
      Float var12 = f15000[1];
      this.f33000[1] = var12;
      Float var13 = f15000[2];
      this.f33000[2] = var13;
      Integer var14 = 0;
      this.f33000[3] = var14;
      Float var15 = f15000[3];
      this.f33000[4] = var15;
   }

   public ZwBs(String var1, C0003 var2, NNBj var3) {
      this.m110000();
      IlqOtnm var8 = new IlqOtnm();
      this.f31000[0] = var8;
      rw.core.C0017 var9 = new rw.core.C0017();
      this.f31000[1] = var9;
      C0028 var10 = new C0028();
      this.f31000[2] = var10;
      C0033 var11 = new C0033();
      this.f31000[3] = var11;
      this.f19000[1] = var1;
      this.f31000[4] = var2;
      C0039 var14 = new C0039();
      this.f31000[5] = var14;
      IlqjIsOik var15 = new IlqjIsOik(var2, var1, m78000(var3));
      this.f19000[0] = var15;
      this.m12000();
   }

   static {
      ntfClinit();
   }

   public boolean m16000(Object var1) {
      if (var1 == this) {
         return (boolean)1;
      } else if (!(var1 instanceof ZwBs var2)) {
         return (boolean)0;
      } else {
         String var3 = (String)this.f19000[1];
         String var4 = (String)var2.f19000[1];
         return (boolean)((var3 == null ? var4 == null : var3.equals(var4)) ? 1 : 0);
      }
   }

   @Override
   public int hashCode() {
      byte var1 = 59;
      byte var2 = 1;
      String var3 = (String)this.f19000[1];
      return var2 * 59 + (var3 == null ? 43 : var3.hashCode());
   }

   private static void m20000() {
      f20000 = new Object[]{10, 9, 13, 32, 4};
   }

   private static void m22000() {
      f28000 = new float[]{1.0F, 1.0F};
      f8000 = new float[]{0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F};
      f29000 = new float[]{0.0F, 0.0F, 1.0F, 0.0F, 0.0F};
      f16000 = new float[]{1.0F, 0.0F, 0.0F};
      f15000 = new float[]{12.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F};
   }

   public ZwBs m28000(int var1) {
      Integer var6 = var1;
      this.f19000[6] = var6;
      return this;
   }

   private static void m30000() {
      f32000 = new short[]{0, 1, 2, 3};
      f25000 = new short[]{1, 4, 5, 0, 1, 2};
      f9000 = new short[]{5, 3};
      f18000 = new short[]{3, 5, 3, 1};
      f13000 = new short[]{2, 4, 5, 5, 6};
      f2000 = new short[]{0, 3, 4, 2, 2, 5, 2, 1};
      f14000 = new short[]{2, 4, 5, 5, 6, 0, 3, 4};
      f27000 = new short[]{3, 3, 1, 5, 4, 3, 1};
      f23000 = new short[]{2, 6, 2, 2};
      f7000 = new short[]{1, 5, 4, 2, 1, 2};
      f17000 = new short[]{6, 1};
      f21000 = new short[]{1, 1};
      f5000 = new short[]{4, 4, 4, 4, 5};
      f4000 = new short[]{0, 3, 4, 5, 5, 4, 5};
      f6000 = new short[]{5, 4, 5, 5, 4, 5};
      f22000 = new short[]{5, 0};
      f12000 = new short[]{0, 0};
      f10000 = new short[]{3, 2, 2, 3};
      f24000 = new short[]{3, 3, 2, 2};
      f30000 = new short[]{3, 3, 2, 3, 4, 3};
      f26000 = new short[]{5, 5, 6, 0, 1};
      f1000 = new short[]{2, 3, 4, 1, 1, 1, 2, 3};
      f11000 = new short[]{4, 5, 6, 0, 1, 2, 3, 4};
   }

   private static void m36000() {
      f3000 = new String[]{"Failed to read font resource", ""};
   }

   public ZwBs m40000(float var1) {
      Float var6 = var1;
      this.f33000[4] = var6;
      return this;
   }

   public int m44000(int var1) {
      return ((C0003)this.f31000[4]).m56000(var1);
   }

   public void m46000() {
      ((C0003)this.f31000[4]).m44000();
   }

   public C0001 m48000(OlmmOsl var1) {
      return ((IlqjIsOik)this.f19000[0]).m16000(var1 == null ? (OlmmOsl)OlmmOsl.f7000[3] : var1);
   }

   public ZwBs m50000(int var1) {
      Integer var6 = var1;
      this.f33000[3] = var6;
      return this;
   }

   public void m52000() {
      ((C0039)this.f31000[5]).m50000(this);
   }

   public ZwBs m54000(NAN var1) {
      this.f19000[3] = var1;
      return this;
   }

   public float m56000(String var1, float var2, OlmmOsl var3, boolean var4) {
      return var1 != null && !var1.isEmpty() ? this.m74000(this.m48000(var3), var2, var1) : f8000[3];
   }

   public ZwBs m58000(float var1) {
      Float var6 = var1;
      this.f33000[2] = var6;
      return this;
   }

   private static float m60000(float var0, float var1) {
      float var2 = var1 > f8000[0] ? var1 : f8000[1];
      return Math.max(f8000[2], (float)Math.round(var0 * var2));
   }

   public ZwBs m62000(String var1) {
      this.f19000[2] = var1;
      return this;
   }

   public float m64000(NAN var1, float var2, OlmmOsl var3, boolean var4) {
      if (var1 == null) {
         return f8000[4];
      } else {
         String var5 = var1.getString();
         return var5.isEmpty() ? f8000[5] : this.m100000(this.m48000(var3), var2, var1.method_30937());
      }
   }

   public boolean m70000(String var1, float var2, float var3, float var4, float var5, OlmmOsl var6, boolean var7, int var8, Iface0005 var9) {
      if (var1 != null && !var1.isEmpty()) {
         float var10 = m60000(var4, var5);
         return ((rw.core.C0017)this.f31000[1]).m20000(this.m48000(var6), var10, var5, var1, var2, var3, var8, var9);
      } else {
         return (boolean)1;
      }
   }

   public float m72000(float var1, OlmmOsl var2, boolean var3, int var4) {
      return this.m48000(var2).m58000(var4, var1);
   }

   private float m74000(C0001 var1, float var2, String var3) {
      ((C0033)this.f31000[3]).m24000((C0028)this.f31000[2]);
      ((C0028)this.f31000[2]).m30000(var1, var2, f29000[2], var3, f29000[3], f29000[4], (C0033)this.f31000[3]);
      return ((C0033)this.f31000[3]).m4000();
   }

   public float m76000(float var1, OlmmOsl var2, boolean var3) {
      return this.m48000(var2).m64000(var1);
   }

   private static byte[] m78000(NNBj var0) {
      try {
         byte[] var2;
         try (InputStream var1 = var0.method_14482()) {
            var2 = var1.readAllBytes();
         }

         return var2;
      } catch (IOException var6) {
         throw new UncheckedIOException(f3000[0], var6);
      }
   }

   public float m80000(NAN var1) {
      return this.m84000(var1, (Float)this.f19000[4], (OlmmOsl)this.f19000[5], (Boolean)this.f33000[5]);
   }

   public ZwBs m82000() {
      Boolean var5 = true;
      this.f33000[5] = var5;
      return this;
   }

   public float m84000(NAN var1, float var2, OlmmOsl var3, boolean var4) {
      if (var1 != null && !var1.getString().isEmpty()) {
         ((IlqOtnm)this.f31000[0]).m20000(this.m48000(var3).m64000(var2));
         var1.method_30937().accept((IlqOtnm)this.f31000[0]);
         return ((IlqOtnm)this.f31000[0]).m4000();
      } else {
         return f29000[1];
      }
   }

   public ZwBs m86000(float var1, float var2) {
      Float var7 = var1;
      this.f33000[1] = var7;
      Float var8 = var2;
      this.f33000[2] = var8;
      return this;
   }

   public void m88000(NAN var1, float var2, float var3, float var4, float var5, OlmmOsl var6, boolean var7, int var8, Iface0005 var9) {
      if (var1 != null && !var1.getString().isEmpty()) {
         float var10 = m60000(var4, var5);
         ((rw.core.C0017)this.f31000[1]).m26000(this.m48000(var6), var10, var5, var1.method_30937(), var2, var3, var8, var9);
      }
   }

   public float m90000(float var1, OlmmOsl var2, boolean var3, int var4, int var5) {
      return this.m48000(var2).m66000(var4, var5, var1);
   }

   public float m92000(String var1, float var2, OlmmOsl var3, boolean var4) {
      if (var1 != null && !var1.isEmpty()) {
         int var5 = 1;
         int var6 = 0;

         while (var6 < var1.length()) {
            int var7 = var1.codePointAt(var6);
            var6 += Character.charCount(var7);
            if (var7 == 10) {
               var5++;
            }
         }

         return var5 * this.m48000(var3).m64000(var2);
      } else {
         return f29000[0];
      }
   }

   public void m94000(NNAf var1, float var2, float var3, float var4, float var5, OlmmOsl var6, boolean var7, int var8, Iface0005 var9) {
      if (var1 != null) {
         float var10 = m60000(var4, var5);
         ((rw.core.C0017)this.f31000[1]).m26000(this.m48000(var6), var10, var5, var1, var2, var3, var8, var9);
      }
   }

   public void m96000(Iface0005 var1) {
      if ((NAN)this.f19000[f27000[0]] != null && !((NAN)this.f19000[f27000[1]]).getString().isEmpty()) {
         ((rw.core.C0017)this.f31000[f27000[2]])
            .m26000(
               this.m48000((OlmmOsl)this.f19000[f27000[3]]),
               (Float)this.f19000[f27000[4]],
               f28000[0],
               ((NAN)this.f19000[f27000[5]]).method_30937(),
               (Float)this.f33000[f27000[6]],
               (Float)this.f33000[2],
               (Integer)this.f19000[6],
               var1
            );
         this.m12000();
      } else {
         if ((String)this.f19000[2] != null && !((String)this.f19000[2]).isEmpty()) {
            ((rw.core.C0017)this.f31000[1])
               .m20000(
                  this.m48000((OlmmOsl)this.f19000[5]),
                  (Float)this.f19000[4],
                  f28000[1],
                  (String)this.f19000[2],
                  (Float)this.f33000[1],
                  (Float)this.f33000[2],
                  (Integer)this.f19000[6],
                  var1
               );
         }

         this.m12000();
      }
   }

   public ZwBs m98000(OlmmOsl var1) {
      this.f19000[5] = var1;
      return this;
   }

   private float m100000(C0001 var1, float var2, NNAf var3) {
      ((C0033)this.f31000[3]).m24000((C0028)this.f31000[2]);
      ((C0028)this.f31000[2]).m34000(var1, var2, f16000[0], var3, f16000[1], f16000[2], (C0033)this.f31000[3]);
      return ((C0033)this.f31000[3]).m4000();
   }

   public ZwBs m102000(float var1) {
      Float var6 = var1;
      this.f19000[4] = var6;
      return this;
   }

   public float m104000(String var1) {
      return this.m56000(var1, (Float)this.f19000[4], (OlmmOsl)this.f19000[5], (Boolean)this.f33000[5]);
   }

   public ZwBs m106000(int var1) {
      Integer var6 = var1;
      this.f33000[0] = var6;
      return this;
   }

   public int m108000(int var1) {
      return ((C0003)this.f31000[4]).m40000(var1);
   }

   private void m110000() {
      if (this.f31000 == null) {
         this.f31000 = new Object[6];
         Object[] var1 = this.f31000;
      }

      if (this.f19000 == null) {
         this.f19000 = new Object[7];
         Object[] var2 = this.f19000;
         var2[4] = f15000[4];
         var2[6] = 0;
      }

      if (this.f33000 == null) {
         this.f33000 = new Object[6];
         Object[] var3 = this.f33000;
         var3[0] = 0;
         var3[1] = f15000[5];
         var3[2] = f15000[6];
         var3[3] = 0;
         var3[4] = f15000[7];
         var3[5] = false;
      }
   }
}
