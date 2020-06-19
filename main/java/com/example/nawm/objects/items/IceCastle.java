package com.example.nawm.objects.items;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

/**
 * @author Lewin Gerber
 * @version 19.06.2020
 * nAWM
 */

public class IceCastle extends Item {
    public IceCastle() {
        super(new Properties().group(ItemGroup.TRANSPORTATION).maxStackSize(1));
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        double posX = playerIn.getPosX();
        double posY = playerIn.getPosY();
        double posZ = playerIn.getPosZ();

        worldIn.setBlockState(new BlockPos(posX, posY,posZ), Blocks.PACKED_ICE.getDefaultState());
        //cross shape
        worldIn.setBlockState(new BlockPos(posX+1, posY,posZ), Blocks.PACKED_ICE.getDefaultState());
        worldIn.setBlockState(new BlockPos(posX-1, posY,posZ), Blocks.PACKED_ICE.getDefaultState());
        worldIn.setBlockState(new BlockPos(posX, posY,posZ+1), Blocks.PACKED_ICE.getDefaultState());
        worldIn.setBlockState(new BlockPos(posX, posY,posZ-1), Blocks.PACKED_ICE.getDefaultState());

        return super.onItemRightClick(worldIn, playerIn, handIn);
    }
}
