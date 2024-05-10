package com.afebrii.usapp.navigation

sealed class Screen (val route: String) {
    data object Home : Screen ("home")
    data object Gallery: Screen ("gallery")
    data object Profil: Screen ("profile")

    data object DetailPimpinan: Screen ("detail_pimpinan")
}