package rw.core;

import java.util.List;
import rw.api.Iface0215;
import rw.api.Iface0216;
import rw.data.Rec0096;
import rw.data.Rec0108;
import rw.data.Rec0118;

public final class C0334 {
   private final C0336 f1000 = new C0336();
   private final C0344 f2000 = new C0344();
   private final C0380 f3000 = new C0380();
   private final C0363 f4000 = new C0363();
   private final C0335 f5000 = new C0335();
   private final C0333 f6000 = new C0333();
   private final C0333 f7000 = new C0333();
   private final C0333 f8000 = new C0333();

   public List<Iface0216> m2000() {
      return this.f2000.m10000();
   }

   public Iface0215 m4000() {
      return this.f2000.m20000();
   }

   public List<Iface0216> m6000() {
      return this.f3000.m14000();
   }

   public int m8000() {
      return this.f3000.m4000();
   }

   public List<Iface0216> m10000() {
      return this.f2000.m8000();
   }

   public void m12000() {
      this.f2000.m4000();
   }

   public Rec0096 m14000() {
      return this.f4000.m4000();
   }

   public List<Iface0216> m16000() {
      return this.f2000.m2000();
   }

   public boolean m18000(int var1, int var2, int var3) {
      return this.f4000.m6000(var1, var2, var3);
   }

   int m20000(Rec0108 var1, float var2) {
      return this.f8000.m10000(var1, var2);
   }

   public List<Iface0216> m22000() {
      return this.f2000.m18000();
   }

   public void m24000() {
      this.f3000.m2000();
   }

   int m26000(Rec0118 var1) {
      return this.f5000.m2000(var1);
   }

   public boolean m28000(int var1, int var2, int var3, int var4, int var5) {
      return this.f2000.m14000(var1, var2, var3, var4, var5);
   }

   int m30000(Rec0108 var1) {
      return this.f6000.m10000(var1, 0.0F);
   }

   int m32000(Rec0108 var1, float var2) {
      return this.f7000.m10000(var1, var2);
   }

   boolean m34000(int var1, int var2) {
      return this.f3000.m10000(var1, var2);
   }

   void m36000(int var1) {
      this.f3000.m8000(var1);
   }

   public boolean m38000(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      return this.f3000.m12000(var1, var7, var8) && this.f2000.m14000(var2, var3, var4, var5, var6);
   }

   public void m40000(
      List<Iface0216> var1,
      List<Iface0216> var2,
      List<Iface0216> var3,
      List<Iface0216> var4,
      List<Iface0216> var5,
      Iface0215 var6,
      int var7,
      int var8,
      int var9,
      int var10,
      int var11
   ) {
      this.f2000.m12000(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
   }

   public List<rw.setting.C0059> m42000() {
      return this.f1000.m4000();
   }

   public void m44000(List<rw.setting.C0059> var1, int var2, int var3, int var4) {
      this.f1000.m2000(var1, var2, var3, var4);
   }

   public void m46000(Rec0096 var1, int var2, int var3, int var4) {
      this.f4000.m2000(var1, var2, var3, var4);
   }

   void m48000(List<Iface0216> var1, int var2, int var3, int var4, int var5, int var6) {
      this.f3000.m6000(var1, var2, var3, var4, var5, var6);
   }

   public boolean m50000(int var1, int var2, int var3) {
      return this.f1000.m6000(var1, var2, var3);
   }

   public List<Iface0216> m52000() {
      return this.f2000.m6000();
   }
}
