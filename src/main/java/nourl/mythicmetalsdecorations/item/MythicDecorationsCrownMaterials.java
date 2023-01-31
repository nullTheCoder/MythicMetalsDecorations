package nourl.mythicmetalsdecorations.item;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import nourl.mythicmetals.armor.MythicArmorMaterials;

/**
 * Delegation enum for my {@link nourl.mythicmetals.armor.MythicArmorMaterials}
 * Appends "crowned_" in front of their name, allowing for unique armor textures
 * Thanks for making ArmorMaterials enums, Mojank
 */
public enum MythicDecorationsCrownMaterials implements ArmorMaterial {

    ADAMANTITE(MythicArmorMaterials.ADAMANTITE),
    AQUARIUM(MythicArmorMaterials.AQUARIUM),
    BANGLUM(MythicArmorMaterials.BANGLUM),
    CARMOT(MythicArmorMaterials.CARMOT),
    CELESTIUM(MythicArmorMaterials.CELESTIUM),
    DURASTEEL(MythicArmorMaterials.DURASTEEL),
    HALLOWED(MythicArmorMaterials.HALLOWED),
    KYBER(MythicArmorMaterials.KYBER),
    METALLURGIUM(MythicArmorMaterials.METALLURGIUM),
    MYTHRIL(MythicArmorMaterials.MYTHRIL),
    ORICHALCUM(MythicArmorMaterials.ORICHALCUM),
    OSMIUM(MythicArmorMaterials.OSMIUM),
    PALLADIUM(MythicArmorMaterials.PALLADIUM),
    RUNITE(MythicArmorMaterials.RUNITE),
    STAR_PLATINUM(MythicArmorMaterials.STAR_PLATINUM),
    STEEL(MythicArmorMaterials.STEEL);

    private final ArmorMaterial delegate;

    MythicDecorationsCrownMaterials(ArmorMaterial delegate) {
        this.delegate = delegate;
    }

    @Override
    public int getDurability(EquipmentSlot slot) {
        return delegate.getDurability(slot);
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return delegate.getProtectionAmount(slot);
    }

    @Override
    public int getEnchantability() {
        return delegate.getEnchantability();
    }

    @Override
    public SoundEvent getEquipSound() {
        return delegate.getEquipSound();
    }

    @Override
    public Ingredient getRepairIngredient() {
        return delegate.getRepairIngredient();
    }

    @Override
    public String getName() {
        return delegate.getName() + "_crown";
    }

    @Override
    public float getToughness() {
        return delegate.getToughness();
    }

    @Override
    public float getKnockbackResistance() {
        return delegate.getKnockbackResistance();
    }


}
