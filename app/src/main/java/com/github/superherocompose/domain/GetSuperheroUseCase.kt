package com.github.superherocompose.domain

import com.github.superherocompose.UI.*
import com.github.superherocompose.data.SuperheroDataDetailResponse
import com.github.superherocompose.data.SuperheroRepositoty

class GetSuperheroUseCase {
    val repositoty = SuperheroRepositoty()
    suspend operator fun invoke(shID: String): SuperheroDataDetailResponse {
        return repositoty.getSuperheroDetail(shID)

    }
}

