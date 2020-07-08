package com.example.nawm.objects.items.special;

import com.example.nawm.AnimeWeaponsMod;
import com.example.nawm.init.SoundInit;
import net.minecraft.entity.passive.CowEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Effects;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.world.World;

/**
 * @author Lewin Gerber
 * @version 08.07.2020
 * nAWM
 */
public class Radar extends Item {
    public Radar(Properties properties) {
        super(new Properties().group(AnimeWeaponsMod.AnimeItemGroup.instance));
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        double posX = playerIn.getPosX();
        double posY = playerIn.getPosY();
        double posZ = playerIn.getPosZ();

        AxisAlignedBB aabb = new AxisAlignedBB(posX-20,posY-20 ,posZ-20, posX+20, posY+20, posZ+20);

        if(worldIn.getEntitiesWithinAABB(CowEntity.class, aabb) != null){
            worldIn.playSound(playerIn.getPosX(), playerIn.getPosY(), playerIn.getPosZ(), getRadarSound(), SoundCategory.VOICE, 2.0F, 1.0F, true);
        }

        return super.onItemRightClick(worldIn, playerIn, handIn);
    }

    public SoundEvent getRadarSound() {
        return null; //SoundInit.RADAR.get();
    }
}
