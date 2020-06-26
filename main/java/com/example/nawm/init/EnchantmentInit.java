package com.example.nawm.init;

import com.example.nawm.AnimeWeaponsMod;
import com.example.nawm.enchantments.Amaterasu;
import com.example.nawm.enchantments.Bolt;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EnchantmentInit {
    public static final DeferredRegister<Enchantment> ENCHANTMENTS = new DeferredRegister<>(ForgeRegistries.ENCHANTMENTS, AnimeWeaponsMod.MOD_ID);

    public static final RegistryObject<Enchantment> AMATERASU = ENCHANTMENTS.register("amaterasu",
            () -> new Amaterasu(Enchantment.Rarity.VERY_RARE,EnchantmentType.CROSSBOW,
                    new EquipmentSlotType[]{EquipmentSlotType.CHEST.MAINHAND})
    );
}
