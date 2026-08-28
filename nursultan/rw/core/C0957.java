package rw.core;

public class C0957 {
   private static boolean[] f1000;
   public Object[] f2000;

   private static void m4000() {
      f1000 = new boolean[]{true, true, false, false};
   }

   public C0957() {
      this.m6000();
   }

   static {
      ntfClinit();
   }

   private void m6000() {
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
      // 01: getstatic rw/core/C0957.f1000 [Z
      // 04: baload
      // 05: anewarray 4
      // 08: checkcast [Ljava/lang/Object;
      // 0b: putfield rw/core/C0957.f2000 [Ljava/lang/Object;
      // 0e: aload 0
      // 0f: getfield rw/core/C0957.f2000 [Ljava/lang/Object;
      // 12: bipush 0
      // 13: bipush 0
      // 14: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 17: aastore
      // 18: return
   }

   public int m10000() {
      return (Integer)this.f2000[0];
   }

   public void m14000() {
      Integer var5 = (Integer)this.f2000[0] + 1;
      this.f2000[0] = var5;
   }
}
