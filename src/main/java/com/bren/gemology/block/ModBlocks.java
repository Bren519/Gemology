package com.bren.gemology.block;

import com.bren.gemology.Gemology;
import com.bren.gemology.item.ModItemGroup;
import com.bren.gemology.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Gemology.MOD_ID);

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> output = BLOCKS.register(name, block);
        registerBlockItem(name, output);
        return output;
    }
    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block){
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()
                .tab(ModItemGroup.GEMOLOGY_GROUP)
        ));
    }

    //BLOCKS
    public static final RegistryObject<Block> SAPPHIRE_BLOCK = registerBlock("sapphire_ore", ()->
            new Block(BlockBehaviour.Properties.of(Material.AMETHYST, MaterialColor.COLOR_BLUE)
                    .sound(SoundType.AMETHYST)
                    .requiresCorrectToolForDrops()
                    .strength(1)
            ));

}
