package com.bren.gemology.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModItemGroup {
    public static final CreativeModeTab GEMOLOGY_GROUP = new CreativeModeTab("Gemology"){

        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.SAPPHIRE.get());
        }
    };
}
