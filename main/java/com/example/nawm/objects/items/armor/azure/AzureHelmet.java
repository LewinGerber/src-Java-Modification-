package com.example.nawm.objects.items.armor.azure;

import com.example.nawm.AnimeWeaponsMod;
import com.example.nawm.objects.items.armor.ArmorBase;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;

public class AzureHelmet extends ArmorItem {
    public AzureHelmet() {
    super(ArmorBase.ModArmorMaterial.AZURE, EquipmentSlotType.HEAD, new Item.Properties().group(AnimeWeaponsMod.AnimeItemGroup.instance));
    }
}
