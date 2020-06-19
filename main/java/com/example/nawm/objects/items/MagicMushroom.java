package com.example.nawm.objects.items;

import com.example.nawm.AnimeWeaponsMod;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

import static net.minecraft.potion.Effects.ABSORPTION;


/**
 * @author Simon TObler
 * @version 19.06.2020
 */
public class MagicMushroom  {
    public MagicMushroom() {
        //Hello World 2.0
        super(new Item.Properties().group(AnimeWeaponsMod.AnimeItemGroup.instance).food(new Builder().hunger(10).saturation(1.2f).meat().
                effect(new EffectInstance(ABSORPTION, 6000,5))));
    }
}
