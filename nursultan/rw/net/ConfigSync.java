package rw.net;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.apache.logging.log4j.Logger;
import rw.NursultanClient;
import rw.api.Iface0621;
import rw.core.Base0973;
import rw.core.C0116;
import rw.core.C0873;
import rw.core.C0875;
import rw.core.OlkOnipis;
import rw.core.OlmkIji;
import rw.data.ConfigFiles;
import rw.data.Iltnotrs;
import rw.data.Rec0044;
import rw.data.Rec0045;
import rw.data.Rec0051;
import rw.data.Rec0168;
import rw.data.Rec0206;
import rw.defs.Enum0082;
import rw.defs.Nuker;

public class ConfigSync {
   private static short[] f1000;
   private static short[] f2000;
   public Object[] f3000;
   private static short[] f4000;
   private static String[] f5000;
   private static short[] f6000;
   private static short[] f7000;
   public static Object[] f8000;
   private static short[] f9000;
   private static short[] f10000;
   private static short[] f11000;
   private static short[] f12000;
   private static short[] f13000;

   private synchronized void m4000(Nuker var1) {
      if (((Set)this.f3000[2]).remove(var1)) {
         ((Deque)this.f3000[0]).add(Rec0206.m10000(var1));
         this.m12000();
      }
   }

   private static void m6000() {
      f5000 = new String[]{
         "user-config operations rate-limited, retrying in {} ticks",
         "Failed to serialize {} for push",
         "Failed to serialize {} after ack",
         "Failed to deserialize blob for {}"
      };
   }

   private synchronized void m10000() {
      Boolean var5 = false;
      this.f3000[4] = var5;
      if (NursultanClient.m82000().m72000()) {
         ((Deque)this.f3000[0]).add(Rec0206.m16000());
         this.m12000();
      }
   }

   public ConfigSync(ConfigFiles var1) {
      this.m20000();
      ArrayDeque var6 = new ArrayDeque();
      this.f3000[0] = var6;
      EnumMap var7 = new EnumMap<>(Nuker.class);
      this.f3000[1] = var7;
      EnumSet var8 = EnumSet.noneOf(Nuker.class);
      this.f3000[2] = var8;
      this.f3000[3] = var1;
   }

   static {
      ntfClinit();
   }

   private void m12000() {
      SocketConnector var1 = NursultanClient.m82000();
      if (var1.m72000()) {
         while (!((Deque)this.f3000[0]).isEmpty()) {
            Rec0206 var2 = (Rec0206)((Deque)this.f3000[0]).poll();
            switch (((int[])C0873.f1000[1])[var2.m8000().ordinal()]) {
               case 1:
                  var1.m56000(OlkOnipis.m22000());
                  break;
               case 2:
                  var1.m56000(OlkOnipis.m20000(var2.m2000().m38000()));
                  break;
               case 3:
                  if (!(Boolean)this.f3000[4]) {
                     Iface0621 var3 = ((ConfigFiles)this.f3000[3]).m68000(var2.m2000()).orElse(null);
                     if (var3 != null && !((Map)this.f3000[1]).containsKey(var2.m2000())) {
                        try {
                           byte[] var4 = OlmkIji.m8000((Base0973)var3);
                           ((Map)this.f3000[1]).put(var2.m2000(), var4);
                           var1.m56000(OlkOnipis.m16000(var2.m2000().m38000(), var4));
                        } catch (IOException var5) {
                           ((Logger)f8000[0]).error(f5000[1], var2.m2000(), var5);
                        }
                     }
                  }
            }
         }
      }
   }

   private void m14000() {
      if (!(Boolean)this.f3000[4]) {
         Boolean var5 = true;
         this.f3000[4] = var5;
         ((Logger)f8000[0]).warn(f5000[0], 1500);
         NursultanClient.m36000().m14000(1500, this::m10000);
      }
   }

   private void m20000() {
      if (this.f3000 == null) {
         this.f3000 = new Object[5];
         Object[] var1 = this.f3000;
         var1[4] = false;
      }
   }

   private static void m30000() {
      f8000 = new Object[]{null, 1500, 120};
   }

   private void m36000(Rec0045 var1) {
      HashSet var2 = new HashSet();

      for (Rec0168 var4 : var1.m10000()) {
         Nuker var5 = var4.m12000();
         if (var5 != null) {
            var2.add(var5);
            Iface0621 var6 = ((ConfigFiles)this.f3000[3]).m68000(var5).orElse(null);
            if (var6 != null) {
               if (var6.m4000()) {
                  ((Deque)this.f3000[0]).add(Rec0206.m10000(var5));
               } else {
                  ((Deque)this.f3000[0]).add(Rec0206.m14000(var5));
               }
            }
         }
      }

      for (Iface0621 var8 : ((ConfigFiles)this.f3000[3]).m76000()) {
         if (!var2.contains(var8.m2000()) && !((Base0973)var8).d_()) {
            ((Deque)this.f3000[0]).add(Rec0206.m10000(var8.m2000()));
         }
      }
   }

