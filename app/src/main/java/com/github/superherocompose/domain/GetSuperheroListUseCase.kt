package com.github.superherocompose.domain

import com.github.superherocompose.data.SuperheroDataDetailResponse
import com.github.superherocompose.data.SuperheroItemResponse
import com.github.superherocompose.data.SuperheroRepositoty

class GetSuperheroListUseCase {
    val repositoty = SuperheroRepositoty()
    suspend operator fun invoke(/**superheroName: String*/): List<SuperheroItemResponse> {
      //  return repositoty.getSuperheros(/**superheroName*/)
       var myRepositoty = repositoty.getSuperheros(/**superheroName*/)
        return if(myRepositoty.isNotEmpty()){repositoty.getSuperheros()}
        else{
            emptyList()
        }


    }
}