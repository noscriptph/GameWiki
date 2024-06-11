package com.noscript.gamewiki.domain

import com.noscript.gamewiki.data.repository.VideoGameImpl
import com.noscript.gamewiki.data.response.VideoGameResponse

class VideoGameUseCase(private val repository: VideoGameImpl) {
    suspend fun getAllVideoGamesOnStock():MutableList<VideoGameResponse>{
        return repository.fetchVideoGames()
    }
}