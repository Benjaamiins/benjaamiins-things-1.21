package net.rockpuppy.benjaamiins;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.transfer.v1.item.ItemStorage;
import net.rockpuppy.benjaamiins.block.ModBlocks;
import net.rockpuppy.benjaamiins.block.entity.BeanPedestalBlockEntity;
import net.rockpuppy.benjaamiins.block.entity.ModBlockEntities;
import net.rockpuppy.benjaamiins.entity.ModEntities;
import net.rockpuppy.benjaamiins.entity.custom.BeanGodEntity;
import net.rockpuppy.benjaamiins.entity.custom.BeanMasterEntity;
import net.rockpuppy.benjaamiins.item.ModArmorMaterial;
import net.rockpuppy.benjaamiins.item.ModItemGroups;
import net.rockpuppy.benjaamiins.item.ModItems;
import net.rockpuppy.benjaamiins.world.gen.ModWorldGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Benjaamiins implements ModInitializer {
	public static final String MOD_ID = "benjaamiins";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.initialize();
		ModBlocks.initialize();
		ModEntities.registerModEntities();

		ModArmorMaterial.initialize();

		ModWorldGeneration.generationModWorldGen();

		ModBlockEntities.onInitialize();
		ItemStorage.SIDED.registerForBlockEntity(BeanPedestalBlockEntity::getInventoryProvider, ModBlockEntities.BEAN_PEDESTAL);

		FabricDefaultAttributeRegistry.register(ModEntities.BEAN_MASTER, BeanMasterEntity.createBeanMasterAttributes());
		FabricDefaultAttributeRegistry.register(ModEntities.BEAN_GOD, BeanGodEntity.createBeanGodAttributes());


	}
}