package at.leisner.lumen.api.result

import at.leisner.lumen.api.result.QueryResult.Companion.DEFAULT_PRIORITY

data class DirectQueryResult(
    override val title: String,
    override val subtitle: String?,
    override val priority: Int = DEFAULT_PRIORITY,
    override val override: Boolean = false,
) : QueryResult