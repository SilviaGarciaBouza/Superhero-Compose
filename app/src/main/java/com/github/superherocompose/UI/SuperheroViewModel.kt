package com.github.superherocompose.UI

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.github.superherocompose.data.SuperheroItemResponse
import com.github.superherocompose.data.SuperheroRepositoty
import com.github.superherocompose.domain.GetSuperheroListUseCase
import com.github.superherocompose.domain.GetSuperheroUseCase
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.runBlocking

class SuperheroViewModel: ViewModel() {
    val getSuperheroUseCase = GetSuperheroUseCase()
    val getSuperheroListUseCase = GetSuperheroListUseCase()

    fun callSuperheroList(): List<SuperheroItemResponse>{
        return runBlocking {
            getSuperheroListUseCase()
        }
    }

    fun callSuperheroItem(id: String): SuperheroItemResponse{
        return runBlocking {
          getSuperheroListUseCase.repositoty.getSuperheros().get(id.toInt())
        }
    }


}

