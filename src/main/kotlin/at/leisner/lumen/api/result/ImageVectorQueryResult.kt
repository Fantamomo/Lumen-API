package at.leisner.lumen.api.result

import androidx.compose.ui.graphics.vector.ImageVector

data class ImageVectorQueryResult(
    override val title: String,
    override val subtitle: String?,
    override val priority: Int,
    val imageVector: ImageVector,
    override val contentDescription: String,
    override val override: Boolean = false,
) : ImageQueryResult