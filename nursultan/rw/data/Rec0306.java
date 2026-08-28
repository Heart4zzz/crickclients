package rw.data;

import KDFzREm.Fo;
import KDFzREm.NDP;
import KDFzREm.NNuU;
import KDFzREm.Nkq;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import java.lang.runtime.ObjectMethods;
import rw.api.Iface0673;
import rw.setting.C0160;

public record Rec0306() implements Iface0673 {
   public byte f1000;
   public short f2000;
   public Nkq f3000;
   public Int2ObjectMap<Fo> f4000;
   public Fo f5000;
   public int f6000;
   public int f7000;

   public Nkq m2000() {
      return this.f3000;
   }

   public Int2ObjectMap<Fo> m4000() {
      return this.f4000;
   }

   public Rec0306(int var1, int var2, short var3, byte var4, Nkq var5, Fo var6, Int2ObjectMap<Fo> var7) {
      this.f7000 = var1;
      this.f6000 = var2;
      this.f2000 = var3;
      this.f1000 = var4;
      this.f3000 = var5;
      this.f5000 = var6;
      this.f4000 = var7;
   }

   static {
      ntfClinit();
   }

   public boolean m6000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0306,"syncId;revision;slot;button;actionType;itemStackHash;modifiedStacks",Rec0306::f7000,Rec0306::f6000,Rec0306::f2000,Rec0306::f1000,Rec0306::f3000,Rec0306::f5000,Rec0306::f4000>(
         this, var1
      );
   }

   public Fo m8000() {
      return this.f5000;
   }

   public void m12000(NNuU var1) {
      C0160.m74000(new NDP(this.f7000, this.f6000, this.f2000, this.f1000, this.f3000, this.f4000, this.f5000));
   }

   public int m14000() {
      return this.f6000;
   }

   public int m16000() {
      return this.f7000;
   }

   public short m18000() {
      return this.f2000;
   }

   public byte m20000() {
      return this.f1000;
   }
}
