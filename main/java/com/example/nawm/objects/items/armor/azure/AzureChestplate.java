package com.example.nawm.objects.items.armor.azure;

import com.example.nawm.AnimeWeaponsMod;
import com.example.nawm.objects.items.armor.ArmorBase;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;

public class AzureChestplate extends ArmorItem {
    public AzureChestplate() {
        super(ArmorBase.ModArmorMaterial.AZURE, EquipmentSlotType.CHEST, new Item.Properties().group(AnimeWeaponsMod.AnimeItemGroup.instance));
    }
}
