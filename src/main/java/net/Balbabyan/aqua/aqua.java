package net.Balbabyan.aqua;

import com.mojang.logging.LogUtils;
import net.Balbabyan.aqua.Item.ModeItems;
import net.Balbabyan.aqua.block.ModBlocks;
import net.minecraft.client.renderer.block.ModelBlockRenderer;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(aqua.MOD_ID)
public class aqua
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "aqua";

    private static final Logger LOGGER = LogUtils.getLogger();

    public aqua()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModeItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        modEventBus.addListener(this::commonSetup);


        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }
    
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {

        }
    }
}
