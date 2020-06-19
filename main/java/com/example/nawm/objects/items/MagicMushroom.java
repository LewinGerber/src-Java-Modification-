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


/**
 * @author Simon TObler
 * @version 19.06.2020
 */
public class MagicMushroom extends Item{
    public MagicMushroom() {
        super(new Item.Properties().group(AnimeWeaponsMod.AnimeItemGroup.instance).food(new Food.Builder().hunger(6)
                .saturation(1.2f).setAlwaysEdible().effect(new EffectInstance(Effects.ABSORPTION, 4500, 4), 1)
                .effect(new EffectInstance(Effects.JUMP_BOOST,4500,4),1)
                .effect(new EffectInstance(Effects.SPEED,4500,4),1).build()));
        //Hello World 2.0
        ;
    }
}
