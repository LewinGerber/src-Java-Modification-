package com.example.nawm.init;

import com.example.nawm.AnimeWeaponsMod;
import com.example.nawm.objects.items.BasicItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

/**
 * @author Lewin Gerber
 * @version 14.06.2020
 * (n)AWM
 */

@Mod.EventBusSubscriber(modid = AnimeWeaponsMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(AnimeWeaponsMod.MOD_ID)
public class ItemInit {

    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new BasicItem().setRegistryName("basic_item"));
    }
}
