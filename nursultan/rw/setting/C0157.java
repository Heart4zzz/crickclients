package rw.setting;

import com.mojang.blaze3d.opengl.GlStateManager;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse.BodyHandlers;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import joptsimple.ArgumentAcceptingOptionSpec;
import joptsimple.OptionParser;
import joptsimple.OptionSet;
import joptsimple.OptionSpec;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL12;
import org.lwjgl.stb.STBImage;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import rw.NursultanClient;
import rw.core.C0959;
import rw.core.C1145;
import rw.core.C1189;
import rw.data.Rec0287;

public class C0157 {
   private static boolean[] f1000;
   private static boolean[] f2000;
   private static String[] f3000;
   private static String[] f4000;
   private static boolean[] f5000;
   private static boolean[] f6000;
   private static String[] f7000;
   private static String[] f8000;
   private static String[] f9000;
   private static boolean[] f10000;
   public static Object[] f11000;
   private static String[] f12000;
   private static boolean[] f13000;

   private C0157() {
      throw new UnsupportedOperationException(f9000[3]);
   }

   static {
      ntfClinit();
   }

   private static List<String> m24000(String var0) {
      String var1 = var0.substring(1, var0.length() - 1);
      return Arrays.asList(var1.split(f3000[1]));
   }

   private static void m32000() {
      f13000 = new boolean[]{true, true, true, true, true};
      f2000 = new boolean[]{true, true};
      f6000 = new boolean[]{false, false, false, false};
      f10000 = new boolean[]{false, false, false, false, false, true, false, false};
      f1000 = new boolean[]{false, true, false, false, false};
      f5000 = new boolean[]{true, false, false, true, true};
   }

   private static void m42000(String var0) {
      if (var0 != null) {
         var0 = var0.trim();
         if (!var0.isEmpty() && !f12000[0].equalsIgnoreCase(var0)) {
            HttpRequest var1;
            try {
               var1 = HttpRequest.newBuilder().uri(URI.create(var0)).GET().timeout(Duration.ofSeconds(20L)).build();
            } catch (IllegalArgumentException var3) {
               ((Logger)f11000[0]).warn(f12000[1], var3);
               return;
            }

            ((HttpClient)f11000[2]).sendAsync(var1, BodyHandlers.ofByteArray()).thenAccept(var0x -> {
               if (var0x.statusCode() != 200) {
                  ((Logger)f11000[0]).warn(f9000[5], var0x.statusCode());
               } else {
                  Rec0287 var1x = m82000(var0x.body());
                  if (var1x != null) {
                     C1189.m22000(() -> m74000(var1x));
                  }
               }
            }).exceptionally(var0x -> {
               ((Logger)f11000[0]).error(f9000[4], var0x);
               return null;
            });
         }
      }
   }

   private static void m66000() {
      f11000 = new Object[]{null, 23492078405000L, null};
   }

   private static void m74000(Rec0287 var0) {
      ByteBuffer var1 = null;
      int var2 = 0;
      int var3 = 0;
      byte var4 = 0;
      byte var5 = 0;

      try {
         var1 = MemoryUtil.memAlloc(var0.f3000.length);
         var1.put(var0.f3000).flip();
         var3 = GL12.glGetInteger(32873);
         var4 = 1;
         var2 = GL12.glGenTextures();
         if (var2 != 0) {
            GlStateManager._bindTexture(var2);
            GlStateManager._texParameter(3553, 10240, 9729);
            GlStateManager._texParameter(3553, 10241, 9729);
            GlStateManager._texParameter(3553, 10242, 33071);
            GlStateManager._texParameter(3553, 10243, 33071);
            GlStateManager._pixelStore(3314, 0);
            GlStateManager._pixelStore(3316, 0);
            GlStateManager._pixelStore(3315, 0);
            GlStateManager._pixelStore(3317, 1);
            GL12.glTexImage2D(3553, 0, 32856, var0.f2000, var0.f1000, 0, 6408, 5121, var1);
            int var6 = ((C0959)NursultanClient.f13000[2]).m30000();
            int var7 = var3 == var6 ? 0 : var3;
            GlStateManager._bindTexture(var7);
            var5 = 1;
            ((C0959)NursultanClient.f13000[2]).m54000(var2);
            var2 = 0;
            if (var6 > 0) {
               GL12.glDeleteTextures(var6);
            }

            return;
         }

         ((Logger)f11000[0]).warn(f9000[1]);
      } catch (Exception var11) {
         ((Logger)f11000[0]).error(f9000[2], var11);
         return;
      } finally {
         if (var4 != 0 && var5 == 0) {
            GlStateManager._bindTexture(var3);
         }

         if (var2 != 0) {
            GL12.glDeleteTextures(var2);
         }

         if (var1 != null) {
            MemoryUtil.memFree(var1);
         }
      }
   }

