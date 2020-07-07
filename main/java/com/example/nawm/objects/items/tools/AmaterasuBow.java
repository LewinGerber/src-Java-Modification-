package com.example.nawm.objects.items.tools;

import com.example.nawm.AnimeWeaponsMod;
import net.minecraft.item.*;

/**
 * @author Simon TObler
 * @version 26.06.2020
 */
public class AmaterasuBow extends BowItem {
    // muss sound effekt von amaterasu einfügen
    public AmaterasuBow() {
        super(new Item.Properties().maxDamage(8).group(AnimeWeaponsMod.AnimeItemGroup.instance));
    }

}