   public synchronized void m38000(C0116 var1) {
      switch (((int[])C0873.f1000[0])[var1.m8000().ordinal()]) {
         case 1:
            this.m36000((Rec0045)var1.m18000());
            break;
         case 2:
            this.m40000((Iltnotrs)var1.m18000());
            break;
         case 3:
            this.m48000((Rec0051)var1.m18000());
            break;
         case 4:
            this.m46000((Rec0044)var1.m18000());
      }

      this.m12000();
   }

   private void m40000(Iltnotrs var1) {
      Nuker var2 = Nuker.m34000(var1.m10000());
      if (var2 != null) {
         Iface0621 var3 = ((ConfigFiles)this.f3000[3]).m68000(var2).orElse(null);
         if (var3 != null) {
            if (var3.m4000()) {
               ((Deque)this.f3000[0]).add(Rec0206.m10000(var2));
            } else {
               try {
                  C0875 var4 = C0875.m18000();

                  try {
                     OlmkIji.m6000((Base0973)var3, var1.m16000());
                     var3.m6000((boolean)0);
                     ((ConfigFiles)this.f3000[3]).m66000(var3);
                  } catch (Throwable var8) {
                     if (var4 != null) {
                        try {
                           var4.m10000();
                        } catch (Throwable var7) {
                           var8.addSuppressed(var7);
                        }
                     }

                     throw var8;
                  }

                  if (var4 != null) {
                     var4.m10000();
                  }
               } catch (IOException var9) {
                  ((Logger)f8000[0]).error(f5000[3], var2, var9);
               }
            }
         }
      }
   }

   public synchronized void m44000(Nuker var1) {
      if (((Set)this.f3000[2]).add(var1)) {
         NursultanClient.m36000().m14000(120, () -> this.m4000(var1));
      }
   }

   private void m46000(Rec0044 var1) {
      Nuker var2 = Nuker.m34000(var1.m4000());
      if (var2 != null) {
         ((Map)this.f3000[1]).remove(var2);
         if (Enum0082.m68000(var1.m10000()) == (Enum0082)Enum0082.f16000[0]) {
            this.m14000();
         } else {
            Iface0621 var3 = ((ConfigFiles)this.f3000[3]).m68000(var2).orElse(null);
            if (var3 != null) {
               var3.m6000((boolean)0);
               ((ConfigFiles)this.f3000[3]).m66000(var3);
            }
         }
      }
   }

   private void m48000(Rec0051 var1) {
      Nuker var2 = Nuker.m34000(var1.m4000());
      if (var2 != null) {
         Iface0621 var3 = ((ConfigFiles)this.f3000[3]).m68000(var2).orElse(null);
         if (var3 != null) {
            byte[] var4 = (byte[])((Map)this.f3000[1]).remove(var2);
            if (var4 != null) {
               try {
                  byte[] var5 = OlmkIji.m8000((Base0973)var3);
                  if (Arrays.equals(var4, var5)) {
                     var3.m6000((boolean)0);
                     ((ConfigFiles)this.f3000[3]).m66000(var3);
                  } else {
                     var3.m6000((boolean)1);
                     ((ConfigFiles)this.f3000[3]).m66000(var3);
                     this.m44000(var2);
                  }
               } catch (IOException var6) {
                  ((Logger)f8000[0]).error(f5000[2], var2, var6);
               }
            }
         }
      }
   }

   public synchronized void m50000() {
      ((Deque)this.f3000[f10000[0]]).clear();
      ((Map)this.f3000[f10000[1]]).clear();
      ((Set)this.f3000[2]).clear();
      Boolean var5 = false;
      this.f3000[4] = var5;
      ((Deque)this.f3000[0]).add(Rec0206.m16000());
      this.m12000();
   }

   private static void m54000() {
      f10000 = new short[]{0, 1};
      f11000 = new short[]{2, 4, 0};
      f9000 = new short[]{2, 2, 0};
      f1000 = new short[]{0, 1, 0, 3, 3};
      f4000 = new short[]{4, 4, 0};
      f2000 = new short[]{1500, 1500, 4, 0, 0, 0, 1, 4};
      f13000 = new short[]{3, 1, 1, 0, 3, 0, 0, 3};
      f6000 = new short[]{0, 3, 1, 3};
      f12000 = new short[]{3, 0, 3, 0};
      f7000 = new short[]{3, 0, 0, 1, 2, 3, 1500};
   }
}
