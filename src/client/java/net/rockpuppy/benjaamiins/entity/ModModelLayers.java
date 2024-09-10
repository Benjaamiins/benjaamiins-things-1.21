package net.rockpuppy.benjaamiins.entity;

import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;
import net.rockpuppy.benjaamiins.Benjaamiins;

public class ModModelLayers {
    public static final EntityModelLayer BEAN_MASTER =
            new EntityModelLayer(Identifier.of(Benjaamiins.MOD_ID, "bean_master"), "main");

    public static final EntityModelLayer BEAN_GOD =
            new EntityModelLayer(Identifier.of(Benjaamiins.MOD_ID, "bean_god"), "main");
}
