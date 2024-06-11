package com.noscript.gamewiki.data.local.entities

import com.google.gson.annotations.SerializedName

data class VideoGame(
    val id: Long, // Identificador único del videojuego
    val name: String, // Nombre del videojuego
    val release: String, // Fecha de lanzamiento del videojuego
    @SerializedName("background_Image")
    val backgroundImage: String, // URL de la imagen de fondo
    val metacritic: Long, // Puntuación de Metacritic del videojuego
    val rating: Long, // Calificación de los usuarios del videojuego

     )