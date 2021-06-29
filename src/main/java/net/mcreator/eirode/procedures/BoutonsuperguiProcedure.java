package net.mcreator.eirode.procedures;

import net.minecraft.potion.EffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.eirode.potion.SuperinvunerabilitePotion;
import net.mcreator.eirode.item.EioleItem;
import net.mcreator.eirode.EirodeModElements;
import net.mcreator.eirode.EirodeMod;

import java.util.Map;

@EirodeModElements.ModElement.Tag
public class BoutonsuperguiProcedure extends EirodeModElements.ModElement {
	public BoutonsuperguiProcedure(EirodeModElements instance) {
		super(instance, 23);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				EirodeMod.LOGGER.warn("Failed to load dependency entity for procedure Boutonsupergui!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity) {
			ItemStack _stktoremove = new ItemStack(EioleItem.block, (int) (1));
			((PlayerEntity) entity).inventory.clearMatchingItems(p -> _stktoremove.getItem() == p.getItem(), (int) 1);
		}
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(SuperinvunerabilitePotion.potion, (int) 60, (int) 1));
		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).closeScreen();
	}
}
