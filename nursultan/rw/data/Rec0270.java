package rw.data;

import java.lang.runtime.ObjectMethods;
import java.util.function.ObjIntConsumer;
import rw.api.Iface0196;
import rw.gui.PgUp;

public record Rec0270() {
   public ObjIntConsumer<PgUp> f1000;
   public Iface0196<Boolean> f2000;
   public int f3000;
   public PgUp f4000;

   public int m2000() {
      return this.f3000;
   }

   public Rec0270(PgUp var1, int var2, ObjIntConsumer<PgUp> var3, Iface0196<Boolean> var4) {
      this.f4000 = var1;
      this.f3000 = var2;
      this.f1000 = var3;
      this.f2000 = var4;
   }

   static {
      ntfClinit();
   }

   public boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0270,"key;mods;onChange;active",Rec0270::f4000,Rec0270::f3000,Rec0270::f1000,Rec0270::f2000>(this, var1);
   }

   public Iface0196<Boolean> m6000() {
      return this.f2000;
   }

   public PgUp m8000() {
      return this.f4000;
   }

   public ObjIntConsumer<PgUp> m10000() {
      return this.f1000;
   }
}
