package com.bren.gemology.client.renderer.entity;

import com.bren.gemology.Gemology;
import com.bren.gemology.world.entity.projectile.AmethystArrow;
import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class AmethystArrowRenderer extends ArrowRenderer<AmethystArrow> {
    public AmethystArrowRenderer(EntityRendererProvider.Context p_173917_) {
        super(p_173917_);
    }

    @Override
    public ResourceLocation getTextureLocation(AmethystArrow p_114482_) {
        Item referenceItem = p_114482_.getPickupItem().getItem();
        return new ResourceLocation(Gemology.MOD_ID, "textures/entity/projectiles/" + referenceItem.getRegistryName().getPath() + ".png");
    }
}
