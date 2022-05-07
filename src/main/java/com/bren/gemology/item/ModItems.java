package com.bren.gemology.item;

import com.bren.gemology.Gemology;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Gemology.MOD_ID); //List of all the mod's items
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

    //ITEMS
    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire", ()-> new Item(new Item.Properties()
            .tab(ModItemGroup.GEMOLOGY_GROUP)
    ));
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", ()-> new Item(new Item.Properties()
            .tab(ModItemGroup.GEMOLOGY_GROUP)
    ));
    public static final RegistryObject<Item> SAPPHIRE_CRYSTAL = ITEMS.register("sapphirecrystal", ()-> new Item(new Item.Properties()
            .tab(ModItemGroup.GEMOLOGY_GROUP)
    ));
    public static final RegistryObject<Item> RUBY_CRYSTAL = ITEMS.register("rubycrystal", ()-> new Item(new Item.Properties()
            .tab(ModItemGroup.GEMOLOGY_GROUP)
    ));

}
