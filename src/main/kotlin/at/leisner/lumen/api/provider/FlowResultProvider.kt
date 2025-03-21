package at.leisner.lumen.api.provider

import at.leisner.lumen.api.result.QueryResult
import kotlinx.coroutines.flow.Flow

interface FlowResultProvider : ResultProvider {

    fun suggest(query: String): Flow<QueryResult>

    fun suggest(query: String, global: Boolean) = suggest(query)
}