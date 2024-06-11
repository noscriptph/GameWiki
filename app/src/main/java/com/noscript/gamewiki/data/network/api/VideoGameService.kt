package com.noscript.gamewiki.data.network.api

import com.noscript.gamewiki.data.response.VideoGameResponse
import retrofit2.http.GET

interface VideoGameService {
    @GET("games")
    suspend fun getAllVideoGames():MutableList<VideoGameResponse>
}