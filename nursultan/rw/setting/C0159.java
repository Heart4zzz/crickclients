package rw.setting;

import KDFzREm.NNNZg;
import KDFzREm.NNNbF;
import KDFzREm.NNUU;
import KDFzREm.NNUW;
import KDFzREm.NNuU;
import KDFzREm.NQo;
import KDFzREm.NaK;
import KDFzREm.NpC;
import KDFzREm.NpG;
import KDFzREm.Npj;
import com.mojang.serialization.Dynamic;
import java.io.File;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import org.apache.logging.log4j.Logger;
import rw.core.C1185;

public class C0159 {
   private static String[] f1000;
   private static String[] f2000;
   private static boolean[] f3000;
   private static boolean[] f4000;
   private static String[] f5000;
   private static boolean[] f6000;
   private static String[] f7000;
   private static float[] f8000;
   public static Object[] f9000;

   public static void m2000(Path var0) {
      try {
         if (!Files.isDirectory(var0)) {
            ((Logger)f9000[0]).error(f7000[0], var0);
         } else if (!Files.exists(var0)) {
            ((Logger)f9000[0]).error(f7000[1], var0);
         } else {
            try (DirectoryStream var1 = Files.newDirectoryStream(var0)) {
               for (Path var3 : var1) {
                  String var4 = var3.getFileName().toString();
                  if (!var4.endsWith(f7000[2])) {
                     ((Logger)f9000[0]).info(f7000[3], var3);
                  } else {
                     NaK var5 = m50000(var3);
                     if (var5 != null) {
                        if (var5.y(f5000[0])) {
                           var5.b(f5000[1]);
                        }

                        if (var5.y(f5000[2])) {
                           var5.W(f5000[3]).ifPresent(var0x -> {
                              if (var0x.y(f2000[0])) {
                                 var0x.b(f2000[1]);
                              }

                              if (var0x.y(f2000[2])) {
                                 var0x.b(f2000[3]);
                              }

                              if (var0x.y(f2000[4])) {
                                 var0x.b(f2000[5]);
                              }

                              if (var0x.y(f2000[6])) {
                                 var0x.b(f2000[7]);
                              }
                           });
                        }

                        Npj.y(var5, var3);
                        ((Logger)f9000[0]).info(f1000[0], var3);
                     }
                  }
               }
            } catch (Exception var8) {
               ((Logger)f9000[0]).error(f1000[1], var8);
            }
         }
      } catch (Throwable var9) {
         throw var9;
      }
   }

   public static Path m8000(NQo var0) {
      try {
         return m56000(m58000(var0));
      } catch (Throwable var2) {
         throw var2;
      }
   }

   private C0159() {
      throw new UnsupportedOperationException(f1000[5]);
   }

   static {
      ntfClinit();
   }

   private static void m24000() {
      f7000 = new String[]{"Path {} is not a directory", "Path {} does not exist", ".nbt", "Skipping non-NBT file: {}"};
      f5000 = new String[]{"count", "count", "components", "components"};
      f1000 = new String[]{
         "Cleaned NBT file: {}", "Error cleaning parsed items", "parsed-item", "item0.nbt", "item%s.nbt", "This is a utility class and cannot be instantiated"
      };
      f2000 = new String[]{
         "minecraft:damage",
         "minecraft:damage",
         "minecraft:repair_cost",
         "minecraft:repair_cost",
         "minecraft:tooltip_display",
         "minecraft:tooltip_display",
         "minecraft:custom_data",
         "minecraft:custom_data"
      };
   }

   public static NaK m50000(Path var0) {
      try {
         return Npj.N(var0);
      } catch (Throwable var2) {
         throw var2;
      }
   }

   private static void m52000() {
      f8000 = new float[]{2.0F, 0.5F};
   }

   public static Path m56000(NaK var0) {
      try {
         Path var1 = ((File)NNuU.Nq().l[1]).toPath().resolve(f1000[2]);
         if (Files.notExists(var1)) {
            Files.createDirectories(var1);
         }

         Path var2 = Path.of(var1.toString(), f1000[3]);
         int var3 = 0;

         while (Files.exists(var2)) {
            var2 = Path.of(var1.toString(), f1000[4].formatted(++var3));
         }

         Npj.y(var0, var2);
         ((NNNZg)NNuU.Nq().T[3]).method_67392(NNUU.yx, NNUW.field_15250, f8000[0], f8000[1]);
         return var2;
      } catch (Throwable var4) {
         throw var4;
      }
   }

   public static NaK m58000(NQo var0) {
      return (NaK)NQo.R.encodeStart(C1185.m12000(), var0).getOrThrow();
   }

   public static NQo m60000(Path var0) {
      try {
         return (NQo)NQo.R.parse(new Dynamic(m76000(), Npj.N(var0))).getOrThrow();
      } catch (Throwable var2) {
         throw var2;
      }
   }

   private static void m64000() {
      f9000 = new Object[]{null};
   }

   public static NQo m70000(Path var0) {
      try {
         return m80000(Npj.N(var0));
      } catch (Throwable var2) {
         throw var2;
      }
   }

   public static NNNbF<NpC> m76000() {
      return ((NNNZg)NNuU.Nq().T[3]).method_30349().N(NpG.N);
   }

   public static NaK m78000(NQo var0) {
      return (NaK)NQo.R.encodeStart(m76000(), var0).getOrThrow();
   }

   public static NQo m80000(NaK var0) {
      return (NQo)NQo.R.parse(new Dynamic(C1185.m12000(), var0)).getOrThrow();
   }

   private static void m84000() {
      f4000 = new boolean[]{false, false, false, false, true};
      f3000 = new boolean[]{false, false, false, true, false};
      f6000 = new boolean[]{true, false, false, true};
   }
}
