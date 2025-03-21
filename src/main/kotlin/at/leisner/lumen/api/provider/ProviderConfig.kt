package at.leisner.lumen.api.provider

interface ProviderConfig {

    val id: String
    val keyword: String
    val global: Boolean
    var enabled: Boolean

    fun remove()

    fun hasCollision(): Boolean

    fun exist(): Boolean

    interface ProviderConfigBuilder {
        var id: String
        var defaultKeyword: String
        var defaultGlobal: Boolean
        var defaultEnabled: Boolean
    }

    companion object {
        fun empty(): ProviderConfig = EmptyProviderConfig
    }

    object EmptyProviderConfig : ProviderConfig {
        override val id: String = ""
        override val keyword: String = ""
        override val global: Boolean = false
        override var enabled: Boolean = false

        override fun remove() {}

        override fun hasCollision() = false

        override fun exist() = false
    }
}