package net.minecraft.nbt;

import KDFzREm.NNNSr;
import KDFzREm.NlT;
import java.io.DataOutput;
import java.io.IOException;
import java.io.UTFDataFormatException;

public class NbtIo$StringFallbackDataOutput extends NNNSr {
   public NbtIo$StringFallbackDataOutput(DataOutput var1) {
      super(var1);
   }

   public void writeUTF(String var1) throws IOException {
      try {
         super.writeUTF(var1);
      } catch (UTFDataFormatException var3) {
         NlT.N("Failed to write NBT String", var3);
         super.writeUTF("");
      }
   }
}
