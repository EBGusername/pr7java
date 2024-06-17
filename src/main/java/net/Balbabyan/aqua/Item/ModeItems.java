package net.Balbabyan.aqua.Item;


import net.Balbabyan.aqua.aqua;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;
import net.minecraftforge.registries.RegistryObject;

public class ModeItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, aqua.MOD_ID);
    public static final RegistryObject<Item> FISH = ITEMS.register("grass",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.Grass_TAB)));
    public static final RegistryObject<Item> GR = ITEMS.register("grass1",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.Grass_TAB)));
    public static final RegistryObject<Item> GRA = ITEMS.register("grass2",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.Grass_TAB)));
    public static final RegistryObject<Item> GRASS = ITEMS.register("grass3",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.Grass_TAB)));
    public static void register (IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
