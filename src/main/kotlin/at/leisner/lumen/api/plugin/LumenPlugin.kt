package at.leisner.lumen.api.plugin

import at.leisner.lumen.api.Lumen
import java.util.logging.Logger

abstract class LumenPlugin {
    lateinit var lumen: Lumen
        internal set
    lateinit var logger: Logger
        internal set

    open fun onLoad() {}

    open fun onEnable() {}

    open fun onDisable() {}
}