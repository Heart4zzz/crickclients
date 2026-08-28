package rw.gui;

import KDFzREm.NNNZg;
import KDFzREm.NNuU;
import KDFzREm.NPh;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import org.apache.logging.log4j.Logger;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.util.nfd.NFDFilterItem;
import org.lwjgl.util.nfd.NativeFileDialog;
import org.lwjgl.util.nfd.NFDFilterItem.Buffer;
import rw.GuiWidget;
import rw.api.AnnotationDefault;
import rw.api.Iface0642;
import rw.core.AppData;
import rw.core.C0925;
import rw.core.C0988;
import rw.core.C0991;
import rw.core.C1000;
import rw.core.C1010;
import rw.core.C1013;
import rw.core.C1188;
import rw.data.Rec0207;
import rw.defs.Enum0055;
import rw.defs.Enum0088;
import rw.setting.C0106;
import rw.setting.C0122;
import rw.setting.C0158;

@AnnotationDefault(
   L = "ClientSounds",
   y = Enum0055.MISC,
   N = Enum0070.CLIENT
)
public class ClientSounds extends GuiWidget {
   private static String[] f1000;
   private static String[] f2000;
   public Object[] f3000;
   private static float[] f4000;
   private static String[] f5000;
   public static Object[] f6000;

   private static void m4000() {
      f5000 = new String[]{"toggle-sounds", "custom", "default", "sound-type", "select-enable-sound", "select-disable-sound", "volume", "sounds"};
      f1000 = new String[]{"custom-enable-sound.wav", "custom-disable-sound.wav", "sound-does-not-exist", "user.home", "Downloads", "WAV files"};
      f2000 = new String[]{"wav", "sounds", "custom-disable-sound.wav", "custom-enable-sound.wav", "error-please-report", "wav"};
   }

   public ClientSounds() {
      this.m14000();
      C0991 var5 = C0122.m26000(this, f5000[0], true);
      this.f3000[0] = var5;
      C1013 var6 = new C1013(f5000[1], false);
      this.f3000[1] = var6;
      C1013 var7 = new C1013(f5000[2], true);
      this.f3000[2] = var7;
      C1000 var8 = (C1000)C0122.m18000(this, f5000[3], (C1013)this.f3000[1], (C1013)this.f3000[2]).N(var1 -> {
         this.m14000();
         return (Boolean)((C0991)this.f3000[0]).i();
      });
      this.f3000[3] = var8;
      C1010 var9 = (C1010)C0122.m22000(this, f5000[4], () -> this.m44000((boolean)0)).N(var1 -> {
         this.m14000();
         return (boolean)(((C1013)this.f3000[1]).m14000() && ((C0991)this.f3000[0]).i() ? 1 : 0);
      });
      this.f3000[4] = var9;
      C1010 var10 = (C1010)C0122.m22000(this, f5000[5], () -> this.m44000((boolean)1)).N(var1 -> {
         this.m14000();
         return (boolean)(((C1013)this.f3000[1]).m14000() && ((C0991)this.f3000[0]).i() ? 1 : 0);
      });
      this.f3000[5] = var10;
      C0988 var11 = C0122.m12000(this, f5000[6], f4000[0], f4000[1], f4000[2], f4000[3]);
      this.f3000[6] = var11;
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      f4000 = new float[]{100.0F, 50.0F, 100.0F, 1.0F};
   }

   private static void m10000() {
      f6000 = new Object[]{null};
   }

   public C0988 m28000() {
      this.m14000();
      return (C0988)this.f3000[6];
   }

   private void m14000() {
      if (this.f3000 == null) {
         this.f3000 = new Object[7];
         Object[] var1 = this.f3000;
      }
   }

   private void m44000(boolean var1) {
      try {
         MemoryStack var2 = MemoryStack.stackPush();

         label116: {
            label124: {
               try {
                  Path var3 = Paths.get(System.getProperty(f1000[3]), f1000[4]);
                  Buffer var4 = NFDFilterItem.malloc(1, var2);
                  ((NFDFilterItem)var4.get(0)).name(var2.UTF8(f1000[5])).spec(var2.UTF8(f2000[0]));
                  PointerBuffer var5 = var2.mallocPointer(1);
                  if (1 == NativeFileDialog.NFD_OpenDialog(var5, var4, var3.toAbsolutePath().toString())) {
                     long var6 = var5.get(0);
                     if (var6 == 0L) {
                        break label124;
                     }

                     try {
                        String var8 = MemoryUtil.memUTF8(var6);
                        Path var9 = Paths.get(var8);
                        if (!m50000(var9)) {
                           break label116;
                        }

                        Path var10 = ((Path)AppData.f2000[0]).resolve(f2000[1]);
                        Files.createDirectories(var10);
                        String var11 = var1 ? f2000[2] : f2000[3];
                        Path var12 = var10.resolve(var11);
                        Files.copy(var9, var12, StandardCopyOption.REPLACE_EXISTING);
                        C0158.m58000(var12);
                     } finally {
                        NativeFileDialog.NFD_FreePath(var6);
                     }
                  }
               } catch (Throwable var20) {
                  if (var2 != null) {
                     try {
                        var2.close();
                     } catch (Throwable var18) {
                        var20.addSuppressed(var18);
                     }
                  }

                  throw var20;
               }

               if (var2 != null) {
                  var2.close();
               }

               return;
            }

            if (var2 != null) {
               var2.close();
            }

            return;
         }

         if (var2 != null) {
            var2.close();
         }
      } catch (Exception var21) {
         C0106.m52000(new Rec0207(this), C1188.m12000(f2000[4]).N(NPh.field_1061));
         ((Logger)f6000[0]).error(var21, var21);
      }
   }

   private static boolean m50000(Path var0) {
      String var1 = var0.getFileName().toString();
      int var2 = var1.lastIndexOf(46);
      return (boolean)(var2 >= 0 && var1.substring(var2 + 1).equalsIgnoreCase(f2000[5]) ? 1 : 0);
   }

   @Iface0642
   public void m52000(C0925 var1) {
      this.m14000();
      if ((Boolean)((C0991)this.f3000[0]).i() && (NNNZg)((NNuU)this.y[0]).T[3] != null) {
         GuiWidget var2 = var1.m16000();
         if (var2.m54000().m54000()) {
            boolean var3 = var2.m30000();
            if (((C1013)this.f3000[2]).m14000()) {
               C0158.m52000(var3 ? (Enum0088)Enum0088.f3000[0] : (Enum0088)Enum0088.f3000[1]);
            } else {
               Path var4 = ((Path)AppData.f2000[0]).resolve(f5000[7]);
               Path var5 = var4.resolve(var3 ? f1000[0] : f1000[1]);
               if (!Files.exists(var5)) {
                  C0106.m52000(new Rec0207(this), C1188.m12000(f1000[2]).N(NPh.field_1061));
               } else {
                  C0158.m40000(var5);
               }
            }
         }
      }
   }
}
