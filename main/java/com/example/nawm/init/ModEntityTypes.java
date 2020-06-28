package com.example.nawm.init;

import com.example.nawm.AnimeWeaponsMod;
import com.example.nawm.entities.Raccoon;
import com.example.nawm.entities.kappa_creeper.KappaCreeperEntity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntityTypes {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = new DeferredRegister<>(ForgeRegistries.ENTITIES, AnimeWeaponsMod.MOD_ID);

    public static final RegistryObject<EntityType<Raccoon>> RACCOON = ENTITY_TYPES
            .register("raccoon",
                    () -> EntityType.Builder.<Raccoon>create(Raccoon::new, EntityClassification.CREATURE)
                            .size(0.6f, 0.85f)
                            .build(new ResourceLocation(AnimeWeaponsMod.MOD_ID, "raccoon").toString())
            );

    public static final RegistryObject<EntityType<KappaCreeperEntity>> KAPPA_CREEPER = ENTITY_TYPES
            .register( "kappa_creeper",
                    () -> EntityType.Builder.<KappaCreeperEntity>create(KappaCreeperEntity::new, EntityClassification.MONSTER)
                        .size(0.6f, 0.85f)
                        .build(new ResourceLocation(AnimeWeaponsMod.MOD_ID, "kappa_creeper").toString())
            );
}
