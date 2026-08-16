package fun.crickclient.mixin;

import net.minecraft.client.render.entity.state.LivingEntityRenderState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import fun.crickclient.client.modules.impl.render.SeeInvisiblesRenderState;

@Mixin(LivingEntityRenderState.class)
public class LivingEntityRenderStateMixin implements SeeInvisiblesRenderState {

    @Unique
    private boolean crickclient$seeInvisiblesTarget;

    @Override
    public boolean crickclient$isSeeInvisiblesTarget() {
        return crickclient$seeInvisiblesTarget;
    }

    @Override
    public void crickclient$setSeeInvisiblesTarget(boolean value) {
        crickclient$seeInvisiblesTarget = value;
    }
}
