package me.dmillerw.kotlin.core

import cpw.mods.fml.common.FMLModContainer
import cpw.mods.fml.common.ILanguageAdapter
import cpw.mods.fml.common.ModContainer
import cpw.mods.fml.relauncher.Side
import java.lang.reflect.Field
import java.lang.reflect.Method

/**
 * @author dmillerw
 */
public class LanguageAdapter : ILanguageAdapter {

    override fun supportsStatics(): Boolean {
        return false;
    }

    override fun setProxy(target: Field?, proxyTarget: Class<*>?, proxy: Any?) {
        target?.set(proxyTarget, proxy);
    }

    override fun getNewInstance(container: FMLModContainer?, objectClass: Class<*>?, classLoader: ClassLoader?, factoryMarkedAnnotation: Method?): Any? {
        if (factoryMarkedAnnotation == null) {
            return objectClass?.newInstance();
        } else {
            return factoryMarkedAnnotation.invoke(null);
        }
    }

    override fun setInternalProxies(mod: ModContainer?, side: Side?, loader: ClassLoader?) {

    }
}