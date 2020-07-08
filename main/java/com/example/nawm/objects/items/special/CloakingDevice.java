package com.example.nawm.objects.items.special;

import com.example.nawm.AnimeWeaponsMod;
import com.example.nawm.init.SoundInit;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Effects;
import net.minecraft.util.*;
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
        //play the cloak sound
        worldIn.playSound(playerIn.getPosX(), playerIn.getPosY(), playerIn.getPosZ(), getCloakSound(), SoundCategory.VOICE, 2.0F, 1.0F, true);

        //cloak invisible
        playerIn.setInvisible(!playerIn.isInvisible());
        //cloak invulnerable
        playerIn.setInvulnerable(!playerIn.isInvulnerable());

        //remove effects
        playerIn.removePotionEffect(Effects.WITHER);
        playerIn.removePotionEffect(Effects.SLOWNESS);
        playerIn.removePotionEffect(Effects.BLINDNESS);
        playerIn.removePotionEffect(Effects.WEAKNESS);

        return super.onItemRightClick(worldIn, playerIn, handIn);
    }

    public SoundEvent getCloakSound() {
        return SoundInit.CLOAK.get();
    }
}
