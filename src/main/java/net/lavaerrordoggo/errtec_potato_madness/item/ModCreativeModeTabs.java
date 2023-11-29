package net.lavaerrordoggo.errtec_potato_madness.item;

import net.lavaerrordoggo.errtec_potato_madness.ETPotatoMadness;
import net.lavaerrordoggo.errtec_potato_madness.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ETPotatoMadness.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ETPOTATO_TAB = CREATIVE_MODE_TABS.register("et_potato_madness_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CharIronIngot.get()))
                    .title(Component.translatable("creativetab.et_potato_madness_tab"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(ModItems.SmilePotatoRaw.get());

                        pOutput.accept(ModItems.CharCobble.get());
                        pOutput.accept(ModItems.CharCopperIngot.get());
                        pOutput.accept(ModItems.CharCopperNugget.get());
                        pOutput.accept(ModItems.CharCopperShard.get());
                        pOutput.accept(ModItems.CharIronIngot.get());
                        pOutput.accept(ModItems.CharIronNugget.get());
                        pOutput.accept(ModItems.CharIronShard.get());
                        pOutput.accept(ModItems.MoltenCoal.get());
                        pOutput.accept(ModItems.TinyMoltenCoal.get());
                        pOutput.accept(ModItems.MoltenCoalShard.get());

                        pOutput.accept(ModBlocks.SmilePotatoOreBlock.get());

                        pOutput.accept(ModBlocks.PotatoBlock.get());
                        pOutput.accept(ModBlocks.CompressedPotatoBlock.get());
                        pOutput.accept(ModBlocks.CharredCobblestone.get());
                        pOutput.accept(ModBlocks.CharredCopperBlock.get());
                        pOutput.accept(ModBlocks.CharredIronBlock.get());
                        pOutput.accept(ModBlocks.MoltenCoalBlock.get());


                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
