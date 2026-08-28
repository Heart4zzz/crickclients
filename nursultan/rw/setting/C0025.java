package rw.setting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import rw.core.C0268;
import rw.core.C0275;
import rw.core.C0348;
import rw.core.C0350;
import rw.core.C0354;
import rw.data.Rec0069;
import rw.data.Rec0073;
import rw.data.Rec0075;
import rw.data.Rec0080;
import rw.data.Rec0087;
import rw.data.Rec0124;
import rw.defs.Enum0030;

public final class C0025 {
   private static final int f1000 = 16;
   private static final int f2000 = 8;
   static final Rec0124[] f3000;
   private final Enum0030 f4000;
   private final int f5000;
   private final int f6000;
   private final int f7000;
   private final int f8000;
   private final int f9000;
   private final int f10000;
   private final byte[] f11000;
   private final ArrayList<C0350> f12000 = new ArrayList<>();
   private final ArrayList<C0275> f13000 = new ArrayList<>();
   private final C0354 f14000 = new C0354();
   private final C0268 f15000 = new C0268(16);
   private byte[] f16000;
   private int f17000;
   private int f18000;
   private int f19000;
   private int f20000;
   private int f21000;
   private int f22000;

   public int m2000() {
      return this.f17000;
   }

   private C0350 m4000(C0350 var1) {
      C0350 var2 = Objects.requireNonNull(var1, "texture");
      if (var2.m14000() != this) {
         throw new IllegalArgumentException("Texture handle does not belong to this atlas");
      } else {
         return var2;
      }
   }

   private boolean m6000(C0350 var1, byte[] var2, int var3, int var4) {
      int var5 = this.m76000(var1);
      Rec0087 var6 = this.m38000();
      Rec0073 var7 = this.m52000(var1);
      this.f12000.remove(var5);
      this.m8000(var7.m16000(), var7.m14000(), var7.m10000(), var7.m18000());
      this.m40000();
      this.m44000();
      Rec0075 var8 = this.m104000(var3, var4);
      if (var8 != null) {
         this.m122000(var1, var5, var2, var3, var4, var7, var8, var6.m2000());
         return true;
      } else {
         this.m124000(var1, var5, var6);
         return this.m106000(var1, var2, var3, var4, true);
      }
   }

   private void m8000(int var1, int var2, int var3, int var4) {
      if (var3 > 0 && var4 > 0 && var1 >= 0 && var2 >= 0 && var1 + var3 <= this.f5000) {
         if (var2 < this.f6000 && var2 + var4 <= this.f6000) {
            if (var3 >= 8 && var4 >= 8) {
               C0275 var5 = new C0275(var1, var2, var3, var4);
               int var6 = 0;

               while (var6 < this.f13000.size()) {
                  C0275 var7 = this.f13000.get(var6);
                  if (m120000(var5, var7)) {
                     this.f13000.remove(var6);
                  } else {
                     if (m120000(var7, var5)) {
                        return;
                     }

                     if (m66000(var5, var7)) {
                        var5 = m12000(var5, var7);
                        this.f13000.remove(var6);
                        var6 = 0;
                     } else {
                        var6++;
                     }
                  }
               }

               this.f13000.add(var5);
            }
         }
      }
   }

