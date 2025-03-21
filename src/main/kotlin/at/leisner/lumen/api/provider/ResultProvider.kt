package at.leisner.lumen.api.provider

sealed interface ResultProvider {
    val providerConfig: ProviderConfig
}