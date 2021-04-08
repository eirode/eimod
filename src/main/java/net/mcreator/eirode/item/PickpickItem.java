
package net.mcreator.eirode.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.eirode.itemgroup.EimodItemGroup;
import net.mcreator.eirode.EirodeModElements;

@EirodeModElements.ModElement.Tag
public class PickpickItem extends EirodeModElements.ModElement {
	@ObjectHolder("eirode:pickpick")
	public static final Item block = null;
	public PickpickItem(EirodeModElements instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 150;
			}

			public float getEfficiency() {
				return 12f;
			}

			public float getAttackDamage() {
				return 2.5f;
			}

			public int getHarvestLevel() {
				return 100;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(EigemItem.block, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(EimodItemGroup.tab)) {
		}.setRegistryName("pickpick"));
	}
}
