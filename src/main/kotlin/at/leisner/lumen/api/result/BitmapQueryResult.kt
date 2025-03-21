package at.leisner.lumen.api.result

import androidx.compose.ui.graphics.ImageBitmap

data class BitmapQueryResult(
    override val title: String,
    override val subtitle: String?,
    override val priority: Int = QueryResult.DEFAULT_PRIORITY,
    val image: ImageBitmap,
    override val contentDescription: String,
    override val override: Boolean = false
    ) : ImageQueryResult