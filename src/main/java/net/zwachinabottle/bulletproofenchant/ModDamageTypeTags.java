package net.zwachinabottle.bulletproofenchant;

import net.minecraft.entity.damage.DamageType;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

/**
 * Reference to the damage type tag used by the bullet_proof enchantment
 * (see data/bulletproofenchant/tags/damage_type/bullet.json), which unions
 * TACZ's "tacz-fabric:bullet" and "tacz-fabric:bullet_ignore_armor" damage types.
 * Kept for convenience if other code ever needs to check this tag manually.
 */
public interface ModDamageTypeTags {
    TagKey<DamageType> IS_BULLET = of("bullet");

    private static TagKey<DamageType> of(String path) {
        return TagKey.of(RegistryKeys.DAMAGE_TYPE, Identifier.of(BulletProofEnchant.MOD_ID, path));
    }
}
