package net.minecraft.network.chat;

import KDFzREm.NAd;
import org.jspecify.annotations.Nullable;

class Style$1Collector {
   private boolean isNotFirst;

   Style$1Collector(NAd var1, StringBuilder var2) {
      this.val$result = var2;
   }

   void addValueString(String var1, @Nullable Object var2) {
      if (var2 != null) {
         this.addValueString();
         this.val$result.append(var1);
         this.val$result.append('=');
         this.val$result.append(var2);
      }
   }

   void addValueString(String var1, @Nullable Boolean var2) {
      if (var2 != null) {
         this.addValueString();
         if (!var2) {
            this.val$result.append('!');
         }

         this.val$result.append(var1);
      }
   }

   private void addValueString() {
      if (this.isNotFirst) {
         this.val$result.append(',');
      }

      this.isNotFirst = true;
   }
}
