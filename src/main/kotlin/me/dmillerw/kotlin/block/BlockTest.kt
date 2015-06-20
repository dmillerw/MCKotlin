package me.dmillerw.kotlin.block

import net.minecraft.block.Block
import net.minecraft.block.material.Material
import net.minecraft.creativetab.CreativeTabs
import net.minecraft.entity.player.EntityPlayer
import net.minecraft.util.ChatComponentText
import net.minecraft.world.World

/**
 * @author dmillerw
 */
public class BlockTest : Block(Material.rock) {

    init {
        setHardness(2F);
        setResistance(2F);
        setCreativeTab(CreativeTabs.tabRedstone);
    }

    override fun onBlockActivated(world: World?, x: Int, y: Int, z: Int, entityPlayer: EntityPlayer?, side: Int, fx: Float, fy: Float, fz: Float): Boolean {
        super.onBlockActivated(world, x, y, z, entityPlayer, side, fx, fy, fz);

        entityPlayer?.addChatComponentMessage(ChatComponentText("You clicked me!"))

        return true;
    }
}