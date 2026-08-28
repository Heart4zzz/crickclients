package rw.core;

import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap.Entry;
import java.util.ArrayList;
import rw.api.Iface0003;
import rw.api.Iface0006;
import rw.api.NestMembersX;
import rw.data.Rec0001;
import rw.data.Rec0007;

public class C0025 {
   private static short[] f1000;
   private static short[] f2000;
   private static short[] f3000;
   private static short[] f4000;
   private static short[] f5000;
   private static short[] f6000;
   private static short[] f7000;
   private static short[] f8000;
   public Object[] f9000;
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

   public Iface0006 m4000() {
      this.m22000();
      return ((C0023)this.f9000[2]).m16000();
   }

   public boolean m6000(C0023 var1) {
      return (boolean)(var1 != null
            && var1.f1000[0] == ((C0012)this.f9000[0]).m52000()
            && var1.f1000[1] == ((C0012)this.f9000[0]).m26000()
            && ((Rec0007)var1.f1000[2]).m4000(((C0012)this.f9000[0]).m40000((Integer)var1.f1000[0], (Integer)var1.f1000[1]))
            && (Iface0003)var1.f1000[3] != null
            && ((Iface0003)var1.f1000[3]).m10000()
            && !var1.f1000[6]
         ? 1
         : 0);
   }

   private C0023 m8000(int var1, int var2) {
      Rec0007 var3 = ((C0012)this.f9000[0]).m40000(var1, var2);
      NestMembersX var4 = NestMembersX.m4000();
      Iface0003 var5 = var4.m6000(var3.m6000());
      Iface0003 var6 = var3.m2000() == null ? null : var4.m6000(var3.m2000());
      return new C0023(var1, var2, var3, var5, var6);
   }

   public void m10000(C0023 var1) {
      if (var1 != null) {
         Boolean var6 = false;
         var1.f1000[6] = var6;
         Long var7 = System.currentTimeMillis();
         var1.f1000[7] = var7;
      }
   }

   public Iface0003 m12000() {
      if (!((C0012)this.f9000[0]).m62000()) {
         return null;
      } else {
         this.m22000();
         this.m32000();
         return (Iface0003)((C0023)this.f9000[2]).f1000[4];
      }
   }

   public C0025(C0012 var1) {
      this.m26000();
      Object2ObjectOpenHashMap var6 = new Object2ObjectOpenHashMap();
      this.f9000[1] = var6;
      this.f9000[0] = var1;
   }

   static {
      ntfClinit();
   }

   public void m14000() {
      ObjectIterator var1 = ((Object2ObjectOpenHashMap)this.f9000[1]).values().iterator();

      while (var1.hasNext()) {
         ArrayList var2 = (ArrayList)var1.next();

         for (C0023 var4 : var2) {
            var4.m18000();
         }
      }

      ((Object2ObjectOpenHashMap)this.f9000[1]).clear();
      Object var9 = null;
      this.f9000[2] = var9;
   }

   public Iface0006 m16000(C0023 var1) {
      return var1 == null ? null : var1.m16000();
   }

   private C0023 m18000(C0023 var1) {
      Rec0001 var2 = new Rec0001((Integer)var1.f1000[0], (Integer)var1.f1000[1]);
      ArrayList var3 = (ArrayList)((Object2ObjectOpenHashMap)this.f9000[1]).computeIfAbsent(var2, var0 -> new ArrayList(1));
      var3.add(var1);
      return var1;
   }

   public boolean m20000() {
      ObjectIterator var1 = ((Object2ObjectOpenHashMap)this.f9000[1]).values().iterator();

      while (var1.hasNext()) {
         ArrayList var2 = (ArrayList)var1.next();

         for (C0023 var4 : var2) {
            if ((Iface0003)var4.f1000[3] != null && ((Iface0003)var4.f1000[3]).m10000()) {
               return (boolean)1;
            }
         }
      }

      return (boolean)0;
   }

