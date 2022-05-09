package com.bren.gemology.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.CaveFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;

public class ModPlacedFeatures {

    private static final int GemVarients = 4;
    private static final int rarity = 24 * GemVarients;

    public static final Holder<PlacedFeature> AMETHYST_GEODE = PlacementUtils.register("amethyst_gemology_geode",
            ModConfiguredFeatures.AMETHYST_CLUSTER, RarityFilter.onAverageOnceEvery(rarity), // DEFAULT 24
            InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(30)), BiomeFilter.biome());
    public static final Holder<PlacedFeature> SAPPHIRE_GEODE = PlacementUtils.register("sapphire_geode",
            ModConfiguredFeatures.SAPPHIRE_CLUSTER, RarityFilter.onAverageOnceEvery(rarity), // DEFAULT 24
            InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(30)), BiomeFilter.biome());
    public static final Holder<PlacedFeature> RUBY_GEODE = PlacementUtils.register("ruby_geode",
            ModConfiguredFeatures.RUBY_CLUSTER, RarityFilter.onAverageOnceEvery(rarity), // DEFAULT 24
            InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(30)), BiomeFilter.biome());
    public static final Holder<PlacedFeature> TOPAZ_GEODE = PlacementUtils.register("topaz_geode",
            ModConfiguredFeatures.TOPAZ_CLUSTER, RarityFilter.onAverageOnceEvery(rarity), // DEFAULT 24
            InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(30)), BiomeFilter.biome());

}
