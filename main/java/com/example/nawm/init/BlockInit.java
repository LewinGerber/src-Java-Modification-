package com.example.nawm.init;

import com.example.nawm.AnimeWeaponsMod;
import com.example.nawm.objects.blocks.BasicBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

/**
 * @author Lewin Gerber
 * @version 18.06.2020
 * nAWM
 */
@ObjectHolder(AnimeWeaponsMod.MOD_ID)
@Mod.EventBusSubscriber(modid = AnimeWeaponsMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class BlockInit {
    public static final Block basic_block = null;

    //blocks
    @SubscribeEvent
    public static void registerBlock(final RegistryEvent.Register<Block> event){
        event.getRegistry().register(new BasicBlock().setRegistryName("basic_block"));
    }

    //block item
    @SubscribeEvent
    public static void registerBlockItems(final RegistryEvent.Register<Item> event){
        event.getRegistry().register(new BlockItem(basic_block, new Item.Properties().group(ItemGroup.MATERIALS)).setRegistryName("basic_block"));
    }
}
