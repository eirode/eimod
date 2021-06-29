
package net.mcreator.eirode;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;

import net.mcreator.eirode.item.EioleItem;

@EirodeModElements.ModElement.Tag
public class SuperinvulcraftBrewingRecipe extends EirodeModElements.ModElement {
	public SuperinvulcraftBrewingRecipe(EirodeModElements instance) {
		super(instance, 22);
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		BrewingRecipeRegistry.addRecipe(Ingredient.fromStacks(new ItemStack(Items.GLASS_BOTTLE, (int) (1))),
				Ingredient.fromStacks(new ItemStack(Items.ENCHANTED_GOLDEN_APPLE, (int) (1))), new ItemStack(EioleItem.block, (int) (1)));
	}
}
