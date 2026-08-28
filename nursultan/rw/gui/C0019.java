package rw.gui;

import java.util.Objects;
import rw.core.C0366;
import rw.core.C0370;
import rw.data.Rec0066;
import rw.data.Rec0068;
import rw.data.Rec0070;
import rw.data.Rec0125;
import rw.data.Rec0126;
import rw.data.Rec0127;
import rw.data.Rec0128;
import rw.data.Rec0130;
import rw.data.Rec0131;
import rw.defs.Enum0031;
import rw.defs.Enum0032;
import rw.defs.Enum0033;
import rw.defs.Enum0034;
import rw.defs.Enum0035;
import rw.defs.Enum0036;
import rw.defs.Enum0038;
import rw.defs.Enum0040;
import rw.defs.Enum0041;
import rw.defs.Enum0042;
import rw.defs.Enum0044;
import rw.setting.Rec0036;

public final class C0019 {
   private final Enum0035 f1000;
   private final Enum0034 f2000;
   private final Enum0034 f3000;
   private final Enum0040 f4000;
   private final Rec0128 f5000;
   private final Rec0131 f6000;
   private final Rec0126 f7000;
   private final float f8000;
   private final Enum0038 f9000;
   private final Enum0032 f10000;
   private final boolean f11000;
   private final int f12000;
   private final float f13000;
   private final float f14000;
   private final Rec0066 f15000;
   private final Rec0066 f16000;
   private final float f17000;
   private final float f18000;
   private final Enum0036 f19000;
   private final Enum0042 f20000;
   private final Enum0033 f21000;
   private final Rec0130 f22000;
   private final Rec0125 f23000;
   private final Rec0125 f24000;
   private final boolean f25000;
   private final boolean f26000;
   private final boolean f27000;
   private final int f28000;
   private final float f29000;
   private final float f30000;
   private final int f31000;
   private final int f32000;
   private final int f33000;
   private final float f34000;
   private final Rec0036 f35000;
   private final Enum0031 f36000;
   private final int f37000;
   private final float f38000;
   private final Rec0070 f39000;
   private final float f40000;
   private final float f41000;
   private final Rec0068 f42000;
   private final String f43000;
   private final Enum0044 f44000;
   private final float f45000;
   private final Enum0034 f46000;
   private final boolean f47000;
   private final boolean f48000;

   public Enum0042 m2000() {
      return this.f20000;
   }

   public boolean m4000(C0019 var1) {
      if (var1 == null) {
         return false;
      } else {
         for (Enum0041 var3 : Enum0041.m4000()) {
            if (var3.m86000(this, var1)) {
               return false;
            }
         }

         return true;
      }
   }

   public boolean m6000() {
      return !this.f15000.m18000() || !this.f16000.m18000() || this.f43000 != null && m144000(this.f10000);
   }

   public C0019 m8000(boolean var1) {
      return this.f27000 == var1
         ? this
         : new C0019(
            this.f1000,
            this.f2000,
            this.f3000,
            this.f4000,
            this.f5000,
            this.f6000,
            this.f7000,
            this.f8000,
            this.f9000,
            this.f10000,
            this.f11000,
            this.f12000,
            this.f13000,
            this.f14000,
            this.f15000,
            this.f16000,
            this.f17000,
            this.f18000,
            this.f19000,
            this.f20000,
            this.f21000,
            this.f22000,
            this.f23000,
            this.f24000,
            this.f25000,
            this.f26000,
            var1,
            this.f28000,
            this.f29000,
            this.f30000,
            this.f31000,
            this.f32000,
            this.f33000,
            this.f34000,
            this.f35000,
            this.f36000,
            this.f37000,
            this.f38000,
            this.f39000,
            this.f40000,
            this.f41000,
            this.f42000,
            this.f43000,
            this.f44000,
            this.f45000,
            this.f46000,
            this.f47000,
            this.f48000
         );
   }

   public C0019 m10000(int var1) {
      return this.f31000 == var1
         ? this
         : new C0019(
            this.f1000,
            this.f2000,
            this.f3000,
            this.f4000,
            this.f5000,
            this.f6000,
            this.f7000,
            this.f8000,
            this.f9000,
            this.f10000,
            this.f11000,
            this.f12000,
            this.f13000,
            this.f14000,
            this.f15000,
            this.f16000,
            this.f17000,
            this.f18000,
            this.f19000,
            this.f20000,
            this.f21000,
            this.f22000,
            this.f23000,
            this.f24000,
            this.f25000,
            this.f26000,
            this.f27000,
            this.f28000,
            this.f29000,
            this.f30000,
            var1,
            this.f32000,
            this.f33000,
            this.f34000,
            this.f35000,
            this.f36000,
            this.f37000,
            this.f38000,
            this.f39000,
            this.f40000,
            this.f41000,
            this.f42000,
            this.f43000,
            this.f44000,
            this.f45000,
            this.f46000,
            this.f47000,
            this.f48000
         );
   }

   public C0019 m12000(Enum0034 var1) {
      if (var1 == null) {
         throw new NullPointerException("anchorAlign is marked non-null but is null");
      } else {
         return this.f46000 == var1
            ? this
            : new C0019(
               this.f1000,
               this.f2000,
               this.f3000,
               this.f4000,
               this.f5000,
               this.f6000,
               this.f7000,
               this.f8000,
               this.f9000,
               this.f10000,
               this.f11000,
               this.f12000,
               this.f13000,
               this.f14000,
               this.f15000,
               this.f16000,
               this.f17000,
               this.f18000,
               this.f19000,
               this.f20000,
               this.f21000,
               this.f22000,
               this.f23000,
               this.f24000,
               this.f25000,
               this.f26000,
               this.f27000,
               this.f28000,
               this.f29000,
               this.f30000,
               this.f31000,
               this.f32000,
               this.f33000,
               this.f34000,
               this.f35000,
               this.f36000,
               this.f37000,
               this.f38000,
               this.f39000,
               this.f40000,
               this.f41000,
               this.f42000,
               this.f43000,
               this.f44000,
               this.f45000,
               var1,
               this.f47000,
               this.f48000
            );
      }
   }

   public C0019 m14000(float var1) {
      float var2 = Math.max(0.0F, var1);
      return m174000(this.f5000.m2000(), var2) ? this : this.m186000(new Rec0128(var2, this.f5000.m8000(), this.f5000.m6000(), this.f5000.m20000()));
   }

   public Enum0035 m16000() {
      return this.f1000;
   }

   public C0019 m18000(float var1) {
      return this.f8000 == var1
         ? this
         : new C0019(
            this.f1000,
            this.f2000,
            this.f3000,
            this.f4000,
            this.f5000,
            this.f6000,
            this.f7000,
            var1,
            this.f9000,
            this.f10000,
            this.f11000,
            this.f12000,
            this.f13000,
            this.f14000,
            this.f15000,
            this.f16000,
            this.f17000,
            this.f18000,
            this.f19000,
            this.f20000,
            this.f21000,
            this.f22000,
            this.f23000,
            this.f24000,
            this.f25000,
            this.f26000,
            this.f27000,
            this.f28000,
            this.f29000,
            this.f30000,
            this.f31000,
            this.f32000,
            this.f33000,
            this.f34000,
            this.f35000,
            this.f36000,
            this.f37000,
            this.f38000,
            this.f39000,
            this.f40000,
            this.f41000,
            this.f42000,
            this.f43000,
            this.f44000,
            this.f45000,
            this.f46000,
            this.f47000,
            this.f48000
         );
   }

   public Enum0038 m20000() {
      return this.f9000;
   }

   public C0019 m22000(float var1) {
      return this.f38000 == var1
         ? this
         : new C0019(
            this.f1000,
            this.f2000,
            this.f3000,
            this.f4000,
            this.f5000,
            this.f6000,
            this.f7000,
            this.f8000,
            this.f9000,
            this.f10000,
            this.f11000,
            this.f12000,
            this.f13000,
            this.f14000,
            this.f15000,
            this.f16000,
            this.f17000,
            this.f18000,
            this.f19000,
            this.f20000,
            this.f21000,
            this.f22000,
            this.f23000,
            this.f24000,
            this.f25000,
            this.f26000,
            this.f27000,
            this.f28000,
            this.f29000,
            this.f30000,
            this.f31000,
            this.f32000,
            this.f33000,
            this.f34000,
            this.f35000,
            this.f36000,
            this.f37000,
            var1,
            this.f39000,
            this.f40000,
            this.f41000,
            this.f42000,
            this.f43000,
            this.f44000,
            this.f45000,
            this.f46000,
            this.f47000,
            this.f48000
         );
   }

   public Rec0036 m24000() {
      return this.f35000;
   }

   public float m26000() {
      return this.f30000;
   }

   public boolean m28000() {
      return this.f11000;
   }

   public C0019 m30000(float var1) {
      return this.f41000 == var1
         ? this
         : new C0019(
            this.f1000,
            this.f2000,
            this.f3000,
            this.f4000,
            this.f5000,
            this.f6000,
            this.f7000,
            this.f8000,
            this.f9000,
            this.f10000,
            this.f11000,
            this.f12000,
            this.f13000,
            this.f14000,
            this.f15000,
            this.f16000,
            this.f17000,
            this.f18000,
            this.f19000,
            this.f20000,
            this.f21000,
            this.f22000,
            this.f23000,
            this.f24000,
            this.f25000,
            this.f26000,
            this.f27000,
            this.f28000,
            this.f29000,
            this.f30000,
            this.f31000,
            this.f32000,
            this.f33000,
            this.f34000,
            this.f35000,
            this.f36000,
            this.f37000,
            this.f38000,
            this.f39000,
            this.f40000,
            var1,
            this.f42000,
            this.f43000,
            this.f44000,
            this.f45000,
            this.f46000,
            this.f47000,
            this.f48000
         );
   }

