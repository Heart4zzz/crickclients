package rw.gui;

import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.CLongBuffer;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.util.freetype.FT_Face;
import org.lwjgl.util.freetype.FT_MM_Var;
import org.lwjgl.util.freetype.FT_Var_Axis;
import org.lwjgl.util.msdfgen.MSDFGen;
import org.lwjgl.util.msdfgen.MSDFGenBitmap;
import org.lwjgl.util.msdfgen.MSDFGenBounds;
import org.lwjgl.util.msdfgen.MSDFGenExt;
import org.lwjgl.util.msdfgen.MSDFGenRange;
import org.lwjgl.util.msdfgen.MSDFGenTransform;
import org.lwjgl.util.msdfgen.MSDFGenVector2;
import rw.core.C0265;
import rw.data.Rec0083;
import rw.data.Rec0085;
import rw.data.Rec0086;
import rw.data.Rec0088;
import rw.defs.Enum0018;

public final class FreeType implements AutoCloseable {
   public static final double f1000 = 3.0;
   private static final long f2000 = 2003265652L;
   private final FT_Face f3000;
   private long f4000;
   private long f5000;
   private ByteBuffer f6000;
   private boolean f7000 = true;
   private final Rec0083 f8000;
   private final int f9000;
   private final long[] f10000;
   private float f11000;

   public float m2000() {
      return this.f11000;
   }

   public Rec0085 m4000(int var1, int var2, int var3, double var4) {
      return this.m24000(0, 1, false, var1, var2, var3, var4, var4);
   }

   private void m6000(float var1) {
      MemoryStack var2 = MemoryStack.stackPush();

      try {
         CLongBuffer var3 = var2.mallocCLong(this.f10000.length);
         var3.put(this.f10000);
         var3.put(this.f9000, m12000(var1));
         var3.flip();
         m16000(org.lwjgl.util.freetype.FreeType.FT_Set_Var_Design_Coordinates(this.f3000, var3), "FT_Set_Var_Design_Coordinates");
      } catch (Throwable var6) {
         if (var2 != null) {
            try {
               var2.close();
            } catch (Throwable var5) {
               var6.addSuppressed(var5);
            }
         }

         throw var6;
      }

      if (var2 != null) {
         var2.close();
      }
   }

   private FreeType(long var1, FT_Face var3, long var4, ByteBuffer var6, Rec0086 var7) {
      this.f4000 = var1;
      this.f3000 = var3;
      this.f5000 = var4;
      this.f6000 = var6;
      if (var7 != null) {
         this.f8000 = var7.m8000();
         this.f9000 = var7.m6000();
         this.f10000 = var7.m2000();
         this.f11000 = var7.m8000().m6000();
      } else {
         this.f8000 = null;
         this.f9000 = -1;
         this.f10000 = null;
         this.f11000 = Float.NaN;
      }
   }

   public void m8000() {
      if (this.f5000 != 0L) {
         MSDFGenExt.msdf_ft_font_destroy(this.f5000);
         this.f5000 = 0L;
      }

      if (this.f4000 != 0L) {
         org.lwjgl.util.freetype.FreeType.FT_Done_Face(this.f3000);
         org.lwjgl.util.freetype.FreeType.FT_Done_FreeType(this.f4000);
         this.f4000 = 0L;
      }

      if (this.f6000 != null) {
         MemoryUtil.memFree(this.f6000);
         this.f6000 = null;
      }
   }

   private static long m10000() {
      MemoryStack var0 = MemoryStack.stackPush();

      long var2;
      try {
         PointerBuffer var1 = var0.mallocPointer(1);
         m16000(org.lwjgl.util.freetype.FreeType.FT_Init_FreeType(var1), "FT_Init_FreeType");
         var2 = var1.get(0);
      } catch (Throwable var5) {
         if (var0 != null) {
            try {
               var0.close();
            } catch (Throwable var4) {
               var5.addSuppressed(var4);
            }
         }

         throw var5;
      }

      if (var0 != null) {
         var0.close();
      }

      return var2;
   }

   private static long m12000(float var0) {
      return Math.round(var0 * 65536.0);
   }

