package rw.core;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import rw.data.Rec0081;
import rw.data.Rec0088;
import rw.gui.Rec0011;

final class C0276 {
   private static final int f1000 = 1095123249;
   private static final int f2000 = 2;

   private C0276() {
   }

   static void m2000(Path var0, long var1, Rec0011 var3, C0274 var4, C0269 var5) throws IOException {
      int var6 = var3.m12000().m10000();

      try (DataOutputStream var7 = new DataOutputStream(new BufferedOutputStream(Files.newOutputStream(var0)))) {
         var7.writeInt(1095123249);
         var7.writeInt(2);
         var7.writeLong(var1);
         var7.writeInt(var3.m12000().ordinal());
         var7.writeDouble(var3.m2000());
         var7.writeDouble(var3.m10000());
         var7.writeDouble(var3.m4000());
         var7.writeInt(var6);
         int var8 = var4.m32000();
         var7.writeInt(var8);
         byte[] var9 = null;

         for (int var10 = 0; var10 < var8; var10++) {
            var7.writeInt(var4.m20000(var10));
            var7.writeFloat(var4.m12000(var10));
            var7.writeFloat(var4.m40000(var10));
            var7.writeFloat(var4.m4000(var10));
            var7.writeFloat(var4.m8000(var10));
            var7.writeFloat(var4.m10000(var10));
            int var11 = var4.m24000(var10);
            int var12 = var4.m38000(var10);
            var7.writeInt(var11);
            var7.writeInt(var12);
            if (var11 > 0 && var12 > 0) {
               int var13 = var11 * var12 * var6;
               if (var9 == null || var9.length < var13) {
                  var9 = new byte[var13];
               }

               var5.m20000(var4.m18000(var10), var4.m16000(var10), var11, var12, var9);
               var7.write(var9, 0, var13);
            }
         }
      }
   }

   static Rec0081 m4000(Path var0) {
      if (var0 != null && Files.isReadable(var0)) {
         try {
            Rec0081 var29;
            try (DataInputStream var1 = new DataInputStream(new BufferedInputStream(Files.newInputStream(var0)))) {
               if (var1.readInt() != 1095123249 || var1.readInt() != 2) {
                  return null;
               }

               long var2 = var1.readLong();
               int var4 = var1.readInt();
               double var5 = var1.readDouble();
               double var7 = var1.readDouble();
               double var9 = var1.readDouble();
               int var11 = var1.readInt();
               int var12 = var1.readInt();
               if (var12 < 0) {
                  return null;
               }

               int[] var13 = new int[var12];
               Rec0088[] var14 = new Rec0088[var12];

               for (int var15 = 0; var15 < var12; var15++) {
                  var13[var15] = var1.readInt();
                  float var16 = var1.readFloat();
                  float var17 = var1.readFloat();
                  float var18 = var1.readFloat();
                  float var19 = var1.readFloat();
                  float var20 = var1.readFloat();
                  int var21 = var1.readInt();
                  int var22 = var1.readInt();
                  byte[] var23;
                  if (var21 > 0 && var22 > 0) {
                     var23 = new byte[var21 * var22 * var11];
                     var1.readFully(var23);
                  } else {
                     var23 = new byte[0];
                  }

                  var14[var15] = new Rec0088(var23, var21, var22, var11, var16, var17, var18, var19, var20);
               }

               var29 = new Rec0081(var2, var4, var5, var7, var9, var11, var13, var14);
            }

            return var29;
         } catch (IOException var26) {
            System.err.println("[FontAtlas] ignoring unreadable atlas cache " + var0 + ": " + var26);
            return null;
         }
      } else {
         return null;
      }
   }
}
