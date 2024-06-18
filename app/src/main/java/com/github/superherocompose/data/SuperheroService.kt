package com.github.superherocompose.data

import com.github.superherocompose.core.RetrofitHelper
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Retrofit


class SuperheroService {
    val retrofit = RetrofitHelper.getRetrofit()


    suspend fun getSuperheros(superheroName: String): List<SuperheroItemResponse> {
        //(Dispatchers.IO) en hilo secundario
        return withContext(Dispatchers.IO) {
            val response =
                retrofit.create(SuperHeroClient::class.java).getSuperheros(superheroName)
            response.body()?.resultsSuperhero ?: emptyList<SuperheroItemResponse>()
        }
    }


    suspend fun getSuperheroDetail(superheroId: String): SuperheroDataDetailResponse {
        //(Dispatchers.IO) en hilo secundario
        return withContext(Dispatchers.IO) {
            val response =
                retrofit.create(SuperHeroClient::class.java).getSuperheroDetail(superheroId)
            response.body()!!.copy()
        }
    }


}