   private Rec0075 m10000(int var1, int var2) {
      Rec0069 var3 = this.m24000(var1, var2);
      int var4 = -1;
      int var5 = Integer.MAX_VALUE;
      int var6 = Integer.MAX_VALUE;
      int var7 = Integer.MAX_VALUE;
      int var8 = Integer.MAX_VALUE;

      for (int var9 = 0; var9 < this.f13000.size(); var9++) {
         C0275 var10 = this.f13000.get(var9);
         if (var3.m6000() <= var10.f3000 && var3.m4000() <= var10.f4000) {
            int var11 = var10.f3000 * var10.f4000 - var3.m6000() * var3.m4000();
            int var12 = Math.min(var10.f3000 - var3.m6000(), var10.f4000 - var3.m4000());
            if (var11 < var5
               || var11 == var5 && var12 < var6
               || var11 == var5 && var12 == var6 && (var10.f2000 < var7 || var10.f2000 == var7 && var10.f1000 < var8)) {
               var4 = var9;
               var5 = var11;
               var6 = var12;
               var8 = var10.f1000;
               var7 = var10.f2000;
            }
         }
      }

      if (var4 < 0) {
         return null;
      } else {
         C0275 var13 = this.f13000.remove(var4);
         this.m8000(var13.f1000 + var3.m6000(), var13.f2000, var13.f3000 - var3.m6000(), var13.f4000);
         this.m8000(var13.f1000, var13.f2000 + var3.m4000(), var3.m6000(), var13.f4000 - var3.m4000());
         int var14 = Math.max(this.f18000, var13.f2000 + var2);
         int var15 = this.m64000(var14);
         return new Rec0075(var13.f1000, var13.f2000, var3.m6000(), var3.m4000(), var15, 0, false);
      }
   }

   private static C0275 m12000(C0275 var0, C0275 var1) {
      int var2 = Math.min(var0.f1000, var1.f1000);
      int var3 = Math.min(var0.f2000, var1.f2000);
      int var4 = Math.max(var0.m4000(), var1.m4000());
      int var5 = Math.max(var0.m2000(), var1.m2000());
      return new C0275(var2, var3, var4 - var2, var5 - var3);
   }

   private int m14000(int var1) {
      return m84000((long)var1 + this.f7000, "padded width is too large");
   }

   public byte[] m16000() {
      return this.f11000;
   }

   private int m18000(int var1, int var2) {
      return var1 >= this.f17000 ? 0 : Math.min(var1 + var2, this.f17000) - var1;
   }

   private int m20000() {
      int var1 = 0;

      for (C0350 var3 : this.f12000) {
         var1 = Math.max(var1, var3.m18000() + this.m60000(var3.m16000()));
      }

      return var1;
   }

   private void m22000() {
      this.f18000 = 0;
      this.f19000 = 0;
      this.f17000 = this.f8000;
      this.f13000.clear();
      this.m44000();
   }

   public C0025(Enum0030 var1, int var2, int var3) {
      this(var1, var2, var3, 0, 1);
   }

   public C0025(Enum0030 var1, int var2, int var3, int var4, int var5) {
      this.f4000 = Objects.requireNonNull(var1, "format");
      if (var2 <= 0) {
         throw new IllegalArgumentException("maxWidth must be > 0");
      } else if (var3 <= 0) {
         throw new IllegalArgumentException("maxHeight must be > 0");
      } else if (var4 < 0) {
         throw new IllegalArgumentException("padding must be >= 0");
      } else if (var5 <= 0) {
         throw new IllegalArgumentException("minHeight must be > 0");
      } else if (var5 > var3) {
         throw new IllegalArgumentException("minHeight must be <= maxHeight");
      } else {
         this.f5000 = var2;
         this.f6000 = var3;
         this.f7000 = var4;
         this.f8000 = var5;
         this.f9000 = var1.m6000();
         this.f10000 = m82000(var2, this.f9000, "maxWidth * bytesPerPixel");
         this.f11000 = new byte[m84000((long)this.f10000 * var3, "atlas pixel buffer is too large")];
         this.f17000 = var5;
      }
   }

   public C0025(Enum0030 var1, int var2, int var3, int var4) {
      this(var1, var2, var3, var4, 1);
   }

   private Rec0069 m24000(int var1, int var2) {
      return new Rec0069(this.m14000(var1), this.m60000(var2));
   }

   public boolean m26000() {
      return this.f15000.m14000();
   }

   public Rec0124[] m28000() {
      return this.f15000.m8000();
   }

   private void m30000(int var1, int var2) {
      if (var2 > var1) {
         this.m54000(var1, var2 - var1);
      }
   }

   public int m32000() {
      return this.f6000;
   }

