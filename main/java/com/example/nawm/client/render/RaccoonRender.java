package com.example.nawm.client.render;

import com.example.nawm.AnimeWeaponsMod;
import com.example.nawm.client.model.RaccoonModel;
import com.example.nawm.entities.Raccoon;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class RaccoonRender extends MobRenderer<Raccoon, RaccoonModel<Raccoon>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(AnimeWeaponsMod.MOD_ID,
            "textures/entity/raccoon.png");

    public RaccoonRender(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new RaccoonModel<Raccoon>(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(Raccoon entity) {
        return TEXTURE;
    }
}
