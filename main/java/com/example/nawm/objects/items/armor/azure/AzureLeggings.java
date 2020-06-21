package com.example.nawm.objects.items.armor.azure;

import com.example.nawm.AnimeWeaponsMod;
import com.example.nawm.objects.items.armor.ArmorBase;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;

public class AzureLeggings extends ArmorItem {
    public AzureLeggings() {
        super(ArmorBase.ModArmorMaterial.AZURE, EquipmentSlotType.LEGS, new Item.Properties().group(AnimeWeaponsMod.AnimeItemGroup.instance));
    }
}
