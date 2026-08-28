package rw.core;

import KDFzREm.NNNG;
import KDFzREm.NNuU;
import KDFzREm.pz;
import KDFzREm.qZ;
import com.mojang.blaze3d.opengl.GlStateManager;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL33;
import org.lwjgl.stb.STBImage;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import rw.NursultanClient;
import rw.api.Iface0637;
import rw.api.Iface0638;
import rw.data.IlltikIi;
import rw.data.Rec0124;
import rw.data.Rec0232;
import rw.data.Rec0237;
import rw.data.Rec0239;
import rw.data.Rec0250;
import rw.defs.Enum0030;
import rw.defs.Enum0079;

public class C1072 {
   private static short[] f1000;
   public static Object[] f2000;
   private static short[] f3000;
   private static short[] f4000;
   public Object[] f5000;
   private static boolean[] f6000;
   public Object[] f7000;
   private static short[] f8000;
   private static short[] f9000;
   private static short[] f10000;
   private static short[] f11000;
   private static boolean[] f12000;
   private static String[] f13000;
   private static short[] f14000;
   private static boolean[] f15000;
   private static short[] f16000;
   private static short[] f17000;
   private static boolean[] f18000;
   private static short[] f19000;
   private static boolean[] f20000;
   private static short[] f21000;
   private static short[] f22000;
   private static boolean[] f23000;
   private static short[] f24000;
   private static short[] f25000;
   private static boolean[] f26000;
   private static short[] f27000;
   private static float[] f28000;
   private static short[] f29000;
   private static boolean[] f30000;
   private static short[] f31000;
   private static short[] f32000;
   private static short[] f33000;

   private static void m4000() {
      f13000 = new String[]{
         "icon:",
         "glidfy:",
         "glid:",
         "mcatlas:",
         "Resource not found",
         "Image decode failed",
         "Failed to create UI atlas texture",
         "Failed to decode texture '{}': {}"
      };
   }

   private static Rec0232 m8000(String var0) {
      if (var0.isEmpty()) {
         return (Rec0232)Rec0232.f16000[0];
      } else {
         NNNG var1 = NNNG.L(var0);
         if (var1 == null) {
            var1 = NNNG.y(var0);
         }

         qZ var2 = NNuU.Nq().NO().y(var1);
         if (var2 != null && var2.method_68004() instanceof pz var3) {
            int var5 = var3.N();
            if (var5 <= 0) {
               return (Rec0232)Rec0232.f16000[0];
            } else {
               m50000(var5);
               return Rec0232.m44000(var5, 0, 0);
            }
         } else {
            return (Rec0232)Rec0232.f16000[0];
         }
      }
   }

   public C1072(C1117 var1) {
      this.m44000();
      ConcurrentLinkedQueue var6 = new ConcurrentLinkedQueue();
      this.f7000[0] = var6;
      Object2ObjectOpenHashMap var7 = new Object2ObjectOpenHashMap();
      this.f7000[1] = var7;
      Object2ObjectOpenHashMap var8 = new Object2ObjectOpenHashMap();
      this.f7000[2] = var8;
      ArrayDeque var9 = new ArrayDeque();
      this.f7000[f31000[0]] = var9;
      C1132 var10 = new C1132();
      this.f7000[f31000[1]] = var10;
      C1113 var11 = new C1113();
      this.f5000[f31000[2]] = var11;
      rw.setting.C0025 var12 = new rw.setting.C0025(Enum0030.f1000, f31000[3], f31000[4], 1, 64);
      this.f5000[2] = var12;
      this.f5000[1] = var1;
   }

   static {
      ntfClinit();
   }