   private void m34000(int var1) {
      if (this.f16000 == null || this.f16000.length < var1) {
         this.f16000 = new byte[var1];
      }
   }

   private Rec0073 m36000(int var1, int var2, int var3, int var4) {
      Rec0069 var5 = this.m24000(var3, var4);
      return new Rec0073(var1, var2, var3, var4, var5.m6000(), var5.m4000());
   }

   private Rec0087 m38000() {
      return new Rec0087(this.f18000, this.f19000, this.f17000, this.f20000, this.f21000, this.f22000, new ArrayList<>(this.f13000));
   }

   private void m40000() {
      this.f18000 = this.m42000();
      this.f19000 = this.m20000();
      this.f17000 = this.m64000(this.f18000);
   }

   private int m42000() {
      int var1 = 0;

      for (C0350 var3 : this.f12000) {
         var1 = Math.max(var1, var3.m18000() + var3.m16000());
      }

      return var1;
   }

   private void m44000() {
      this.f20000 = 0;
      this.f21000 = this.f19000;
      this.f22000 = 0;
   }

   private void m46000() {
      this.f15000.m16000(0, 0, this.f5000, this.f17000);
   }

   public Rec0124[] m48000() {
      if (this.f13000.isEmpty()) {
         return f3000;
      } else {
         Rec0124[] var1 = new Rec0124[this.f13000.size()];
         int var2 = 0;

         for (int var3 = 0; var3 < this.f13000.size(); var3++) {
            C0275 var4 = this.f13000.get(var3);
            int var5 = this.m18000(var4.f2000, var4.f4000);
            if (var5 > 0) {
               var1[var2++] = new Rec0124(var4.f1000, var4.f2000, var4.f3000, var5);
            }
         }

         if (var2 == 0) {
            return f3000;
         } else {
            if (var2 != var1.length) {
               var1 = Arrays.copyOf(var1, var2);
            }

            return var1;
         }
      }
   }

   public Rec0124[] m50000() {
      return this.f15000.m2000();
   }

   private Rec0073 m52000(C0350 var1) {
      return this.m36000(var1.m22000(), var1.m18000(), var1.m2000(), var1.m16000());
   }

   private void m54000(int var1, int var2) {
      if (var2 > 0) {
         Arrays.fill(this.f11000, this.m128000(var1), this.m128000(var1 + var2), (byte)0);
      }
   }

   public int m56000() {
      return this.f5000;
   }

   private void m58000(int var1, int var2, int var3, int var4) {
      if (var3 > 0 && var4 > 0 && !this.f13000.isEmpty()) {
         int var5 = var1 + var3;
         int var6 = var2 + var4;
         ArrayList var7 = new ArrayList<>(this.f13000);
         this.f13000.clear();

         for (int var8 = 0; var8 < var7.size(); var8++) {
            C0275 var9 = (C0275)var7.get(var8);
            int var10 = Math.max(var9.f1000, var1);
            int var11 = Math.max(var9.f2000, var2);
            int var12 = Math.min(var9.m4000(), var5);
            int var13 = Math.min(var9.m2000(), var6);
            if (var10 < var12 && var11 < var13) {
               this.m8000(var9.f1000, var9.f2000, var9.f3000, var11 - var9.f2000);
               this.m8000(var9.f1000, var13, var9.f3000, var9.m2000() - var13);
               this.m8000(var9.f1000, var11, var10 - var9.f1000, var13 - var11);
               this.m8000(var12, var11, var9.m4000() - var12, var13 - var11);
            } else {
               this.m8000(var9.f1000, var9.f2000, var9.f3000, var9.f4000);
            }
         }
      }
   }

   private int m60000(int var1) {
      return m84000((long)var1 + this.f7000, "padded height is too large");
   }

   public int m62000() {
      return this.f5000;
   }

   private int m64000(int var1) {
      if (var1 <= 0) {
         return this.f8000;
      } else {
         return var1 <= this.f8000 ? this.f8000 : Math.min(C0348.m2000(var1), this.f6000);
      }
   }

