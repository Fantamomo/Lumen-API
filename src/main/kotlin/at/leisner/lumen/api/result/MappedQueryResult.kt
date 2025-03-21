package at.leisner.lumen.api.result

import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.input.key.Key

class MappedQueryResult(
    val delegate: QueryResult,
    val actions: Set<Action>,
    val onEnter: () -> Unit,
) : QueryResult by delegate {
    data class Action(
        val icon: ImageVector,
        val name: String,
        val callback: () -> Unit,
        val key: Key? = null,
    )
}