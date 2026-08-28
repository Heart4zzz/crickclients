package rw.core;

import java.util.stream.IntStream;

public class IlkOkiqsp extends Base1084 {
   public IlkOkiqsp(String var1) {
      super(var1);
   }

   static {
      ntfClinit();
   }

   public int[] m4000(int var1) {
      return IntStream.iterate(
            var1 - 1,
            var0 -> (boolean)(var0 >= 0 ? 1 : 0),
            var0 -> -Integer.rotateRight(
               Integer.rotateLeft(Integer.rotateLeft(Integer.rotateRight(Integer.rotateRight(-Integer.rotateLeft(var0, 10), 10), 1), 2), 13), 31
            )
         )
         .toArray();
   }
}