   private static boolean m66000(C0275 var0, C0275 var1) {
      return var0.f2000 == var1.f2000 && var0.f4000 == var1.f4000 && var0.f1000 <= var1.m4000() && var1.f1000 <= var0.m4000()
         || var0.f1000 == var1.f1000 && var0.f3000 == var1.f3000 && var0.f2000 <= var1.m2000() && var1.f2000 <= var0.m2000();
   }

   private void m68000(C0350 var1, byte[] var2, int var3, int var4) {
      int var5 = this.f17000;
      int var6 = var1.m22000();
      int var7 = var1.m18000();
      Rec0073 var8 = this.m52000(var1);
      Rec0073 var9 = this.m36000(var6, var7, var3, var4);
      this.m102000(var6, var7, var8.m10000(), var8.m18000());
      this.m98000(var2, var6, var7, var3, var4);
      var1.m20000(var6, var7, var3, var4);
      this.m8000(var6 + var9.m10000(), var7, var8.m10000() - var9.m10000(), var8.m18000());
      this.m8000(var6, var7 + var9.m18000(), var9.m10000(), var8.m18000() - var9.m18000());
      this.m40000();
      this.m44000();
      this.m114000(var5, var6, var7, var8.m10000(), var8.m18000());
   }

   private void m70000(int var1, int var2, int var3, int var4, int var5) {
      if (this.f17000 != var1) {
         this.m46000();
      } else {
         this.m74000(var2, var3, var4, var5);
      }
   }

   private void m72000(byte[] var1, int var2, int var3) {
      Objects.requireNonNull(var1, "bytes");
      if (var2 <= 0) {
         throw new IllegalArgumentException("width must be > 0");
      } else if (var3 <= 0) {
         throw new IllegalArgumentException("height must be > 0");
      } else if (var2 > this.f5000) {
         throw new IllegalArgumentException("width exceeds atlas maxWidth");
      } else if (var3 > this.f6000) {
         throw new IllegalArgumentException("height exceeds atlas maxHeight");
      } else {
         int var4 = m84000((long)var2 * var3 * this.f9000, "texture byte array is too large");
         if (var1.length != var4) {
            throw new IllegalArgumentException("Expected " + var4 + " bytes but got " + var1.length);
         }
      }
   }

   private void m74000(int var1, int var2, int var3, int var4) {
      int var5 = this.m18000(var2, var4);
      if (var5 > 0) {
         this.f15000.m16000(var1, var2, var3, var5);
      }
   }

   private int m76000(C0350 var1) {
      int var2 = this.f12000.indexOf(var1);
      if (var2 < 0) {
         throw new IllegalStateException("Texture handle is not registered in the atlas");
      } else {
         return var2;
      }
   }

   private Rec0075 m78000(int var1, int var2) {
      Rec0069 var3 = this.m24000(var1, var2);
      int var4 = this.f20000;
      int var5 = this.f21000;
      int var6 = this.f22000;
      if (var4 + var3.m6000() > this.f5000) {
         var4 = 0;
         var5 += var6;
         var6 = 0;
      }

      int var7 = var5 + var3.m4000();
      if (var7 > this.f6000) {
         return null;
      } else if (!this.f12000.isEmpty() && var5 + var2 > this.f17000) {
         return null;
      } else {
         int var8 = Math.max(this.f18000, var5 + var2);
         int var9 = this.m64000(var8);
         return new Rec0075(var4, var5, var3.m6000(), var3.m4000(), var9, Math.max(var6, var3.m4000()), true);
      }
   }

   public void m80000() {
      this.f15000.m4000();
   }

   private static int m82000(int var0, int var1, String var2) {
      return m84000((long)var0 * var1, var2);
   }

   private static int m84000(long var0, String var2) {
      if (var0 >= 0L && var0 <= 2147483647L) {
         return (int)var0;
      } else {
         throw new IllegalArgumentException(var2);
      }
   }