   private static byte[] m14000(MSDFGenBitmap var0, int var1) {
      MemoryStack var2 = MemoryStack.stackPush();

      byte[] var9;
      try {
         PointerBuffer var3 = var2.mallocPointer(1);
         m42000(MSDFGen.msdf_bitmap_get_pixels(var0, var3), "get_pixels");
         FloatBuffer var4 = MemoryUtil.memFloatBuffer(var3.get(0), var1);
         byte[] var5 = new byte[var1];

         for (int var6 = 0; var6 < var1; var6++) {
            var5[var6] = m22000(var4.get(var6));
         }

         var9 = var5;
      } catch (Throwable var8) {
         if (var2 != null) {
            try {
               var2.close();
            } catch (Throwable var7) {
               var8.addSuppressed(var7);
            }
         }

         throw var8;
      }

      if (var2 != null) {
         var2.close();
      }

      return var9;
   }

   private static void m16000(int var0, String var1) {
      if (var0 != 0) {
         throw new IllegalStateException("FreeType " + var1 + " failed (err=" + var0 + ")");
      }
   }

   public Rec0085 m18000(int var1, int var2, int var3, double var4) {
      return this.m24000(3, 4, true, var1, var2, var3, var4, var4);
   }

   public Rec0083 m20000() {
      return this.f8000;
   }

   public static byte m22000(float var0) {
      int var1 = (int)(var0 * 256.0F);
      if (var1 < 0) {
         var1 = 0;
      } else if (var1 > 255) {
         var1 = 255;
      }

      return (byte)var1;
   }

   private Rec0085 m24000(int var1, int var2, boolean var3, int var4, int var5, int var6, double var7, double var9) {
      MemoryStack var11 = MemoryStack.stackPush();

      Rec0085 var32;
      try {
         DoubleBuffer var12 = var11.mallocDouble(1);
         PointerBuffer var13 = var11.mallocPointer(1);
         m42000(MSDFGenExt.msdf_ft_font_load_glyph(this.f5000, var4, 1, var12, var13), "load_glyph");
         long var14 = var13.get(0);
         long var16 = this.f7000 ? C0265.m22000(var14) : 0L;
         long var18 = var16 != 0L ? var16 : var14;

         try {
            m42000(MSDFGen.msdf_shape_normalize(var18), "shape_normalize");
            if (var16 != 0L) {
               m42000(MSDFGen.msdf_shape_orient_contours(var18), "orient_contours");
            }

            if (var3) {
               m42000(MSDFGen.msdf_shape_edge_colors_simple(var18, 3.0), "edge_colors");
            }

            MSDFGenBounds var20 = MSDFGenBounds.malloc(var11);
            m42000(MSDFGen.msdf_shape_get_bounds(var18, var20), "get_bounds");
            double var21 = Math.max(var20.r() - var20.l(), var20.t() - var20.b());
            double var23 = var21 > 0.0 ? (Math.min(var5, var6) - 2.0 * var9) / var21 : 1.0;
            MSDFGenBitmap var25 = MSDFGenBitmap.malloc(var11);
            m42000(MSDFGen.msdf_bitmap_alloc(var1, var5, var6, var25), "bitmap_alloc");

            try {
               MSDFGenVector2 var26 = MSDFGenVector2.malloc(var11).set(var23, var23);
               MSDFGenVector2 var27 = MSDFGenVector2.malloc(var11).set(var9 / var23 - var20.l(), var9 / var23 - var20.b());
               double var28 = var7 / var23;
               MSDFGenRange var30 = MSDFGenRange.malloc(var11).set(-var28 / 2.0, var28 / 2.0);
               MSDFGenTransform var31 = MSDFGenTransform.malloc(var11);
               var31.set(var26, var27, var30);
               m34000(var1, var25, var18, var31);
               var32 = new Rec0085(m30000(var25, var5 * var6 * var2), var5, var6, var2, var12.get(0));
            } finally {
               MSDFGen.msdf_bitmap_free(var25);
            }
         } finally {
            if (var16 != 0L) {
               MSDFGen.msdf_shape_free(var16);
            }

            MSDFGen.msdf_shape_free(var14);
         }
      } catch (Throwable var46) {
         if (var11 != null) {
            try {
               var11.close();
            } catch (Throwable var43) {
               var46.addSuppressed(var43);
            }
         }

         throw var46;
      }

      if (var11 != null) {
         var11.close();
      }

      return var32;
   }

