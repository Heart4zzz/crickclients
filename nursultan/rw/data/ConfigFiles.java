package rw.data;

import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.apache.logging.log4j.Logger;
import org.msgpack.core.MessageBufferPacker;
import org.msgpack.core.MessagePack;
import rw.NursultanClient;
import rw.api.Iface0621;
import rw.core.Base0973;
import rw.core.C0894;
import rw.core.C0959;
import rw.core.C0978;
import rw.core.C0980;
import rw.core.C0982;
import rw.core.C0990;
import rw.core.C0993;
import rw.core.C0994;
import rw.core.C0997;
import rw.core.C0999;
import rw.core.C1002;
import rw.core.C1015;
import rw.core.IltqImqmt;
import rw.core.OlmkIji;
import rw.defs.Nuker;
import rw.gui.HudPositions;

public class ConfigFiles {
   private static String[] f1000;
   private static boolean[] f2000;
   private static boolean[] f3000;
   private static boolean[] f4000;
   private static boolean[] f5000;
   private static byte[] f6000;
   private static boolean[] f7000;
   private static short[] f8000;
   private static short[] f9000;
   private static String[] f10000;
   private static short[] f11000;
   public Object[] f12000;
   private static byte[] f13000;
   private static String[] f14000;
   private static byte[] f15000;
   public static Object[] f16000;

   public Path m2000() {
      return (Path)this.f12000[f11000[5]];
   }

   public void m4000(Class<? extends Base0973> var1) {
      ((List)this.f12000[f8000[0]]).stream().filter(var1x -> var1x.getClass() == var1 ? f7000[0] : f7000[1]).findFirst().ifPresent(this::m74000);
   }

   private void m12000() {
      if (this.f12000 == null) {
         this.f12000 = new Object[f13000[1]];
         Object[] var1 = this.f12000;
      }
   }

   public ConfigFiles() {
      this.m12000();
      Path var5 = ((Path)f16000[f9000[0]]).resolve(String.valueOf(((C0959)NursultanClient.f13000[f9000[1]]).m8000()));
      this.f12000[f9000[2]] = var5;
      Base0973[] var10001 = new Base0973[f6000[0]];
      var10001[f3000[0]] = new C0978(f1000[0], f3000[1]);
      var10001[f3000[2]] = new C0894(f1000[1], f3000[3]);
      var10001[f6000[1]] = new C0990(f1000[2], f3000[4]);
      var10001[f6000[2]] = new C1015(f1000[3], f4000[0]);
      var10001[f6000[3]] = new C1002(f10000[0], f4000[1]);
      var10001[f6000[4]] = new C0980(f10000[1], f4000[2]);
      var10001[f6000[5]] = new IltqImqmt(f10000[2], f4000[3]);
      var10001[f6000[6]] = new C0997(f10000[3], f4000[4]);
      var10001[f15000[0]] = new HudPositions(f10000[4], f4000[5]);
      var10001[f15000[1]] = new C0999(f10000[5], f4000[6]);
      var10001[f15000[2]] = new C0994(f10000[6], f4000[7]);
      List var6 = List.of(var10001);
      this.f12000[f9000[3]] = var6;
   }

   static {
      ntfClinit();
   }

   private static void m14000() {
      f6000 = new byte[]{11, 2, 3, 4, 5, 6, 7};
      f15000 = new byte[]{8, 9, 10, 3, 2};
      f13000 = new byte[]{2, 2, 3, 2};
   }

   private static void m20000() {
      f3000 = new boolean[]{false, true, true, true, true};
      f4000 = new boolean[]{true, true, true, true, true, true, true, true};
      f5000 = new boolean[]{false, false, true, false, true, false};
      f2000 = new boolean[]{true, false};
      f7000 = new boolean[]{true, false, true, false, false, false, true, true};
   }

   public List<Base0973> m24000() {
      return (List<Base0973>)this.f12000[f11000[6]];
   }

   private static void m32000() {
      f1000 = new String[]{"friends.dat", "waypoints.dat", "macros.dat", "nuker.dat"};
      f10000 = new String[]{
         "selected-preset.dat",
         "accounts.dat",
         "selected-account.dat",
         "client-settings.dat",
         "ui-layout.dat",
         "autobuy.dat",
         "blockesp.dat",
         "Failed to save config {}"
      };
      f14000 = new String[]{"Failed to load config {}", "configs"};
   }

