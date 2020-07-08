package com.example.nawm.objects.blocks.seeds;

import com.example.nawm.AnimeWeaponsMod;
import com.example.nawm.init.BlockInit;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class MagicMushroomSeeds extends BlockItem {
    public MagicMushroomSeeds() {
        super(BlockInit.MAGIC_MUSHROOM_CROP.get(), new Item.Properties().group(AnimeWeaponsMod.AnimeItemGroup.instance));
    }
}
