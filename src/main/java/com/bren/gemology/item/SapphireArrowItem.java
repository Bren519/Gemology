package com.bren.gemology.item;

import com.bren.gemology.world.entity.projectile.AmethystArrow;
import com.bren.gemology.world.entity.projectile.SapphireArrow;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ArrowItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.Level;

public class SapphireArrowItem extends ArrowItem {
    public final float damage;

    public SapphireArrowItem(Properties p_40512_, float damage) {
        super(p_40512_);
        this.damage = damage;
    }

    @Override
    public AbstractArrow createArrow(Level p_40513_, ItemStack p_40514_, LivingEntity p_40515_) {
        SapphireArrow arrow = new SapphireArrow(p_40515_, p_40513_);
        arrow.setBaseDamage(this.damage);
        return arrow;
    }

    @Override
    public boolean isInfinite(ItemStack stack, ItemStack bow, Player player) {
        int enchant = net.minecraft.world.item.enchantment.EnchantmentHelper.getItemEnchantmentLevel(Enchantments.INFINITY_ARROWS, bow);
        return enchant <= 0 ? false : this.getClass() == SapphireArrowItem.class;
    }
}
