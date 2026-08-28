package rw.setting;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplateManager$InputStreamOpener;
import org.apache.logging.log4j.Logger;
import org.lwjgl.openal.AL;
import org.lwjgl.openal.AL10;
import org.lwjgl.openal.ALC;
import org.lwjgl.openal.ALC10;
import org.lwjgl.openal.ALCCapabilities;
import org.lwjgl.openal.EXTThreadLocalContext;
import rw.NursultanClient;
import rw.core.C1196;
import rw.data.Rec0215;
import rw.data.Rec0283;
import rw.defs.Enum0088;

public class C0158 {
   private static float[] f1000;
   private static short[] f2000;
   private static byte[] f3000;
   private static short[] f4000;
   private static long[] f5000;
   private static byte[] f6000;
   private static String[] f7000;
   private static short[] f8000;
   private static boolean[] f9000;
   private static short[] f10000;
   private static short[] f11000;
   public static Object[] f12000;
   private static boolean[] f13000;
   private static boolean[] f14000;
   private static boolean[] f15000;
   private static short[] f16000;
   private static short[] f17000;

   private static float m6000() {
      return (Float)NursultanClient.m88000().m146000().m28000().i() / f1000[0];
   }

   private static boolean m12000() {
      return !NursultanClient.m88000().m146000().U() ? f14000[6] : f14000[7];
   }

   private C0158() {
      throw new UnsupportedOperationException(f7000[5]);
   }

   static {
      ntfClinit();
   }

   private static int m18000() {
      for (int var1 : (List)f12000[f2000[0]]) {
         if (AL10.alGetSourcei(var1, f2000[1]) != f2000[2]) {
            return var1;
         }
      }

      if (((List)f12000[f2000[3]]).size() < f3000[0]) {
         int var3 = AL10.alGenSources();
         if (var3 != 0) {
            ((List)f12000[f2000[4]]).add(var3);
         }

         return var3;
      } else {
         int var2 = (Integer)((List)f12000[f2000[5]]).getFirst();
         AL10.alSourceStop(var2);
         return var2;
      }
   }

   private static void m20000() {
      byte[] var128 = new byte[3];
      f3000[(0 | -0) >>> 31] = 16;
      f3000[(1 | -1) >>> 31] = 8;
      f3000[2] = 2;
      byte[] var129 = new byte[7];
      f6000[(0 | -0) >>> 31] = 3;
      f6000[(1 | -1) >>> 31] = 4;
      f6000[2] = 5;
      f6000[3] = 8;
      f6000[4] = 16;
      f6000[5] = 6;
      f6000[6] = 7;
   }

   private static boolean m26000() {
      if ((Boolean)f12000[f11000[0]]) {
         return f15000[3];
      } else if ((Boolean)f12000[f11000[1]]) {
         return f15000[4];
      } else {
         try {
            long var0 = ALC10.alcOpenDevice((ByteBuffer)null);
            if (var0 == f5000[0]) {
               Boolean var10 = f9000[0];
               f12000[f11000[2]] = var10;
               ((Logger)f12000[f11000[3]]).error(f7000[1]);
               return f9000[1];
            } else {
               long var2 = ALC10.alcCreateContext(var0, (IntBuffer)null);
               if (var2 == f5000[1]) {
                  Boolean var11 = f9000[2];
                  f12000[f11000[4]] = var11;
                  ((Logger)f12000[f11000[5]]).error(f7000[2]);
                  ALC10.alcCloseDevice(var0);
                  return f9000[3];
               } else {
                  ALCCapabilities var4 = ALC.createCapabilities(var0);
                  boolean var5 = var4.ALC_EXT_thread_local_context ? EXTThreadLocalContext.alcSetThreadContext(var2) : ALC10.alcMakeContextCurrent(var2);
                  if (!var5) {
                     Boolean var12 = f14000[0];
                     f12000[f11000[6]] = var12;
                     ((Logger)f12000[f11000[7]]).error(f7000[3]);
                     ALC10.alcDestroyContext(var2);
                     ALC10.alcCloseDevice(var0);
                     return f14000[1];
                  } else {
                     AL.createCapabilities(var4);
                     Boolean var13 = f14000[2];
                     f12000[f17000[0]] = var13;
                     return f14000[3];
                  }
               }
            }
         } catch (Throwable var15) {
            Boolean var14 = f14000[4];
            f12000[f17000[1]] = var14;
            ((Logger)f12000[f17000[2]]).error(f7000[4], var15);
            return f14000[5];
         }
      }
   }

