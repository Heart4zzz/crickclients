package rw.core;

import KDFzREm.NAN;
import KDFzREm.Vx;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.Map;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.FabricRenderState;
import net.fabricmc.fabric.api.client.rendering.v1.RenderStateDataKey;
import org.jspecify.annotations.Nullable;

@Environment(EnvType.CLIENT)
public class C0689 implements FabricRenderState {
   @Nullable
   public Vx f1000;
   public byte f2000;
   public byte f3000;
   public byte f4000;
   public boolean f5000;
   @Nullable
   public NAN f6000;
   @Nullable
   private Map f7000;

   public void setData(RenderStateDataKey var1, Object var2) {
      if (this.f7000 == null) {
         this.f7000 = new Reference2ObjectOpenHashMap();
      }

      this.f7000.put(var1, var2);
   }

   @Nullable
   public Object getData(RenderStateDataKey var1) {
      return this.f7000 == null ? null : this.f7000.get(var1);
   }

   public void clearExtraData() {
      if (this.f7000 != null) {
         this.f7000.clear();
      }
   }

   public Object getDataOrDefault(RenderStateDataKey var1, Object var2) {
      return this.f7000 == null ? var2 : this.f7000.getOrDefault(var1, var2);
   }
}
