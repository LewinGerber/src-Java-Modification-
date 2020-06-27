package com.example.nawm.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;

/**
 * @author Lewin Gerber
 * @version 26.06.2020
 * nAWM
 */
public class ExplosionEnchantment extends Enchantment {
    public ExplosionEnchantment (Rarity rarityIn, EnchantmentType typeIn, EquipmentSlotType[] slots) {
        super(rarityIn, typeIn, slots);
    }

    @Override
    public void onEntityDamaged(LivingEntity user, Entity target, int level) {
        super.onEntityDamaged(user, target, level);
        World world = target.getEntityWorld();
        world.createExplosion(target, target.getPosX(), target.getPosY(), target.getPosZ(), 3, Explosion.Mode.NONE);
    }

    @Override
    public void onUserHurt(LivingEntity user, Entity attacker, int level) {
        super.onUserHurt(user, attacker, level);
        attacker.setSwimming(true);
    }
}
