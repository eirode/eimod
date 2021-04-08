
package net.mcreator.eirode.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.eirode.itemgroup.EimodItemGroup;
import net.mcreator.eirode.EirodeModElements;

@EirodeModElements.ModElement.Tag
public class EigemItem extends EirodeModElements.ModElement {
	@ObjectHolder("eirode:eigem")
	public static final Item block = null;
	public EigemItem(EirodeModElements instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(EimodItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("eigem");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
