package net.veroxuniverse.epicsamurai.client.custom_armors.samurai_armor.aquamarine;

import net.minecraft.resources.ResourceLocation;
import net.veroxuniverse.epicsamurai.EpicSamuraiMod;
import net.veroxuniverse.epicsamurai.item.armor.BlueSamuraiArmorItem;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BlueSamuraiArmorModel extends AnimatedGeoModel<BlueSamuraiArmorItem> {
    @Override
    public ResourceLocation  getModelResource(BlueSamuraiArmorItem object) {
        return new ResourceLocation(EpicSamuraiMod.MOD_ID, "geo/samurai_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(BlueSamuraiArmorItem object) {
        return new ResourceLocation(EpicSamuraiMod.MOD_ID, "textures/models/armor/blue_samurai_armor_textures.png");
    }

    @Override
    public ResourceLocation getAnimationResource(BlueSamuraiArmorItem animatable) {
        return null;
        //return new ResourceLocation(EpicSamuraiMod.MOD_ID, "animations/samurai_armor_animation.json");
    }

}
