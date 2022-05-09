package com.bren.gemology.world.feature;

import com.bren.gemology.block.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.GeodeBlockSettings;
import net.minecraft.world.level.levelgen.GeodeCrackSettings;
import net.minecraft.world.level.levelgen.GeodeLayerSettings;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.GeodeConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RandomFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;

import java.util.Arrays;

public class ModConfiguredFeatures
{
    public static final Holder<ConfiguredFeature<GeodeConfiguration, ?>> AMETHYST_CLUSTER =
            FeatureUtils.register("amethyst_gemology_geode", Feature.GEODE, new GeodeConfiguration(
                    new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                            BlockStateProvider.simple(Blocks.AMETHYST_BLOCK),
                            BlockStateProvider.simple(Blocks.BUDDING_AMETHYST),
                            BlockStateProvider.simple(Blocks.CALCITE),
                            BlockStateProvider.simple(Blocks.SMOOTH_BASALT),
                            Arrays.asList(
                                    Blocks.SMALL_AMETHYST_BUD.defaultBlockState(),
                                    Blocks.MEDIUM_AMETHYST_BUD.defaultBlockState(),
                                    Blocks.LARGE_AMETHYST_BUD.defaultBlockState(),
                                    Blocks.AMETHYST_CLUSTER.defaultBlockState()
                            ),
                            BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                    new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D),
                    new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D,
                    0.083D, true, UniformInt.of(4, 6),
                    UniformInt.of(3, 4), UniformInt.of(1, 2),
                    -16, 16, 0.05D, 1)
            );

    public static final Holder<ConfiguredFeature<GeodeConfiguration, ?>> SAPPHIRE_CLUSTER =
            FeatureUtils.register("sapphire_geode", Feature.GEODE, new GeodeConfiguration(
                    new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                            BlockStateProvider.simple(ModBlocks.SAPPHIRE_ORE.get()),
                            BlockStateProvider.simple(ModBlocks.SAPPHIRE_BUDDING_ORE.get()),
                            BlockStateProvider.simple(Blocks.CALCITE),
                            BlockStateProvider.simple(Blocks.SMOOTH_BASALT),
                            Arrays.asList(
                                    Blocks.SMALL_AMETHYST_BUD.defaultBlockState(),
                                    Blocks.MEDIUM_AMETHYST_BUD.defaultBlockState(),
                                    Blocks.LARGE_AMETHYST_BUD.defaultBlockState(),
                                    ModBlocks.SAPPHIRE_CLUSTER.get().defaultBlockState()
                                    ),
                            BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                    new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D),
                    new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D,
                    0.083D, true, UniformInt.of(4, 6),
                    UniformInt.of(3, 4), UniformInt.of(1, 2),
                    -16, 16, 0.05D, 1)
            );

    public static final Holder<ConfiguredFeature<GeodeConfiguration, ?>> RUBY_CLUSTER =
            FeatureUtils.register("ruby_geode", Feature.GEODE, new GeodeConfiguration(
                    new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                            BlockStateProvider.simple(ModBlocks.RUBY_ORE.get()),
                            BlockStateProvider.simple(ModBlocks.RUBY_BUDDING_ORE.get()),
                            BlockStateProvider.simple(Blocks.CALCITE),
                            BlockStateProvider.simple(Blocks.SMOOTH_BASALT),
                            Arrays.asList(
                                    Blocks.SMALL_AMETHYST_BUD.defaultBlockState(),
                                    Blocks.MEDIUM_AMETHYST_BUD.defaultBlockState(),
                                    Blocks.LARGE_AMETHYST_BUD.defaultBlockState(),
                                    ModBlocks.RUBY_CLUSTER.get().defaultBlockState()
                            ),
                            BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                    new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D),
                    new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D,
                    0.083D, true, UniformInt.of(4, 6),
                    UniformInt.of(3, 4), UniformInt.of(1, 2),
                    -16, 16, 0.05D, 1)
            );

    public static final Holder<ConfiguredFeature<GeodeConfiguration, ?>> TOPAZ_CLUSTER =
            FeatureUtils.register("topaz_geode", Feature.GEODE, new GeodeConfiguration(
                    new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                            BlockStateProvider.simple(ModBlocks.TOPAZ_ORE.get()),
                            BlockStateProvider.simple(ModBlocks.TOPAZ_BUDDING_ORE.get()),
                            BlockStateProvider.simple(Blocks.CALCITE),
                            BlockStateProvider.simple(Blocks.SMOOTH_BASALT),
                            Arrays.asList(
                                    Blocks.SMALL_AMETHYST_BUD.defaultBlockState(),
                                    Blocks.MEDIUM_AMETHYST_BUD.defaultBlockState(),
                                    Blocks.LARGE_AMETHYST_BUD.defaultBlockState(),
                                    ModBlocks.TOPAZ_CLUSTER.get().defaultBlockState()
                            ),
                            BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                    new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D),
                    new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D,
                    0.083D, true, UniformInt.of(4, 6),
                    UniformInt.of(3, 4), UniformInt.of(1, 2),
                    -16, 16, 0.05D, 1)
            );
}
