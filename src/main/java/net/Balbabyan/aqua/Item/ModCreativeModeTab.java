package net.Balbabyan.aqua.Item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab Grass_TAB = new CreativeModeTab("Grass Tab"){
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModeItems.GR.get());
        }
    };
}
