package at.leisner.lumen.api

import at.leisner.lumen.api.provider.ProviderConfig
import at.leisner.lumen.api.plugin.LumenPlugin
import at.leisner.lumen.api.provider.ResultProvider

interface Lumen {
    fun registerResultProvider(plugin: LumenPlugin, provider: ResultProvider)

    fun unregisterResultProvider(plugin: LumenPlugin, provider: ResultProvider)

    fun unregisterAllResultProvider(plugin: LumenPlugin)

    fun getPlugin(id: String): LumenPlugin?

    fun registerProviderConfig(plugin: LumenPlugin, builder: ProviderConfig.ProviderConfigBuilder.() -> Unit): ProviderConfig
}