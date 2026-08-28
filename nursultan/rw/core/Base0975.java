package rw.core;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.apache.logging.log4j.Logger;
import org.msgpack.core.MessageBufferPacker;
import org.msgpack.core.MessageUnpacker;
import org.msgpack.value.ArrayValue;
import org.msgpack.value.ImmutableValue;
import rw.defs.Nuker;

public abstract class Base0975<T> extends Base0973 {
   public static Object[] f1000;
   private static String[] f2000;

   public abstract void m2000(T var1);

   private static void m4000() {
      f1000 = new Object[]{null};
   }

   public Base0975(String var1, int var2, Nuker var3) {
      super(var1, var2, var3);
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      f2000 = new String[]{"Skipped corrupt record #{} in {}: {}"};
   }

   public void m8000(T var1, T var2) {
      this.m10000((T)var1);
      this.m2000((T)var2);
   }

   public abstract void m10000(T var1);

   public void m16000(int var1, MessageUnpacker var2) throws IOException {
      int var3 = var2.unpackArrayHeader();
      HashMap var4 = new HashMap(var3);

      for (int var5 = 0; var5 < var3; var5++) {
         try {
            ImmutableValue var6 = var2.unpackValue();
            Object var7 = this.m16000(var1, var6.asArrayValue());
            if (var7 != null) {
               var4.put(this.m22000((T)var7), var7);
            }
         } catch (Exception var8) {
            ((Logger)f1000[0]).warn(f2000[0], var5, this.u(), var8.getMessage());
         }
      }

      List var9 = this.m26000();
      Map var10 = var9.stream().collect(Collectors.toMap(this::m22000, var0 -> var0, (var0, var1x) -> var1x, () -> new HashMap(var9.size())));
      var9.stream().filter(var2x -> (boolean)(!var4.containsKey(this.m22000((T)var2x)) ? 1 : 0)).forEach(this::m10000);
      var4.forEach((var2x, var3x) -> {
         Object var4x = var10.get(var2x);
         if (var4x == null) {
            this.m2000((T)var3x);
         } else if (!this.m24000((T)var4x, (T)var3x)) {
            this.m8000((T)var4x, (T)var3x);
         }
      });
   }

   public abstract void m14000(MessageBufferPacker var1, T var2) throws IOException;

   public void m18000(MessageBufferPacker var1) throws IOException {
      List var2 = this.m26000();
      var1.packArrayHeader(var2.size());

      for (Object var4 : var2) {
         this.m14000(var1, (T)var4);
      }
   }

   public abstract T m16000(int var1, ArrayValue var2) throws Exception;

   public abstract Object m22000(T var1);

   public abstract boolean m24000(T var1, T var2);

   public abstract List<T> m26000();

   @Override
   public boolean d_() {
      return this.m26000().isEmpty();
   }
}
