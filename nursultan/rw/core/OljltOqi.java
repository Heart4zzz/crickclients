package rw.core;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectSet;
import java.util.function.Consumer;
import java.util.function.Supplier;
import rw.api.Iface0033;
import rw.data.Rec0294;
import rw.net.PacketHandlers;

public class OljltOqi<T extends Iface0033> {
   public Object[] f1000;

   OljltOqi() {
      this.m8000();
      Object2IntMap var5 = this.m26000(new Object2IntOpenHashMap(), var0 -> var0.defaultReturnValue(-1));
      this.f1000[0] = var5;
      Int2ObjectOpenHashMap var6 = new Int2ObjectOpenHashMap();
      this.f1000[1] = var6;
   }

   static {
      ntfClinit();
   }

   private void m8000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[2];
         Object[] var1 = this.f1000;
      }
   }

   public <P extends PacketHandlers<T>> OljltOqi<T> m16000(int var1, Class<P> var2, Supplier<P> var3) {
      return this.m30000(var1, var2, var3, 15);
   }

   public ObjectSet<Class<? extends PacketHandlers<T>>> m18000() {
      return ((Object2IntMap)this.f1000[0]).keySet();
   }

   public boolean m20000(Class<?> var1, int var2) {
      int var3 = ((Object2IntMap)this.f1000[0]).getInt(var1);
      return (boolean)(var3 == -1 ? 0 : ((Rec0294)((Int2ObjectMap)this.f1000[1]).get(var3)).m10000(var2));
   }

   public Integer m22000(Class<?> var1) {
      int var2 = ((Object2IntMap)this.f1000[0]).getInt(var1);
      return var2 == -1 ? null : var2;
   }

   public PacketHandlers<?> m24000(int var1, int var2) {
      Rec0294 var3 = (Rec0294)((Int2ObjectMap)this.f1000[1]).get(var1);
      return (PacketHandlers<?>)(var3 != null && var3.m10000(var2) ? var3.m14000().get() : null);
   }

   public <R> R m26000(R var1, Consumer<R> var2) {
      var2.accept(var1);
      return (R)var1;
   }

   public <P extends PacketHandlers<T>> OljltOqi<T> m30000(int var1, Class<P> var2, Supplier<P> var3, int var4) {
      return this.m32000(var1, var2, var3, var4, Integer.MAX_VALUE);
   }

   public <P extends PacketHandlers<T>> OljltOqi<T> m32000(int var1, Class<P> var2, Supplier<P> var3, int var4, int var5) {
      if (((Int2ObjectMap)this.f1000[1]).containsKey(var1)) {
         throw new IllegalArgumentException("Packet id " + var1 + " is already registered");
      } else {
         int var6 = ((Object2IntMap)this.f1000[0]).put(var2, var1);
         if (var6 != -1) {
            throw new IllegalArgumentException("Packet " + var2 + " is already registered to ID " + var6);
         } else {
            ((Int2ObjectMap)this.f1000[1]).put(var1, new Rec0294(var3, var4, var5));
            return this;
         }
      }
   }
}
