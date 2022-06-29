package dtauxiliary;

import com.ferreusveritas.dynamictrees.ModConstants;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid=DynamicTreesAuxiliaryBiomes.MOD_ID, name = DynamicTreesAuxiliaryBiomes.NAME, version = DynamicTreesAuxiliaryBiomes.VERSION, dependencies = DynamicTreesAuxiliaryBiomes.DEPENDENCIES, updateJSON = "")
public final class DynamicTreesAuxiliaryBiomes {

    public static final String MOD_ID = "dtauxiliary";
    public static final String NAME = "Dynamic Trees Auxiliary Biomes";
    public static final String VERSION = "@VERSION@";
    public static final String DEPENDENCIES = ModConstants.REQAFTER + ModConstants.DYNAMICTREES_LATEST + ModConstants.NEXT + ModConstants.REQAFTER + "auxbiomes";

    @Mod.Instance
    public static DynamicTreesAuxiliaryBiomes instance;

    public static final Logger logger = LogManager.getLogger(MOD_ID);

    @SidedProxy(clientSide = "dtauxiliary.ClientProxy", serverSide = "dtauxiliary.CommonProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit();
    }

 

}
