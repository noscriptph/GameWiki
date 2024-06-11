package com.noscript.gamewiki.data.repository

import com.noscript.gamewiki.data.response.VideoGameResponse


interface VideoGameRepository {
    suspend fun fetchVideoGames(): MutableList<VideoGameResponse>
}