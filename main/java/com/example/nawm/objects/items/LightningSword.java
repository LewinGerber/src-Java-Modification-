package com.example.nawm.objects.items;

import com.example.nawm.AnimeWeaponsMod;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;

public class LightningSword extends SwordItem {
    public LightningSword() {
        super(ToolTier.BoltTier.BOLT, 7, 5.0F, new Item.Properties().group(AnimeWeaponsMod.AnimeItemGroup.instance));
    }
}
