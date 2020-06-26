package com.example.nawm.entities;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.world.World;

/**
 * @author Lewin Gerber
 * @version 26.06.2020
 * nAWM
 */
public class ExplosiveArrow extends ArrowEntity {
    public ExplosiveArrow(World worldIn, double x, double y, double z) {
        super(worldIn, x, y, z);
        System.out.println("item created");
    }
}
