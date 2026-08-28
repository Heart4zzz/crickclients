package rw.gui;

import java.lang.runtime.ObjectMethods;
import rw.defs.Enum0018;

public record Rec0011() {
   private final Enum0018 f1000;
   private final double f2000;
   private final double f3000;
   private final int f4000;
   private final int f5000;
   private final double f6000;

   public double m2000() {
      return this.f2000;
   }

   public double m4000() {
      return this.f6000;
   }

   public Rec0011(Enum0018 var1, double var2, double var4, int var6, int var7, double var8) {
      if (var1 == null) {
         throw new IllegalArgumentException("fieldType");
      } else if (var2 <= 0.0) {
         throw new IllegalArgumentException("baseSize must be > 0");
      } else if (var4 <= 0.0) {
         throw new IllegalArgumentException("pxRange must be > 0");
      } else if (var6 <= 0) {
         throw new IllegalArgumentException("initialPageSize must be > 0");
      } else if (var7 < var6) {
         throw new IllegalArgumentException("maxPageSize must be >= initialPageSize");
      } else if (Double.isNaN(var8) || Double.isFinite(var8) && var8 > 0.0) {
         this.f1000 = var1;
         this.f2000 = var2;
         this.f3000 = var4;
         this.f4000 = var6;
         this.f5000 = var7;
         this.f6000 = var8;
      } else {
         throw new IllegalArgumentException("weight must be NaN (font default) or finite and > 0");
      }
   }

   public Rec0011(Enum0018 var1, double var2, double var4, int var6, int var7) {
      this(var1, var2, var4, var6, var7, Double.NaN);
   }

   public final boolean m6000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0011,"fieldType;baseSize;pxRange;initialPageSize;maxPageSize;weight",Rec0011::f1000,Rec0011::f2000,Rec0011::f3000,Rec0011::f4000,Rec0011::f5000,Rec0011::f6000>(
         this, var1
      );
   }

   public int m8000() {
      return this.f4000;
   }

   public double m10000() {
      return this.f3000;
   }

   public Enum0018 m12000() {
      return this.f1000;
   }

   public Rec0011 m14000(double var1) {
      return new Rec0011(this.f1000, this.f2000, this.f3000, this.f4000, this.f5000, var1);
   }

   public static Rec0011 m16000() {
      return new Rec0011(Enum0018.f3000, 40.0, 6.0, 1024, 8192);
   }

   public int m18000() {
      return this.f5000;
   }
}
