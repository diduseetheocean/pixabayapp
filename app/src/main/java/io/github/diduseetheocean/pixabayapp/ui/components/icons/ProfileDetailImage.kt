package io.github.diduseetheocean.pixabayapp.ui.components.icons

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import coil.annotation.ExperimentalCoilApi
import coil.compose.rememberImagePainter
import io.github.diduseetheocean.pixabayapp.ui.theme.Blue200
import io.github.diduseetheocean.pixabayapp.ui.theme.Gray

@ExperimentalCoilApi
@Composable
fun ProfileDetailImage(url: String = "", text: String) {
    Row(
        modifier = Modifier.wrapContentSize(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        if (url.isNotEmpty()) {
            Image(
                modifier = Modifier
                    .padding(end = 4.dp)
                    .clip(CircleShape)
                    .border(2.dp, Blue200, CircleShape)
                    .width(36.dp)
                    .height(36.dp),
                painter = rememberImagePainter(url),
                contentDescription = ""
            )
        }
        Text(
            modifier = Modifier.wrapContentSize(),
            text = text,
            overflow = TextOverflow.Ellipsis,
            style = MaterialTheme.typography.caption.copy(color = Gray),
        )
    }
}