package rw.setting;

import java.util.Objects;
import net.minecraft.world.entity.WalkAnimationState;
import rw.core.C0346;
import rw.data.Rec0079;
import rw.data.Rec0098;
import rw.data.Rec0100;
import rw.data.Rec0105;

public final class C0035 {
   private final rw.gui.C0013 f1000;
   private final C0024 f2000;
   private final C0043 f3000;
   private final C0063 f4000;
   private final rw.gui.C0020 f5000;
   private final C0049 f6000;
   private final rw.gui.C0016 f7000;
   private final C0066 f8000;
   private final WalkAnimationState f9000 = new WalkAnimationState(120.0F);
   private Rec0105 f10000;
   private float f11000 = Float.NaN;
   private float f12000 = Float.NaN;
   private C0059 f13000;
   private C0346 f14000 = C0346.m14000();
   private boolean f15000;
   private boolean f16000;
   private boolean f17000;

   boolean m2000() {
      return this.f16000;
   }

   private void m4000(C0059 var1, Rec0100 var2) {
      if (!var2.m10000() && var2.m2000()) {
         var1.m4000(8);
      }
   }

   public C0035(rw.gui.C0013 var1) {
      this(var1, Rec0105.m16000());
   }

   public C0035(rw.gui.C0013 var1, Rec0105 var2) {
      this.f1000 = Objects.requireNonNull(var1, "context");
      this.f2000 = C0024.m18000(var1);
      this.f3000 = C0043.m8000(var1);
      this.f4000 = C0063.m18000(var1);
      this.f5000 = rw.gui.C0020.m22000(var1);
      this.f6000 = C0049.m6000(var1);
      this.f7000 = rw.gui.C0016.m36000(var1);
      this.f8000 = C0066.m10000(var1);
      this.m26000(var2);
   }

   boolean m6000() {
      return this.f17000;
   }

   private boolean m8000(C0059 var1, Rec0100 var2) {
      if (var2.m10000()) {
         return false;
      } else {
         return this.f15000 != this.f10000.m6000() ? false : !var1.m178000(1);
      }
   }

   private void m10000(C0059 var1) {
      this.f13000 = var1;
      this.f9000.y();
      this.f11000 = Float.NaN;
      this.f12000 = Float.NaN;
      this.f14000 = C0346.m14000();
      this.f15000 = false;
   }

   private Rec0079 m12000(float var1) {
      float var2 = this.f9000.y(var1);
      if (var2 <= 0.0F) {
         return Rec0079.f3000;
      } else {
         Rec0079 var3 = this.f2000.m8000(var2);
         boolean var4 = this.f5000.m18000(var2);
         Rec0098 var5 = this.f3000.m6000(var2);
         return Rec0079.m8000(var3.m6000() || var5.m4000() || var4, var3.m4000() || var4);
      }
   }

   public Rec0105 m14000() {
      return this.f10000;
   }

   private boolean m16000(C0059 var1, float var2, float var3, Rec0100 var4) {
      if (!var4.m10000()) {
         return false;
      } else {
         boolean var5 = this.f4000.m12000(var1, var2, var3, this.f10000.m8000());
         this.f11000 = var2;
         this.f12000 = var3;
         return var5;
      }
   }

   private Rec0100 m18000(C0059 var1, float var2, float var3, boolean var4) {
      boolean var5 = Float.compare(this.f11000, var2) != 0 || Float.compare(this.f12000, var3) != 0;
      boolean var6 = var1.m178000(2);
      boolean var7 = var5 || var4 || var6;
      boolean var8 = var1.m178000(4);
      boolean var9 = var1.m178000(8);
      boolean var10 = var8 && !var6 && !var5 && !var4;
      return new Rec0100(var7, var10, var9, var5);
   }

   private boolean m20000(C0059 var1, Rec0100 var2) {
      return !var2.m8000() ? false : this.f4000.m26000(var1);
   }

   public C0038 m22000(C0031 var1) {
      return new C0038(this.f1000, var1);
   }

   public rw.gui.C0013 m24000() {
      return this.f1000;
   }

   public void m26000(Rec0105 var1) {
      Rec0105 var2 = var1 == null ? Rec0105.m16000() : var1;
      this.f10000 = var2;
      this.f9000.N(var2.m10000());
      this.f7000.m42000(var2.m2000());
   }

   C0346 m28000(C0038 var1, int var2, int var3, float var4) {
      if (var1 == null) {
         this.f16000 = false;
         this.f17000 = false;
         return C0346.m14000();
      } else {
         float var5 = this.f1000.m6000().m4000();
         float var6 = Math.max(0.0F, (float)var2) / var5;
         float var7 = Math.max(0.0F, (float)var3) / var5;
         return this.m30000(var1, var6, var7, var4);
      }
   }

   C0346 m30000(C0038 var1, float var2, float var3, float var4) {
      if (var1 == null) {
         this.f16000 = false;
         this.f17000 = false;
         return C0346.m14000();
      } else {
         C0059 var5 = (C0059)var1.m20000();
         float var6 = this.m32000(var4);
         this.m34000(var5);
         Rec0079 var7 = this.m12000(var6);
         boolean var8 = var1.m8000();
         boolean var9 = this.f8000.m12000(var6);
         this.f7000.m30000(var5);
         boolean var10 = this.f7000.m26000(var5, var6);
         Rec0100 var11 = this.m18000(var5, var2, var3, var7.m4000() || var8);
         boolean var12 = this.m16000(var5, var2, var3, var11);
         boolean var13 = this.m20000(var5, var11);
         boolean var14 = var12 || var13 || var11.m2000() || var11.m6000();
         boolean var15 = var1.m34000(var2, var3, this.f1000.m6000().m4000(), var14);
         if (var11.m6000()) {
            var5.m112000(1);
         }

         this.f7000.m30000(var5);
         if (this.m8000(var5, var11)) {
            this.f16000 = var7.m6000() || var9 || var10 || var8;
            this.f17000 = var8;
            return this.f14000;
         } else {
            if (var12 || var13 || var15 || var11.m2000()) {
               this.f1000.m4000().m20000();
            }

            C0346 var16 = this.f6000.m4000(var5, var2, var3, this.f10000.m8000(), this.f10000.m6000());
            this.m4000(var5, var11);
            this.f14000 = var16;
            this.f15000 = this.f10000.m6000();
            this.f16000 = var7.m6000() || var9 || var10 || var8;
            this.f17000 = var12 || var13 || var15 || var8;
            return var16;
         }
      }
   }

   private float m32000(float var1) {
      return Math.max(0.0F, var1);
   }

   private void m34000(C0059 var1) {
      if (var1 != this.f13000) {
         this.m10000(var1);
      }
   }
}
