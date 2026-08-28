package rw.core;

import java.lang.invoke.MethodHandle;

class Injectedinvoker {
   static Object invoke_V(MethodHandle var0, Object[] var1) {
      return (Object)var0.invokeExact(var1);
   }

   static Object reflect_invoke_V(MethodHandle var0, Object var1, Object[] var2) {
      return (Object)var0.invokeExact((Object)var1, (Object[])var2);
   }
}