   public void m22000() {
      int var1 = ((C0012)this.f9000[0]).m52000();
      int var2 = ((C0012)this.f9000[0]).m26000();
      if ((C0023)this.f9000[2] != null
         && (Integer)((C0023)this.f9000[2]).f1000[0] == var1
         && (Integer)((C0023)this.f9000[2]).f1000[1] == var2
         && (Iface0003)((C0023)this.f9000[2]).f1000[3] != null
         && ((Iface0003)((C0023)this.f9000[2]).f1000[3]).m10000()) {
         ((C0012)this.f9000[0]).m4000(var1, var2);
      } else {
         C0023 var7 = this.m56000(var1, var2, false);
         this.f9000[2] = var7;
         ((C0012)this.f9000[0]).m4000((Integer)((C0023)this.f9000[2]).f1000[0], (Integer)((C0023)this.f9000[2]).f1000[1]);
         this.m32000();
      }
   }

   public Iface0003 m24000(C0023 var1) {
      return var1 == null ? null : (Iface0003)var1.f1000[3];
   }

   private void m26000() {
      if (this.f9000 == null) {
         this.f9000 = new Object[3];
         Object[] var1 = this.f9000;
      }
   }

   private static void m28000() {
      f7000 = new short[]{1, 0, 2};
      f4000 = new short[]{3, 0, 2, 4, 1, 3, 3, 2};
      f17000 = new short[]{2, 4, 2, 4};
      f12000 = new short[]{2, 2, 0};
      f16000 = new short[]{2, 1, 2, 0, 0, 2, 2};
      f14000 = new short[]{0, 2};
      f5000 = new short[]{1, 2, 3, 2, 3, 0, 2, 0};
      f1000 = new short[]{2, 0, 2, 1, 2};
      f19000 = new short[]{2, 7, 1, 1, 1, 1, 2, 0};
      f8000 = new short[]{0, 6, 2, 0, 0, 1, 7};
      f6000 = new short[]{6, 7, 0, 0, 1, 0, 2};
      f15000 = new short[]{0, 0, 1, 3, 3, 6, 6, 2};
      f13000 = new short[]{0, 0, 1};
      f10000 = new short[]{7, 0, 1, 1, 1, 2};
      f2000 = new short[]{2, 6, 7, 3, 4};
      f18000 = new short[]{2, 1, 6};
      f3000 = new short[]{1, 0, 1, 1, 1, 0, 0, 2};
      f11000 = new short[]{2};
   }

   public Iface0003 m30000(C0023 var1) {
      return var1 == null ? null : (Iface0003)var1.f1000[4];
   }

   public void m32000() {
      if ((C0023)this.f9000[2] != null) {
         C0023 var10000 = (C0023)this.f9000[2];
         Long var5 = System.currentTimeMillis();
         var10000.f1000[7] = var5;
      }
   }

   public void m34000(C0023 var1) {
      if (var1 != null) {
         this.m18000(var1);
         this.m10000(var1);
      }
   }

   public void m36000(int var1, int var2) {
      if ((C0023)this.f9000[2] == null || (Integer)((C0023)this.f9000[2]).f1000[0] != var1 || (Integer)((C0023)this.f9000[2]).f1000[1] != var2) {
         C0023 var7 = this.m48000(new Rec0001(var1, var2));
         this.f9000[2] = var7;
      }
   }

   public boolean m38000() {
      return (boolean)((C0023)this.f9000[2] != null
            && (Iface0003)((C0023)this.f9000[2]).f1000[4] != null
            && ((Iface0003)((C0023)this.f9000[2]).f1000[4]).m10000()
         ? 1
         : 0);
   }

   public C0023 m46000(int var1, int var2) {
      return this.m8000(var1, var2);
   }

