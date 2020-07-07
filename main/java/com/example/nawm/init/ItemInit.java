package com.example.nawm.init;

import com.example.nawm.AnimeWeaponsMod;
import com.example.nawm.entities.kappa_creeper.KappaCreeperEntity;
import com.example.nawm.objects.items.armor.azure.AzureBoots;
import com.example.nawm.objects.items.armor.azure.AzureChestplate;
import com.example.nawm.objects.items.armor.azure.AzureHelmet;
import com.example.nawm.objects.items.armor.azure.AzureLeggings;
import com.example.nawm.objects.items.foods.MagicMushroom;
import com.example.nawm.objects.items.material.Azure;
import com.example.nawm.objects.items.special.*;
import com.example.nawm.objects.items.tools.AdventureSword;
import com.example.nawm.objects.items.tools.AmaterasuBow;
import com.example.nawm.objects.items.tools.Scythe;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.ObjectHolder;

/**
 * @author Lewin Gerber, Elias Mehran, Simon Tobler
 * @version 16.06.2020
 * (n)AWM
 */


public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, AnimeWeaponsMod.MOD_ID);

    //misc
    public static final RegistryObject<Item> BASIC_ITEM = ITEMS.register("basic_item", () -> new BasicItem());
    public static final RegistryObject<Item> ICE_CASTLE = ITEMS.register("ice_castle", () -> new IceCastle());

    //misc -> AZURE
    public static final RegistryObject<Item> THUNDER = ITEMS.register("thunder", () -> new Thunder());
    public static final RegistryObject<Item> WIND = ITEMS.register("wind", () -> new Wind());
    public static final RegistryObject<Item> RAIN = ITEMS.register("rain", () -> new Rain());
    public static final RegistryObject<Item> DAY = ITEMS.register("day", () -> new Day());
    public static final RegistryObject<Item> NIGHT = ITEMS.register("night", () -> new Night());
    public static final RegistryObject<Item> AZURE = ITEMS.register("azure", () -> new Azure());

    //food
    public static final RegistryObject<Item> MAGIC_MUSHROOM = ITEMS.register("magic_mushroom", () -> new MagicMushroom());

    //armor
    public static final RegistryObject<Item> AZURE_HELMET = ITEMS.register("azure_helmet", () -> new AzureHelmet());
    public static final RegistryObject<Item> AZURE_CHESTPLATE = ITEMS.register("azure_chestplate", () -> new AzureChestplate());
    public static final RegistryObject<Item> AZURE_LEGGINGS = ITEMS.register("azure_leggings", () -> new AzureLeggings());
    public static final RegistryObject<Item> AZURE_BOOTS = ITEMS.register("azure_boots", () -> new AzureBoots());

    //tools
    public static final RegistryObject<Item> ADVENTURE_SWORD = ITEMS.register("adventure_sword", () -> new AdventureSword());
    public static final RegistryObject<Item> SCYTHE = ITEMS.register("scythe", () -> new Scythe());
    public static final RegistryObject<Item> AMATERASU_BOW = ITEMS.register("amaterasu_bow", () -> new AmaterasuBow());
}
