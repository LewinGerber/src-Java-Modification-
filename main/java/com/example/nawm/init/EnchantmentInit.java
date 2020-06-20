package com.example.nawm.init;

import com.example.nawm.AnimeWeaponsMod;
import com.example.nawm.enchantments.Thunder;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EnchantmentInit {
    public static final DeferredRegister<Enchantment> ENCHANTMENTS = new DeferredRegister<>(ForgeRegistries.ENCHANTMENTS, AnimeWeaponsMod.MOD_ID);

    public static final RegistryObject<Enchantment> THUNDER = ENCHANTMENTS.register("thunder",
            () -> new Thunder(Enchantment.Rarity.VERY_RARE, EnchantmentType.WEAPON,
                    new EquipmentSlotType[]{EquipmentSlotType.MAINHAND})
    );
}
