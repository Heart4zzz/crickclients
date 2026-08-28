package rw.core;

import java.util.ArrayList;
import java.util.List;
import rw.api.Iface0214;
import rw.api.Iface0216;
import rw.setting.Rec0045;
import rw.setting.Rec0046;
import rw.setting.Rec0047;
import rw.setting.Rec0048;
import rw.setting.Rec0050;
import rw.setting.Rec0051;

public final class C0346 {
   private static final C0346 f1000;
   private final List<Iface0216> f2000;
   private final int f3000;
   private final List<String> f4000;

   public int m2000() {
      return this.f3000;
   }

   private C0346(List<Iface0216> var1, int var2, List<String> var3) {
      this.f2000 = var1;
      this.f3000 = var2;
      this.f4000 = var3 == null ? List.of() : List.copyOf(var3);
   }

   public List<String> m4000() {
      return this.f4000;
   }

   public List<Iface0214> m6000() {
      if (this.f2000.isEmpty()) {
         return List.of();
      } else {
         ArrayList var1 = new ArrayList(this.f3000);
         m12000(this.f2000, var1);
         return var1;
      }
   }

   public List<Iface0216> m8000() {
      return this.f2000;
   }

   public static C0346 m10000(List<Iface0216> var0, int var1, List<String> var2) {
      return var0 != null && !var0.isEmpty() && var1 > 0 ? new C0346(var0, var1, var2) : new C0346(List.of(), 0, var2);
   }

   private static void m12000(List<Iface0216> var0, List<Iface0214> var1) {
      for (Object var3 : var0) {
         switch (var3) {
            case Rec0047 var6:
               var1.add(var6.m4000());
               break;
            case Rec0048 var7:
               m12000(var7.m4000(), var1);
               break;
            case Rec0046 var8:
               m12000(var8.m6000(), var1);
               break;
            case Rec0051 var9:
               m12000(var9.m4000(), var1);
               break;
            case Rec0050 var10:
               m12000(var10.m2000(), var1);
               break;
            case Rec0045 var11:
               m12000(var11.m4000(), var1);
               break;
            default:
               throw new MatchException(null, null);
         }
      }
   }

   public static C0346 m14000() {
      return f1000;
   }
}
