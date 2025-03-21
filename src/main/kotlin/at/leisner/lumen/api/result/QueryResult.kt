package at.leisner.lumen.api.result

sealed interface QueryResult {
    val title: String
    val subtitle: String?
    val priority: Int
    val override: Boolean

    companion object {
        const val DEFAULT_PRIORITY = 0
    }
}