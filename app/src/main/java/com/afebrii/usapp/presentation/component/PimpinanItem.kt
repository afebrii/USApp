package com.afebrii.usapp.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.afebrii.usapp.R
import com.afebrii.usapp.model.Pimpinan
import com.afebrii.usapp.ui.theme.USAppTheme

@Composable
fun PimpinanItem(
    pimpinan: Pimpinan,
    modifier: Modifier = Modifier,
    onItemClicked: (Int) -> Unit
) {
  Column(
      horizontalAlignment = Alignment.CenterHorizontally,
      modifier = modifier.clickable {
          onItemClicked(pimpinan.id)
      }
  ) {
      Image(
          painter = painterResource(id = pimpinan.photo),
          contentScale = ContentScale.Crop,
          contentDescription = pimpinan.name, modifier = Modifier
              .clip(CircleShape)
              .size(80.dp)
      )
      Text(
          text = pimpinan.name,
          style = MaterialTheme.typography.titleMedium,
          overflow = TextOverflow.Ellipsis,
          textAlign = TextAlign.Center,
          modifier = Modifier.width(80.dp),
          maxLines = 1
      )
      Text(
          text = pimpinan.jabatan,
          color = MaterialTheme.colorScheme.primary,
          overflow = TextOverflow.Ellipsis,
          modifier = Modifier.width(80.dp),
          maxLines = 1
      )
  }
}

@Preview(showBackground = true)
@Composable
private fun PimpinanItemHorizontalPreview() {
    USAppTheme {
        PimpinanItem(
            pimpinan = Pimpinan(1, "Andika Febriansyah", "Hustler", R.drawable.rektor),
            onItemClicked = {pimpinanId ->
                println("Pimpinan Id : $pimpinanId")
            }
        )
    }
}