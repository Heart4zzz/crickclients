package net.minecraft.client.gui.font;

import rw.data.Rec0109;
import rw.data.Rec0113;
import rw.data.Rec0122;

public sealed interface TextRenderable$Styled permits Rec0122, Rec0109, Rec0113 {
   default float N() {
      return 0.0F;
   }
}
