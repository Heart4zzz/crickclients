package rw.core;

import com.mojang.blaze3d.systems.ScissorState;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import org.lwjgl.CLongBuffer;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.util.freetype.FT_Face;
import org.lwjgl.util.freetype.FT_MM_Var;
import org.lwjgl.util.freetype.FT_Var_Axis;
import org.lwjgl.util.freetype.FT_Vector;
import rw.api.Iface0190;
import rw.data.Rec0071;
import rw.data.Rec0072;
import rw.data.Rec0081;
import rw.data.Rec0084;
import rw.data.Rec0088;
import rw.defs.Enum0018;
import rw.gui.FreeType;
import rw.gui.Rec0011;

public final class C0272 implements AutoCloseable {
   private static final int[] f1000;
   private final Rec0011 f2000;
   private final byte[] f3000;
   private final long f4000;
   private final Enum0018 f5000;
   private final int f6000;
   private final double f7000;
   private final double f8000;
   private final int f9000 = 1;
   private final long f10000;
   private final ByteBuffer f11000;
   private final FT_Face f12000;
   private final int f13000;
   private final boolean f14000;
   private final C0270 f15000;
   private final Rec0071 f16000;
   private final C0274 f17000 = new C0274();
   private final ScissorState f18000 = new ScissorState();
   private C0269 f19000;
   private int[] f20000 = new int[64];
   private int f21000;
   private C0269 f22000;
   private final IntOpenHashSet f23000 = new IntOpenHashSet(256);
   private int[] f24000 = new int[256];
   private int[] f25000 = new int[256];
   private int[] f26000 = new int[256];
   private int[] f27000 = new int[256];
   private int[] f28000 = new int[256];
   private int f29000;
   private final int[] f30000 = new int[2];
   private int[] f31000;
   private Rec0088[] f32000;
   private final BlockingQueue<int[]> f33000 = new LinkedBlockingQueue<>();
   private final Queue<Iface0190> f34000 = new ConcurrentLinkedQueue<>();
   private final Executor f35000;
   private final Queue<FreeType> f36000 = new ConcurrentLinkedQueue<>();
   private final List<FreeType> f37000 = Collections.synchronizedList(new ArrayList<>());
   private volatile boolean f38000;
   private Thread f39000;

   public ByteBuffer m2000() {
      return this.f19000.m6000();
   }

   public boolean m4000(int var1) {
      return org.lwjgl.util.freetype.FreeType.FT_Get_Char_Index(this.f12000, var1) != 0;
   }

   public int m6000() {
      return 1;
   }

   private void m8000() {
      int var1 = this.f22000.m24000();
      if (var1 >= this.f2000.m18000()) {
         throw new IllegalStateException("atlas exceeded max page size " + this.f2000.m18000() + "px");
      } else {
         int var2 = Math.min(this.f2000.m18000(), var1 * 2);
         C0269 var3 = new C0269(var2, var2, this.f6000);
         int[] var4 = this.m18000();

         for (int var5 = 0; var5 < this.f29000; var5++) {
            int var6 = var4[var5];
            if (this.f25000[var6] != 0) {
               if (!var3.m22000(this.f25000[var6], this.f26000[var6], 1, this.f30000)) {
                  throw new IllegalStateException("repack failed at " + var2 + "px");
               }

               var3.m18000(this.f22000, this.f27000[var6], this.f28000[var6], this.f25000[var6], this.f26000[var6], this.f30000[0], this.f30000[1]);
               this.f27000[var6] = this.f30000[0];
               this.f28000[var6] = this.f30000[1];
            }
         }

         C0269 var7 = this.f22000;
         this.f22000 = var3;
         int var8 = this.f29000;
         this.f34000
            .offer(
               new Rec0072(
                  var3,
                  var7,
                  var2,
                  var2,
                  Arrays.copyOf(this.f24000, var8),
                  Arrays.copyOf(this.f27000, var8),
                  Arrays.copyOf(this.f28000, var8),
                  Arrays.copyOf(this.f25000, var8),
                  Arrays.copyOf(this.f26000, var8),
                  var8
               )
            );
      }
   }

