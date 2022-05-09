package com.bren.gemology.world.gen;

import com.bren.gemology.world.feature.ModPlacedFeatures;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.CaveFeatures;
import net.minecraft.data.worldgen.placement.CavePlacements;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import java.util.List;
import java.util.Set;


public class ModCaveGeneration {
    public static void generateGeodes(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        List<Holder<PlacedFeature>> base = event.getGeneration().getFeatures(GenerationStep.Decoration.RAW_GENERATION);
        List<Holder<PlacedFeature>> base2 = event.getGeneration().getFeatures(GenerationStep.Decoration.LOCAL_MODIFICATIONS);
        if(base2.size() > 0){
            for(Holder<PlacedFeature> feature: base2){
                if (feature.toString().contains("amethyst_geode")) {
                    base2.remove(feature);
                    break;
                }
            }
        }
        //base.add(ModPlacedFeatures.SAPPHIRE_GEODE);
        base.add(ModPlacedFeatures.AMETHYST_GEODE);
        base.add(ModPlacedFeatures.SAPPHIRE_GEODE);
        base.add(ModPlacedFeatures.RUBY_GEODE);
        base.add(ModPlacedFeatures.TOPAZ_GEODE);

    }
}
