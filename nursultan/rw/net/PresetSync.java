package rw.net;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import org.apache.logging.log4j.Logger;
import rw.NursultanClient;
import rw.api.PermittedSubclassesX;
import rw.core.C0113;
import rw.core.C0871;
import rw.core.C0886;
import rw.core.C1002;
import rw.core.C1210;
import rw.core.OlsmIikp;
import rw.data.IlmiOt;
import rw.data.OllIrksj;
import rw.data.Rec0040;
import rw.data.Rec0041;
import rw.data.Rec0047;
import rw.data.Rec0049;
import rw.data.Rec0052;
import rw.data.Rec0210;
import rw.data.Rec0256;
import rw.defs.Enum0065;
import rw.defs.Enum0082;
import rw.setting.C0108;

public class PresetSync {
   public static Object[] f1000;
   private static short[] f2000;
   private static short[] f3000;
   private static String[] f4000;
   public Object[] f5000;
   private static short[] f6000;
   private static short[] f7000;
   private static short[] f8000;
   private static short[] f9000;
   private static short[] f10000;
   private static short[] f11000;
   private static short[] f12000;
   private static short[] f13000;
   private static short[] f14000;
   private static short[] f15000;
   private static short[] f16000;
   private static short[] f17000;
   private static short[] f18000;
   private static short[] f19000;
   private static short[] f20000;
   private static short[] f21000;

   private void m2000() {
      NursultanClient.m82000().m56000(C1210.m2000());
   }

   public synchronized void m8000(OlsmIikp var1) {
      ((Deque)this.f5000[0]).add(Rec0210.m4000(var1.m32000()));
      this.m42000();
   }

   public PresetSync(C0108 var1) {
      this.m14000();
      ArrayDeque var6 = new ArrayDeque();
      this.f5000[0] = var6;
      HashSet var7 = new HashSet();
      this.f5000[1] = var7;
      this.f5000[2] = var1;
   }

   static {
      ntfClinit();
   }

   private void m14000() {
      if (this.f5000 == null) {
         this.f5000 = new Object[4];
         Object[] var1 = this.f5000;
         var1[3] = false;
      }
   }

   private static void m18000() {
      f4000 = new String[]{
         "Failed to apply preset {}",
         "preset NACK with unknown error code {}",
         "preset NACK for unknown id={} clientId={}",
         "preset NACK id={} clientId={} code={}",
         "preset sync deferred, retrying list in {} ticks"
      };
   }

   private void m24000() {
      if (!(Boolean)this.f5000[3]) {
         Boolean var5 = true;
         this.f5000[3] = var5;
         ((Logger)f1000[0]).warn(f4000[4], 1500);
         NursultanClient.m36000().m14000(1500, () -> {
            Boolean var5x = false;
            this.f5000[3] = var5x;
            if (NursultanClient.m82000().m72000()) {
               this.m2000();
            }
         });
      }
   }

   public synchronized void m28000(OlsmIikp var1) {
      ((Deque)this.f5000[0]).add(Rec0210.m18000(var1.m32000()));
      this.m42000();
   }

   private static void m34000() {
      f1000 = new Object[]{null, 1500};
   }

   private void m36000(Rec0256 var1) {
      ((C0108)this.f5000[2]).m66000(var1.m8000()).ifPresent(var2 -> {
         var2.m56000(var1.m2000());
         var2.m58000(var1.m16000());
         var2.m6000(var1.m16000());
         var2.m36000(var1.m6000());
         if (var2.m8000() == (Enum0065)Enum0065.f2000[1]) {
            var2.m48000((Enum0065)Enum0065.f2000[0]);
         }

         ((C0108)this.f5000[f7000[0]]).m54000(var2);
      });
   }

   public synchronized void m38000(OlsmIikp var1) {
      ((Deque)this.f5000[0]).add(Rec0210.m14000(var1.m32000()));
      this.m42000();
   }

