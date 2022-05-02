package com.epinephrine.conquestarmory;

import com.epinephrine.conquestarmory.block.Cblocks;
import com.epinephrine.conquestarmory.item.Citems;
import com.epinephrine.conquestarmory.util.CItemModelProperties;
import com.epinephrine.conquestarmory.util.Registration;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



// The value here should match an entry in the META-INF/mods.toml file
@Mod(Conquestarmory.MOD_ID)
public class Conquestarmory {

    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();
    public  static final  String MOD_ID = "conquestarmory";

    public Conquestarmory()
    {
        Citems.register();
        Registration.register();
        Cblocks.register();
        CItemModelProperties.register();

        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        // Register the enqueueIMC method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
        // Register the processIMC method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);
        // Register the doClientStuff method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        // do something that can only be done on the client
        LOGGER.info("Got game settings {}", event.getMinecraftSupplier().get().gameSettings);
        CItemModelProperties.makeBow(Citems.COPPERBOW.get());
        CItemModelProperties.makeBow(Citems.STEELLONGWARBOW.get());
        CItemModelProperties.makeBow(Citems.STEELLONGBOW.get());
        CItemModelProperties.makeBow(Citems.BONELONGBOW.get());
        CItemModelProperties.makeBow(Citems.STEELBOW.get());
        CItemModelProperties.makeCrossbow(Citems.STEELCROSSBOW.get());
        CItemModelProperties.makeBow(Citems.BRONZEBOW.get());
        CItemModelProperties.makeBow(Citems.BRONZECROSSBOW.get());
        CItemModelProperties.makeBow(Citems.IRONBOW.get());
        CItemModelProperties.makeBow(Citems.IRONCROSSBOW.get());
        CItemModelProperties.makeBow(Citems.IRONLONGBOW.get());
        CItemModelProperties.makeBow(Citems.ELVENLONGBOW.get());
        CItemModelProperties.makeBow(Citems.STAHLRIMBOW.get());
        CItemModelProperties.makeBow(Citems.ROOTLONGBOW.get());
        CItemModelProperties.makeBow(Citems.XENTHIUMCOMPOUNDBOW.get());
        CItemModelProperties.makeShield(Citems.XENTHIUMSHIELD.get());
        CItemModelProperties.makeShield(Citems.COFFINSHIELD.get());
        CItemModelProperties.makeShield(Citems.NORMANSHIELD.get());
        CItemModelProperties.makeTriedent(Citems.ASSEGAI.get());
        CItemModelProperties.makeShield(Citems.SOMEWITCHERSHIELD.get());
        CItemModelProperties.makeShield(Citems.WITCHERSHIELD.get());
        CItemModelProperties.makeShield(Citems.BONESHIELD.get());
        CItemModelProperties.makeShield(Citems.BIGROMANSCUTUM.get());
        CItemModelProperties.makeShield(Citems.DWARVENSHIELD.get());
        CItemModelProperties.makeShield(Citems.BIGROUNDBIRDSSHIELD.get());
        CItemModelProperties.makeShield(Citems.BIGROUNDBLUESHIELD.get());
        CItemModelProperties.makeShield(Citems.BIGROUNDGREENWHITESHIELD.get());
        CItemModelProperties.makeShield(Citems.BIGROUNDREDBLACKSHIELD.get());
        CItemModelProperties.makeShield(Citems.BIGROUNDREDSHIELD.get());
        CItemModelProperties.makeShield(Citems.BIGROUNDTRISKELLSHIELD.get());
        CItemModelProperties.makeShield(Citems.BIGROUNDWHIRLBLUESHIELD.get());
        CItemModelProperties.makeShield(Citems.BIGROUNDWHIRLGREENWHITESHIELD.get());
        CItemModelProperties.makeShield(Citems.BIGROUNDWHIRLREDSHIELD.get());
        CItemModelProperties.makeShield(Citems.BIGROUNDWHIRLREDWHITESHIELD.get());
        CItemModelProperties.makeShield(Citems.BIGROUNDWHIRLYELLOWSHIELD.get());
        CItemModelProperties.makeShield(Citems.BIGROUNDWOODSHIELD.get());
        CItemModelProperties.makeShield(Citems.BIGROUNDYELLOWBLACKSHIELD.get());
        CItemModelProperties.makeShield(Citems.BIGROUNDYELLOWSHIELD.get());
        CItemModelProperties.makeShield(Citems.BIGROUNDWHIRLYELLOWWHITESHIELD.get());
        CItemModelProperties.makeShield(Citems.ELVENSHIELD.get());
        CItemModelProperties.makeShield(Citems.ELVENSILVERSHIELD.get());
        CItemModelProperties.makeShield(Citems.FANCYIRONSHIELD.get());
        CItemModelProperties.makeShield(Citems.ORCSHIELD.get());
        CItemModelProperties.makeShield(Citems.ORCSHIELDWHITEHAND.get());
        CItemModelProperties.makeShield(Citems.ROHIRRIMSHIELD.get());
        CItemModelProperties.makeShield(Citems.PAVISESHIELD.get());
        CItemModelProperties.makeShield(Citems.ROMANSHIELD.get());
        CItemModelProperties.makeShield(Citems.ROMANSHIELDGREEN.get());
        CItemModelProperties.makeShield(Citems.ROMANSHIELDRED.get());
        CItemModelProperties.makeShield(Citems.ROMANSHIELDWHITE.get());
        CItemModelProperties.makeShield(Citems.ROMANSHIELDYELLOW.get());
        CItemModelProperties.makeShield(Citems.ROUNDEDROMANSCUTUM.get());
        CItemModelProperties.makeShield(Citems.AFRICANTALLSHIELD .get());
        CItemModelProperties.makeShield(Citems.ARABIANKITESHIELD .get());
        CItemModelProperties.makeShield(Citems.ARABIANROUNDSHIELD .get());
        CItemModelProperties.makeShield(Citems.BRONZESHIELD .get());
        CItemModelProperties.makeShield(Citems.CRUSADERSHIELD .get());
        CItemModelProperties.makeShield(Citems.EAGLEHEATERSPARP .get());
        CItemModelProperties.makeShield(Citems.HEATERSHARPSHIELD .get());
        CItemModelProperties.makeShield(Citems.FANCYSHIELD .get());
        CItemModelProperties.makeShield(Citems.HOPLITESHIELDBLANK .get());
        CItemModelProperties.makeShield(Citems.HOPLITESHIELDEYE .get());
        CItemModelProperties.makeShield(Citems.HOPLITESHIELDSCORPION .get());
        CItemModelProperties.makeShield(Citems.HOPLITESHIELDSPARA .get());
        CItemModelProperties.makeShield(Citems.HOPLITESHIELDTRIDENT .get());
        CItemModelProperties.makeShield(Citems.LONGWOODENSHIELD .get());
        CItemModelProperties.makeShield(Citems.SQUAREWANKELSHIELD .get());
        CItemModelProperties.makeShield(Citems.STHADGARDSHIELD .get());
        CItemModelProperties.makeShield(Citems.TARGESHIELD .get());
        CItemModelProperties.makeShield(Citems.TEMPLARSHIELD .get());
        CItemModelProperties.makeShield(Citems.BLUETRIANGLEHEATER .get());
        CItemModelProperties.makeShield(Citems.CHIMALLISHIELD .get());
        CItemModelProperties.makeShield(Citems.CHIMALLISHIELD2 .get());
        CItemModelProperties.makeShield(Citems.CHINESESHIELD .get());
        CItemModelProperties.makeShield(Citems.CONQUESTSHIELD .get());
        CItemModelProperties.makeShield(Citems.ELEVENTHCENTURYSHIELD .get());
        CItemModelProperties.makeShield(Citems.FIFTEENTHCENTURYSHIELD .get());
        CItemModelProperties.makeShield(Citems.FLEURDELIS .get());
        CItemModelProperties.makeShield(Citems.FLICIASHIELD .get());
        CItemModelProperties.makeShield(Citems.GREEKCUTSHIELD .get());
        CItemModelProperties.makeShield(Citems.HEATERBOTTOMROUNDSHIELD .get());
        CItemModelProperties.makeShield(Citems.JOUSTINGSHIELD .get());
        CItemModelProperties.makeShield(Citems.KITESHIELDGOLDBLACK .get());
        CItemModelProperties.makeShield(Citems.KITESHIELDSILVERBLUE .get());
        CItemModelProperties.makeShield(Citems.KITESHIELDGOLDBLUE .get());
        CItemModelProperties.makeShield(Citems.KITESHIELDWOOD .get());
        CItemModelProperties.makeShield(Citems.LORDSOFTHEPINE .get());
        CItemModelProperties.makeShield(Citems.STRONGHOLDHEATERSHARP .get());
        CItemModelProperties.makeShield(Citems.TARGET .get());
    }

    private void enqueueIMC(final InterModEnqueueEvent event) {
        // some example code to dispatch IMC to another mod
        InterModComms.sendTo("conquestarmory", "helloworld", () -> {
            LOGGER.info("Hello world from the MDK");
            return "Hello world";
        });
    }

    private void processIMC(final InterModProcessEvent event) {
        // some example code to receive and process InterModComms from other mods
      }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
        // do something when the server starts
        LOGGER.info("HELLO from server starting");
    }

    // You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
    // Event bus for receiving Registry Events)
    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent) {
            // register a new block here
            LOGGER.info("HELLO from Register Block");
        }
    }

}
