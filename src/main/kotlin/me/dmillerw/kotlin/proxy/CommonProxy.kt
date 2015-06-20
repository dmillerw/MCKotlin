package me.dmillerw.kotlin.proxy

import cpw.mods.fml.common.event.FMLInitializationEvent
import cpw.mods.fml.common.event.FMLPostInitializationEvent
import cpw.mods.fml.common.event.FMLPreInitializationEvent
import cpw.mods.fml.relauncher.Side
import me.dmillerw.kotlin.block.ModBlocks
import cpw.mods.fml.relauncher.SideOnly as sided

/**
 * @author dmillerw
 */

open class CommonProxy {

    open fun preInit(event: FMLPreInitializationEvent) {
        ModBlocks.initialize();
    }

    open fun init(event: FMLInitializationEvent) {

    }

    open fun postInit(event: FMLPostInitializationEvent) {

    }
}

