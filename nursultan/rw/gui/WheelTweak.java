package rw.gui;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import rw.core.C0251;
import rw.defs.Enum0013;
import rw.defs.Enum0015;
import rw.defs.InventoryPositionAware;

public class WheelTweak {
   private static final Properties f1000;
   private String f2000;
   public boolean f3000 = true;
   public boolean f4000 = true;
   public boolean f5000 = true;
   public boolean f6000 = true;
   public Enum0013 f7000 = Enum0013.f2000;
   public InventoryPositionAware f8000 = InventoryPositionAware.f1000;
   public Enum0015 f9000 = Enum0015.f1000;
   public static boolean f10000;

   WheelTweak(String var1) {
      this.f2000 = var1;
   }

   public void m2000() {
      try {
         File var1 = new File(this.f2000);
         boolean var2 = var1.exists();
         File var3 = var1.getParentFile();
         if (!var3.exists()) {
            var3.mkdirs();
         }

         FileWriter var4 = new FileWriter(var1);
         m6000(var4, "RMBTweak", this.f3000);
         m6000(var4, "LMBTweakWithItem", this.f4000);
         m6000(var4, "LMBTweakWithoutItem", this.f5000);
         m6000(var4, "WheelTweak", this.f6000);
         m8000(var4, "WheelSearchOrder", String.valueOf(this.f7000.ordinal()));
         m8000(var4, "WheelScrollDirection", String.valueOf(this.f8000.ordinal()));
         m8000(var4, "ScrollItemScaling", String.valueOf(this.f9000.ordinal()));
         m6000(var4, "Debug", f10000);
         var4.close();
         if (!var2) {
            C0251.m4000("Created the config file.");
         }
      } catch (IOException var5) {
         C0251.m4000("Failed to write the config file: " + this.f2000);
         var5.printStackTrace();
      }
   }

   private static int m4000(String var0, int var1) {
      try {
         return Integer.parseInt(var0);
      } catch (NumberFormatException var3) {
         return var1;
      }
   }

   private static void m6000(FileWriter var0, String var1, boolean var2) throws IOException {
      m8000(var0, var1, var2 ? "1" : "0");
   }

   private static void m8000(FileWriter var0, String var1, String var2) throws IOException {
      var0.write(var1 + "=" + var2 + "\n");
   }

   public void m10000() {
      Properties var1 = new Properties(f1000);

      try {
         FileReader var2 = new FileReader(this.f2000);
         var1.load(var2);
         var2.close();
      } catch (FileNotFoundException var3) {
         C0251.m4000("Generating the config file at: " + this.f2000);
         this.m2000();
         return;
      } catch (IOException var4) {
         C0251.m4000("Failed to read the config file: " + this.f2000);
         var4.printStackTrace();
      }

      this.f3000 = m4000(var1.getProperty("RMBTweak"), 1) != 0;
      this.f4000 = m4000(var1.getProperty("LMBTweakWithItem"), 1) != 0;
      this.f5000 = m4000(var1.getProperty("LMBTweakWithoutItem"), 1) != 0;
      this.f6000 = m4000(var1.getProperty("WheelTweak"), 1) != 0;
      this.f7000 = Enum0013.m6000(m4000(var1.getProperty("WheelSearchOrder"), 1));
      this.f8000 = InventoryPositionAware.m10000(m4000(var1.getProperty("WheelScrollDirection"), 0));
      this.f9000 = Enum0015.m6000(m4000(var1.getProperty("ScrollItemScaling"), 0));
      f10000 = m4000(var1.getProperty("Debug"), 0) != 0;
   }
}