   private C0023 m48000(Rec0001 var1) {
      ArrayList var2 = (ArrayList)((Object2ObjectOpenHashMap)this.f9000[1]).get(var1);
      return var2 != null && !var2.isEmpty() ? (C0023)var2.getFirst() : null;
   }

   public C0023 m50000() {
      C0023 var1 = this.m56000(((C0012)this.f9000[0]).m52000(), ((C0012)this.f9000[0]).m26000(), true);
      Boolean var6 = true;
      var1.f1000[6] = var6;
      this.f9000[2] = var1;
      ((C0012)this.f9000[0]).m4000((Integer)var1.f1000[0], (Integer)var1.f1000[1]);
      Long var8 = System.currentTimeMillis();
      var1.f1000[7] = var8;
      return var1;
   }

   private C0023 m56000(int var1, int var2, boolean var3) {
      Rec0001 var4 = new Rec0001(var1, var2);
      ArrayList var5 = (ArrayList)((Object2ObjectOpenHashMap)this.f9000[1]).get(var4);
      if (var5 != null) {
         for (C0023 var7 : var5) {
            if (!var3 || !(Boolean)var7.f1000[6]) {
               return var7;
            }
         }
      } else {
         var5 = new ArrayList(1);
         ((Object2ObjectOpenHashMap)this.f9000[1]).put(var4, var5);
      }

      C0023 var8 = this.m8000(var1, var2);
      var5.add(var8);
      return var8;
   }

   public C0023 m58000(C0023 var1) {
      C0023 var2 = var1 == null ? this.m50000() : this.m18000(var1);
      Boolean var7 = true;
      var2.f1000[6] = var7;
      this.f9000[2] = var2;
      ((C0012)this.f9000[0]).m4000((Integer)var2.f1000[0], (Integer)var2.f1000[1]);
      Long var9 = System.currentTimeMillis();
      var2.f1000[7] = var9;
      return var2;
   }

   public void m60000(long var1, long var3) {
      ArrayList var5 = new ArrayList();
      ObjectIterator var6 = ((Object2ObjectOpenHashMap)this.f9000[1]).object2ObjectEntrySet().iterator();

      while (var6.hasNext()) {
         Entry var7 = (Entry)var6.next();
         ArrayList var8 = (ArrayList)var7.getValue();
         var8.removeIf(var5x -> {
            if (!((C0023)var5x).m24000(var1, var3, ((C0012)this.f9000[0]).m32000())) {
               return (boolean)0;
            } else {
               if (var5x == (C0023)this.f9000[2]) {
                  Object var10x = null;
                  this.f9000[f11000[0]] = var10x;
               }

               ((C0023)var5x).m18000();
               return (boolean)1;
            }
         });
         if (var8.isEmpty()) {
            var5.add((Rec0001)var7.getKey());
         }
      }

      for (Rec0001 var10 : var5) {
         ((Object2ObjectOpenHashMap)this.f9000[1]).remove(var10);
      }
   }

   public Iface0003 m64000() {
      this.m22000();
      this.m32000();
      return (Iface0003)((C0023)this.f9000[2]).f1000[3];
   }

   public C0023 m66000(C0023 var1) {
      if (var1 == null) {
         return null;
      } else {
         Rec0001 var2 = new Rec0001((Integer)var1.f1000[0], (Integer)var1.f1000[1]);
         ArrayList var3 = (ArrayList)((Object2ObjectOpenHashMap)this.f9000[1]).get(var2);
         if (var3 != null) {
            var3.remove(var1);
            if (var3.isEmpty()) {
               ((Object2ObjectOpenHashMap)this.f9000[1]).remove(var2);
            }
         }

         if ((C0023)this.f9000[2] == var1) {
            C0023 var8 = this.m48000(var2);
            this.f9000[2] = var8;
         }

         Boolean var9 = false;
         var1.f1000[6] = var9;
         Long var10 = System.currentTimeMillis();
         var1.f1000[7] = var10;
         return var1;
      }
   }
}