   private void m42000() {
      SocketConnector var1 = NursultanClient.m82000();
      if (var1.m72000()) {
         while (!((Deque)this.f5000[0]).isEmpty()) {
            Rec0210 var2 = (Rec0210)((Deque)this.f5000[0]).poll();
            OlsmIikp var3 = ((C0108)this.f5000[2]).m66000(var2.m20000()).orElse(null);
            if (var3 != null) {
               switch (((int[])C0886.f1000[1])[var2.m12000().ordinal()]) {
                  case 1:
                     if (var3.m50000() && var3.m28000() != null) {
                        var1.m56000(C1210.m22000(var3.m32000(), var3.m22000(), var3.m28000(), var3.m2000()));
                     }
                     break;
                  case 2:
                     if (!var3.m46000() && var3.m50000() && var3.m28000() != null) {
                        var1.m56000(C1210.m20000(var3.m16000(), var3.m28000(), var3.m2000()));
                     }
                     break;
                  case 3:
                     if (var3.m46000()) {
                        ((C0108)this.f5000[2]).m44000(var3.m32000());
                     } else {
                        var1.m56000(C1210.m24000(var3.m16000()));
                     }
                     break;
                  case 4:
                     if (!var3.m46000()) {
                        var1.m56000(C1210.m28000(var3.m16000(), var3.m22000()));
                     }
                     break;
                  case 5:
                     if (var3.m46000()) {
                        ((Set)this.f5000[1]).remove(var3.m32000());
                     } else {
                        var1.m56000(C1210.m12000(var3.m16000()));
                     }
               }
            }
         }
      }
   }

   private String m44000(C0113 var1) {
      PermittedSubclassesX var2 = var1.m10000();

      return switch (((int[])C0886.f1000[0])[var1.m24000().ordinal()]) {
         case 1 -> "list: " + ((Rec0047)var2).m10000().size() + " entries";
         case 2 -> {
            Rec0256 var10 = ((Rec0052)var2).m8000();
            yield "create: id=" + var10.m18000() + " name=" + var10.m2000();
         }
         case 3 -> {
            IlmiOt var9 = (IlmiOt)var2;
            Rec0256 var11 = var9.m14000();
            int var12 = var9.m8000() == null ? 0 : var9.m8000().length;
            yield "update: id=" + var11.m18000() + " name=" + var11.m2000() + " bytes=" + var12;
         }
         case 4 -> {
            Rec0041 var8 = (Rec0041)var2;
            Rec0256 var4 = var8.m14000();
            int var5 = var8.m2000() == null ? 0 : var8.m2000().length;
            yield "get: id=" + var4.m18000() + " name=" + var4.m2000() + " bytes=" + var5;
         }
         case 5 -> {
            OllIrksj var7 = (OllIrksj)var2;
            yield "delete: id=" + var7.m8000();
         }
         case 6 -> {
            Rec0256 var6 = ((Rec0040)var2).m6000();
            yield "rename: id=" + var6.m18000() + " name=" + var6.m2000();
         }
         case 7 -> {
            Rec0049 var3 = (Rec0049)var2;
            yield "nack: id=" + var3.m8000() + " code=" + var3.m2000();
         }
         default -> throw new MatchException(null, null);
      };
   }

   public synchronized void m52000(UUID var1) {
      ((Set)this.f5000[1]).add(var1);
      ((Deque)this.f5000[0]).add(Rec0210.m10000(var1));
      this.m42000();
   }

   public synchronized void m56000(C0113 var1) {
      switch (((int[])C0886.f1000[0])[var1.m24000().ordinal()]) {
         case 1:
            this.m66000(((Rec0047)var1.m10000()).m10000());
            break;
         case 2:
            this.m76000(((Rec0052)var1.m10000()).m8000());
            break;
         case 3:
            this.m60000((IlmiOt)var1.m10000());
            break;
         case 4:
            this.m74000((Rec0041)var1.m10000());
            break;
         case 5:
            this.m64000((OllIrksj)var1.m10000());
            break;
         case 6:
            this.m36000(((Rec0040)var1.m10000()).m6000());
            break;
         case 7:
            this.m78000((Rec0049)var1.m10000());
      }

      this.m42000();
   }

   private void m60000(IlmiOt var1) {
      Rec0256 var2 = var1.m14000();
      ((C0108)this.f5000[2]).m66000(var2.m8000()).ifPresent(var3 -> {
         var3.m58000(var2.m16000());
         var3.m6000(var2.m16000());
         var3.m36000(var2.m6000());
         var3.m54000(var1.m2000());
         var3.m60000(var1.m8000());
         var3.m52000((boolean)(var1.m8000() != null && var1.m8000().length > 0 ? 1 : 0));
         var3.m48000((Enum0065)Enum0065.f2000[f7000[2]]);
         ((C0108)this.f5000[f7000[3]]).m54000(var3);
      });
   }

   private void m64000(OllIrksj var1) {
      ((C0108)this.f5000[2]).m52000(var1.m8000()).ifPresent(var1x -> ((C0108)this.f5000[f7000[1]]).m44000(var1x.m32000()));
   }