   private C0272(byte[] var1, Rec0011 var2, Executor var3) {
      if (var3 == null) {
         throw new IllegalArgumentException("bakeExecutor");
      } else {
         this.f2000 = var2;
         this.f3000 = var1;
         this.f35000 = var3;
         this.f5000 = var2.m12000();
         this.f6000 = this.f5000.m10000();
         this.f7000 = var2.m2000();
         this.f8000 = var2.m10000();
         this.f4000 = m56000(var1);
         MemoryStack var4 = MemoryStack.stackPush();

         try {
            PointerBuffer var5 = var4.mallocPointer(1);
            if (org.lwjgl.util.freetype.FreeType.FT_Init_FreeType(var5) != 0) {
               throw new IllegalStateException("FT_Init_FreeType failed");
            }

            this.f10000 = var5.get(0);
         } catch (Throwable var10) {
            if (var4 != null) {
               try {
                  var4.close();
               } catch (Throwable var8) {
                  var10.addSuppressed(var8);
               }
            }

            throw var10;
         }

         if (var4 != null) {
            var4.close();
         }

         this.f11000 = MemoryUtil.memAlloc(var1.length);
         this.f11000.put(var1).flip();
         var4 = MemoryStack.stackPush();

         try {
            PointerBuffer var13 = var4.mallocPointer(1);
            if (org.lwjgl.util.freetype.FreeType.FT_New_Memory_Face(this.f10000, this.f11000, 0L, var13) != 0) {
               MemoryUtil.memFree(this.f11000);
               org.lwjgl.util.freetype.FreeType.FT_Done_FreeType(this.f10000);
               throw new IllegalStateException("FT_New_Memory_Face failed");
            }

            this.f12000 = FT_Face.create(var13.get(0));
         } catch (Throwable var9) {
            if (var4 != null) {
               try {
                  var4.close();
               } catch (Throwable var7) {
                  var9.addSuppressed(var7);
               }
            }

            throw var9;
         }

         if (var4 != null) {
            var4.close();
         }

         this.f13000 = Math.max(1, this.f12000.units_per_EM() & '\uffff');
         this.m40000();
         this.f14000 = org.lwjgl.util.freetype.FreeType.FT_HAS_KERNING(this.f12000);
         this.f15000 = C0270.m8000(var1);
         this.f16000 = new Rec0071(
            (double)this.f12000.ascender() / this.f13000, (double)this.f12000.descender() / this.f13000, (double)this.f12000.height() / this.f13000
         );
         C0269 var12 = new C0269(var2.m8000(), var2.m8000(), this.f6000);
         this.f19000 = var12;
         this.f22000 = var12;
      }
   }

   public Rec0011 m10000() {
      return this.f2000;
   }

   public long m12000() {
      return this.f4000;
   }

   public int m14000() {
      return this.f19000.m10000();
   }

   private int[] m18000() {
      int var1 = this.f29000;
      int[] var2 = new int[var1];
      int var3 = 0;

      while (var3 < var1) {
         var2[var3] = var3++;
      }

      for (int var7 = 1; var7 < var1; var7++) {
         int var4 = var2[var7];
         int var5 = this.f26000[var4];

         int var6;
         for (var6 = var7 - 1; var6 >= 0 && this.f26000[var2[var6]] < var5; var6--) {
            var2[var6 + 1] = var2[var6];
         }

         var2[var6 + 1] = var4;
      }

      return var2;
   }

   private FreeType m20000() {
      FreeType var1 = this.f36000.poll();
      if (var1 != null) {
         return var1;
      } else {
         var1 = FreeType.m38000(this.f3000);
         this.m36000(var1);
         this.f37000.add(var1);
         return var1;
      }
   }

   private void m22000() {
      this.f38000 = true;
      this.f39000 = m54000(this::m80000, "msdf-atlas-coordinator");
      this.f39000.start();
   }

   public void m24000() {
      this.f38000 = false;
      this.f33000.offer(f1000);

      try {
         this.f39000.join();
      } catch (InterruptedException var5) {
         Thread.currentThread().interrupt();
      }

      synchronized (this.f37000) {
         for (FreeType var3 : this.f37000) {
            var3.m8000();
         }

         this.f37000.clear();
      }

      this.f36000.clear();
      this.m62000();
      this.f19000.m4000();
      org.lwjgl.util.freetype.FreeType.FT_Done_Face(this.f12000);
      org.lwjgl.util.freetype.FreeType.FT_Done_FreeType(this.f10000);
      MemoryUtil.memFree(this.f11000);
   }

   public Rec0071 m26000() {
      return this.f16000;
   }

   private Rec0088 m28000(int var1) {
      FreeType var2 = this.m20000();

      Rec0088 var3;
      try {
         var3 = var2.m32000(var1, this.f7000, this.f8000, this.f5000);
      } finally {
         this.m78000(var2);
      }

      return var3;
   }

   public int m30000() {
      return this.f19000.m24000();
   }

