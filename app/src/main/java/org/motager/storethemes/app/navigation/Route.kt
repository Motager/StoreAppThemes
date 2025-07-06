package org.motager.storethemes.app.navigation

import kotlinx.serialization.Serializable

sealed interface Route {

    @Serializable
    data object StoreGraph : Route

    @Serializable
    data object Main : Route


}