   private static void m28000() {
      f7000 = new String[7];
      f7000[(0 | -0) >>> 31] = "Failed to load sound";
      f7000[(1 | -1) >>> 31] = "Failed to open OpenAL device";
      f7000[2] = "Failed to create OpenAL context";
      f7000[3] = "Failed to make OpenAL context current";
      f7000[4] = "Failed to initialize OpenAL sound backend";
      f7000[5] = "This is a utility class and cannot be instantiated";
      f7000[6] = "nursultan-sound";
   }

   private static void m30000() {
      short[] var128 = new short[3];
      f8000[(0 | -0) >>> 31] = 2;
      f8000[(1 | -1) >>> 31] = 2;
      f8000[2] = 4;
      short[] var129 = new short[2];
      f16000[(0 | -0) >>> 31] = 4;
      f16000[(1 | -1) >>> 31] = 4105;
      short[] var130 = new short[3];
      f4000[(0 | -0) >>> 31] = 4106;
      f4000[(1 | -1) >>> 31] = 3;
      f4000[2] = (short)((0 | -0) >>> 31);
      short[] var131 = new short[8];
      f2000[(0 | -0) >>> 31] = 5;
      f2000[(1 | -1) >>> 31] = 4112;
      f2000[2] = 4114;
      f2000[3] = 5;
      f2000[4] = 5;
      f2000[5] = 5;
      f2000[6] = 4352;
      f2000[7] = 4353;
      short[] var132 = new short[2];
      f10000[(0 | -0) >>> 31] = 4354;
      f10000[(1 | -1) >>> 31] = 4355;
      short[] var133 = new short[8];
      f11000[(0 | -0) >>> 31] = 6;
      f11000[(1 | -1) >>> 31] = 7;
      f11000[2] = 7;
      f11000[3] = (short)((0 | -0) >>> 31);
      f11000[4] = 7;
      f11000[5] = (short)((0 | -0) >>> 31);
      f11000[6] = 7;
      f11000[7] = (short)((0 | -0) >>> 31);
      short[] var134 = new short[4];
      f17000[(0 | -0) >>> 31] = 6;
      f17000[(1 | -1) >>> 31] = 7;
      f17000[2] = (short)((0 | -0) >>> 31);
      f17000[3] = 4;
   }

   private static void m36000() {
      long[] var128 = new long[2];
      f5000[(0 | -0) >>> 31] = 0L;
      f5000[(1 | -1) >>> 31] = 0L;
   }

   private static void m38000(String var0, StructureTemplateManager$InputStreamOpener var1, float var2) {
      if (m26000()) {
         Integer var3 = (Integer)((Map)f12000[f8000[2]]).get(var0);
         if (var3 == null) {
            var3 = OOslO0pi<"piigrh",-1633766892,52242181,52242178,52242296,-1443160707,-1904127083>(var1);
            if (var3 == null) {
               return;
            }

            ((Map)f12000[f16000[0]]).put(var0, var3);
         }

         int var4 = m18000();
         if (var4 != 0) {
            AL10.alSourcei(var4, f16000[1], var3);
            AL10.alSourcef(var4, f4000[0], var2);
            AL10.alSourcePlay(var4);
         }
      }
   }