   private void m86000(Rec0075 var1) {
      if (var1.m4000()) {
         this.f20000 = var1.m14000() + var1.m2000();
         this.f21000 = var1.m12000();
         this.f22000 = var1.m16000();
      } else {
         this.m44000();
      }
   }

   public C0350 m88000(byte[] var1, int var2, int var3) {
      this.m72000(var1, var2, var3);
      C0350 var4 = new C0350(this);
      Rec0075 var5 = this.m104000(var2, var3);
      if (var5 != null) {
         this.m118000(var4, var1, var2, var3, var5);
         return var4;
      } else if (!this.m106000(var4, var1, var2, var3, false)) {
         throw new IllegalStateException("Texture does not fit into the atlas");
      } else {
         return var4;
      }
   }

   public boolean m90000(C0350 var1) {
      C0350 var2 = this.m4000(var1);
      if (!var2.m10000()) {
         return false;
      } else if (!this.f12000.remove(var2)) {
         return false;
      } else {
         Rec0073 var3 = this.m52000(var2);
         int var4 = this.f17000;
         this.m102000(var3.m16000(), var3.m14000(), var3.m10000(), var3.m18000());
         var2.m12000();
         if (this.f12000.isEmpty()) {
            this.m22000();
         } else {
            this.m40000();
            this.m8000(var3.m16000(), var3.m14000(), var3.m10000(), var3.m18000());
            this.m44000();
         }

         this.m114000(var4, var3.m16000(), var3.m14000(), var3.m10000(), var3.m18000());
         return true;
      }
   }

   public Enum0030 m92000() {
      return this.f4000;
   }

   public C0350 m94000(C0350 var1, byte[] var2, int var3, int var4) {
      C0350 var5 = this.m4000(var1);
      if (!var5.m10000()) {
         throw new IllegalStateException("Texture handle is not alive");
      } else {
         this.m72000(var2, var3, var4);
         if (var5.m2000() == var3 && var5.m16000() == var4) {
            this.m98000(var2, var5.m22000(), var5.m18000(), var3, var4);
            this.f15000.m16000(var5.m22000(), var5.m18000(), var3, var4);
            return var5;
         } else if (var3 <= var5.m2000() && var4 <= var5.m16000()) {
            this.m68000(var5, var2, var3, var4);
            return var5;
         } else if (!this.m6000(var5, var2, var3, var4)) {
            throw new IllegalStateException("Updated texture does not fit into the atlas");
         } else {
            return var5;
         }
      }
   }

   private void m96000(C0350 var1, byte[] var2, Rec0073 var3, Rec0075 var4) {
      this.m102000(var3.m16000(), var3.m14000(), var3.m10000(), var3.m18000());
      this.m98000(var2, var3.m16000(), var3.m14000(), var3.m2000(), var3.m12000());
      if (var4.m4000()) {
         this.m58000(var3.m16000(), var3.m14000(), var3.m10000(), var3.m18000());
      }

      var1.m20000(var3.m16000(), var3.m14000(), var3.m2000(), var3.m12000());
      this.f18000 = Math.max(this.f18000, var3.m4000());
      this.f19000 = Math.max(this.f19000, var3.m8000());
      this.f17000 = var4.m8000();
      this.m86000(var4);
   }

   private void m98000(byte[] var1, int var2, int var3, int var4, int var5) {
      int var6 = m82000(var4, this.f9000, "texture row is too large");

      for (int var7 = 0; var7 < var5; var7++) {
         int var8 = var7 * var6;
         int var9 = this.m132000(var2, var3 + var7);
         System.arraycopy(var1, var8, this.f11000, var9, var6);
      }
   }

   private void m100000(byte[] var1, int var2, int var3, int var4, int var5, byte[] var6, int var7, int var8) {
      int var9 = m82000(var4, this.f9000, "texture row is too large");

      for (int var10 = 0; var10 < var5; var10++) {
         int var11 = this.m132000(var2, var3 + var10);
         int var12 = this.m132000(var7, var8 + var10);
         System.arraycopy(var1, var11, var6, var12, var9);
      }
   }

