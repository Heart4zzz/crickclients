package rw.core;

import java.io.InputStream;
import java.nio.ByteBuffer;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.AudioFormat.Encoding;
import net.minecraft.client.sounds.LoopingAudioStream$AudioStreamProvider;
import org.lwjgl.BufferUtils;
import rw.data.Rec0283;

public class C0972 implements LoopingAudioStream$AudioStreamProvider {
   private static boolean[] f1000;
   private static byte[] f2000;

   static {
      ntfClinit();
   }

   private static void m2000() {
      byte[] var128 = new byte[3];
      f2000[(0 | -0) >>> 31] = 16;
      f2000[(1 | -1) >>> 31] = 2;
      f2000[2] = 16;
   }

   public Rec0283 m8000(InputStream var1) throws Exception {
      Rec0283 var8;
      try (AudioInputStream var2 = AudioSystem.getAudioInputStream(var1)) {
         AudioFormat var3 = var2.getFormat();
         AudioFormat var4 = new AudioFormat(
            Encoding.PCM_SIGNED, var3.getSampleRate(), f2000[0], var3.getChannels(), var3.getChannels() * f2000[1], var3.getSampleRate(), f1000[0]
         );

         try (AudioInputStream var5 = AudioSystem.getAudioInputStream(var4, var2)) {
            byte[] var6 = var5.readAllBytes();
            ByteBuffer var7 = BufferUtils.createByteBuffer(var6.length);
            var7.put(var6).flip();
            var8 = new Rec0283(var7, var4.getChannels(), f2000[2], (int)var4.getSampleRate());
         }
      }

      return var8;
   }

   private static void m10000() {
      boolean[] var128 = new boolean[(1 | -1) >>> 31];
      f1000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
   }
}