   public static void m40000(Path var0) {
      if (!m12000()) {
         OOslO0pi<"elukcvd",-1633766892,52242181,52242178,52242215,-1443160707,-1904127083>(var0.toString(), () -> Files.newInputStream(var0));
      }
   }

   private static void m46000() {
      float[] var128 = new float[(1 | -1) >>> 31];
      f1000[(0 | -0) >>> 31] = Float.intBitsToFloat(1120403456);
   }

   private static Integer m48000(StructureTemplateManager$InputStreamOpener var0) {
      try {
         Integer var4;
         try (InputStream var1 = OOslO0pi<"qavzf",-1633766891,52242283,52242280,52242281,-1443160707,-1904127083>(var0)) {
            Rec0283 var2 = ((C1196)f12000[f4000[1]]).m18000(var1);
            int var3 = AL10.alGenBuffers();
            AL10.alBufferData(var3, m54000(var2.m2000(), var2.m8000()), var2.m6000(), var2.m10000());
            var4 = var3;
         }

         return var4;
      } catch (Exception var7) {
         ((Logger)f12000[f4000[2]]).error(f7000[0], var7);
         return null;
      }
   }

   public static void m52000(Enum0088 var0) {
      if (!m12000()) {
         OOslO0pi<"mgtr",-1633766892,52242181,52242178,52242215,-1443160707,-1904127083>(var0.name(), var0::m44000);
         NursultanClient.m8000().m12000(new Rec0215(var0));
      }
   }

   private static int m54000(int var0, int var1) {
      boolean var2 = var1 == f3000[1] ? f15000[0] : f15000[1];
      if (var0 == f15000[2]) {
         return var2 ? f2000[6] : f2000[7];
      } else {
         return var2 ? f10000[0] : f10000[1];
      }
   }

   private static void m56000() {
      f12000 = new Object[f6000[3]];
      f12000[f13000[3]] = Integer.valueOf(f6000[4]);
      f12000[f6000[5]] = f13000[4];
      f12000[f6000[6]] = f13000[5];
   }

   public static void m58000(Path var0) {
      String var1 = var0.toString();
      ((ExecutorService)f12000[f8000[0]]).execute(() -> {
         Integer var1x = (Integer)((Map)f12000[f17000[3]]).remove(var1);
         if (var1x != null) {
            AL10.alDeleteBuffers(var1x);
         }
      });
   }

   private static void m68000(String var0, StructureTemplateManager$InputStreamOpener var1) {
      float var2 = m6000();
      ((ExecutorService)f12000[f8000[1]]).execute(() -> OOslO0pi<"vihgitx",-1633766892,52242181,52242229,52242282,-1443160707,-1904127083>(var0, var1, var2));
   }

   private static void m74000() {
      boolean[] var128 = new boolean[5];
      f15000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f15000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f15000[2] = (boolean)((1 | -1) >>> 31);
      f15000[3] = (boolean)((1 | -1) >>> 31);
      f15000[4] = (boolean)((0 | -0) >>> 31);
      boolean[] var129 = new boolean[4];
      f9000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f9000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f9000[2] = (boolean)((1 | -1) >>> 31);
      f9000[3] = (boolean)((0 | -0) >>> 31);
      boolean[] var130 = new boolean[8];
      f14000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f14000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f14000[2] = (boolean)((1 | -1) >>> 31);
      f14000[3] = (boolean)((1 | -1) >>> 31);
      f14000[4] = (boolean)((1 | -1) >>> 31);
      f14000[5] = (boolean)((0 | -0) >>> 31);
      f14000[6] = (boolean)((1 | -1) >>> 31);
      f14000[7] = (boolean)((0 | -0) >>> 31);
      boolean[] var131 = new boolean[6];
      f13000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f13000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f13000[2] = (boolean)((0 | -0) >>> 31);
      f13000[3] = (boolean)((1 | -1) >>> 31);
      f13000[4] = (boolean)((0 | -0) >>> 31);
      f13000[5] = (boolean)((0 | -0) >>> 31);
   }
}
