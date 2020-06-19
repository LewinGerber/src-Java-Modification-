package com.example.nawm.init;

import com.example.nawm.AnimeWeaponsMod;
import com.example.nawm.objects.items.AdventureSword;
import com.example.nawm.objects.items.BasicItem;
import com.example.nawm.objects.items.ToolTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

/**
 * @author Lewin Gerber, Elias Mehran, Simon Tobler
 * @version 16.06.2020
 * (n)AWM
 */

@Mod.EventBusSubscriber(modid = AnimeWeaponsMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(AnimeWeaponsMod.MOD_ID)
public class ItemInit {

    public static final Item basic_item = null;
    public static final Item adventure_sword = null;

    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event) {
        //items
        event.getRegistry().register(new BasicItem().setRegistryName("basic_item"));

        //armor

        //tools
        event.getRegistry().register(new AdventureSword().setRegistryName("adventure_sword"));

        //food

    }
}