   private void m32000(Path var1) {
      Rec0081 var2 = C0276.m4000(var1);
      if (var2 != null) {
         if (var2.m16000() == this.f4000
            && var2.m14000() == this.f5000.ordinal()
            && var2.m2000() == this.f7000
            && var2.m12000() == this.f8000
            && var2.m18000() == this.f6000
            && Double.compare(var2.m10000(), this.f2000.m4000()) == 0) {
            this.f31000 = var2.m4000();
            this.f32000 = var2.m8000();
         }
      }
   }

   public double m34000(int var1) {
      int var2 = org.lwjgl.util.freetype.FreeType.FT_Get_Char_Index(this.f12000, var1);
      if (var2 == 0) {
         return 0.0;
      } else {
         MemoryStack var3 = MemoryStack.stackPush();

         double var9;
         label47: {
            try {
               CLongBuffer var4 = var3.mallocCLong(1);
               if (org.lwjgl.util.freetype.FreeType.FT_Get_Advance(this.f12000, var2, 1, var4) != 0) {
                  var9 = 0.0;
                  break label47;
               }

               var9 = (double)var4.get(0) / this.f13000;
            } catch (Throwable var8) {
               if (var3 != null) {
                  try {
                     var3.close();
                  } catch (Throwable var7) {
                     var8.addSuppressed(var7);
                  }
               }

               throw var8;
            }

            if (var3 != null) {
               var3.close();
            }

            return var9;
         }

         if (var3 != null) {
            var3.close();
         }

         return var9;
      }
   }

   private void m36000(FreeType var1) {
      double var2 = this.f2000.m4000();
      if (!Double.isNaN(var2) && var1.m20000() != null) {
         var1.m44000((float)var2);
      }
   }

   public boolean m38000() {
      return this.f18000.N();
   }

   private void m40000() {
      double var1 = this.f2000.m4000();
      if (!Double.isNaN(var1)) {
         MemoryStack var3 = MemoryStack.stackPush();

         label128: {
            label129: {
               try {
                  PointerBuffer var4 = var3.mallocPointer(1);
                  if (org.lwjgl.util.freetype.FreeType.FT_Get_MM_Var(this.f12000, var4) != 0) {
                     break label128;
                  }

                  FT_MM_Var var5 = FT_MM_Var.create(var4.get(0));

                  try {
                     int var6 = var5.num_axis();
                     long var7 = var5.axis().address();
                     long[] var9 = new long[var6];
                     int var10 = -1;

                     for (int var11 = 0; var11 < var6; var11++) {
                        FT_Var_Axis var12 = FT_Var_Axis.create(var7 + (long)var11 * FT_Var_Axis.SIZEOF);
                        var9[var11] = var12.def();
                        if (var12.tag() == 2003265652L) {
                           var10 = var11;
                        }
                     }

                     if (var10 < 0) {
                        break label129;
                     }

                     var9[var10] = Math.round(var1 * 65536.0);
                     CLongBuffer var20 = var3.mallocCLong(var6);
                     var20.put(var9).flip();
                     org.lwjgl.util.freetype.FreeType.FT_Set_Var_Design_Coordinates(this.f12000, var20);
                  } finally {
                     org.lwjgl.util.freetype.FreeType.FT_Done_MM_Var(this.f10000, var5);
                  }
               } catch (Throwable var19) {
                  if (var3 != null) {
                     try {
                        var3.close();
                     } catch (Throwable var17) {
                        var19.addSuppressed(var17);
                     }
                  }

                  throw var19;
               }

               if (var3 != null) {
                  var3.close();
               }

               return;
            }

            if (var3 != null) {
               var3.close();
            }

            return;
         }

         if (var3 != null) {
            var3.close();
         }
      }
   }

   private void m42000(int var1, int var2, int var3, int var4, int var5) {
      if (this.f29000 == this.f24000.length) {
         int var6 = this.f24000.length * 2;
         this.f24000 = Arrays.copyOf(this.f24000, var6);
         this.f25000 = Arrays.copyOf(this.f25000, var6);
         this.f26000 = Arrays.copyOf(this.f26000, var6);
         this.f27000 = Arrays.copyOf(this.f27000, var6);
         this.f28000 = Arrays.copyOf(this.f28000, var6);
      }

      this.f24000[this.f29000] = var1;
      this.f25000[this.f29000] = var2;
      this.f26000[this.f29000] = var3;
      this.f27000[this.f29000] = var4;
      this.f28000[this.f29000] = var5;
      this.f29000++;
   }