   private static void m22000() {
      f25000 = new short[]{0, 1, 2};
      f31000 = new short[]{3, 4, 0, 512, 512};
      f4000 = new short[]{2, 1, 0, 1, 0, 0, 0, 0};
      f22000 = new short[]{2, 0, 4, 2, 0, 0, 0};
      f3000 = new short[]{6, 3553, 10240, 9728, 3553, 10241};
      f29000 = new short[]{9728, 6, 0, 0, 2, 0, 1};
      f1000 = new short[]{0, 0, 2, 1, 1, 4, 0};
      f27000 = new short[]{0, 256, 256, 0};
      f14000 = new short[]{0, 0, 1};
      f32000 = new short[]{0, 0, 2, 0, 3, 1, 0};
      f19000 = new short[]{1, 3, 4, 3, 2, 0};
      f24000 = new short[]{3, 1, 0, 2, 3};
      f11000 = new short[]{4, 7, 2, 2};
      f9000 = new short[]{4, 2, 4, 5, 4, 0};
      f10000 = new short[]{4, 4, 3, 2, 0};
      f8000 = new short[]{4, 2, 2, 5, 0, 4, 2, 2};
      f17000 = new short[]{2, 0, 3, 3, 3, 3, 3, 3};
      f33000 = new short[]{3, 3, 3, 3, 0};
      f21000 = new short[]{255, 255};
      f16000 = new short[]{255, 255, 255, 0, 4, 512, 512, 256};
   }

   private ByteBuffer m26000(int var1) {
      if ((ByteBuffer)this.f5000[3] == null) {
         ByteBuffer var6 = MemoryUtil.memAlloc(var1);
         this.f5000[3] = var6;
         ((ByteBuffer)this.f5000[3]).clear();
         return (ByteBuffer)this.f5000[3];
      } else {
         if (((ByteBuffer)this.f5000[3]).capacity() < var1) {
            ByteBuffer var7 = MemoryUtil.memRealloc((ByteBuffer)this.f5000[3], var1);
            this.f5000[3] = var7;
         }

         ((ByteBuffer)this.f5000[3]).clear();
         return (ByteBuffer)this.f5000[3];
      }
   }

   private void m28000(String var1) {
      ((Map)this.f7000[1]).put(var1, C1042.m8000());
      ((ExecutorService)NursultanClient.f13000[1]).execute(() -> this.m82000(var1));
   }

   private void m30000() {
      String var1;
      while ((var1 = (String)((Queue)this.f7000[3]).poll()) != null) {
         ((Logger)f2000[0]).warn(var1);
      }
   }

   private Rec0232 m34000(String var1) {
      int var2 = var1.indexOf(47, 5);
      if (var2 > 5 && var2 != var1.length() - 1) {
         String var3 = var1.substring(5, var2);
         String var4 = var1.substring(var2 + 1);
         C1112 var5 = ((C1117)this.f5000[1]).m24000(var3);
         if (var5 == null) {
            return (Rec0232)Rec0232.f16000[0];
         } else {
            Rec0250 var6 = var5.m28000(var4);
            if (var6 == null) {
               return (Rec0232)Rec0232.f16000[0];
            } else {
               float var7 = var6.m8000() <= f28000[0] ? f28000[1] : var6.m2000() / var6.m8000();
               int var8 = var5.m24000();
               Rec0232 var9 = Rec0232.m36000(var8, var5.m20000(), var5.m12000(), var6.m6000(), var6.m10000(), var6.m14000(), var6.m12000(), var5.m2000(), var7);
               ((Map)this.f7000[2]).put(var1, new IlltikIi(var5, var8, var9));
               return var9;
            }
         }
      } else {
         return (Rec0232)Rec0232.f16000[0];
      }
   }

   private static void m38000() {
      f28000 = new float[]{0.0F, 1.0F};
   }

   private Rec0232 m40000(String var1) {
      IlltikIi var2 = (IlltikIi)((Map)this.f7000[2]).get(var1);
      return var2 != null && var2.f2000.m24000() == var2.f1000 ? var2.f3000 : this.m34000(var1);
   }

   private static void m42000() {
      f2000 = new Object[]{null, 512, 512, 1, 64, 256, 0};
   }

