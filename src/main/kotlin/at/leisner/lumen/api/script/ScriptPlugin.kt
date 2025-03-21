package at.leisner.lumen.api.script

import at.leisner.lumen.api.plugin.Dependency
import java.util.logging.Logger
import kotlin.script.experimental.annotations.KotlinScript

@KotlinScript(
    fileExtension = "lumen.kts",
    compilationConfiguration = ScriptPluginConfiguration::class
)
abstract class ScriptPlugin {
    var id: String = ""
    var version: String = "1.0-SNAPSHOT"
    var name: String = ""
    var author: Array<String> = emptyArray()
    var description: String = ""
    var dependencies: Array<Dependency> = emptyArray()
    abstract val logger: Logger
    abstract fun onLoad(action: () -> Unit)
    abstract fun onEnable(action: () -> Unit)
    abstract fun onDisable(action: () -> Unit)

    abstract fun provider(action: ScriptResultProvider.() -> Unit)
}