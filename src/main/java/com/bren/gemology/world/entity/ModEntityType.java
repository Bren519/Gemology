package com.bren.gemology.world.entity;

import com.bren.gemology.Gemology;
import com.bren.gemology.world.entity.projectile.AmethystArrow;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntityType {
    public static final DeferredRegister<EntityType<?>> ENTITES = DeferredRegister.create(ForgeRegistries.ENTITIES, Gemology.MOD_ID);

    //public static final EntityType<Arrow> ARROW = register("arrow", EntityType.Builder.<Arrow>of(Arrow::new, MobCategory.MISC).sized(0.5F, 0.5F).clientTrackingRange(4).updateInterval(20));

    public static final RegistryObject<EntityType<AmethystArrow>> AMETHYST_ARROW = ENTITES.register("amethyst_arrow", ()-> EntityType.Builder.<AmethystArrow>of(AmethystArrow::new, MobCategory.MISC).sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build(new ResourceLocation(Gemology.MOD_ID, "amethyst_arrow").toString()));
    public static final RegistryObject<EntityType<AmethystArrow>> SAPPHIRE_ARROW = ENTITES.register("sapphire_arrow", ()-> EntityType.Builder.<AmethystArrow>of(AmethystArrow::new, MobCategory.MISC).sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build(new ResourceLocation(Gemology.MOD_ID, "sapphire_arrow").toString()));
    public static final RegistryObject<EntityType<AmethystArrow>> RUBY_ARROW = ENTITES.register("ruby_arrow", ()-> EntityType.Builder.<AmethystArrow>of(AmethystArrow::new, MobCategory.MISC).sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build(new ResourceLocation(Gemology.MOD_ID, "ruby_arrow").toString()));
    public static final RegistryObject<EntityType<AmethystArrow>> TOPAZ_ARROW = ENTITES.register("topaz_arrow", ()-> EntityType.Builder.<AmethystArrow>of(AmethystArrow::new, MobCategory.MISC).sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build(new ResourceLocation(Gemology.MOD_ID, "topaz_arrow").toString()));

    public static void register(IEventBus eventBus){
        ENTITES.register(eventBus);
    }
}
