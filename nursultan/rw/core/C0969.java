package rw.core;

import KDFzREm.NNuU;
import java.util.function.Predicate;

public class C0969 extends C0953 {
   public Object[] f1000;
   private static byte[] f2000;

   @Override
   public boolean m4000() {
      this.m14000();
      return (Boolean)this.f1000[1];
   }

   public C0969(Runnable var1, Predicate<NNuU> var2) {
      super(999, var1);
      this.m14000();
      this.f1000[0] = var2;
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      f2000 = new byte[]{2};
   }

   public boolean m10000() {
      this.m14000();
      NNuU var1 = NNuU.Nq();
      if (!(Boolean)this.f1000[1] && ((Predicate)this.f1000[0]).test(var1)) {
         ((Runnable)this.y[1]).run();
         Boolean var6 = true;
         this.f1000[1] = var6;
         return (boolean)1;
      } else {
         return (boolean)0;
      }
   }

   private void m14000() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 0
      //   at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
      //   at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
      //   at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
      //   at java.base/java.util.Objects.checkIndex(Objects.java:385)
      //   at java.base/java.util.ArrayList.remove(ArrayList.java:551)
      //   at org.jetbrains.java.decompiler.util.collections.ListStack.pop(ListStack.java:31)
      //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.processBlock(ExprProcessor.java:471)
      //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.processStatement(ExprProcessor.java:134)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:220)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getstatic rw/core/C0969.f2000 [B
      // 04: baload
      // 05: anewarray 86
      // 08: checkcast [Ljava/lang/Object;
      // 0b: putfield rw/core/C0969.f1000 [Ljava/lang/Object;
      // 0e: aload 0
      // 0f: getfield rw/core/C0969.f1000 [Ljava/lang/Object;
      // 12: bipush 1
      // 13: bipush 0
      // 14: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 17: aastore
      // 18: return
   }
}
