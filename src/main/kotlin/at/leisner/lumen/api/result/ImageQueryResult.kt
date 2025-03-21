package at.leisner.lumen.api.result

sealed interface ImageQueryResult : QueryResult {
    val contentDescription: String
}