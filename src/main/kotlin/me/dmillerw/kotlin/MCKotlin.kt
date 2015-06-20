package me.dmillerw.kotlin;

import cpw.mods.fml.common.Mod
import cpw.mods.fml.common.SidedProxy
import cpw.mods.fml.common.event.FMLInitializationEvent
import cpw.mods.fml.common.event.FMLPostInitializationEvent
import cpw.mods.fml.common.event.FMLPreInitializationEvent
import me.dmillerw.kotlin.proxy.CommonProxy
import kotlin.platform.platformStatic
import cpw.mods.fml.common.Mod.EventHandler as event

Mod(modid = "MCKotlin", name = "MCKotlin", modLanguageAdapter = "me.dmillerw.kotlin.core.LanguageAdapter")
class MCKotlin {
    companion object {
        SidedProxy(serverSide = "me.dmillerw.kotlin.proxy.CommonProxy", clientSide = "me.dmillerw.kotlin.proxy.ClientProxy")
        platformStatic var proxy: CommonProxy? = null; // In theory this should generate as a static field of MCKotlin
    }

    event fun preInit(event: FMLPreInitializationEvent) {
        proxy?.preInit(event);
    }

    event fun init(event: FMLInitializationEvent) {
        proxy?.init(event);
    }

    event fun postInit(event: FMLPostInitializationEvent) {
        proxy?.postInit(event);
    }
}