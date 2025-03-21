package at.leisner.lumen.api.result

import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.input.key.Key
import at.leisner.lumen.api.result.MappedQueryResult.Action

class MappedQueryResultBuilder {
    lateinit var delegate: QueryResult
    val actions: MutableSet<Action> = mutableSetOf()
    var onEnter: () -> Unit = {}

    fun action(action: ActionBuilder.() -> Unit) {
        val builder = ActionBuilder()
        builder.action()
        actions.add(builder.build())
    }

    fun enter(action: () -> Unit) {
        onEnter = action
    }

    fun build() = MappedQueryResult(delegate, actions.toSet(), onEnter)
}

class ActionBuilder {
    lateinit var icon: ImageVector
    lateinit var name: String
    var callback: () -> Unit = {}
    var key: Key? = null

    fun callback(callback: () -> Unit) {
        this.callback = callback
    }

    fun build() = Action(icon, name, callback, key)
}
