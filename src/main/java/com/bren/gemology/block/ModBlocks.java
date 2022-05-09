package com.bren.gemology.block;

import com.bren.gemology.Gemology;
import com.bren.gemology.block.buds.BuddingRubyBlock;
import com.bren.gemology.block.buds.BuddingSapphireBlock;
import com.bren.gemology.block.buds.BuddingTopazBlock;
import com.bren.gemology.item.ModItemGroup;
import com.bren.gemology.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.AmethystClusterBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
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
    public static final RegistryObject<Block> SAPPHIRE_ORE = registerBlock("sapphire_ore", ()-> new Block(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).color(MaterialColor.COLOR_BLUE)));
    public static final RegistryObject<Block> RUBY_ORE = registerBlock("ruby_ore", ()-> new Block(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).color(MaterialColor.COLOR_RED)));
    public static final RegistryObject<Block> TOPAZ_ORE = registerBlock("topaz_ore", ()-> new Block(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).color(MaterialColor.COLOR_YELLOW)));
    public static final RegistryObject<Block> SAPPHIRE_BUDDING_ORE = registerBlock("budding_sapphire", ()-> new BuddingSapphireBlock(BlockBehaviour.Properties.copy(Blocks.BUDDING_AMETHYST).color(MaterialColor.COLOR_BLUE)));
    public static final RegistryObject<Block> RUBY_BUDDING_ORE = registerBlock("budding_ruby", ()-> new BuddingRubyBlock(BlockBehaviour.Properties.copy(Blocks.BUDDING_AMETHYST).color(MaterialColor.COLOR_RED)));
    public static final RegistryObject<Block> TOPAZ_BUDDING_ORE = registerBlock("budding_topaz", ()-> new BuddingTopazBlock(BlockBehaviour.Properties.copy(Blocks.BUDDING_AMETHYST).color(MaterialColor.COLOR_YELLOW)));

    public static final RegistryObject<Block> POLISHED_AMETHYST = registerBlock("amethyst_block", ()->
            new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK)
                    .sound(SoundType.AMETHYST)
                    .color(MaterialColor.COLOR_PURPLE)
            ));
    public static final RegistryObject<Block> POLISHED_SAPPHIRE = registerBlock("sapphire_block", ()->
            new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK)
                    .sound(SoundType.AMETHYST)
                    .color(MaterialColor.COLOR_BLUE)
            ));
    public static final RegistryObject<Block> POLISHED_RUBY = registerBlock("ruby_block", ()->
            new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK)
                    .sound(SoundType.AMETHYST)
                    .color(MaterialColor.COLOR_RED)
            ));
    public static final RegistryObject<Block> POLISHED_TOPAZ = registerBlock("topaz_block", ()->
            new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK)
                    .sound(SoundType.AMETHYST)
                    .color(MaterialColor.COLOR_YELLOW)
            ));
    public static final RegistryObject<Block> SAPPHIRE_CLUSTER = registerBlock("sapphire_cluster", ()-> new AmethystClusterBlock(7, 3, BlockBehaviour.Properties.copy(Blocks.AMETHYST_CLUSTER).color(MaterialColor.COLOR_BLUE)));
    public static final RegistryObject<Block> LARGE_SAPPHIRE_BUD = registerBlock("large_sapphire_bud", ()-> new AmethystClusterBlock(5, 3, BlockBehaviour.Properties.copy(Blocks.LARGE_AMETHYST_BUD).color(MaterialColor.COLOR_BLUE)));
    public static final RegistryObject<Block> MEDIUM_SAPPHIRE_BUD = registerBlock("medium_sapphire_bud", ()-> new AmethystClusterBlock(4, 3, BlockBehaviour.Properties.copy(Blocks.MEDIUM_AMETHYST_BUD).color(MaterialColor.COLOR_BLUE)));
    public static final RegistryObject<Block> SMALL_SAPPHIRE_BUD = registerBlock("small_sapphire_bud", ()-> new AmethystClusterBlock(3, 4, BlockBehaviour.Properties.copy(Blocks.SMALL_AMETHYST_BUD).color(MaterialColor.COLOR_BLUE)));
    public static final RegistryObject<Block> RUBY_CLUSTER = registerBlock("ruby_cluster", ()-> new AmethystClusterBlock(7, 3, BlockBehaviour.Properties.copy(Blocks.AMETHYST_CLUSTER).color(MaterialColor.COLOR_RED)));
    public static final RegistryObject<Block> LARGE_RUBY_BUD = registerBlock("large_ruby_bud", ()-> new AmethystClusterBlock(5, 3, BlockBehaviour.Properties.copy(Blocks.LARGE_AMETHYST_BUD).color(MaterialColor.COLOR_RED)));
    public static final RegistryObject<Block> MEDIUM_RUBY_BUD = registerBlock("medium_ruby_bud", ()-> new AmethystClusterBlock(4, 3, BlockBehaviour.Properties.copy(Blocks.MEDIUM_AMETHYST_BUD).color(MaterialColor.COLOR_RED)));
    public static final RegistryObject<Block> SMALL_RUBY_BUD = registerBlock("small_ruby_bud", ()-> new AmethystClusterBlock(3, 4, BlockBehaviour.Properties.copy(Blocks.SMALL_AMETHYST_BUD).color(MaterialColor.COLOR_RED)));
    public static final RegistryObject<Block> TOPAZ_CLUSTER = registerBlock("topaz_cluster", ()-> new AmethystClusterBlock(7, 3, BlockBehaviour.Properties.copy(Blocks.AMETHYST_CLUSTER).color(MaterialColor.COLOR_YELLOW)));
    public static final RegistryObject<Block> LARGE_TOPAZ_BUD = registerBlock("large_topaz_bud", ()-> new AmethystClusterBlock(5, 3, BlockBehaviour.Properties.copy(Blocks.LARGE_AMETHYST_BUD).color(MaterialColor.COLOR_YELLOW)));
    public static final RegistryObject<Block> MEDIUM_TOPAZ_BUD = registerBlock("medium_topaz_bud", ()-> new AmethystClusterBlock(4, 3, BlockBehaviour.Properties.copy(Blocks.MEDIUM_AMETHYST_BUD).color(MaterialColor.COLOR_YELLOW)));
    public static final RegistryObject<Block> SMALL_TOPAZ_BUD = registerBlock("small_topaz_bud", ()-> new AmethystClusterBlock(3, 4, BlockBehaviour.Properties.copy(Blocks.SMALL_AMETHYST_BUD).color(MaterialColor.COLOR_YELLOW)));


}
