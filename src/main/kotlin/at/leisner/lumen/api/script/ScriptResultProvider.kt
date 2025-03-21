package at.leisner.lumen.api.script

import at.leisner.lumen.api.provider.ProviderConfig
import at.leisner.lumen.api.result.QueryResult
import kotlinx.coroutines.flow.Flow

interface ScriptResultProvider {
    fun provide(action: (String) -> List<QueryResult>)

    fun flowProvide(action: (String) -> Flow<QueryResult>)

    fun asyncProvide(action: suspend (String) -> List<QueryResult>)

    fun config(action: ProviderConfig.ProviderConfigBuilder.() -> Unit)
}