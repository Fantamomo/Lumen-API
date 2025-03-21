package at.leisner.lumen.api.provider

import at.leisner.lumen.api.result.QueryResult

interface AsyncResultProvider : ResultProvider {
    suspend fun suggest(query: String): List<QueryResult>

    suspend fun suggest(query: String, global: Boolean) = suggest(query)
}