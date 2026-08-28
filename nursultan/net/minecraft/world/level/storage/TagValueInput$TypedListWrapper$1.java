package net.minecraft.world.level.storage;

import KDFzREm.NpC;
import KDFzREm.Sd;
import com.google.common.collect.AbstractIterator;
import com.mojang.serialization.DataResult.Error;
import com.mojang.serialization.DataResult.Success;
import java.util.ListIterator;
import org.jspecify.annotations.Nullable;

class TagValueInput$TypedListWrapper$1 extends AbstractIterator<T> {
   TagValueInput$TypedListWrapper$1(Sd var1, ListIterator var2) {
      this.y = var1;
      this.val$iterator = var2;
   }

   @Nullable
   protected T computeNext() {
      while (this.val$iterator.hasNext()) {
         int var1 = this.val$iterator.nextIndex();
         NpC var2 = (NpC)this.val$iterator.next();
         switch (this.y.y.parse(this.y.N.N(), var2)) {
            case Success var5:
               return (T)var5.value();
            case Error var6:
               this.y.N(var1, var2, var6);
               if (!var6.partialValue().isPresent()) {
                  break;
               }

               return (T)var6.partialValue().get();
            default:
               throw new MatchException(null, null);
         }
      }

      return (T)this.endOfData();
   }
}