   public FreeType m26000(boolean var1) {
      this.f7000 = var1;
      return this;
   }

   private static Rec0086 m28000(long var0, FT_Face var2) {
      MemoryStack var3 = MemoryStack.stackPush();

      Object var21;
      label129: {
         Rec0086 var23;
         label130: {
            try {
               PointerBuffer var4 = var3.mallocPointer(1);
               if (org.lwjgl.util.freetype.FreeType.FT_Get_MM_Var(var2, var4) != 0) {
                  var21 = null;
                  break label129;
               }

               FT_MM_Var var5 = FT_MM_Var.create(var4.get(0));

               try {
                  int var6 = var5.num_axis();
                  long var7 = var5.axis().address();
                  long[] var9 = new long[var6];
                  int var10 = -1;
                  Rec0083 var11 = null;

                  for (int var12 = 0; var12 < var6; var12++) {
                     FT_Var_Axis var13 = FT_Var_Axis.create(var7 + (long)var12 * FT_Var_Axis.SIZEOF);
                     var9[var12] = var13.def();
                     if (var13.tag() == 2003265652L) {
                        var10 = var12;
                        var11 = new Rec0083(m50000(var13.minimum()), m50000(var13.def()), m50000(var13.maximum()));
                     }
                  }

                  if (var10 < 0) {
                     var23 = null;
                     break label130;
                  }

                  var23 = new Rec0086(var11, var10, var9);
               } finally {
                  org.lwjgl.util.freetype.FreeType.FT_Done_MM_Var(var0, var5);
               }
            } catch (Throwable var20) {
               if (var3 != null) {
                  try {
                     var3.close();
                  } catch (Throwable var18) {
                     var20.addSuppressed(var18);
                  }
               }

               throw var20;
            }

            if (var3 != null) {
               var3.close();
            }

            return var23;
         }

         if (var3 != null) {
            var3.close();
         }

         return var23;
      }

      if (var3 != null) {
         var3.close();
      }

      return (Rec0086)var21;
   }

   private static float[] m30000(MSDFGenBitmap var0, int var1) {
      MemoryStack var2 = MemoryStack.stackPush();

      float[] var6;
      try {
         PointerBuffer var3 = var2.mallocPointer(1);
         m42000(MSDFGen.msdf_bitmap_get_pixels(var0, var3), "get_pixels");
         FloatBuffer var4 = MemoryUtil.memFloatBuffer(var3.get(0), var1);
         float[] var5 = new float[var1];
         var4.get(var5);
         var6 = var5;
      } catch (Throwable var8) {
         if (var2 != null) {
            try {
               var2.close();
            } catch (Throwable var7) {
               var8.addSuppressed(var7);
            }
         }

         throw var8;
      }

      if (var2 != null) {
         var2.close();
      }

      return var6;
   }