   public Rec0125 m32000() {
      return this.f23000;
   }

   public C0019(
      Enum0035 var1,
      Enum0034 var2,
      Enum0034 var3,
      Enum0040 var4,
      Rec0128 var5,
      Rec0131 var6,
      Rec0126 var7,
      float var8,
      Enum0038 var9,
      Enum0032 var10,
      boolean var11,
      int var12,
      float var13,
      float var14,
      Rec0066 var15,
      Rec0066 var16,
      float var17,
      float var18,
      Enum0036 var19,
      Enum0042 var20,
      Enum0033 var21,
      Rec0130 var22,
      Rec0125 var23,
      Rec0125 var24,
      boolean var25,
      boolean var26,
      boolean var27,
      int var28,
      float var29,
      float var30,
      int var31,
      int var32,
      int var33,
      float var34,
      Rec0036 var35,
      Enum0031 var36,
      int var37,
      float var38,
      Rec0070 var39,
      float var40,
      float var41,
      Rec0068 var42,
      String var43,
      Enum0044 var44,
      float var45,
      Enum0034 var46,
      boolean var47,
      boolean var48
   ) {
      this.f1000 = Objects.requireNonNull(var1);
      this.f2000 = Objects.requireNonNull(var2);
      this.f3000 = Objects.requireNonNull(var3);
      this.f4000 = Objects.requireNonNull(var4);
      this.f5000 = Objects.requireNonNull(var5);
      this.f6000 = Objects.requireNonNull(var6);
      this.f7000 = Objects.requireNonNull(var7);
      this.f8000 = var8;
      this.f9000 = Objects.requireNonNull(var9);
      this.f10000 = Objects.requireNonNull(var10);
      this.f11000 = var11;
      this.f12000 = var12;
      this.f13000 = var13;
      this.f14000 = var14;
      this.f15000 = Objects.requireNonNull(var15);
      this.f16000 = Objects.requireNonNull(var16);
      this.f17000 = var17;
      this.f18000 = var18;
      this.f19000 = Objects.requireNonNull(var19);
      this.f20000 = Objects.requireNonNull(var20);
      this.f21000 = Objects.requireNonNull(var21);
      this.f22000 = Objects.requireNonNull(var22);
      this.f23000 = Objects.requireNonNull(var23);
      this.f24000 = Objects.requireNonNull(var24);
      this.f25000 = var25;
      this.f26000 = var26;
      this.f27000 = var27;
      this.f28000 = var28;
      this.f29000 = Math.max(var29, 0.0F);
      this.f30000 = Math.max(var30, 0.0F);
      this.f31000 = var31;
      this.f32000 = var32;
      this.f33000 = var33;
      this.f34000 = Math.max(var34, 0.0F);
      this.f35000 = Objects.requireNonNull(var35);
      this.f36000 = Objects.requireNonNull(var36);
      this.f37000 = var37;
      this.f38000 = Math.max(0.0F, var38);
      this.f39000 = Objects.requireNonNull(var39);
      this.f40000 = var40;
      this.f41000 = Math.max(var41, 0.0F);
      this.f42000 = var42 == null ? Rec0068.f5000 : var42;
      this.f43000 = var43;
      this.f44000 = Objects.requireNonNull(var44);
      this.f45000 = var45;
      this.f46000 = Objects.requireNonNull(var46);
      this.f47000 = var47;
      this.f48000 = var48;
   }