   private void m102000(int var1, int var2, int var3, int var4) {
      int var5 = m82000(var3, this.f9000, "texture row is too large");

      for (int var6 = 0; var6 < var4; var6++) {
         int var7 = this.m132000(var1, var2 + var6);
         Arrays.fill(this.f11000, var7, var7 + var5, (byte)0);
      }
   }

   private Rec0075 m104000(int var1, int var2) {
      Rec0075 var3 = this.m10000(var1, var2);
      return var3 != null ? var3 : this.m78000(var1, var2);
   }

   private boolean m106000(C0350 var1, byte[] var2, int var3, int var4, boolean var5) {
      Rec0080 var6 = this.m108000(var1, var3, var4, var5);
      if (var6 == null) {
         return false;
      } else {
         this.m112000(var6, var1, var2, var3, var4, var5);
         return true;
      }
   }

   private Rec0080 m108000(C0350 var1, int var2, int var3, boolean var4) {
      int var5 = this.f17000;

      while (true) {
         Rec0080 var6 = this.m110000(var1, var2, var3, var4, var5);
         if (var6 != null) {
            return var6;
         }

         int var7 = this.m116000(var5);
         if (var7 <= var5) {
            return null;
         }

         var5 = var7;
      }
   }

   private Rec0080 m110000(C0350 var1, int var2, int var3, boolean var4, int var5) {
      int var6 = var1 != null && !var4 ? 1 : 0;
      int var7 = this.f12000.size() + var6;
      if (var7 == 0) {
         return Rec0080.f8000;
      } else {
         C0350[] var8 = new C0350[var7];
         int[] var9 = new int[var7];
         int[] var10 = new int[var7];
         int[] var11 = new int[var7];
         int[] var12 = new int[var7];
         int[] var13 = new int[var7];
         boolean[] var14 = new boolean[var7];
         int var15 = 0;

         for (C0350 var17 : this.f12000) {
            var8[var15] = var17;
            var9[var15] = var15;
            if (var17 == var1 && var4) {
               var10[var15] = this.m14000(var2);
               var11[var15] = this.m60000(var3);
            } else {
               var10[var15] = this.m14000(var17.m2000());
               var11[var15] = this.m60000(var17.m16000());
            }

            var15++;
         }

         if (var1 != null && !var4) {
            var8[var15] = var1;
            var9[var15] = var15;
            var10[var15] = this.m14000(var2);
            var11[var15] = this.m60000(var3);
         }

         this.f14000.m22000(this.f5000, var5, this.f5000);
         this.f14000.m14000(1);
         if (!this.f14000.m30000(var9, var10, var11, var12, var13, var14, var7)) {
            return null;
         } else {
            int var21 = 0;
            int var22 = 0;

            for (int var18 = 0; var18 < var7; var18++) {
               C0350 var19 = var8[var18];
               int var20 = var19 == var1 ? var3 : var19.m16000();
               var21 = Math.max(var21, var13[var18] + var20);
               var22 = Math.max(var22, var13[var18] + var11[var18]);
            }

            if (var22 > var5) {
               return null;
            } else {
               int var23 = this.m64000(var21);
               return new Rec0080(var8, var12, var13, var7, var21, var22, var23);
            }
         }
      }
   }