   private void m44000() {
      if (this.f7000 == null) {
         this.f7000 = new Object[5];
         Object[] var1 = this.f7000;
      }

      if (this.f5000 == null) {
         this.f5000 = new Object[6];
         Object[] var2 = this.f5000;
         var2[4] = 0;
         var2[5] = 0;
      }
   }

   private static void m50000(int var0) {
      if (var0 != (Integer)f2000[6]) {
         int var1 = GL33.glGetInteger(32873);
         GlStateManager._bindTexture(var0);
         GlStateManager._texParameter(3553, 10240, 9728);
         GlStateManager._texParameter(3553, 10241, 9728);
         GlStateManager._bindTexture(var1);
         Integer var6 = var0;
         f2000[6] = var6;
      }
   }

   public void m54000() {
      this.m56000();
      this.m30000();
   }

   private void m56000() {
      boolean var1 = f12000[0];

      Rec0239 var2;
      while ((var2 = (Rec0239)((Queue)this.f7000[0]).poll()) != null) {
         C1042 var3 = (C1042)((Map)this.f7000[1]).get(var2.f5000);
         if (var3 != null && (Enum0079)var3.f1000[0] == (Enum0079)Enum0079.f2000[0]) {
            if (var2.f2000 != null) {
               Enum0079 var9 = (Enum0079)Enum0079.f2000[2];
               var3.f1000[0] = var9;
               ((Queue)this.f7000[3]).add("Failed to decode UI texture '" + var2.f5000 + "': " + var2.f2000);
            } else {
               if (var2.f3000 != null) {
                  C0350 var4 = this.m62000(var2);
                  if (var4 != null) {
                     Enum0079 var10 = (Enum0079)Enum0079.f2000[1];
                     var3.f1000[0] = var10;
                     var3.f1000[1] = var4;
                     Integer var12 = var2.f4000;
                     var3.f1000[3] = var12;
                     Integer var13 = var2.f6000;
                     var3.f1000[4] = var13;
                     var1 = f12000[1];
                     continue;
                  }

                  ((Queue)this.f7000[3]).add("Atlas is full, using direct fallback for UI texture '" + var2.f5000 + "'");
               }

               int var20 = this.m66000(var2.f4000, var2.f6000, var2.f1000);
               if (var20 <= 0) {
                  Enum0079 var14 = (Enum0079)Enum0079.f2000[2];
                  var3.f1000[0] = var14;
                  ((Queue)this.f7000[3]).add("Failed to upload UI texture '" + var2.f5000 + "'");
               } else {
                  Enum0079 var15 = (Enum0079)Enum0079.f2000[1];
                  var3.f1000[0] = var15;
                  Integer var16 = var20;
                  var3.f1000[2] = var16;
                  Integer var17 = var2.f4000;
                  var3.f1000[3] = var17;
                  Integer var18 = var2.f6000;
                  var3.f1000[4] = var18;
                  Rec0232 var19 = Rec0232.m44000(var20, var2.f4000, var2.f6000);
                  var3.f1000[7] = var19;
               }
            }
         }
      }

      if (var1) {
         this.m84000();
      }
   }

   public Rec0232 m60000(String var1) {
      if (var1.isEmpty()) {
         return (Rec0232)Rec0232.f16000[0];
      } else if (var1.startsWith(f13000[0])) {
         return this.m40000(var1);
      } else if (var1.startsWith(f13000[1])) {
         return m76000(var1, 7, true);
      } else if (var1.startsWith(f13000[2])) {
         return m76000(var1, 5, false);
      } else if (var1.startsWith(f13000[3])) {
         return m8000(var1.substring(8));
      } else {
         C1042 var2 = (C1042)((Map)this.f7000[1]).get(var1);
         if (var2 == null) {
            this.m28000(var1);
            return (Rec0232)Rec0232.f16000[0];
         } else {
            return (Enum0079)var2.f1000[0] != (Enum0079)Enum0079.f2000[0] && (Enum0079)var2.f1000[0] != (Enum0079)Enum0079.f2000[2]
               ? var2.m14000((Integer)this.f5000[4], ((rw.setting.C0025)this.f5000[2]).m2000())
               : (Rec0232)Rec0232.f16000[0];
         }
      }
   }

