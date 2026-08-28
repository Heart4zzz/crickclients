package rw.core;

public class C0953 {
   public Object[] f1000;
   private static byte[] f2000;

   public boolean m4000() {
      return (boolean)(this.f1000[0] <= 0 ? 1 : 0);
   }

   public int m6000() {
      return (Integer)this.f1000[0];
   }

   public C0953(int var1, Runnable var2) {
      this.m24000();
      Integer var7 = var1;
      this.f1000[0] = var7;
      this.f1000[1] = var2;
   }

   static {
      ntfClinit();
   }

   public Runnable m8000() {
      return (Runnable)this.f1000[1];
   }

   public boolean m14000() {
      int var10002 = (Integer)this.f1000[0] - 1;
      Integer var5 = var10002;
      this.f1000[0] = var5;
      if (var10002 == 0) {
         ((Runnable)this.f1000[1]).run();
         return (boolean)1;
      } else {
         return (boolean)0;
      }
   }

   private static void m22000() {
      f2000 = new byte[]{2};
   }

   private void m24000() {
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
      // 01: getstatic rw/core/C0953.f2000 [B
      // 04: baload
      // 05: anewarray 4
      // 08: checkcast [Ljava/lang/Object;
      // 0b: putfield rw/core/C0953.f1000 [Ljava/lang/Object;
      // 0e: aload 0
      // 0f: getfield rw/core/C0953.f1000 [Ljava/lang/Object;
      // 12: bipush 0
      // 13: bipush 0
      // 14: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 17: aastore
      // 18: return
   }
}
