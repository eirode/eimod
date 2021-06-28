package net.mcreator.eirode.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.item.ItemStack;
import net.minecraft.enchantment.Enchantments;

import net.mcreator.eirode.EirodeModElements;
import net.mcreator.eirode.EirodeMod;

import java.util.Map;

@EirodeModElements.ModElement.Tag
public class PickpickQuandLeBlocEstDetruitAvecLoutilProcedure extends EirodeModElements.ModElement {
	public PickpickQuandLeBlocEstDetruitAvecLoutilProcedure(EirodeModElements instance) {
		super(instance, 10);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				EirodeMod.LOGGER.warn("Failed to load dependency itemstack for procedure PickpickQuandLeBlocEstDetruitAvecLoutil!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				EirodeMod.LOGGER.warn("Failed to load dependency x for procedure PickpickQuandLeBlocEstDetruitAvecLoutil!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				EirodeMod.LOGGER.warn("Failed to load dependency y for procedure PickpickQuandLeBlocEstDetruitAvecLoutil!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				EirodeMod.LOGGER.warn("Failed to load dependency z for procedure PickpickQuandLeBlocEstDetruitAvecLoutil!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				EirodeMod.LOGGER.warn("Failed to load dependency world for procedure PickpickQuandLeBlocEstDetruitAvecLoutil!");
			return;
		}
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		((itemstack)).addEnchantment(Enchantments.LOOTING, (int) 15);
		world.addParticle(ParticleTypes.LARGE_SMOKE, x, y, z, 0, 1, 0);
	}
}
