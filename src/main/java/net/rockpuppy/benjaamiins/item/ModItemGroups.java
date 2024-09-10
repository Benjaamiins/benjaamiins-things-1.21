package net.rockpuppy.benjaamiins.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.rockpuppy.benjaamiins.Benjaamiins;
import net.rockpuppy.benjaamiins.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup BENJAAMIINS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Benjaamiins.MOD_ID, "benjaamiins_items"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModItems.BEAN))
                    .displayName(Text.translatable("itemGroup.benjaamiins.benjaamiins_things"))
                    .entries((displayContext, entries) -> {
                    entries.add(ModItems.BEAN);
                    entries.add(ModItems.BEAN_PICKAXE);
                    entries.add(ModItems.BEAN_SWORD);
                    entries.add(ModItems.BEAN_AXE);
                    entries.add(ModItems.BEAN_SHOVEL);
                    entries.add(ModItems.BEAN_HOE);
                    entries.add(ModItems.BEAN_MASTER_SPAWN_EGG);
                    entries.add(ModItems.BEAN_GOD_SPAWN_EGG);
                    entries.add(ModItems.BEAN_HELMET);
                    entries.add(ModItems.BEAN_CHESTPLATE);
                    entries.add(ModItems.BEAN_LEGGINGS);
                    entries.add(ModItems.BEAN_BOOTS);

                    entries.add(ModBlocks.BEAN_ORE);
                    entries.add(ModBlocks.DEEPSLATE_BEAN_ORE);
                    entries.add(ModBlocks.BEAN_BLOCK);
                    entries.add(ModBlocks.BEAN_STAIRS);
                    entries.add(ModBlocks.BEAN_SLAB);
                    entries.add(ModBlocks.BEAN_BRICKS);
                    entries.add(ModBlocks.BEAN_BRICK_STAIRS);
                    entries.add(ModBlocks.BEAN_BRICK_SLAB);
                    entries.add(ModBlocks.BEAN_PILLAR);
                    entries.add(ModBlocks.BEAN_PEDESTAL);

                    entries.add(ModItems.BENJAMINIUM_SHARD);
                    entries.add(ModItems.UNCUT_BENJAMINIUM_SHARD);

                    entries.add(ModBlocks.BENJAMINIUM_ORE);
                    entries.add(ModBlocks.DEEPSLATE_BENJAMINIUM_ORE);
                    entries.add(ModBlocks.NETHER_BENJAMINIUM_ORE);
                    entries.add(ModBlocks.END_STONE_BENJAMINIUM_ORE);
                    entries.add(ModBlocks.BENJAMINIUM_SHARD_BLOCK);
                    entries.add(ModBlocks.UNCUT_BENJAMINIUM_SHARD_BLOCK);

                    entries.add(ModItems.BENJAMINIUM_HELMET);
                    entries.add(ModItems.BENJAMINIUM_CHESTPLATE);
                    entries.add(ModItems.BENJAMINIUM_LEGGINGS);
                    entries.add(ModItems.BENJAMINIUM_BOOTS);
                    }).build());


    public static void registerItemGroups() {

    }
}
