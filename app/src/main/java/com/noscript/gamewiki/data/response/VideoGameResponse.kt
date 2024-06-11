package com.noscript.gamewiki.data.response

import com.google.gson.annotations.SerializedName

/**
 * Clase de datos que representa la respuesta de la api para un videojuego.
 *
 * @property id El identificador único del videojuego.
 * @property name El nombre del videojuego.
 * @property release La fecha de lanzamiento del videojuego.
 * @property backgroundImage La URL de la imagen de fondo del videojuego.
 * @property metacritic La puntuación de Metacritic del videojuego.
 * @property rating La calificación de los usuarios del videojuego.
 */
data class VideoGameResponse(
    val id: Long, // Identificador único del videojuego
    val name: String, // Nombre del videojuego
    val release: String, // Fecha de lanzamiento del videojuego
    @SerializedName("background_Image")
    val backgroundImage: String, // URL de la imagen de fondo
    val metacritic: Long, // Puntuación de Metacritic del videojuego
    val rating: Long // Calificación de los usuarios del videojuego
)