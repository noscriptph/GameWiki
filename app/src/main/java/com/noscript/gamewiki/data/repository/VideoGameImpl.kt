package com.noscript.gamewiki.data.repository

import com.noscript.gamewiki.data.network.api.VideoGameService
import com.noscript.gamewiki.data.response.VideoGameResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class VideoGameImpl(private var apiservice:VideoGameService):VideoGameRepository {
    override suspend fun fetchVideoGames():MutableList<VideoGameResponse>{
        return withContext(Dispatchers.IO){
            val listVideoGames=apiservice.getAllVideoGames()
            listVideoGames
        }
    }
}