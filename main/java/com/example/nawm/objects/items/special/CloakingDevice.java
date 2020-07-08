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
 * @version 08.07.2020
 * nAWM
 */
public class CloakingDevice extends Item {

    public CloakingDevice() {
        super(new Properties().group(AnimeWeaponsMod.AnimeItemGroup.instance));
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {

        return super.onItemRightClick(worldIn, playerIn, handIn);
    }
}
