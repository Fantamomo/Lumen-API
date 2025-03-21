package at.leisner.lumen.api.plugin

@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.CLASS)
annotation class PluginInfo(
    val id: String,
    val name: String,
    val author: Array<String> = [],
    val description: String = "",
    val version: String = "1.0-SNAPSHOT",
    val dependencies: Array<Dependency> = []
)