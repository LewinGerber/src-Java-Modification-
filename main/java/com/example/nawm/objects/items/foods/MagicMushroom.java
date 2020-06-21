package com.example.nawm.objects.items.foods;

import com.example.nawm.AnimeWeaponsMod;
import com.example.nawm.util.helpers.KeyboardHelper;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;


/**
 * @author Simon TObler
 * @version 19.06.2020
 */
public class MagicMushroom extends Item{

    @Override
    public boolean hasEffect(ItemStack stack) {
        return true;
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        if(KeyboardHelper.isHoldingShift()) {
            tooltip.add(new StringTextComponent("Gives 10 extra HP"));
        } else {
            tooltip.add(new StringTextComponent("Hold" + "\u00A7e" + " SHIFT " + "\u00A77" + "for more information"));
        }
        super.addInformation(stack, worldIn, tooltip, flagIn);
    }

    public MagicMushroom() {
        super(new Item.Properties().group(AnimeWeaponsMod.AnimeItemGroup.instance).food(new Food.Builder().hunger(6)
                .saturation(1.2f).setAlwaysEdible().effect(new EffectInstance(Effects.ABSORPTION, 4500, 4), 1)
                .effect(new EffectInstance(Effects.JUMP_BOOST,4500,4),1)
                .effect(new EffectInstance(Effects.SPEED,4500,4),1).build()));
        //Hello World 2.0
        ;
    }
}
