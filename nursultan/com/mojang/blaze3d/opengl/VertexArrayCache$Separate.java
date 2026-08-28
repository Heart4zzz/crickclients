package com.mojang.blaze3d.opengl;

import KDFzREm.af;
import KDFzREm.pE;
import KDFzREm.pN;
import KDFzREm.pP;
import KDFzREm.pU;
import com.mojang.blaze3d.vertex.VertexFormat;
import com.mojang.blaze3d.vertex.VertexFormatElement;
import com.mojang.blaze3d.vertex.VertexFormatElement.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jspecify.annotations.Nullable;
import org.lwjgl.opengl.ARBVertexAttribBinding;

class VertexArrayCache$Separate extends pU {
   private final Map<VertexFormat, pP> cache = new HashMap<>();
   private final pN y;
   private final boolean needsMesaWorkaround;

   public VertexArrayCache$Separate(pN var1) {
      this.y = var1;
      if ("Mesa".equals(GlStateManager._getString(7936))) {
         String var2 = GlStateManager._getString(7938);
         this.needsMesaWorkaround = var2.contains("25.0.0") || var2.contains("25.0.1") || var2.contains("25.0.2");
      } else {
         this.needsMesaWorkaround = false;
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void N(VertexFormat var1, @Nullable af var2) {
      pP var3 = this.cache.get(var1);
      if (var3 != null) {
         GlStateManager._glBindVertexArray(var3.N);
         if (var2 != null && var3.L != var2) {
            if (this.needsMesaWorkaround && var3.L != null && var3.L.u == var2.u) {
               ARBVertexAttribBinding.glBindVertexBuffer(0, 0, 0L, 0);
            }

            ARBVertexAttribBinding.glBindVertexBuffer(0, var2.u, 0L, var1.getVertexSize());
            var3.L = var2;
         }
      } else {
         int var4 = GlStateManager._glGenVertexArrays();
         GlStateManager._glBindVertexArray(var4);
         if (var2 != null) {
            List var5 = var1.getElements();

            for (int var6 = 0; var6 < var5.size(); var6++) {
               VertexFormatElement var7 = (VertexFormatElement)var5.get(var6);
               GlStateManager._enableVertexAttribArray(var6);
               switch (pE.N[var7.usage().ordinal()]) {
                  case 1:
                  case 2:
                  case 3:
                     if (var7.type() == Type.FLOAT) {
                        ARBVertexAttribBinding.glVertexAttribFormat(var6, var7.count(), GlConst.toGl(var7.type()), false, var1.getOffset(var7));
                     } else {
                        ARBVertexAttribBinding.glVertexAttribIFormat(var6, var7.count(), GlConst.toGl(var7.type()), var1.getOffset(var7));
                     }
                     break;
                  case 4:
                  case 5:
                     ARBVertexAttribBinding.glVertexAttribFormat(var6, var7.count(), GlConst.toGl(var7.type()), true, var1.getOffset(var7));
               }

               ARBVertexAttribBinding.glVertexAttribBinding(var6, 0);
            }
         }

         if (var2 != null) {
            ARBVertexAttribBinding.glBindVertexBuffer(0, var2.u, 0L, var1.getVertexSize());
         }

         pP var8 = new pP(var4, var1, var2);
         this.y.N(var8);
         this.cache.put(var1, var8);
      }
   }
}
