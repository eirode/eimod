package net.mcreator.eirode.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.eirode.EirodeModElements;
import net.mcreator.eirode.EirodeMod;

import java.util.Map;

@EirodeModElements.ModElement.Tag
public class SuperinvunerabiliteEnTickActifDeLaPotionProcedure extends EirodeModElements.ModElement {
	public SuperinvunerabiliteEnTickActifDeLaPotionProcedure(EirodeModElements instance) {
		super(instance, 19);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				EirodeMod.LOGGER.warn("Failed to load dependency entity for procedure SuperinvunerabiliteEnTickActifDeLaPotion!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.RESISTANCE, (int) 1200, (int) 80));
	}
}