   private static void m36000() {
      f9000 = new short[]{1, 2, 0, 1, 1, 1};
      f8000 = new short[]{1, 1, 1, 1, 1, 0};
      f11000 = new short[]{0, 0, 0, 0, 0, 0, 1};
   }

   public void m40000() {
      ((List)this.f12000[f8000[1]]).forEach(this::m50000);
   }

   public void m46000() {
      ((List)this.f12000[f9000[5]]).forEach(this::m74000);
   }

   public void m50000(Base0973 var1) {
      Path var2 = ((Path)this.f12000[f8000[5]]).resolve(var1.m20000());
      Path var3 = ((Path)this.f12000[f11000[0]]).resolve(var1.m20000() + "." + UUID.randomUUID() + ".tmp");

      try {
         Files.createDirectories((Path)this.f12000[f11000[1]]);
         MessageBufferPacker var5 = MessagePack.newDefaultBufferPacker();

         byte[] var4;
         try {
            var1.m22000(var5);
            var4 = C0993.m14000(var5.toByteArray());
         } catch (Throwable var19) {
            if (var5 != null) {
               try {
                  var5.close();
               } catch (Throwable var18) {
                  var19.addSuppressed(var18);
               }
            }

            throw var19;
         }

         if (var5 != null) {
            var5.close();
         }

         byte[] var10001 = C0982.m20000(var4);
         OpenOption[] var10002 = new OpenOption[f15000[3]];
         var10002[f5000[1]] = StandardOpenOption.CREATE;
         var10002[f5000[2]] = StandardOpenOption.TRUNCATE_EXISTING;
         var10002[f15000[4]] = StandardOpenOption.WRITE;
         Files.write(var3, var10001, var10002);
         CopyOption[] var22 = new CopyOption[f13000[0]];
         var22[f5000[3]] = StandardCopyOption.ATOMIC_MOVE;
         var22[f5000[4]] = StandardCopyOption.REPLACE_EXISTING;
         Files.move(var3, var2, var22);
      } catch (IOException var20) {
         ((Logger)f16000[f11000[2]]).error(f10000[7], var1.m20000(), var20);
      } finally {
         try {
            Files.deleteIfExists(var3);
         } catch (IOException var17) {
         }
      }
   }

   public static void m54000(Class<? extends Base0973> var0) {
      ConfigFiles var1 = NursultanClient.m10000();
      ((List)var1.f12000[f9000[4]]).stream().filter(var1x -> var1x.getClass() == var0 ? f7000[2] : f7000[3]).findFirst().ifPresent(var1::m50000);
   }

   public <T extends Base0973> T m62000(Class<T> var1) {
      return ((List)this.f12000[f8000[4]])
         .stream()
         .filter(var1::isInstance)
         .map(var1::cast)
         .findFirst()
         .orElseThrow(() -> new IllegalStateException("Config " + var1.getSimpleName() + " not registered"));
   }

   public void m66000(Iface0621 var1) {
      this.m50000((Base0973)var1);
   }

   public Optional<Iface0621> m68000(Nuker var1) {
      return ((List)this.f12000[f8000[2]])
         .stream()
         .filter(Iface0621.class::isInstance)
         .map(Iface0621.class::cast)
         .filter(var1x -> var1x.m2000() == var1 ? f2000[0] : f2000[1])
         .findFirst();
   }

   public void m74000(Base0973 var1) {
      Path var2 = ((Path)this.f12000[f11000[3]]).resolve(((Base0973)var1).m20000());
      if (Files.exists(var2)) {
         try {
            byte[] var3 = Files.readAllBytes(var2);
            OlmkIji.m6000((Base0973)var1, C0982.m20000(var3));
         } catch (Exception var4) {
            ((Logger)f16000[f11000[4]]).error(f14000[0], ((Base0973)var1).m20000(), var4);
         }
      }
   }

   public List<Iface0621> m76000() {
      return ((List)this.f12000[f8000[3]]).stream().filter(Iface0621.class::isInstance).map(Iface0621.class::cast).toList();
   }

   private static void m80000() {
      f16000 = new Object[]{null, null, 1};
   }
}
