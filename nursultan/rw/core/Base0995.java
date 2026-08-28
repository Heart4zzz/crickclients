package rw.core;

import com.google.common.collect.Maps;
import java.util.LinkedHashMap;
import java.util.Map;
import rw.data.Rec0312;

public abstract class Base0995 {
   private static String[] f1000;
   public Object[] f2000;

   public LinkedHashMap<String, Base1014<?>> m2000() {
      return Maps.newLinkedHashMap((Map)this.f2000[0]);
   }

   public <T extends Base1014<?>> T m8000(String var1) {
      return (T)((Map)this.f2000[0]).get(var1);
   }

   public Base0995() {
      this.m10000();
      LinkedHashMap var5 = new LinkedHashMap();
      this.f2000[0] = var5;
   }

   static {
      ntfClinit();
   }

   private void m10000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[1];
         Object[] var1 = this.f2000;
      }
   }

   public Base1014<?> m18000(Base1014<?> var1) {
      if (((Map)this.f2000[0]).containsKey(var1.m6000().m10000())) {
         throw new IllegalArgumentException(String.format(f1000[0], var1.m6000()));
      } else {
         ((Map)this.f2000[0]).put(var1.m6000().m10000(), var1);
         return var1;
      }
   }

   private static void m20000() {
      f1000 = new String[]{"Setting with key %s already registered"};
   }

   public abstract Rec0312 m22000(String var1);
}
