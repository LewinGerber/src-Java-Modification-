package com.example.nawm.init;

import com.example.nawm.AnimeWeaponsMod;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/**
 * @author Lewin Gerber
 * @version 28.06.2020
 * nAWM
 */
public class SoundInit {
    public static final DeferredRegister<SoundEvent> SOUNDS = new DeferredRegister<>(ForgeRegistries.SOUND_EVENTS,
            AnimeWeaponsMod.MOD_ID);

    public static final RegistryObject<SoundEvent> KAPPA = SOUNDS.register("entity.kappa_creeper.kappa_creeper_entity.kappa",
            ()-> new SoundEvent(new ResourceLocation(AnimeWeaponsMod.MOD_ID, "entity.kappa_creeper.kappa_creeper_entity.kappa")));

    public static final RegistryObject<SoundEvent> POOF = SOUNDS.register("entity.kappa_creeper.kappa_creeper_entity.poof",
            ()-> new SoundEvent(new ResourceLocation(AnimeWeaponsMod.MOD_ID, "entity.kappa_creeper.kappa_creeper_entity.poof")));
}
