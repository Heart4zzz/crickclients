package rw.gui;

import KDFzREm.NNBj;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.apache.logging.log4j.Logger;
import rw.core.AppData;
import rw.core.C0272;
import rw.defs.Enum0018;
import rw.defs.OlmmOsl;

public class C0003 {
   private static float[] f1000;
   private static double[] f2000;
   public static Object[] f3000;
   public Object[] f4000;
   private static String[] f5000;

   public int m2000(int var1) {
      C0001 var2 = this.m16000(var1);
      return var2 == null ? 0 : var2.m44000();
   }

   public void m6000() {
      for (C0001 var2 : (List)this.f4000[2]) {
         var2.m22000();
      }

      ((List)this.f4000[2]).clear();
      ((Map)this.f4000[1]).clear();
      ((ExecutorService)this.f4000[3]).shutdown();
   }

   private static void m10000() {
      f3000 = new Object[]{null, 64.0, 12.0, 512};
   }

   public C0003() {
      this.m22000();
      HashMap var5 = new HashMap();
      this.f4000[0] = var5;
      HashMap var6 = new HashMap();
      this.f4000[1] = var6;
      ArrayList var7 = new ArrayList();
      this.f4000[2] = var7;
      ExecutorService var8 = Executors.newFixedThreadPool(4);
      this.f4000[3] = var8;
      Integer var9 = Math.max(512, Math.min(IlkOns.m36000(), 8192));
      this.f4000[4] = var9;
   }

   static {
      ntfClinit();
   }

   private C0001 m16000(int var1) {
      return var1 >= 0 && var1 < ((List)this.f4000[2]).size() ? (C0001)((List)this.f4000[2]).get(var1) : null;
   }

   private static void m18000() {
      f1000 = new float[]{12.0F};
   }

   private void m22000() {
      if (this.f4000 == null) {
         this.f4000 = new Object[5];
         Object[] var1 = this.f4000;
         var1[4] = 0;
      }
   }

   private static void m36000() {
      f5000 = new String[]{"Font atlas cache load failed ({}): {}", "cache", "font", "Font atlas cache directory unavailable: {}"};
   }

   public int m40000(int var1) {
      C0001 var2 = this.m16000(var1);
      return var2 == null ? 0 : var2.m8000();
   }

   public void m44000() {
      for (C0001 var2 : (List)this.f4000[2]) {
         var2.m68000();
      }
   }

   public C0001 m46000(String var1, byte[] var2, OlmmOsl var3) {
      String var4 = var1 + "#" + var3.name();
      C0001 var5 = (C0001)((Map)this.f4000[1]).get(var4);
      if (var5 != null) {
         return var5;
      } else {
         Rec0011 var6 = new Rec0011(Enum0018.f3000, f2000[0], f2000[1], 512, (Integer)this.f4000[4]).m14000(var3.m46000());
         Path var7 = this.m52000(var1, var3);
         C0272 var8 = this.m58000(var2, var6, var7);
         C0001 var9 = new C0001(var8, ((List)this.f4000[2]).size(), f1000[0], var7);
         ((Map)this.f4000[1]).put(var4, var9);
         ((List)this.f4000[2]).add(var9);
         return var9;
      }
   }

   public ZwBs m50000(String var1) {
      return (ZwBs)((Map)this.f4000[0]).get(var1);
   }

   private Path m52000(String var1, OlmmOsl var2) {
      try {
         Path var3 = ((Path)AppData.f2000[0]).resolve(f5000[1]).resolve(f5000[2]);
         Files.createDirectories(var3);
         return var3.resolve(var1 + "_w" + (int)var2.m46000() + ".msdf");
      } catch (Exception var4) {
         ((Logger)f3000[0]).warn(f5000[3], var4.toString());
         return null;
      }
   }

   public ZwBs m54000(String var1, NNBj var2) {
      if (((Map)this.f4000[0]).containsKey(var1)) {
         throw new IllegalStateException("Font family already registered: " + var1);
      } else {
         ZwBs var3 = new ZwBs(var1, this, var2);
         ((Map)this.f4000[0]).put(var1, var3);
         return var3;
      }
   }

   public int m56000(int var1) {
      C0001 var2 = this.m16000(var1);
      return var2 == null ? 0 : var2.m76000();
   }

   private C0272 m58000(byte[] var1, Rec0011 var2, Path var3) {
      if (var3 != null) {
         try {
            return C0272.m74000(var1, var2, var3, (ExecutorService)this.f4000[3]);
         } catch (Exception var5) {
            ((Logger)f3000[0]).warn(f5000[0], var3, var5.toString());
         }
      }

      return C0272.m66000(var1, var2, (ExecutorService)this.f4000[3]);
   }

   public void m60000() {
      this.m44000();

      for (ZwBs var2 : ((Map)this.f4000[0]).values()) {
         var2.m52000();
      }
   }

   private static void m64000() {
      f2000 = new double[]{64.0, 12.0, 64.0, 12.0};
   }
}
