package com.afebrii.usapp.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.afebrii.usapp.data.DummyData
import com.afebrii.usapp.model.Gallery
import com.afebrii.usapp.ui.theme.USAppTheme

@Composable
fun GalleyScreen(
    modifier: Modifier = Modifier,
    galleries:List<Gallery> = DummyData.USGalleries
) {
    LazyVerticalStaggeredGrid(
        columns = StaggeredGridCells.Adaptive(160.dp),
        verticalItemSpacing = 4.dp,
        horizontalArrangement = Arrangement.spacedBy(4.dp),
        modifier = modifier.fillMaxSize()
    ) {
        items(galleries, key = {it.id}) {
            Image(
                painter = painterResource(id = it.photo),
                contentDescription = it.name,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun GalleryScreenPreview() {
    USAppTheme {
        GalleyScreen(
            galleries = DummyData.USGalleries
        )
    }
}