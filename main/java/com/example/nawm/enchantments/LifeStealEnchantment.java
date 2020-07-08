package com.example.nawm.enchantments;

import com.example.nawm.init.ItemInit;
import com.example.nawm.objects.items.tools.Scythe;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;

public class LifeStealEnchantment extends Enchantment {
    public LifeStealEnchantment() {
        super(Enchantment.Rarity.VERY_RARE, EnchantmentType.create("scythe", item -> item.equals(ItemInit.SCYTHE.get())),
                new EquipmentSlotType[]{EquipmentSlotType.CHEST.MAINHAND});
    }

    @Override
    public int getMinLevel() {
        return 1;
    }

    @Override
    public boolean isAllowedOnBooks() {
        return true;
    }

    @Override
    public void onEntityDamaged(LivingEntity user, Entity target, int level) {
        user.heal(1.0f);
    }
}
