package dtauxiliary;

import com.ferreusveritas.dynamictrees.ModConstants;
import com.ferreusveritas.dynamictrees.api.WorldGenRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid=DynamicTreesAuxiliaryBiomes.MOD_ID, name = DynamicTreesAuxiliaryBiomes.NAME, version = DynamicTreesAuxiliaryBiomes.VERSION, dependencies = DynamicTreesAuxiliaryBiomes.DEPENDENCIES)
@Mod.EventBusSubscriber(modid = DynamicTreesAuxiliaryBiomes.MOD_ID)
public final class DynamicTreesAuxiliaryBiomes {

    public static final String MOD_ID = "dtauxiliary";
    public static final String NAME = "Dynamic Trees Auxiliary Biomes";
    public static final String VERSION = "@VERSION@";
    public static final String DEPENDENCIES = ModConstants.REQAFTER + ModConstants.DYNAMICTREES_LATEST + ModConstants.NEXT + ModConstants.REQAFTER + "auxbiomes";

    public static final Logger logger = LogManager.getLogger(MOD_ID);

    @SubscribeEvent
    public static void registerDataBasePopulators(final WorldGenRegistry.BiomeDataBasePopulatorRegistryEvent event) {
        event.register(new BiomeDataBasePopulator());
    }

}
