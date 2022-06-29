package dtauxiliary;

import com.ferreusveritas.dynamictrees.api.worldgen.IBiomeDataBasePopulator;
import com.ferreusveritas.dynamictrees.worldgen.BiomeDataBase;
import com.ferreusveritas.dynamictrees.worldgen.BiomeDataBasePopulatorJson;
import net.minecraft.util.ResourceLocation;

public final class BiomeDataBasePopulator implements IBiomeDataBasePopulator {

    public static final String RESOURCEPATH = "worldgen/default.json";

    private final BiomeDataBasePopulatorJson jsonPopulator;

    public BiomeDataBasePopulator () {
        this.jsonPopulator = new BiomeDataBasePopulatorJson(new ResourceLocation(DynamicTreesAuxiliaryBiomes.MOD_ID, RESOURCEPATH));
    }

    @Override
    public void populate(BiomeDataBase biomeDataBase) {
        this.jsonPopulator.populate(biomeDataBase);
    }

}
