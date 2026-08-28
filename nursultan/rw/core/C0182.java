package rw.core;

import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import rw.module.Huddumped;

public class C0182 {
   public Object[] f1000;

   private void m8000(C0073 var1) {
      this.m16000(var1);
      this.m32000(var1.m36000().m8000(), var1);
   }

   public C0182() {
      this.m36000();
      Int2ObjectOpenHashMap var5 = new Int2ObjectOpenHashMap();
      this.f1000[0] = var5;
      Consumer var6 = this::m8000;
      this.f1000[1] = var6;
   }

   static {
      ntfClinit();
   }

   private void m16000(C0073 var1) {
      ObjectIterator var2 = ((Int2ObjectOpenHashMap)this.f1000[0]).int2ObjectEntrySet().iterator();

      while (var2.hasNext()) {
         Entry var3 = (Entry)var2.next();
         List var4 = (List)var3.getValue();
         var4.removeIf(var1x -> (boolean)(var1x == var1 ? 1 : 0));
         if (var4.isEmpty()) {
            var2.remove();
         }
      }
   }

   public void m24000(Huddumped var1) {
      List var2 = (List)((Int2ObjectOpenHashMap)this.f1000[0]).get(var1.m30000());
      if (var2 != null) {
         List var3 = var2.stream().filter(var1x -> var1x.m30000(var1)).toList();
         if (var3.isEmpty()) {
            var3 = var2.stream().filter(var1x -> var1x.m38000(var1)).toList();
         }

         var3.forEach(var1x -> var1x.m6000(var1));
      }
   }

   public void m26000(C0073 var1) {
      this.m16000(var1);
      this.m32000(var1.m36000().m8000(), var1);
      var1.m56000((Consumer<C0073>)this.f1000[1]);
   }

   private void m32000(int var1, C0073 var2) {
      if (!var2.m14000()) {
         List var3 = (List)((Int2ObjectOpenHashMap)this.f1000[0]).computeIfAbsent(var1, var0 -> new ArrayList());
         if (!var3.stream().anyMatch(var1x -> (boolean)(var1x == var2 ? 1 : 0))) {
            var3.add(var2);
         }
      }
   }

   private void m36000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[2];
         Object[] var1 = this.f1000;
      }
   }

   public void m38000(Huddumped var1) {
      List var2 = (List)((Int2ObjectOpenHashMap)this.f1000[0]).get(var1.m30000());
      if (var2 != null) {
         var2.stream().filter(var1x -> var1x.m64000(var1.m30000())).forEach(var1x -> var1x.m58000(var1));
      }
   }

   public void m40000(C0073 var1) {
      this.m16000(var1);
   }
}
