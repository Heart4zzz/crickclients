package rw.setting;

import java.lang.invoke.CallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Method;
import java.util.function.Consumer;
import org.apache.logging.log4j.Logger;
import rw.api.Iface0642;
import rw.api.Iface0645;
import rw.api.Iface0651;
import rw.defs.Enum0081;

public class C0151 implements Iface0651 {
   private static short[] f1000;
   private static short[] f2000;
   public static Object[] f3000;
   private static byte[] f4000;
   public Object[] f5000;
   private static short[] f6000;
   private static boolean[] f7000;
   private static boolean[] f8000;
   private static String[] f9000;

   public Enum0081 m4000() {
      return (Enum0081)this.f5000[f6000[1]];
   }

   @Override
   public Class<?> m8000() {
      return (Class<?>)this.f5000[f6000[3]];
   }

   public C0151(Iface0645 var1, Class<?> var2, Object var3, Method var4) {
      this.m40000();
      if (var4.getAnnotation(Iface0642.class) == null) {
         String var10002 = f9000[0];
         Object[] var10003 = new Object[f7000[0]];
         var10003[f7000[1]] = var4.getName();
         throw new RuntimeException(var10002.formatted(var10003));
      } else {
         Iface0642 var5 = var4.getAnnotation(Iface0642.class);
         Class var16 = var4.getParameters()[f7000[2]].getType();
         this.f5000[f2000[0]] = var16;
         Class var17 = var3.getClass();
         this.f5000[f2000[1]] = var17;
         Enum0081 var18 = var5.m6000();
         this.f5000[f2000[2]] = var18;
         Boolean var19 = var5.m4000();
         this.f5000[f2000[3]] = var19;
         Class[] var20 = var5.m8000();
         this.f5000[f2000[4]] = var20;
         Class[] var21 = var5.m2000();
         this.f5000[f2000[5]] = var21;

         try {
            String var6 = var4.getName();
            Lookup var7 = var1.m2000((Method)f3000[f1000[0]], var2);
            MethodType var8 = MethodType.methodType(void.class, var4.getParameters()[f7000[3]].getType());
            MethodHandle var9 = var7.findVirtual(var2, var6, var8);
            MethodType var10 = MethodType.methodType(Consumer.class, var2);
            CallSite var11 = LambdaMetafactory.metafactory(var7, f9000[1], var10, MethodType.methodType(void.class, Object.class), var9, var8);
            Consumer var22 = (Consumer)var11.getTarget().invoke((Object)var3);
            this.f5000[f1000[1]] = var22;
         } catch (Throwable var23) {
            ((Logger)f3000[f1000[2]]).error(var23, var23);
         }
      }
   }

   static {
      ntfClinit();
   }

   private static void m10000() {
      f4000 = new byte[]{2, 7, 3, 2};
   }

   private static void m12000() {
      f3000 = new Object[]{null, null};
   }

   public boolean m14000() {
      return (Boolean)this.f5000[f6000[2]];
   }

   private static void m18000() {
      f7000 = new boolean[]{true, false, false, false, false, false, true};
      f8000 = new boolean[]{true, false, false};
   }

   private static void m20000() {
      f2000 = new short[]{0, 1, 2, 3, 4, 5};
      f1000 = new short[]{1, 6, 0, 6};
      f6000 = new short[]{0, 2, 3, 1, 4, 5};
   }

   public Class<?> m24000() {
      return (Class<?>)this.f5000[f6000[0]];
   }

   public Class<?>[] m26000() {
      return (Class<?>[])this.f5000[f6000[5]];
   }

   private static void m32000() {
      f9000 = new String[]{"Method %s is not annotated with @EventHandler", "accept", "privateLookupIn"};
   }

   public Consumer<Object> m34000() {
      return (Consumer<Object>)this.f5000[f1000[3]];
   }

   private void m40000() {
      if (this.f5000 == null) {
         this.f5000 = new Object[f4000[1]];
         Object[] var1 = this.f5000;
         var1[f4000[2]] = f8000[2];
      }
   }

   public Class<?>[] m42000() {
      return (Class<?>[])this.f5000[f6000[4]];
   }
}
