package rw.setting;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import rw.core.C0816;
import rw.data.Rec0198;
import rw.defs.Enum0060;

public class C0091 {
   public Object[] f1000;
   private static String[] f2000;

   public C0091 m4000() {
      ((List)this.f1000[1]).add(Rec0198.m20000(null));
      return this;
   }

   public C0091 m6000(String var1) {
      ((List)this.f1000[1]).add(Rec0198.m16000(var1, null));
      return this;
   }

   private void m8000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[4];
         Object[] var1 = this.f1000;
      }
   }

   C0091(String var1) {
      this.m8000();
      ArrayList var6 = new ArrayList();
      this.f1000[1] = var6;
      String var7 = f2000[0];
      this.f1000[2] = var7;
      this.f1000[0] = var1;
   }

   static {
      ntfClinit();
   }

   private String m12000(String var1) {
      String var2 = var1.replace('\\', '/');
      return var2.startsWith((String)this.f1000[0]) ? var2 : (String)this.f1000[0] + var2;
   }

   private static void m16000() {
      f2000 = new String[]{"default.vert", "file", "file", "Fragment shader file was not set"};
   }

   public C0091 m22000(String var1) {
      String var6 = Objects.requireNonNull(var1, f2000[1]);
      this.f1000[2] = var6;
      return this;
   }

   public OlpOtr m26000() {
      return this.m34000().m26000().m20000((List<Rec0198>)this.f1000[1]).m8000();
   }

   public C0091 m28000(String var1, String var2) {
      return this.m22000(var1).m42000(var2);
   }

   public C0091 m30000(Object var1) {
      ((List)this.f1000[1]).add(Rec0198.m22000(var1));
      return this;
   }

   public C0091 m32000(Enum0060 var1) {
      ((List)this.f1000[1]).add(Rec0198.m20000(var1));
      return this;
   }

   public C0816 m34000() {
      if ((String)this.f1000[3] != null && !((String)this.f1000[3]).isBlank()) {
         return new C0816(this.m12000((String)this.f1000[2]), this.m12000((String)this.f1000[3]));
      } else {
         throw new IllegalStateException(f2000[3]);
      }
   }

   public C0091 m38000(String var1, Object var2) {
      ((List)this.f1000[1]).add(Rec0198.m18000(var1, var2));
      return this;
   }

   public C0091 m40000(String var1, Enum0060 var2) {
      ((List)this.f1000[1]).add(Rec0198.m16000(var1, var2));
      return this;
   }

   public C0091 m42000(String var1) {
      String var6 = Objects.requireNonNull(var1, f2000[2]);
      this.f1000[3] = var6;
      return this;
   }
}
