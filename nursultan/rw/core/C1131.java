package rw.core;

import KDFzREm.HD;
import KDFzREm.NNNAB;
import KDFzREm.NNNG;
import KDFzREm.NNuU;
import KDFzREm.NlT;
import KDFzREm.pz;
import KDFzREm.qZ;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.yggdrasil.ProfileResult;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
import rw.gui.IlkOns;
import rw.gui.ThemeManager;

public class C1131 {
   private static boolean[] f1000;
   public static Object[] f2000;
   private static byte[] f3000;
   private static byte[] f4000;
   private static byte[] f5000;
   private static short[] f6000;
   private static String[] f7000;
   private static float[] f8000;

   private static Supplier<NNNAB> m6000(UUID var0) {
      AtomicReference var1 = new AtomicReference<>(HD.N(var0));
      CompletableFuture.<ProfileResult>supplyAsync(() -> ((MinecraftSessionService)f2000[f6000[5]]).fetchProfile(var0, f1000[0]), NlT.Z())
         .thenCompose(var0x -> var0x != null ? ((NNuU)f2000[f6000[4]]).yP().N(var0x.profile()) : CompletableFuture.completedFuture(Optional.empty()))
         .thenAccept(var1x -> var1x.ifPresent(var1::set))
         .exceptionally(var0x -> null);
      return var1::get;
   }

   private static void m8000() {
      f7000 = new String[5];
      f7000[(0 | -0) >>> 31] = "u_projection";
      f7000[(1 | -1) >>> 31] = "u_view";
      f7000[2] = "u_size";
      f7000[3] = "u_radius";
      f7000[4] = "texture_in";
   }

   private C1131() {
   }

   static {
      ntfClinit();
   }

   private static void m10000() {
      short[] var128 = new short[6];
      f6000[(0 | -0) >>> 31] = 2;
      f6000[(1 | -1) >>> 31] = 5;
      f6000[2] = 6;
      f6000[3] = 4;
      f6000[4] = 2;
      f6000[5] = 3;
   }

   private static void m20000() {
      boolean[] var128 = new boolean[4];
      f1000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f1000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f1000[2] = (boolean)((0 | -0) >>> 31);
      f1000[3] = (boolean)((1 | -1) >>> 31);
   }

   private static void m24000() {
      byte[] var128 = new byte[4];
      f5000[(0 | -0) >>> 31] = -1;
      f5000[(1 | -1) >>> 31] = 4;
      f5000[2] = 2;
      f5000[3] = 2;
      byte[] var129 = new byte[6];
      f3000[(0 | -0) >>> 31] = 3;
      f3000[(1 | -1) >>> 31] = 4;
      f3000[2] = 2;
      f3000[3] = 4;
      f3000[4] = 6;
      f3000[5] = 5;
      byte[] var130 = new byte[6];
      f4000[(0 | -0) >>> 31] = 2;
      f4000[(1 | -1) >>> 31] = 4;
      f4000[2] = 5;
      f4000[3] = 6;
      f4000[4] = 7;
      f4000[5] = 32;
   }

   public static void m36000(UUID var0, String var1, float var2, float var3, float var4, float var5) {
      NNNG var6 = m40000(var0, var1);
      if (var6 != null) {
         qZ var7 = ((NNuU)f2000[f6000[0]]).NO().y(var6);
         if (var7.method_68004() instanceof pz var8) {
            int var10 = var8.N();
            C0806.m32000((C0830)f2000[f6000[1]], var2, var3, var4, var5, f8000[0], f8000[1], f8000[2], f8000[3], f5000[0]);
            ((C0805)f2000[f6000[2]]).m32000(var3x -> {
               var3x.m66000(f7000[0]).m18000(IlkOns.m10000());
               var3x.m66000(f7000[1]).m18000(RenderSystem.getModelViewMatrix());
               var3x.m106000(f7000[2]).m18000(var4, var5);
               var3x.m32000(f7000[3]).m20000(f8000[4] * ThemeManager.m4000());
               var3x.m10000(f7000[4]).m8000(var10);
            });
         }
      }
   }

   private static NNNG m40000(UUID var0, String var1) {
      NNNAB var2;
      if (var0.version() == f5000[1]) {
         var2 = ((Map)f2000[f6000[3]]).computeIfAbsent(var0, var0x -> m6000(var0x)).get();
      } else {
         var2 = HD.N(var0);
      }

      return var2 != null ? var2.N().y() : null;
   }

   private static void m42000() {
      f2000 = new Object[f4000[4]];
      f2000[f1000[2]] = Integer.valueOf(f4000[5]);
      f2000[f1000[3]] = f8000[5];
   }

   private static void m50000() {
      float[] var128 = new float[6];
      f8000[(0 | -0) >>> 31] = Float.intBitsToFloat(0);
      f8000[(1 | -1) >>> 31] = Float.intBitsToFloat(0);
      f8000[2] = Float.intBitsToFloat(1065353216);
      f8000[3] = Float.intBitsToFloat(1065353216);
      f8000[4] = Float.intBitsToFloat(1086324736);
      f8000[5] = Float.intBitsToFloat(1086324736);
   }
}
