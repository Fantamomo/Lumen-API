package at.leisner.lumen.api.provider

import at.leisner.lumen.api.result.QueryResult

interface DirectResultProvider : ResultProvider {
    fun suggest(query: String): List<QueryResult>

    fun suggest(query: String, global: Boolean) = suggest(query)
}