   private void m66000(List<Rec0256> var1) {
      HashSet var2 = new HashSet();

      for (Rec0256 var4 : var1) {
         var2.add(var4.m8000());
         OlsmIikp var5 = ((C0108)this.f5000[2]).m66000(var4.m8000()).orElse(null);
         if (var5 == null) {
            OlsmIikp var11 = new OlsmIikp(
               var4.m8000(),
               var4.m18000(),
               var4.m2000(),
               var4.m10000(),
               var4.m16000(),
               var4.m16000(),
               var4.m6000(),
               (Enum0065)Enum0065.f2000[0],
               1,
               false,
               null
            );
            ((C0108)this.f5000[2]).m54000(var11);
         } else {
            switch (((int[])C0886.f1000[2])[var5.m8000().ordinal()]) {
               case 1:
                  int var10 = var4.m6000() != var5.m64000() ? 1 : 0;
                  var5.m42000(var4.m18000());
                  var5.m36000(var4.m6000());
                  var5.m56000(var4.m2000());
                  var5.m40000(var4.m10000());
                  if (var4.m16000() > var5.m44000()) {
                     var5.m58000(var4.m16000());
                     var5.m6000(var4.m16000());
                  }

                  if (var10 != 0) {
                     var5.m52000((boolean)0);
                     var5.m60000(null);
                  }

                  ((C0108)this.f5000[2]).m54000(var5);
                  break;
               case 2:
                  var5.m42000(var4.m18000());
                  var5.m36000(var4.m6000());
                  int var6 = !var4.m2000().equals(var5.m22000()) ? 1 : 0;
                  int var7 = var5.m50000() && var5.m28000() != null ? 1 : 0;
                  if (var6 != 0) {
                     ((Deque)this.f5000[0]).add(Rec0210.m8000(var5.m32000()));
                  }

                  if (var7 != 0) {
                     ((Deque)this.f5000[0]).add(Rec0210.m4000(var5.m32000()));
                  }

                  if (var6 == 0 && var7 == 0) {
                     if (var4.m16000() > var5.m44000()) {
                        var5.m58000(var4.m16000());
                        var5.m6000(var4.m16000());
                     }

                     var5.m48000((Enum0065)Enum0065.f2000[0]);
                     ((C0108)this.f5000[2]).m54000(var5);
                  }
                  break;
               case 3:
                  var5.m42000(var4.m18000());
                  var5.m36000(var4.m6000());
                  ((C0108)this.f5000[2]).m54000(var5);
                  ((Deque)this.f5000[0]).add(Rec0210.m4000(var5.m32000()));
                  break;
               case 4:
                  var5.m42000(var4.m18000());
                  var5.m36000(var4.m6000());
                  ((Deque)this.f5000[0]).add(Rec0210.m18000(var5.m32000()));
            }
         }
      }

      for (OlsmIikp var9 : ((C0108)this.f5000[2]).m8000()) {
         if (!var2.contains(var9.m32000())) {
            switch (((int[])C0886.f1000[2])[var9.m8000().ordinal()]) {
               case 1:
               case 4:
                  ((C0108)this.f5000[2]).m44000(var9.m32000());
                  break;
               case 2:
                  if (!var9.m46000()) {
                     var9.m42000(0L);
                     var9.m36000(0L);
                     var9.m48000((Enum0065)Enum0065.f2000[2]);
                     ((C0108)this.f5000[2]).m54000(var9);
                  }

                  ((Deque)this.f5000[0]).add(Rec0210.m14000(var9.m32000()));
                  break;
               case 3:
                  ((Deque)this.f5000[0]).add(Rec0210.m14000(var9.m32000()));
            }
         }
      }

      this.m84000();
      this.m42000();
   }

   public synchronized void m72000(OlsmIikp var1) {
      ((Deque)this.f5000[0]).add(Rec0210.m8000(var1.m32000()));
      this.m42000();
   }

