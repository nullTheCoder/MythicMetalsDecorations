package nourl.mythicmetalsdecorations.item;

import net.minecraft.item.ArmorMaterial;
import nourl.mythicmetals.armor.MythicArmorMaterials;

public class MythicDecorationsCrownMaterials {

    public static final ArmorMaterial ADAMANTITE = fromMaterial(MythicArmorMaterials.ADAMANTITE);
    public static final ArmorMaterial AQUARIUM = fromMaterial(MythicArmorMaterials.AQUARIUM);
    public static final ArmorMaterial BANGLUM = fromMaterial(MythicArmorMaterials.BANGLUM);
    public static final ArmorMaterial CARMOT = fromMaterial(MythicArmorMaterials.CARMOT);
    public static final ArmorMaterial CELESTIUM = fromMaterial(MythicArmorMaterials.CELESTIUM);
    public static final ArmorMaterial DURASTEEL = fromMaterial(MythicArmorMaterials.DURASTEEL);
    public static final ArmorMaterial HALLOWED = fromMaterial(MythicArmorMaterials.HALLOWED);
    public static final ArmorMaterial KYBER = fromMaterial(MythicArmorMaterials.KYBER);
    public static final ArmorMaterial METALLURGIUM = fromMaterial(MythicArmorMaterials.METALLURGIUM);
    public static final ArmorMaterial MYTHRIL = fromMaterial(MythicArmorMaterials.MYTHRIL);
    public static final ArmorMaterial ORICHALCUM = fromMaterial(MythicArmorMaterials.ORICHALCUM);
    public static final ArmorMaterial OSMIUM = fromMaterial(MythicArmorMaterials.OSMIUM);
    public static final ArmorMaterial PALLADIUM = fromMaterial(MythicArmorMaterials.PALLADIUM);
    public static final ArmorMaterial RUNITE = fromMaterial(MythicArmorMaterials.RUNITE);
    public static final ArmorMaterial STAR_PLATINUM = fromMaterial(MythicArmorMaterials.STAR_PLATINUM);
    public static final ArmorMaterial STEEL = fromMaterial(MythicArmorMaterials.STEEL);

    public static ArmorMaterial fromMaterial(ArmorMaterial material) {
        return new ArmorMaterial(
            material.defense(),
            material.enchantability(),
            material.equipSound(),
            material.repairIngredient(),
            material.layers(),
            material.toughness(),
            material.knockbackResistance()
        );
    }
}
