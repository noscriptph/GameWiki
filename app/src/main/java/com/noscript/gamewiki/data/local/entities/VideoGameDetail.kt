package com.noscript.gamewiki.data.local.entities

data class VideoGameDetail (
    val idDetail:Long,
    val playtime: Long, // Tiempo de juego promedio en horas
    val platforms: String, // Plataformas en las que está disponible el videojuego
    val genres: String, // Géneros del videojuego
    val format: String, // Formato del videojuego (digital o físico)
    val price: Double, // Precio actual del videojuego
    val lastPrice: Double, // Último precio registrado del videojuego
    val delivery: Boolean // Indica si el videojuego tiene entrega disponible
)