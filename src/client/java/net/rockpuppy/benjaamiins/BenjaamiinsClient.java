package net.rockpuppy.benjaamiins;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BlockEntityRendererRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;
import net.rockpuppy.benjaamiins.block.client.BeanPedestalBlockEntityRenderer;
import net.rockpuppy.benjaamiins.block.entity.ModBlockEntities;
import net.rockpuppy.benjaamiins.entity.*;


public class BenjaamiinsClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {

		EntityRendererRegistry.register(ModEntities.BEAN_MASTER, BeanMasterRenderer::new);
		EntityModelLayerRegistry.registerModelLayer(ModModelLayers.BEAN_MASTER, BeanMasterModel::getTexturedModelData);

		EntityRendererRegistry.register(ModEntities.BEAN_GOD, BeanGodRenderer::new);
		EntityModelLayerRegistry.registerModelLayer(ModModelLayers.BEAN_GOD, BeanGodModel::getTexturedModelData);

		BlockEntityRendererFactories.register(ModBlockEntities.BEAN_PEDESTAL, BeanPedestalBlockEntityRenderer::new);
	}
}