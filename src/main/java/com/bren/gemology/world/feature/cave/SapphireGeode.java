package com.bren.gemology.world.feature.cave;

import com.bren.gemology.block.ModBlocks;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.GeodeBlockSettings;
import net.minecraft.world.level.levelgen.GeodeCrackSettings;
import net.minecraft.world.level.levelgen.GeodeLayerSettings;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.GeodeFeature;
import net.minecraft.world.level.levelgen.feature.configurations.GeodeConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;

import java.util.ArrayList;
import java.util.List;

public class SapphireGeode {
    public static void registerSG() {
        List<net.minecraft.world.level.block.state.BlockState> l = new ArrayList();
        l.add(Blocks.SMALL_AMETHYST_BUD.defaultBlockState());
        l.add(Blocks.MEDIUM_AMETHYST_BUD.defaultBlockState());
        l.add(Blocks.LARGE_AMETHYST_BUD.defaultBlockState());
        l.add(Blocks.AMETHYST_CLUSTER.defaultBlockState());



        GeodeConfiguration gc = new GeodeConfiguration(
                new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                        BlockStateProvider.simple(ModBlocks.SAPPHIRE_ORE.get()),
                        BlockStateProvider.simple(Blocks.BUDDING_AMETHYST),
                        BlockStateProvider.simple(Blocks.CALCITE),
                        BlockStateProvider.simple(Blocks.SMOOTH_BASALT),
                        l,
                        BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D),
                new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D,
                0.083D, true, UniformInt.of(4, 6),
                UniformInt.of(3, 4), UniformInt.of(1, 2),
                -16, 16, 0.05D, 1);
        FeatureUtils.register("sapphire_geode", Feature.GEODE, gc);
    }



    /*
    public SapphireGeode(Codec<GeodeConfiguration> p_159834_) {


        List<net.minecraft.world.level.block.state.BlockState> l = new ArrayList();
        l.add(Blocks.SMALL_AMETHYST_BUD.defaultBlockState());
        l.add(Blocks.MEDIUM_AMETHYST_BUD.defaultBlockState());
        l.add(Blocks.LARGE_AMETHYST_BUD.defaultBlockState());
        l.add(Blocks.AMETHYST_CLUSTER.defaultBlockState());

        GeodeConfiguration gc = new GeodeConfiguration(
                new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                        BlockStateProvider.simple(Blocks.AMETHYST_BLOCK),
                        BlockStateProvider.simple(Blocks.BUDDING_AMETHYST),
                        BlockStateProvider.simple(Blocks.CALCITE),
                        BlockStateProvider.simple(Blocks.SMOOTH_BASALT),
                        l,
                        BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D),
                new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D,
                0.083D, true, UniformInt.of(4, 6),
                UniformInt.of(3, 4), UniformInt.of(1, 2),
                -16, 16, 0.05D, 1);
        super(gc);
    }*/
}