   private C0350 m62000(Rec0239 var1) {
      try {
         return ((rw.setting.C0025)this.f5000[2]).m88000(var1.f3000, var1.f4000, var1.f6000);
      } catch (IllegalStateException var3) {
         return null;
      }
   }

   public int m64000() {
      return (Integer)this.f5000[4];
   }

   private int m66000(int var1, int var2, byte[] var3) {
      ByteBuffer var4 = this.m26000(var3.length);
      var4.put(var3);
      var4.flip();
      return ((Iface0637)this.f5000[0]).m6000(var1, var2, var4);
   }

   private static byte[] m70000(Rec0237 var0) {
      byte[] var1 = var0.f3000;
      byte[] var2 = new byte[var0.f2000 * var0.f1000];
      byte var3 = 0;

      for (int var4 = 0; var3 < var1.length; var4++) {
         int var5 = var1[var3] & 255;
         int var6 = var1[var3 + 1] & 255;
         int var7 = var1[var3 + 2] & 255;
         int var8 = var1[var3 + 3] & 255;
         if (var8 == 0) {
            var2[var4] = 0;
         } else {
            if (var5 != var6 || var6 != var7) {
               return null;
            }

            int var9 = (var8 * var5 + 127) / 255;
            var2[var4] = (byte)var9;
         }

         var3 += 4;
      }

      return var2;
   }

   private ByteBuffer m72000(int var1, int var2, int var3, int var4) {
      int var5 = var3 * var4;
      ByteBuffer var6 = this.m26000(var5);
      byte[] var7 = ((rw.setting.C0025)this.f5000[2]).m16000();
      int var8 = ((rw.setting.C0025)this.f5000[2]).m62000();

      for (int var9 = 0; var9 < var4; var9++) {
         int var10 = (var2 + var9) * var8 + var1;
         var6.put(var7, var10, var3);
      }

      var6.flip();
      return var6;
   }

   private static Rec0237 m74000(byte[] var0, String var1) {
      ByteBuffer var2 = null;
      ByteBuffer var3 = null;

      try {
         MemoryStack var4 = MemoryStack.stackPush();

         Object var19;
         label136: {
            Rec0237 var11;
            try {
               var2 = MemoryUtil.memAlloc(var0.length);
               var2.put(var0).flip();
               IntBuffer var5 = var4.mallocInt(1);
               IntBuffer var6 = var4.mallocInt(1);
               IntBuffer var7 = var4.mallocInt(1);
               var3 = STBImage.stbi_load_from_memory(var2, var5, var6, var7, 4);
               if (var3 == null) {
                  ((Logger)f2000[0]).warn(f13000[7], var1, STBImage.stbi_failure_reason());
                  var19 = null;
                  break label136;
               }

               int var8 = var5.get(0);
               int var9 = var6.get(0);
               byte[] var10 = new byte[var8 * var9 * 4];
               var3.get(var10);
               var11 = new Rec0237(var8, var9, var10);
            } catch (Throwable var17) {
               if (var4 != null) {
                  try {
                     var4.close();
                  } catch (Throwable var16) {
                     var17.addSuppressed(var16);
                  }
               }

               throw var17;
            }

            if (var4 != null) {
               var4.close();
            }

            return var11;
         }

         if (var4 != null) {
            var4.close();
         }

         return (Rec0237)var19;
      } finally {
         if (var3 != null) {
            STBImage.stbi_image_free(var3);
         }

         if (var2 != null) {
            MemoryUtil.memFree(var2);
         }
      }
   }

