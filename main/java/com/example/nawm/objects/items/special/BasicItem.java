package com.example.nawm.objects.items.special;

import com.example.nawm.AnimeWeaponsMod;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

/**
 * @author Lewin Gerber
 * @version 14.06.2020
 * newEdition
 */
public class BasicItem extends Item {
    public BasicItem() {
        //Hello World 2.0
        super(new Item.Properties().maxDamage(15).group(AnimeWeaponsMod.AnimeItemGroup.instance));

    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        playerIn.jump();
        playerIn.getHeldItem(handIn).damageItem(1, playerIn, (entity) -> entity.sendBreakAnimation(handIn));
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }
}
