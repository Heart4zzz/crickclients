package rw;

import KDFzREm.NNuU;
import java.util.Arrays;
import java.util.Objects;
import rw.api.AnnotationDefault;
import rw.core.Base0995;
import rw.core.Base1014;
import rw.core.C0042;
import rw.core.C0073;
import rw.core.C0770;
import rw.core.C0925;
import rw.core.C1244;
import rw.data.Rec0312;
import rw.defs.BootstrapMethods;
import rw.defs.Enum0055;
import rw.defs.Enum0058;
import rw.gui.Enum0070;
import rw.gui.PgUp;

public class GuiWidget extends Base0995 {
   public Object[] f1000;
   private static String[] f2000;
   public Object[] f3000;

   public String m2000() {
      this.m24000();
      return (String)this.f1000[2];
   }

   public Enum0055 m4000() {
      this.m24000();
      return (Enum0055)this.f3000[2];
   }

   private static void m8000() {
      f2000 = new String[]{"The module should be annotated @ModuleTag", "Subcategory '%s' does not belong to category '%s'", "module", "setting"};
   }

   public GuiWidget() {
      this.m24000();
      NNuU var6 = NNuU.Nq();
      this.f3000[0] = var6;
      AnnotationDefault var1 = Objects.requireNonNull(this.getClass().getAnnotation(AnnotationDefault.class), f2000[0]);
      Enum0055 var7 = var1.m6000();
      this.f3000[2] = var7;
      Enum0070 var8 = var1.m8000();
      this.f3000[3] = var8;
      if (Arrays.stream(((Enum0055)this.f3000[2]).m42000()).noneMatch(var1x -> {
         this.m24000();
         return (boolean)(var1x == (Enum0070)this.f3000[3] ? 1 : 0);
      })) {
         throw new IllegalArgumentException(String.format(f2000[1], ((Enum0070)this.f3000[3]).m64000(), ((Enum0055)this.f3000[2]).m52000()));
      } else {
         String var9 = var1.m2000();
         this.f3000[1] = var9;
         Enum0058 var10 = var1.m4000();
         this.f1000[1] = var10;
         Rec0312 var11 = new Rec0312(C1244.m18000((String)this.f3000[1]));
         this.f1000[0] = var11;
         String var12 = C0770.m24000((String)this.f3000[1]);
         this.f1000[2] = var12;
         C0073 var13 = C0042.m12000(this, (PgUp)PgUp.f4000[0]);
         this.f1000[3] = var13;
         NursultanClient.m106000().m26000((C0073)this.f1000[3]);
         NursultanClient.m46000().m14000((C0073)this.f1000[3]);
      }
   }

   static {
      ntfClinit();
   }

   public Rec0312 m10000() {
      this.m24000();
      return (Rec0312)this.f1000[0];
   }

   public boolean m12000() {
      return (boolean)1;
   }

   public boolean m14000() {
      return (boolean)1;
   }

   private void m22000() {
      NursultanClient.m8000().m12000(C0925.m14000(this));
   }

   private void m24000() {
      if (this.f3000 == null) {
         this.f3000 = new Object[4];
         Object[] var1 = this.f3000;
      }

      if (this.f1000 == null) {
         this.f1000 = new Object[5];
         Object[] var2 = this.f1000;
         var2[4] = false;
      }
   }

   private void m26000() {
      this.m24000();
      if (this.m12000()) {
         Boolean var5 = true;
         this.f1000[4] = var5;
         NursultanClient.m8000().m32000(this);
         this.m6000();
         this.m22000();
      }
   }

   private void m28000() {
      this.m24000();
      if (this.m14000()) {
         Boolean var5 = false;
         this.f1000[4] = var5;
         NursultanClient.m8000().m66000(this);
         this.m6000();
         this.m22000();
      }
   }

   public boolean m30000() {
      this.m24000();
      return (Boolean)this.f1000[4];
   }

   public Enum0070 m32000() {
      this.m24000();
      return (Enum0070)this.f3000[3];
   }

   public Enum0058 m36000() {
      this.m24000();
      return (Enum0058)this.f1000[1];
   }

   public void m6000() {
   }

   public void m40000() {
      this.m24000();
      this.m46000((boolean)(!this.f1000[4] ? 1 : 0));
   }

   public String m42000() {
      this.m24000();
      return (String)this.f3000[1];
   }

   public Rec0312 m10000(String var1) {
      this.m24000();
      return new Rec0312(f2000[2]).m12000(((String)this.f3000[1]).toLowerCase()).m12000(f2000[3]).m12000(var1);
   }

   public Base1014<?> m14000(Base1014<?> var1) {
      return super.m18000(var1);
   }

   public void m44000(PgUp var1, int var2, BootstrapMethods var3, boolean var4) {
      this.m24000();
      ((C0073)this.f1000[3]).m52000(var1, var2, var3, var4);
   }

   public void m46000(boolean var1) {
      this.m24000();
      if ((Boolean)this.f1000[4] != var1) {
         if (var1) {
            this.m26000();
         } else {
            this.m28000();
         }
      }
   }

   public NNuU m50000() {
      this.m24000();
      return (NNuU)this.f3000[0];
   }

   public C0073 m54000() {
      this.m24000();
      return (C0073)this.f1000[3];
   }
}
