package at.leisner.lumen.api.result

fun queryResultOf(
    title: String,
    subtitle: String,
    priority: Int = QueryResult.DEFAULT_PRIORITY,
    override: Boolean = false,
) = DirectQueryResult(title, subtitle, priority, override)

fun QueryResult.toMapped(actions: Set<MappedQueryResult.Action> = setOf(), onEnter: () -> Unit = {}): MappedQueryResult =
    MappedQueryResult(this, actions, onEnter)

fun QueryResult.toList(): List<QueryResult> = listOf(this)

fun mappedQueryResultBuilder(action: MappedQueryResultBuilder.() -> Unit): MappedQueryResult {
    val builder = MappedQueryResultBuilder()
    builder.action()
    return builder.build()
}