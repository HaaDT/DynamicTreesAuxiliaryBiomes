package dtauxiliary;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import com.ferreusveritas.dynamictrees.api.WorldGenRegistry;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = DynamicTreesAuxiliaryBiomes.MOD_ID)
public final class ModContent {

    @SubscribeEvent
    public static void registerDataBasePopulators(final WorldGenRegistry.BiomeDataBasePopulatorRegistryEvent event) {
        event.register(new BiomeDataBasePopulator());
    }

}