   public Rec0088 m32000(int var1, double var2, double var4, Enum0018 var6) {
      int var7 = (int)Math.ceil(var4 / 2.0) + 1;
      double var8 = var2;
      MemoryStack var10 = MemoryStack.stackPush();

      Rec0088 var46;
      label188: {
         Rec0088 var32;
         try {
            DoubleBuffer var11 = var10.mallocDouble(1);
            PointerBuffer var12 = var10.mallocPointer(1);
            m42000(MSDFGenExt.msdf_ft_font_load_glyph(this.f5000, var1, 1, var11, var12), "load_glyph");
            long var13 = var12.get(0);
            long var15 = this.f7000 ? C0265.m22000(var13) : 0L;
            long var17 = var15 != 0L ? var15 : var13;

            try {
               m42000(MSDFGen.msdf_shape_normalize(var17), "shape_normalize");
               if (var15 != 0L) {
                  m42000(MSDFGen.msdf_shape_orient_contours(var17), "orient_contours");
               }

               if (var6.m2000()) {
                  m42000(MSDFGen.msdf_shape_edge_colors_simple(var17, 3.0), "edge_colors");
               }

               MSDFGenBounds var19 = MSDFGenBounds.malloc(var10);
               m42000(MSDFGen.msdf_shape_get_bounds(var17, var19), "get_bounds");
               double var20 = var19.l();
               double var22 = var19.b();
               double var24 = var19.r();
               double var26 = var19.t();
               double var28 = var24 - var20;
               double var30 = var26 - var22;
               if (var28 > 0.0 && var30 > 0.0) {
                  int var61 = (int)Math.ceil(var28 * var8) + 2 * var7;
                  int var33 = (int)Math.ceil(var30 * var8) + 2 * var7;
                  MSDFGenBitmap var34 = MSDFGenBitmap.malloc(var10);
                  m42000(MSDFGen.msdf_bitmap_alloc(var6.m8000(), var61, var33, var34), "bitmap_alloc");

                  try {
                     MSDFGenVector2 var35 = MSDFGenVector2.malloc(var10).set(var8, var8);
                     MSDFGenVector2 var36 = MSDFGenVector2.malloc(var10).set(var7 / var8 - var20, var7 / var8 - var22);
                     double var37 = var4 / var8;
                     MSDFGenRange var39 = MSDFGenRange.malloc(var10).set(-var37 / 2.0, var37 / 2.0);
                     MSDFGenTransform var40 = MSDFGenTransform.malloc(var10);
                     var40.set(var35, var36, var39);
                     m34000(var6.m8000(), var34, var17, var40);
                     byte[] var41 = m14000(var34, var61 * var33 * var6.m10000());
                     double var42 = var20 - var7 / var8;
                     double var44 = var22 - var7 / var8;
                     var46 = new Rec0088(var41, var61, var33, var6.m10000(), var42, var44, var42 + var61 / var8, var44 + var33 / var8, var11.get(0));
                     break label188;
                  } finally {
                     MSDFGen.msdf_bitmap_free(var34);
                  }
               }

               var32 = new Rec0088(new byte[0], 0, 0, var6.m10000(), 0.0, 0.0, 0.0, 0.0, var11.get(0));
            } finally {
               if (var15 != 0L) {
                  MSDFGen.msdf_shape_free(var15);
               }

               MSDFGen.msdf_shape_free(var13);
            }
         } catch (Throwable var60) {
            if (var10 != null) {
               try {
                  var10.close();
               } catch (Throwable var57) {
                  var60.addSuppressed(var57);
               }
            }

            throw var60;
         }

         if (var10 != null) {
            var10.close();
         }

         return var32;
      }

      if (var10 != null) {
         var10.close();
      }

      return var46;
   }

   private static void m34000(int var0, MSDFGenBitmap var1, long var2, MSDFGenTransform var4) {
      switch (var0) {
         case 0:
            m42000(MSDFGen.msdf_generate_sdf(var1, var2, var4), "generate_sdf");
            break;
         case 1:
            m42000(MSDFGen.msdf_generate_psdf(var1, var2, var4), "generate_psdf");
            break;
         case 2:
            m42000(MSDFGen.msdf_generate_msdf(var1, var2, var4), "generate_msdf");
            break;
         case 3:
            m42000(MSDFGen.msdf_generate_mtsdf(var1, var2, var4), "generate_mtsdf");
            break;
         default:
            throw new IllegalArgumentException("unsupported bitmap type " + var0);
      }
   }

