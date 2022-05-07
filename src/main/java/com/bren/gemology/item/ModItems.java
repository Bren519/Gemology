package com.bren.gemology.item;

import com.bren.gemology.Gemology;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Gemology.MOD_ID); //List of all the mod's items

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
