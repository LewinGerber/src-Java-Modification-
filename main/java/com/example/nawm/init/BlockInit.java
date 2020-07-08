package com.example.nawm.init;

import com.example.nawm.AnimeWeaponsMod;
import com.example.nawm.objects.blocks.BasicBlock;
import com.example.nawm.objects.blocks.crops.MagicMushroomCrop;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/**
 * @author Lewin Gerber, Simon Tobler, Elias Mehlram
 * @version 07.07.2020
 * nAWM
 */

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, AnimeWeaponsMod.MOD_ID);

    public static final RegistryObject<Block> BASIC_BLOCK = BLOCKS.register("basic_block", () -> new BasicBlock());
    public static final RegistryObject<Block> MAGIC_MUSHROOM_CROP = BLOCKS.register("magic_mushroom_crop", () -> new MagicMushroomCrop());
}
