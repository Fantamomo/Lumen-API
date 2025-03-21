package at.leisner.lumen.api.script

import kotlin.script.experimental.api.*
import kotlin.script.experimental.jvm.dependenciesFromCurrentContext
import kotlin.script.experimental.jvm.jvm

object ScriptPluginConfiguration : ScriptCompilationConfiguration({
    jvm {
        dependenciesFromCurrentContext(wholeClasspath = true)
    }
    defaultImports("at.leisner.lumen.api.*")
    defaultImports("at.leisner.lumen.api.result.*")
    defaultImports("at.leisner.lumen.api.provider.*")

}) {
    private fun readResolve(): Any = ScriptPluginConfiguration
}