   private void m112000(Rec0080 var1, C0350 var2, byte[] var3, int var4, int var5, boolean var6) {
      int var7 = this.f17000;
      int var8 = this.m128000(var7);
      this.m34000(var8);
      if (var8 > 0) {
         System.arraycopy(this.f11000, 0, this.f16000, 0, var8);
      }

      int var9 = Math.max(var7, var1.m4000());
      Arrays.fill(this.f11000, 0, this.m128000(var9), (byte)0);

      for (int var10 = 0; var10 < var1.m10000(); var10++) {
         C0350 var11 = var1.m14000()[var10];
         int var12 = var1.m12000()[var10];
         int var13 = var1.m2000()[var10];
         int var14 = var11 == var2 ? var4 : var11.m2000();
         int var15 = var11 == var2 ? var5 : var11.m16000();
         if (var11 == var2) {
            this.m98000(var3, var12, var13, var14, var15);
         } else {
            this.m100000(this.f16000, var11.m22000(), var11.m18000(), var14, var15, this.f11000, var12, var13);
         }

         var11.m20000(var12, var13, var14, var15);
      }

      if (var2 != null && !var6) {
         this.f12000.add(var2);
      }

      this.f18000 = var1.m8000();
      this.f19000 = var1.m16000();
      this.f17000 = var1.m4000();
      this.f13000.clear();
      this.m44000();
      this.m46000();
   }

   private void m114000(int var1, int var2, int var3, int var4, int var5) {
      if (this.f17000 < var1) {
         this.m54000(this.f17000, var1 - this.f17000);
         this.m46000();
      } else {
         this.m74000(var2, var3, var4, var5);
      }
   }

   private int m116000(int var1) {
      if (var1 >= this.f6000) {
         return var1;
      } else {
         int var2 = C0348.m2000(var1 + 1);
         return Math.min(var2, this.f6000);
      }
   }

   private void m118000(C0350 var1, byte[] var2, int var3, int var4, Rec0075 var5) {
      int var6 = this.f17000;
      Rec0073 var7 = this.m36000(var5.m14000(), var5.m12000(), var3, var4);
      this.m30000(var6, var5.m8000());
      this.m96000(var1, var2, var7, var5);
      this.f12000.add(var1);
      this.m70000(var6, var7.m16000(), var7.m14000(), var3, var4);
   }

   private static boolean m120000(C0275 var0, C0275 var1) {
      return var0.f1000 <= var1.f1000 && var0.f2000 <= var1.f2000 && var0.m4000() >= var1.m4000() && var0.m2000() >= var1.m2000();
   }

   private void m122000(C0350 var1, int var2, byte[] var3, int var4, int var5, Rec0073 var6, Rec0075 var7, int var8) {
      Rec0073 var9 = this.m36000(var7.m14000(), var7.m12000(), var4, var5);
      int var10 = this.f17000;
      this.m30000(var10, var7.m8000());
      this.m102000(var6.m16000(), var6.m14000(), var6.m10000(), var6.m18000());
      this.m96000(var1, var3, var9, var7);
      this.f12000.add(Math.min(var2, this.f12000.size()), var1);
      if (this.f17000 < var8) {
         this.m54000(this.f17000, var8 - this.f17000);
      }

      if (this.f17000 != var8) {
         this.m46000();
      } else {
         this.m74000(var6.m16000(), var6.m14000(), var6.m10000(), var6.m18000());
         this.m74000(var9.m16000(), var9.m14000(), var9.m10000(), var9.m18000());
      }
   }

   private void m124000(C0350 var1, int var2, Rec0087 var3) {
      this.f12000.add(Math.min(var2, this.f12000.size()), var1);
      this.f13000.clear();
      this.f13000.addAll(var3.m4000());
      this.f18000 = var3.m14000();
      this.f19000 = var3.m12000();
      this.f17000 = var3.m2000();
      this.f20000 = var3.m10000();
      this.f21000 = var3.m8000();
      this.f22000 = var3.m16000();
   }

   public void m126000() {
      if (!this.f12000.isEmpty()) {
         if (!this.m106000(null, null, 0, 0, false)) {
            throw new IllegalStateException("Active textures do not fit into the atlas");
         }
      }
   }

   private int m128000(int var1) {
      return m84000((long)var1 * this.f10000, "row byte count is too large");
   }

   public int m130000() {
      return this.f7000;
   }

   private int m132000(int var1, int var2) {
      return var2 * this.f10000 + var1 * this.f9000;
   }
}
