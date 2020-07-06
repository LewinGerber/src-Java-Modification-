package com.example.nawm.objects.items.tools;

import com.example.nawm.AnimeWeaponsMod;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.item.*;
import net.minecraft.stats.Stats;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;

import java.util.function.Predicate;

/**
 * @author Simon TObler
 * @version 26.06.2020
 */
public class AmaterasuBow extends BowItem {
    // muss sound effekt von amaterasu einfügen
    public AmaterasuBow() {
        super(new Item.Properties().maxDamage(8).group(AnimeWeaponsMod.AnimeItemGroup.instance));
    }

}
