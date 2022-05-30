package com.bren.gemology.client;

import com.bren.gemology.Gemology;
import com.bren.gemology.client.renderer.entity.AmethystArrowRenderer;
import com.bren.gemology.client.renderer.entity.RubyArrowRenderer;
import com.bren.gemology.client.renderer.entity.SapphireArrowRenderer;
import com.bren.gemology.client.renderer.entity.TopazArrowRenderer;
import com.bren.gemology.world.entity.ModEntityType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Gemology.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientModEventSubscriber {
    @SubscribeEvent
    public static void onClientSetup(EntityRenderersEvent.RegisterRenderers event){
        event.registerEntityRenderer(ModEntityType.AMETHYST_ARROW.get(), AmethystArrowRenderer::new);
        event.registerEntityRenderer(ModEntityType.SAPPHIRE_ARROW.get(), SapphireArrowRenderer::new);
        event.registerEntityRenderer(ModEntityType.RUBY_ARROW.get(), RubyArrowRenderer::new);
        event.registerEntityRenderer(ModEntityType.TOPAZ_ARROW.get(), TopazArrowRenderer::new);
    }

}
