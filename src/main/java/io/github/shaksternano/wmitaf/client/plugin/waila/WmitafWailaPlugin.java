package io.github.shaksternano.wmitaf.client.plugin.waila;

import mcp.mobius.waila.api.IRegistrar;
import mcp.mobius.waila.api.IWailaPlugin;
import mcp.mobius.waila.api.TooltipPosition;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.network.OtherClientPlayerEntity;
import net.minecraft.entity.ItemEntity;

@SuppressWarnings("unused")
@Environment(EnvType.CLIENT)
public final class WmitafWailaPlugin implements IWailaPlugin {

    // Registers the overrides.
    @Override
    public void register(IRegistrar registrar) {
        registrar.addEventListener(ItemStackListener.INSTANCE);
        registrar.addComponent(ItemEntityProvider.INSTANCE, TooltipPosition.TAIL, ItemEntity.class);
        registrar.addComponent(OtherClientPlayerEntityProvider.INSTANCE, TooltipPosition.HEAD, OtherClientPlayerEntity.class);
        registrar.addComponent(OtherClientPlayerEntityProvider.INSTANCE, TooltipPosition.TAIL, OtherClientPlayerEntity.class);
    }
}
