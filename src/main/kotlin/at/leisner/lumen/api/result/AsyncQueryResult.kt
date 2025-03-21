package at.leisner.lumen.api.result


data class AsyncQueryResult(
    override val title: String,
    override val subtitle: String?,
    override val priority: Int = QueryResult.DEFAULT_PRIORITY,
    val imageUrl: String,
    override val contentDescription: String,
    override val override: Boolean = false,
) : ImageQueryResult