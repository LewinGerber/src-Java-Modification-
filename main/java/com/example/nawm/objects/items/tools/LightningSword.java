package com.example.nawm.objects.items.tools;

import com.example.nawm.AnimeWeaponsMod;
import com.example.nawm.objects.items.tools.ToolTier;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;

public class LightningSword extends SwordItem {
    public LightningSword() {
        super(ToolTier.BoltTier.BOLT, 7, 5.0F, new Item.Properties().group(AnimeWeaponsMod.AnimeItemGroup.instance));
    }
}