   private void m74000(Rec0041 var1) {
      Rec0256 var2 = var1.m14000();
      OlsmIikp var3 = ((C0108)this.f5000[2]).m66000(var2.m8000()).orElse(null);
      if (var3 == null) {
         var3 = new OlsmIikp(
            var2.m8000(),
            var2.m18000(),
            var2.m2000(),
            var2.m10000(),
            var2.m16000(),
            var2.m16000(),
            var2.m6000(),
            (Enum0065)Enum0065.f2000[0],
            var1.m10000(),
            true,
            var1.m2000()
         );
      } else {
         var3.m42000(var2.m18000());
         var3.m56000(var2.m2000());
         var3.m40000(var2.m10000());
         var3.m58000(var2.m16000());
         var3.m6000(var2.m16000());
         var3.m36000(var2.m6000());
         var3.m54000(var1.m10000());
         var3.m60000(var1.m2000());
         var3.m52000((boolean)(var1.m2000() != null && var1.m2000().length > 0 ? 1 : 0));
         if (var3.m8000() == (Enum0065)Enum0065.f2000[2] || var3.m8000() == (Enum0065)Enum0065.f2000[1]) {
            var3.m48000((Enum0065)Enum0065.f2000[0]);
         }
      }

      ((C0108)this.f5000[2]).m54000(var3);
      if (((Set)this.f5000[1]).remove(var2.m8000()) && var3.m50000() && var3.m28000() != null) {
         try {
            new C0871().m2000(var3.m2000(), var3.m28000());
         } catch (RuntimeException var5) {
            ((Logger)f1000[0]).error(f4000[0], var3.m22000(), var5);
         }
      }
   }

   private void m76000(Rec0256 var1) {
      ((C0108)this.f5000[2]).m66000(var1.m8000()).ifPresent(var2 -> {
         var2.m42000(var1.m18000());
         var2.m56000(var1.m2000());
         var2.m40000(var1.m10000());
         var2.m58000(var1.m16000());
         var2.m6000(var1.m16000());
         var2.m36000(var1.m6000());
         var2.m48000((Enum0065)Enum0065.f2000[f7000[4]]);
         ((C0108)this.f5000[f7000[5]]).m54000(var2);
      });
   }

   private void m78000(Rec0049 var1) {
      Enum0082 var2 = Enum0082.m68000(var1.m2000());
      if (var2 == null) {
         ((Logger)f1000[0]).warn(f4000[1], var1.m2000());
      } else if (var2 == (Enum0082)Enum0082.f16000[0]) {
         this.m24000();
      } else {
         OlsmIikp var3 = var1.m8000() > 0L
            ? ((C0108)this.f5000[2]).m52000(var1.m8000()).orElse(null)
            : ((C0108)this.f5000[2]).m66000(var1.m10000()).orElse(null);
         if (var3 == null) {
            ((Logger)f1000[0]).warn(f4000[2], var1.m8000(), var1.m10000());
         } else {
            ((Set)this.f5000[1]).remove(var3.m32000());
            if (var2 == (Enum0082)Enum0082.f4000[1]) {
               this.m24000();
            }

            ((Logger)f1000[0]).warn(f4000[3], var1.m8000(), var1.m10000(), var2);
         }
      }
   }

   public synchronized void m80000() {
      ((Deque)this.f5000[0]).clear();
      ((Set)this.f5000[1]).clear();
      Boolean var5 = false;
      this.f5000[3] = var5;
      this.m2000();
   }

   private static void m82000() {
      f11000 = new short[]{0, 1, 3, 0, 0};
      f3000 = new short[]{0, 0, 1};
      f10000 = new short[]{0, 0, 0, 0, 0, 2, 1, 2};
      f15000 = new short[]{1, 2, 0, 2, 2, 2, 0};
      f12000 = new short[]{0, 0, 2};
      f18000 = new short[]{2, 0};
      f14000 = new short[]{0, 2};
      f21000 = new short[]{2, 0, 2, 2, 0};
      f8000 = new short[]{2, 2, 1, 0, 2, 2, 2, 0};
      f13000 = new short[]{2, 1};
      f20000 = new short[]{0, 2, 1, 0, 2};
      f16000 = new short[]{2, 0, 0};
      f17000 = new short[]{2, 2, 0, 1, 1};
      f9000 = new short[]{0, 3};
      f6000 = new short[]{3, 0, 1500};
      f2000 = new short[]{1500, 0, 1, 2, 3};
      f19000 = new short[]{1, 0};
      f7000 = new short[]{2, 2, 0, 2, 0, 2, 1500};
   }

   private void m84000() {
      UUID var1 = NursultanClient.m10000().m62000(C1002.class).m4000();
      if (var1 != null) {
         OlsmIikp var2 = ((C0108)this.f5000[2]).m66000(var1).orElse(null);
         if (var2 != null && !var2.m46000()) {
            if (!var2.m50000() || var2.m28000() == null) {
               ((Set)this.f5000[1]).add(var1);
               ((Deque)this.f5000[0]).add(Rec0210.m10000(var1));
            }
         }
      }
   }
}
