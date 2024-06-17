package net.Balbabyan.aqua.block;

import com.mojang.blaze3d.shaders.Uniform;
import net.Balbabyan.aqua.Item.ModCreativeModeTab;
import net.Balbabyan.aqua.Item.ModeItems;
import net.Balbabyan.aqua.aqua;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SupportType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCK =
            DeferredRegister.create(ForgeRegistries.BLOCKS, aqua.MOD_ID);
    public static final RegistryObject<Block> GRASS_BLOCK = registryBlock("grass_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f).requiresCorrectToolForDrops()), ModCreativeModeTab.Grass_TAB);
    public static final RegistryObject<Block> GRASS_ORE = registryBlock("grass_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f).requiresCorrectToolForDrops(),
                    UniformInt.of(3,7)), ModCreativeModeTab.Grass_TAB);
    public static final RegistryObject<Block> DEEPSLATE_GRASS_ORE = registryBlock("deepslate_grass_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f).requiresCorrectToolForDrops(),
                    UniformInt.of(3,7)), ModCreativeModeTab.Grass_TAB);
    public static final RegistryObject<Block> PURPPLGRASS_BLOCK = registryBlock("purpplgrass",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f).requiresCorrectToolForDrops()), ModCreativeModeTab.Grass_TAB);
    public static <T extends Block>RegistryObject<T> registryBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturns = BLOCK.register(name,block);
        registryBlockItem(name, toReturns, tab);
        return toReturns;
    }
    public static <T extends Block> RegistryObject<Item> registryBlockItem(String name, RegistryObject<T> block,
                                                                           CreativeModeTab tab){
        return ModeItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }
    public static void register(IEventBus eventBus){
        BLOCK.register(eventBus);
    }
}