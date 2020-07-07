package com.example.nawm.init;

import com.example.nawm.AnimeWeaponsMod;
import com.example.nawm.enchantments.AmaterasuEnchantment;
import com.example.nawm.enchantments.ExplosionEnchantment;
import com.example.nawm.enchantments.LifeStealEnchantment;
import net.minecraft.enchantment.Enchantment;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EnchantmentInit {
    public static final DeferredRegister<Enchantment> ENCHANTMENTS = new DeferredRegister<>(ForgeRegistries.ENCHANTMENTS, AnimeWeaponsMod.MOD_ID);

    public static final RegistryObject<Enchantment> AMATERASU = ENCHANTMENTS
            .register("amaterasu", () -> new AmaterasuEnchantment());

    public static final RegistryObject<Enchantment> EXPLOSION = ENCHANTMENTS
            .register("explosion", () -> new ExplosionEnchantment());

    public static final RegistryObject<Enchantment> LIFE_STEAL = ENCHANTMENTS
            .register("life_steal", () -> new LifeStealEnchantment());
}
