package com.example.nawm.init;

import com.example.nawm.AnimeWeaponsMod;
import com.example.nawm.objects.items.*;
import com.example.nawm.objects.items.foods.MagicMushroom;
import com.example.nawm.objects.items.special.*;
import com.example.nawm.objects.items.tools.AdventureSword;
import com.example.nawm.objects.items.tools.LightningSword;
import net.minecraft.item.Item;
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
    public static final Item ice_castle = null;
    public static final Item adventure_sword = null;
    public static final Item lightning_sword = null;
    public static final Item magic_mushroom = null;
    public static final Item thunder = null;
    public static final Item rain = null;
    public static final Item wind = null;
    public static final Item day = null;
    public static final Item night = null;
    public static final Item azure_helmet = null;
    public static final Item azure_chestplate = null;
    public static final Item azure_leggings = null;
    public static final Item azure_boots = null;

    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event) {
        //items
        event.getRegistry().register(new BasicItem().setRegistryName("basic_item"));
        event.getRegistry().register(new IceCastle().setRegistryName("ice_castle"));
        event.getRegistry().register(new Thunder().setRegistryName("thunder"));
        event.getRegistry().register(new Rain().setRegistryName("rain"));
        event.getRegistry().register(new Wind().setRegistryName("wind"));
        event.getRegistry().register(new Day().setRegistryName("day"));
        event.getRegistry().register(new Night().setRegistryName("night"));

        //armor

        //tools
        event.getRegistry().register(new AdventureSword().setRegistryName("adventure_sword"));
        event.getRegistry().register(new LightningSword().setRegistryName("lightning_sword"));

        //food
        event.getRegistry().register(new MagicMushroom().setRegistryName("magic_mushroom"));

    }
}