   public boolean m34000(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof C0019 var2)) {
         return false;
      } else if (Float.compare(this.m92000(), var2.m92000()) != 0) {
         return false;
      } else if (this.m28000() != var2.m28000()) {
         return false;
      } else if (this.m70000() != var2.m70000()) {
         return false;
      } else if (Float.compare(this.m108000(), var2.m108000()) != 0) {
         return false;
      } else if (Float.compare(this.m106000(), var2.m106000()) != 0) {
         return false;
      } else if (Float.compare(this.m224000(), var2.m224000()) != 0) {
         return false;
      } else if (Float.compare(this.m86000(), var2.m86000()) != 0) {
         return false;
      } else if (this.m104000() != var2.m104000()) {
         return false;
      } else if (this.m46000() != var2.m46000()) {
         return false;
      } else if (this.m48000() != var2.m48000()) {
         return false;
      } else if (this.m96000() != var2.m96000()) {
         return false;
      } else if (Float.compare(this.m110000(), var2.m110000()) != 0) {
         return false;
      } else if (Float.compare(this.m26000(), var2.m26000()) != 0) {
         return false;
      } else if (this.m56000() != var2.m56000()) {
         return false;
      } else if (this.m58000() != var2.m58000()) {
         return false;
      } else if (this.m222000() != var2.m222000()) {
         return false;
      } else if (Float.compare(this.m78000(), var2.m78000()) != 0) {
         return false;
      } else if (this.m98000() != var2.m98000()) {
         return false;
      } else if (Float.compare(this.m44000(), var2.m44000()) != 0) {
         return false;
      } else if (Float.compare(this.m84000(), var2.m84000()) != 0) {
         return false;
      } else if (Float.compare(this.m40000(), var2.m40000()) != 0) {
         return false;
      } else if (Float.compare(this.m82000(), var2.m82000()) != 0) {
         return false;
      } else if (this.m228000() != var2.m228000()) {
         return false;
      } else if (this.m230000() != var2.m230000()) {
         return false;
      } else {
         Enum0035 var3 = this.m16000();
         Enum0035 var4 = var2.m16000();
         if (var3 == null ? var4 == null : var3.equals(var4)) {
            Enum0034 var5 = this.m38000();
            Enum0034 var6 = var2.m38000();
            if (var5 == null ? var6 == null : var5.equals(var6)) {
               Enum0034 var7 = this.m52000();
               Enum0034 var8 = var2.m52000();
               if (var7 == null ? var8 == null : var7.equals(var8)) {
                  Enum0040 var9 = this.m116000();
                  Enum0040 var10 = var2.m116000();
                  if (var9 == null ? var10 == null : var9.equals(var10)) {
                     Rec0128 var11 = this.m112000();
                     Rec0128 var12 = var2.m112000();
                     if (var11 == null ? var12 == null : var11.equals(var12)) {
                        Rec0131 var13 = this.m150000();
                        Rec0131 var14 = var2.m150000();
                        if (var13 == null ? var14 == null : var13.equals(var14)) {
                           Rec0126 var15 = this.m210000();
                           Rec0126 var16 = var2.m210000();
                           if (var15 == null ? var16 == null : var15.equals(var16)) {
                              Enum0038 var17 = this.m20000();
                              Enum0038 var18 = var2.m20000();
                              if (var17 == null ? var18 == null : var17.equals(var18)) {
                                 Enum0032 var19 = this.m76000();
                                 Enum0032 var20 = var2.m76000();
                                 if (var19 == null ? var20 == null : var19.equals(var20)) {
                                    Rec0066 var21 = this.m80000();
                                    Rec0066 var22 = var2.m80000();
                                    if (var21 == null ? var22 == null : var21.equals(var22)) {
                                       Rec0066 var23 = this.m102000();
                                       Rec0066 var24 = var2.m102000();
                                       if (var23 == null ? var24 == null : var23.equals(var24)) {
                                          Enum0036 var25 = this.m88000();
                                          Enum0036 var26 = var2.m88000();
                                          if (var25 == null ? var26 == null : var25.equals(var26)) {
                                             Enum0042 var27 = this.m2000();
                                             Enum0042 var28 = var2.m2000();
                                             if (var27 == null ? var28 == null : var27.equals(var28)) {
                                                Enum0033 var29 = this.m100000();
                                                Enum0033 var30 = var2.m100000();
                                                if (var29 == null ? var30 == null : var29.equals(var30)) {
                                                   Rec0130 var31 = this.m226000();
                                                   Rec0130 var32 = var2.m226000();
                                                   if (var31 == null ? var32 == null : var31.equals(var32)) {
                                                      Rec0125 var33 = this.m32000();
                                                      Rec0125 var34 = var2.m32000();
                                                      if (var33 == null ? var34 == null : var33.equals(var34)) {
                                                         Rec0125 var35 = this.m220000();
                                                         Rec0125 var36 = var2.m220000();
                                                         if (var35 == null ? var36 == null : var35.equals(var36)) {
                                                            Rec0036 var37 = this.m24000();
                                                            Rec0036 var38 = var2.m24000();
                                                            if (var37 == null ? var38 == null : var37.equals(var38)) {
                                                               Enum0031 var39 = this.m90000();
                                                               Enum0031 var40 = var2.m90000();
                                                               if (var39 == null ? var40 == null : var39.equals(var40)) {
                                                                  Rec0070 var41 = this.m152000();
                                                                  Rec0070 var42 = var2.m152000();
                                                                  if (var41 == null ? var42 == null : var41.equals(var42)) {
                                                                     Rec0068 var43 = this.m50000();
                                                                     Rec0068 var44 = var2.m50000();
                                                                     if (var43 == null ? var44 == null : var43.equals(var44)) {
                                                                        String var45 = this.m72000();
                                                                        String var46 = var2.m72000();
                                                                        if (var45 == null ? var46 == null : var45.equals(var46)) {
                                                                           Enum0044 var47 = this.m42000();
                                                                           Enum0044 var48 = var2.m42000();
                                                                           if (var47 == null ? var48 == null : var47.equals(var48)) {
                                                                              Enum0034 var49 = this.m128000();
                                                                              Enum0034 var50 = var2.m128000();
                                                                              return var49 == null ? var50 == null : var49.equals(var50);
                                                                           } else {
                                                                              return false;
                                                                           }
                                                                        } else {
                                                                           return false;
                                                                        }
                                                                     } else {
                                                                        return false;
                                                                     }
                                                                  } else {
                                                                     return false;
                                                                  }
                                                               } else {
                                                                  return false;
                                                               }
                                                            } else {
                                                               return false;
                                                            }
                                                         } else {
                                                            return false;
                                                         }
                                                      } else {
                                                         return false;
                                                      }
                                                   } else {
                                                      return false;
                                                   }
                                                } else {
                                                   return false;
                                                }
                                             } else {
                                                return false;
                                             }
                                          } else {
                                             return false;
                                          }
                                       } else {
                                          return false;
                                       }
                                    } else {
                                       return false;
                                    }
                                 } else {
                                    return false;
                                 }
                              } else {
                                 return false;
                              }
                           } else {
                              return false;
                           }
                        } else {
                           return false;
                        }
                     } else {
                        return false;
                     }
                  } else {
                     return false;
                  }
               } else {
                  return false;
               }
            } else {
               return false;
            }
         } else {
            return false;
         }
      }
   }

   @Override
   public String toString() {
      return "ComputedStyle(layoutDirection="
         + this.m16000()
         + ", alignX="
         + this.m38000()
         + ", alignY="
         + this.m52000()
         + ", boxSizing="
         + this.m116000()
         + ", padding="
         + this.m112000()
         + ", gap="
         + this.m150000()
         + ", borderRadii="
         + this.m210000()
         + ", borderWidth="
         + this.m92000()
         + ", borderPosition="
         + this.m20000()
         + ", position="
         + this.m76000()
         + ", zIndexAuto="
         + this.m28000()
         + ", zIndex="
         + this.m70000()
         + ", positionOffsetX="
         + this.m108000()
         + ", positionOffsetY="
         + this.m106000()
         + ", visualTranslateX="
         + this.m80000()
         + ", visualTranslateY="
         + this.m102000()
         + ", visualScale="
         + this.m224000()
         + ", visualRotate="
         + this.m86000()
         + ", clip="
         + this.m88000()
         + ", overflowY="
         + this.m2000()
         + ", scrollbarMode="
         + this.m100000()
         + ", scrollbar="
         + this.m226000()
         + ", width="
         + this.m32000()
         + ", height="
         + this.m220000()
         + ", visible="
         + this.m104000()
         + ", focusable="
         + this.m46000()
         + ", pointerTransparent="
         + this.m48000()
         + ", backgroundColor="
         + this.m96000()
         + ", backdropBlurRadius="
         + this.m110000()
         + ", backdropShadowRadius="
         + this.m26000()
         + ", backdropShadowColor="
         + this.m56000()
         + ", borderColor="
         + this.m58000()
         + ", color="
         + this.m222000()
         + ", textFontSize="
         + this.m78000()
         + ", textFontSpec="
         + this.m24000()
         + ", textWrap="
         + this.m90000()
         + ", textOutlineColor="
         + this.m98000()
         + ", textOutlineWidth="
         + this.m44000()
         + ", transitions="
         + this.m152000()
         + ", opacity="
         + this.m84000()
         + ", blurRadius="
         + this.m40000()
         + ", textureUv="
         + this.m50000()
         + ", anchorKey="
         + this.m72000()
         + ", anchorSide="
         + this.m42000()
         + ", anchorGap="
         + this.m82000()
         + ", anchorAlign="
         + this.m128000()
         + ", anchorFlip="
         + this.m228000()
         + ", anchorClamp="
         + this.m230000()
         + ")";
   }

   @Override
   public int hashCode() {
      byte var1 = 59;
      int var2 = 1;
      var2 = var2 * 59 + Float.floatToIntBits(this.m92000());
      var2 = var2 * 59 + (this.m28000() ? 79 : 97);
      var2 = var2 * 59 + this.m70000();
      var2 = var2 * 59 + Float.floatToIntBits(this.m108000());
      var2 = var2 * 59 + Float.floatToIntBits(this.m106000());
      var2 = var2 * 59 + Float.floatToIntBits(this.m224000());
      var2 = var2 * 59 + Float.floatToIntBits(this.m86000());
      var2 = var2 * 59 + (this.m104000() ? 79 : 97);
      var2 = var2 * 59 + (this.m46000() ? 79 : 97);
      var2 = var2 * 59 + (this.m48000() ? 79 : 97);
      var2 = var2 * 59 + this.m96000();
      var2 = var2 * 59 + Float.floatToIntBits(this.m110000());
      var2 = var2 * 59 + Float.floatToIntBits(this.m26000());
      var2 = var2 * 59 + this.m56000();
      var2 = var2 * 59 + this.m58000();
      var2 = var2 * 59 + this.m222000();
      var2 = var2 * 59 + Float.floatToIntBits(this.m78000());
      var2 = var2 * 59 + this.m98000();
      var2 = var2 * 59 + Float.floatToIntBits(this.m44000());
      var2 = var2 * 59 + Float.floatToIntBits(this.m84000());
      var2 = var2 * 59 + Float.floatToIntBits(this.m40000());
      var2 = var2 * 59 + Float.floatToIntBits(this.m82000());
      var2 = var2 * 59 + (this.m228000() ? 79 : 97);
      var2 = var2 * 59 + (this.m230000() ? 79 : 97);
      Enum0035 var3 = this.m16000();
      var2 = var2 * 59 + (var3 == null ? 43 : var3.hashCode());
      Enum0034 var4 = this.m38000();
      var2 = var2 * 59 + (var4 == null ? 43 : var4.hashCode());
      Enum0034 var5 = this.m52000();
      var2 = var2 * 59 + (var5 == null ? 43 : var5.hashCode());
      Enum0040 var6 = this.m116000();
      var2 = var2 * 59 + (var6 == null ? 43 : var6.hashCode());
      Rec0128 var7 = this.m112000();
      var2 = var2 * 59 + (var7 == null ? 43 : var7.hashCode());
      Rec0131 var8 = this.m150000();
      var2 = var2 * 59 + (var8 == null ? 43 : var8.hashCode());
      Rec0126 var9 = this.m210000();
      var2 = var2 * 59 + (var9 == null ? 43 : var9.hashCode());
      Enum0038 var10 = this.m20000();
      var2 = var2 * 59 + (var10 == null ? 43 : var10.hashCode());
      Enum0032 var11 = this.m76000();
      var2 = var2 * 59 + (var11 == null ? 43 : var11.hashCode());
      Rec0066 var12 = this.m80000();
      var2 = var2 * 59 + (var12 == null ? 43 : var12.hashCode());
      Rec0066 var13 = this.m102000();
      var2 = var2 * 59 + (var13 == null ? 43 : var13.hashCode());
      Enum0036 var14 = this.m88000();
      var2 = var2 * 59 + (var14 == null ? 43 : var14.hashCode());
      Enum0042 var15 = this.m2000();
      var2 = var2 * 59 + (var15 == null ? 43 : var15.hashCode());
      Enum0033 var16 = this.m100000();
      var2 = var2 * 59 + (var16 == null ? 43 : var16.hashCode());
      Rec0130 var17 = this.m226000();
      var2 = var2 * 59 + (var17 == null ? 43 : var17.hashCode());
      Rec0125 var18 = this.m32000();
      var2 = var2 * 59 + (var18 == null ? 43 : var18.hashCode());
      Rec0125 var19 = this.m220000();
      var2 = var2 * 59 + (var19 == null ? 43 : var19.hashCode());
      Rec0036 var20 = this.m24000();
      var2 = var2 * 59 + (var20 == null ? 43 : var20.hashCode());
      Enum0031 var21 = this.m90000();
      var2 = var2 * 59 + (var21 == null ? 43 : var21.hashCode());
      Rec0070 var22 = this.m152000();
      var2 = var2 * 59 + (var22 == null ? 43 : var22.hashCode());
      Rec0068 var23 = this.m50000();
      var2 = var2 * 59 + (var23 == null ? 43 : var23.hashCode());
      String var24 = this.m72000();
      var2 = var2 * 59 + (var24 == null ? 43 : var24.hashCode());
      Enum0044 var25 = this.m42000();
      var2 = var2 * 59 + (var25 == null ? 43 : var25.hashCode());
      Enum0034 var26 = this.m128000();
      return var2 * 59 + (var26 == null ? 43 : var26.hashCode());
   }

   public C0019 m36000(float var1) {
      return this.f13000 == var1
         ? this
         : new C0019(
            this.f1000,
            this.f2000,
            this.f3000,
            this.f4000,
            this.f5000,
            this.f6000,
            this.f7000,
            this.f8000,
            this.f9000,
            this.f10000,
            this.f11000,
            this.f12000,
            var1,
            this.f14000,
            this.f15000,
            this.f16000,
            this.f17000,
            this.f18000,
            this.f19000,
            this.f20000,
            this.f21000,
            this.f22000,
            this.f23000,
            this.f24000,
            this.f25000,
            this.f26000,
            this.f27000,
            this.f28000,
            this.f29000,
            this.f30000,
            this.f31000,
            this.f32000,
            this.f33000,
            this.f34000,
            this.f35000,
            this.f36000,
            this.f37000,
            this.f38000,
            this.f39000,
            this.f40000,
            this.f41000,
            this.f42000,
            this.f43000,
            this.f44000,
            this.f45000,
            this.f46000,
            this.f47000,
            this.f48000
         );
   }

   public Enum0034 m38000() {
      return this.f2000;
   }

   public float m40000() {
      return this.f41000;
   }

   public Enum0044 m42000() {
      return this.f44000;
   }

   public float m44000() {
      return this.f38000;
   }

   public boolean m46000() {
      return this.f26000;
   }

   public boolean m48000() {
      return this.f27000;
   }

   public Rec0068 m50000() {
      return this.f42000;
   }

   public Enum0034 m52000() {
      return this.f3000;
   }

   public C0019 m54000(float var1) {
      return this.f14000 == var1
         ? this
         : new C0019(
            this.f1000,
            this.f2000,
            this.f3000,
            this.f4000,
            this.f5000,
            this.f6000,
            this.f7000,
            this.f8000,
            this.f9000,
            this.f10000,
            this.f11000,
            this.f12000,
            this.f13000,
            var1,
            this.f15000,
            this.f16000,
            this.f17000,
            this.f18000,
            this.f19000,
            this.f20000,
            this.f21000,
            this.f22000,
            this.f23000,
            this.f24000,
            this.f25000,
            this.f26000,
            this.f27000,
            this.f28000,
            this.f29000,
            this.f30000,
            this.f31000,
            this.f32000,
            this.f33000,
            this.f34000,
            this.f35000,
            this.f36000,
            this.f37000,
            this.f38000,
            this.f39000,
            this.f40000,
            this.f41000,
            this.f42000,
            this.f43000,
            this.f44000,
            this.f45000,
            this.f46000,
            this.f47000,
            this.f48000
         );
   }

   public int m56000() {
      return this.f31000;
   }

   public int m58000() {
      return this.f32000;
   }

   public C0019 m60000(boolean var1) {
      return this.f48000 == var1
         ? this
         : new C0019(
            this.f1000,
            this.f2000,
            this.f3000,
            this.f4000,
            this.f5000,
            this.f6000,
            this.f7000,
            this.f8000,
            this.f9000,
            this.f10000,
            this.f11000,
            this.f12000,
            this.f13000,
            this.f14000,
            this.f15000,
            this.f16000,
            this.f17000,
            this.f18000,
            this.f19000,
            this.f20000,
            this.f21000,
            this.f22000,
            this.f23000,
            this.f24000,
            this.f25000,
            this.f26000,
            this.f27000,
            this.f28000,
            this.f29000,
            this.f30000,
            this.f31000,
            this.f32000,
            this.f33000,
            this.f34000,
            this.f35000,
            this.f36000,
            this.f37000,
            this.f38000,
            this.f39000,
            this.f40000,
            this.f41000,
            this.f42000,
            this.f43000,
            this.f44000,
            this.f45000,
            this.f46000,
            this.f47000,
            var1
         );
   }

   public C0019 m62000(int var1) {
      return this.f33000 == var1
         ? this
         : new C0019(
            this.f1000,
            this.f2000,
            this.f3000,
            this.f4000,
            this.f5000,
            this.f6000,
            this.f7000,
            this.f8000,
            this.f9000,
            this.f10000,
            this.f11000,
            this.f12000,
            this.f13000,
            this.f14000,
            this.f15000,
            this.f16000,
            this.f17000,
            this.f18000,
            this.f19000,
            this.f20000,
            this.f21000,
            this.f22000,
            this.f23000,
            this.f24000,
            this.f25000,
            this.f26000,
            this.f27000,
            this.f28000,
            this.f29000,
            this.f30000,
            this.f31000,
            this.f32000,
            var1,
            this.f34000,
            this.f35000,
            this.f36000,
            this.f37000,
            this.f38000,
            this.f39000,
            this.f40000,
            this.f41000,
            this.f42000,
            this.f43000,
            this.f44000,
            this.f45000,
            this.f46000,
            this.f47000,
            this.f48000
         );
   }

   public static C0370 m64000() {
      return new C0370();
   }

   public C0019 m66000(float var1) {
      float var2 = Math.max(0.0F, var1);
      return m174000(this.f5000.m6000(), var2) ? this : this.m186000(new Rec0128(this.f5000.m2000(), this.f5000.m8000(), var2, this.f5000.m20000()));
   }

   public C0019 m68000(float var1) {
      return this.f45000 == var1
         ? this
         : new C0019(
            this.f1000,
            this.f2000,
            this.f3000,
            this.f4000,
            this.f5000,
            this.f6000,
            this.f7000,
            this.f8000,
            this.f9000,
            this.f10000,
            this.f11000,
            this.f12000,
            this.f13000,
            this.f14000,
            this.f15000,
            this.f16000,
            this.f17000,
            this.f18000,
            this.f19000,
            this.f20000,
            this.f21000,
            this.f22000,
            this.f23000,
            this.f24000,
            this.f25000,
            this.f26000,
            this.f27000,
            this.f28000,
            this.f29000,
            this.f30000,
            this.f31000,
            this.f32000,
            this.f33000,
            this.f34000,
            this.f35000,
            this.f36000,
            this.f37000,
            this.f38000,
            this.f39000,
            this.f40000,
            this.f41000,
            this.f42000,
            this.f43000,
            this.f44000,
            var1,
            this.f46000,
            this.f47000,
            this.f48000
         );
   }

   public int m70000() {
      return this.f12000;
   }

   public String m72000() {
      return this.f43000;
   }

   public C0019 m74000(float var1) {
      return this.f40000 == var1
         ? this
         : new C0019(
            this.f1000,
            this.f2000,
            this.f3000,
            this.f4000,
            this.f5000,
            this.f6000,
            this.f7000,
            this.f8000,
            this.f9000,
            this.f10000,
            this.f11000,
            this.f12000,
            this.f13000,
            this.f14000,
            this.f15000,
            this.f16000,
            this.f17000,
            this.f18000,
            this.f19000,
            this.f20000,
            this.f21000,
            this.f22000,
            this.f23000,
            this.f24000,
            this.f25000,
            this.f26000,
            this.f27000,
            this.f28000,
            this.f29000,
            this.f30000,
            this.f31000,
            this.f32000,
            this.f33000,
            this.f34000,
            this.f35000,
            this.f36000,
            this.f37000,
            this.f38000,
            this.f39000,
            var1,
            this.f41000,
            this.f42000,
            this.f43000,
            this.f44000,
            this.f45000,
            this.f46000,
            this.f47000,
            this.f48000
         );
   }

   public Enum0032 m76000() {
      return this.f10000;
   }

   public float m78000() {
      return this.f34000;
   }

   public Rec0066 m80000() {
      return this.f15000;
   }

   public float m82000() {
      return this.f45000;
   }

   public float m84000() {
      return this.f40000;
   }

   public float m86000() {
      return this.f18000;
   }

   public Enum0036 m88000() {
      return this.f19000;
   }

   public Enum0031 m90000() {
      return this.f36000;
   }

   public float m92000() {
      return this.f8000;
   }

   public C0019 m94000(float var1) {
      return this.f34000 == var1
         ? this
         : new C0019(
            this.f1000,
            this.f2000,
            this.f3000,
            this.f4000,
            this.f5000,
            this.f6000,
            this.f7000,
            this.f8000,
            this.f9000,
            this.f10000,
            this.f11000,
            this.f12000,
            this.f13000,
            this.f14000,
            this.f15000,
            this.f16000,
            this.f17000,
            this.f18000,
            this.f19000,
            this.f20000,
            this.f21000,
            this.f22000,
            this.f23000,
            this.f24000,
            this.f25000,
            this.f26000,
            this.f27000,
            this.f28000,
            this.f29000,
            this.f30000,
            this.f31000,
            this.f32000,
            this.f33000,
            var1,
            this.f35000,
            this.f36000,
            this.f37000,
            this.f38000,
            this.f39000,
            this.f40000,
            this.f41000,
            this.f42000,
            this.f43000,
            this.f44000,
            this.f45000,
            this.f46000,
            this.f47000,
            this.f48000
         );
   }

   public int m96000() {
      return this.f28000;
   }

   public int m98000() {
      return this.f37000;
   }

   public Enum0033 m100000() {
      return this.f21000;
   }

   public Rec0066 m102000() {
      return this.f16000;
   }

   public boolean m104000() {
      return this.f25000;
   }

   public float m106000() {
      return this.f14000;
   }

   public float m108000() {
      return this.f13000;
   }

   public float m110000() {
      return this.f29000;
   }

   public Rec0128 m112000() {
      return this.f5000;
   }

   public C0019 m114000(float var1) {
      return this.f18000 == var1
         ? this
         : new C0019(
            this.f1000,
            this.f2000,
            this.f3000,
            this.f4000,
            this.f5000,
            this.f6000,
            this.f7000,
            this.f8000,
            this.f9000,
            this.f10000,
            this.f11000,
            this.f12000,
            this.f13000,
            this.f14000,
            this.f15000,
            this.f16000,
            this.f17000,
            var1,
            this.f19000,
            this.f20000,
            this.f21000,
            this.f22000,
            this.f23000,
            this.f24000,
            this.f25000,
            this.f26000,
            this.f27000,
            this.f28000,
            this.f29000,
            this.f30000,
            this.f31000,
            this.f32000,
            this.f33000,
            this.f34000,
            this.f35000,
            this.f36000,
            this.f37000,
            this.f38000,
            this.f39000,
            this.f40000,
            this.f41000,
            this.f42000,
            this.f43000,
            this.f44000,
            this.f45000,
            this.f46000,
            this.f47000,
            this.f48000
         );
   }

   public Enum0040 m116000() {
      return this.f4000;
   }

   public C0019 m118000(float var1) {
      return this.f17000 == var1
         ? this
         : new C0019(
            this.f1000,
            this.f2000,
            this.f3000,
            this.f4000,
            this.f5000,
            this.f6000,
            this.f7000,
            this.f8000,
            this.f9000,
            this.f10000,
            this.f11000,
            this.f12000,
            this.f13000,
            this.f14000,
            this.f15000,
            this.f16000,
            var1,
            this.f18000,
            this.f19000,
            this.f20000,
            this.f21000,
            this.f22000,
            this.f23000,
            this.f24000,
            this.f25000,
            this.f26000,
            this.f27000,
            this.f28000,
            this.f29000,
            this.f30000,
            this.f31000,
            this.f32000,
            this.f33000,
            this.f34000,
            this.f35000,
            this.f36000,
            this.f37000,
            this.f38000,
            this.f39000,
            this.f40000,
            this.f41000,
            this.f42000,
            this.f43000,
            this.f44000,
            this.f45000,
            this.f46000,
            this.f47000,
            this.f48000
         );
   }

   public C0019 m120000(int var1) {
      return this.f32000 == var1
         ? this
         : new C0019(
            this.f1000,
            this.f2000,
            this.f3000,
            this.f4000,
            this.f5000,
            this.f6000,
            this.f7000,
            this.f8000,
            this.f9000,
            this.f10000,
            this.f11000,
            this.f12000,
            this.f13000,
            this.f14000,
            this.f15000,
            this.f16000,
            this.f17000,
            this.f18000,
            this.f19000,
            this.f20000,
            this.f21000,
            this.f22000,
            this.f23000,
            this.f24000,
            this.f25000,
            this.f26000,
            this.f27000,
            this.f28000,
            this.f29000,
            this.f30000,
            this.f31000,
            var1,
            this.f33000,
            this.f34000,
            this.f35000,
            this.f36000,
            this.f37000,
            this.f38000,
            this.f39000,
            this.f40000,
            this.f41000,
            this.f42000,
            this.f43000,
            this.f44000,
            this.f45000,
            this.f46000,
            this.f47000,
            this.f48000
         );
   }

   public C0019 m122000() {
      return this.m190000(new Rec0127(true, 0));
   }

   public C0019 m124000(boolean var1) {
      return this.f47000 == var1
         ? this
         : new C0019(
            this.f1000,
            this.f2000,
            this.f3000,
            this.f4000,
            this.f5000,
            this.f6000,
            this.f7000,
            this.f8000,
            this.f9000,
            this.f10000,
            this.f11000,
            this.f12000,
            this.f13000,
            this.f14000,
            this.f15000,
            this.f16000,
            this.f17000,
            this.f18000,
            this.f19000,
            this.f20000,
            this.f21000,
            this.f22000,
            this.f23000,
            this.f24000,
            this.f25000,
            this.f26000,
            this.f27000,
            this.f28000,
            this.f29000,
            this.f30000,
            this.f31000,
            this.f32000,
            this.f33000,
            this.f34000,
            this.f35000,
            this.f36000,
            this.f37000,
            this.f38000,
            this.f39000,
            this.f40000,
            this.f41000,
            this.f42000,
            this.f43000,
            this.f44000,
            this.f45000,
            this.f46000,
            var1,
            this.f48000
         );
   }

   public C0019 m126000(float var1) {
      float var2 = Math.max(0.0F, var1);
      return m174000(this.f5000.m8000(), var2) ? this : this.m186000(new Rec0128(this.f5000.m2000(), var2, this.f5000.m6000(), this.f5000.m20000()));
   }

   public Enum0034 m128000() {
      return this.f46000;
   }

   public C0019 m130000(boolean var1) {
      return this.f26000 == var1
         ? this
         : new C0019(
            this.f1000,
            this.f2000,
            this.f3000,
            this.f4000,
            this.f5000,
            this.f6000,
            this.f7000,
            this.f8000,
            this.f9000,
            this.f10000,
            this.f11000,
            this.f12000,
            this.f13000,
            this.f14000,
            this.f15000,
            this.f16000,
            this.f17000,
            this.f18000,
            this.f19000,
            this.f20000,
            this.f21000,
            this.f22000,
            this.f23000,
            this.f24000,
            this.f25000,
            var1,
            this.f27000,
            this.f28000,
            this.f29000,
            this.f30000,
            this.f31000,
            this.f32000,
            this.f33000,
            this.f34000,
            this.f35000,
            this.f36000,
            this.f37000,
            this.f38000,
            this.f39000,
            this.f40000,
            this.f41000,
            this.f42000,
            this.f43000,
            this.f44000,
            this.f45000,
            this.f46000,
            this.f47000,
            this.f48000
         );
   }

   public boolean m132000(C0019 var1) {
      if (var1 == null) {
         return false;
      } else {
         for (Enum0041 var3 : Enum0041.m78000()) {
            if (this.m188000(var3, var1) && var3.m86000(this, var1)) {
               return false;
            }
         }

         return true;
      }
   }

   public C0019 m134000(Rec0125 var1) {
      if (var1 == null) {
         throw new NullPointerException("height is marked non-null but is null");
      } else {
         return this.f24000 == var1
            ? this
            : new C0019(
               this.f1000,
               this.f2000,
               this.f3000,
               this.f4000,
               this.f5000,
               this.f6000,
               this.f7000,
               this.f8000,
               this.f9000,
               this.f10000,
               this.f11000,
               this.f12000,
               this.f13000,
               this.f14000,
               this.f15000,
               this.f16000,
               this.f17000,
               this.f18000,
               this.f19000,
               this.f20000,
               this.f21000,
               this.f22000,
               this.f23000,
               var1,
               this.f25000,
               this.f26000,
               this.f27000,
               this.f28000,
               this.f29000,
               this.f30000,
               this.f31000,
               this.f32000,
               this.f33000,
               this.f34000,
               this.f35000,
               this.f36000,
               this.f37000,
               this.f38000,
               this.f39000,
               this.f40000,
               this.f41000,
               this.f42000,
               this.f43000,
               this.f44000,
               this.f45000,
               this.f46000,
               this.f47000,
               this.f48000
            );
      }
   }

   public C0019 m136000(Rec0066 var1) {
      if (var1 == null) {
         throw new NullPointerException("visualTranslateY is marked non-null but is null");
      } else {
         return this.f16000 == var1
            ? this
            : new C0019(
               this.f1000,
               this.f2000,
               this.f3000,
               this.f4000,
               this.f5000,
               this.f6000,
               this.f7000,
               this.f8000,
               this.f9000,
               this.f10000,
               this.f11000,
               this.f12000,
               this.f13000,
               this.f14000,
               this.f15000,
               var1,
               this.f17000,
               this.f18000,
               this.f19000,
               this.f20000,
               this.f21000,
               this.f22000,
               this.f23000,
               this.f24000,
               this.f25000,
               this.f26000,
               this.f27000,
               this.f28000,
               this.f29000,
               this.f30000,
               this.f31000,
               this.f32000,
               this.f33000,
               this.f34000,
               this.f35000,
               this.f36000,
               this.f37000,
               this.f38000,
               this.f39000,
               this.f40000,
               this.f41000,
               this.f42000,
               this.f43000,
               this.f44000,
               this.f45000,
               this.f46000,
               this.f47000,
               this.f48000
            );
      }
   }

   public C0019 m138000(Enum0034 var1) {
      if (var1 == null) {
         throw new NullPointerException("alignY is marked non-null but is null");
      } else {
         return this.f3000 == var1
            ? this
            : new C0019(
               this.f1000,
               this.f2000,
               var1,
               this.f4000,
               this.f5000,
               this.f6000,
               this.f7000,
               this.f8000,
               this.f9000,
               this.f10000,
               this.f11000,
               this.f12000,
               this.f13000,
               this.f14000,
               this.f15000,
               this.f16000,
               this.f17000,
               this.f18000,
               this.f19000,
               this.f20000,
               this.f21000,
               this.f22000,
               this.f23000,
               this.f24000,
               this.f25000,
               this.f26000,
               this.f27000,
               this.f28000,
               this.f29000,
               this.f30000,
               this.f31000,
               this.f32000,
               this.f33000,
               this.f34000,
               this.f35000,
               this.f36000,
               this.f37000,
               this.f38000,
               this.f39000,
               this.f40000,
               this.f41000,
               this.f42000,
               this.f43000,
               this.f44000,
               this.f45000,
               this.f46000,
               this.f47000,
               this.f48000
            );
      }
   }

   public C0019 m140000(float var1) {
      return this.m154000(Rec0131.m16000(var1));
   }

   public boolean m142000() {
      return this.f20000 == Enum0042.f2000 && this.f1000 == Enum0035.f2000;
   }

   private static boolean m144000(Enum0032 var0) {
      return var0 == Enum0032.f2000 || var0 == Enum0032.f3000;
   }

   public C0019 m146000(int var1) {
      return this.f28000 == var1
         ? this
         : new C0019(
            this.f1000,
            this.f2000,
            this.f3000,
            this.f4000,
            this.f5000,
            this.f6000,
            this.f7000,
            this.f8000,
            this.f9000,
            this.f10000,
            this.f11000,
            this.f12000,
            this.f13000,
            this.f14000,
            this.f15000,
            this.f16000,
            this.f17000,
            this.f18000,
            this.f19000,
            this.f20000,
            this.f21000,
            this.f22000,
            this.f23000,
            this.f24000,
            this.f25000,
            this.f26000,
            this.f27000,
            var1,
            this.f29000,
            this.f30000,
            this.f31000,
            this.f32000,
            this.f33000,
            this.f34000,
            this.f35000,
            this.f36000,
            this.f37000,
            this.f38000,
            this.f39000,
            this.f40000,
            this.f41000,
            this.f42000,
            this.f43000,
            this.f44000,
            this.f45000,
            this.f46000,
            this.f47000,
            this.f48000
         );
   }

   public C0019 m148000(float var1) {
      return this.f29000 == var1
         ? this
         : new C0019(
            this.f1000,
            this.f2000,
            this.f3000,
            this.f4000,
            this.f5000,
            this.f6000,
            this.f7000,
            this.f8000,
            this.f9000,
            this.f10000,
            this.f11000,
            this.f12000,
            this.f13000,
            this.f14000,
            this.f15000,
            this.f16000,
            this.f17000,
            this.f18000,
            this.f19000,
            this.f20000,
            this.f21000,
            this.f22000,
            this.f23000,
            this.f24000,
            this.f25000,
            this.f26000,
            this.f27000,
            this.f28000,
            var1,
            this.f30000,
            this.f31000,
            this.f32000,
            this.f33000,
            this.f34000,
            this.f35000,
            this.f36000,
            this.f37000,
            this.f38000,
            this.f39000,
            this.f40000,
            this.f41000,
            this.f42000,
            this.f43000,
            this.f44000,
            this.f45000,
            this.f46000,
            this.f47000,
            this.f48000
         );
   }

   public Rec0131 m150000() {
      return this.f6000;
   }

   public Rec0070 m152000() {
      return this.f39000;
   }

   public C0019 m154000(Rec0131 var1) {
      Rec0131 var2 = Objects.requireNonNull(var1);
      return Objects.equals(this.f6000, var2) ? this : this.m216000().m94000(var2).m60000();
   }

   public boolean m156000(C0019 var1) {
      if (var1 == null) {
         return false;
      } else {
         for (Enum0041 var3 : Enum0041.m88000()) {
            if (var3.m86000(this, var1)) {
               return false;
            }
         }

         return true;
      }
   }

   public C0019 m158000(Rec0036 var1) {
      if (var1 == null) {
         throw new NullPointerException("textFontSpec is marked non-null but is null");
      } else {
         return this.f35000 == var1
            ? this
            : new C0019(
               this.f1000,
               this.f2000,
               this.f3000,
               this.f4000,
               this.f5000,
               this.f6000,
               this.f7000,
               this.f8000,
               this.f9000,
               this.f10000,
               this.f11000,
               this.f12000,
               this.f13000,
               this.f14000,
               this.f15000,
               this.f16000,
               this.f17000,
               this.f18000,
               this.f19000,
               this.f20000,
               this.f21000,
               this.f22000,
               this.f23000,
               this.f24000,
               this.f25000,
               this.f26000,
               this.f27000,
               this.f28000,
               this.f29000,
               this.f30000,
               this.f31000,
               this.f32000,
               this.f33000,
               this.f34000,
               var1,
               this.f36000,
               this.f37000,
               this.f38000,
               this.f39000,
               this.f40000,
               this.f41000,
               this.f42000,
               this.f43000,
               this.f44000,
               this.f45000,
               this.f46000,
               this.f47000,
               this.f48000
            );
      }
   }

   public C0019 m160000(Enum0031 var1) {
      if (var1 == null) {
         throw new NullPointerException("textWrap is marked non-null but is null");
      } else {
         return this.f36000 == var1
            ? this
            : new C0019(
               this.f1000,
               this.f2000,
               this.f3000,
               this.f4000,
               this.f5000,
               this.f6000,
               this.f7000,
               this.f8000,
               this.f9000,
               this.f10000,
               this.f11000,
               this.f12000,
               this.f13000,
               this.f14000,
               this.f15000,
               this.f16000,
               this.f17000,
               this.f18000,
               this.f19000,
               this.f20000,
               this.f21000,
               this.f22000,
               this.f23000,
               this.f24000,
               this.f25000,
               this.f26000,
               this.f27000,
               this.f28000,
               this.f29000,
               this.f30000,
               this.f31000,
               this.f32000,
               this.f33000,
               this.f34000,
               this.f35000,
               var1,
               this.f37000,
               this.f38000,
               this.f39000,
               this.f40000,
               this.f41000,
               this.f42000,
               this.f43000,
               this.f44000,
               this.f45000,
               this.f46000,
               this.f47000,
               this.f48000
            );
      }
   }

   public C0019 m162000(boolean var1) {
      return this.f25000 == var1
         ? this
         : new C0019(
            this.f1000,
            this.f2000,
            this.f3000,
            this.f4000,
            this.f5000,
            this.f6000,
            this.f7000,
            this.f8000,
            this.f9000,
            this.f10000,
            this.f11000,
            this.f12000,
            this.f13000,
            this.f14000,
            this.f15000,
            this.f16000,
            this.f17000,
            this.f18000,
            this.f19000,
            this.f20000,
            this.f21000,
            this.f22000,
            this.f23000,
            this.f24000,
            var1,
            this.f26000,
            this.f27000,
            this.f28000,
            this.f29000,
            this.f30000,
            this.f31000,
            this.f32000,
            this.f33000,
            this.f34000,
            this.f35000,
            this.f36000,
            this.f37000,
            this.f38000,
            this.f39000,
            this.f40000,
            this.f41000,
            this.f42000,
            this.f43000,
            this.f44000,
            this.f45000,
            this.f46000,
            this.f47000,
            this.f48000
         );
   }

   public C0019 m164000(Enum0035 var1) {
      if (var1 == null) {
         throw new NullPointerException("layoutDirection is marked non-null but is null");
      } else {
         return this.f1000 == var1
            ? this
            : new C0019(
               var1,
               this.f2000,
               this.f3000,
               this.f4000,
               this.f5000,
               this.f6000,
               this.f7000,
               this.f8000,
               this.f9000,
               this.f10000,
               this.f11000,
               this.f12000,
               this.f13000,
               this.f14000,
               this.f15000,
               this.f16000,
               this.f17000,
               this.f18000,
               this.f19000,
               this.f20000,
               this.f21000,
               this.f22000,
               this.f23000,
               this.f24000,
               this.f25000,
               this.f26000,
               this.f27000,
               this.f28000,
               this.f29000,
               this.f30000,
               this.f31000,
               this.f32000,
               this.f33000,
               this.f34000,
               this.f35000,
               this.f36000,
               this.f37000,
               this.f38000,
               this.f39000,
               this.f40000,
               this.f41000,
               this.f42000,
               this.f43000,
               this.f44000,
               this.f45000,
               this.f46000,
               this.f47000,
               this.f48000
            );
      }
   }

   public C0019 m166000(float var1) {
      return this.m192000(Rec0126.m16000(var1));
   }

   public C0019 m168000(int var1) {
      return this.m190000(new Rec0127(false, var1));
   }

   public C0019 m170000(String var1) {
      return this.f43000 == var1
         ? this
         : new C0019(
            this.f1000,
            this.f2000,
            this.f3000,
            this.f4000,
            this.f5000,
            this.f6000,
            this.f7000,
            this.f8000,
            this.f9000,
            this.f10000,
            this.f11000,
            this.f12000,
            this.f13000,
            this.f14000,
            this.f15000,
            this.f16000,
            this.f17000,
            this.f18000,
            this.f19000,
            this.f20000,
            this.f21000,
            this.f22000,
            this.f23000,
            this.f24000,
            this.f25000,
            this.f26000,
            this.f27000,
            this.f28000,
            this.f29000,
            this.f30000,
            this.f31000,
            this.f32000,
            this.f33000,
            this.f34000,
            this.f35000,
            this.f36000,
            this.f37000,
            this.f38000,
            this.f39000,
            this.f40000,
            this.f41000,
            this.f42000,
            var1,
            this.f44000,
            this.f45000,
            this.f46000,
            this.f47000,
            this.f48000
         );
   }

   public C0019 m172000(Enum0044 var1) {
      if (var1 == null) {
         throw new NullPointerException("anchorSide is marked non-null but is null");
      } else {
         return this.f44000 == var1
            ? this
            : new C0019(
               this.f1000,
               this.f2000,
               this.f3000,
               this.f4000,
               this.f5000,
               this.f6000,
               this.f7000,
               this.f8000,
               this.f9000,
               this.f10000,
               this.f11000,
               this.f12000,
               this.f13000,
               this.f14000,
               this.f15000,
               this.f16000,
               this.f17000,
               this.f18000,
               this.f19000,
               this.f20000,
               this.f21000,
               this.f22000,
               this.f23000,
               this.f24000,
               this.f25000,
               this.f26000,
               this.f27000,
               this.f28000,
               this.f29000,
               this.f30000,
               this.f31000,
               this.f32000,
               this.f33000,
               this.f34000,
               this.f35000,
               this.f36000,
               this.f37000,
               this.f38000,
               this.f39000,
               this.f40000,
               this.f41000,
               this.f42000,
               this.f43000,
               var1,
               this.f45000,
               this.f46000,
               this.f47000,
               this.f48000
            );
      }
   }

   static boolean m174000(float var0, float var1) {
      return Float.floatToIntBits(var0) == Float.floatToIntBits(var1);
   }

   public C0019 m176000(Enum0033 var1) {
      if (var1 == null) {
         throw new NullPointerException("scrollbarMode is marked non-null but is null");
      } else {
         return this.f21000 == var1
            ? this
            : new C0019(
               this.f1000,
               this.f2000,
               this.f3000,
               this.f4000,
               this.f5000,
               this.f6000,
               this.f7000,
               this.f8000,
               this.f9000,
               this.f10000,
               this.f11000,
               this.f12000,
               this.f13000,
               this.f14000,
               this.f15000,
               this.f16000,
               this.f17000,
               this.f18000,
               this.f19000,
               this.f20000,
               var1,
               this.f22000,
               this.f23000,
               this.f24000,
               this.f25000,
               this.f26000,
               this.f27000,
               this.f28000,
               this.f29000,
               this.f30000,
               this.f31000,
               this.f32000,
               this.f33000,
               this.f34000,
               this.f35000,
               this.f36000,
               this.f37000,
               this.f38000,
               this.f39000,
               this.f40000,
               this.f41000,
               this.f42000,
               this.f43000,
               this.f44000,
               this.f45000,
               this.f46000,
               this.f47000,
               this.f48000
            );
      }
   }

   public C0019 m178000(Rec0068 var1) {
      if (var1 == null) {
         throw new NullPointerException("textureUv is marked non-null but is null");
      } else {
         return this.f42000 == var1
            ? this
            : new C0019(
               this.f1000,
               this.f2000,
               this.f3000,
               this.f4000,
               this.f5000,
               this.f6000,
               this.f7000,
               this.f8000,
               this.f9000,
               this.f10000,
               this.f11000,
               this.f12000,
               this.f13000,
               this.f14000,
               this.f15000,
               this.f16000,
               this.f17000,
               this.f18000,
               this.f19000,
               this.f20000,
               this.f21000,
               this.f22000,
               this.f23000,
               this.f24000,
               this.f25000,
               this.f26000,
               this.f27000,
               this.f28000,
               this.f29000,
               this.f30000,
               this.f31000,
               this.f32000,
               this.f33000,
               this.f34000,
               this.f35000,
               this.f36000,
               this.f37000,
               this.f38000,
               this.f39000,
               this.f40000,
               this.f41000,
               var1,
               this.f43000,
               this.f44000,
               this.f45000,
               this.f46000,
               this.f47000,
               this.f48000
            );
      }
   }

   public float m180000() {
      return this.f7000.m18000();
   }

   public C0019 m182000(Rec0070 var1) {
      if (var1 == null) {
         throw new NullPointerException("transitions is marked non-null but is null");
      } else {
         return this.f39000 == var1
            ? this
            : new C0019(
               this.f1000,
               this.f2000,
               this.f3000,
               this.f4000,
               this.f5000,
               this.f6000,
               this.f7000,
               this.f8000,
               this.f9000,
               this.f10000,
               this.f11000,
               this.f12000,
               this.f13000,
               this.f14000,
               this.f15000,
               this.f16000,
               this.f17000,
               this.f18000,
               this.f19000,
               this.f20000,
               this.f21000,
               this.f22000,
               this.f23000,
               this.f24000,
               this.f25000,
               this.f26000,
               this.f27000,
               this.f28000,
               this.f29000,
               this.f30000,
               this.f31000,
               this.f32000,
               this.f33000,
               this.f34000,
               this.f35000,
               this.f36000,
               this.f37000,
               this.f38000,
               var1,
               this.f40000,
               this.f41000,
               this.f42000,
               this.f43000,
               this.f44000,
               this.f45000,
               this.f46000,
               this.f47000,
               this.f48000
            );
      }
   }

   public C0019 m184000(Rec0066 var1) {
      if (var1 == null) {
         throw new NullPointerException("visualTranslateX is marked non-null but is null");
      } else {
         return this.f15000 == var1
            ? this
            : new C0019(
               this.f1000,
               this.f2000,
               this.f3000,
               this.f4000,
               this.f5000,
               this.f6000,
               this.f7000,
               this.f8000,
               this.f9000,
               this.f10000,
               this.f11000,
               this.f12000,
               this.f13000,
               this.f14000,
               var1,
               this.f16000,
               this.f17000,
               this.f18000,
               this.f19000,
               this.f20000,
               this.f21000,
               this.f22000,
               this.f23000,
               this.f24000,
               this.f25000,
               this.f26000,
               this.f27000,
               this.f28000,
               this.f29000,
               this.f30000,
               this.f31000,
               this.f32000,
               this.f33000,
               this.f34000,
               this.f35000,
               this.f36000,
               this.f37000,
               this.f38000,
               this.f39000,
               this.f40000,
               this.f41000,
               this.f42000,
               this.f43000,
               this.f44000,
               this.f45000,
               this.f46000,
               this.f47000,
               this.f48000
            );
      }
   }

   public C0019 m186000(Rec0128 var1) {
      if (var1 == null) {
         throw new NullPointerException("padding is marked non-null but is null");
      } else {
         return this.f5000 == var1
            ? this
            : new C0019(
               this.f1000,
               this.f2000,
               this.f3000,
               this.f4000,
               var1,
               this.f6000,
               this.f7000,
               this.f8000,
               this.f9000,
               this.f10000,
               this.f11000,
               this.f12000,
               this.f13000,
               this.f14000,
               this.f15000,
               this.f16000,
               this.f17000,
               this.f18000,
               this.f19000,
               this.f20000,
               this.f21000,
               this.f22000,
               this.f23000,
               this.f24000,
               this.f25000,
               this.f26000,
               this.f27000,
               this.f28000,
               this.f29000,
               this.f30000,
               this.f31000,
               this.f32000,
               this.f33000,
               this.f34000,
               this.f35000,
               this.f36000,
               this.f37000,
               this.f38000,
               this.f39000,
               this.f40000,
               this.f41000,
               this.f42000,
               this.f43000,
               this.f44000,
               this.f45000,
               this.f46000,
               this.f47000,
               this.f48000
            );
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private boolean m188000(Enum0041 var1, C0019 var2) {
      return switch (C0366.f1000[var1.ordinal()]) {
         case 1, 2 -> m144000(this.f10000) || m144000(var2.f10000);
         case 3, 4, 5, 6, 7, 8 -> m144000(this.f10000) || m144000(var2.f10000);
         default -> true;
      };
   }

   public C0019 m190000(Rec0127 var1) {
      Rec0127 var2 = Objects.requireNonNull(var1);
      return this.f11000 == var2.m6000() && this.f12000 == var2.m4000() ? this : this.m216000().m76000(var2.m6000()).m74000(var2.m4000()).m60000();
   }

   public C0019 m192000(Rec0126 var1) {
      if (var1 == null) {
         throw new NullPointerException("borderRadii is marked non-null but is null");
      } else {
         return this.f7000 == var1
            ? this
            : new C0019(
               this.f1000,
               this.f2000,
               this.f3000,
               this.f4000,
               this.f5000,
               this.f6000,
               var1,
               this.f8000,
               this.f9000,
               this.f10000,
               this.f11000,
               this.f12000,
               this.f13000,
               this.f14000,
               this.f15000,
               this.f16000,
               this.f17000,
               this.f18000,
               this.f19000,
               this.f20000,
               this.f21000,
               this.f22000,
               this.f23000,
               this.f24000,
               this.f25000,
               this.f26000,
               this.f27000,
               this.f28000,
               this.f29000,
               this.f30000,
               this.f31000,
               this.f32000,
               this.f33000,
               this.f34000,
               this.f35000,
               this.f36000,
               this.f37000,
               this.f38000,
               this.f39000,
               this.f40000,
               this.f41000,
               this.f42000,
               this.f43000,
               this.f44000,
               this.f45000,
               this.f46000,
               this.f47000,
               this.f48000
            );
      }
   }

   public C0019 m194000(Enum0032 var1) {
      if (var1 == null) {
         throw new NullPointerException("position is marked non-null but is null");
      } else {
         return this.f10000 == var1
            ? this
            : new C0019(
               this.f1000,
               this.f2000,
               this.f3000,
               this.f4000,
               this.f5000,
               this.f6000,
               this.f7000,
               this.f8000,
               this.f9000,
               var1,
               this.f11000,
               this.f12000,
               this.f13000,
               this.f14000,
               this.f15000,
               this.f16000,
               this.f17000,
               this.f18000,
               this.f19000,
               this.f20000,
               this.f21000,
               this.f22000,
               this.f23000,
               this.f24000,
               this.f25000,
               this.f26000,
               this.f27000,
               this.f28000,
               this.f29000,
               this.f30000,
               this.f31000,
               this.f32000,
               this.f33000,
               this.f34000,
               this.f35000,
               this.f36000,
               this.f37000,
               this.f38000,
               this.f39000,
               this.f40000,
               this.f41000,
               this.f42000,
               this.f43000,
               this.f44000,
               this.f45000,
               this.f46000,
               this.f47000,
               this.f48000
            );
      }
   }

   public C0019 m196000(Enum0038 var1) {
      if (var1 == null) {
         throw new NullPointerException("borderPosition is marked non-null but is null");
      } else {
         return this.f9000 == var1
            ? this
            : new C0019(
               this.f1000,
               this.f2000,
               this.f3000,
               this.f4000,
               this.f5000,
               this.f6000,
               this.f7000,
               this.f8000,
               var1,
               this.f10000,
               this.f11000,
               this.f12000,
               this.f13000,
               this.f14000,
               this.f15000,
               this.f16000,
               this.f17000,
               this.f18000,
               this.f19000,
               this.f20000,
               this.f21000,
               this.f22000,
               this.f23000,
               this.f24000,
               this.f25000,
               this.f26000,
               this.f27000,
               this.f28000,
               this.f29000,
               this.f30000,
               this.f31000,
               this.f32000,
               this.f33000,
               this.f34000,
               this.f35000,
               this.f36000,
               this.f37000,
               this.f38000,
               this.f39000,
               this.f40000,
               this.f41000,
               this.f42000,
               this.f43000,
               this.f44000,
               this.f45000,
               this.f46000,
               this.f47000,
               this.f48000
            );
      }
   }

   public C0019 m198000(Rec0125 var1) {
      if (var1 == null) {
         throw new NullPointerException("width is marked non-null but is null");
      } else {
         return this.f23000 == var1
            ? this
            : new C0019(
               this.f1000,
               this.f2000,
               this.f3000,
               this.f4000,
               this.f5000,
               this.f6000,
               this.f7000,
               this.f8000,
               this.f9000,
               this.f10000,
               this.f11000,
               this.f12000,
               this.f13000,
               this.f14000,
               this.f15000,
               this.f16000,
               this.f17000,
               this.f18000,
               this.f19000,
               this.f20000,
               this.f21000,
               this.f22000,
               var1,
               this.f24000,
               this.f25000,
               this.f26000,
               this.f27000,
               this.f28000,
               this.f29000,
               this.f30000,
               this.f31000,
               this.f32000,
               this.f33000,
               this.f34000,
               this.f35000,
               this.f36000,
               this.f37000,
               this.f38000,
               this.f39000,
               this.f40000,
               this.f41000,
               this.f42000,
               this.f43000,
               this.f44000,
               this.f45000,
               this.f46000,
               this.f47000,
               this.f48000
            );
      }
   }

   public C0019 m200000(Enum0040 var1) {
      if (var1 == null) {
         throw new NullPointerException("boxSizing is marked non-null but is null");
      } else {
         return this.f4000 == var1
            ? this
            : new C0019(
               this.f1000,
               this.f2000,
               this.f3000,
               var1,
               this.f5000,
               this.f6000,
               this.f7000,
               this.f8000,
               this.f9000,
               this.f10000,
               this.f11000,
               this.f12000,
               this.f13000,
               this.f14000,
               this.f15000,
               this.f16000,
               this.f17000,
               this.f18000,
               this.f19000,
               this.f20000,
               this.f21000,
               this.f22000,
               this.f23000,
               this.f24000,
               this.f25000,
               this.f26000,
               this.f27000,
               this.f28000,
               this.f29000,
               this.f30000,
               this.f31000,
               this.f32000,
               this.f33000,
               this.f34000,
               this.f35000,
               this.f36000,
               this.f37000,
               this.f38000,
               this.f39000,
               this.f40000,
               this.f41000,
               this.f42000,
               this.f43000,
               this.f44000,
               this.f45000,
               this.f46000,
               this.f47000,
               this.f48000
            );
      }
   }

   public C0019 m202000(Rec0130 var1) {
      if (var1 == null) {
         throw new NullPointerException("scrollbar is marked non-null but is null");
      } else {
         return this.f22000 == var1
            ? this
            : new C0019(
               this.f1000,
               this.f2000,
               this.f3000,
               this.f4000,
               this.f5000,
               this.f6000,
               this.f7000,
               this.f8000,
               this.f9000,
               this.f10000,
               this.f11000,
               this.f12000,
               this.f13000,
               this.f14000,
               this.f15000,
               this.f16000,
               this.f17000,
               this.f18000,
               this.f19000,
               this.f20000,
               this.f21000,
               var1,
               this.f23000,
               this.f24000,
               this.f25000,
               this.f26000,
               this.f27000,
               this.f28000,
               this.f29000,
               this.f30000,
               this.f31000,
               this.f32000,
               this.f33000,
               this.f34000,
               this.f35000,
               this.f36000,
               this.f37000,
               this.f38000,
               this.f39000,
               this.f40000,
               this.f41000,
               this.f42000,
               this.f43000,
               this.f44000,
               this.f45000,
               this.f46000,
               this.f47000,
               this.f48000
            );
      }
   }

   public C0019 m204000(Enum0042 var1) {
      if (var1 == null) {
         throw new NullPointerException("overflowY is marked non-null but is null");
      } else {
         return this.f20000 == var1
            ? this
            : new C0019(
               this.f1000,
               this.f2000,
               this.f3000,
               this.f4000,
               this.f5000,
               this.f6000,
               this.f7000,
               this.f8000,
               this.f9000,
               this.f10000,
               this.f11000,
               this.f12000,
               this.f13000,
               this.f14000,
               this.f15000,
               this.f16000,
               this.f17000,
               this.f18000,
               this.f19000,
               var1,
               this.f21000,
               this.f22000,
               this.f23000,
               this.f24000,
               this.f25000,
               this.f26000,
               this.f27000,
               this.f28000,
               this.f29000,
               this.f30000,
               this.f31000,
               this.f32000,
               this.f33000,
               this.f34000,
               this.f35000,
               this.f36000,
               this.f37000,
               this.f38000,
               this.f39000,
               this.f40000,
               this.f41000,
               this.f42000,
               this.f43000,
               this.f44000,
               this.f45000,
               this.f46000,
               this.f47000,
               this.f48000
            );
      }
   }

   public C0019 m206000(Enum0034 var1) {
      if (var1 == null) {
         throw new NullPointerException("alignX is marked non-null but is null");
      } else {
         return this.f2000 == var1
            ? this
            : new C0019(
               this.f1000,
               var1,
               this.f3000,
               this.f4000,
               this.f5000,
               this.f6000,
               this.f7000,
               this.f8000,
               this.f9000,
               this.f10000,
               this.f11000,
               this.f12000,
               this.f13000,
               this.f14000,
               this.f15000,
               this.f16000,
               this.f17000,
               this.f18000,
               this.f19000,
               this.f20000,
               this.f21000,
               this.f22000,
               this.f23000,
               this.f24000,
               this.f25000,
               this.f26000,
               this.f27000,
               this.f28000,
               this.f29000,
               this.f30000,
               this.f31000,
               this.f32000,
               this.f33000,
               this.f34000,
               this.f35000,
               this.f36000,
               this.f37000,
               this.f38000,
               this.f39000,
               this.f40000,
               this.f41000,
               this.f42000,
               this.f43000,
               this.f44000,
               this.f45000,
               this.f46000,
               this.f47000,
               this.f48000
            );
      }
   }

   public C0019 m208000(Enum0036 var1) {
      if (var1 == null) {
         throw new NullPointerException("clip is marked non-null but is null");
      } else {
         return this.f19000 == var1
            ? this
            : new C0019(
               this.f1000,
               this.f2000,
               this.f3000,
               this.f4000,
               this.f5000,
               this.f6000,
               this.f7000,
               this.f8000,
               this.f9000,
               this.f10000,
               this.f11000,
               this.f12000,
               this.f13000,
               this.f14000,
               this.f15000,
               this.f16000,
               this.f17000,
               this.f18000,
               var1,
               this.f20000,
               this.f21000,
               this.f22000,
               this.f23000,
               this.f24000,
               this.f25000,
               this.f26000,
               this.f27000,
               this.f28000,
               this.f29000,
               this.f30000,
               this.f31000,
               this.f32000,
               this.f33000,
               this.f34000,
               this.f35000,
               this.f36000,
               this.f37000,
               this.f38000,
               this.f39000,
               this.f40000,
               this.f41000,
               this.f42000,
               this.f43000,
               this.f44000,
               this.f45000,
               this.f46000,
               this.f47000,
               this.f48000
            );
      }
   }

   public Rec0126 m210000() {
      return this.f7000;
   }

   public C0019 m212000(float var1) {
      return this.f30000 == var1
         ? this
         : new C0019(
            this.f1000,
            this.f2000,
            this.f3000,
            this.f4000,
            this.f5000,
            this.f6000,
            this.f7000,
            this.f8000,
            this.f9000,
            this.f10000,
            this.f11000,
            this.f12000,
            this.f13000,
            this.f14000,
            this.f15000,
            this.f16000,
            this.f17000,
            this.f18000,
            this.f19000,
            this.f20000,
            this.f21000,
            this.f22000,
            this.f23000,
            this.f24000,
            this.f25000,
            this.f26000,
            this.f27000,
            this.f28000,
            this.f29000,
            var1,
            this.f31000,
            this.f32000,
            this.f33000,
            this.f34000,
            this.f35000,
            this.f36000,
            this.f37000,
            this.f38000,
            this.f39000,
            this.f40000,
            this.f41000,
            this.f42000,
            this.f43000,
            this.f44000,
            this.f45000,
            this.f46000,
            this.f47000,
            this.f48000
         );
   }

   public C0019 m214000(float var1) {
      float var2 = Math.max(0.0F, var1);
      return m174000(this.f5000.m20000(), var2) ? this : this.m186000(new Rec0128(this.f5000.m2000(), this.f5000.m8000(), this.f5000.m6000(), var2));
   }

   public C0370 m216000() {
      return new C0370()
         .m62000(this.f1000)
         .m64000(this.f2000)
         .m40000(this.f3000)
         .m46000(this.f4000)
         .m52000(this.f5000)
         .m94000(this.f6000)
         .m86000(this.f7000)
         .m88000(this.f8000)
         .m90000(this.f9000)
         .m92000(this.f10000)
         .m76000(this.f11000)
         .m74000(this.f12000)
         .m38000(this.f13000)
         .m6000(this.f14000)
         .m72000(this.f15000)
         .m42000(this.f16000)
         .m26000(this.f17000)
         .m18000(this.f18000)
         .m78000(this.f19000)
         .m80000(this.f20000)
         .m82000(this.f21000)
         .m84000(this.f22000)
         .m70000(this.f23000)
         .m32000(this.f24000)
         .m34000(this.f25000)
         .m2000(this.f26000)
         .m28000(this.f27000)
         .m36000(this.f28000)
         .m96000(this.f29000)
         .m10000(this.f30000)
         .m8000(this.f31000)
         .m30000(this.f32000)
         .m20000(this.f33000)
         .m12000(this.f34000)
         .m56000(this.f35000)
         .m50000(this.f36000)
         .m100000(this.f37000)
         .m14000(this.f38000)
         .m54000(this.f39000)
         .m24000(this.f40000)
         .m22000(this.f41000)
         .m48000(this.f42000)
         .m68000(this.f43000)
         .m66000(this.f44000)
         .m44000(this.f45000)
         .m4000(this.f46000)
         .m16000(this.f47000)
         .m98000(this.f48000);
   }

   public C0019 m218000(int var1) {
      return this.f37000 == var1
         ? this
         : new C0019(
            this.f1000,
            this.f2000,
            this.f3000,
            this.f4000,
            this.f5000,
            this.f6000,
            this.f7000,
            this.f8000,
            this.f9000,
            this.f10000,
            this.f11000,
            this.f12000,
            this.f13000,
            this.f14000,
            this.f15000,
            this.f16000,
            this.f17000,
            this.f18000,
            this.f19000,
            this.f20000,
            this.f21000,
            this.f22000,
            this.f23000,
            this.f24000,
            this.f25000,
            this.f26000,
            this.f27000,
            this.f28000,
            this.f29000,
            this.f30000,
            this.f31000,
            this.f32000,
            this.f33000,
            this.f34000,
            this.f35000,
            this.f36000,
            var1,
            this.f38000,
            this.f39000,
            this.f40000,
            this.f41000,
            this.f42000,
            this.f43000,
            this.f44000,
            this.f45000,
            this.f46000,
            this.f47000,
            this.f48000
         );
   }

   public Rec0125 m220000() {
      return this.f24000;
   }

   public int m222000() {
      return this.f33000;
   }

   public float m224000() {
      return this.f17000;
   }

   public Rec0130 m226000() {
      return this.f22000;
   }

   public boolean m228000() {
      return this.f47000;
   }

   public boolean m230000() {
      return this.f48000;
   }
}
