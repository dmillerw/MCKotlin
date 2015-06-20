package me.dmillerw.kotlin.block

import cpw.mods.fml.common.registry.GameRegistry
import net.minecraft.block.Block

/**
 * @author dmillerw
 */

class ModBlocks {
    companion object {
        var test: Block? = BlockTest().setBlockName("Test");

        fun initialize() {
            GameRegistry.registerBlock(test, "Test");
        }
    }
}