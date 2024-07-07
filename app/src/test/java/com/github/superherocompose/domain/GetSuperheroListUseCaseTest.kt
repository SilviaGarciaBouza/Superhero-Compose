package com.github.superherocompose.domain

import com.github.superherocompose.data.SuperheroRepositoty
import io.mockk.MockKAnnotations
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.impl.annotations.RelaxedMockK
import kotlinx.coroutines.runBlocking
import org.junit.Before
import org.junit.Test

//import org.junit.jupiter.api.Assertions.*
/**TODO finish test
class GetSuperheroListUseCaseTest{
    @RelaxedMockK
    private lateinit var repositoty: SuperheroRepositoty

    lateinit var getSuperheroListUseCase: GetSuperheroListUseCase
    @Before
    fun onBefore(){
        MockKAnnotations.init(this)
        getSuperheroListUseCase = GetSuperheroListUseCase()
    }
    @Test
    fun whenTheApiDoesntReturnAnythingThenGetEmptyList()= runBlocking {
        //Given: da un repo mokeado
        coEvery { repositoty.getSuperheros() } returns emptyList()
        //When
        getSuperheroListUseCase()

        //Then
        coVerify() { repositoty.getSuperheros() }
    }
}*/