package me.dmillerw.kotlin.proxy

import cpw.mods.fml.common.event.FMLInitializationEvent
import cpw.mods.fml.common.event.FMLPostInitializationEvent
import cpw.mods.fml.common.event.FMLPreInitializationEvent
import cpw.mods.fml.relauncher.Side

import cpw.mods.fml.relauncher.SideOnly as sided;

/**
 * @author dmillerw
 */

open class CommonProxy {

    open fun preInit(event: FMLPreInitializationEvent) {

    }

    open fun init(event: FMLInitializationEvent) {

    }

    open fun postInit(event: FMLPostInitializationEvent) {

    }
}

sided(Side.CLIENT) open class ClientProxy : CommonProxy() {

    override fun preInit(event: FMLPreInitializationEvent) {
        super.preInit(event);
    }

    override fun init(event: FMLInitializationEvent) {
        super.init(event);
    }

    override fun postInit(event: FMLPostInitializationEvent) {
        super.postInit(event);
    }
}