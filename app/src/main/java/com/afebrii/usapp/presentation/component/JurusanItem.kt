package com.afebrii.usapp.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.afebrii.usapp.R
import com.afebrii.usapp.model.Jurusan
import com.afebrii.usapp.ui.theme.USAppTheme

@Composable
fun JurusanItem(
    jurusan: Jurusan,
    modifier: Modifier = Modifier,
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .fillMaxWidth()
    ) {
        Image(
            painter = painterResource(id = jurusan.photoJurusan),
            contentDescription = jurusan.namaJurusan,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .clip(CircleShape)
                .size(80.dp)
        )
        Spacer(modifier = Modifier.width(16.dp))
        Column {
            Text(
                text = jurusan.namaJurusan,
                style = MaterialTheme.typography.titleMedium
            )
            Text(
                text = jurusan.fakultas,
                style = MaterialTheme.typography.titleSmall
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun JurusanItemPreview() {
    USAppTheme {
        JurusanItem(
            jurusan = Jurusan(1, "Informatika", "Fakultas Teknik", R.drawable.unsil)
        )
    }
}