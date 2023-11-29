package net.lavaerrordoggo.errtec_potato_madness.item;

import net.lavaerrordoggo.errtec_potato_madness.ETPotatoMadness;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ETPotatoMadness.MOD_ID);

    public static final RegistryObject<Item> CharCobble = ITEMS.register("charred_cobble", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CharCopperIngot = ITEMS.register("charred_copper_ingot", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CharCopperNugget = ITEMS.register("charred_copper_nugget", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CharCopperShard = ITEMS.register("charred_copper_shard", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CharIronIngot = ITEMS.register("charred_iron_ingot", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CharIronNugget = ITEMS.register("charred_iron_nugget", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CharIronShard = ITEMS.register("charred_iron_shard", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Cobble = ITEMS.register("cobble", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CopperNugget = ITEMS.register("copper_nugget", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CopperShard = ITEMS.register("copper_shard", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> IronShard = ITEMS.register("iron_shard", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CoalShard = ITEMS.register("coal_shard", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TinyCoal = ITEMS.register("tiny_coal", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MoltenCoal = ITEMS.register("molten_coal", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TinyMoltenCoal = ITEMS.register("tiny_molten_coal", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MoltenCoalShard = ITEMS.register("molten_coal_shard", () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventbus) {
        ITEMS.register(eventbus);
    }
}
