package com.example.nawm.objects.items.tools;

import com.example.nawm.AnimeWeaponsMod;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;

public class Scythe extends SwordItem {
    public Scythe() {
        super(ToolTier.AdventureTier.ADVENTURE, 7, 5.0F, new Item.Properties().group(AnimeWeaponsMod.AnimeItemGroup.instance));
    }
}
