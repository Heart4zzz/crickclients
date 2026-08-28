package rw.core;

import KDFzREm.NNNNmC;
import KDFzREm.NNuU;
import net.minecraft.client.main.GameConfig;

public class C0577 implements Runnable {
   public Object[] f1000;
   private static boolean[] f2000;
   private static byte[] f3000;

   private static void m4000() {
      f3000 = new byte[]{3};
   }

   public C0577(NNuU var1, GameConfig var2) {
      this.m12000();
      this.f1000[2] = var1;
      this.f1000[1] = var2;
   }

   static {
      ntfClinit();
   }

   public void m6000() {
      if (!(Boolean)this.f1000[0]) {
         Boolean var5 = true;
         this.f1000[0] = var5;
         NNNNmC.N(
            OOk0qtI<"hnkawz",-1031759221,-1060529933,-1060529923,-1060529940,-886722491,1473659564>(
               OOk0qtI<"xmrq",-1031759221,-1060529936,-1060529935,-1060529934,-1188687691,157919886>((GameConfig)this.f1000[1])
            ),
            ((Thread)((NNuU)this.f1000[2]).G[2]).threadId()
         );
      }
   }

   private void m12000() {
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
      // 01: getstatic rw/core/C0577.f3000 [B
      // 04: baload
      // 05: anewarray 4
      // 08: checkcast [Ljava/lang/Object;
      // 0b: putfield rw/core/C0577.f1000 [Ljava/lang/Object;
      // 0e: aload 0
      // 0f: getfield rw/core/C0577.f1000 [Ljava/lang/Object;
      // 12: getstatic rw/core/C0577.f2000 [Z
      // 15: baload
      // 16: bipush 0
      // 17: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 1a: aastore
      // 1b: return
   }

   private static void m18000() {
      f2000 = new boolean[]{true, false, false};
   }
}