   private static int[] m44000(Rec0088[] var0) {
      int var1 = var0.length;
      int[] var2 = new int[var1];
      int var3 = 0;

      while (var3 < var1) {
         var2[var3] = var3++;
      }

      for (int var7 = 1; var7 < var1; var7++) {
         int var4 = var2[var7];
         int var5 = var0[var4] == null ? -1 : var0[var4].m16000();

         int var6;
         for (var6 = var7 - 1; var6 >= 0 && (var0[var2[var6]] == null ? -1 : var0[var2[var6]].m16000()) < var5; var6--) {
            var2[var6 + 1] = var2[var6];
         }

         var2[var6 + 1] = var4;
      }

      return var2;
   }

   private void m46000(int var1, Rec0088 var2) {
      if (this.f23000.add(var1)) {
         if (var2.m20000()) {
            this.m42000(var1, 0, 0, 0, 0);
            this.f34000.offer(m50000(var1, var2, 0, 0, 0, 0));
         } else {
            int var3 = var2.m2000();
            int var4 = var2.m16000();

            while (!this.f22000.m22000(var3, var4, 1, this.f30000)) {
               this.m8000();
            }

            int var5 = this.f30000[0];
            int var6 = this.f30000[1];
            this.f22000.m16000(var2.m18000(), var3, var4, var5, var6);
            this.m42000(var1, var3, var4, var5, var6);
            this.f34000.offer(m50000(var1, var2, var5, var6, var3, var4));
         }
      }
   }

   public static C0272 m48000(Path var0, Rec0011 var1, Executor var2) throws IOException {
      C0272 var3 = new C0272(Files.readAllBytes(var0), var1, var2);
      var3.m22000();
      return var3;
   }

   private static Rec0084 m50000(int var0, Rec0088 var1, int var2, int var3, int var4, int var5) {
      return new Rec0084(
         var0, (float)var1.m22000(), (float)var1.m4000(), (float)var1.m8000(), (float)var1.m10000(), (float)var1.m14000(), var2, var3, var4, var5, 0
      );
   }

   public void m52000(Path var1) throws IOException {
      C0276.m2000(var1, this.f4000, this.f2000, this.f17000, this.f19000);
   }

   private static Thread m54000(Runnable var0, String var1) {
      Thread var2 = new Thread(var0, var1);
      var2.setDaemon(true);
      return var2;
   }

   private static long m56000(byte[] var0) {
      long var1 = -3750763034362895579L;

      for (byte var6 : var0) {
         var1 ^= var6 & 255;
         var1 *= 1099511628211L;
      }

      return var1;
   }

   private static void m58000(int var0, Exception var1) {
      System.err.println("[FontAtlas] failed to bake U+" + Integer.toHexString(var0) + ": " + var1);
   }

   public void m60000(int var1) {
      if (this.f17000.m34000(var1) == -2) {
         this.f17000.m22000(var1);
         if (this.f21000 == this.f20000.length) {
            this.f20000 = Arrays.copyOf(this.f20000, this.f20000.length * 2);
         }

         this.f20000[this.f21000++] = var1;
      }
   }

   public ScissorState m62000() {
      this.f18000.B();
      this.f18000.u = this.f6000;
      this.f18000.i = 0;
      this.f18000.y = this.f19000.m24000();
      this.f18000.L = this.f19000.m10000();

      Iface0190 var1;
      while ((var1 = this.f34000.poll()) != null) {
         if (var1 instanceof Rec0084 var2) {
            this.f17000.m36000(var2);
            if (var2.m10000() > 0) {
               this.f18000.disable(var2.m4000(), var2.m8000(), var2.m10000(), var2.m16000());
            }
         } else if (var1 instanceof Rec0072 var3) {
            this.m68000(var3);
         }
      }

      if (this.f21000 > 0) {
         this.f33000.offer(Arrays.copyOf(this.f20000, this.f21000));
         this.f21000 = 0;
      }

      return this.f18000;
   }

   public double m64000(int var1, int var2) {
      int var3 = org.lwjgl.util.freetype.FreeType.FT_Get_Char_Index(this.f12000, var1);
      int var4 = org.lwjgl.util.freetype.FreeType.FT_Get_Char_Index(this.f12000, var2);
      if (var3 == 0 || var4 == 0) {
         return 0.0;
      } else if (!this.f15000.m6000()) {
         return (double)this.f15000.m4000(var3, var4) / this.f13000;
      } else if (this.f14000) {
         MemoryStack var5 = MemoryStack.stackPush();

         double var11;
         label58: {
            try {
               FT_Vector var6 = FT_Vector.malloc(var5);
               if (org.lwjgl.util.freetype.FreeType.FT_Get_Kerning(this.f12000, var3, var4, 2, var6) != 0) {
                  var11 = 0.0;
                  break label58;
               }

               var11 = (double)var6.x() / this.f13000;
            } catch (Throwable var10) {
               if (var5 != null) {
                  try {
                     var5.close();
                  } catch (Throwable var9) {
                     var10.addSuppressed(var9);
                  }
               }

               throw var10;
            }

            if (var5 != null) {
               var5.close();
            }

            return var11;
         }

         if (var5 != null) {
            var5.close();
         }

         return var11;
      } else {
         return 0.0;
      }
   }

