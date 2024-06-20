package com.github.superherocompose.data

import com.github.superherocompose.core.RetrofitHelper


class SuperheroRepositoty {
    //////private val api: SuperheroService
val api = SuperheroService()
    suspend fun getSuperheros(/**superheroName: String*/):List<SuperheroItemResponse>{
        return api.getSuperheros(/**superheroName*/)
    }

    suspend fun getSuperheroDetail(superheroId: String): SuperheroDataDetailResponse{

        return api.getSuperheroDetail(superheroId)
    }
}