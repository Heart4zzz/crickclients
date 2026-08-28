package rw.core;

import java.util.stream.IntStream;

public class C1082 extends Base1084 {
   public C1082(String var1, boolean var2) {
      super(var1, var2);
   }

   static {
      ntfClinit();
   }

   public int[] m4000(int var1) {
      return IntStream.iterate(0, var1x -> (boolean)(var1x < var1 ? 1 : 0), var0 -> Integer.rotateRight((-Integer.rotateRight(var0, 18) ^ -1489616378) + 1, 30))
         .toArray();
   }
}
