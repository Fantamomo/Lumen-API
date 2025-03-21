package at.leisner.lumen.api.plugin

annotation class Dependency(
    val id: String,
    val version: String,
    val optional: Boolean = false,
)
