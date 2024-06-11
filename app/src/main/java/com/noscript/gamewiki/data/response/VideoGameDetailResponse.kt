package com.noscript.gamewiki.data.response

import com.google.gson.annotations.SerializedName

/**
 * Clase de datos que representa la respuesta detallada de la api para un videojuego.
 *
 * @property id Identificador único del videojuego.
 * @property name Nombre del videojuego.
 * @property release Fecha de lanzamiento del videojuego.
 * @property backgroundImage URL de la imagen de fondo del videojuego.
 * @property metacritic Puntuación en Metacritic del videojuego.
 * @property rating Calificación del videojuego.
 * @property playtime Tiempo de juego promedio en horas.
 * @property platforms Plataformas en las que está disponible el videojuego.
 * @property genres Géneros del videojuego.
 * @property format Formato del videojuego (digital o físico).
 * @property price Precio actual del videojuego.
 * @property lastPrice Último precio registrado del videojuego.
 * @property delivery Indica si el videojuego tiene entrega disponible.
 */
data class VideoGameDetailResponse(
    val id: Long, // Identificador único del videojuego
    val name: String, // Nombre del videojuego
    val release: String, // Fecha de lanzamiento del videojuego
    @SerializedName("background_Image")
    val backgroundImage: String, // URL de la imagen de fondo del videojuego
    val metacritic: Long, // Puntuación en Metacritic del videojuego
    val rating: Long, // Calificación del videojuego
    val playtime: Long, // Tiempo de juego promedio en horas
    val platforms: String, // Plataformas en las que está disponible el videojuego
    val genres: String, // Géneros del videojuego
    val format: String, // Formato del videojuego (digital o físico)
    val price: Double, // Precio actual del videojuego
    val lastPrice: Double, // Último precio registrado del videojuego
    val delivery: Boolean // Indica si el videojuego tiene entrega disponible
)