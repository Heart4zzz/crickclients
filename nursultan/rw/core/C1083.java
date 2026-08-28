package rw.core;

import java.util.ArrayList;
import java.util.Collections;

public class C1083 extends Base1084 {
   public C1083(String var1) {
      super(var1);
   }

   static {
      ntfClinit();
   }

   public int[] m4000(int var1) {
      ArrayList var2 = new ArrayList();

      for (int var3 = 0; var3 < var1; var3++) {
         var2.add(var3);
      }

      Collections.shuffle(var2);
      return var2.stream().mapToInt(var0 -> var0).toArray();
   }
}
