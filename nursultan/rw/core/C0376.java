package rw.core;

import java.util.ArrayList;
import java.util.List;
import rw.data.Rec0129;
import rw.defs.Enum0037;

public final class C0376 {
   public static final C0376 f1000;
   private final List<Rec0129> f2000;

   private C0376(List<Rec0129> var1) {
      this.f2000 = var1 != null && !var1.isEmpty() ? List.copyOf(var1) : List.of();
   }

   public List<Rec0129> m2000() {
      return this.f2000;
   }

   public C0376 m4000(C0376 var1) {
      if (var1 == null || var1.m10000()) {
         return this;
      } else if (this.m10000()) {
         return var1;
      } else {
         ArrayList var2 = new ArrayList(this.f2000.size() + var1.f2000.size());
         var2.addAll(this.f2000);
         var2.addAll(var1.f2000);
         return new C0376(var2);
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private static boolean m6000(Enum0037 var0, boolean var1, boolean var2, boolean var3) {
      return switch (C0359.f1000[var0.ordinal()]) {
         case 1 -> var1;
         case 2 -> var2;
         case 3 -> var3;
         default -> throw new MatchException(null, null);
      };
   }

   private static boolean m8000(List<C0368> var0, C0368 var1) {
      for (C0368 var3 : var0) {
         if (var3 == var1) {
            return true;
         }
      }

      return false;
   }

   public boolean m10000() {
      return this.f2000.isEmpty();
   }

   public C0376 m12000(Enum0037 var1, C0368 var2, C0373 var3) {
      if (var1 != null && var2 != null && var3 != null && !var3.m74000()) {
         ArrayList var4 = new ArrayList(this.f2000.size() + 1);
         var4.addAll(this.f2000);
         var4.add(new Rec0129(var1, var2, var3));
         return new C0376(var4);
      } else {
         return this;
      }
   }

   public boolean m14000(Enum0037 var1) {
      if (var1 != null && !this.m10000()) {
         for (Rec0129 var3 : this.f2000) {
            if (var3.m8000() == var1) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   public C0373 m16000(List<C0368> var1, boolean var2, boolean var3, boolean var4) {
      if (!this.m10000() && var1 != null && !var1.isEmpty()) {
         C0373 var5 = C0373.f1000;

         for (Rec0129 var7 : this.f2000) {
            if (m6000(var7.m8000(), var2, var3, var4) && m8000(var1, var7.m6000())) {
               var5 = var5.m78000(var7.m2000());
            }
         }

         return var5;
      } else {
         return C0373.f1000;
      }
   }
}