   public static C0272 m66000(byte[] var0, Rec0011 var1, Executor var2) {
      C0272 var3 = new C0272((byte[])var0.clone(), var1, var2);
      var3.m22000();
      return var3;
   }

   private void m68000(Rec0072 var1) {
      this.f19000 = var1.m20000();
      int[] var2 = var1.m12000();
      int[] var3 = var1.m22000();
      int[] var4 = var1.m4000();
      int[] var5 = var1.m8000();
      int[] var6 = var1.m10000();

      for (int var7 = 0; var7 < var1.m14000(); var7++) {
         int var8 = this.f17000.m2000(var2[var7]);
         if (var8 >= 0) {
            this.f17000.m28000(var8, var3[var7], var4[var7], var5[var7], var6[var7], 0);
         }
      }

      if (var1.m18000() != null) {
         var1.m18000().m4000();
      }

      this.f18000.enabled = true;
      this.f18000.y = this.f19000.m24000();
      this.f18000.L = this.f19000.m10000();
      this.f18000.Z();

      for (int var9 = 0; var9 < var1.m14000(); var9++) {
         if (var5[var9] > 0) {
            this.f18000.disable(var3[var9], var4[var9], var5[var9], var6[var9]);
         }
      }
   }

   public static C0272 m70000(Path var0, Rec0011 var1, Path var2, Executor var3) throws IOException {
      C0272 var4 = new C0272(Files.readAllBytes(var0), var1, var3);
      var4.m32000(var2);
      var4.m22000();
      return var4;
   }

   public boolean m72000(int var1, float var2, C0267 var3) {
      int var4 = this.f17000.m2000(var1);
      if (var4 >= 0) {
         this.f17000.m26000(var4, var2, this.f19000.m24000(), this.f19000.m10000(), (float)this.f8000, (float)this.f7000, var3);
         return true;
      } else if (var4 == -1) {
         return false;
      } else {
         this.m60000(var1);
         return false;
      }
   }

   public static C0272 m74000(byte[] var0, Rec0011 var1, Path var2, Executor var3) {
      C0272 var4 = new C0272((byte[])var0.clone(), var1, var3);
      var4.m32000(var2);
      var4.m22000();
      return var4;
   }

   private void m76000(int[] var1) {
      int var2 = 0;

      for (int var6 : var1) {
         if (!this.f23000.contains(var6)) {
            var1[var2++] = var6;
         }
      }

      if (var2 != 0) {
         Rec0088[] var9 = new Rec0088[var2];
         CompletableFuture[] var10 = new CompletableFuture[var2];

         for (int var11 = 0; var11 < var2; var11++) {
            int var14 = var1[var11];
            var10[var11] = CompletableFuture.supplyAsync(() -> this.m28000(var14), this.f35000);
         }

         for (int var12 = 0; var12 < var2; var12++) {
            try {
               var9[var12] = (Rec0088)var10[var12].get();
            } catch (Exception var8) {
               var9[var12] = null;
               m58000(var1[var12], var8);
            }
         }

         int[] var13 = m44000(var9);

         for (int var15 = 0; var15 < var2; var15++) {
            int var7 = var13[var15];
            if (var9[var7] != null) {
               this.m46000(var1[var7], var9[var7]);
            }
         }
      }
   }

   private void m78000(FreeType var1) {
      this.f36000.offer(var1);
   }

   private void m80000() {
      try {
         if (this.f32000 != null) {
            int[] var1 = m44000(this.f32000);

            for (int var2 = 0; var2 < this.f32000.length; var2++) {
               int var3 = var1[var2];
               if (this.f32000[var3] != null) {
                  this.m46000(this.f31000[var3], this.f32000[var3]);
               }
            }

            this.f32000 = null;
            this.f31000 = null;
         }

         while (true) {
            int[] var5 = this.f33000.take();
            if (var5 == f1000) {
               break;
            }

            this.m76000(var5);
         }
      } catch (InterruptedException var4) {
         Thread.currentThread().interrupt();
      }
   }

   public int m82000() {
      return this.f6000;
   }
}
