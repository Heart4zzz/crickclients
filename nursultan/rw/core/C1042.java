package rw.core;

import rw.data.Rec0232;
import rw.defs.Enum0079;

public class C1042 {
   public Object[] f1000;

   private C1042(Enum0079 var1) {
      this.m6000();
      Integer var6 = -1;
      this.f1000[5] = var6;
      Integer var7 = -1;
      this.f1000[6] = var7;
      Rec0232 var8 = (Rec0232)Rec0232.f16000[0];
      this.f1000[7] = var8;
      this.f1000[0] = var1;
   }

   static {
      ntfClinit();
   }

   private void m6000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[8];
         Object[] var1 = this.f1000;
         var1[2] = 0;
         var1[3] = 0;
         var1[4] = 0;
         var1[5] = 0;
         var1[6] = 0;
      }
   }

   static C1042 m8000() {
      return new C1042((Enum0079)Enum0079.f2000[0]);
   }

   Rec0232 m14000(int var1, int var2) {
      if ((Integer)this.f1000[2] != 0) {
         return (Rec0232)this.f1000[7];
      } else if ((C0350)this.f1000[1] != null && var1 != 0) {
         if (((Rec0232)this.f1000[7]).m14000() && (Integer)this.f1000[5] == var1 && (Integer)this.f1000[6] == var2) {
            return (Rec0232)this.f1000[7];
         } else {
            Integer var7 = var1;
            this.f1000[5] = var7;
            Integer var8 = var2;
            this.f1000[6] = var8;
            Rec0232 var9 = Rec0232.m42000(
               var1,
               (Integer)this.f1000[3],
               (Integer)this.f1000[4],
               ((C0350)this.f1000[1]).m24000(),
               ((C0350)this.f1000[1]).m4000(),
               ((C0350)this.f1000[1]).m6000(),
               ((C0350)this.f1000[1]).m8000()
            );
            this.f1000[7] = var9;
            return (Rec0232)this.f1000[7];
         }
      } else {
         return (Rec0232)Rec0232.f16000[0];
      }
   }
}
