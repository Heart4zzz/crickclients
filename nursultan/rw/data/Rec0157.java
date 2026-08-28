package rw.data;

import KDFzREm.NNMV;
import KDFzREm.NNNEc;
import KDFzREm.NNNzJ;
import KDFzREm.NNNzo;
import KDFzREm.hC;
import java.lang.runtime.ObjectMethods;
import java.util.Date;

public record Rec0157() implements NNNzJ {
   private final String f1000;
   private final String f2000;
   private final NNNEc f3000;
   private final int f4000;
   private final hC f5000;
   private final hC f6000;
   private final Date f7000;
   private final boolean f8000;

   public Rec0157(String var1, String var2, NNNEc var3, int var4, hC var5, hC var6, Date var7, boolean var8) {
      this.f1000 = var1;
      this.f2000 = var2;
      this.f3000 = var3;
      this.f4000 = var4;
      this.f5000 = var5;
      this.f6000 = var6;
      this.f7000 = var7;
      this.f8000 = var8;
   }

   public final boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0157,"id;name;dataVersion;protocolVersion;resourcePackVersion;datapackVersion;buildTime;stable",Rec0157::f1000,Rec0157::f2000,Rec0157::f3000,Rec0157::f4000,Rec0157::f5000,Rec0157::f6000,Rec0157::f7000,Rec0157::f8000>(
         this, var1
      );
   }

   public hC m4000() {
      return this.f6000;
   }

   public hC m6000() {
      return this.f5000;
   }

   public boolean comp_4031() {
      return this.f8000;
   }

   public Date comp_4030() {
      return this.f7000;
   }

   public int comp_4027() {
      return this.f4000;
   }

   public String comp_4024() {
      return this.f1000;
   }

   public NNNEc comp_4026() {
      return this.f3000;
   }

   public String comp_4025() {
      return this.f2000;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public hC method_70592(NNMV var1) {
      return switch (NNNzo.N[var1.ordinal()]) {
         case 1 -> this.f5000;
         case 2 -> this.f6000;
         default -> throw new MatchException(null, null);
      };
   }
}
