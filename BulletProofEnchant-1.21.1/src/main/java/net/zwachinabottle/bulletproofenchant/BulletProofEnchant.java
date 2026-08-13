package net.zwachinabottle.bulletproofenchant;

import net.fabricmc.api.ModInitializer;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BulletProofEnchant implements ModInitializer {

	public static final String MOD_ID = "bulletproofenchant";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	/**
	 * As of Minecraft 1.21, enchantments are data-driven and defined via JSON
	 * (see src/main/resources/data/bulletproofenchant/enchantment/bullet_proof.json)
	 * instead of being registered here as a Java class. This RegistryKey is kept
	 * around only as a convenient reference in case other code (or a future mixin)
	 * needs to check for this enchantment, e.g. via EnchantmentHelper.getLevel(...).
	 */
	public static final RegistryKey<Enchantment> BULLET_PROOF =
			RegistryKey.of(RegistryKeys.ENCHANTMENT, Identifier.of(MOD_ID, "bullet_proof"));

	@Override
	public void onInitialize() {
		LOGGER.info("BulletProofEnchant initialized (bullet_proof enchantment is data-driven)");
	}
}
