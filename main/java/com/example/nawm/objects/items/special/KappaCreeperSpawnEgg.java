package com.example.nawm.objects.items.special;

import com.example.nawm.AnimeWeaponsMod;
import com.example.nawm.entities.kappa_creeper.KappaCreeperEntity;
import com.example.nawm.init.ModEntityTypes;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;

/**
 * @author Lewin Gerber
 * @version 28.06.2020
 * nAWM
 */
public class KappaCreeperSpawnEgg extends SpawnEggItem {

    public KappaCreeperSpawnEgg() {
        super(
                ModEntityTypes.KAPPA_CREEPER.get(),
                0,
                2,
                new Properties().group(AnimeWeaponsMod.AnimeItemGroup.instance)
        );
    }
}