   private static FreeType m36000(long var0, long var2, ByteBuffer var4) {
      FT_Face var5 = FT_Face.create(var2);
      Rec0086 var6 = m28000(var0, var5);
      MemoryStack var7 = MemoryStack.stackPush();

      FreeType var10;
      try {
         PointerBuffer var8 = var7.mallocPointer(1);
         int var9 = MSDFGenExt.msdf_ft_adopt_font(var2, var8);
         if (var9 != 0) {
            org.lwjgl.util.freetype.FreeType.FT_Done_Face(var5);
            org.lwjgl.util.freetype.FreeType.FT_Done_FreeType(var0);
            if (var4 != null) {
               MemoryUtil.memFree(var4);
            }

            throw new IllegalStateException("msdf_ft_adopt_font failed (err=" + var9 + ")");
         }

         var10 = new FreeType(var0, var5, var8.get(0), var4, var6);
      } catch (Throwable var12) {
         if (var7 != null) {
            try {
               var7.close();
            } catch (Throwable var11) {
               var12.addSuppressed(var11);
            }
         }

         throw var12;
      }

      if (var7 != null) {
         var7.close();
      }

      return var10;
   }

   public static FreeType m38000(byte[] var0) {
      long var1 = m10000();
      ByteBuffer var3 = MemoryUtil.memAlloc(var0.length);
      var3.put(var0).flip();
      MemoryStack var4 = MemoryStack.stackPush();

      FreeType var7;
      try {
         PointerBuffer var5 = var4.mallocPointer(1);
         int var6 = org.lwjgl.util.freetype.FreeType.FT_New_Memory_Face(var1, var3, 0L, var5);
         if (var6 != 0) {
            MemoryUtil.memFree(var3);
            org.lwjgl.util.freetype.FreeType.FT_Done_FreeType(var1);
            throw new IllegalStateException("FT_New_Memory_Face failed (err=" + var6 + ")");
         }

         var7 = m36000(var1, var5.get(0), var3);
      } catch (Throwable var9) {
         if (var4 != null) {
            try {
               var4.close();
            } catch (Throwable var8) {
               var9.addSuppressed(var8);
            }
         }

         throw var9;
      }

      if (var4 != null) {
         var4.close();
      }

      return var7;
   }

   public static FreeType m40000(String var0) {
      long var1 = m10000();
      MemoryStack var3 = MemoryStack.stackPush();

      FreeType var6;
      try {
         PointerBuffer var4 = var3.mallocPointer(1);
         int var5 = org.lwjgl.util.freetype.FreeType.FT_New_Face(var1, var0, 0L, var4);
         if (var5 != 0) {
            org.lwjgl.util.freetype.FreeType.FT_Done_FreeType(var1);
            throw new IllegalStateException("FT_New_Face failed for '" + var0 + "' (err=" + var5 + ")");
         }

         var6 = m36000(var1, var4.get(0), null);
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

      return var6;
   }

   private static void m42000(int var0, String var1) {
      if (var0 != 0) {
         throw new IllegalStateException("msdfgen " + var1 + " failed (err=" + var0 + ")");
      }
   }

   public FreeType m44000(float var1) {
      if (!Float.isFinite(var1) || var1 <= 0.0F) {
         throw new IllegalArgumentException("weight must be finite and positive");
      } else if (this.f8000 == null) {
         throw new IllegalStateException("font has no variable 'wght' axis; weight cannot be applied");
      } else {
         float var2 = Math.max(this.f8000.m8000(), Math.min(this.f8000.m2000(), var1));
         this.m6000(var2);
         this.f11000 = var2;
         return this;
      }
   }

   public Rec0085 m46000(int var1, int var2, int var3, double var4) {
      return this.m24000(2, 3, true, var1, var2, var3, var4, var4);
   }

   public int m48000(int var1) {
      MemoryStack var2 = MemoryStack.stackPush();

      int var4;
      try {
         IntBuffer var3 = var2.mallocInt(1);
         m42000(MSDFGenExt.msdf_ft_font_get_glyph_index(this.f5000, var1, var3), "get_glyph_index");
         var4 = var3.get(0);
      } catch (Throwable var6) {
         if (var2 != null) {
            try {
               var2.close();
            } catch (Throwable var5) {
               var6.addSuppressed(var5);
            }
         }

         throw var6;
      }

      if (var2 != null) {
         var2.close();
      }

      return var4;
   }

   private static float m50000(long var0) {
      return (float)(var0 / 65536.0);
   }

   public boolean m52000() {
      return this.f7000;
   }
}
