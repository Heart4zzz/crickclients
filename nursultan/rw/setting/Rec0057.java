package rw.setting;

import java.lang.runtime.ObjectMethods;
import java.util.Objects;
import rw.api.Iface0192;
import rw.api.Iface0203;
import rw.core.C0374;
import rw.data.Rec0076;
import rw.defs.Enum0011;
import rw.defs.Enum0019;
import rw.defs.Enum0022;

public record Rec0057() {
   private final Enum0019 f1000;
   private final Iface0192 f2000;
   private final Enum0011 f3000;

   public Enum0011 m2000() {
      return this.f3000;
   }

   public static Rec0057 m4000(Iface0192 var0) {
      return m38000(Enum0019.f3000, var0);
   }

   public static Rec0057 m6000(Iface0192 var0) {
      return m40000(Enum0011.f2000, var0);
   }

   public static Rec0057 m8000(Iface0192 var0) {
      return m38000(Enum0019.f20000, var0);
   }

   public Rec0057(Enum0019 var1, Iface0192 var2, Enum0011 var3) {
      var2 = var2 == null ? Iface0192.m2000() : var2;
      var3 = var3 == null ? Enum0011.f1000 : var3;
      m42000(var1, var3, var2);
      this.f1000 = var1;
      this.f2000 = var2;
      this.f3000 = var3;
   }

   public final boolean m10000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0057,"property;spec;group",Rec0057::f1000,Rec0057::f2000,Rec0057::f3000>(this, var1);
   }

   public static Rec0057 m12000(Iface0192 var0) {
      return m40000(Enum0011.f3000, var0);
   }

   public static Rec0057 m14000(Iface0192 var0) {
      return m40000(Enum0011.f4000, var0);
   }

   public static Rec0057 m16000(Iface0192 var0) {
      return m38000(Enum0019.f5000, var0);
   }

   public static Rec0057 m18000(Iface0192 var0) {
      return m38000(Enum0019.f21000, var0);
   }

   public static Rec0057 m20000(Iface0192 var0) {
      return m38000(Enum0019.f19000, var0);
   }

   public static Rec0057 m22000(Iface0192 var0) {
      return m38000(Enum0019.f16000, var0);
   }

   public static Rec0057 m24000(Iface0192 var0) {
      return m38000(Enum0019.f15000, var0);
   }

   public static Rec0057 m26000(Iface0192 var0) {
      return m38000(Enum0019.f4000, var0);
   }

   public static Rec0057 m28000(Iface0192 var0) {
      return m38000(Enum0019.f2000, var0);
   }

   public Iface0192 m30000() {
      return this.f2000;
   }

   public static Rec0057 m32000(Iface0192 var0) {
      return m38000(Enum0019.f17000, var0);
   }

   public Enum0019 m34000() {
      return this.f1000;
   }

   public static Rec0057 m36000(Iface0192 var0) {
      return m38000(Enum0019.f1000, var0);
   }

   public static Rec0057 m38000(Enum0019 var0, Iface0192 var1) {
      return new Rec0057(Objects.requireNonNull(var0, "property"), var1, Enum0011.f1000);
   }

   private static Rec0057 m40000(Enum0011 var0, Iface0192 var1) {
      return new Rec0057(null, var1, Objects.requireNonNull(var0, "group"));
   }

   private static void m42000(Enum0019 var0, Enum0011 var1, Iface0192 var2) {
      if (var2.m4000()) {
         if (!(var2 instanceof Rec0076)) {
            if (var2 instanceof Iface0203 var3) {
               Enum0022 var4 = m44000(var0, var1);
               if (var4 != null && !var3.m2000(var4)) {
                  throw new IllegalArgumentException("Transition spec does not support " + var4 + " values");
               }
            } else {
               throw new IllegalArgumentException("Unsupported transition spec type: " + var2.getClass().getName());
            }
         }
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private static Enum0022 m44000(Enum0019 var0, Enum0011 var1) {
      if (var0 != null) {
         return var0.m26000();
      } else {
         return switch (C0374.f1000[var1.ordinal()]) {
            case 1, 2 -> Enum0022.f1000;
            case 3 -> Enum0022.f4000;
            case 4 -> null;
            default -> throw new MatchException(null, null);
         };
      }
   }

   public static Rec0057 m46000(Iface0192 var0) {
      return m38000(Enum0019.f18000, var0);
   }

   public static Rec0057 m48000(Iface0192 var0) {
      return m38000(Enum0019.f6000, var0);
   }
}