   private static Rec0232 m76000(String var0, int var1, boolean var2) {
      try {
         int var3 = Integer.parseInt(var0, var1, var0.length(), 10);
         if (var3 <= 0) {
            return (Rec0232)Rec0232.f16000[0];
         } else {
            return var2 ? Rec0232.m30000(var3, 0, 0) : Rec0232.m44000(var3, 0, 0);
         }
      } catch (NumberFormatException var4) {
         return (Rec0232)Rec0232.f16000[0];
      }
   }

   private static void m80000() {
      f20000 = new boolean[]{true, true, false, false, false, false, false};
      f15000 = new boolean[]{false, false, true, true, true, false};
      f12000 = new boolean[]{false, true, true, false, false, false};
      f30000 = new boolean[]{false, false, true, false, false};
      f18000 = new boolean[]{false, false};
      f6000 = new boolean[]{false, true, false, true, true};
      f26000 = new boolean[]{true, false, false, false, false, false, true, true};
      f23000 = new boolean[]{false};
   }

   private void m82000(String var1) {
      try {
         byte[] var2 = ((Iface0638)this.f7000[4]).m2000(var1);
         if (var2 == null || var2.length == 0) {
            ((Queue)this.f7000[0]).add(Rec0239.m14000(var1, f13000[4]));
            return;
         }

         Rec0237 var3 = m74000(var2, var1);
         if (var3 == null) {
            ((Queue)this.f7000[0]).add(Rec0239.m14000(var1, f13000[5]));
            return;
         }

         byte[] var4 = m70000(var3);
         int var5 = var4 != null && var3.f2000 <= 256 && var3.f1000 <= 256 ? 1 : 0;
         ((Queue)this.f7000[0]).add(Rec0239.m16000(var1, var3.f2000, var3.f1000, var3.f3000, var5 != 0 ? var4 : null));
      } catch (Exception var6) {
         ((Queue)this.f7000[0]).add(Rec0239.m14000(var1, var6.getMessage()));
      }
   }

   private void m84000() {
      Rec0124[] var1 = ((rw.setting.C0025)this.f5000[2]).m50000();
      if (var1.length != 0 || (Integer)this.f5000[4] == 0) {
         int var2 = ((rw.setting.C0025)this.f5000[2]).m2000();
         boolean var3 = this.f5000[4] != 0 && this.f5000[5] == var2 ? f12000[3] : f12000[2];
         if ((Integer)this.f5000[4] == 0) {
            Integer var13 = ((Iface0637)this.f5000[0]).m4000();
            this.f5000[4] = var13;
         }

         if ((Integer)this.f5000[4] == 0) {
            ((Queue)this.f7000[3]).add(f13000[6]);
         } else if (var3) {
            ByteBuffer var15 = this.m72000(f12000[4], f12000[5], ((rw.setting.C0025)this.f5000[2]).m62000(), var2);
            ((Iface0637)this.f5000[0])
               .m2000(
                  (Integer)this.f5000[4],
                  0,
                  0,
                  ((rw.setting.C0025)this.f5000[2]).m62000(),
                  var2,
                  ((rw.setting.C0025)this.f5000[2]).m62000(),
                  var2,
                  (boolean)1,
                  var15
               );
            Integer var14 = var2;
            this.f5000[5] = var14;
         } else {
            for (Rec0124 var7 : var1) {
               ByteBuffer var8 = this.m72000(var7.m2000(), var7.m8000(), var7.m6000(), var7.m14000());
               ((Iface0637)this.f5000[0])
                  .m2000(
                     (Integer)this.f5000[4],
                     var7.m2000(),
                     var7.m8000(),
                     var7.m6000(),
                     var7.m14000(),
                     ((rw.setting.C0025)this.f5000[2]).m62000(),
                     var2,
                     (boolean)0,
                     var8
                  );
            }
         }
      }
   }
}
