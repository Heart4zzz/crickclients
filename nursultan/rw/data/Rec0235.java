package rw.data;

import java.lang.runtime.ObjectMethods;
import java.util.function.BiConsumer;
import org.joml.Vector2f;
import rw.api.Iface0196;
import rw.api.Iface0202;
import rw.api.Iface0212;
import rw.api.Iface0625;
import rw.api.Iface0626;
import rw.core.C0288;
import rw.core.C0290;
import rw.setting.C0056;

public record Rec0235() implements Iface0626 {
   public BiConsumer<C0288, Iface0202> f1000;
   public C0056 f2000;
   public Iface0625<? super Rec0235> f3000;
   public Iface0196<Vector2f> f4000;
   public Iface0196<Boolean> f5000;
   public C0290<Iface0212> f6000;
   public Iface0196<Vector2f> f7000;
   public String f8000;

   @Override
   public Iface0196<Vector2f> m2000() {
      return this.f4000;
   }

   public C0290<Iface0212> m4000() {
      return this.f6000;
   }

   public Rec0235(
      String var1,
      C0290<Iface0212> var2,
      C0056 var3,
      Iface0196<Vector2f> var4,
      Iface0196<Boolean> var5,
      Iface0196<Vector2f> var6,
      Iface0625<? super Rec0235> var7,
      BiConsumer<C0288, Iface0202> var8
   ) {
      this.f8000 = var1;
      this.f6000 = var2;
      this.f2000 = var3;
      this.f7000 = var4;
      this.f5000 = var5;
      this.f4000 = var6;
      this.f3000 = var7;
      this.f1000 = var8;
   }

   static {
      ntfClinit();
   }

   public boolean m6000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0235,"id;ref;style;position;dragging;dragOffset;behavior;content",Rec0235::f8000,Rec0235::f6000,Rec0235::f2000,Rec0235::f7000,Rec0235::f5000,Rec0235::f4000,Rec0235::f3000,Rec0235::f1000>(
         this, var1
      );
   }

   public BiConsumer<C0288, Iface0202> m8000() {
      return this.f1000;
   }

   public C0056 m10000() {
      return this.f2000;
   }

   public Iface0196<Boolean> m12000() {
      return this.f5000;
   }

   public Iface0196<Vector2f> m14000() {
      return this.f7000;
   }

   public String m16000() {
      return this.f8000;
   }

   public Iface0625<? super Rec0235> m18000() {
      return this.f3000;
   }
}
