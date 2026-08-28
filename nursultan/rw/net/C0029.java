package rw.net;

import io.netty.channel.Channel;
import io.netty.channel.ChannelFutureListener;
import io.netty.util.AttributeKey;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import rw.core.C1212;
import rw.data.IlsitkOq;
import rw.data.Rec0302;

public class C0029 {
   public Object[] f1000;

   private void m4000() {
      ((AtomicInteger)this.f1000[1]).updateAndGet(var0 -> Math.max(0, var0 - 1));
   }

   public C0029(IlsitkOq var1) {
      this.m10000();
      C1212 var6 = new C1212();
      this.f1000[0] = var6;
      AtomicInteger var7 = new AtomicInteger();
      this.f1000[1] = var7;
      AtomicBoolean var8 = new AtomicBoolean(false);
      this.f1000[2] = var8;
      this.f1000[3] = var1;
   }

   static {
      ntfClinit();
   }

   private void m10000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[4];
         Object[] var1 = this.f1000;
      }
   }

   public int m14000() {
      return ((AtomicInteger)this.f1000[1]).get();
   }

   private void m18000(Enum0031 var1) {
      ((C1212)this.f1000[0]).m14000(var1, var1x -> {
         this.m4000();

         try {
            ((IlsitkOq)this.f1000[3]).m8000().accept(var1x.m8000(), var1x.m2000());
         } catch (Exception var3) {
            ((IlsitkOq)this.f1000[3]).m10000().accept(var3);
         }
      });
   }

   private static Enum0031 m20000(Channel var0) {
      return !var0.hasAttr((AttributeKey)Enum0031.f3000[2]) ? null : (Enum0031)var0.attr((AttributeKey)Enum0031.f3000[2]).get();
   }

   public void m22000(Enum0031 var1) {
      if (!((AtomicBoolean)this.f1000[2]).get()) {
         this.m18000(var1);
      }
   }

   public void m28000() {
      ((AtomicBoolean)this.f1000[2]).set((boolean)1);
      ((C1212)this.f1000[0]).m10000();
      ((AtomicInteger)this.f1000[1]).set(0);
   }

   public void m30000(PacketHandlers<?> var1, Enum0031 var2, ChannelFutureListener var3) {
      if (!((AtomicBoolean)this.f1000[2]).get()) {
         Channel var4 = ((IlsitkOq)this.f1000[3]).m6000().get();
         if (var4 != null && var4.isActive()) {
            if (m20000(var4) == var2) {
               ((IlsitkOq)this.f1000[3]).m8000().accept(var1, var3);
            } else {
               Rec0302 var5 = new Rec0302(var1, var2, var3);
               if (((AtomicInteger)this.f1000[1]).incrementAndGet() > ((IlsitkOq)this.f1000[3]).m14000()) {
                  this.m4000();
                  ((IlsitkOq)this.f1000[3]).m2000().accept(var5);
               } else {
                  ((C1212)this.f1000[0]).m20000(var5);
                  if (((AtomicBoolean)this.f1000[2]).get()) {
                     ((C1212)this.f1000[0]).m10000();
                     ((AtomicInteger)this.f1000[1]).set(0);
                  } else {
                     Enum0031 var6 = m20000(var4);
                     if (var6 != null) {
                        this.m18000(var6);
                     }
                  }
               }
            }
         }
      }
   }
}
