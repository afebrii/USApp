package com.afebrii.usapp.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.afebrii.usapp.data.DummyData
import com.afebrii.usapp.model.Jurusan
import com.afebrii.usapp.model.Pimpinan
import com.afebrii.usapp.navigation.Screen
import com.afebrii.usapp.presentation.component.JurusanItem
import com.afebrii.usapp.presentation.component.PimpinanItem

@Composable
fun HomeScreen(
    navController: NavController,
    modifier: Modifier = Modifier,
    pimpinan: List<Pimpinan> = DummyData.pimpinanUniv,
    jurusan: List<Jurusan> = DummyData.jurusanUniv
) {
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(8.dp),
        modifier = modifier
    ) {
        item {
            LazyRow(
                contentPadding = PaddingValues(16.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                modifier = modifier
            ) {
                items(pimpinan, key = { it.id }) {
                    PimpinanItem(pimpinan = it) { pimpinanId ->
                        navController.navigate(Screen.DetailPimpinan.route + "/$pimpinanId")
                    }
                }
            }
        }
        items(jurusan, key = {it.id}) {
            JurusanItem(jurusan = it, modifier = Modifier.padding(horizontal = 16.dp))
        }
    }
}