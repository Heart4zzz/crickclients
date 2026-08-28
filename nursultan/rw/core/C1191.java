package rw.core;

import KDFzREm.NNwv;
import java.io.InputStream;
import java.nio.ByteBuffer;
import javax.sound.sampled.AudioFormat;
import net.minecraft.client.sounds.LoopingAudioStream$AudioStreamProvider;
import rw.data.Rec0283;

public class C1191 implements LoopingAudioStream$AudioStreamProvider {
   static {
      ntfClinit();
   }

   public Rec0283 m2000(InputStream var1) throws Exception {
      NNwv var2 = new NNwv(var1);

      Rec0283 var5;
      try {
         ByteBuffer var3 = var2.y();
         AudioFormat var4 = var2.N();
         var5 = new Rec0283(var3, var4.getChannels(), var4.getSampleSizeInBits(), (int)var4.getSampleRate());
      } catch (Throwable var7) {
         try {
            var2.close();
         } catch (Throwable var6) {
            var7.addSuppressed(var6);
         }

         throw var7;
      }

      var2.close();
      return var5;
   }
}