   public static void m78000(String[] var0, OptionParser var1) {
      Long var18 = System.nanoTime();
      f11000[1] = var18;
      var1.allowsUnrecognizedOptions();
      ArgumentAcceptingOptionSpec var2 = var1.accepts(f4000[0]).withRequiredArg().ofType(Long.class);
      ArgumentAcceptingOptionSpec var3 = var1.accepts(f4000[1]).withRequiredArg();
      ArgumentAcceptingOptionSpec var4 = var1.accepts(f4000[2]).withRequiredArg().ofType(Integer.class);
      ArgumentAcceptingOptionSpec var5 = var1.accepts(f4000[3]).withRequiredArg();
      ArgumentAcceptingOptionSpec var6 = var1.accepts(f4000[4]).withRequiredArg();
      ArgumentAcceptingOptionSpec var7 = var1.accepts(f4000[5]).withRequiredArg();
      ArgumentAcceptingOptionSpec var8 = var1.accepts(f8000[0]).withRequiredArg();
      ArgumentAcceptingOptionSpec var9 = var1.accepts(f8000[1]).withRequiredArg();
      var1.accepts(f8000[2]);
      var1.accepts(f8000[3]);
      OptionSet var10 = var1.parse(var0);
      ((C0959)NursultanClient.f13000[2]).m56000(m88000(var10, var3, f8000[4]));
      ((C0959)NursultanClient.f13000[2]).m40000(m88000(var10, var4, f8000[5]));
      ((C0959)NursultanClient.f13000[2]).m50000(m88000(var10, var2, f8000[6]) / 60L);
      ((C0959)NursultanClient.f13000[2]).m64000(new C1145(m88000(var10, var5, f7000[0])));
      ((C0959)NursultanClient.f13000[2]).m36000(m88000(var10, var6, f7000[1]));
      ((C0959)NursultanClient.f13000[2]).m6000(m88000(var10, var9, f7000[2]));
      String var11 = m88000(var10, var8, f7000[3]);
      List var12 = m24000(var11);
      ((C0959)NursultanClient.f13000[2]).m58000(var12.contains(f7000[4]));
      String var13 = m88000(var10, var7, f7000[5]);
      m42000(var13);
      if (var10.has(f7000[6])) {
         Boolean var19 = true;
         NursultanClient.f13000[3] = var19;
      }

      if (var10.has(f3000[0])) {
         Boolean var20 = true;
         NursultanClient.f13000[4] = var20;
      }
   }

   private static Rec0287 m82000(byte[] var0) {
      if (var0 != null && var0.length != 0) {
         ByteBuffer var1 = null;
         ByteBuffer var2 = null;

         try {
            MemoryStack var3 = MemoryStack.stackPush();

            Object var19;
            label226: {
               Object var22;
               label227: {
                  Rec0287 var10;
                  label228: {
                     try {
                        var1 = MemoryUtil.memAlloc(var0.length);
                        var1.put(var0).flip();
                        IntBuffer var4 = var3.mallocInt(1);
                        IntBuffer var5 = var3.mallocInt(1);
                        IntBuffer var6 = var3.mallocInt(1);
                        if (!STBImage.stbi_info_from_memory(var1, var4, var5, var6)) {
                           ((Logger)f11000[0]).warn(f12000[3], STBImage.stbi_failure_reason());
                           var19 = null;
                           break label226;
                        }

                        int var7 = var4.get(f6000[0]);
                        int var8 = var5.get(f6000[1]);
                        if (var7 > 0 && var8 > 0) {
                           var1.position(f6000[2]);
                           var2 = STBImage.stbi_load_from_memory(var1, var4, var5, var6, 4);
                           if (var2 == null) {
                              ((Logger)f11000[0]).warn(f9000[0], STBImage.stbi_failure_reason());
                              var22 = null;
                              break label227;
                           }

                           int var18 = var4.get(f6000[3]);
                           var8 = var5.get(0);
                           byte[] var21 = new byte[var18 * var8 * 4];
                           var2.get(var21);
                           var10 = new Rec0287(var18, var8, var21);
                           break label228;
                        }

                        ((Logger)f11000[0]).warn(f12000[4], var7, var8);
                        var22 = null;
                     } catch (Throwable var16) {
                        if (var3 != null) {
                           try {
                              var3.close();
                           } catch (Throwable var15) {
                              var16.addSuppressed(var15);
                           }
                        }

                        throw var16;
                     }

                     if (var3 != null) {
                        var3.close();
                     }

                     return (Rec0287)var22;
                  }

                  if (var3 != null) {
                     var3.close();
                  }

                  return var10;
               }

               if (var3 != null) {
                  var3.close();
               }

               return (Rec0287)var22;
            }

            if (var3 != null) {
               var3.close();
            }

            return (Rec0287)var19;
         } finally {
            if (var2 != null) {
               STBImage.stbi_image_free(var2);
            }

            if (var1 != null) {
               MemoryUtil.memFree(var1);
            }
         }
      } else {
         ((Logger)f11000[0]).warn(f12000[2]);
         return null;
      }
   }

   private static <T> T m88000(OptionSet var0, OptionSpec<T> var1, String var2) {
      if (!var0.has(var1)) {
         throw new IllegalArgumentException(var2);
      } else {
         return (T)var0.valueOf(var1);
      }
   }

   public static long m96000() {
      return (Long)f11000[1];
   }

   private static void m102000() {
      f4000 = new String[]{"subscribeTimeLeft", "login", "uid", "role", "hash", "avatar"};
      f8000 = new String[]{
         "boughtProducts",
         "apiToken",
         "debug",
         "checkLocalization",
         "No such userdata: login!",
         "No such userdata: uid!",
         "No such userdata: subscribe time left!"
      };
      f7000 = new String[]{
         "No such userdata: role!",
         "No such userdata: hash!",
         "No such userdata: api token!",
         "No such userdata: bought products!",
         "premium",
         "No such userdata: user avatar!",
         "debug"
      };
      f3000 = new String[]{"checkLocalization", "\\s*,\\s*"};
      f12000 = new String[]{
         "null",
         "Failed to load avatar texture: invalid avatar URL",
         "Failed to load avatar texture: empty response body",
         "Failed to read avatar texture info: {}",
         "Failed to load avatar texture: invalid dimensions {}x{}"
      };
      f9000 = new String[]{
         "Failed to decode avatar texture: {}",
         "Failed to allocate avatar GL texture",
         "Failed to upload avatar texture",
         "This is a utility class and cannot be instantiated",
         "Failed to load avatar texture asynchronously!",
         "Failed to load avatar texture, status: {}"
      };
   }
}
