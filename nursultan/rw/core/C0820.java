package rw.core;

import java.util.ArrayList;
import java.util.List;
import rw.data.Rec0198;
import rw.defs.Enum0060;
import rw.setting.OlpOtr;

public class C0820 {
   public Object[] f1000;

   private void m2000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[2];
         Object[] var1 = this.f1000;
      }
   }

   C0820(C0816 var1) {
      this.m2000();
      ArrayList var6 = new ArrayList();
      this.f1000[1] = var6;
      this.f1000[0] = var1;
   }

   static {
      ntfClinit();
   }

   public OlpOtr m8000() {
      OlpOjr var1 = new OlpOjr((List<Rec0198>)this.f1000[1]);
      return new OlpOtr(
         (String)((C0816)this.f1000[0]).f2000[0],
         (String)((C0816)this.f1000[0]).f2000[1],
         var1,
         "template:" + Integer.toHexString(System.identityHashCode(var1))
      );
   }

   public C0820 m12000() {
      ((List)this.f1000[1]).add(Rec0198.m20000(null));
      return this;
   }

   public C0820 m14000(Object var1) {
      ((List)this.f1000[1]).add(Rec0198.m22000(var1));
      return this;
   }

   public C0820 m16000(Enum0060 var1) {
      ((List)this.f1000[1]).add(Rec0198.m20000(var1));
      return this;
   }

   C0820 m20000(List<Rec0198> var1) {
      ((List)this.f1000[1]).addAll(var1);
      return this;
   }

   public C0820 m22000(String var1, Enum0060 var2) {
      ((List)this.f1000[1]).add(Rec0198.m16000(var1, var2));
      return this;
   }

   public C0820 m24000(String var1, Object var2) {
      ((List)this.f1000[1]).add(Rec0198.m18000(var1, var2));
      return this;
   }

   public C0820 m26000(String var1) {
      ((List)this.f1000[1]).add(Rec0198.m16000(var1, null));
      return this;
   }
}
