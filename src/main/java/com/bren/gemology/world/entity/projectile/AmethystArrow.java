package com.bren.gemology.world.entity.projectile;

import com.bren.gemology.item.ModItems;
import com.bren.gemology.world.entity.ModEntityType;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class AmethystArrow extends AbstractArrow {

    private final Item itemRef;

    public AmethystArrow(EntityType<? extends AmethystArrow> p_36721_, Level p_36722_) {
        super(p_36721_, p_36722_);
        this.itemRef = ModItems.AMETHYST_TIPPED_ARROW.get();
    }

    public AmethystArrow(LivingEntity p_36718_, Level p_36719_) {
        super(ModEntityType.AMETHYST_ARROW.get(), p_36718_, p_36719_);
        this.itemRef = ModItems.AMETHYST_TIPPED_ARROW.get();
    }

    @Override
    public ItemStack getPickupItem() {
        return new ItemStack(this.itemRef);
    }
}
